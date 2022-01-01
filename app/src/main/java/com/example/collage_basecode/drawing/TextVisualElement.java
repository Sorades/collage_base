package com.example.collage_basecode.drawing;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;

public class TextVisualElement extends BaseVisualElement {
    String text;
    Typeface typeface;
    float textSize;

    public TextVisualElement(float xLoc, float yLoc, String text, Typeface typeface, float textSize) {
        super(xLoc, yLoc);
        this.text = text;
        this.typeface=typeface;
        this.textSize = textSize;

        mPaint.setTypeface(typeface);
        mPaint.setTextSize(textSize);
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);

        Rect rect = new Rect();
        mPaint.getTextBounds(text, 0, text.length(), rect);
        height = rect.height();
        width = mPaint.measureText(text);

    }

    @Override
    public boolean sizeIsIntrinsic() {
        return true;
    }

    @Override
    public void drawIn(Canvas onCanvas) {
        onCanvas.drawText(text, 0, height, mPaint);
    }

    //<editor-fold desc="Getter & Setter">
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Typeface getTypeface() {
        return typeface;
    }

    public void setTypeface(Typeface typeface) {
        this.typeface = typeface;
    }

    public float getTextSize() {
        return textSize;
    }

    public void setTextSize(float textSize) {
        this.textSize = textSize;
    }
    //</editor-fold>
}
