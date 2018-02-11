public class MorseAudios 
{
	private Letter let;
	
	/** Constructor for the Letter enumeration
	    @param l Represents the letter to be matched**/ 
	public MorseAudios(Letter l)
	{
		let = l;
	}
	
	/** A method that matches the audio to the letter
	    @return Returns the filename of the audio that corresponds to the letter**/
	public String matchAudio()
	{
		/** Matching the alphabet audios*/
		if(let == Letter.A)
		{
			return "Morse Code Alphabet A Alpha.mp3";
		}
		else if(let == Letter.B)
		{
			return "Morse Code Alphabet B Bravo.mp3";
		}
		else if(let == Letter.C)
		{
			return "Morse Code Alphabet C Charlie.mp3";
		}
		else if(let == Letter.D)
		{
			return "Morse Code Alphabet D Delta.mp3";
		}
		else if(let == Letter.E)
		{
			return "Morse Code Alphabet E Echo.mp3";
		}
		else if(let == Letter.F)
		{
			return "Morse Code Alphabet F Foxtrot.mp3";
		}
		else if(let == Letter.G)
		{
			return "Morse Code Alphabet G Golf.mp3";
		}
		else if(let == Letter.H)
		{
			return "Morse Code Alphabet H Hotel.mp3";
		}
		else if(let == Letter.I)
		{
			return "Morse Code Alphabet I India.mp3";
		}
		else if(let == Letter.J)
		{
			return "Morse Code Alphabet J Juliet.mp3";
		}
		else if(let == Letter.K)
		{
			return "Morse Code Alphabet K Kilo.mp3";
		}
		else if(let == Letter.L)
		{
			return "Morse Code Alphabet L Lima.mp3";
		}
		else if(let == Letter.M)
		{
			return "Morse Code Alphabet M Mike.mp3";
		}
		else if(let == Letter.N)
		{
			return "Morse Code Alphabet N November.mp3";
		}
		else if(let == Letter.O)
		{
			return "Morse Code Alphabet O Oscar.mp3";
		}
		else if(let == Letter.P)
		{
			return "Morse Code Alphabet P Papa.mp3";
		}
		else if(let == Letter.Q)
		{
			return "Morse Code Alphabet Q Quebec.mp3";
		}
		else if(let == Letter.R)
		{
			return "Morse Code Alphabet R Romeo.mp3";
		}
		else if(let == Letter.S)
		{
			return "Morse Code Alphabet S Sierra.mp3";
		}
		else if(let == Letter.T)
		{
			return "Morse Code Alphabet T Tanago.mp3";
		}
		else if(let == Letter.U)
		{
			return "Morse Code Alphabet U Uniform.mp3";
		}
		else if(let == Letter.V)
		{
			return "Morse Code Alphabet V Victor.mp3";
		}
		else if(let == Letter.W)
		{
			return "Morse Code Alphabet W Whiskey.mp3";
		}
		else if(let == Letter.X)
		{
			return "Morse Code Alphabet X Xray.mp3";
		}
		else if(let == Letter.Y)
		{
			return "Morse Code Alphabet Y Yankee.mp3";
		}
		else if(let == Letter.Z)
		{
			return "Morse Code Alphabet Z Zulu.mp3";
		}
		
		/* Matching the number audios */
		if(let == Letter.ZERO)
		{
			return "0_number_morse_code.ogg.mp3";
		}
		else if(let == Letter.ONE)
		{
			return "1_number_morse_code.ogg.mp3";
		}
		else if(let == Letter.TWO)
		{
			return "2_number_morse_code.ogg.mp3";
		}
		else if(let == Letter.THR)
		{
			return "3_number_morse_code.ogg.mp3";
		}
		else if(let == Letter.FOUR)
		{
			return "4_number_morse_code.ogg.mp3";
		}
		else if(let == Letter.FIVE)
		{
			return "5_number_morse_code.ogg.mp3";
		}
		else if(let == Letter.SIX)
		{
			return "6_number_morse_code.ogg.mp3";
		}
		else if(let == Letter.SEV)
		{
			return "7_number_morse_code.ogg.mp3";
		}
		else if(let == Letter.EIG)
		{
			return "8_number_morse_code.ogg.mp3";
		}
		else if(let == Letter.NINE)
		{
			return "9_number_morse_code.ogg.mp3";
		}
		
		/* Matching Punctuation audios*/
		if(let == Letter.AMPER)
		{
			return "Morse_Code_-_Ampersand.ogg.mp3";
		}
		else if(let == Letter.APOST)
		{
			return "Morse_Code_-_Apostrophe.ogg.mp3";
		}
		else if(let == Letter.AT)
		{
			return "Morse_Code_-_At(Commercial_At).ogg.mp3";
		}
		else if(let == Letter.COLON)
		{
			return "Morse_Code_-_Colon.ogg.mp3"; 
		}
		else if(let == Letter.COMM)
		{
			return "Morse_Code_-_Comma.ogg.mp3";
		}
		else if(let == Letter.DOLL)
		{
			return "Morse_Code_-_Dollar_Sign.ogg.mp3";
		}
		else if(let == Letter.EQUAL)
		{
			return "Morse_Code_-_Equals.ogg.mp3";
		}
		else if(let == Letter.EXCL)
		{
			return "Morse_Code_-_Exclamation_Point.ogg.mp3";
		}
		else if(let == Letter.HYPH)
		{
			return "Morse_Code_-_Hyphen,_Minus.ogg.mp3";
		}
		else if(let == Letter.PARC)
		{
			return "Morse_Code_-_Parenthesis_(Close).ogg.mp3";
		}
		else if(let == Letter.PARO)
		{
			return "Morse_Code_-_Parenthesis_(Open).ogg.mp3";
		}
		else if(let == Letter.PERI)
		{
			return "Morse_Code_-_Period.ogg.mp3";
		}
		else if(let == Letter.PLUS)
		{
			return "Morse_Code_-_Plus.ogg.mp3";
		}
		else if(let == Letter.QUEST)
		{
			return "Morse_Code_-_Question_Mark.ogg.mp3";
		}
		else if(let == Letter.QUOT)
		{
			return "Morse_Code_-_Quotation_Mark.ogg.mp3";
		}
		else if(let == Letter.SEMI)
		{
			return "Morse_Code_-_Semicolon.ogg.mp3";
		}
		else if(let == Letter.SLASH)
		{
			return "Morse_Code_-_Slash.ogg.mp3";
		}
		else if(let == Letter.UNDER)
		{
			return "Morse_Code_-_Underscore.ogg.mp3";
		}
		
		return null;
	}
}
