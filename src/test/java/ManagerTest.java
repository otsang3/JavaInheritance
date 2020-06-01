import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Karen", "AB 12 34 56 C", 30000.00, "Complaints");
    }

    @Test
    public void canGetName(){
        assertEquals("Karen", manager.getName());
    }

    @Test
    public void canGetNationalInsuranceNumber(){
        assertEquals("AB 12 34 56 C", manager.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Complaints", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(10000.00);
        assertEquals(40000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(300.00, manager.payBonus(), 0.01);
    }


}
