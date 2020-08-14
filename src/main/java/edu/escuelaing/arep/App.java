package edu.escuelaing.arep;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    
    /**
     * @param a
     * @throws IOException
     */
    // Leemos el archivo datos.txt, el cual contiene los casos
    public static void main(String[] a) throws IOException {
        fileRead("datos.txt");
    }

    /**
     * @param archivo
     * @throws IOException
     */
    public static void fileRead(String archivo) throws IOException {
        //Estadistica estadistica = new Estadistica();
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        // Recorremos cada linea del archivo y leemos dicha linea
        while ((cadena=b.readLine())!=null){
            // Añadimos esto a nustra linked list
            String[] parts = cadena.split(" ");
            ArrayList list = new ArrayList<Double>();
            for (String part:parts){
                double elemento = Double.parseDouble(part);
                list.add(elemento);
            }
            LinkedList thisList = new LinkedList();
            for(Object o: list){
                LinkedList.newNode(thisList,(Double)o);
            }
            System.out.println("---CASE---");
            // Para mostrar la lista
            LinkedList.Node node = thisList.head;
            while (node!=null){
                System.out.println(node.numeros+" ");
                node=node.next;
            }
            // Mostramos la Media y la D.E
            System.out.println("Media: "+Estadistica.resMedia(thisList));
            System.out.println("Desviacion Estandar: "+Estadistica.resDesviacionEstandar(thisList));
        }
        // Cerramos el Archivo
        b.close();
    }

}
