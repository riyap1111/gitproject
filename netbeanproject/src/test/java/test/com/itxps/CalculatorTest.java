/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itxps;

import com.mycompany.netbeanproject.Calculator;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author riyap
 */
public class CalculatorTest {
    
    Calculator cal;
    
    public CalculatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        cal = new Calculator();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
  @Test
  public void testAdd(){
      assertEquals(cal.add(2, 3), 5);
  }
  
     
  @Test
  public void testMul(){
      assertEquals(cal.mul(5, 3), 15);
  }
   
}
