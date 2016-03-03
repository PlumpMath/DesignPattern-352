package yang.fang.singleton;

/**
 * 
 * @ClassName: D_ThreadSafeSingleton
 * @Description: TODO
 * @author YangFang
 * @date 2016年3月3日 上午10:35:54
 * 
 */
public class D_ThreadSafeSingleton {
	private static D_ThreadSafeSingleton tss;

	private D_ThreadSafeSingleton() {
	}

	public static synchronized D_ThreadSafeSingleton getInstance() {
		if (tss == null)
			tss = new D_ThreadSafeSingleton();
		return tss;
	}

	/**
	 * Above implementation works fine and provides thread-safety but it reduces
	 * the performance because of cost associated with the synchronized method,
	 * although we need it only for the first few threads who might create the
	 * separate instances (Read: Java Synchronization). To avoid this extra
	 * overhead every time, double checked locking principle is used.
	 */
	public static D_ThreadSafeSingleton getInstanceUsingDoubleLocking() {
		if (tss == null) {
			synchronized (D_ThreadSafeSingleton.class) {
				if (tss == null) {
					tss = new D_ThreadSafeSingleton();
				}
			}
		}
		return tss;
	}
}
