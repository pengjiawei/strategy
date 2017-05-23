package observer;

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
        Observer observer = new ObserverA(subjectFor3D);
        subjectFor3D.setMsg("3D ticket");
    }
}
