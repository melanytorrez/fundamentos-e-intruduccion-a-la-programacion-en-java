public class Problema2{
    
    public int cantDigitos(int numero){
        int res=0;
        int factor = 1;
        for(int i=1; i<=res; i++){
            res =(numero/10);
        }
        return res;
    }
    public int cantDigitos2(int numero){
        int res=0;
        int i=1;
        while( i>=0){
            res = numero/10;
            i++;
        }
        return res;
    }
}
