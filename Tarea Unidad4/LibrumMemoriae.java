public class LibrumMemoriae{
    public String estado(FugacesRecuerdos fugacesrecuerdos){
        String res;
        String verificarEstado=fugacesrecuerdos.getEstadoTarea();
        if(verificarEstado=="concluida"){
            res="asignar nueva tarea";
        }else{
            res="La tarea en curso aún no ha sido concluida";
        }
        return res;
    }
}
