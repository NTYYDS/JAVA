package etu.Poly.DynamicBinding;

public class DynamicBinding_exe {
    public static void main(String[] args) {
        //编译类型是A，运行类型是B
        A a = new B();
        //在调用a.sum方法时，先从运行类型B开始查找是否有此方法，B类中没找到方法则进入父类A中查找到方法
        //由于返回值中存在getI方法 且在A和B类中都存在此方法，根据动态绑定机制，getI方法也是从运行类型B中开始查找getI方法
        System.out.println(a.sum());//20+10
        //方法调用a.sum1同上，返回是i+10，由于属性不遵循动态绑定机制，直接调用本类下的i
        System.out.println(a.sum1());//10+10
    }
}
