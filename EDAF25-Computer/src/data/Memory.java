package data;

public abstract class Memory {

	private Word[] memory;

	protected Memory(Long size) {
		memory = new Word[size.intValue()];
	}

	public void setWord(Address a, Word word) {
		memory[a.getData()] = word;
	}

	public Word getWord(Address a) {
		return memory[a.getData()];
	}

}
