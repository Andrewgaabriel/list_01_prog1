import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Autor a1 = new Autor();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do autor: ");
        a1.nome = sc.nextLine();
        
        System.out.println("Digite o id: ");
        a1.id = sc.nextInt();

        System.out.println("______________________________");
        System.out.println("Nome digitado: " + a1.nome);
        System.out.println("ID digitado: " + a1.id);
        System.out.println("______________________________");
    }

}
