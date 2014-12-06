/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: FlyRocketPowered.java
* @Package info.zoio.demo.pattern.strategy.demo1.iface
* @Description: TODO
*
* @author humyna
* @date 6 Dec 2014 15:14:19
* @version V1.0
*/
package info.zoio.demo.pattern.strategy.demo1.iface;

/**
 *
 * 类名: FlyRocketPowered <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 6 Dec 2014 15:14:19
 */
public class FlyRocketPowered implements FlyBehavior {

	public FlyRocketPowered() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see info.zoio.demo.pattern.strategy.demo1.iface.FlyBehavior#fly()
	 */
	@Override
	public void fly() {
		System.out.println("i'm flying with a rocket.");
	}

}
