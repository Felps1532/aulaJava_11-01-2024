import java.util.*;

public class TryCatch11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> usersLogged = new ArrayList<>();

        int usersLimit = 2;

        String usuario;

        try {
            while (usersLogged.size() < usersLimit) {
                System.out.print("Digite um nome de usuário >>> ");
                usuario = scan.nextLine();
                if (usuario != "") {
                    usersLogged.add(usuario);
                } else {
                    usersLogged.add("user "+ Math.random());
                }
            }
        } catch (Exception e) {
            System.out.println("\nOps! Ocorreu um erro: "+e.getMessage());
        }
        System.out.println("\nUsuários logados:");
        for (int i=0; i < usersLogged.size(); i++) {
            System.out.println((i+1)+"º usuário - "+usersLogged.get(i));
        }
    }
}