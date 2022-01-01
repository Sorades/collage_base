package com.example.collage_basecode.drawing;

public class CircleLayout extends BaseVisualElement {
    float layoutCenterX;
    float layoutCenterY;
    float layoutRadius;

    public CircleLayout(float xLoc, float yLoc, float width, float height, float layoutCenterX, float layoutCenterY, float layoutRadius) {
        super(xLoc, yLoc, width, height);
        this.layoutCenterX = layoutCenterX;
        this.layoutCenterY = layoutCenterY;
        this.layoutRadius = layoutRadius;
    }

    @Override
    public void doLayout() {
        if (children.isEmpty())
            return;
        int numChildren = getNumChildren();
        double degreesBetweenChidlren = 2 * Math.PI / numChildren;
        double newX;
        double newY;
        double angle;

        for (int i = 0; i < children.size(); i++) {
            angle = degreesBetweenChidlren * i;
            newX = (int) (layoutCenterX + layoutRadius * Math.cos(angle));
            newY = (int) (layoutCenterY + layoutRadius * Math.sin(angle));

            newX -= children.get(i).getW() / 2;
            newY -= children.get(i).getH() / 2;

            children.get(i).setX((float) newX);
            children.get(i).setY((float) newY);
            children.get(i).doLayout();
        }

    }
}
