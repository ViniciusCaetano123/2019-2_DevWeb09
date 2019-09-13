/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edugu
 */
public class AnimalIT {
    
    public AnimalIT() {
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
     * Test of getIdmestre method, of class Animal.
     */
    @Test
    public void testGetIdmestre() {
        System.out.println("getIdmestre");
        int expResult = 0;
        int result = Animal.getIdmestre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Animal.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Animal instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdcliente method, of class Animal.
     */
    @Test
    public void testGetIdcliente() {
        System.out.println("getIdcliente");
        Animal instance = null;
        int expResult = 0;
        int result = instance.getIdcliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdcliente method, of class Animal.
     */
    @Test
    public void testSetIdcliente() {
        System.out.println("setIdcliente");
        int idcliente = 0;
        Animal instance = null;
        instance.setIdcliente(idcliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Animal.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Animal instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Animal.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Animal instance = null;
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRaca method, of class Animal.
     */
    @Test
    public void testGetRaca() {
        System.out.println("getRaca");
        Animal instance = null;
        String expResult = "";
        String result = instance.getRaca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRaca method, of class Animal.
     */
    @Test
    public void testSetRaca() {
        System.out.println("setRaca");
        String raca = "";
        Animal instance = null;
        instance.setRaca(raca);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSexo method, of class Animal.
     */
    @Test
    public void testGetSexo() {
        System.out.println("getSexo");
        Animal instance = null;
        String expResult = "";
        String result = instance.getSexo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSexo method, of class Animal.
     */
    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        String sexo = "";
        Animal instance = null;
        instance.setSexo(sexo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPorte method, of class Animal.
     */
    @Test
    public void testGetPorte() {
        System.out.println("getPorte");
        Animal instance = null;
        String expResult = "";
        String result = instance.getPorte();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPorte method, of class Animal.
     */
    @Test
    public void testSetPorte() {
        System.out.println("setPorte");
        String porte = "";
        Animal instance = null;
        instance.setPorte(porte);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
