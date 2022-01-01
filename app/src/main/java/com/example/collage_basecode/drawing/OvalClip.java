package com.example.collage_basecode.drawing;

import android.graphics.Canvas;
import android.graphics.Path;

public class OvalClip extends BaseVisualElement {
    public OvalClip(float xLoc, float yLoc, float width, float height) {
        super(xLoc, yLoc, width, height);
    }

    @Override
    public void draw(Canvas onCanvas) {
        onCanvas.save();
        Path ovalPath = new Path();
        ovalPath.addOval(x, y, x + width, y + height, Path.Direction.CW);
        onCanvas.clipPath(ovalPath);
        onCanvas.translate(x, y);

        children.forEach(child -> child.draw(onCanvas));
        onCanvas.restore();
    }
}
