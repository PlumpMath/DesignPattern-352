package yang.fang.proxy;

/**
 * 代理类用来控制权限或者为了更好的体验提供一个包装的实现，Java的RMI用的这个模式
 * 
 * @ClassName: Main
 * @Description: TODO
 * @author YangFang
 * @date 2016年3月7日 上午9:48:37
 * 
 */
public class Main {

	public static void main(String[] args) {
		CommandExecutor exec = new CommandExecutorProxy("admin", "admin");
		try {
			exec.runCommand("ls -l");
			exec.runCommand("rm -rf a.txt");
		} catch (Exception e) {
			System.out.println("Exception message:" + e.getMessage());
		}
	}

}
