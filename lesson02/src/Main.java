import java.util.Arrays;

public class Main {

    // 1.
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    // 2.
    public static void checkSumSign() {
        int a = 3;
        int b = 2;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    // 3.
    public static void printColor() {
        int value = 235;
        if ( value <= 0) {
            System.out.println("Красный");
        } else if ( value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    // 4.
    public static void compareNumbers() {
        int a = 10;
        int b = 7;
        if ( a >= b ) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5.
    public static boolean sumTwoNumbers(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 6.
    public static void checkNumberSign(int a) {
        if ( a >= 0 ) {
            System.out.println("Число " + a + " является положительным");
        } else {
            System.out.println("Число " + a + " является отрицательным");
        }
    }

    // 7.
    public static boolean checkNumberSignTwo(int a) {
        return a >= 0;
    }

    // 8.
    public static void countString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    // 9.
    public static boolean checkLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    // 14.
    public static void createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        String arrayContent = Arrays.toString(array);
        System.out.println(arrayContent);
    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(sumTwoNumbers(5, 12));
        checkNumberSign(10);
        System.out.println(checkNumberSignTwo(-8));
        countString("Hello, world!", 4);
        System.out.println(checkLeapYear(2024));

        //10.
        int[] arr = {1,1,0,0,1,0,1,1,0,0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
        }
        String result = Arrays.toString(arr);
        System.out.println(result);

        // 11.
        int[] arr2 = new int[100];
        for (int i = 0; i < 100; i++) {
            arr2[i] = i+1;
        }
        String result2 = Arrays.toString(arr2);
        System.out.println(result2);

        // 12.
        int[] arr3 = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        String result3 = Arrays.toString(arr3);
        System.out.println(result3);

        // 13.
        int[][] twoDimArray = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    twoDimArray[i][j] = 1;
                } else {
                    twoDimArray[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }

        // 14.
        createArray(6, 3);
    }
}