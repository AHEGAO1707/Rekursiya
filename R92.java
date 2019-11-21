import java.util.Scanner;
/*Напишите программу, перемножающую два натуральных числа, которая не использует операции умножения.*/
public class R92 {
    private static int umnozhenie(int n1, int n2) {
        if (n2 == 1) {
            return n1;
        }
        return n1 + umnozhenie(n1, n2-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число => ");
        int n1 = in.nextInt();
        System.out.println("Введите второе число => ");
        int n2 = in.nextInt();
        System.out.println("Произведение равно => " + umnozhenie(n1, n2));
    }
}
