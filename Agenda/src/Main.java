import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Object>> agenda = new ArrayList<>();

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

                ArrayList<String> listaTelefones = new ArrayList<>();
                System.out.print("Informe o número de telefone: ");
                String numero = sc.nextLine();
                listaTelefones.add(numero);

                ArrayList<Object> listaContatos = new ArrayList<>();
                listaContatos.add(nome);
                listaContatos.add(listaTelefones);

                agenda.add(listaContatos);
                System.out.println("Contato adicionado!");

            }

            //Para listar todos os contatos e respectivos numeros
            else if (escolha == 3) {
                for (Object l : agenda) {
                    System.out.print(l + "\n");
                }
            }

            //Para remover um contato e seu respectivo numero
            else if (escolha == 4) {
                System.out.print("Informe o nome do contato para ser removido: ");
                sc.nextLine();
                String nomeRemover = sc.nextLine();

                for (int i = 0; i < agenda.size(); i++) {
                    if (agenda.get(i).get(0).equals(nomeRemover)) {
                        agenda.remove(i);
                        System.out.println("Contato removido com sucesso!");
                        break;
                    }
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
