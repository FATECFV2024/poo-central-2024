public class App {
    public static void main(String[] args) throws Exception {
        aluno  a  = new aluno();
        endereco e = new endereco("Rua Carlos de Carvalho",
            "São João","Ferraz de Vasconcelos","", 
            "SP", "123",
            "085100-000");


        a.setEndereco(e);
        System.out.println(a.getEndereco().getRua());
    }
}
