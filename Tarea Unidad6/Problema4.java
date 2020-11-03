public class Problema4{
    public String Primo(int numero) {
        int i=2;
        int contador = 0;
        String res;
        for(i = 1; i <= numero; i++)
        {
            if((numero % i) == 0)
            {
                contador++;
            }
        }
 
        if(contador <= 2)
        {
            res="El numero es primo";
        }else{
            res="El numero no es primo";
        }
        return res;
     }
}
