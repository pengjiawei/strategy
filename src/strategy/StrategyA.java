package strategy;

/**
 * @author 彭家玮
 * @version V1.0
 * @className StrategyA
 * @description //TODO 描述这个类的作用
 * @date 2017/4/24
 */
public class StrategyA implements Strategy {
    @Override
    public void action() {
        System.out.println("i am in A");
    }
}
