package com.example.collage_basecode.drawing;

import android.util.Log;

public class RowLayout extends BaseVisualElement {
    public RowLayout(float xLoc, float yLoc, float width, float height) {
        super(xLoc, yLoc, width, height);
    }

    @Override
    public void doLayout() {
        float posCount = 0;
        for (VisualElement child : children) {
            child.setY((height - child.getH()) / 2);// vertically centered
            child.setX(posCount);
            posCount += child.getW();
            child.doLayout();
        }
    }
}
