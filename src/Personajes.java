public class Personajes {
   protected String nombre;
   protected int vida;
   protected int armadura;
    public Personajes(String nombre, int vida, int armadura){
        this.nombre=nombre;
        this.vida=vida;
        this.armadura=armadura;

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
}
