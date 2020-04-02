package instructions;

import computer.ProgramCounter;
import data.Data;
import data.Memory;

public interface Instruction {

	public <T> void  execute(Memory memory, ProgramCounter pc);
}
