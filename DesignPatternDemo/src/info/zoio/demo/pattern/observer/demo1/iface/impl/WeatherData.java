/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: WeatherData.java
* @Package info.zoio.demo.pattern.observer.demo1.iface
* @Description: TODO
*
* @author humyna
* @date 9 Dec 2014 21:54:26
* @version V1.0
*/
package info.zoio.demo.pattern.observer.demo1.iface.impl;

import info.zoio.demo.pattern.observer.demo1.iface.Observer;
import info.zoio.demo.pattern.observer.demo1.iface.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 类名: WeatherData <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 9 Dec 2014 21:54:26
 */
public class WeatherData implements Subject {
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers  =  new ArrayList<Observer>();
	}

	/* (non-Javadoc)
	 * @see info.zoio.demo.pattern.observer.demo1.iface.Subject#registerObserver(info.zoio.demo.pattern.observer.demo1.iface.Observer)
	 * @param o
	 */
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	/* (non-Javadoc)
	 * @see info.zoio.demo.pattern.observer.demo1.iface.Subject#removeObserver(info.zoio.demo.pattern.observer.demo1.iface.Observer)
	 * @param o
	 */
	@Override
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);

		if(index >= 0){
			observers.remove(index);
		}

	}

	/* (non-Javadoc)
	 * @see info.zoio.demo.pattern.observer.demo1.iface.Subject#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}


	public void measurementsChanged(){
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.temperature = temperature;
		measurementsChanged();
	}
}
