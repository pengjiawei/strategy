package JDKObserver;

import java.util.Observable;

/**
 * @author 彭家玮
 * @version V1.0
 * @className SubjectFor3D
 * @description //TODO 描述这个类的作用
 * @date 2017/5/5
 */
public class SubjectFor3D extends Observable{
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers();
    }
}
