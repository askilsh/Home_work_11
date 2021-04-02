import generators.AppearanceGenerator;
import generators.FioAdapter;
import generators.PhysGenerator;
import person.Phone;

public abstract class AbstractFactory {
    Phone phone = null;
    protected abstract FioAdapter getFioAdapter(int intCode);
    protected abstract PhysGenerator getPhysGenerator(int intCode);
    protected abstract AppearanceGenerator getAppearanceGenerator(int intCode);
    protected abstract Phone getPhone(String input, int intCode);
}
