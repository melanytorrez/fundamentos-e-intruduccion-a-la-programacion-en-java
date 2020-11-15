public class Estrellas{
    private int luminosidad[];
    private int index;
    public Estrellas (){
        luminosidad = new int [10];
        index=0;
    }
    public boolean agregarElemento(int valor){
        boolean res =false;
        if(index < luminosidad.length){
            luminosidad[index]= valor;
            index++;
            res=true;
        }
        return res;
    }
    
}

