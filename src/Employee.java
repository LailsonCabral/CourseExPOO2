public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public Employee() {
    }

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public double NetSalary(){
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage){
        this.grossSalary += grossSalary * (percentage/100);
    }

    public String toString(){
        return "Employee: " + name + ", " + String.format("%.2f", NetSalary());
    }
}
