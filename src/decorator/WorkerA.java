package decorator;

/**
 * @author 彭家玮
 * @version V1.0
 * @className WorkerA
 * @description //TODO 描述这个类的作用
 * @date 2017/4/24
 */
public class WorkerA implements Work {
    @Override
    public void doWork() {
        System.out.println("i am Worker A ,i can play basketball");
    }
}
