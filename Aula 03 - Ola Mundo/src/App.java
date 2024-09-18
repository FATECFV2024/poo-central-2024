public class App {
    public static void main(String[] args) throws Exception {
       Veiculo v_gol = new Veiculo();
       v_gol.capacidadeTanque=40;

    //    System.out.println(v_gol.capacidadeTanque);

       v_gol.velocidade=20;
       v_gol.acelerar();
       v_gol.acelerar();
       v_gol.acelerar();
       v_gol.acelerar();
       v_gol.acelerar();
       System.out.println(v_gol.velocidade);
    
       v_gol.parar();
       System.out.println(v_gol.velocidade);
    String texto = v_gol.buzina();
       System.out.println(texto);

       Veiculo corsa = new Veiculo();
       System.out.println(corsa.velocidade);
    }



}
