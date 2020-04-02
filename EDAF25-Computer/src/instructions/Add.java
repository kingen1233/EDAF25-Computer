package instructions;

import data.Address;
import data.Data;
import data.Memory;
import data.Word;

public class Add implements Instruction {
    private	Data d1,d2;
	private Address a;
	
	public Add(Data d1, Data d2, Address a) {
	this.d1 = d1;
	this.d2 = d2;
	this.a = a;
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
		Word<T> newWord= new Word<T>(word1 + word2);
        memory.setWord(a, newWord);
    
     
		
	}

}
