public class Main {
    public static void main(String[] args) {

        // Task 1
        int total = 0;
        int payment = 15000;
        int month = 1;
        while (total < 2_459_000) {
            total += payment;
            month++;
        }
        System.out.print(String.format("Месяц %d, сумма накоплений равна %d рублей\n", month, total));


        // Task 2
        int iterator = 0;
        while (iterator < 10) {
            iterator++;
            System.out.print(iterator + " ");
        }
        System.out.println();
        for (iterator = 10; iterator > 0; iterator--) {
            System.out.print(iterator + " ");
        }


        // Task 3
        double birthRate = 0.017;  // рождаемость
        double mortalityRate = 0.008;  // смертность
        int populationSize = 12_000_000;  // численность населения
        int year = 0;
        while (year < 10) {
            populationSize = (int) (populationSize + (populationSize * birthRate) - (populationSize * mortalityRate));
            year++;
        }
        System.out.println(String.format("\nГод %d, численность населения составляет %d.", year, populationSize));


        // Task 4
        double percent = 0.07;
        double sum = 15000;
        month = 1;
        while (sum < 12_000_000) {
            sum += sum * percent;
            System.out.print(String.format("\nМесяц %d, сумма накоплений составляет %.2f.", month, sum));
            month++;
        }
        System.out.println();


        // Task 5
        percent = 0.07;
        sum = 15000;
        month = 1;
        while (sum < 12_000_000) {
            sum += sum * percent;
            if (month % 6 == 0) {
                System.out.print(String.format("\nМесяц %d, сумма накоплений составляет %.2f.", month, sum));
            }
            month++;
        }
        System.out.println();


        // Task 6
        percent = 0.07;
        sum = 15000;
        month = 1;
        if (month < (9 * 12) + 1) {
            while (sum < 12_000_000) {
                sum += sum * percent;
                if (month % 6 == 0) {
                    System.out.print("\nМесяц " + month + ", сумма накоплений составляет " + sum);
                }
                month++;
            }
        }
        System.out.println();


        // Task 7
        int dateOfFriday = 5;
        while (dateOfFriday <= 31) {
            System.out.print(String.format("\nСегодня пятница, %d-е число. Необходимо подготовить отчет.", dateOfFriday));
            dateOfFriday += 7;
        }
        System.out.println();

        // Task 8
        int currentYear = 0;
        iterator = 79;
        int beginningOfPeriod = 2024 - 200;
        int endOfPeriod = 2024 + 100;

        do {
            currentYear += iterator;
        } while (currentYear < beginningOfPeriod);

        while (currentYear < endOfPeriod) {
            System.out.println(currentYear);
            currentYear += iterator;
        }
    }
}