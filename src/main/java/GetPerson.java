import generators.AppearanceGenerator;
import generators.FioAdapter;
import generators.PhysGenerator;
import person.Person;
import person.Phone;

public class GetPerson {

    public static String getPerson(final String input) {
        Factory factory = new Factory();

        final int intCode = Integer.parseInt(input);
        FioAdapter fio = factory.getFioAdapter(intCode);
        PhysGenerator phys = factory.getPhysGenerator(intCode);
        AppearanceGenerator app = factory.getAppearanceGenerator(intCode);
        Phone phone = factory.getPhone(input, intCode);

        String result = new Person(input,
                fio.buildResponse(),
                phys.buildResponse(),
                app.buildResponse(),
                phone).toString();
        return result;
    }
}
