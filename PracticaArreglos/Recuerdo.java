public class Recuerdo{
    private Fecha fecha;
    private String descrip;
    
    public Recuerdo(Fecha fecha, String descrip){
        this.fecha= fecha;
        this.descrip= descrip;
    }
    
    public int getDia(){
        return fecha.getDia();
    }
    
    public Fecha getFecha(){
        return fecha;
    }
}