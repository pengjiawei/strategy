package ModuleMethod;

/**
 * @author 彭家玮
 * @version V1.0
 * @className Worker
 * @description //TODO 描述这个类的作用
 * @date 2017/5/5
 */
public abstract class Worker {
    protected String name;

    public Worker(String name) {
        this.name = name;
    }
    public void workDay(){
        enterCompany();
        openComputer();
        doWork();
        closeComputer();
        leaveCompany();
    }

    private void enterCompany(){
        System.out.println(name+"enter company");
    }
    private void openComputer(){
        System.out.println(name+"open computer");
    }
    abstract void doWork();
    private void closeComputer(){
        System.out.println(name+"close computer");
    }
    private void leaveCompany(){
        System.out.println(name+"leaveCompany");
    }

}
