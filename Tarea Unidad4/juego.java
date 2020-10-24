public class juego {
    private int posX;
    private int posY;
    private int cantIntentos;
    //5     ---- 5 ----> (0)
    public juego(){
        cantIntentos=3;
        posX= (int)(Math.random()*11);
        posY= (int)(Math.random()*11);
    }
    
    public String jugar(int x, int y){
        String res="";
        int diferenciaX= Math.abs(posX-x);
        int diferenciaY= Math.abs(posY-y);
        if(diferenciaX==0 &&diferenciaY==0){
            res="ganasteee!!";
        }else{
            if(diferenciaX>2){
                res="X: esta lejos";
            }else{
                res="X: esta cerca";
                if(diferenciaY>2){
                    res="Y: esta lejos";
                }else{
                    res="Y: esta cerca";
                }
            }
        }
        
        return res;
    }
}