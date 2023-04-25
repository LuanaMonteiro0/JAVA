package Exercicios.OpcionaisMoodle.Aula03.SemArrayList;

public class Employee {
    private String name;
    private long id;
    private double salary;
    private String jobTitle;
    private Department dept;
    private Department deptInCharge;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAnnualSalary(){
        return salary * 12;
    }

    public void printState(){
        System.out.println("Nome: " + name + "\n" + "Id: " + id + "\n" +
                "Salario: R$" + salary + "\n" + "Titulação: " + jobTitle + "\n" +
                "Departamento: " + dept.getName());
        if(deptInCharge != null)
            System.out.println("Chefe do departamento: " + deptInCharge.getName());
    }
}
