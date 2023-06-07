public class Home_work_7 {
    public static void main(String[] args) {
        // Задача 1: Вывод чисел, кратных 7, от 1 до 100
        System.out.println("Числа, кратные 7, от 1 до 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

        // Задача 2: Вычисление суммы чисел от 1 до 50, которые делятся на 3 и 5 одновременно
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма чисел от 1 до 50, делящихся на 3 и 5: " + sum);

        // Задача 3: Вычисление суммы точных квадратов от 1 до 1000
        sum = 0;
        for (int i = 1; i <= 1000; i++) {
            int squareRoot = (int) Math.sqrt(i);
            if (squareRoot * squareRoot == i) {
                sum += i;
            }
        }
        System.out.println("Сумма точных квадратов от 1 до 1000: " + sum);

        // Задача 4: Вычисление суммы всех простых чисел, меньших заданного числа
        int number = 100;
        sum = 0;
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println("Сумма простых чисел, меньших " + number + ": " + sum);

        // Задача 5: Подсчет количества вхождений символа в строку
        String str = "hello";
        char ch = 'l';
        int count = countOccurrences(str, ch);
        System.out.println("Количество вхождений символа '" + ch + "' в строку '" + str + "': " + count);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
