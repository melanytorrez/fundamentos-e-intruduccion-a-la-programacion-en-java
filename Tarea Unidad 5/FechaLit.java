public class FechaLit{
    public String literal(Fecha fecha){
        String res;
        int diaCumpleaños=fecha.getDia();
        int mesCumpleaños=fecha.getMes();
        int añoCumpleaños=fecha.getAño();
         switch(mesCumpleaños){
            case 1: res =diaCumpleaños+ " de Enero de "+añoCumpleaños; break;
            case 2: res =diaCumpleaños+ " deFebrero de"+añoCumpleaños; break;
            case 3: res = diaCumpleaños+" deMarzo de"+añoCumpleaños; break;
            case 4: res = diaCumpleaños+" deAbril de"+añoCumpleaños; break;
            case 5: res = diaCumpleaños+"de Mayo de"+añoCumpleaños; break;
            case 6: res = diaCumpleaños+"de Junio de"+añoCumpleaños; break;
            case 7: res = diaCumpleaños+"de Julio de"+añoCumpleaños; break;
            case 8: res = diaCumpleaños+"de Agosto de"+añoCumpleaños; break;
            case 9: res = diaCumpleaños+"de Septiembre de"+añoCumpleaños; break;
            case 10: res =diaCumpleaños+ "de Octubre de"+añoCumpleaños; break;
            case 11: res =diaCumpleaños+ "de Noviembre de"+añoCumpleaños; break;
            case 12: res =diaCumpleaños+ "de Diciembre de"+añoCumpleaños; break;
            default: res = diaCumpleaños+"El numero indicado no corresponde a nada";
    }
    return res;
}
}
