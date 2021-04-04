package generators;

public final class Fio {
    private String lastName;
    private String firstName;
    private String middleName;

    public Fio(final String lastName, final String firstName, final String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + middleName;
    }
}
