package com.example.collage_basecode.drawing;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class IconImage extends BaseVisualElement {
    Bitmap bitmap;

    public IconImage(float xLoc, float yLoc, Bitmap bitmap) {
        super(xLoc, yLoc);
        this.bitmap = bitmap;
        width = bitmap.getWidth();
        height = bitmap.getHeight();
    }

    @Override
    public boolean sizeIsIntrinsic() {
        return true;
    }

    @Override
    public void drawIn(Canvas onCanvas) {
        if (bitmap == null)
            throw new NullPointerException("bitmap is empty");
        onCanvas.drawBitmap(bitmap, 0, 0, mPaint);
    }

    //<editor-fold desc="Getter & Setter">
    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
    //</editor-fold>
}
