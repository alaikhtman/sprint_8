public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        boolean isValidName = true;
        String trimmedName = name.trim();

        if ((name.length() >= 3) && (name.length() <= 19) && (name.equals(trimmedName))) {
            int countBlank = 0;
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == ' ') {
                    countBlank++;
                }
            }
            if (countBlank != 1) {
                isValidName = false;
            }

        } else {
            isValidName = false;
        }
        return isValidName;
    }
}
