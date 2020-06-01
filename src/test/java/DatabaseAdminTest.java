import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("Steven", "BC 12 34 56 D", 25000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Steven", databaseAdmin.getName());
    }

    @Test
    public void canGetNationalInsuranceNumber(){
        assertEquals("BC 12 34 56 D", databaseAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canIncreaseSalary(){
        databaseAdmin.raiseSalary(5000.00);
        assertEquals(30000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(250.00, databaseAdmin.payBonus(), 0.01);
    }
}
