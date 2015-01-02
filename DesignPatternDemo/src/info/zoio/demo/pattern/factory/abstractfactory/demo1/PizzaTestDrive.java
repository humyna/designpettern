/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: PizzaTestDrive.java
* @Package info.zoio.demo.pattern.factory.abstractfactory.demo1
* @Description: TODO
*
* @author humyna
* @date 2 Jan 2015 12:14:34
* @version V1.0
*/
package info.zoio.demo.pattern.factory.abstractfactory.demo1;

import info.zoio.demo.pattern.factory.abstractfactory.demo1.obj.Pizza;

/**
 *
 * 类名: PizzaTestDrive <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 2 Jan 2015 12:14:34
 */
public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("hu ordered a " + pizza.getName() + "\n");
	}

}
