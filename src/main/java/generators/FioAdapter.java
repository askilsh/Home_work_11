package generators;

public class FioAdapter implements Generator<Fio> {
    private final FioGenerator fioGenerator;

    public FioAdapter() {
        fioGenerator = new FioGenerator();
    }

    @Override
    public void generateParams(int code) {
        fioGenerator.generateParams(code);
    }

    @Override
    public Fio buildResponse() {
        return fioGenerator.getFio();
    }
}
