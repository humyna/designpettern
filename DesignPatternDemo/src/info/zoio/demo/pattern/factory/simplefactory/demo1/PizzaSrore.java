/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: PizzaSrore.java
* @Package info.zoio.demo.pattern.factory.simplefactory
* @Description: TODO
*
* @author humyna
* @date 2 Jan 2015 10:29:50
* @version V1.0
*/
package info.zoio.demo.pattern.factory.simplefactory.demo1;

import info.zoio.demo.pattern.factory.simplefactory.demo1.obj.Pizza;

/**
 *
 * 类名: PizzaSrore <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 2 Jan 2015 10:29:50
 */
public class PizzaSrore {
	SimplePizzaFactory factory;

	public PizzaSrore(SimplePizzaFactory factory) {
		super();
		this.factory = factory;
	}

	public Pizza orderPizza(String type){
		Pizza pizza;

		pizza = factory.createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
