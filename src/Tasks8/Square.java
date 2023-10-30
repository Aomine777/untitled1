package Tasks8;

public class Square implements Shape {

    private String name;

    private String color;

    public Square(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public static final String CIRCLE = "Square";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }
}