public class NumCrecientes{
    public String NumCrecientes(Numero numero){
        String res;
        int dig1=numero.getDigito1();
        int dig2=numero.getDigito2();
        int dig3=numero.getDigito3();
        if(dig3>=dig2){
            res= "en crecimiento";
        }else if(dig2>=dig1){
            res= "en crecimiento";
        }else{
            res= "no esta en crecimiento";
        }
        return res;
    }
}
