import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
public class RandomFile {

    public static void main(String[] args) {
        try {
            //inFile 作为输入流的数据文件必须存在，否则抛出异常
            File inFile = new File("/home/project/randomAccess.file");


            RandomAccessFile files = new RandomAccessFile(inFile,"rws");
           files.seek(10);
            String c;
            while((c = files.readLine()) !=null){
                System.out.println(c);
            }
            //打开了文件一定要记着关，释放系统资源
            files.close();
        }catch(FileNotFoundException e) {
            System.out.println("FileStreamsTest:" + e);
        }catch(IOException e){
            System.err.println("FileStreamTest:" + e);
        }
    }
}