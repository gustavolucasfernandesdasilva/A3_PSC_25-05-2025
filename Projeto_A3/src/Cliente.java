
public class Cliente {
    private String nome;
    private int Nprocesso;
    private int cpf;
    private String regiao;
    private String telefone;


    public Cliente (String nome, int Nprocesso, String regiao , String telefone) {
        this.nome = nome;
        this.Nprocesso = Nprocesso;
        this.cpf = cpf;
        this.regiao = regiao;
        this.telefone = telefone;
    }


    public String getNome(){
        return nome;
  }
    public int getCpf() {
        return cpf;
    }
    public String getregiao() {
        return regiao;
    }
    public String getTelefone() { return telefone;}

    }






