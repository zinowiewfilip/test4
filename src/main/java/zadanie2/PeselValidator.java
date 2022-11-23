package zadanie2;

import java.time.DateTimeException;
import java.time.LocalDate;

public class PeselValidator {

    private String number;
    public String getNumber() {
        return number;
    }

    public String calculateBirthDate(String number) throws DateTimeException {
        this.number = number;
        int[] numberAsIntArray = new int[11];
        for (int i = 0; i < 11; i++) {
            numberAsIntArray[i] = Character.getNumericValue(getNumber().charAt(i));
        }

        int birthDay = 10 * numberAsIntArray[4] + numberAsIntArray[5];
        int birthYear = 10 * numberAsIntArray[0] + numberAsIntArray[1];
        int birthMonth = 10 * numberAsIntArray[2] + numberAsIntArray[3];
        if (birthDay > 31) throw new DateTimeException("Miesiąc nie może mieć więcej niż 31 dni");

        if (birthMonth <= 12) birthYear += 1900;
        else if (birthMonth <= 32) {
            birthYear += 2000;
            birthMonth -= 20;
        } else if (birthMonth <= 52) {
            birthYear += 2100;
            birthMonth -= 40;
        } else if (birthMonth <= 72) {
            birthYear += 2200;
            birthMonth -= 60;
        } else if (birthMonth <= 92) {
            birthYear += 1800;
            birthMonth -= 80;
        }
        String date = String.valueOf(LocalDate.of(birthYear, birthMonth, birthDay));
        return date;
    }
}
