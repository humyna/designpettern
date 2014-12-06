/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: BowAndArrowBehavior.java
* @Package info.zoio.demo.pattern.strategy.demo2.iface.impl
* @Description: TODO
*
* @author humyna
* @date 6 Dec 2014 15:48:25
* @version V1.0
*/
package info.zoio.demo.pattern.strategy.demo2.iface.impl;

import info.zoio.demo.pattern.strategy.demo2.iface.WeaponBehavior;

/**
 *
 * 类名: BowAndArrowBehavior <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 6 Dec 2014 15:48:25
 */
public class BowAndArrowBehavior implements WeaponBehavior {

	public BowAndArrowBehavior() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see info.zoio.demo.pattern.strategy.demo2.iface.WeaponBehavior#useWeapon()
	 */
	@Override
	public void useWeapon() {
		// TODO Auto-generated method stub
		System.out.println("user bow and arrow");
	}

}
