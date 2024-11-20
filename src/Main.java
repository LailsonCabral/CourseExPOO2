import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee funcionario = new Employee();
        System.out.print("Name: ");
        funcionario.name = sc.nextLine();
        System.out.print("Gross salary: ");
        funcionario.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        funcionario.tax = sc.nextDouble();
        System.out.println(funcionario.toString());
        System.out.print("Which percentage to increase salary? ");
        funcionario.IncreaseSalary(sc.nextDouble());
        System.out.println(funcionario.toString());
    }
}