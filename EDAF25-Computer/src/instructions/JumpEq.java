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

	private  boolean checkIfEqual(Word w1, Word w2) {
		return w1.getData() == w2.getData();
	}

	@Override
	public <T> void execute(Memory memory, ProgramCounter pc) {
		Word word1 = getWord(d1, memory);
		Word word2 = getWord(d2, memory);

		if (checkIfEqual(word1, word2)) {
			pc.set(index);
		} else {
			pc.next();
		}
	}

}
