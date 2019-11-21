import java.util.Scanner;
/*Напишите программу, вводящую целое число a и натуральное n, вычисляющую и печатающую  a в n-нной степени без использования вызова функции возведения в степень.*/
public class R94 {
    private static int stepen(int a, int n) {
        if (n == 1) {
            return a;
        }
        return a * stepen(a, n - 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, которое нужно возвести в степень  => ");
        int a = in.nextInt();
        System.out.println("Введите степень, в которую нужно возвести число => ");
        int n = in.nextInt();
        System.out.println("Число a в n-нной степени равно => " + stepen(a, n));
    }
}