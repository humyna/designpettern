/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: SimplePizzaFactory.java
* @Package info.zoio.demo.pattern.factory.simplefactory
* @Description: TODO
*
* @author humyna
* @date 2 Jan 2015 10:30:18
* @version V1.0
*/
package info.zoio.demo.pattern.factory.simplefactory.demo1;

import info.zoio.demo.pattern.factory.simplefactory.demo1.obj.CheesePizza;
import info.zoio.demo.pattern.factory.simplefactory.demo1.obj.ClamPizza;
import info.zoio.demo.pattern.factory.simplefactory.demo1.obj.PepperoniPizza;
import info.zoio.demo.pattern.factory.simplefactory.demo1.obj.Pizza;
import info.zoio.demo.pattern.factory.simplefactory.demo1.obj.VeggiePizza;

/**
 *
 * 类名: SimplePizzaFactory <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 2 Jan 2015 10:30:18
 */
public class SimplePizzaFactory {
	public Pizza createPizza(String type){
		Pizza pizza = null;

		if("cheese".equals(type)){
			return new CheesePizza();
		}else if("pepperoni".equals(type)){
			return new PepperoniPizza();
		}else if("clam".equals(type)){
			return new ClamPizza();
		}else if("veggie".equals(type)){
			return new VeggiePizza();
		}

		return pizza;
	}
}
