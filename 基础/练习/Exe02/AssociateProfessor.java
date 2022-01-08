package etu.Exe.Exe02;

public class AssociateProfessor extends Teacher {
    public AssociateProfessor(String name, int age, String post, double salary, double level_salary) {
        super(name, age, post, salary, level_salary);
    }

    @Override
    public void introduce() {
        System.out.println("副教授类");
        super.introduce();
    }
}
