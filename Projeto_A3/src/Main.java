import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcao , cpf = 0 , Nprocesso = 0;
        String nome, regiao , telefone;

        Scanner Leia = new Scanner(System.in);


        while (true) {
            System.out.println("\n-----------menu-----------");
            System.out.println("Registrar Cliente, opcao 1");
            System.out.println("Consultar Casos abertos , opcao 2 :");
            System.out.println("Finalizar Casos Abertos , opcao 3 :");
            System.out.println("-----------------------------");

            System.out.println("Digite a opcao : ");
            opcao = Leia.nextInt();

            switch (opcao) {
                case 1 :


                    System.out.println("\n Cpf do Cliente");
                    cpf = Leia.nextInt();
                    Leia.nextLine();
                    System.out.println("\n Numero de contato do Cliente");
                    telefone = Leia.nextLine();
                    System.out.println(" \n Nome do Cliente");
                    nome = Leia.nextLine();
                    System.out.println(" \n regiao do Cliente");
                    regiao = Leia.nextLine();


                    System.out.println("Cpf do cliente : " + cpf + "\n nome do cliente : " + nome + " \n reigao onde mora : " + regiao + "\n contato do cliente : " + telefone);
                    Cliente cliente = new Cliente(nome,cpf,regiao,telefone);

                    break ;
                case 2 :
                    System.out.println("Cpf do Cliente");
                    cpf = Leia.nextInt();
                    System.out.println("Nº do caso");
                    Nprocesso = Leia.nextInt();


                    break;





            }

        }
    }
}