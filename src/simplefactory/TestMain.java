package simplefactory;

import java.io.IOException;
import java.io.Reader;

/**
 * @author 彭家玮
 * @version V1.0
 * @className TestMain
 * @description //TODO 描述这个类的作用
 * @date 2017/4/25
 */
public class TestMain {
    public static void main(String[] args) {
        String read = null;
        char read11 = 0;
        try {
            int read1 = System.in.read();
            read11 = (char) read1;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(read = String.valueOf(read11));
        ProductFactory.getProduct(read).doSomething();
    }
}
