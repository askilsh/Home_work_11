package person.appearance.hair;

public class Hair {
    private String color;
    private String type;

    public final void setType(final String type) {
        this.type = type;
    }

    public final void setColor(final String color) {
        this.color = color;
    }

    @Override
    public final String toString() {
        return type + color;
    }
}