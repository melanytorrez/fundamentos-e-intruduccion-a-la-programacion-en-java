public class Mente{
    private Recuerdo[] recuerdos;
    
    public Mente(int cant){
        recuerdos= new Recuerdo[cant];
    }
    
    public void agregar(Recuerdo r){
        for(int i=0;i<recuerdos.length; i++){
            if(recuerdos[i]==null){
                recuerdos[i]=r; //agregar en la pos i al arreglo
                break;
            }
        }
    }
    
    public Recuerdo getRecuerdoLuz(){
        int posMedio= recuerdos.length/2;
        return recuerdos[posMedio];
    }
    
    private boolean estaLleno(){
        boolean res=true;
        
        /*for(Recuerdo r: recuerdos){
               if(r==null){
                   res=false;
                   break;
                }
        }*/
        
        for(int i=0;i<recuerdos.length;i++){
            if(recuerdos[i]==null){
                res=false;
                break;
            } 
        }
        return res;
    }
    
    public void ordenarPorDia(){
        if(estaLleno()){
            for(int i=0;i<recuerdos.length-1;i++){
                for(int j=i+1; j<recuerdos.length;j++){
                    int dia1= recuerdos[i].getDia();
                    int dia2= recuerdos[j].getDia();
                    if(dia1>dia2){
                     //intercambiar
                        Recuerdo aux= recuerdos[i];
                        recuerdos[i]=recuerdos[j];
                        recuerdos[j]= aux;
                    }
                }
            }            
        }
        
    }
    
    public void ordenarPorMes(){
        //metodo de ordenamiento; burbuja
    }
    
}