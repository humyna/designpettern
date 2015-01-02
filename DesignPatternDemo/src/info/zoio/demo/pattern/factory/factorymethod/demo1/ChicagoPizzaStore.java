/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: NYPizzaStore.java
* @Package info.zoio.demo.pattern.factory.abstractfactory
* @Description: TODO
*
* @author humyna
* @date 2 Jan 2015 10:47:41
* @version V1.0
*/
package info.zoio.demo.pattern.factory.factorymethod.demo1;

import info.zoio.demo.pattern.factory.factorymethod.demo1.obj.ChicagoCheesePizza;
import info.zoio.demo.pattern.factory.factorymethod.demo1.obj.ChicagoClamPizza;
import info.zoio.demo.pattern.factory.factorymethod.demo1.obj.ChicagoPepperoniPizza;
import info.zoio.demo.pattern.factory.factorymethod.demo1.obj.ChicagoVeggiePizza;
import info.zoio.demo.pattern.factory.factorymethod.demo1.obj.Pizza;

/**
 *
 * 类名: ChicagoPizzaStore <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 2 Jan 2015 10:47:41
 */
public class ChicagoPizzaStore extends PizzaStore {

	/* (non-Javadoc)
	 * @see info.zoio.demo.pattern.factory.abstractfactory.PizzaStore#createPizza(java.lang.String)
	 * @param pizza
	 * @return
	 */
	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;

		if("cheese".equals(type)){
			pizza = new ChicagoCheesePizza();
		}else if("pepperoni".equals(type)){
			pizza = new ChicagoPepperoniPizza();
		}else if("clam".equals(type)){
			pizza = new ChicagoClamPizza();
		}else if("veggie".equals(type)){
			pizza = new ChicagoVeggiePizza();
		}

		return pizza;
	}

}
