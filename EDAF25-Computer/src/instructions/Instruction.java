package instructions;

import computer.ProgramCounter;
import data.Memory;

public interface Instruction {
  
	public void execute(Memory memory, ProgramCounter pc);

}
