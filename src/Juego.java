public class Juego {
    
    private final int CANTIDAD_EJERCITO=5;
    private Bestias ejercitoBestias[];
    private Heroes ejercitoHeroes[];
    public Juego(){
        ejercitoBestias = new Bestias[CANTIDAD_EJERCITO];
        ejercitoHeroes = new Heroes[CANTIDAD_EJERCITO];

    }
   public void InicializarHeros(){
    ejercitoHeroes[0]=new Humanos("Juan",Dados.tirarDado(0, 100, 2, false));
    ejercitoHeroes[1]=new Elfo("Juan", Dados.tirarDado(0, 100, 2, false));
    ejercitoHeroes[2]=new Hobbits("pedro", Dados.tirarDado(0, 100, 2, false));
    ejercitoHeroes[3]=new Elfo("Juan", Dados.tirarDado(0, 100, 2, false));
    ejercitoHeroes[4]=new Hobbits("pedro",Dados.tirarDado(0, 100, 2, false));

   }
  
   public void inicioJuego(){
    this.InicializarHeros();
    this.presentarseHerores(ejercitoHeroes);
    
   }
   public void presentarseHerores(Personajes ejercito[]){
       ejercito[1].presentarse();
   }
}
