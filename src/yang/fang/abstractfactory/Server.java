package yang.fang.abstractfactory;

public class Server extends Computer {

	private String ram;
	private String hdd;
	private String cpu;

	public Server(String ram, String hdd, String cpu) {
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
	}

	@Override
	public String getRAM() {
		return ram;
	}

	@Override
	public String getCPU() {
		return cpu;
	}

	@Override
	public String getHDD() {
		return hdd;
	}

}
