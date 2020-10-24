public class CajaMusical{
    private String cancion1,cancion2,cancion3;
    private String Estado;
    public CajaMusical(String cancion1, String cancion2, String cancion3, String Estado){
         this.cancion1=cancion1;
         this.cancion2=cancion2;
         this.cancion3=cancion3;
         this.Estado=Estado;
   }
    public String getCancion1(){
        return cancion1;
    }
    public String getCancion2(){
        return cancion2;
    }
    public String getCancion3(){
        return cancion3;
    }
     public String getEstado(){
        return Estado;
    }
    public void setCancion1(String cancion1){
        this.cancion1=cancion1;
    }
    public void setCancion2(String cancion2){
        this.cancion2=cancion2;
    }
    public void setCancion3(String cancion3){
        this.cancion3=cancion3;
    }
    public void setEstado(String Estado){
        this.Estado=Estado;
    }
}
