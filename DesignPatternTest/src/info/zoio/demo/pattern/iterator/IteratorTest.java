package info.zoio.demo.pattern.iterator;

import org.junit.Test;

public class IteratorTest {
	
	@Test
	public void test(){
		IContainer tv = new TV();
		Iterator iterator = tv.createIterator();
		while(iterator.haveNext()){
			System.out.println("TV channel :" + iterator.next());
		}
	}
}
