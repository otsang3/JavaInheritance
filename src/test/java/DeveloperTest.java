import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Ally", "CD 12 34 56 E", 45000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Ally", developer.getName());
    }

    @Test
    public void canGetNationalInsuranceNumber(){
        assertEquals("CD 12 34 56 E", developer.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(45000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canIncreaseSalary(){
        developer.raiseSalary(5000.00);
        assertEquals(50000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(450.00, developer.payBonus(), 0.01);
    }
}
