import java.util.Scanner;

class Autor {
    /* Atributos: */
    String nome;
    int id;

    /* Metodos: */
    void carregaDoTeclado(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do autor: ");
        nome = sc.nextLine();
        System.out.println("Digite o id: ");
        id = sc.nextInt();


    }

}
