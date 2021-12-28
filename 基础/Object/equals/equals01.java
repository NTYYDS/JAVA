package etu.Object.equals_exe;

public class equals01 {
    //判断两个Person对象的内容是否相等，如果两个Person对象的各个属性值都一样，则返回True，反之false
    public static void main(String[] args) {
        Person p1 = new Person("kjfhds", 87, "nan");
        Person p2 = new Person("kjfhds", 87, "nan");
        System.out.println(p1.equals(p2));
    }
}

class Person{
    //创建属性
    String name;
    int age;
    String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    //方法 利用equals重写
    public boolean equals(Object object){
        //判断如果是同一个对象直接返回true
        if(this == object){//this在这指的是equals左边的调用方法的对象
            return true;
        }
        //类型判断，判断形参是否和Person为同一类型，若否则无需比较
        if (object instanceof Person){
            Person p = (Person) object;//向下转型 不转型的话无法进行比较
            return this.name.equals(p.name) && this.age == p.age && this.sex.equals(p.sex);
        }
        return false;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}