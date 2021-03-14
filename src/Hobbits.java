public class Hobbits  extends Heroes{
    
    private static int instanciaHobbits;
    public Hobbits(String nombre,int ataque){
        super(nombre, 200, 100,ataque );

    }
    public static int getInstancias(){
        return Hobbits.instanciaHobbits;
    }
    @Override
    public void presentarse(){
        System.out.println("Personaje:  Hobbit ");
        System.out.print("      Nombre: "+this.nombre);
        System.out.print("      Vida: "+this.vida);
        System.out.print("      Armadura: "+this.armadura);
        System.out.print("      Ataque: "+this.ataque);
    }
}
