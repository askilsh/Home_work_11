public class InputProcessor {

    public final String processInput(final String input) {
        String result;

        if (input.trim().matches("\\d{4}")) {
            // Создаём Person
            result = GetPerson.getPerson(input);
        } else {
            result = "Неверный ввод.";
        }
        return result;
    }
}




