/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: Duck.java
* @Package info.zoio.demo.pattern.strategy.demo1
* @Description: TODO
*
* @author humyna
* @date 6 Dec 2014 14:44:05
* @version V1.0
*/
package info.zoio.demo.pattern.strategy.demo1.instance;

import info.zoio.demo.pattern.strategy.demo1.iface.FlyBehavior;
import info.zoio.demo.pattern.strategy.demo1.iface.QuackBehavior;



/**
 *
 * 类名: Duck <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: 所有鸭子子类在同一package中. <br/>
 *
 * @author humyna <br/>
 * 6 Dec 2014 14:44:05
 */
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public abstract void display();

	public Duck() {
	}

	public void performFly(){
		flyBehavior.fly();
	}

	public void performQuack(){
		quackBehavior.quack();
	}

	public void swim(){
		System.out.println("All ducks float,even decoys!d");
	}

	/**
	 * 动态设定飞行行为
	 *
	 * @param flyBehavior the flyBehavior to set
	 */
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	/**
	 * 动态设定发声行为
	 *
	 * @param quackBehavior the quackBehavior to set
	 */
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}


}
