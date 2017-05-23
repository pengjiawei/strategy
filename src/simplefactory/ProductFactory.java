package simplefactory;

/**
 * @author 彭家玮
 * @version V1.0
 * @className ProductFactory
 * @description //TODO 描述这个类的作用
 * @date 2017/4/25
 */
public class ProductFactory {
    public static Product getProduct(String type){
        if(type.equalsIgnoreCase("A")){
            return new ProductA();
        }else if(type.equalsIgnoreCase("B")){
            return new ProductB();
        }else{
            return null;
        }
    }
}
