package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 彭家玮
 * @version V1.0
 * @className SubjectFor3D
 * @description //TODO 描述这个类的作用
 * @date 2017/5/5
 */
public class SubjectFor3D implements Subject {
    private List<Observer> observers = new ArrayList<>();
    String msg;
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observers.indexOf(observer) >=0){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : observers){
            observer.update(msg);
        }
    }

    public void setMsg(String msg){
        this.msg = msg;
        notifyAllObserver();
    }
}
