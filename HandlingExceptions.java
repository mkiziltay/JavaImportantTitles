import java.util.Scanner;

public class Main  {

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new ArithmeticException("ArithmeticException f�rlat�lacak");
        }

        System.out.println(" Hata f�rlat�lmayacak ");
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ya��n�z : ");
        int a = scan.nextInt();

            checkAge(a);

    }
}