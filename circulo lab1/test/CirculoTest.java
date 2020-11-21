/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernando
 */
public class CirculoTest {
    
    public CirculoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Circulo.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Circulo.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    @Test
	public void mainTestInput1() {
		String input="1\n";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args= {};
		Circulo.main(args);
		//(expected) output
		String consoleOutput="Introduzca el radio: "+ System.getProperty("line.separator");
		consoleOutput += "Circulo con radio 1.0,"+ System.getProperty("line.separator");
		consoleOutput += " la circunferencia es 6.283185307179586"+ System.getProperty("line.separator");
		consoleOutput += " y el area es 3.141592653589793."+ System.getProperty("line.separator");
		
                
		assertEquals(consoleOutput,out.toString());
	}
    @Test
        public void mainTestInput3() {
		String input="3\n";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args= {};
		Circulo.main(args);
		//(expected) output
		String consoleOutput="Introduzca el radio: "+ System.getProperty("line.separator");
		consoleOutput += "Circulo con radio 3.0,"+ System.getProperty("line.separator");
		consoleOutput += " la circunferencia es 18.84955592153876"+ System.getProperty("line.separator");
		consoleOutput += " y el area es 28.274333882308138."+ System.getProperty("line.separator");
		
                
		assertEquals(consoleOutput,out.toString());
	}
    //Caso de uso r=5    
    @Test
        public void mainTestInput5() {
		String input="5\n";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args= {};
		Circulo.main(args);
		//(expected) output
		String consoleOutput="Introduzca el radio: "+ System.getProperty("line.separator");
		consoleOutput += "Circulo con radio 5.0,"+ System.getProperty("line.separator");
		consoleOutput += " la circunferencia es 31.41592653589793"+ System.getProperty("line.separator");
		consoleOutput += " y el area es 78.53981633974483."+ System.getProperty("line.separator");
		
                
		assertEquals(consoleOutput,out.toString());
	}
        
        
        //Caso de uso r=-1
        @Test
	public void mainTestInput_1() {
		String input="-1\n";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args= {};
		Circulo.main(args);
		//(expected) output
		String consoleOutput="Introduzca el radio: "+ System.getProperty("line.separator");
		consoleOutput += "Circulo con radio 1.0,"+ System.getProperty("line.separator");
		consoleOutput += " la circunferencia es 6.283185307179586"+ System.getProperty("line.separator");
		consoleOutput += " y el area es 3.141592653589793."+ System.getProperty("line.separator");
		
                
		assertEquals(consoleOutput,out.toString());
	}
        //Caso de uso r="abc"
        @Test
	public void mainTestInput_abc() {
		String input="abc\n";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args= {};
		Circulo.main(args);
		//(expected) output
		String consoleOutput="Introduzca el radio: "+ System.getProperty("line.separator");
                consoleOutput +="Escriba un numero, no texto"+ System.getProperty("line.separator");
		
                
		assertEquals(consoleOutput,out.toString());
	}
}
