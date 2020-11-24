public class Estrellas2{
    private int luminosidadPar[];
    public Estrellas2(){
        luminosidadPar = new int [5];
    }
    public Estrellas2(int [] x){
        luminosidadPar = x;
    }

    public boolean agregarNumeros(int valor){
        boolean res = false;   
        for(int i=0;i<luminosidadPar.length && res==false;i++){
            if(luminosidadPar[i]==0){
                luminosidadPar[i]=valor;
                res=true;
            }
        }
        return res;
    }
}
