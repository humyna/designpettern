/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: MallardDuck.java
* @Package info.zoio.demo.pattern.strategy.demo1
* @Description: TODO
*
* @author humyna
* @date 6 Dec 2014 15:00:04
* @version V1.0
*/
package info.zoio.demo.pattern.strategy.demo1.instance;

import info.zoio.demo.pattern.strategy.demo1.iface.impl.FlyWithWings;
import info.zoio.demo.pattern.strategy.demo1.iface.impl.Quack;

/**
 *
 * 类名: MallardDuck <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 6 Dec 2014 15:00:04
 */
public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior =  new Quack();
	}

	/* (non-Javadoc)
	 * @see info.zoio.demo.pattern.strategy.demo1.Duck#display()
	 */
	@Override
	public void display() {
		System.out.println("i'm a real Mallard Duck.");
	}

}
