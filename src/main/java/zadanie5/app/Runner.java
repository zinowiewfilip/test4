package zadanie5.app;

import exceptions.InvalidBirthDateException;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws InvalidBirthDateException {
        String date;
        Scanner in = new Scanner(System.in);
        String dateFormat = "dd-MM-yyyy";


        System.out.println("Podaj date urodzenia w formacie: " +dateFormat);
        date = in.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateFormat);
        LocalDate userDate = LocalDate.parse(date, dtf);
        //sprawdzenie i rzucenie wyjątku
        if(userDate.isAfter(LocalDate.now()))
            throw new InvalidBirthDateException();

        //ile dni żyje
        System.out.println(ChronoUnit.DAYS.between(userDate, LocalDate.now()));
        //ile miesięcy żyje
        System.out.println(ChronoUnit.MONTHS.between(userDate, LocalDate.now()));
        //ile tygodni żyje
        System.out.println(ChronoUnit.YEARS.between(userDate, LocalDate.now()));
        //dzień tygodnia
        System.out.println(userDate.getDayOfWeek());
        //piątek trzynastego
        System.out.println(getNextDay(userDate, 13, DayOfWeek.FRIDAY));


        in.close();
    }
    public static LocalDate getNextDay(LocalDate date, int dayOfMonth, DayOfWeek dayOfWeek) {
        LocalDate current = date.getDayOfMonth() > dayOfMonth ?
                date.plusMonths(1).withDayOfMonth(dayOfMonth) :
                date.withDayOfMonth(dayOfMonth);

        while (current.getDayOfWeek() != dayOfWeek) {
            current = current.plusMonths(1);
        }
        return current;
    }

}
