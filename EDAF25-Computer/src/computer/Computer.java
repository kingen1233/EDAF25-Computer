package computer;

import data.*;
import instructions.*;

public class Computer {

	private Memory memory;
	private Program program;
	private ProgramCounter pc;

	public Computer(Memory memory) {

		this.memory = memory;
		pc = new ProgramCounter();
	}

	public void load(Program program) {

		this.program = program;
	}

	public void run() {

		program.run(memory, pc);
	}
}
