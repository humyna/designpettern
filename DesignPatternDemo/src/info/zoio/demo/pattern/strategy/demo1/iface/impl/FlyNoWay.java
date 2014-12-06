/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: FlyNoWay.java
* @Package info.zoio.demo.pattern.strategy.demo1
* @Description: TODO
*
* @author humyna
* @date 6 Dec 2014 14:54:52
* @version V1.0
*/
package info.zoio.demo.pattern.strategy.demo1.iface.impl;

import info.zoio.demo.pattern.strategy.demo1.iface.FlyBehavior;

/**
 *
 * 类名: FlyNoWay <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 6 Dec 2014 14:54:52
 */
public class FlyNoWay implements FlyBehavior {

	public FlyNoWay() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see info.zoio.demo.pattern.strategy.demo1.FlyBehavior#fly()
	 */
	@Override
	public void fly() {
		System.out.println("I cant't fly!");
	}

}
