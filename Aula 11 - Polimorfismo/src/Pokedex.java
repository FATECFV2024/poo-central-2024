public class Pokedex {
    public static void main(String[] args) throws Exception {
        Eevee e1 = new Eevee();
        Jolteon j1 = new Jolteon();

    
        System.out.println("Ataque: "+e1.ataque());
        System.out.println("Defesa: " +e1.defesa());
        System.out.println("Especial: "+ e1.especial());
        
        e1 = j1;
        System.out.println("Ataque: "+e1.ataque());
        System.out.println("Defesa: " +e1.defesa());
        System.out.println("Especial: "+ e1.especial());

        // System.out.println("Ataque: "+j1.ataque());
        // System.out.println("Defesa: " +j1.defesa());
        // System.out.println("Especial: "+ j1.especial());


    }
}
