/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import java.util.Date;
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
public class FuncionarioIT {
    
    public FuncionarioIT() {
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
     * Test of isHabilitado method, of class Funcionario.
     */
    @Test
    public void testIsHabilitado() {
        System.out.println("isHabilitado");
        Funcionario instance = null;
        boolean expResult = false;
        boolean result = instance.isHabilitado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHabilitado method, of class Funcionario.
     */
    @Test
    public void testSetHabilitado() {
        System.out.println("setHabilitado");
        boolean habilitado = false;
        Funcionario instance = null;
        instance.setHabilitado(habilitado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRg method, of class Funcionario.
     */
    @Test
    public void testGetRg() {
        System.out.println("getRg");
        Funcionario instance = null;
        int expResult = 0;
        int result = instance.getRg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdmestre method, of class Funcionario.
     */
    @Test
    public void testGetIdmestre() {
        System.out.println("getIdmestre");
        int expResult = 0;
        int result = Funcionario.getIdmestre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Funcionario.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Funcionario instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRg method, of class Funcionario.
     */
    @Test
    public void testSetRg() {
        System.out.println("setRg");
        int rg = 0;
        Funcionario instance = null;
        instance.setRg(rg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCpf method, of class Funcionario.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        Funcionario instance = null;
        int expResult = 0;
        int result = instance.getCpf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCpf method, of class Funcionario.
     */
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        int cpf = 0;
        Funcionario instance = null;
        instance.setCpf(cpf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroendereco method, of class Funcionario.
     */
    @Test
    public void testGetNumeroendereco() {
        System.out.println("getNumeroendereco");
        Funcionario instance = null;
        int expResult = 0;
        int result = instance.getNumeroendereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroendereco method, of class Funcionario.
     */
    @Test
    public void testSetNumeroendereco() {
        System.out.println("setNumeroendereco");
        int numeroendereco = 0;
        Funcionario instance = null;
        instance.setNumeroendereco(numeroendereco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCep method, of class Funcionario.
     */
    @Test
    public void testGetCep() {
        System.out.println("getCep");
        Funcionario instance = null;
        int expResult = 0;
        int result = instance.getCep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCep method, of class Funcionario.
     */
    @Test
    public void testSetCep() {
        System.out.println("setCep");
        int cep = 0;
        Funcionario instance = null;
        instance.setCep(cep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone method, of class Funcionario.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        Funcionario instance = null;
        int expResult = 0;
        int result = instance.getTelefone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefone method, of class Funcionario.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        int telefone = 0;
        Funcionario instance = null;
        instance.setTelefone(telefone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNascimento method, of class Funcionario.
     */
    @Test
    public void testGetNascimento() {
        System.out.println("getNascimento");
        Funcionario instance = null;
        Date expResult = null;
        Date result = instance.getNascimento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNascimento method, of class Funcionario.
     */
    @Test
    public void testSetNascimento() {
        System.out.println("setNascimento");
        Date nascimento = null;
        Funcionario instance = null;
        instance.setNascimento(nascimento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNacionalidade method, of class Funcionario.
     */
    @Test
    public void testGetNacionalidade() {
        System.out.println("getNacionalidade");
        Funcionario instance = null;
        String expResult = "";
        String result = instance.getNacionalidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNacionalidade method, of class Funcionario.
     */
    @Test
    public void testSetNacionalidade() {
        System.out.println("setNacionalidade");
        String nacionalidade = "";
        Funcionario instance = null;
        instance.setNacionalidade(nacionalidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUf method, of class Funcionario.
     */
    @Test
    public void testGetUf() {
        System.out.println("getUf");
        Funcionario instance = null;
        String expResult = "";
        String result = instance.getUf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUf method, of class Funcionario.
     */
    @Test
    public void testSetUf() {
        System.out.println("setUf");
        String uf = "";
        Funcionario instance = null;
        instance.setUf(uf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Funcionario.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Funcionario instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Funcionario.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Funcionario instance = null;
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSexo method, of class Funcionario.
     */
    @Test
    public void testGetSexo() {
        System.out.println("getSexo");
        Funcionario instance = null;
        String expResult = "";
        String result = instance.getSexo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSexo method, of class Funcionario.
     */
    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        String sexo = "";
        Funcionario instance = null;
        instance.setSexo(sexo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadocivil method, of class Funcionario.
     */
    @Test
    public void testGetEstadocivil() {
        System.out.println("getEstadocivil");
        Funcionario instance = null;
        String expResult = "";
        String result = instance.getEstadocivil();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstadocivil method, of class Funcionario.
     */
    @Test
    public void testSetEstadocivil() {
        System.out.println("setEstadocivil");
        String estadocivil = "";
        Funcionario instance = null;
        instance.setEstadocivil(estadocivil);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRua method, of class Funcionario.
     */
    @Test
    public void testGetRua() {
        System.out.println("getRua");
        Funcionario instance = null;
        String expResult = "";
        String result = instance.getRua();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRua method, of class Funcionario.
     */
    @Test
    public void testSetRua() {
        System.out.println("setRua");
        String rua = "";
        Funcionario instance = null;
        instance.setRua(rua);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComplemento method, of class Funcionario.
     */
    @Test
    public void testGetComplemento() {
        System.out.println("getComplemento");
        Funcionario instance = null;
        String expResult = "";
        String result = instance.getComplemento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComplemento method, of class Funcionario.
     */
    @Test
    public void testSetComplemento() {
        System.out.println("setComplemento");
        String complemento = "";
        Funcionario instance = null;
        instance.setComplemento(complemento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMunicipio method, of class Funcionario.
     */
    @Test
    public void testGetMunicipio() {
        System.out.println("getMunicipio");
        Funcionario instance = null;
        String expResult = "";
        String result = instance.getMunicipio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMunicipio method, of class Funcionario.
     */
    @Test
    public void testSetMunicipio() {
        System.out.println("setMunicipio");
        String municipio = "";
        Funcionario instance = null;
        instance.setMunicipio(municipio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBairro method, of class Funcionario.
     */
    @Test
    public void testGetBairro() {
        System.out.println("getBairro");
        Funcionario instance = null;
        String expResult = "";
        String result = instance.getBairro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBairro method, of class Funcionario.
     */
    @Test
    public void testSetBairro() {
        System.out.println("setBairro");
        String bairro = "";
        Funcionario instance = null;
        instance.setBairro(bairro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Funcionario.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Funcionario instance = null;
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Funcionario.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Funcionario instance = null;
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
