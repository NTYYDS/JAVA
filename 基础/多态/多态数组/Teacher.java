package etu.Poly.PolyArray;

public class Teacher extends Person{//子类
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void teach(){
        System.out.println("Teacher" + getName() + "正在上课");
    }

    @Override
    public String say() {
        return super.say() + " salary " + salary;
    }
}
