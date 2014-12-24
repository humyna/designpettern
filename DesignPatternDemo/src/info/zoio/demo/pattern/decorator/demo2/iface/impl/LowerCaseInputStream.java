/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: LowerCaseInputStream.java
* @Package info.zoio.demo.pattern.decorator.demo2.iface.impl
* @Description: TODO
*
* @author humyna
* @date 24 Dec 2014 11:47:21
* @version V1.0
*/
package info.zoio.demo.pattern.decorator.demo2.iface.impl;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * 类名: LowerCaseInputStream <br/>
 * 用途: 装饰者类，把输入流内的所有大写转成小写. <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 24 Dec 2014 11:47:21
 */
public class LowerCaseInputStream extends FilterInputStream {

	public LowerCaseInputStream(InputStream in) {
		super(in);
	}

	public int read() throws IOException{
		int c = super.read();
		return (c == -1 ? c :Character.toLowerCase((char)c));
	}

	public int read(byte[] b,int offset,int len) throws IOException{
		int result = super.read(b, offset, len);
		for (int i = offset; i < offset + len; i++) {
			b[i] = (byte)(Character.toLowerCase((char)b[i]));
		}

		return result;
	}
}
