package structural.bridge;

public class Color extends ShapeBridge{
    public Color(IShape_BP shapeBp) {
        super(shapeBp);
    }

    @Override
    void drawShape_ShapeBridge() {
        //DO-NOTHING
    }

    @Override
    void fillColor_ShapeBridge() {
        System.out.println("Inside the public class Color, which extends ShapeBridge");
        shapeBP.shapeColor_IShape();
    }
}
