import java.util.Random;
import java.util.Scanner;

public class RandomTest{
public static void main(String[] args){
    //main方法
    Random random = new Random();
        System.out.println("请输入m:");//输出 提示信息
        Scanner sc = new Scanner(System.in);//得到一个扫描器.用于获取键盘的输入
       String s= sc.nextLine();
        Integer m = Integer.parseInt(s);// 得到输入的1行字符串(名字)
        System.out.println("请输入n:");
        s=sc.nextLine();
        Integer n = Integer.parseInt(s);
        System.out.println("n="+n);
        System.out.println("m="+m);
        if(m>n)
        {     	m=m-n;
                n=n+m;
                m=n-m;
        }
        System.out.println("n="+n);
        System.out.println("m="+m);
        System.out.println("between m and n is: "+(random.nextInt(n-m+1)+m));//输出 打印

}
}