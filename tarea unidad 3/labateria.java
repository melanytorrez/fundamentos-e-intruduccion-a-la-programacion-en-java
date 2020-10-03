public class labateria{
    public double calcularporcentaje(){
        double unahoradejuego=20;
        double unahoraderRS=10;
        double unahoraYT=15;
        double bateriadisponible=55;
        double min30juego=10;
        double min15RS=2.5;
        double min40YT=10;
        double totalbateriausada=min30juego+min15RS+min40YT;
        double res=bateriadisponible-totalbateriausada;
        return res;
    }
}
