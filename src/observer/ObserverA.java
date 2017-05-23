package observer;

/**
 * @author 彭家玮
 * @version V1.0
 * @className ObserverA
 * @description //TODO 描述这个类的作用
 * @date 2017/5/5
 */
public class ObserverA implements Observer {
    private Subject subject;
    public ObserverA(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }
    @Override
    public void update(String msg) {
        System.out.println("i have got the msg = "+msg);
    }
}
