/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: SoyDecorator.java
* @Package info.zoio.demo.pattern.decorator.demo1.service.impl
* @Description: TODO
*
* @author humyna
* @date 24 Dec 2014 11:25:09
* @version V1.0
*/
package info.zoio.demo.pattern.decorator.demo1.service.impl;

import info.zoio.demo.pattern.decorator.demo1.service.BeverageComponent;
import info.zoio.demo.pattern.decorator.demo1.service.CondimentDecorator;

/**
 *
 * 类名: SoyDecorator <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 24 Dec 2014 11:25:09
 */
public class WhipDecorator extends CondimentDecorator {
	BeverageComponent beverageComponent;

	public WhipDecorator(BeverageComponent beverageComponent) {
		this.beverageComponent = beverageComponent;
	}

	/* (non-Javadoc)
	 * @see info.zoio.demo.pattern.decorator.demo1.service.CondimentDecorator#getDescription()
	 * @return
	 */
	@Override
	public String getDescription() {
		return beverageComponent.getDescription() + ", Whip";
	}

	/* (non-Javadoc)
	 * @see info.zoio.demo.pattern.decorator.demo1.service.BeverageComponent#cost()
	 * @return
	 */
	@Override
	public double cost() {
		return 0.8 + beverageComponent.cost();
	}

}
