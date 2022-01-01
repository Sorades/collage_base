package com.example.collage_basecode.drawing;

public class ColumnLayout extends BaseVisualElement {
    public ColumnLayout(float xLoc, float yLoc, float width, float height) {
        super(xLoc, yLoc, width, height);
    }

    @Override
    public void doLayout() {
        float posCount = y;
        for (VisualElement child : children) {
            child.setX(x + (width - child.getW()) / 2);
            child.setY(posCount);
            posCount += child.getH();
        }
        super.doLayout();
    }
}
