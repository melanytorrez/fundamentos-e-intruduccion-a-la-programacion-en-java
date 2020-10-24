public class Estado{
    public String Reproducir(CajaMusical cajamusical){
        String res;
        String recuperarEstado = cajamusical.getEstado();
        if(recuperarEstado== "pause"){
        res=" la cancion a empezado a sonar";
    }else{
        res=" ya esta sonando una cancion";
    }
    return res;
   }
    public String Pausar(CajaMusical cajamusical){
        String res;
        String recuperarEstado= cajamusical.getEstado();
          if(recuperarEstado== "play"){
        res=" la cancion ha sido pausada";
    }else{
        res=" la cancion ya se encuentra en pausa";
    }
    return res;
   }
}
