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
    
}
