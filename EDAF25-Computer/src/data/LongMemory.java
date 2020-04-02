package data;

public class LongMemory extends Memory {
		
		private Word[] memory;

	    public LongMemory(long size) {
	        super(memory);
	        memory = new Word[size];
	        
	    }
}
