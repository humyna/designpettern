/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: Character.java
* @Package info.zoio.demo.pattern.strategy.demo2.instance
* @Description: TODO
*
* @author humyna
* @date 6 Dec 2014 15:49:49
* @version V1.0
*/
package info.zoio.demo.pattern.strategy.demo2.instance;

import info.zoio.demo.pattern.strategy.demo2.iface.WeaponBehavior;

/**
 *
 * 类名: Character <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 6 Dec 2014 15:49:49
 */
public abstract class Character {
	WeaponBehavior weaponBehavior;

	public Character() {
		// TODO Auto-generated constructor stub
	}

	public abstract void fight();

	/**
	 * @param weaponBehavior the weaponBehavior to set
	 */
	public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}


}
