/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: EspressoContreteComponent.java
* @Package info.zoio.demo.pattern.decorator.demo1.service.impl
* @Description: TODO
*
* @author humyna
* @date 24 Dec 2014 11:19:10
* @version V1.0
*/
package info.zoio.demo.pattern.decorator.demo1.service.impl;

import info.zoio.demo.pattern.decorator.demo1.service.BeverageComponent;

/**
 *
 * 类名: EspressoContreteComponent <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 24 Dec 2014 11:19:10
 */
public class EspressoContreteComponent extends BeverageComponent {

	public EspressoContreteComponent() {
		description = "Espresso";
	}

	/* (non-Javadoc)
	 * @see info.zoio.demo.pattern.decorator.demo1.service.BeverageComponent#cost()
	 * @return
	 */
	@Override
	public double cost() {
		return 1.99;
	}

}
