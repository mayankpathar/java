package lba9;

class Employee {

    int salary = 30000;

    void work() {
        System.out.println("empaloy it copani");
    }

    int getSalary() {
        return salary;
    }
}

class HRMa extends Employee {

    void work() {
        System.out.println("HR Manager is managing employees.");
    }

   
    void addEmployee() {
        System.out.println("HR Manager is adding a new employee.");
    }
}

public class a2 {
    public static void main(String[] args) {

        HRMa hr = new HRMa();

        hr.work();               
        System.out.println("Salary: " + hr.getSalary()); 
        hr.addEmployee();        
    }
}