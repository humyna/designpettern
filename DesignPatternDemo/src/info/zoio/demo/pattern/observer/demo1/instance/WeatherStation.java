/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: WeatherStation.java
* @Package info.zoio.demo.pattern.observer.demo1.instance
* @Description: TODO
*
* @author humyna
* @date 9 Dec 2014 22:16:16
* @version V1.0
*/
package info.zoio.demo.pattern.observer.demo1.instance;

import info.zoio.demo.pattern.observer.demo1.iface.Subject;
import info.zoio.demo.pattern.observer.demo1.iface.impl.CurrentConditionsDisplay;
import info.zoio.demo.pattern.observer.demo1.iface.impl.ForcastDisplay;
import info.zoio.demo.pattern.observer.demo1.iface.impl.StatisticsDisplay;
import info.zoio.demo.pattern.observer.demo1.iface.impl.WeatherData;

/**
 *
 * 类名: WeatherStation <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 9 Dec 2014 22:16:16
 */
public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
//		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//		ForcastDisplay forcastDisplay = new ForcastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.5f);
		weatherData.setMeasurements(82, 70, 12.5f);
		weatherData.setMeasurements(70, 20, 54.5f);
	}

}
