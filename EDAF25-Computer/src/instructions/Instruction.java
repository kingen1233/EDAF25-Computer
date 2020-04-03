package instructions;

import computer.ProgramCounter;
import data.*;

public abstract class Instruction {

	public Word getWord(Data d, Memory memory) {

		Word temp;

		if (d instanceof Address) {
			temp = memory.getWord((Address) d);
		} 
		else {
			temp = (Word) d;
		}
		return temp;
	}

	public abstract <T> void execute(Memory memory, ProgramCounter pc);
}
