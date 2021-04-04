import generators.AppearanceGenerator;
import generators.FioAdapter;
import generators.PhoneGenerator;
import generators.PhysGenerator;
import person.Phone;

public class Factory extends AbstractFactory {
    private Phone phone = null;

    @Override
    public final FioAdapter getFioAdapter(final int intCode) {
        FioAdapter fioadapter = new FioAdapter();
        fioadapter.generateParams(intCode);
        return fioadapter;
    }

    @Override
    public final PhysGenerator getPhysGenerator(final int intCode) {
        PhysGenerator physGenerator = new PhysGenerator();
        physGenerator.generateParams(intCode);
        return physGenerator;
    }

    @Override
    public final AppearanceGenerator getAppearanceGenerator(final int intCode) {
        AppearanceGenerator appearanceGenerator = new AppearanceGenerator();
        appearanceGenerator.generateParams(intCode);
        return appearanceGenerator;
    }

    @Override
    public final Phone getPhone(final String input, final int intCode) {
        // добавляем телефон, только если введённый код не палиндром
        if (!input.equals(new StringBuilder(input).reverse().toString())) {
            final PhoneGenerator phoneGenerator = new PhoneGenerator();
            phoneGenerator.generateParams(intCode);
            phone = phoneGenerator.buildResponse();
        }
        return phone;
    }
}