import java.util.Scanner;

public class Main  {

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new ArithmeticException("ArithmeticException fýrlatýlacak");
        }

        System.out.println(" Hata fýrlatýlmayacak ");
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Yaþýnýz : ");
        int a = scan.nextInt();

            checkAge(a);

    }
}