package com.example.collage_basecode.drawing;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Log;

import androidx.annotation.NonNull;

import java.util.LinkedList;


public class BaseVisualElement extends PrebaseVisualElement {
    float x;
    float y;
    float width;
    float height;
    VisualElement parent;
    LinkedList<VisualElement> children = new LinkedList<>();
    int color;
    Paint mPaint = new Paint();

    public BaseVisualElement() {
    }

    public BaseVisualElement(float xLoc, float yLoc) {
        super(xLoc, yLoc);
    }

    public BaseVisualElement(float xLoc, float yLoc, float width, float height) {
        super(xLoc, yLoc, width, height);
    }

    @Override
    public void setX(float x) {
        this.x = x;
    }

    @Override
    public void setY(float y) {
        this.y = y;
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
        return y;
    }

    @Override
    public void setW(float w) {
        width = w;
    }

    @Override
    public void setH(float h) {
        height = h;
    }

    @Override
    public float getW() {
        return width;
    }

    @Override
    public float getH() {
        return height;
    }

    @Override
    public VisualElement getParent() {
        return parent;
    }

    @Override
    public void setParent(VisualElement newParent) {
        if (newParent == null)
            return;
        parent = newParent;
    }

    @Override
    public int getNumChildren() {
        return children.size();
    }

    @Override
    public VisualElement getChildAt(int index) {
        if (index < 0 || index >= children.size())
            return null;
        return children.get(index);
    }

    @Override
    public int findChild(VisualElement child) {
        if (children.contains(child))
            return children.indexOf(child);
        return -1;
    }

    @Override
    public void addChild(VisualElement child) {
        if (child == null)
            return;
        child.setParent(this);
        children.add(child);
    }

    @Override
    public void removeChildAt(int index) {
        children.get(index).setParent(null);
        children.remove(index);
    }

    @Override
    public void removeChild(VisualElement child) {
        child.setParent(null);
        children.remove(child);
    }

    @Override
    public void moveChildFirst(VisualElement child) {
        if (child == null || !children.contains(child))
            return;
        children.remove(child);
        children.addFirst(child);
    }

    @Override
    public void moveChildLast(VisualElement child) {
        if (child == null || !children.contains(child))
            return;
        children.remove(child);
        children.addLast(child);
    }

    @Override
    public void moveChildEarlier(VisualElement child) {
        if (child == null || !children.contains(child))
            return;
        int index = children.indexOf(child);
        children.remove(child);
        if (index > 0)
            children.add(index - 1, child);
        else children.addFirst(child);
    }

    @Override
    public void moveChildLater(VisualElement child) {
        if (child == null || !children.contains(child))
            return;
        int index = children.indexOf(child);
        children.remove(child);
        if (index < children.size() - 1)
            children.add(index + 1, child);
        else children.addLast(child);
    }

    @Override
    public void doLayout() {
        children.forEach(VisualElement::doLayout);
    }

    @Override
    public void draw(Canvas onCanvas) {
        onCanvas.save();
        onCanvas.clipRect(new RectF(x, y, x + width, y + height));
        children.forEach(child -> child.draw(onCanvas));
        onCanvas.restore();
    }

    @NonNull
    @Override
    public String toString() {
        return this.getClass() + "{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                ", color=" + color +
                '}';
    }
}
