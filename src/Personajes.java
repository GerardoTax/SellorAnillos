public class Personajes {
   protected String nombre;
   protected int vida;
   protected int armadura;
   protected int ataque;
   private static int instanciasPersonajes;
  
    public Personajes(String nombre, int vida, int armadura, int ataque){
        this.nombre=nombre;
        this.vida=vida;
        this.armadura=armadura;
        this.ataque=ataque;


    }
    public String  getNombre(){
        return this.nombre;
    }
    public int getVida(){
        return this.vida;
    }
    public int getArmadura(){
        return this.armadura;
    }
    public static int getInstancias(){
        return Personajes.instanciasPersonajes;
    }
    public void presentarse(){
    
        System.out.println("Personaje:  ");
        System.out.print("  Nombre:   "+this.nombre);
        System.out.print("  Vida:     "+this.vida);
        System.out.print("  Armadura: "+this.armadura);
        System.out.print("  Ataque "+this.ataque);
    }
    
    
}
