package yang.fang.singleton;

/**
 * If your singleton class is not using a lot of resources, this is the approach
 * to use. But in most of the scenarios, Singleton classes are created for
 * resources such as File System, Database connections etc and we should avoid
 * the instantiation until unless client calls the getInstance method. Also this
 * method doesn’t provide any options for exception handling.
 * 如果该类不占用很多资源，这个方法就可以用，但是在大部分情况下，单例类用在文件系统、数据库连接等（下面方法不提供任何的异常处理）
 * 
 * @ClassName: SingletonTest
 * @Description: TODO
 * @author YangFang
 * @date 2016年3月3日 上午10:21:22
 * 
 */
public class A_EagerInitializedSingleton {
	private static A_EagerInitializedSingleton s = new A_EagerInitializedSingleton();

	private A_EagerInitializedSingleton() {

	}

	public static A_EagerInitializedSingleton getInstance() {
		return s;
	}
}
