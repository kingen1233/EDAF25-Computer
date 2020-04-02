package instructions;

import computer.*;
import data.*;

public class Mul implements Instruction {

	private Data d1;
	private Data d2;
	private Address a;

	public Mul(Data d1, Data d2, Address a) {
		this.d1 = d1;
		this.d2 = d2;
		this.a = a;
	}

	@Override
	public void execute(Memory memory, ProgramCounter pc) {

		T word1;
		T word2;

		if (d1 instanceof Address) {
			word1 = memory.getWord(d1);
		} 
		else {
			word1 = d1.DATA;
		}

		if (d2 instanceof Address) {
			word2 = memory.getWord(d2);
		} 
		else {
			word2 = d2.DATA;
		}
		
		Word<T> newWord = new Word<T>(word1 + word2);
		memory.setWord(a, newWord);
		pc.next();

	}

}
