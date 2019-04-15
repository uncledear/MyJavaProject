/*尽管 Java SE 的 API 已经为我们提供了数十种异常类，
然而在实际的开发过程中，你仍然可能遇到未知的异常情况。
此时，你就需要对异常类进行自定义。

自定义一个异常类非常简单，只需要让它继承 Exception 或其子类就行。
在自定义异常类的时候，建议同时提供无参构造方法和带字符串参数的构造方法，
后者可以为你在调试时提供更加详细的信息。*/
// MyAriException.java
public class MyAriException extends ArithmeticException {
    //自定义异常类，该类继承自ArithmeticException

    public MyAriException() {

    }
    //实现默认的无参构造方法

    public MyAriException(String msg) {
        super(msg);
    }
    //实现可以自定义输出信息的构造方法，将待输出信息作为参数传入即可
}
