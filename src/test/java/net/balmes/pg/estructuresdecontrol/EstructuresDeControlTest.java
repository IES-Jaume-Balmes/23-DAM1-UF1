/**
 *  M3 UF1 PG
 * */
package net.balmes.pg.estructuresdecontrol;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alumn-01
 */
public class EstructuresDeControlTest {

    /**
     * Test of valorAbsolut method, of class EstructuresDeControl.
     */
    @org.junit.jupiter.api.Test
    public void testValorAbsolut_negatiu() {
        System.out.println("valorAbsolut");
        int num = -3;
        int expResult = 3;
        int result = EstructuresDeControl.valorAbsolut(num);
        assertEquals(expResult, result);
    }

    /**
     * Test of valorAbsolut method, of class EstructuresDeControl.
     */
    @org.junit.jupiter.api.Test
    public void testValorAbsolut_positiu() {
        System.out.println("valorAbsolut");
        int num = 3;
        int expResult = 3;
        int result = EstructuresDeControl.valorAbsolut(num);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testValorAbsolut_zero() {
        System.out.println("valorAbsolut");
        int num = -0;
        int expResult = 0;
        int result = EstructuresDeControl.valorAbsolut(num);
        assertEquals(expResult, result);
    }

    /**
     * Test of minim method, of class EstructuresDeControl.
     */
    @Test
    public void testMinim_primer() {
        System.out.println("minim");

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int expResult = 1;
        int result = EstructuresDeControl.minim(a, b, c, d);

        assertEquals(expResult, result);
    }

    /**
     * Test of minim method, of class EstructuresDeControl.
     */
    @Test
    public void testMinim_segon() {
        System.out.println("minim");

        int a = 2;
        int b = 1;
        int c = 3;
        int d = 4;
        int expResult = 1;
        int result = EstructuresDeControl.minim(a, b, c, d);

        assertEquals(expResult, result);
    }

    /**
     * Test of minim method, of class EstructuresDeControl.
     */
    @Test
    public void testMinim_tercer() {
        System.out.println("minim");

        int a = 2;
        int b = 3;
        int c = 1;
        int d = 4;
        int expResult = 1;
        int result = EstructuresDeControl.minim(a, b, c, d);

        assertEquals(expResult, result);
    }

    /**
     * Test of minim method, of class EstructuresDeControl.
     */
    @Test
    public void testMinim_quart() {
        System.out.println("minim");

        int a = 2;
        int b = 3;
        int c = 4;
        int d = 1;
        int expResult = 1;
        int result = EstructuresDeControl.minim(a, b, c, d);

        assertEquals(expResult, result);
    }

    /**
     * Test of minim method, of class EstructuresDeControl.
     */
    @Test
    public void testMinim_negatius() {
        System.out.println("minim");

        int a = -2;
        int b = -3;
        int c = -4;
        int d = -1;
        int expResult = -4;
        int result = EstructuresDeControl.minim(a, b, c, d);

        assertEquals(expResult, result);
    }

    /**
     * Test of difMaxMin method, of class EstructuresDeControl.
     */
    @Test
    public void testDifMaxMin() {
        System.out.println("difMaxMin");

        assertEquals(2, EstructuresDeControl.difMaxMin(3, 4, 5));
        assertEquals(2, EstructuresDeControl.difMaxMin(-3, -4, -5));
        assertEquals(2, EstructuresDeControl.difMaxMin(-1, 1, 0));
        assertEquals(0, EstructuresDeControl.difMaxMin(2, 2, 2));
    }

    /**
     * Test of esValidaData method, of class EstructuresDeControl.
     */
    @Test
    public void testEsValidaData_diversesDatesValides() {
        System.out.println("esValidaData");
        assertEquals(true, EstructuresDeControl.esValidaData(1, 1, 1));
        assertEquals(true, EstructuresDeControl.esValidaData(31, 12, 2021));
        assertEquals(true, EstructuresDeControl.esValidaData(28, 2, 1));

    }

    /**
     * Test of esValidaData method, of class EstructuresDeControl.
     */
    @Test
    public void testEsValidaData_dies31_incorrectes() {
        System.out.println("esValidaData");
        assertEquals(false, EstructuresDeControl.esValidaData(31, 4, 1));
        assertEquals(false, EstructuresDeControl.esValidaData(31, 6, 2021));
        assertEquals(false, EstructuresDeControl.esValidaData(31, 9, 1));
        assertEquals(false, EstructuresDeControl.esValidaData(31, 11, 1));
    }

    /**
     * Test of esValidaData method, of class EstructuresDeControl.
     */
    @Test
    public void testEsValidaData_dies31_correctes() {
        System.out.println("esValidaData");
        assertEquals(true, EstructuresDeControl.esValidaData(31, 1, 1));
        assertEquals(true, EstructuresDeControl.esValidaData(31, 3, 2021));
        assertEquals(true, EstructuresDeControl.esValidaData(31, 5, 1));
        assertEquals(true, EstructuresDeControl.esValidaData(31, 7, 1));
        assertEquals(true, EstructuresDeControl.esValidaData(31, 8, 2021));
        assertEquals(true, EstructuresDeControl.esValidaData(31, 10, 1));
        assertEquals(true, EstructuresDeControl.esValidaData(31, 12, 1));
    }

    /**
     * Test of esValidaData method, of class EstructuresDeControl.
     */
    @Test
    public void testEsValidaData_anysTraspasTrue() {
        System.out.println("esValidaData");
        int dia = 29;
        int mes = 2;
        int any = 2020;
        boolean expResult = true;
        boolean result = EstructuresDeControl.esValidaData(dia, mes, any);
        assertEquals(expResult, result);
        any = 2000;
        result = EstructuresDeControl.esValidaData(dia, mes, any);
        assertEquals(expResult, result);
    }

    /**
     * Test of esValidaData method, of class EstructuresDeControl.
     */
    @Test
    public void testEsValidaData_anysTraspasFalse() {
        System.out.println("esValidaData");
        int dia = 29;
        int mes = 2;
        int any = 2100;
        boolean expResult = false;
        boolean result = EstructuresDeControl.esValidaData(dia, mes, any);
        assertEquals(expResult, result);
        any = 2001;
        result = EstructuresDeControl.esValidaData(dia, mes, any);
        assertEquals(expResult, result);
        any = 2002;
        result = EstructuresDeControl.esValidaData(dia, mes, any);
        assertEquals(expResult, result);
        any = 2003;
        result = EstructuresDeControl.esValidaData(dia, mes, any);
        assertEquals(expResult, result);
    }

    /**
     * Test of qualificacioFinal method, of class EstructuresDeControl.
     */
    @Test
    public void testQualificacioFinal() {
        System.out.println("qualificacioFinal");
        assertEquals("Suspens", EstructuresDeControl.qualificacioFinal(0));
        assertEquals("Suspens", EstructuresDeControl.qualificacioFinal(1));
        assertEquals("Suspens", EstructuresDeControl.qualificacioFinal(2));
        assertEquals("Suspens", EstructuresDeControl.qualificacioFinal(3));
        assertEquals("Suspens", EstructuresDeControl.qualificacioFinal(4));
        assertEquals("Aprovat", EstructuresDeControl.qualificacioFinal(5));
        assertEquals("Aprovat", EstructuresDeControl.qualificacioFinal(6));
        assertEquals("Notable", EstructuresDeControl.qualificacioFinal(7));
        assertEquals("Notable", EstructuresDeControl.qualificacioFinal(8));
        assertEquals("Excel·lent", EstructuresDeControl.qualificacioFinal(9));
        assertEquals("Excel·lent", EstructuresDeControl.qualificacioFinal(10));
    }

    /**
     * Test of esFestiu method, of class EstructuresDeControl.
     */
    @Test
    public void testEsFestiu_diesLaborables() {
        System.out.println("esFestiu");

        assertEquals(false, EstructuresDeControl.esFestiu('L', 1));
        assertEquals(false, EstructuresDeControl.esFestiu('M', 1));
        assertEquals(false, EstructuresDeControl.esFestiu('X', 1));
        assertEquals(false, EstructuresDeControl.esFestiu('J', 1));
        assertEquals(false, EstructuresDeControl.esFestiu('V', 1));        
    }
    
    
    /**
     * Test of esFestiu method, of class EstructuresDeControl.
     */
    @Test
    public void testEsFestiu_capDeSetmana() {
        System.out.println("esFestiu");

        assertEquals(true, EstructuresDeControl.esFestiu('S', 1));
        assertEquals(true, EstructuresDeControl.esFestiu('D', 1));  
    }    
    
    /**
     * Test of esFestiu method, of class EstructuresDeControl.
     */
    @Test
    public void testEsFestiu_vacances() {
        System.out.println("esFestiu");

        assertEquals(true, EstructuresDeControl.esFestiu('V', 7));
        assertEquals(true, EstructuresDeControl.esFestiu('L', 8));
        assertEquals(true, EstructuresDeControl.esFestiu('M', 8));
        assertEquals(true, EstructuresDeControl.esFestiu('X', 8));
        assertEquals(true, EstructuresDeControl.esFestiu('J', 8));
        assertEquals(true, EstructuresDeControl.esFestiu('V', 8));   
    }        

    /**
     * Test of esPrimer method, of class EstructuresDeControl.
     */
    @Test
    public void testEsPrimer() {
        System.out.println("esPrimer");
        int num = 0;
        boolean expResult = false;
        boolean result = EstructuresDeControl.esPrimer(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
