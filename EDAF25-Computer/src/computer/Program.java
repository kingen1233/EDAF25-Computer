package computer;

import data.*;
import instructions.*;
import java.util.ArrayList;

import instructions.Instruction;

public class Program extends ArrayList<Instruction> {

	public void run(Memory memory, ProgramCounter pc) {

		while(pc.get() != -1) {
			get(pc.get()).execute(memory, pc);			
		}

	}

}
