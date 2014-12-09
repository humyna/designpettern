/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: CurrentConditionsDisplay.java
* @Package info.zoio.demo.pattern.observer.demo1.iface.impl
* @Description: TODO
*
* @author humyna
* @date 9 Dec 2014 22:08:29
* @version V1.0
*/
package info.zoio.demo.pattern.observer.demo1.iface.impl;

import info.zoio.demo.pattern.observer.demo1.iface.DisplayElement;
import info.zoio.demo.pattern.observer.demo1.iface.Observer;
import info.zoio.demo.pattern.observer.demo1.iface.Subject;

/**
 *
 * 类名: CurrentConditionsDisplay <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 9 Dec 2014 22:08:29
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	/* (non-Javadoc)
	 * @see info.zoio.demo.pattern.observer.demo1.iface.DisplayElement#display()
	 */
	@Override
	public void display() {
		System.out.println("current conditions: "
				+ temperature +"F temperature and "
				+ humidity + "% humidity" );
	}

	/* (non-Javadoc)
	 * @see info.zoio.demo.pattern.observer.demo1.iface.Observer#update(float, float, float)
	 * @param temp
	 * @param humidity
	 * @param pressure
	 */
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity ;
		display();
	}

}
