/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: WeatherData.java
* @Package info.zoio.demo.pattern.observer.demo2.iface.impl
* @Description: TODO
*
* @author humyna
* @date 9 Dec 2014 22:44:19
* @version V1.0
*/
package info.zoio.demo.pattern.observer.demo2.iface.impl;

import java.util.Observable;

/**
 *
 * 类名: WeatherData <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 9 Dec 2014 22:44:19
 */
public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		super();
	}

	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}

	public void setMeasurementsChanged(float temperature,float humidity,float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;

		measurementsChanged();
	}

	/**
	 * temperature
	 *
	 * @return  the temperature
	 */

	public float getTemperature() {
		return temperature;
	}

	/**
	 * humidity
	 *
	 * @return  the humidity
	 */

	public float getHumidity() {
		return humidity;
	}

	/**
	 * pressure
	 *
	 * @return  the pressure
	 */

	public float getPressure() {
		return pressure;
	}

}
