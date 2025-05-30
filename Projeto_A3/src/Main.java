import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcao;

        Scanner Leia = new Scanner(System.in);

        while (true) {
            System.out.println("\n-----------menu-----------");
            System.out.println("Registrar Cliente, opcao 1");
            System.out.println("Consultar Casos abertos , opcao 2 :");
            System.out.println("Finalizar Casos Abertos , opcao 3 :");
            System.out.println("Remover clientes, opcao 4 :");
            System.out.println("-----------------------------");

            System.out.println("Digite a opcao : ");
            opcao = Leia.nextInt();
            int Escolha;


            switch (opcao) {
                case 1 :
                     System.out.println("Nome do Cliente");
                     System.out.println("Cpf do Cliente");
                     System.out.println("Nº do caso");
                     System.out.println("Regiao aonde mora");
                     System.out.println("Reuniao");

                break;

                case 2 :






                break;





            }

        }
    }
}