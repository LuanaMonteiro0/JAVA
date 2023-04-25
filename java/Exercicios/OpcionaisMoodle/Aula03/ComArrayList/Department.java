package Exercicios.OpcionaisMoodle.Aula03.ComArrayList;

import java.util.ArrayList;

public class Department {
    private final String Name;
    private final int Code;
    private String Location;
    private final int phoneExtention;
    private double budget;
    private Employee chief;
    private ArrayList<Employee> staff = new ArrayList<Employee>();

    public String getDeptName(){
        return Name;
    }
    //construtor cadastra dpto sem funcionarios
    public Department(String name, int Code, String Location, int phoneExtention, double budget, Employee chief){
        this.Name = name;
        this.Code = Code;
        this.Location = Location;
        this.phoneExtention = phoneExtention;
        this.budget = budget;
        this.chief = chief;
        staff.add(chief); //adiciona o chefe como empregado
    }
    //construtor que cadastra dpto com mais funcionarios
    public Department(String name, int Code, String Location, int phoneExtention, double budget, Employee chief, ArrayList<Employee> Employees){
        this.Name = name;
        this.Code = Code;
        this.Location = Location;
        this.phoneExtention = phoneExtention;
        this.budget = budget;
        this.chief = chief;
        staff.add(chief); //adiciona o chefe como empregado
        staff.addAll(Employees);
    }

    public void addEmployee(Employee employe){
        staff.add(employe);
    }

    public void removeEmployee(Employee employe){
        staff.removeIf(employee -> employee == employe);
    }
    public void removeEmployee(Long id){
        staff.removeIf(employee -> employee.getId() == id);
    }

    public void listAllEmployees(){
        for (Employee employee : staff) {
            System.out.println(employee);
        }
    }

    public int sizeOfEmployees(){
        return staff.size();
    }

    public Employee getEmployee(Long id){
        for (Employee employee : staff) {
            if(employee.getId() == id){
                return employee;
            }
        }
        return null;
    }
}
