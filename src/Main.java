import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        int currentNum = 0;

        while (currentNum < 10) {
            System.out.print(++currentNum + " ");
        }
        System.out.println();

        for (; currentNum > 0; currentNum--) {
            System.out.print(currentNum + " ");
            // задание №2
            int firstFriday = 5;
            for (int currentFriday = firstFriday; currentFriday < 31; currentFriday += 7) {
                System.out.println("Сегодня пятница " + currentFriday + "-е число. Необходимо подготовить отчет.");
                // Задание 3
                int currentYear = LocalDateTime.now().getYear();

                int start = currentYear - 200;
                int end = currentYear + 100;

                for (int year = start; year < end; year++) {
                    if (year % 79 == 0) {
                        System.out.println(year);
                    }
                }
            }
        }
        }
        }






