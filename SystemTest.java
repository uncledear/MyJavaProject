import java.util.Arrays;
public class SystemTest {
    public static void main(String[] args) {
        int[] a = {7, 8, 9, 10, 11};
        int[] b = {1, 2, 3, 4, 5, 6};
        //从数组a的第二个元素开始，复制到b数组的第三个位置 复制的元素长度为3
        System.arraycopy(a, 1, b, 2, 3);
        System.out.println(Arrays.toString(b));

        System.out.println("java的安装目录：" + System.getProperty("java.home"));
        //运行垃圾收集器
        //退出
        System.exit(0);
    }
}
