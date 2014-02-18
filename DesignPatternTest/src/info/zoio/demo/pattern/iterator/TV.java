package info.zoio.demo.pattern.iterator;

public class TV implements IContainer {
	public TV() {
		System.out.println("OPEN A TV");
	}
	
	@Override
	public Iterator createIterator() {
		return new TVChannelIteratorImpl();
	}

}
