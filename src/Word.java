
public class Word implements Comparable<Word>{

	private String word;

	public Word( String s )
	{
		word = s;
	}
	

	public String toString()
	{
		return word;
	}

	@Override
	public int compareTo(Word o) {
		int thisLength = word.length();
		String otherString = o.toString();
		int otherLength = otherString.length();
		if (thisLength > otherLength)
			return 1;
		if (thisLength < otherLength)
			return -1;
		return word.compareTo(otherString);
	}
}
