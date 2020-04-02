package instructions;

import computer.ProgramCounter;
import data.Memory;

public class Jump extends Instruction {
	
    private Integer index;
    
	public Jump(Integer index) {
		this.index = index;
	}

	@Override
	public void execute(Memory memory, ProgramCounter pc) {
          
		pc.set(index);

	}

}
