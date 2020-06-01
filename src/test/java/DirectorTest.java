import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){
        director = new Director("Melinda", "EF 12 34 56 G", 50000.00,
                "Management", 100000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Melinda", director.getName());
    }

    @Test
    public void canGetNationalInsuranceNumber(){
        assertEquals("EF 12 34 56 G", director.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(50000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canIncreaseSalary(){
        director.raiseSalary(10000.00);
        assertEquals(60000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canIncreaseSalaryFailWhenNegative(){
        director.raiseSalary(-10000.00);
        assertEquals(50000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(1000.00, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(100000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canSetName(){
        director.setName("Joe");
        assertEquals("Joe", director.getName());
    }

    @Test
    public void canSetNameFailWhenNull(){
        director.setName(null);
        assertEquals("Melinda", director.getName());
    }

}
