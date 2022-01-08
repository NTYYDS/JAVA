package etu.Exe.Exe02;

public class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;
    private double Level_salary;

    public Teacher(String name, int age, String post, double salary, double level_salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        Level_salary = level_salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getLevel_salary() {
        return Level_salary;
    }

    public void setLevel_salary(double level_salary) {
        Level_salary = level_salary;
    }

    public void introduce(){
        String str = "name = " + getName() + " age = " + getAge() + " post = " + getPost() +
                     " salary = " + getSalary() + " Level_salary = " + getLevel_salary();
        System.out.println(str);
    }
}
