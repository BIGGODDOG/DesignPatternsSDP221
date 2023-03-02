package structural.decorator;

public class ShapeDecorator implements IShape{
    protected IShape iShape;

    public ShapeDecorator(IShape iShape) {
        this.iShape = iShape;
    }

    @Override
    public void drawShape() {
        iShape.drawShape();
    }
}
