public class Equilibrio{
    private int emociones[];
    private int index;
    public Equilibrio (){
        emociones = new int [10];
        index=0;
    }
    public boolean agregarElemento(int valor){
        boolean res =false;
        if(index < emociones.length){
            emociones[index]= valor;
            index++;
            res=true;
        }
        return res;
    }
    public int suma (){
        int res=0;
        int emociones[]={4,6,11,2,21};
        for (int i =0;i<emociones.length;i++){
            res= emociones[i];
        }
        return res;
    }
    
    public void burbuja(){
        for(int i=1; i<=emociones.length; i++){
            for(int j=0; j<= emociones.length-1-i; j++){
                if(emociones[j]>emociones[j+1]){
                    int aux = emociones[j];
                    emociones[j]=emociones[j+1];
                    emociones[j+1]=aux;
                }
            }
        }
    }
}
