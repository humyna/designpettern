/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: PizzaStore.java
* @Package info.zoio.demo.pattern.factory.abstractfactory
* @Description: TODO
*
* @author humyna
* @date 2 Jan 2015 10:45:35
* @version V1.0
*/
package info.zoio.demo.pattern.factory.abstractfactory.demo1;

import info.zoio.demo.pattern.factory.abstractfactory.demo1.obj.Pizza;

/**
 *
 * 类名: PizzaStore <br/>
 * 用途: 工厂方法模式通过让子类决定该创建的对象时什么，来达到将对象创建的过程封装的目的. <br/>
 *	PizzaStore为创建类，Pizza是产品类
 *
 * @author humyna <br/>
 * 2 Jan 2015 10:45:35
 */
public abstract class PizzaStore {
	public final Pizza orderPizza(String type){
		Pizza pizza;

		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	/**
	 *
	 * createPizza:抽象工厂方法用来处理对象的创建，并将这样的行为封装在子类中. <br/>
	 * 客户程序中关于超类的代码和子类创建对象代码解耦了<br/>
	 *
	 * @param type
	 * @return
	 * Pizza
	 * @exception
	 * @author humyna
	 */
	abstract Pizza createPizza(String type);
}
