package com.example.collage_basecode.drawing;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class IconImage extends BaseVisualElement {
    Bitmap bitmap;

    public IconImage(float xLoc, float yLoc, Bitmap bitmap) {
        super(xLoc, yLoc);
        this.bitmap = bitmap;
        width=bitmap.getWidth();
        height=bitmap.getHeight();
    }

    @Override
    public void draw(Canvas onCanvas) {
        onCanvas.drawBitmap(bitmap, getX(), getY(), mPaint);
        super.draw(onCanvas);
    }
}
