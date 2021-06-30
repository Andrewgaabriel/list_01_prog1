import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Autor a1 = new Autor();
        a1.carregaDoTeclado();
        


        
        System.out.println("______________________________");
        System.out.println("Nome digitado: " + a1.nome);
        System.out.println("ID digitado: " + a1.id);
        System.out.println("______________________________");
    }

}
