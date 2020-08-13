package edu.escuelaing.arep;

public class Estadistica {
    public Estadistica(){
    }
    public static double resMedia(LinkedList list){
        double media;
        LinkedList.Node node = list.head;
        double suma = 0;
        int cantidad = 0;
        while (node!=null){
            suma+=node.data;
            cantidad+=1;
            node=node.next;
        }media = suma/cantidad;
        media = (double)Math.round(media * 100d) / 100d;
        return media;
    }

    public static double resDesviacionEstandar(LinkedList list){
        double desv;
        double media = resMedia(list);
        LinkedList.Node node = list.head;
        double suma = 0;
        int cantidad = 0;
        while (node!= null){
            suma += Math.pow((node.data)-media,2);
            cantidad+=1;
            node=node.next;
        }
        cantidad-=1;
        desv = Math.sqrt(suma/cantidad);
        desv = (double)Math.round(desv * 100d) / 100d;
        return desv;
    }

}
