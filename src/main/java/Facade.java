import generators.AppearanceGenerator;
import generators.FioAdapter;
import generators.FioGenerator;
import generators.PhysGenerator;
import person.Person;
import person.Phone;

public class Facade {
    static String result;

    public static String getPerson(String input) {
        Factory factory = new Factory();

        final int intCode = Integer.parseInt(input);
        FioAdapter fio = factory.getFioAdapter(intCode);
        PhysGenerator phys = factory.getPhysGenerator(intCode);
        AppearanceGenerator app = factory.getAppearanceGenerator(intCode);
        Phone phone = factory.getPhone(input, intCode);

        result = new Person(input,
                fio.buildResponse(),
                phys.buildResponse(),
                app.buildResponse(),
                phone).toString();
        return result;
    }
}
