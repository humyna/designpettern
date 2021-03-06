/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: CheesePizza.java
* @Package info.zoio.demo.pattern.factory.abstractfactory.demo1.obj
* @Description: TODO
*
* @author humyna
* @date 2 Jan 2015 13:04:02
* @version V1.0
*/
package info.zoio.demo.pattern.factory.abstractfactory.demo1.obj;

import info.zoio.demo.pattern.factory.abstractfactory.demo1.PizzaIngredientFactory;

/**
 *
 * 类名: CheesePizza <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 2 Jan 2015 13:04:02
 */
public class ClamPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		super();
		this.ingredientFactory = ingredientFactory;
	}

	/* (non-Javadoc)
	 * @see info.zoio.demo.pattern.factory.abstractfactory.demo1.obj.Pizza#prepare()
	 */
	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clams = ingredientFactory.createClam();
	}

}
