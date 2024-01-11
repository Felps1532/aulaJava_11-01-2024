import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        System.out.print("Digite o seu nome >>> ");
        int num;
        Scanner scan = new Scanner(System.in);

        try {
            num = scan.nextInt();
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu um erro.");
        }
    }
}