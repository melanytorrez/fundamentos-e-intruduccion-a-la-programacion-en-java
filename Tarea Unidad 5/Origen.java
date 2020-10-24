public class Origen{
    public String Origen(NumOriginal numOriginal){
        String res;
        int numero1=numOriginal.getDig1();
        int numero3=numOriginal.getDig3();
        if (numero1<=999){
            res= numero3 + "es el origen";
        }else{
            res= "numero erroneo";
        }
        return res;
    }
}
