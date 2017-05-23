package decorator;

/**
 * @author 彭家玮
 * @version V1.0
 * @className WorkB
 * @description //TODO 装饰者模式和代理模式（Work work---->WorkerA workerA）
 * @date 2017/4/24
 */
public class WorkerB implements Work {
    //这里存放WorkA用来装饰
    private Work work;

    public WorkerB(Work work) {
        this.work = work;
    }

    @Override
    public void doWork() {
        doPreWork();
        work.doWork();
        doAfterWork();
    }
    private void doPreWork(){
        System.out.println("do pre work");
    }
    private void doAfterWork(){
        System.out.println("do after work");
    }
}
