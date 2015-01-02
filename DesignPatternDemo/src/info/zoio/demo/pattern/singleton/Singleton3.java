/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: Singleton3.java
* @Package info.zoio.demo.pattern.singleton.demo
* @Description: TODO
*
* @author humyna
* @date 2 Jan 2015 17:26:00
* @version V1.0
*/
package info.zoio.demo.pattern.singleton;

/**
 *
 * 类名: Singleton3 <br/>
 * 用途: 利用双重检查加锁（double-checked locking）,首先检查是否实例已经创建了，如果尚未创建，“才”进行同步，只有第一次会同步. <br/>
 *
 * @author humyna <br/>
 * 2 Jan 2015 17:26:00
 */
public class Singleton3 {
	private volatile static Singleton3 singleton ;//volatile确保当singleton变量被初始化成Singleton实例时，多个线程正确地singleton变量

	private Singleton3(){}

	public static Singleton3 getInSingleton(){//检查实例，如果不存在就进入同步块区
		if(singleton == null){//只有第一次才执行这里的代码
			synchronized (Singleton3.class) {
				if(singleton == null){
					singleton =  new Singleton3();
				}
			}
		}

		return singleton;
	}
}
