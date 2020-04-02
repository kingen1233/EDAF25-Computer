package computer;

public class ProgramCounter {

	Integer pc;
	
	public ProgramCounter() {
		pc = 0;
	}
	
	public void set(Integer index) {
		pc = index;
	}
	
    public Integer get() {
    	return pc;
    }
    
    public void next() {
    	pc++;
    }

}
