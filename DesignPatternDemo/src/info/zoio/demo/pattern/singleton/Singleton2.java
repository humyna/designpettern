/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: Singleton2.java
* @Package info.zoio.demo.pattern.singleton.demo
* @Description: TODO
*
* @author humyna
* @date 2 Jan 2015 17:24:21
* @version V1.0
*/
package info.zoio.demo.pattern.singleton;

/**
 *
 * 类名: Singleton2 <br/>
 * 用途: 急切实例化. <br/>
 *
 * @author humyna <br/>
 * 2 Jan 2015 17:24:21
 */
public class Singleton2 {
	private static Singleton2 singleton = new Singleton2();

	private Singleton2(){}

	public static Singleton2 getInstance(){
		return singleton;
	}
}
