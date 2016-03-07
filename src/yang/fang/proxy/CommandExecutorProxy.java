package yang.fang.proxy;

public class CommandExecutorProxy implements CommandExecutor {

	private boolean isAdmin;
	private CommandExecutor exec;

	public CommandExecutorProxy(String user, String pwd) {
		if ("admin".equals(user) && "admin".equals(pwd)) {
			isAdmin = true;
			exec = new CommandExecutorImpl();
		}
	}

	@Override
	public void runCommand(String cmd) throws Exception {
		if (isAdmin) {
			exec.runCommand(cmd);
		} else {
			if (cmd.trim().startsWith("rm")) {
				throw new Exception(
						"rm command is not allowed for nonadmin users.");
			} else {
				exec.runCommand(cmd);
			}
		}
	}

}
