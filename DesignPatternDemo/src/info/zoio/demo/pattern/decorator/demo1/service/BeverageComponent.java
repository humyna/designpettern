/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: Beverage.java
* @Package info.zoio.demo.pattern.decorator.demo1.service
* @Description: TODO
*
* @author humyna
* @date 24 Dec 2014 11:13:54
* @version V1.0
*/
package info.zoio.demo.pattern.decorator.demo1.service;

/**
 *
 * 类名: Beverage <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 24 Dec 2014 11:13:54
 */
public abstract class BeverageComponent {
	public String description = "Unknown Beverage";

	/**
	 * description
	 *
	 * @return  the description
	 */

	public String getDescription() {
		return description;
	}

	public abstract double cost();

}
