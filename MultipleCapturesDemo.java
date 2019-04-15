import java.io.FileInputStream;
import java.io.FileNotFoundException;
/*在处理异常时，并不要求抛出的异常同 catch 所声明的异常完全匹配，
子类的对象也可以匹配父类的处理程序。比如异常 A 继承于异常 B，
那么在处理多个异常时，一定要将异常 A 放在异常 B 之前捕获，
如果将异常 B 放在异常 A 之前，那么将永远匹配到异常 B，
异常 A 将永远不可能执行，并且编译器将会报错。*/
public class MultipleCapturesDemo {
    public static void main(String[] args) {
        try {
            new FileInputStream("");
        } catch (FileNotFoundException e) {
            System.out.println("IO 异常");
        } catch (Exception e) {
            System.out.println("发生异常");
        }
    }
}
