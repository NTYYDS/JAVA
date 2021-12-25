package etu.Poly.PolyArray;

public class Student extends Person{//子类
    private double note;

    public Student(String name, int age, double note) {
        super(name, age);
        this.note = note;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public void study(){
        System.out.println("Student" + getName() + "正在学习");
    }

    //重写父类say(直接输入say可以快捷Override)
    @Override
    public String say() {
        return super.say() + " note " + note;
    }
}
