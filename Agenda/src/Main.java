import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> listaTelefonica = new ArrayList<>();

        System.out.println("=== AGENDA TELEFONICA ===");
        System.out.println("1 - Adicionar um novo contato");
        System.out.println("2 - Buscar telefone por nome");
        System.out.println("3 - Listar todos os contatos");
        System.out.println("4 - Remover contato");
        System.out.print("Selecione uma opção: ");
        int escolha = sc.nextInt();

        while (escolha != 0) {
            //Adciona um novo contato com um número
            if (escolha == 1) {
                System.out.print("Informe o nome do contato: ");
                sc.nextLine();
                String nome = sc.nextLine();
                listaTelefonica.add(nome);
                ArrayList<String> listaTelefones = new ArrayList<>();
                System.out.print("Informe o número de telefone: ");
                String numero = sc.nextLine();
                listaTelefones.add(numero);
                listaTelefonica.add(listaTelefones);

            }

            //Para listar todos os contatos e respectivos numeros
            else if (escolha == 3) {
                for (Object l : listaTelefonica) {
                    System.out.print(l + "\n");
                }
            }

            //Para obrigar o usuário a escolher uma opção válida
            else {
                System.out.println("Faça uma escolha válida!");
            }

            System.out.print("Escolha uma opção: ");
            escolha = sc.nextInt();
        }

        //Finaliza o programa
        System.out.println("Programa encerrado!");

        sc.close();
    }


}
