package staff;

public class Employee {

    private String name;
    private String nationalInsuranceNumber;
    private double salary;

    public Employee(String name, String nationalInsuranceNumber, double salary){
        this.name = name;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double salaryIncrease){
        if (salaryIncrease > 0){
            this.salary += salaryIncrease;
        }
    }

    public double payBonus(){
        return (this.salary / 100);
    }

    public void setName(String name){
        if (name != null){
            this.name = name;
        }
    }
}
