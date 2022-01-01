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
        mPaint.setStrokeWidth(4); // 1像素不够明显
    }

    @Override
    public void drawIn(Canvas onCanvas) {
        onCanvas.drawRect(0, 0, width, height, mPaint);
    }
}
