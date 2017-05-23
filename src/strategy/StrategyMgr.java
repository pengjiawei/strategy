package strategy;

/**
 * @author 彭家玮
 * @version V1.0
 * @className StrategyMgr
 * @description //TODO 描述这个类的作用
 * @date 2017/4/24
 */
public class StrategyMgr {
    private Strategy strategy;

    public StrategyMgr(Strategy strategy) {
        this.strategy = strategy;
    }

    public void action(){
        strategy.action();
    }
}
