/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: Observer.java
* @Package info.zoio.demo.pattern.observer.demo1.iface
* @Description: TODO
*
* @author humyna
* @date 9 Dec 2014 21:51:45
* @version V1.0
*/
package info.zoio.demo.pattern.observer.demo1.iface;

/**
 *
 * 类名: Observer <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 9 Dec 2014 21:51:45
 */
public interface Observer {
	public void update(float temp,float humidity,float pressure);
}
