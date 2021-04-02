import generators.*;
import person.Phone;

public class Factory extends AbstractFactory {

    @Override
    public FioAdapter getFioAdapter(int intCode) {
        FioAdapter fioadapter = new FioAdapter();
        fioadapter.generateParams(intCode);
        return fioadapter;
    }

    @Override
    public PhysGenerator getPhysGenerator(int intCode) {
        PhysGenerator physGenerator = new PhysGenerator();
        physGenerator.generateParams(intCode);
        return physGenerator;
    }

    @Override
    public AppearanceGenerator getAppearanceGenerator(int intCode) {
        AppearanceGenerator appearanceGenerator = new AppearanceGenerator();
        appearanceGenerator.generateParams(intCode);
        return appearanceGenerator;
    }

    @Override
    public Phone getPhone(String input, int intCode) {
        // добавляем телефон, только если введённый код не палиндром
        if (!input.equals(new StringBuilder(input).reverse().toString())) {
            final PhoneGenerator phoneGenerator = new PhoneGenerator();
            phoneGenerator.generateParams(intCode);
            phone = phoneGenerator.buildResponse();
        }
        return phone;
    }
}