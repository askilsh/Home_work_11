package person.appearance.hair;

public class Hair {
    private String color;
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public final String toString() {
        return type + color;
    }
}