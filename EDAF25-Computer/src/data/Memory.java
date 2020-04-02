package data;

public abstract class Memory<T> {

	private T [] memory;
	
	public Memory(T[] memory) {
		this.memory = memory;
	}

	public T[] getWord() {
		return this.memory;
	}

	public void setWord(T [] word) {
		this.memory = word;
	}
	
}
