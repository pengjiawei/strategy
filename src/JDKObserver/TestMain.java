package JDKObserver;

/**
 * @author 彭家玮
 * @version V1.0
 * @className TestMain
 * @description //TODO 描述这个类的作用
 * @date 2017/5/5
 */
public class TestMain {
    public static void main(String[] args) {
        SubjectFor3D subjectFor3D = new SubjectFor3D();
        ObserverA observerA = new ObserverA();
        observerA.registerObserver(subjectFor3D);
        subjectFor3D.setMsg("ticket3D");
    }
}
