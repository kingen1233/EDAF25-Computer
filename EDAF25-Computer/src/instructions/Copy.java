package instructions;

import computer.ProgramCounter;
import data.Address;
import data.Data;
import data.Memory;

public class Copy extends Instruction {

	private Data d;
	private Address a;

	public Copy(Data data, Address a) {

		this.d = data;
		this.a = a;

	}

	@Override
	public <T> void execute(Memory memory, ProgramCounter pc) {
		T word = getData(d, memory);

		memory.setWord(a, word);
		pc.next();
	}

}
