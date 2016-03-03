package yang.fang.singleton;

/**
 * Prior to Java 5, java memory model had a lot of issues and above approaches
 * used to fail in certain scenarios where too many threads try to get the
 * instance of the Singleton class simultaneously. So Bill Pugh came up with a
 * different approach to create the Singleton class using an inner static helper
 * class.
 * 
 * @ClassName: E_BillPughSingleton
 * @Description: TODO
 * @author YangFang
 * @date 2016年3月3日 上午10:42:37
 * 
 */
public class E_BillPughSingleton {

	private E_BillPughSingleton() {
	}

	private static class E_BillPughSingletonHelper {
		private static E_BillPughSingleton instance = new E_BillPughSingleton();
	}

	public static E_BillPughSingleton getIntance() {
		return E_BillPughSingletonHelper.instance;
	}
}
/**
 * Notice the private inner static class that contains the instance of the
 * singleton class. When the singleton class is loaded, SingletonHelper class is
 * not loaded into memory and only when someone calls the getInstance method,
 * this class gets loaded and creates the Singleton class instance.
 */
