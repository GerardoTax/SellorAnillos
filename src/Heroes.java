public class Heroes extends Personajes {
    private static int instanciasHeroes;

    public Heroes(String nombre, int vida , int armadura, int ataque){

        super(nombre, vida, armadura,ataque);

    }
    public static int getInstancias(){
        return Heroes.instanciasHeroes;
    }
}

