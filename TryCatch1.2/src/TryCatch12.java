import java.util.*;

public class TryCatch12 {
    public static void main(String[] args) {
        List<String> usersLogged = new ArrayList<>();
        int userlimits = 2;
        Scanner sncInput = new Scanner(System.in);
        String usuario;
        try {
            while (usersLogged.size() < userlimits) {
                System.out.println("Digite um nome de usuário ou tecle Enter para gerar um nome de usuário aleatório");
                usuario = sncInput.nextLine();
                if (usuario != "") {
                    usersLogged.add(usuario);
                } else {
                    usersLogged.add("user" + Math.random());
                }
                Thread.sleep(1000);
            }
            System.out.println("Limite de usuários atingido");
            System.out.println("Os usuários inscritos foram os " + usersLogged + " e deram um total de " + usersLogged.size() + " usuários.");
        } catch (Exception e) {
            System.out.println("Ops! Houve um erro." + e.getMessage());
        }
        sncInput.close();
    }
}