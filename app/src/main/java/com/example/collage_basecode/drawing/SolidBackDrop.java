package com.example.collage_basecode.drawing;


import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;

public class SolidBackDrop extends BaseVisualElement {
    int color;

    public SolidBackDrop(float xLoc, float yLoc, float width, float height, int color) {
        super(xLoc, yLoc, width, height);
        this.color = color;

        mPaint.setColor(color);
        mPaint.setStyle(Paint.Style.FILL);
    }

    @Override
    public void drawIn(Canvas onCanvas) {
        onCanvas.drawRect(0, 0, width, height, mPaint);
    }

    //<editor-fold desc="Getter & Setter">
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    //</editor-fold>
}
