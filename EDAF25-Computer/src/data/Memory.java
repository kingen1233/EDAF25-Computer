package data;

public abstract class Memory<T> {

	private T[] memory;

	protected Memory(Word[] mem) {
		memory = mem;
	}

	public void setWord(Address a, Word word) {
		memory[a.DATA] = word;
	}

	public Word getWord(Address a) {
		return memory[a.DATA];
	}

	public T[] getWord() {
		return this.memory;
	}

	public void setWord(T[] word) {
		this.memory = word;
	}

}
