package Tasks8;

public class ConsoleShapePrinter implements IShapePrinter {
        private  ShapeInfoCollector collector = new ShapeInfoCollector();
    @Override
    public void print(Shape shape, ShapeCharactiristics[] charactiristics) {
        System.out.println(collector.getInfo(charactiristics, shape));
    }
}
