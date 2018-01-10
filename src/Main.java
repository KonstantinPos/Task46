import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        sc();
    }

    static void sc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число большее 3");
        int n = scanner.nextInt();
        if (n <= 3) {
            System.out.println("Вы не выполнили условие, повторите ввод");
            sc();
        }
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * n);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int arr2[] = new int[count];
                arr2[0] = arr[i];
                System.out.print(arr2[0] + " ");

            }
        }

    }


}
