package instructions;

import computer.ProgramCounter;
import data.Address;
import data.Data;
import data.Memory;
import data.Word;

public class Copy extends Instruction {

	private Data d;
	private Address a;

	public Copy(Data data, Address a) {

		this.d = data;
		this.a = a;

	}

	@Override
	public void execute(Memory memory, ProgramCounter pc) {

		Word word = getWord(d, memory);
		memory.setWord(a, word);
		pc.next();
	}

}
