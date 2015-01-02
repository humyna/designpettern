/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: PizzaIngredientFactory.java
* @Package info.zoio.demo.pattern.factory.abstractfactory.demo1
* @Description: TODO
*
* @author humyna
* @date 2 Jan 2015 12:32:48
* @version V1.0
*/
package info.zoio.demo.pattern.factory.abstractfactory.demo1;

import info.zoio.demo.pattern.factory.abstractfactory.demo1.obj.Cheese;
import info.zoio.demo.pattern.factory.abstractfactory.demo1.obj.Clams;
import info.zoio.demo.pattern.factory.abstractfactory.demo1.obj.Dough;
import info.zoio.demo.pattern.factory.abstractfactory.demo1.obj.Pepperoni;
import info.zoio.demo.pattern.factory.abstractfactory.demo1.obj.Sauce;
import info.zoio.demo.pattern.factory.abstractfactory.demo1.obj.Veggies;

/**
 *
 * 类名: PizzaIngredientFactory <br/>
 * 用途: 抽象工厂模式提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类. <br/>
 *
 * @author humyna <br/>
 * 2 Jan 2015 12:32:48
 */
public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
