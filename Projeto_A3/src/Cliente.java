public class Cliente {
    private  String nome;
    private  String regiao;
    private int Nprocesso;
    private int cpf;


    public void Cliente(String nome, String regiao,int Nprocesso , int cpf) {
        this.nome = nome;
        this.regiao = regiao;
        this.Nprocesso = Nprocesso;
        this.cpf = cpf;
    }


  public String getNome(){
        return nome;
  }
  public String getrRegiao(){
        return regiao;
    }

    public int getCpf() {
        return cpf;
    }

    public int getNprocesso() {
        return Nprocesso;
    }
}





