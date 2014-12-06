/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: Knight.java
* @Package info.zoio.demo.pattern.strategy.demo2.instance
* @Description: TODO
*
* @author humyna
* @date 6 Dec 2014 15:57:06
* @version V1.0
*/
package info.zoio.demo.pattern.strategy.demo2.instance;

import info.zoio.demo.pattern.strategy.demo2.iface.impl.BowAndArrowBehavior;

/**
 *
 * 类名: Knight <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 6 Dec 2014 15:57:06
 */
public class Knight extends Character {

	public Knight() {
		weaponBehavior = new BowAndArrowBehavior();
	}

	/* (non-Javadoc)
	 * @see info.zoio.demo.pattern.strategy.demo2.instance.Character#fight()
	 */
	@Override
	public void fight() {
		weaponBehavior.useWeapon();
	}

}
