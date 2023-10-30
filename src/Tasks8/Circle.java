package Tasks8;

public class Circle implements Shape {

    private String name;

    private String color;

    public Circle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public static final String CIRCLE = "Circle";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }
}
