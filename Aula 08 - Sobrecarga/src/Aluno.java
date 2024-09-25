import java.util.Date;

public class Aluno {
    private String nome;
    private String matricula;
    private Date data_nascimento;
    private String genero;
    
// Construtor com todos os parametros
    public Aluno(String nome, String matricula, Date data_nascimento, String genero){
        this.nome = nome;
        this.matricula = matricula;
        this.data_nascimento = data_nascimento;
        this.genero = genero;
    }
    // Construtor Vazio
    public Aluno(){
    
    }
    //Construtor com dois parametros (texto, texto)
    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    
    //Construtor com dois parametros (texto, data)
    public Aluno (String nome, Date data_nascimento){
        this.nome = nome;
        this.data_nascimento = data_nascimento;
    }
    
    //Construtor com dois parametros (data, texto)
    public Aluno (Date data_nascimento, String matricula){
        this.matricula = matricula;
        this.data_nascimento = data_nascimento;
    }
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
}