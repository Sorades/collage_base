package com.example.collage_basecode.drawing;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.RectF;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class NinePartImage extends BaseVisualElement {
    NinePatch patches;

    public NinePartImage(float xLoc, float yLoc, float width, float height, NinePatch patches) {
        super(xLoc, yLoc, width, height);
        this.patches = patches;
    }

    @RequiresApi(api = Build.VERSION_CODES.S)
    @Override
    public void drawIn(Canvas onCanvas) {
        onCanvas.drawPatch(patches, new RectF(0, 0, width, height), mPaint);
    }

    //<editor-fold desc="Getter & Setter">
    public NinePatch getPatches() {
        return patches;
    }

    public void setPatches(NinePatch patches) {
        this.patches = patches;
    }
    //</editor-fold>
}
