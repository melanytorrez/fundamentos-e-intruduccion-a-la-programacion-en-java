public class Problema1{
    public int Fibinacci(int numero){   
        int a = 0;
        int b = 1;
        int res=0; 
        int n=numero;
        for (int i = 0; i < n; i++) {
            res = a + b;
            a = b;
            b = res;
        }
        return res;
    }
}

