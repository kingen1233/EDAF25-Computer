package computer;

import data.*;
import instructions.*;
import java.util.ArrayList;

import instructions.Instruction;

public class Program extends ArrayList<Instruction> {

	private int pc = 0;

	public Program() {

	}

	public void run(Memory memory) {

		for (; pc < size(); pc++) {

			Instruction instr = get(pc);
			instr.execute();

			if (pc == -1) {
				System.out.println("Instruction Halt executed, program terminating");
				break;
			}
		}

	}

}
