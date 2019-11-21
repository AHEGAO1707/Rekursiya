import java.util.Scanner;
/*Напишите программу, находящую наибольший общий делитель gcd(X, Y ) двух натуральных чисел X и Y.*/
public class R109 {
    private static int gsd(int X, int Y) {
        if (Y == 0) {
            return X;
        }
        else {
            return gsd(Y, X % Y);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число для нахождения наибольшего общего делителя => ");
        int X = in.nextInt();
        System.out.println("Введите второе число для нахождения наибольшего общего делителя => ");
        int Y = in.nextInt();
        System.out.println("Наибольший общий делитель равен => " + gsd(X, Y));
    }
}
