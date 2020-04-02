package data;

public abstract class Word<T> extends Data {

	private T word;

	public Word(T word) {
		super(word);
		this.word = word;
		
	}

}
