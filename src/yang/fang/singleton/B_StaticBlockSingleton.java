package yang.fang.singleton;

/**
 * Static block initialization implementation is similar to eager
 * initialization, except that instance of class is created in the static block
 * that provides option for exception handling.
 * 
 * @ClassName: StaticBlockSingleton
 * @Description: TODO
 * @author YangFang
 * @date 2016年3月3日 上午10:30:00
 * 
 */
public class B_StaticBlockSingleton {
	private static B_StaticBlockSingleton sbs;

	static {
		try {
			sbs = new B_StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException(
					"Exception occured in creating singleton instance");
		}
	}

	public static B_StaticBlockSingleton getInstance() {
		return sbs;
	}
}
