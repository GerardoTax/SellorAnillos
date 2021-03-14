
public class Humanos  extends Heroes{
    
    private static int instanciaHumanos;
    public Humanos(String nombre,int ataque){
    
        super(nombre, 180, 100,ataque);
    }
    public static int getInstancias(){
        return Humanos.instanciaHumanos;
    }
    @Override
    public void presentarse(){
        System.out.println("Personaje: Humano ");
        System.out.print("      Nombre: "+this.nombre);
        System.out.print("      Vida: "+this.vida);
        System.out.print("      Armadura: "+this.armadura);
        System.out.print("      Ataque: "+this.ataque);
    }
}
