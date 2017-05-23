package ModuleMethod;

/**
 * @author 彭家玮
 * @version V1.0
 * @className ITWorker
 * @description //TODO 描述这个类的作用
 * @date 2017/5/5
 */
public class ITWorker extends Worker {
    public ITWorker(String name) {
        super(name);
    }

    @Override
    void doWork() {
        System.out.println(name+"coding and fix bug");
    }
}
