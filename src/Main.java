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
        for (final int current : salaryMonth2) {
            if (current > maxSalary) {
                maxSalary = current;
                int minSalary = current;
                for (final int currentMin : salaryMonth2) {
                    if (currentMin < minSalary) {
                        minSalary = currentMin;

                    }
                }
                System.out.println("Минимальная сумма трат за неделю составила " + maxSalary +
                        " рублей. Максимальная сумма трат за неделю составила " + minSalary
                        + " рублей");
            }

        }
        System.out.println();
        System.out.println("Задание 3");

        double[] salaryMonth3 = {8757, 2372, 19832, 1321, 39123};
        double totalSalary3 = 0;
        for (final double current3 : salaryMonth3) {
            totalSalary3 = totalSalary3 + current3;
        }
        System.out.println("Средняя сумма трат за месяц составила " + totalSalary3 / 3 + " рублей");
        System.out.println();

        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
}