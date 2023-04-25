package Exercicios.OpcionaisMoodle.Aula03.SemArrayList;

public class Department {
    private String name;
    private int code;
    private String location;
    private int phoneExtension;
    private double budget;
    //a titulo de testes criado uma lista de 10 posiçoes p/empregados
    private Employee[] staff = new Employee[10];
    private Employee chief;

    private int checkNextFreeEmployee(){
        for (int i = 0; i < staff.length; i++) {
            if(staff[i] == null){
                return i;
            }
        }
        return 0;
    }

    private void removeElement(int indiceRemover){
        for (int i = indiceRemover; i < staff.length - 1; i++) {
            staff[i] = staff[i+1];
        }

    }


    public String getName() {
        return name;
    }
    public void addEmployee(Employee empregado){
        int j = checkNextFreeEmployee();
        //staff[j] = new Employee();
        staff[j] = empregado;
    }

    public void removeEmployee(Employee empregado){
        int indice = 0;
        for (int i = 0; i < staff.length; i++) {
            if(empregado == staff[i]){
                indice = i;
                break;
            }
        }
        removeElement(indice);
    }
    public void removeEmployee(long id){
        int indice = 0;
        for (int i = 0; i < staff.length; i++) {
            if(id == staff[i].getId()){
                indice = i;
                break;
            }
        }
        removeElement(indice);
    }

    public void listAllEmployees(){
        for (Employee employee : staff) {
            System.out.println(employee.getName());
        }
    }

    public int sizeOfEmployees(){
        int size = 0;
        for (Employee employee : staff) {
            if(employee != null){
                size++;
            }
        }
        return size;
    }

    public Employee getEmployee(long Id){
        for (Employee employee : staff) {
            if (Id == employee.getId()) {
                return employee;
            }
        }
        return null;
    }







}
