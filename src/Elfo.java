public class Elfo extends Heroes {
    
    private static int instanciasElfos;
    

    public Elfo (String nombre,int ataque){

        super(nombre, 250, 100,ataque);
    }
    
    public static int getInstancias(){
        return Elfo.instanciasElfos;
    }
    @Override
    public void presentarse(){
        System.out.println("Personaje:  Elfo ");
        System.out.print("      Nombre: "+this.nombre);
        System.out.print("      Vida: "+this.vida);
        System.out.print("      Armadura: "+this.armadura);
        System.out.print("      Ataque: "+this.ataque);
    }
    public void rabiaElfo(){

        this.ataque=+this.ataque+10;
    }
}
