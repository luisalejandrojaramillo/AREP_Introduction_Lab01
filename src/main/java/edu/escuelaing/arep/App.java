package edu.escuelaing.arep;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    //String nombre = "data.txt";
    public static void main(String[] a) throws IOException {
        fileRead("datos.txt");
    }

    public static void fileRead(String archivo) throws IOException {
        Estadistica estadistica = new Estadistica();
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);

        while ((cadena=b.readLine())!=null){
            String[] parts = cadena.split(" ");
            ArrayList list = new ArrayList<Double>();

            for (String part:parts){
                double elemento = Double.parseDouble(part);
                list.add(elemento);
            }
            LinkedList conj1 = new LinkedList();
            for(Object o: list){
                LinkedList.newNode(conj1,(Double)o);
            }
            LinkedList.printList(conj1);

            System.out.println("Media: "+Estadistica.resMedia(conj1));
            System.out.println("Desviacion Estandar: "+Estadistica.resDesviacionEstandar(conj1));
        }
        b.close();
    }

}
