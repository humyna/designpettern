/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: AAVGSimulator.java
* @Package info.zoio.demo.pattern.strategy.demo2
* @Description: TODO
*
* @author humyna
* @date 6 Dec 2014 16:02:16
* @version V1.0
*/
package info.zoio.demo.pattern.strategy.demo2;

import info.zoio.demo.pattern.strategy.demo2.iface.impl.AxeWeapon;
import info.zoio.demo.pattern.strategy.demo2.instance.Character;
import info.zoio.demo.pattern.strategy.demo2.instance.King;

/**
 *
 * 类名: AAVGSimulator <br/>
 * 用途: 动作冒险游戏模拟器. <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 6 Dec 2014 16:02:16
 */
public class AAVGSimulator {

	public AAVGSimulator() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * main:动作冒险游戏. <br/>
	 * @param args
	 * void
	 * @exception
	 * @author humyna
	 */
	public static void main(String[] args) {
		Character character = new King();
		character.fight();

		character.setWeaponBehavior(new AxeWeapon());
		character.fight();

	}

}
