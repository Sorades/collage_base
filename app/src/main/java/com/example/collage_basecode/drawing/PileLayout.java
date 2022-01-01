package com.example.collage_basecode.drawing;

public class PileLayout extends BaseVisualElement {
    public PileLayout(float xLoc, float yLoc, float width, float height) {
        super(xLoc, yLoc, width, height);
    }

    @Override
    public void doLayout() {
        children.forEach(child -> {
            child.setPosition(x, y);
        });
        super.doLayout();
    }
}
