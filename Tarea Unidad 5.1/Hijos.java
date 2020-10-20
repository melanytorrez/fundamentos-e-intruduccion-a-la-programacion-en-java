public class Hijos{
   public String nomb1, nomb2,nomb3;
   public int edad1,edad2,edad3;
   public Hijos(String nomb1,String nomb2,String nomb3,int edad1,int edad2,int edad3){
       this.nomb1=nomb1;
       this.nomb2=nomb2;
       this.nomb3=nomb3;
       this.edad1=edad1;
       this.edad2=edad2;
       this.edad3=edad3;
    }
    public String getNomb1(){
        return nomb1;
    }
    public String getNomb2(){
        return nomb2;
    }
    public String getNomb3(){
        return nomb3;
    }
    public int getEdad1(){
        return edad1;
    }
    public int getEdad2(){
        return edad2;
    }
    public int getEdad3(){
        return edad3;
    }
    public void setNomb1(String nomb1){
        this.nomb1=nomb1;
    }
    public void setNomb2(String nomb2){
        this.nomb2=nomb2;
    }
    public void setNomb3(String nomb3){
        this.nomb3=nomb3;
    }
    public void setEdad1(int edad1){
        this.edad1=edad1;
    }
     public void setEdad2(int edad2){
        this.edad2=edad2;
    }
     public void setEdad3(int edad3){
        this.edad3=edad3;
    }
}
