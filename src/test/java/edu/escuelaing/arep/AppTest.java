package edu.aci.arep;

import edu.eci.arep.Estadistica;
import edu.eci.arep.LinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    public static final Estadistica estadistica = new Estadistica();
    public static final int[] caso1= {160,591,114,229,230,270,128,1657,624,1503};
    public static final double[] caso2= {15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2};
    public static final double[] caso3= {10,5,15,11.5,35,2.5,35.5,20,15.5,18};

    public static final LinkedList list1 = new LinkedList();
    public static final LinkedList list2 = new LinkedList();
    public static final LinkedList list3 = new LinkedList();

    @Before
    public void add() {
        for (int n1:caso1) {
            LinkedList.newNode(list1,n1);
        }
        for (double n2:caso2) {
            LinkedList.newNode(list2,n2);
        }
        for (double n3:caso3) {
            LinkedList.newNode(list3,n3);
        }
    }

    @Test
    public void debeCalcularMedia() {
        assertEquals(550.60,Estadistica.resMedia(list1),0);
        assertEquals(60.32,Estadistica.resMedia(list2),0);
        assertEquals(16.80,Estadistica.resMedia(list3),0);
    }
    @Test
    public void debeCalcularDesviacionEstandar() {
        assertEquals(572.03,Estadistica.resDesviacionEstandar(list1),0);
        assertEquals(62.26,Estadistica.resDesviacionEstandar(list2),0);
        assertEquals(11.13,Estadistica.resDesviacionEstandar(list3),0);
    }


}
