package etu.Poly.PolyParameter;

public class PolyParameter {
    //要求：定义员工类Employee，包含姓名和月工资（private），以及计算年工资getAnnual的方法。经理类多了奖金bonus属性和管理manage方法
    // 普通员工类多了work方法，普通员工和经理类要求分别重写getAnnual方法
    //要求2：测试类中添加一个方法showEmpAnnual（Employee e）
    // 实现获取任何员工对象的年工资，并在main方法中调用该类方法【e.getAnnual（）】
    //测试类种添加一个方法，textWork，如果是普通员工，则调用work方法，如果是manger则调用manage方法
    public static void main(String[] args) {
        Woker woker = new Woker("dsds",10);
        Manager osfdh = new Manager("osfdh", 20, 20);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(osfdh);
        polyParameter.showEmpAnnual(woker);

        polyParameter.textWork(osfdh);
    }
    public void showEmpAnnual(Employee e){
        System.out.println("姓名：" + e.getName() + " 年工资：" + e.getAnnual());
    }
    public void textWork(Employee e){
        if (e instanceof Manager){
            ((Manager) e).manage();
        }
        else if (e instanceof Woker){
            ((Woker) e).work();
        }
        else{
            System.out.println("错误");
        }
    }
}
