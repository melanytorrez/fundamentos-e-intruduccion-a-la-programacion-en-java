public class Problema7{
    
    private int contarDig (int n){
        int contador=0;
        while(n>0){
            contador++;
            n/=10;
        }
        return contador;
    }
}
