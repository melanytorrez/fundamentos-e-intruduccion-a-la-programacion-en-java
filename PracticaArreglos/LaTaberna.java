public class LaTaberna{
    private Sueños sueño[];
    private int index;
    public LaTaberna (int tam){
        for(int i=0;i<sueño.length;i++){
            sueño=new Sueños[tam];
            index=0;
        }
    }
    public boolean agregarSueño(Sueños nuevo){
        boolean res =false;
        for(int i=0; i<sueño.length && res==false; i++){
            if(sueño[i]==null){
                sueño[i]= nuevo;
                res= true;
            }
        }
        return res;
    }
    public boolean eliminarSueño(Sueños buscado){
        boolean res=false;
        for (int i=0; i<sueño.length && res==false; i++){
            Sueños actual = sueño[i];
            if(actual.equals(buscado)){
                res=true;
                sueño[i]=null;
               
            }
        }
        return res;
    }
}
