package data;

public abstract class Word<T> extends Data {
	
	private T word;

	public Word(T word) {
		this.word = word;
		super(word);
	}
	
	

}
