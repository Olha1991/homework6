import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] myArr = generateRandomArray();

// Task 1
        int sum =0;
        for (int i = 0; i < myArr.length; i++){
            sum += myArr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

// Task 2
        int min = myArr[0];
        int max = myArr[0];
        for (int i = 1; i < myArr.length; i++) {
            if (min > myArr[i]) {
                min = myArr[i];
            } else if (max < myArr[i]) {
                max = myArr[i];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %s рублей. Максимальная сумма трат за день составила %s рублей", min, max);
        System.out.println();

// Task 3
        double average = (double) sum/myArr.length;
        System.out.printf("Средняя сумма трат за месяц составила %s рублей.\n", average);

// Task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;

        }
        return arr;


    }

}
