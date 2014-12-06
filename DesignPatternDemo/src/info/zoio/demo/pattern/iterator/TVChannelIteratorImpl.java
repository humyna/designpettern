package info.zoio.demo.pattern.iterator;

public class TVChannelIteratorImpl implements Iterator{
	private String[] cctvChannel = new String[]{"cctv-1","cctv-2","cctv-3","cctv-4","cctv-5","cctv-6","cctv-7"};
	
	private int curLocation = 0;
	
	@Override
	public String next() {
		if(haveNext()){
			return cctvChannel[curLocation ++];
		}
		return null;
	}
	
	@Override
	public boolean haveNext() {
		if(curLocation < cctvChannel.length){
			return true;
		}
		
		return false;
	}
}
