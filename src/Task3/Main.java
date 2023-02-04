package Task3;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год своего рождения");
        int year = scanner.nextInt();
        System.out.println("Введите месяц свогего рождения");
        int month = scanner.nextInt();
        System.out.println("Введите день своего рождения");
        int day = scanner.nextInt();
        System.out.println("Введите в котором часу Вы родились");
        int hours = scanner.nextInt();
        System.out.println("Введите в которой минуте Вы родились");
        int minutes = scanner.nextInt();

        LocalDateTime chosenDate = LocalDateTime.of(year, month, day, hours, minutes);
        LocalDateTime today = LocalDateTime.now();
        today = today.minusYears(chosenDate.getYear());
        today = today.minusMonths(chosenDate.getMonth().getValue());
        today = today.minusDays(chosenDate.getDayOfMonth());
        today = today.minusHours(chosenDate.getHour());
        today = today.minusMonths(chosenDate.getMinute());
        System.out.println("Вам исполнилось " + today.getYear() + " лет, " + today.getMonth().getValue() +
                " месяца, " + today.getDayOfMonth() + " дня, " + today.getHour() + " часов, " +
                today.getMinute() + " минут.");
    }
}
