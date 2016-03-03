package yang.fang.prototype;

import java.util.List;

/**
 * Prototype pattern is one of the Creational Design pattern, so it provides a
 * mechanism of object creation. Prototype pattern is used when the Object
 * creation is a costly affair and requires a lot of time and resources and you
 * have a similar object already existing. So this pattern provides a mechanism
 * to copy the original object to a new object and then modify it according to
 * our needs. This pattern uses java cloning to copy the object. It would be
 * easy to understand this pattern with an example, suppose we have an Object
 * that loads data from database. Now we need to modify this data in our program
 * multiple times, so it’s not a good idea to create the Object using new
 * keyword and load all the data again from database. So the better approach is
 * to clone the existing object into a new object and then do the data
 * manipulation.
 * 
 * @ClassName: Main
 * @Description: TODO
 * @author YangFang
 * @date 2016年3月3日 下午3:28:17
 * 
 */
public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {

		Employees emps = new Employees();
		emps.loadData();

		// Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("John");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Pankaj");
		System.out.println("emps List: " + emps.getEmpList());
		System.out.println("empsNew List: " + list);
		System.out.println("empsNew1 List: " + list1);
	}
}
