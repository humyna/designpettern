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
 * 类名: ChicagoPizzaIngredientFactory <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 2 Jan 2015 12:32:48
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
	@Override
	public Dough createDough(){
		return new Dough();
	}

	@Override
	public Sauce createSauce(){
		return new Sauce();
	}

	@Override
	public Cheese createCheese(){
		return new Cheese();
	}

	@Override
	public Veggies[] createVeggies(){
		Veggies[] veggies = {new Veggies(),new Veggies(),new Veggies()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni(){
		return new Pepperoni();
	}

	@Override
	public Clams createClam(){
		return new Clams();
	}
}
