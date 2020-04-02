package instructions;

import computer.ProgramCounter;
import data.Memory;

public class Halt extends Instruction {

	private Integer action;

	public Halt() {
		this.action = -1;
	}

	@Override
	public void execute(Memory memory, ProgramCounter pc) {
		
		pc.set(action);		
	}

}
