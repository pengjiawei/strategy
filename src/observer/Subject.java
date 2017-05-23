package observer;

/**
 * @author 彭家玮
 * @version V1.0
 * @className Subject
 * @description //TODO 定义一个主题用于添加删除通知观察者
 * @date 2017/5/5
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyAllObserver();
}
