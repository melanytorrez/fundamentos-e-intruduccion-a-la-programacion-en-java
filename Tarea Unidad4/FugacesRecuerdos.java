public class FugacesRecuerdos{
    private String tareaActual;
    private String estadoTarea;
    private int cantTareasConcluidas;
    public FugacesRecuerdos(String tareaActual,String estadoTarea,int cantTereasConcluidas){
        this.tareaActual=tareaActual;
        this.estadoTarea=estadoTarea;
        cantTareasConcluidas=0;
    }
    public String getTareaActual(){
        return tareaActual;
    }
    public String getEstadoTarea(){
        return estadoTarea;
    }
    public int getCantTareasConcluidas(){
        return cantTareasConcluidas;
    }
    public void setTareaActual(String tareaActual){
        this.tareaActual=tareaActual;
    }
    public void setEstadoTarea(String estadoTarea){
        this.estadoTarea=estadoTarea;
    }
    public void setCantTareasConcluidas(int cantTareasConcluidas){
        cantTareasConcluidas=0;
    }
}
