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
package info.zoio.demo.pattern.factory.abstractfactory.demo1.obj;

import java.util.Arrays;

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
	Dough dough;
	Sauce sauce;
	Veggies[] veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clams;

	public abstract void prepare();

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

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * @return
	 */
	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", veggies="
				+ Arrays.toString(veggies) + ", cheese=" + cheese + ", pepperoni=" + pepperoni
				+ ", clams=" + clams + "]";
	}

}
