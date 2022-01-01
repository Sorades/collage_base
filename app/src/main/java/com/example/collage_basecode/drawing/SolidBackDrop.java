package com.example.collage_basecode.drawing;


import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;

public class SolidBackDrop extends BaseVisualElement {
    public SolidBackDrop(float xLoc, float yLoc, float width, float height, int color) {
        super(xLoc, yLoc, width, height);
        this.color = color;
    }

    @Override
    public void draw(Canvas onCanvas) {
        mPaint.setColor(color);
        mPaint.setStyle(Paint.Style.FILL);
        onCanvas.drawRect(getX(), getY(), getX() + getW(), getY() + getH(), mPaint);
        super.draw(onCanvas);
    }
}
