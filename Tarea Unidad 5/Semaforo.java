public class Semaforo{    
    public String Semaforo(Cambios cambios){
        String res;
        int numCambios=cambios.getCantCambios();
        if(numCambios%3==0){
            res=" esta en rojo";
            if (numCambios%3==1){
                res="esta en verde";
            }else{
                res=" esta en amarillo";
            }
       }else{
           res=" no cambio";
       }
        return res;
    }
 }

           

