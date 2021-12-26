package etu.Poly.PolyParameter;

public class Woker extends Employee{
    public Woker(String name, double salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println("工作方法");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
