package computer;

import data.*;
import instructions.*;

public class Computer {

	private Memory memory;
	private Program program;

	public Computer(Memory memory) {

		this.memory = memory;

	}
	
	public void load(Program program) {
		
		this.program = program;
		
	}

	public void run() {
		
		program.run(memory);
	}
}
