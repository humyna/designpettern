/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: InputTest.java
* @Package info.zoio.demo.pattern.decorator.demo2
* @Description: TODO
*
* @author humyna
* @date 24 Dec 2014 11:54:08
* @version V1.0
*/
package info.zoio.demo.pattern.decorator.demo2;

import info.zoio.demo.pattern.decorator.demo2.iface.impl.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * 类名: InputTest <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 24 Dec 2014 11:54:08
 */
public class InputTest {
	public static void main(String[] args) {
		int c;
		try {
			InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test")));
			while ((c = inputStream.read()) >= 0) {
				System.out.print((char)c);
			}
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
