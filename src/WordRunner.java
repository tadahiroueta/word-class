import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import static java.lang.System.*;

public class WordRunner {

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner file = new Scanner(new File("dictionaryUpdated.dat"));
		int size = file.nextInt();
		file.nextLine();
		//Add code to initialize Array
		ArrayList<Word> wordArray = new ArrayList<Word>();
		//Add a counter
		int counter = 0;
		while(file.hasNext())
		{
			//Complete code to store strings in array.
			wordArray.add(new Word(file.next()));
		}
		//Add code to sort and print out array.
		Collections.sort(wordArray);
		out.println(wordArray);
	}
}
