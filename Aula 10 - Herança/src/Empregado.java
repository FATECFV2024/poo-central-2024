public class Empregado {
    protected String nome;
    protected String endereco;
    protected double salario;
    
    
    
    public Empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public double calcularINSS(){
        return (0.075*salario);
    }

    public double calcularIR(){
        double ir =0;
        if (salario <2000){
            ir = 0.1*salario;
        }else{
            ir=0.28 *salario;
        }
        return ir;
    }
    


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double getSalario() {
        return salario;
    }

    
}
