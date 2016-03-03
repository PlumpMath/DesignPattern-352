package yang.fang.factory;

/**
 * Super class in factory pattern can be an interface, abstract class or a
 * normal java class.
 * 
 * @ClassName: Computer
 * @Description: TODO
 * @author YangFang
 * @date 2016年3月3日 上午10:52:52
 * 
 */
public abstract class Computer {

	public abstract String getRAM();

	public abstract String getCPU();

	public abstract String getHDD();

	@Override
	public String toString() {
		return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ",CPU="
				+ this.getCPU();
	}
}
