package yang.fang.singleton;

/**
 * Lazy Initialization
 * 
 * @ClassName: SingletonTest
 * @Description: TODO
 * @author YangFang
 * @date 2016年3月3日 上午10:21:22
 * 
 */
public class C_LazyInitializedSingleton {
	private static C_LazyInitializedSingleton s = null;

	private C_LazyInitializedSingleton() {

	}

	public static C_LazyInitializedSingleton getInstance() {
		if (s == null)
			s = new C_LazyInitializedSingleton();
		return s;
	}
}
