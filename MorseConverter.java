import java.io.*;
import java.util.*;

public class MorseConverter 
{
	private String wordID;
	private String origWord;
  
  /** A constructer for the MorseConverter class */
	MorseConverter()
	{
		origWord = generateWord();
		MorseLetters ml = new MorseLetters(origWord);		
		wordID = convertWord(ml.getEnumString());
	}
	
	/** A method that returns the origWord instanfce variable
	*/
	public String getOrigWord()
	{
		return origWord;
	}
	
  /** A method that returns the 0 & 1 representation of a letter
      @param let Represents the letter to be translated
      @returns Returns a string of the 0 & 1 representation of the letter*/
	public static String getLetterID(Letter let)
	{
    //0 represents a DIT
    //1 represents a DAH
  
		String ID = "";
		
		if(let == Letter.A)
		{
			ID = "01";
		}
		else if(let == Letter.B)
		{
			ID = "1000";
		}
		else if(let == Letter.C)
		{
			ID = "1010";
		}
		else if(let == Letter.D)
		{
			ID = "100";
		}
		else if(let == Letter.E)
		{
			ID = "0";
		}
		else if(let == Letter.F)
		{
			ID = "0010";
		}
		else if(let == Letter.G)
		{
			ID = "110";
		}
		else if(let == Letter.H)
		{
			ID = "0000";
		}
		else if(let == Letter.I)
		{
			ID = "00";
		}
		else if(let == Letter.J)
		{
			ID = "0111";
		}
		else if(let == Letter.K)
		{
			ID = "101";
		}
		else if(let == Letter.L)
		{
			ID = "0100";
		}
		else if(let == Letter.M)
		{
			ID = "11";
		}
		else if(let == Letter.N)
		{
			ID = "10";
		}
		else if(let == Letter.O)
		{
			ID = "111";
		}
		else if(let == Letter.P)
		{
			ID = "0110";
		}
		else if(let == Letter.Q)
		{
			ID = "1101";
		}
		else if(let == Letter.R)
		{
			ID = "010";
		}
		else if(let == Letter.S)
		{
			ID = "000";
		}
		else if(let == Letter.T)
		{
			ID = "1";
		}
		else if(let == Letter.U)
		{
			ID = "001";
		}
		else if(let == Letter.V)
		{
			ID = "0001";
		}
		else if(let == Letter.W)
		{
			ID = "011";
		}
		else if(let == Letter.X)
		{
			ID = "1001";
		}
		else if(let == Letter.Y)
		{
			ID = "1011";
		}
		else if(let == Letter.Z)
		{
			ID = "1100";
		}
		
		return ID;
		
	}//setID
	
  /** A method that converts the letters in a word to its corresponding 0 & 1 combination
      @returns the 0/1 represenation of the word*/
	String convertWord(Letter [] word)
	{
		String r = "";
		
		for(int i = 0; i < word.length; i++)
		{
			r += getLetterID(word[i]);
		}
		
		return r;
		
	} //convertWord
	
  /** A method to get a words 0 & 1 representation
      @returns wordID*/
	public String getWordID()
	{
		return wordID;
	} //getWordID
	
  /** A method that randomly generates a word
       @return Returns an array of the equivalant enumaerated values of the word*/
	static public String generateWord()
	{
		//Code from: https://gamedev.stackexchange.com/questions/144834/how-can-i-generate-random-meaningful-words-in-a-typing-game
		
		String fileName = "./5LetterWords";
		File diction = new File(fileName);
		List<String> words = new ArrayList<>();
		Scanner scan = null;
		
		//Checking to see if the file exists
		try
		{
			scan = new Scanner(diction);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found: " + fileName);
			System.exit(0);
		}
		
		//Writing the words from file into the array
		while(scan.hasNextLine())
		{
			String stuff = scan.nextLine();
			words.add(stuff);
		}
		
		Random r = new Random();
		int wordsSize = words.size();
		
		String randWord = (words.get(r.nextInt(wordsSize)));	
	
		return randWord;
	} // generateWord
	
}
