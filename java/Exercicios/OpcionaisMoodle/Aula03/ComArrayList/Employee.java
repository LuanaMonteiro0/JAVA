package Exercicios.OpcionaisMoodle.Aula03.ComArrayList;

public class Employee {
    private final String name;
    private final long Id;
    private double salary;
    private String jobTitle;
    private Department dept;
    private Department deptInCharge;

    public long getId() {
        return Id;
    }

    public Employee(String Name, Long id, double Salary, String JobTitle){
        this.name = Name;
        this.Id = id;
        this.salary = Salary;
        this.jobTitle = JobTitle;
    }
    public void atributeDept(Department dept, boolean isInCharge){
        this.dept = dept;
        if(isInCharge)
            this.deptInCharge = dept;
    }

    public void printState(){
        System.out.print("Name: " + name + "\nID: "+ Id + "\nSalary: " + salary +
                "\nJob: " + jobTitle + "\n");
        if(deptInCharge !=  null){
            System.out.println("Is in charge of " + deptInCharge + " department");
        }
        else
            System.out.println("Department: "+ dept);
    }

    public double getAnnualSalary(){
        return (salary*12);
    }
}

