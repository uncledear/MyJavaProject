/*通过上面的异常堆栈轨迹，在对比我们方法的调用过程，
可以得出异常信息中首先打印的是距离抛出异常最近的语句，
接着是调用该方法的方法，一直到最开始被调用的方法。
从下往上看，就可以得出程序运行的轨迹。*/

public class ExceptionStackTrace {
    private static void method1() {
        method2();
    }

    private static void method2() {
        throw new NullPointerException();
    }
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            //打印堆栈轨迹
            e.printStackTrace();
        }
    }
}