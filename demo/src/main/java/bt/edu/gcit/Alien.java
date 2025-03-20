package bt.edu.gcit;

public class Alien {
    private int age;
    // private Laptop lap;
    private Computer comp; // for flexibility use type Computer
    private int salary;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        System.out.println("Set Alien called");
        this.age = age;
    }

    // public Laptop getLap(){
    // return lap;
    // }
    // public void setLap(Laptop lap){
    //     this.lap =lap;
    // }

    public void getSalary(){
        System.out.println("Salary is: "+salary);
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public Computer getComp(){
        return comp;
    }

    public void setComp(Computer comp){
        this.comp = comp;
    }

    public Alien(int age, Computer comp, int salary) {
        System.out.println("Alien Object created");
        this.age=age;
        this.comp=comp;
        this.salary = salary;
    }

    public Alien() {
        System.out.println("Alien Object created");
    }
    
    public void code(){
        System.out.println("I am coding");
        comp.compile();
    }
}
