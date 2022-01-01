package com.example.collage_basecode.drawing;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;

public class SimpleFrame extends BaseVisualElement {
    public SimpleFrame(float xLoc, float yLoc, float width, float height) {
        super(xLoc, yLoc, width, height);
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(2);
    }

    @Override
    public void draw(Canvas onCanvas) {
        onCanvas.drawRect(x, y, x+width, y+height, mPaint);
        super.draw(onCanvas);
    }
}
