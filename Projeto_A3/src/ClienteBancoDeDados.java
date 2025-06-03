public class ClienteBancoDeDados {
    private ClienteBancoDeDados[] vagas;

    private String nome;
    private int Nprocesso;
    private int cpf;
    private String regiao;
    private String telefone;
    private ClienteBancoDeDados [] clienteBancoDeDados;

    public ClienteBancoDeDados(String nome, int Nprocesso, int cpf,  String regiao,String telefone, int ClienteBancoDeDados) {

        this.nome = nome;
        this.Nprocesso = Nprocesso;
        this.cpf = cpf;
        this.regiao = regiao;
        this.telefone = telefone;
        this.clienteBancoDeDados = new ClienteBancoDeDados[];

        for   (  int I = 0 ; I < clienteBancoDeDados ; I++) {
            clienteBancoDeDados[I] = new clienteBancoDeDados(I + 1); // Vaga numerada de 1 até 'numeroDeVagas'
        }
    }
}


