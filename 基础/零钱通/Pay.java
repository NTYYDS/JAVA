package etu.Project.SmallChangeSy;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Pay extends Menu{
    //3.完成出入账 包含内容、时间、金额
    private static double money;
    private static String details;
    private  Date date = null; //date是java.util.Date类型，表示日期
    private static String str = "";

    public static String payDetails(){

        System.out.println("明细");
        details = scanner.next();
        System.out.println("金额");
        money = scanner.nextDouble();
        Date date = new Date();
        SimpleDateFormat spl = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        details = "\nDetail: " + details + "\tTime: " +  spl.format(date) + "\tMoney: " + money;
        str += details;
        return details;
    }

    public static String allDetails(){
        return str;
    }
}
