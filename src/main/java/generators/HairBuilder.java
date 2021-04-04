package generators;

import person.appearance.hair.Hair;

public final class HairBuilder {
    private String color = "";
    private int numType;

    public HairBuilder setTypeLong() {
        numType = 1;
        return this;
    }

    public HairBuilder setTypeShort() {
        numType = -1;
        return this;
    }

    public HairBuilder setNoType() {
        numType = 0;
        return this;
    }

    public HairBuilder setColor(final String colors) {
        this.color = colors;
        return this;
    }

    public String getType() {
        String type;
        if (numType > 0) {
            type = "длинные, ";
        } else if (numType < 0) {
            type = "короткие, ";
        } else {
            type = "нет";
        }
        return type;
    }

    public Hair build() {
        final Hair hair = new Hair();
        hair.setType(getType());
        hair.setColor(this.color);
        return hair;
    }
}
