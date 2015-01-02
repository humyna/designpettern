/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: Singleton.java
* @Package info.zoio.demo.pattern.singleton.demo
* @Description: TODO
*
* @author humyna
* @date 2 Jan 2015 17:17:05
* @version V1.0
*/
package info.zoio.demo.pattern.singleton;

/**
 *
 * 类名: Singleton <br/>
 * 用途: 延迟实例化. <br/>
 * 单例模式：确保一个类只有一个实例，并提供一个全局访问点
 *
 * @author humyna <br/>
 * 2 Jan 2015 17:17:05
 */
public class Singleton1 {
	private static Singleton1 singleton;

	private Singleton1(){}

	public static synchronized Singleton1 getInstance(){
		if(singleton == null){
			singleton = new Singleton1();
		}

		return singleton;
	}
}
