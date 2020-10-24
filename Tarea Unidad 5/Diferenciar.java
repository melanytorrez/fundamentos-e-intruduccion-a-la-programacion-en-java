public class Diferenciar{
    public String Diferenciar(Hijos hijos){
        String res;
        int edadhijo1=hijos.getEdad1();
        String nombrehijo1=hijos.getNomb1();
        int edadhijo2=hijos.getEdad2();
        String nombrehijo2=hijos.getNomb2();
        int edadhijo3=hijos.getEdad3();
        String nombrehijo3=hijos.getNomb3();
        if(edadhijo1>edadhijo2 && edadhijo2>edadhijo3){
            res=nombrehijo1+" es el mayor";
            res=nombrehijo2+" es el del medio";
        }else{
            res=edadhijo3+" es el menor";
        }
        return res;
    }
}

