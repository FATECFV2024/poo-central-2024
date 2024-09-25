public class Aluno {
    private int ra;
    private String nome;
    private String cpf;

    public Aluno(int ra_p, String nome_p, String cpf_p){
        this.ra = ra_p;
        this.nome = nome_p;
        this.cpf = cpf_p;

        // this.variavel é variavel global, criada no inicia da classe
        // variavel_p é a variavel do parâmetro do método - sempre do mesmo tipo da global

    }

    public void setRA(int ra_p) {
        this.ra = ra_p;
    }

    public int getRA() {
        return this.ra;
    }

    public void setNome(String nome_p) {
        this.nome = nome_p;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCPF(String cpf_p){
        this.cpf = cpf_p;
    }

    public String getCPF(){
        return this.cpf;
    }
}
