package instructions;

import computer.ProgramCounter;
import data.Address;
import data.Data;
import data.Memory;

public class Copy implements Instruction {

	private Data d;
	private Address a;

	public Copy(Data data, Address a) {

		this.d = data;
		this.a = a;

	}

	@Override
	public void execute(Memory memory, ProgramCounter pc) {
		T word;
		if (d instanceof Address) {
			word = memory.getWord(d).DATA;
		} else {
			word = d.DATA;
		}

		memory.setWord(a, word);
		pc.next();
	}

}
