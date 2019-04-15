public class ThrowTest {
//当程序运行时数据出现错误或者我们不希望发生的情况出现的话，
//可以通过抛出异常来处理。
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = null;
        //当a或者b为null时，抛出异常
        if (a == null || b == null) {
            throw new NullPointerException();
        } else {
            System.out.println(a + b);
        }
    }
}