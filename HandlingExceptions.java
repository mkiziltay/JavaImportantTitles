import java.util.Scanner;

public class Main  {

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new ArithmeticException("ArithmeticException fırlatılacak");
        }

        System.out.println(" Hata fırlatılmayacak ");
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Yaşınız : ");
        int a = scan.nextInt();

            checkAge(a);

    }
}