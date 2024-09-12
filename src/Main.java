public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int totalSalary = 0;
        int[] salary = {30157, 40312, 532, 10000, 90123};
        for (int i = 0; i < salary.length; i++) {
            totalSalary = totalSalary + salary[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalSalary + " рублей");
        System.out.println();

        System.out.println("Задание 2");
        int[] salaryMonth2 = {35157, 4312, 7532, 1600, 30123};
        int maxSalary = -1;
        int minSalary = 999999999;
        for (final int current : salaryMonth2) {
            if (current > maxSalary) {
                maxSalary = current;
            if (current < minSalary) {
                minSalary = current;
                    }
                System.out.println("Минимальная сумма трат за неделю составила " + minSalary +
                        " рублей. Максимальная сумма трат за неделю составила " + maxSalary
                        + " рублей");
            }

        }
        System.out.println();
        System.out.println("Задание 3");

        int[] salarySumMonth = {8757, 2372, 19832, 1321, 39123};
        int totalSalary3 = 0;
        for (int i = 0; i < salary.length; i++) {
            totalSalary3 = totalSalary3 + salarySumMonth[i];
        }
        System.out.println("Средняя сумма трат за месяц составила "
                + totalSalary3 / salarySumMonth.length + " рублей");
        System.out.println();

        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
}