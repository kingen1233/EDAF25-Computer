package instructions;

import computer.ProgramCounter;
import data.Address;
import data.Data;
import data.Memory;
import data.Word;

public class JumpEq extends Instruction {
	private int index;
	private Data d1, d2;

	public JumpEq(int index, Data d1, Data d2) {
		this.index = index;
		this.d1 = d1;
		this.d2 = d2;
	}

	private <T> boolean checkIfEqual(T obj1, T obj2) {
		return obj1.equals(obj2);
	}

	@Override
	public <T> void execute(Memory memory, ProgramCounter pc) {
		T word1 = getData(d1, memory);
		T word2 = getData(d2, memory);

		if (checkIfEqual(word1, word2)) {
			pc.set(index);
		} else {
			pc.next();
		}
	}

}
