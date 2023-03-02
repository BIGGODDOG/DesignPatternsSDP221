package structural.bridge;

public abstract class ShapeBridge {
    protected IShape_BP shapeBP;
    public ShapeBridge(IShape_BP shapeBp){
        this.shapeBP = shapeBp;
    }
    abstract void drawShape_ShapeBridge();
    abstract void fillColor_ShapeBridge();
}
