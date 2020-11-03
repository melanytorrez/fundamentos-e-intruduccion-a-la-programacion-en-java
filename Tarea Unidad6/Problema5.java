public class Problema5{
    public String Perfecto(int numero){
        int i=1;
        int suma = 0;
        int n=numero;
        String res;
        for (i = 1; i < n; i++) {                             
            if (n % i == 0) {
                suma = suma + i;   
            }
        }
        if (suma == n) {                         
            res="Perfecto";
        } else {
            res="No es perfecto";

        }
        return res;
    }
}

