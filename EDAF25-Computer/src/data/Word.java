package data;

public abstract class Word<T> implements Data {

	private T word;

	protected Word(T word) {
		this.word = word;
	}

}
