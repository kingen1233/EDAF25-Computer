package instructions;

import computer.ProgramCounter;
import data.Address;
import data.Data;
import data.Memory;

public abstract class Instruction {
	
	public <T> T getData(Data d, Memory memory) {
		
		T temp;
		
		if (d instanceof Address) {
			temp = memory.getWord(d).DATA;
		} 
		else {
			temp = d.DATA;
		}
		
		return temp;		
	}

	public abstract <T> void  execute(Memory memory, ProgramCounter pc);
}
