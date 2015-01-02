/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: Pizza.java
* @Package info.zoio.demo.pattern.factory.simplefactory.iface
* @Description: TODO
*
* @author humyna
* @date 2 Jan 2015 10:04:07
* @version V1.0
*/
package info.zoio.demo.pattern.factory.factorymethod.demo1.obj;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 类名: Pizza <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 2 Jan 2015 10:04:07
 */
public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	List<String> toppingsList = new ArrayList<String>();

	public void prepare(){
		System.out.println("Preparing" + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings:");

		for (int i = 0; i < toppingsList.size(); i++) {
			System.out.println("	" + toppingsList.get(i));
		}
	}
	public void bake(){
		System.out.println("Bake for 25m at 350");
	}
	public void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	public void box(){
		System.out.println("Place pizza in official PizzaStore box");
	}
	/**
	 * name
	 *
	 * @return  the name
	 */

	public String getName() {
		return name;
	}

}
