package zadanie2;

import java.util.Optional;


public class Runner {
    public static void main(String[] args) throws InvalidPeselException {

        String name = "Filip";
        String pesel = "81010200141";


        Optional<String> opt1 = Optional.ofNullable(name);
        opt1.ifPresentOrElse(x -> System.out.println(name.length()), () -> System.out.println(0));

        PeselValidator peselValidator = new PeselValidator();
        pesel = Optional.ofNullable(pesel)
                .filter(x -> x.matches("\\d{11}"))
                .orElseThrow(() -> new InvalidPeselException("Błędny pesel"));
        System.out.println(peselValidator.calculateBirthDate(pesel));
    }
}
