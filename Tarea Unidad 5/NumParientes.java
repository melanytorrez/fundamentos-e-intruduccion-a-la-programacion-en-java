public class NumParientes{
    public String NumParientes (Numeros numeros){
        String res;
        int recuperarNumero1=numeros.getNumero1();
        int recuperarNumero2=numeros.getNumero2();     
        if ((recuperarNumero1%recuperarNumero2)==0){
            res="son parientes";
        }else{
            res="no son parientes";
        }
        return res;
    }
}
