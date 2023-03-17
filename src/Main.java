import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task1();
       task2();
    }

    public static void task1() {
        // РАЗВЕРНИТЕ МАССИВ (билет 1)
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //version 1
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        //version 2
        Integer[] arr2 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Collections.reverse(Arrays.asList(arr2));
        System.out.println(Arrays.toString(arr2));
    }

    public static void task2() {
        // ПРОГРАММА ДЛЯ ОПРЕДЕЛЕНИЯ ПАЛИНДРОМА (билет 2)
        // Строки палиндромы: оно, летел, иди
        Scanner scanner = new Scanner(System.in);

        System.out.print("введите строку: ");
        String text = scanner.nextLine();
        text = text.replace(" ", "");
        text = text.toLowerCase();

        if (isPalindrome(text)) {
            System.out.println("Является палиндромом.");
        } else {
            System.out.println("Не является палиндромом.");
        }
    }

    public static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}