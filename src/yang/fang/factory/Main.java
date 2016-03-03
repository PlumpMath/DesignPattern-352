package yang.fang.factory;

/**
 * Benefits of Factory Pattern :1. Factory pattern provides approach to code for
 * interface rather than implementation. 2. Factory pattern removes the
 * instantiation of actual implementation classes from client code, making it
 * more robust, less coupled and easy to extend. For example, we can easily
 * change PC class implementation because client program is unaware of this. 3.
 * Factory pattern provides abstraction between implementation and client
 * classes through inheritance.
 * 
 * 
 * Factory Pattern Examples in JDK :1. java.util.Calendar, ResourceBundle and
 * NumberFormat getInstance() methods uses Factory pattern. 2. valueOf() method
 * in wrapper classes like Boolean, Integer etc.
 * 
 * 
 * @ClassName: Main
 * @Description: TODO
 * @author YangFang
 * @date 2016年3月3日 上午11:07:27
 * 
 */
public class Main {
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500GB",
				"2.4 GHz");
		Computer server = ComputerFactory.getComputer("server", "16GB", "1 TB",
				"2.9 GHz");
		System.out.println("Factory PC Config::" + pc);
		System.out.println("Factory Server Config::" + server);
	}
}
