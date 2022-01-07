package etu.Project.SmallChangeSy;

import java.util.Scanner;

public class Menu {
    boolean loop = true;//循环条件
    //1.完成菜单构建，并可以自行选择及提示
    static Scanner scanner = new Scanner(System.in);
    //创建字符串来接收用户输入（利用字符串是因为如果使用int，用户输入若为字符串会报错）
    String Choice = "";

    public void menu(){
        do {//制作菜单
            System.out.println("\n=============零钱通菜单=============");

            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.消费");
            System.out.println("\t\t\t3.退出");
            System.out.println("请选择1-3");
            Choice = scanner.next();
            switch (Choice) {
                case "1":
                    System.out.println("---------------零钱通明细---------------");
                    System.out.println(Pay.allDetails());
                    break;
                case "2":
                    System.out.println(Pay.payDetails());
                    break;
                case "3":
                    System.out.println("确认要退出吗？y/n");
                    Scanner scanner = new Scanner(System.in);
                    String sc = scanner.next();
                    if(sc.equals("y")){
                        System.out.println("---------------退出---------------");
                        loop = false;
                    }
                    else if (sc.equals("n")){
                        break;
                    }
                    else{
                        System.out.println("输入错误,请重新输入");
                    }
                    break;
                default:
                    System.out.println("输入错误,请重新输入");
            }
        }while(loop);
    }
}
