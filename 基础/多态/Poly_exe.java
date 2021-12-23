package etu.Poly_exe;

public class Poly_exe {
    public static void main(String[] args) {
        //s的编译类型是Sub， 运行类型也是Sub
        Sub s = new Sub();
        //由于属性是根据编译类型来定，s.count的编译类型为Sub，所以s.count在Sub类中查看
        System.out.println(s.count);
        //由于调用方法是根据运行类型来定，s.display()的运行类型为Sub，所以s.display()方法在Sub类中查看
        s.display();
        //b的编译类型是class_base，运行类型是Sub, 在这b = s是让s的地址传给b
        class_base b = s;
        //在这比较的是地址，因此输出true
        System.out.println(b == s);
        //由于属性是根据编译类型来定，b.count的编译类型为class_base，所以b.count在class_base类中查看
        System.out.println(b.count);
        //由于调用方法是根据运行类型来定，b.display()的运行类型为Sub，所以b.display()方法在Sub类中查看
        b.display();
    }
}
