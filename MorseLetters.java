public class MorseLetters 
{
	private String [] submiss;

	/** A constructor
	    @param word Represents the word/phrase to be translated into Morse Code**/
	public MorseLetters(String word)
	{
		word = word.toLowerCase();
		
		submiss = new String[word.length()];
		
		for(int i = 0; i < word.length(); i++)
		{
				submiss[i] = Character.toString(word.charAt(i));	
		}
	}
	
	/** A getter method for the submiss variable
	    @return Returns the submiss array **/
	public String [] getSubmiss() 
	{
		return submiss;
	}

	public void setSubmiss(String [] submiss) 
	{
		this.submiss = submiss;
	}  
	
	/** A method that matches the letter to its enumeration 
	    @param let Represents the letter to be matched
	    @return Returns the enumerated Letter representation of let**/
	public Letter matchLetter(String let)
	{	
		char chara = let.charAt(0);
			
		/* Matching the character with the enumerated number*/
		if(Character.isDigit(chara) == true)
		{
			int number = Integer.parseInt(let);
			
			if(number == 1)
			{
				return Letter.ONE;
			}
			else if(number == 2)
			{
				return Letter.TWO;
			}
			else if(number == 3)
			{
				return Letter.THR;
			}
			else if(number == 4)
			{
				return Letter.FOUR;
			}
			else if(number == 5)
			{
				return Letter.FIVE;
			}
			else if(number == 6)
			{
				return Letter.SIX;
			}
			else if(number == 7)
			{
				return Letter.SEV;
			}
			else if(number == 8)
			{
				return Letter.EIG;
			}
			else if(number == 9)
			{
				return Letter.NINE;
			}
		}	
		
		/** Matching the submission letter with the enumerated letters*/
		if(Character.isLetter(chara) == true)
		{
			if(chara == 'a')
			{
				return Letter.A;
			}
			else if(chara == 'b')
			{
				return Letter.B;
			}
			else if(chara == 'c')
			{
				return Letter.C;
			}
			else if(chara == 'd')
			{
				return Letter.D;
			}
			else if(chara == 'e')
			{
				return Letter.E;
			}
			else if(chara == 'f')
			{
				return Letter.F;
			}
			else if(chara == 'g')
			{
				return Letter.G;
			}
			else if(chara == 'h')
			{
				return Letter.H;
			}
			else if(chara == 'i')
			{
				return Letter.I;
			}
			else if(chara == 'j')
			{
				return Letter.J;
			}
			else if(chara == 'k')
			{
				return Letter.K;
			}
			else if(chara == 'l')
			{
				return Letter.L;
			}
			else if(chara == 'm')
			{
				return Letter.M;
			}
			else if(chara == 'n')
			{
				return Letter.N;
			}
			else if(chara == 'o')
			{
				return Letter.O;
			}
			else if(chara == 'p')
			{
				return Letter.P;
			}
			else if(chara == 'q')
			{
				return Letter.Q;
			}
			else if(chara == 'r')
			{
				return Letter.R;
			}
			else if(chara == 's')
			{
				return Letter.S;
			}
			else if(chara == 't')
			{
				return Letter.T;
			}
			else if(chara == 'u')
			{
				return Letter.U;
			}
			else if(chara == 'v')
			{
				return Letter.V;
			}
			else if(chara == 'w')
			{
				return Letter.W;
			}
			else if(chara == 'x')
			{
				return Letter.X;
			}
			else if(chara == 'Y')
			{
				return Letter.Y; 
			}
			else if(chara == 'z')
			{
				return Letter.Z; 
			} 			
		}	
	
		/* Matching the punctuation characters to their enumerations*/
		if((Character.isLetter(chara) == false) && (Character.isDigit(chara) == false))
		{
			if((chara == '&') || (chara == ' '))
			{
				return Letter.AMPER;
			}
			else if(chara == '\'')
			{
				return Letter.APOST;
			}
			else if(chara == '@')
			{
				return Letter.AT;
			}
			else if(chara == ':')
			{
				return Letter.COLON;
			}
			else if(chara == '!')
			{
				return Letter.EXCL;
			}
			else if(chara == ',')
			{
				return Letter.COMM;
			}
			else if(chara == '$')
			{
				return Letter.DOLL;
			}
			else if(chara == '=')
			{
				return Letter.EQUAL;
			}
			else if(chara == '-')
			{
				return Letter.HYPH;
			}
			else if(chara == '(')
			{
				return Letter.PARO;
			}
			else if(chara == ')')
			{
				return Letter.PARC;
			}
			else if(chara == '.')
			{
				return Letter.PERI;
			}
			else if(chara == '+')
			{
				return Letter.PLUS;
			}
			else if(chara == '?')
			{
				return Letter.QUEST;
			}
			else if(chara == '"')
			{
				return Letter.QUOT;
			}
			else if(chara == ';')
			{
				return Letter.SEMI;
			}
			else if(chara == '\\')
			{	
				return Letter.SLASH;
			}
			else if(chara == '_')
			{
				return Letter.UNDER;
			}
		}
		
		return null;
	}
	
}
