package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;

    public Employee(int id, String firstname, String lastname, int salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }
    public int getId() {

        return id;
    }
    public String getFirstName() {

        return firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public int getSalary() {

        return salary;
    }
    public String getName(){
        return firstname + " " + lastname;
    }
    public int getAnnualSalary(){
        return salary * 12;
    }
    public void setSalary(int salary) {

        this.salary = salary;
    }
    public int raiseSalary(int percent) {
        salary += salary * percent / 100;
        return salary;
    }
    public String toString(){
        return "Employee[id=" + id + ",name= " + getName() + ",salary= " + salary + "]";
    }
}
