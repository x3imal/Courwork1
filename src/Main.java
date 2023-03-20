import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        task7();
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

    public static void task3() {
        // ПРОГРАММА КОТОРАЯ РАЗДЕЛЯЕТ ЛЮБУЮ СТРОКУ НА ДВЕ ЧАСТИ РОВНО ПОПОЛАМ ПО КОЛИЧЕСТВУ СИМВОЛОВ

        Scanner scanner = new Scanner(System.in);

        System.out.println("введите строку: ");
        String text = scanner.nextLine();

        //вариант 1
        for (int i = 1; i < (text.length() + 2) / 2; i++)
            System.out.print(text.charAt(i));
        System.out.println();
        for (int i = text.length() / 2; i < text.length(); i++)
            System.out.print(text.charAt(i));
        System.out.println();


        //вариант 2
        int length = text.length();
        int midPoint = length / 2;

        String firstChart = text.substring(0, midPoint);
        String secondChart = text.substring(midPoint);

        System.out.println("Первая часть: " + firstChart);
        System.out.println("Вторая часть: " + secondChart);
    }


    public static void task4() {
        //УДАЛИТЕ ВСЕ ДУБЛИ И В ПОРЯДКЕ СЛЕДОВАНИЯ ИСПОЛЬЗУЮ МАССИВ СТРОК

        String[] array = {"Сколько", "можно", "говорить", "Сколько", "тебе", "Тебе"};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equalsIgnoreCase(array[j])) {
                    // Найден дубликат, удаляем его из массива
                    array[j] = array[array.length - 1];
                    array = Arrays.copyOf(array, array.length - 1);
                    j--;
                }
            }
        }

        // Выводим результат на экран
        System.out.println(Arrays.toString(array));
    }

    public static void task5() {

        String[] arrNameBook = {"Война и Мир", "Толстой", "Нос", "Гоголь", "Шантарам", "Дэвид Робертс", "Мастер и Маргарита", "Булгаков"};
        for (int i = 0; i < arrNameBook.length - 1; i++) {
            if (arrNameBook[i] == arrNameBook[0]) {
                System.out.println(arrNameBook[0] + " - " + arrNameBook[1]);
            } else if (arrNameBook[i] == arrNameBook[2]) {
                System.out.println(arrNameBook[2] + " - " + arrNameBook[3]);
            }
        }
    }


    public static void task7() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] res = calculateEven(arr);
        System.out.println(Arrays.toString(res));
    }


    public static int[] calculateEven(int[] arr) {
        int[] res = new int[4];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]++;

            }
        }
        int index = 0;
        for (int i = 3;  i < 7 && i < arr.length; i++){
            res[index] = arr[i];
            index++;
            }
        return res;
    }
}