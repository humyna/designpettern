/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: CurrentConditionsDisplay.java
* @Package info.zoio.demo.pattern.observer.demo2.iface.impl
* @Description: TODO
*
* @author humyna
* @date 9 Dec 2014 22:49:40
* @version V1.0
*/
package info.zoio.demo.pattern.observer.demo2.iface.impl;

import info.zoio.demo.pattern.observer.demo1.iface.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * 类名: CurrentConditionsDisplay <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 9 Dec 2014 22:49:40
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
	private float temperature;
	private float humidity;
	private Observable weatherData;

	public CurrentConditionsDisplay(Observable weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}


	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 * @param o
	 * @param arg
	 */
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData)o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
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

}
