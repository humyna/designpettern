/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: MiniDuckSimulator.java
* @Package info.zoio.demo.pattern.strategy.demo1
* @Description: TODO
*
* @author humyna
* @date 6 Dec 2014 14:58:43
* @version V1.0
*/
package info.zoio.demo.pattern.strategy.demo1;

import info.zoio.demo.pattern.strategy.demo1.iface.FlyRocketPowered;
import info.zoio.demo.pattern.strategy.demo1.instance.Duck;
import info.zoio.demo.pattern.strategy.demo1.instance.MallardDuck;
import info.zoio.demo.pattern.strategy.demo1.instance.ModelDuck;

/**
 *
 * 类名: MiniDuckSimulator <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 6 Dec 2014 14:58:43
 */
public class MiniDuckSimulator {

	/**
	 * main:迷你鸭子模拟器. <br/>
	 * @param args
	 * void
	 * @exception
	 * @author humyna
	 */
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();//委托给行为类
		mallardDuck.performQuack();

		//动态设定行为
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
	}

}
