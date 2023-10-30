package Tasks8;

public interface IShapePrinter {
    public default void print(Shape shape){
        System.out.println(shape.getName());
    };
    public void print(Shape shape,ShapeCharactiristics [] charactiristics);
}
