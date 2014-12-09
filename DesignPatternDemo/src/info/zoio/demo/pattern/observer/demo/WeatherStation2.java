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
package info.zoio.demo.pattern.observer.demo;

import info.zoio.demo.pattern.observer.demo2.iface.impl.CurrentConditionsDisplay;
import info.zoio.demo.pattern.observer.demo2.iface.impl.WeatherData;


/**
 *
 * 类名: WeatherStation2 <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 9 Dec 2014 22:56:12
 */
public class WeatherStation2 {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

		weatherData.setMeasurementsChanged(80, 65, 30.5f);
	}

}
