package instructions;

import computer.ProgramCounter;
import data.Address;
import data.Data;
import data.Memory;
import data.Word;

public class Add extends Instruction {
	private Data d1, d2;
	private Address a;

	public Add(Data d1, Data d2, Address a) {
		this.d1 = d1;
		this.d2 = d2;
		this.a = a;
	}

	@Override
	public <T> void execute(Memory memory, ProgramCounter pc) {
		T word1 = getData(d1, memory);
		T word2 = getData(d2, memory);
		Word<T> newWord = new Word<T>(word1 + word2);
		memory.setWord(a, newWord);

		pc.next();

	}

}
