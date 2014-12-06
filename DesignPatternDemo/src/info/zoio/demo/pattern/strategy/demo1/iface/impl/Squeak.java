/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: Squeak.java
* @Package info.zoio.demo.pattern.strategy.demo1
* @Description: TODO
*
* @author humyna
* @date 6 Dec 2014 14:57:59
* @version V1.0
*/
package info.zoio.demo.pattern.strategy.demo1.iface.impl;

import info.zoio.demo.pattern.strategy.demo1.iface.QuackBehavior;

/**
 *
 * 类名: Squeak <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 6 Dec 2014 14:57:59
 */
public class Squeak implements QuackBehavior {

	public Squeak() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see info.zoio.demo.pattern.strategy.demo1.QuackBehavior#quack()
	 */
	@Override
	public void quack() {
		System.out.println("Squeak");
	}

}
