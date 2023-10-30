package Tasks8;

public class Rectangle implements Shape {

    private String name;

    private String color;

    public Rectangle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public static final String CIRCLE = "Rectangle";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }
}

