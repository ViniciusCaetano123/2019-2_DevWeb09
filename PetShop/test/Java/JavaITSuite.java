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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author edugu
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Java.FuncionarioIT.class, Java.ConexaoIT.class, Java.MainIT.class, Java.AnimalIT.class, Java.ServicoIT.class, Java.ClienteIT.class, Java.ConsultaIT.class, Java.UsuarioIT.class})
public class JavaITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
