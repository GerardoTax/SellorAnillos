public class Orcos extends Bestias {
    private static int instanciaOrcos;
    public Orcos(String nombre,int ataque){

        super(nombre, 300, 100,ataque);

    }

    public static int getInstancias()
    {

        return Orcos.instanciaOrcos;
    }
    @Override
    public void presentarse(){
        System.out.println("Personaje:  Orco ");
        System.out.print("      Nombre: "+this.nombre);
        System.out.print("      Vida: "+this.vida);
        System.out.print("      Armadura: "+this.armadura);
        System.out.print("      Ataque: "+this.ataque);
    }
}
