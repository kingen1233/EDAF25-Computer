package instructions;

import computer.*;
import data.*;

public class Mul extends Instruction {

	private Data d1;
	private Data d2;
	private Address a;

	public Mul(Data d1, Data d2, Address a) {
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
