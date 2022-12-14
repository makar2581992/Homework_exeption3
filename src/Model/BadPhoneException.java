package src.Model;

public class BadPhoneException extends Exception {
    String inputString;

    public BadPhoneException(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public String getMessage() {
        return "Неверный формат данных " + inputString + ", требуемый формат - 10 цифр без разделителей)\n";
    }
}