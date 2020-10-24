public class Cuaderno {
    private String tarea;
    private boolean estado; //estado-> true -> concluida 
    private int cantTareasConcluidas;
    
    public String asignarTarea(String tarea){
        if(estado==true){
            //asignar..
        }else{
            //no ha sido concluida
        }
        return "";
    }
    
    public String concluirTarea(){
        estado=true;
        cantTareasConcluidas++;
        return "";
    }
    
}