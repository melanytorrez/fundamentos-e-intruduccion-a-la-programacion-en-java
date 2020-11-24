public class Concatenar{
   private int listaComp[];
   private Estrellas luminosidadImpar[];
   private Estrellas2 luminosidadPar[];
    public int arregloCompleto(){
    int i = 0;
    int res=0;
    int numImpar=luminosidadImpar[];
    int numPar=luminosidadPar[];
    for (i = 0; i < numImpar.length; i++ ){
        listaComp[i] = numImpar[i];

    }

    for (int j = 0; j < numPar.length; j++ ){
        listaComp[i] = numPar[j];
        i++;
    }
    return res;
   }
}
