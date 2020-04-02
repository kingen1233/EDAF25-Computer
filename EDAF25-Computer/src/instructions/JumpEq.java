package instructions;

import data.Address;
import data.Data;
import data.Memory;
import data.Word;

public class JumpEq implements Instruction {
    private int index;
    private Data d1, d2;
	public JumpEq(int index, Data d1, Data d2) {
		this.index = index;
		this.d1 = d1;
		this.d2 = d2;
	}
    private void checkIfEqual(T obj1, T obj2) {
    	return obj1.equals(obj2);
    }
	@Override
	public void execute(Memory memory, ProgramCounter pc) {
		T word1, word2;
		if(d1 instanceof Address) {
	          word1 = d1.getWord(memory);
	        }
			else {
				word1  = d1.DATA;
			}
			if( d2 instanceof Address) {
		      word2 = d2.getWord(memory);
		    }
			else {
				word2  = d2.DATA;
			}
			if(checkIfEqual(word1,word2)) {
				
			}
			

	}
	

}
