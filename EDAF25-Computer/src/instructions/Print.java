package instructions;

import computer.ProgramCounter;
import data.Address;
import data.Data;
import data.Memory;

public class Print implements Instruction {
	private Data d;

	public Print(Data d1) {
		this.d = d1;
	}

	@Override
	public <T> void execute(Memory memory, ProgramCounter pc) {
		T word;
		if (d instanceof Address) {
			word = memory.getWord(d).DATA;
		} else {
			word = d.DATA;
		}
		System.out.println(word);
	  
	}

}
