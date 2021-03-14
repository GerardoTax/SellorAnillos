public class Bestias extends Personajes{
    
    private static int instanciasBestias;
    public Bestias (String nombre, int vida , int armadura, int ataque){

        super(nombre, vida, armadura, ataque);
    }
    public static  int getInstancias(){

        return Bestias.instanciasBestias;

    }
}
