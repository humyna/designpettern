/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: StarBuzzCoffee.java
* @Package info.zoio.demo.pattern.decorator.demo1
* @Description: TODO
*
* @author humyna
* @date 24 Dec 2014 11:26:47
* @version V1.0
*/
package info.zoio.demo.pattern.decorator.demo1;

import info.zoio.demo.pattern.decorator.demo1.service.BeverageComponent;
import info.zoio.demo.pattern.decorator.demo1.service.impl.EspressoContreteComponent;
import info.zoio.demo.pattern.decorator.demo1.service.impl.HouseBlendContreteComponent;
import info.zoio.demo.pattern.decorator.demo1.service.impl.MochaDecorator;
import info.zoio.demo.pattern.decorator.demo1.service.impl.WhipDecorator;

/**
 *
 * 类名: StarBuzzCoffee <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 24 Dec 2014 11:26:47
 */
public class StarBuzzCoffee {
	public static void main(String[] args) {
		BeverageComponent beverageComponent = new EspressoContreteComponent();
		System.out.println(beverageComponent.getDescription() + " $" + beverageComponent.cost());

		BeverageComponent beverageComponent2 = new HouseBlendContreteComponent();
		beverageComponent2 = new MochaDecorator(beverageComponent2);
		beverageComponent2 = new MochaDecorator(beverageComponent2);
		beverageComponent2 = new WhipDecorator(beverageComponent2);
		System.out.println(beverageComponent2.getDescription() + " $" + beverageComponent2.cost());
	}
}
