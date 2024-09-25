import java.util.Date;
public class App {
    public static void main(String[] args) {
        Aluno a = new  Aluno("Francisco","292",new Date("01/01/2000"),"Masculino");
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno(new Date("06/01/1998"), "292");
        Aluno a3 = new Aluno("Kaue", new Date("06/01/1998"));
        Aluno a4 = new Aluno ("Guilherme", "292");
        Aluno a5 = new Aluno("Kaue", new Date(124,8,24));
        
        System.out.println("Nome:" + a.getNome());
        System.out.println("Nome:" + a1.getNome());
        System.out.println("Nome:" + a2.getNome());
        System.out.println("Nome:" + a3.getNome());
        System.out.println("Nome:" + a4.getNome());
    }
}
