package instructions;

import data.Address;
import data.Data;
import data.Memory;

public class Copy implements Instruction {

	private Data d1;
	private Address a;
	
	public Copy(Data data, Address a) {
		
		this.d1 = data;
		this.a = a;
		
	
	}

	@Override
	public void execute(Memory memory, ProgramCounter pc) {
		 T word1;	
		 if (d1 instanceof Address) {
			 word1 = d1.getWord(memory);
		}
		 else {
			 word1  = d1.DATA;
		 }
		
		 memory.setWord(a, word1);
         
	}

}
