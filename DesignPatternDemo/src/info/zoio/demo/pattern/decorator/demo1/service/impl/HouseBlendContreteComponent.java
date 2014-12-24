/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: HouseBlendContreteComponent.java
* @Package info.zoio.demo.pattern.decorator.demo1.service.impl
* @Description: TODO
*
* @author humyna
* @date 24 Dec 2014 11:21:19
* @version V1.0
*/
package info.zoio.demo.pattern.decorator.demo1.service.impl;

import info.zoio.demo.pattern.decorator.demo1.service.BeverageComponent;

/**
 *
 * 类名: HouseBlendContreteComponent <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 24 Dec 2014 11:21:19
 */
public class HouseBlendContreteComponent extends BeverageComponent {

	public HouseBlendContreteComponent() {
		description = "House Blend Coffee";
	}

	/* (non-Javadoc)
	 * @see info.zoio.demo.pattern.decorator.demo1.service.BeverageComponent#cost()
	 * @return
	 */
	@Override
	public double cost() {
		return 0.89;
	}

}
