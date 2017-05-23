package JDKObserver;



import java.util.Observable;
import java.util.Observer;

/**
 * @author 彭家玮
 * @version V1.0
 * @className ObserverA
 * @description //TODO 描述这个类的作用
 * @date 2017/5/5
 */
public class ObserverA implements Observer {
    public void registerObserver(Observable observable){
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof SubjectFor3D){
            SubjectFor3D subjectFor3D = (SubjectFor3D) o;
            System.out.println(subjectFor3D.getMsg());
        }
    }
}
