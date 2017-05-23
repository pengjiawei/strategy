package strategy;

/**
 * @author 彭家玮
 * @version V1.0
 * @className TestMain
 * @description //TODO 描述这个类的作用
 * @date 2017/4/24
 */
public class TestMain {
    public static void main(String[] args) {
        Strategy A = new StrategyA();
        new StrategyMgr(A).action();
    }
}
