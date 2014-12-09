/**
* Twitter:@Humyna
* QQ:82956058
* Blog:www.zoio.info
*
* @Title: SwingObserverExample.java
* @Package info.zoio.demo.pattern.observer.demo1.instance
* @Description: TODO
*
* @author humyna
* @date 9 Dec 2014 23:00:04
* @version V1.0
*/
package info.zoio.demo.pattern.observer.demo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 *
 * 类名: SwingObserverExample <br/>
 * 用途: TODO 添加用途(可选). <br/>
 * 使用方式: TODO 编写使用demo(可选). <br/>
 *
 * @author humyna <br/>
 * 9 Dec 2014 23:00:04
 */
public class SwingObserverExample {
	JFrame jFrame;

	public static void main(String[] args) {
		SwingObserverExample swingObserverExample = new SwingObserverExample();
		swingObserverExample.go();
	}

	public void go(){
		jFrame = new JFrame();

		JButton jButton = new JButton("Should I do it?");
		jButton.addActionListener(new AngleListener());
		jButton.addActionListener(new DevilListener());
		jFrame.getContentPane().add(BorderLayout.CENTER,jButton);
		jFrame.setSize(200, 100);
		jFrame.setLocation(100, 100);
		jFrame.setVisible(true);
	}

	class AngleListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Don't do it,you might reget it!");
		}
	}

	class DevilListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Come on,do it!");
		}
	}
}
