package yang.fang.builder;

/**
 * 　建造模式是对象的创建模式:建造模式可以将一个产品的内部表象（internal
 * representation）与产品的生产过程分割开来，从而可以使一个建造过程生成具有不同的内部表象的产品对象。
 * 
 * 
 * 
 * Builder Design Pattern Example in JDK : ① java.lang.StringBuilder#append()
 * (unsynchronized) ② java.lang.StringBuffer#append() (synchronized)
 * 
 * @ClassName: Main
 * @Description: TODO
 * @author YangFang
 * @date 2016年3月3日 下午2:46:08
 * 
 */
public class Main {

	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.construct();
		Product product = builder.retrieveResult();
		System.out.println(product.getPart1());
		System.out.println(product.getPart2());
	}

}
