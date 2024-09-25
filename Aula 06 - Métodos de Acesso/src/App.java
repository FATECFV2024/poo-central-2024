public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        /*  Toda vez é criado um construtor é obrigatório 
        preencher o dados  na sequência criada no construtor */
        Aluno alice = new Aluno(456,"Julio","555.222.333-44");
        Turma t = new Turma();
        t.validaPeriodo("");
        t.setPeriodo("Ok");
        
        System.out.println(t.getPeriodo());
        // Aluno alan = new Aluno();
        // alice.ra=123;
        // alan.ra=456;
        // System.out.println(alice.ra);
        // System.out.println(alan.ra);

        
        //metodos setters
        alice.setRA(123);
        alice.setNome("Alice Silva");
        alice.setCPF("111.222.333-44");
        // metodos getters
        // System.out.println(alice.getRA());
        // String nome= alice.getNome(); //nome='Alice Silva'
        // System.out.println(nome);
        // System.out.println(alice.getCPF());

        // System.out.println(alan.getNome());

 

    }
}
