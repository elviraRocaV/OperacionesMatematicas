/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmatematicas;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author PORTATIL
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({operacionesmatematicas.a22Test.class, operacionesmatematicas.OperacionesMatematicasTest.class, operacionesmatematicas.Ecuacion2gTest.class, operacionesmatematicas.CalculadoraTest.class})
public class OperacionesmatematicasSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
