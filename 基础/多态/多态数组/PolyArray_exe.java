package etu.Poly.PolyArray;

public class PolyArray_exe {
    //要求：创建一个Person对象，2个student对象和2个Teacher对象，统一放在数组中，并调用say方法
    //要求2：调用Student中特有方法study和Teacher中特有方法teach
    public static void main(String[] args) {
        Person[] per = new Person[5];
        per[0] = new Person("dsds",25);
        per[1] = new Student("dsdsdf",24, 75);
        per[2] = new Student("dsdsgh",23, 42);
        per[3] = new Teacher("dsdnm,s",25, 257);
        per[4] = new Teacher("dsdmn,.s",21, 527);

        //循环遍历多态数组，调用say
        for (int i = 0; i < per.length; i++){
            //per[i]编译类型是Person，运行类型是：根据实际情况由JVM来判断
            System.out.println(per[i].say());//动态绑定机制
            /*无法直接调用teach和study方法，因为运行类型是Person，是父类，这两个方法都在子类，因此无法调用
            per[i].teach();
            per[i].study();
            */
            //解决方案：
            if (per[i] instanceof Student){
                //向下转型
                Student student = (Student) per[i];
                student.study();
                //也可以((Student) per[i]).study();
            }
            else if (per[i] instanceof Teacher){
                ((Teacher) per[i]).teach();
            }
            else if(per[i] instanceof Person){
            }
            else{
                System.out.println("类型有误");
            }
        }
    }
}
