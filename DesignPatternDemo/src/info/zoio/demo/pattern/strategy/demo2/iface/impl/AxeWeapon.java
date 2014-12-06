/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: AxeWeapon.java
* @Package info.zoio.demo.pattern.strategy.demo2.iface.impl
* @Description: TODO
*
* @author humyna
* @date 6 Dec 2014 15:47:36
* @version V1.0
*/
package info.zoio.demo.pattern.strategy.demo2.iface.impl;

import info.zoio.demo.pattern.strategy.demo2.iface.WeaponBehavior;

/**
 *
 * 类名: AxeWeapon <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 6 Dec 2014 15:47:36
 */
public class AxeWeapon implements WeaponBehavior {

	public AxeWeapon() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see info.zoio.demo.pattern.strategy.demo2.iface.WeaponBehavior#useWeapon()
	 */
	@Override
	public void useWeapon() {
		System.out.println("use axe");
	}

}
