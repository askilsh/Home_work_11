package generators;

public final class FioAdapter implements Generator<Fio> {
    private final FioGenerator fioGenerator;

    public FioAdapter() {
        fioGenerator = new FioGenerator();
    }

    @Override
    public void generateParams(final int code) {
        fioGenerator.generateParams(code);
    }

    @Override
    public Fio buildResponse() {
        return new Fio(fioGenerator.getLastName(),
                fioGenerator.getFirstName(),fioGenerator.getMiddleName());
    }
}
