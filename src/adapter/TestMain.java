package adapter;

/**
 * @author 彭家玮
 * @version V1.0
 * @className TestMain
 * @description //TODO 描述这个类的作用
 * @date 2017/5/5
 */
public class TestMain {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V5power v5power = new V5power();
        mobile.inCharge(v5power);

        V5power v5power1 = new V5powerAdapter(new V220power());
        mobile.inCharge(v5power1);
    }
}
