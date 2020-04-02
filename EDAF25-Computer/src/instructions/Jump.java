	package instructions;

import data.Memory;

public class Jump implements Instruction {
    private int index;
	public Jump(int index) {
		this.index = index;
	}

	@Override
	public void execute(Memory memory, ProgramCounter pc) {
          
		pc = index;

	}

}
