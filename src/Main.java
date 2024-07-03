public class Main {

    public static double countProfitForMonth(double totalSum, double monthPayment, double interestRate){  //вклад с ежемесячным пополнением
        totalSum += monthPayment + ((totalSum/100)*interestRate);
        return totalSum;
    }

    public static double countProfitForMonth(double totalSum, double percent){  //вклад без пополнения
        totalSum += totalSum * percent;
        return totalSum;
    }

    public static void main(String[] args) {

        // Task 1 (12% годовых)
        double totalSum = 0.0;
        double monthPayment = 15000.0;
        int month = 1;
        while (totalSum < 2_459_000) {
            totalSum = countProfitForMonth(totalSum, monthPayment, 0.12);
            System.out.print(String.format("Месяц %d, сумма накоплений равна %.2f рублей\n", month, totalSum));
            month++;
        }
        System.out.println();


        // Task 2
        int counter = 0;
        while (counter < 10) {
            counter++;
            System.out.print(counter + " ");
        }
        System.out.println();
        for (counter = 10; counter > 0; counter--) {
            System.out.print(counter + " ");
        }
        System.out.println();


        // Task 3
        final double BIRTH_RATE = 0.017;  // рождаемость
        final double MORTALITY_RATE = 0.008;  // смертность
        int populationSize = 12_000_000;  // численность населения
        int year = 1;
        while (year <= 10) {
            populationSize = (int) (populationSize + (populationSize * BIRTH_RATE) - (populationSize * MORTALITY_RATE));
            System.out.println(String.format("Год %d, численность населения составляет %d.", year, populationSize));
            year++;
        }


        // Task 4
        final double INTEREST_RATE = 0.07;
        double sum = 15000;
        month = 1;
        while (sum < 12_000_000) {
            sum = countProfitForMonth(sum, INTEREST_RATE);
            System.out.print(String.format("\nМесяц %d, сумма накоплений составляет %.2f.", month, sum));
            month++;
        }
        System.out.println();


        // Task 5
        sum = 15000;
        month = 1;
        while (sum < 12_000_000) {
            sum = countProfitForMonth(sum, INTEREST_RATE);
            if (month % 6 == 0) {
                System.out.printf("\nМесяц %d, сумма накоплений составляет %.2f.", month, sum);
            }
            month++;
        }
        System.out.println();


        // Task 6
        sum = 15000;
        month = 1;
        if (month < (9 * 12) + 1) {
            while (sum < 12_000_000) {
                sum = countProfitForMonth(sum, INTEREST_RATE);
                if (month % 6 == 0) {
                    System.out.printf("\nМесяц %d, сумма накоплений составляет %.2f.", month, sum);
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
        counter = 79;
        int beginningOfPeriod = 2024 - 200;
        int endOfPeriod = 2024 + 100;

        do {
            currentYear += counter;
        } while (currentYear < beginningOfPeriod);

        while (currentYear < endOfPeriod) {
            System.out.println(currentYear);
            currentYear += counter;
        }
    }
}
