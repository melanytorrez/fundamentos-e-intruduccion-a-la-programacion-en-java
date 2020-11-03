public class Problema3{
    public int invertir(int numero){
        int resto=0;
        int res=0;
        while( numero>0){
            resto =numero%10 ;
            res=res*10+resto;
            numero/=10;
        }
       return res;
   }
}
