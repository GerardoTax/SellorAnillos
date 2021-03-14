public class Trasgos extends Bestias {

 private static int instanciaTrasgos;
    public Trasgos (String nombre,int ataque){

        super(nombre, 325, 100,ataque);

    }
    public static int getInstancias(){

        return Trasgos.instanciaTrasgos;
    }
    @Override
    public void presentarse(){
        System.out.println("Personaje:  Trasgo ");
        System.out.print("      Nombre: "+this.nombre);
        System.out.print("      Vida: "+this.vida);
        System.out.print("      Armadura: "+this.armadura);
        System.out.print("      Ataque: "+this.ataque);
    }
    
}
