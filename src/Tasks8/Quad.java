package Tasks8;

public class Quad implements Shape {

    private String name;

    private String color;

    public Quad(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public static final String CIRCLE = "Quad";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }
}

