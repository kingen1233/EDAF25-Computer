package instructions;

import computer.ProgramCounter;
import data.*;

public class Print extends Instruction {
	private Data d;

	public Print(Data d1) {
		this.d = d1;
	}

	@Override
	public <T> void execute(Memory memory, ProgramCounter pc) {
		Long word = getWord(d, memory).getData();
		System.out.println(word);
		pc.next();
	}
}
