import java.util.Scanner;

public class Juego {
    
  Scanner scanner = new Scanner(System.in);
    private final int CANTIDAD_EJERCITO=5;
    private Bestias ejercitoBestias[];
    private Heroes ejercitoHeroes[];
    public Juego(){
        ejercitoBestias = new Bestias[CANTIDAD_EJERCITO];
        ejercitoHeroes = new Heroes[CANTIDAD_EJERCITO];

    }

   public void InicializarHeros(){
       int posicion=0;
    while(posicion <CANTIDAD_EJERCITO)
    {
        
        switch (Dados.tirarDado(1, 3, 1, false)){
            case 1:
            ejercitoHeroes[posicion] = new Elfo("",Dados.tirarDado(1, 100, 2, false));
            break;
            case 2:
            ejercitoHeroes[posicion] = new Hobbits("Audramnus",Dados.tirarDado(1, 100, 2, false));
            break;
            case 3:
            ejercitoHeroes[posicion] = new Humanos("Marcos",Dados.tirarDado(1, 100, 2, false));
            break;
            default:

        }
        posicion++;
    }
   
   }
   public void InicializarBestias(){
       
    int posicion=0;
    while(posicion <CANTIDAD_EJERCITO)
    {
        
        switch (Dados.tirarDado(1, 2, 1, false)){
            case 1:
            ejercitoBestias[posicion] = new Orcos("Srugro",Dados.tirarDado(1, 90, 1, false));
            break;
            case 2:
            ejercitoBestias[posicion] = new Trasgos("Fulcaire",Dados.tirarDado(1, 90, 1, false));
            break;
            default:

        }
        posicion++;
    }

   }
  
   public void inicioJuego(){
       int opciones=0;
       this.InicializarHeros();
       this.InicializarBestias();
        while(opciones!=3){
            System.out.println("Bienvenido al Juego del Señor de los anillos ");
            System.out.println("1. Ver ejercitos");
            System.out.println("2. Pelea ");
            System.out.println("3. Salir ");
            opciones=scanner.nextInt();
            switch(opciones){

                case 1:
                verejerctios();
                break;
                case 2:
                break;
                case 3:
                break;
                default: System.out.println("La opcion no existe ");

            }

        }
      
   }
   public void presentarPersonajes(Personajes ejercito[]){
       for(int i=0;i<CANTIDAD_EJERCITO;i++){
          ejercito[i].presentarse();
          System.out.println("\n");
       }
       
   }

   public void verejerctios(){
        System.out.println("\n\n");
        System.out.println("Ejercito de Heroes");
        System.out.println("\n\n");
        this.presentarPersonajes(ejercitoHeroes);
        System.out.println("\n\n");
        System.out.println("Ejercito de Bestias");
        this.presentarPersonajes(ejercitoBestias);
        System.out.println("\n\n");
    }

}
