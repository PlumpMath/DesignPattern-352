package yang.fang.composite;

import java.awt.Component;

/**
 * 组合模式使用的场景：1.对象组的行为一致； 2.结构像树一样的；
 * 
 * {@link java.awt.Container#add(Component)})
 * 
 * @ClassName: Main
 * @Description: TODO
 * @author YangFang
 * @date 2016年3月7日 上午9:25:54
 * 
 */
public class Main {

	public static void main(String[] args) {
		Shape s = new Triangle();
		Shape s1 = new Triangle();
		Shape s2 = new Circle();

		Drawing d = new Drawing();
		d.add(s);
		d.add(s1);
		d.add(s2);
		d.draw("red");

	}

}
