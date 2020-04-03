package data;

public class LongWord extends Word {

	long word;

	public LongWord(long word) {
		super(word);
		this.word = word;
	}

	@Override
	public Long getData() {

		return word;
	}

}
