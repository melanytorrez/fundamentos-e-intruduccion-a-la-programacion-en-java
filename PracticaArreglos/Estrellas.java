public class Estrellas{
    private int luminosidadImpar[];
    public Estrellas(){
        luminosidadImpar = new int [5];
    }
    public Estrellas(int [] x){
        luminosidadImpar = x;
    }

    public boolean agregarNumeros(int valor){
        boolean res = false;   
        for(int i=0;i<luminosidadImpar.length && res==false;i++){
            if(luminosidadImpar[i]==0){
                luminosidadImpar[i]=valor;
                res=true;
            }
        }
        return res;
    }
}

