package com.example.collage_basecode.drawing;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.Log;

import com.example.collage_basecode.R;

public class TextVisualElement extends BaseVisualElement {
    String text;

    public TextVisualElement(float xLoc, float yLoc, String text, Typeface typeface, float size) {
        super(xLoc, yLoc);
        this.text = text;
        mPaint.setTypeface(typeface);
        mPaint.setTextSize(size);
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        Rect rect=new Rect();
        mPaint.getTextBounds(text,0,text.length(),rect);
        height = rect.height();
        width = mPaint.measureText(text);

    }

    @Override
    public void draw(Canvas onCanvas) {
        onCanvas.drawText(text, x, y + height, mPaint);
        super.draw(onCanvas);
    }
}
