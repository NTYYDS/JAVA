package etu.Exe.Exe02;

public class Lecturer extends Teacher{
    public Lecturer(String name, int age, String post, double salary, double level_salary) {
        super(name, age, post, salary, level_salary);
    }
    @Override
    public void introduce() {
        System.out.println("讲师");
        super.introduce();
    }
}
