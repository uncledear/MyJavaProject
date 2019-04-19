/*
//打开一个以 f 描述的文件作为输入
FileInputStream(File f)

//打开一个文件路径名为 name 的文件作为输入
FileInputStream(String name)

//创建一个以 f 描述的文件作为输出
//如果文件存在，则其内容被清空
FileOutputStream(File f)

//创建一个文件路径名为 name 的文件作为输出
//文件如果已经存在，则其内容被清空
FileOutputStream(String name)

//创建一个文件路径名为 name 的文件作为输出
//文件如果已经存在，则在该输出上输出的内容被接到原有内容之后
FileOutputStream(String name, boolean append)*/
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {

    public static void main(String[] args) {
        try {
            //inFile 作为输入流的数据文件必须存在，否则抛出异常
            File inFile = new File("/home/project/file1.txt");

            //file2.txt没有，系统可以创建
            File outFile = new File("file2.txt");
            FileInputStream fis = new FileInputStream(inFile);
            FileOutputStream fos = new FileOutputStream(outFile);
            int c;
            while((c = fis.read()) != -1){
                fos.write(c);
            }
            //打开了文件一定要记着关，释放系统资源
            fis.close();
            fos.close();
        }catch(FileNotFoundException e) {
            System.out.println("FileStreamsTest:" + e);
        }catch(IOException e){
            System.err.println("FileStreamTest:" + e);
        }
    }
}