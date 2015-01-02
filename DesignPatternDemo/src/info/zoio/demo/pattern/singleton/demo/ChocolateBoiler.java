/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: ChocolateBoiler.java
* @Package info.zoio.demo.pattern.singleton.demo
* @Description: TODO
*
* @author humyna
* @date 2 Jan 2015 17:34:13
* @version V1.0
*/
package info.zoio.demo.pattern.singleton.demo;

/**
 *
 * 类名: ChocolateBoiler <br/>
 * 用途: 单例模式-巧克力锅炉控制程序. <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 2 Jan 2015 17:34:13
 */
public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;

	private static ChocolateBoiler instance;

	private ChocolateBoiler(){
		empty = true;
		boiled = false;
	}

	public static synchronized ChocolateBoiler getInstance(){
		if(instance == null){
			instance = new ChocolateBoiler();
		}

		return instance;
	}

	public void fill(){
		if(isEmpty()){
			empty = false;
			boiled = false;

			//TODO 填充巧克力和牛奶
		}
	}

	public void drain(){
		if(!isEmpty() && isBoilded()){
			//TODO 排出煮沸的巧克力
			empty = true;
		}
	}

	public void boil(){
		if(!isEmpty() && !isBoilded()){
			//TODO 将炉内物煮沸
			boiled = true;
		}
	}

	public boolean isEmpty(){
		return empty;
	}

	public boolean isBoilded(){
		return boiled;
	}
}
