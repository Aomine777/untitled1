package Tasks8;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle("circle 1" ,"#5121241");
        Quad quad = new Quad("quade","123123123");
        Rectangle rectangle = new Rectangle("rectangle", "2312312312");
        Square square = new Square("square", "12312312");
        Triangle triangle = new Triangle("triangle","12312312");
        ShapeCharactiristics[] charactiristics = {ShapeCharactiristics.NAME, ShapeCharactiristics.COLOR};


        IShapePrinter sp = new ConsoleShapePrinter();
        sp.print(circle,charactiristics);
        sp.print(quad,charactiristics);
        sp.print(rectangle,charactiristics);
        sp.print(square,charactiristics);
        sp.print(triangle,charactiristics);

    }
}
