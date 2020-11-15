public class Vortice{
    private int numeros[];
    private int index;
    int mayor, menor;
    public Vortice (){
        numeros = new int [10];
        index=0;
    }
    public boolean agregarElemento(int valor){
        boolean res =false;
        if(index < numeros.length){
            numeros[index]= valor;
            index++;
            res=true;
        }
        return res;
    }
    public int nummayormenor(){
        int res= mayor = menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if(numeros [i] > mayor) {
                mayor = numeros[i];
            }
            if(numeros[i]<menor) {
                menor = numeros[i];
            }
        }
        return res;
    }
}
