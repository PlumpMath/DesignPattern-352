package yang.fang.singleton;

/**
 * To overcome this situation with Reflection, Joshua Bloch suggests the use of
 * Enum to implement Singleton design pattern as Java ensures that any enum
 * value is instantiated only once in a Java program. Since Java Enum values are
 * globally accessible, so is the singleton. The drawback is that the enum type
 * is somewhat inflexible; for example, it does not allow lazy initialization.
 * 
 * @ClassName: F_EnumSingleton
 * @Description: TODO
 * @author YangFang
 * @date 2016年3月3日 上午10:48:58
 * 
 */
public enum F_EnumSingleton {
	INSTANCE;
	public static void doSomething() {
		// do something
	}
}
