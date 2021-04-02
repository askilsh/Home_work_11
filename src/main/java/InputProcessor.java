import generators.AppearanceGenerator;
import generators.FioGenerator;
import generators.PhysGenerator;
import person.Person;
import person.Phone;

public class InputProcessor {

    public final String processInput(final String input) {
        String result;

        if (input.trim().matches("\\d{4}")) {
            // Создаём Person
            result = Facade.getPerson(input);
        } else {
            result = "Неверный ввод.";
        }
        return result;
    }
}




