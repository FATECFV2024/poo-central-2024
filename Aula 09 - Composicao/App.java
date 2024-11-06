public class App {
    public static void main(String[] args) {
        aluno  a  = new aluno();
        endereco e = new endereco("Rua Carlos de Carvalho",
            "São João","Ferraz de Vasconcelos","", 
            "SP", "123",
            "085100-000");

        
        a.setEndereco(e);
        endereco e1  = a.getEndereco();
        System.out.println(e.getRua());
        
    }
}
