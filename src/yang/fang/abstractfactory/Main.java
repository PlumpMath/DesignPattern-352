package yang.fang.abstractfactory;

/**
 * Benefits of Abstract Factory Pattern: ① Abstract Factory pattern provides
 * approach to code for interface rather than implementation. ② Abstract Factory
 * pattern is “factory of factories” and can be easily extended to accommodate
 * more products, for example we can add another sub-class Laptop and a factory
 * LaptopFactory. ③ Abstract Factory pattern is robust and avoid conditional
 * logic of Factory pattern.
 * 
 * 
 * Abstract Factory Pattern Examples in JDK ：
 * javax.xml.parsers.DocumentBuilderFactory#newInstance()
 * javax.xml.transform.TransformerFactory#newInstance()
 * javax.xml.xpath.XPathFactory#newInstance()
 * 
 * @ClassName: Main
 * @Description: TODO
 * @author YangFang
 * @date 2016年3月3日 下午1:05:02
 * 
 */
public class Main {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB",
				"500 GB", "2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory(
				"16 GB", "1 TB", "2.9 GHz"));
		System.out.println("AbstractFactory PC Config::" + pc);
		System.out.println("AbstractFactory Server Config::" + server);
	}

}
