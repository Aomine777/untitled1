package Tasks8;

public class Triangle implements Shape {

    private String name;

    private String color;

    public Triangle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public static final String CIRCLE = "Triangle";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }
}