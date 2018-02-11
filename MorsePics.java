public class MorsePics 
{
	private Letter let;
	
	/** Constructor
	    @param l Represents the letter to be matched**/
	public MorsePics(Letter l)
	{
		let = l;
	}
	
	/** A method that matches the picture file to the letter
	    @return Returns the filename of the picture that corresponds to the letter**/
	public String matchPic()
	{
		/* Matching Letters to the correct picture */
		if(let == Letter.A)
		{
			return "A.PNG";
		}
		else if(let == Letter.B)
		{
			return "B.PNG";
		}
		else if(let == Letter.C)
		{
			return "C.PNG";
		}
		else if(let == Letter.D)
		{
			return "D.PNG";
		}
		else if(let == Letter.E)
		{
			return "E.PNG";
		}
		else if(let == Letter.F)
		{
			return "F.PNG";
		}
		else if(let == Letter.G)
		{
			return "G.PNG";
		}
		else if(let == Letter.H)
		{
			return "H.PNG";
		}
		else if(let == Letter.I)
		{
			return "I.PNG";
		}
		else if(let == Letter.J)
		{
			return "J.PNG";
		}
		else if(let == Letter.K)
		{
			return "K.PNG";
		}
		else if(let == Letter.L)
		{
			return "L.PNG";
		}
		else if(let == Letter.M)
		{
			return "M.PNG";
		}
		else if(let == Letter.N)
		{
			return "N.PNG";
		}
		else if(let == Letter.O)
		{
			return "O.PNG";
		}
		else if(let == Letter.P)
		{
			return "P.PNG";
		}
		else if(let == Letter.Q)
		{
			return "Q.PNG";
		}
		else if(let == Letter.R)
		{
			return "R.PNG";
		}
		else if(let == Letter.S)
		{
			return "S.PNG";
		}
		else if(let == Letter.T)
		{
			return "T.PNG";
		}
		else if(let == Letter.U)
		{
			return "U.PNG";
		}
		else if(let == Letter.V)
		{
			return "V.PNG";
		}
		else if(let == Letter.W)
		{
			return "W.PNG";
		}
		else if(let == Letter.X)
		{
			return "X.PNG";
		}
		else if(let == Letter.Y)
		{
			return "Y.PNG";
		}
		else if(let == Letter.Z)
		{
			return "Z.PNG";
		}
		
		/* Matching numbers to their picture*/
		else if(let == Letter.ZERO)
		{
			return "0.PNG";
		}
		else if(let == Letter.ONE)
		{
			return "1.PNG";
		}
		else if(let == Letter.TWO)
		{
			return "2.PNG";
		}
		else if(let == Letter.THR)
		{
			return "3.PNG";
		}
		else if(let == Letter.FOUR)
		{
			return "4.PNG";
		}
		else if(let == Letter.FIVE)
		{
			return "5.PNG";
		}
		else if(let == Letter.SIX)
		{
			return "6.PNG";
		}
		else if(let == Letter.SEV)
		{
			return "7.PNG";
		}
		else if(let == Letter.EIG)
		{
			return "8.PNG";
		}
		else if(let == Letter.NINE)
		{
			return "9.PNG";
		}
		
		/*Matching Punctuation to their pictures */
		if(let == Letter.AMPER)
		{
			return "AmpersandWait.JPG";
		}
		else if(let == Letter.APOST)
		{
			return "Apostrophe.JPG";
		}
		else if(let == Letter.AT)
		{
			return "At.JPG";
		}
		else if(let == Letter.COLON)
		{
			return "Colon.JPG"; 
		}
		else if(let == Letter.COMM)
		{
			return "Comma.JPG";
		}
		else if(let == Letter.DOLL)
		{
			return "CashMoneyStacks.JPG";
		}
		else if(let == Letter.EQUAL)
		{
			return "Equal.JPG";
		}
		else if(let == Letter.EXCL)
		{
			return "Exclamation.JPG";
		}
		else if(let == Letter.HYPH)
		{
			return "Minus.JPG";
		}
		else if(let == Letter.PARC)
		{
			return "ParenthesisClosed.JPG";
		}
		else if(let == Letter.PARO)
		{
			return "ParenthesisOpen.JPG";
		}
		else if(let == Letter.PERI)
		{
			return "Period.JPG";
		}
		else if(let == Letter.PLUS)
		{
			return "PLUS.JPG";
		}
		else if(let == Letter.QUEST)
		{
			return "QuestionMark.JPG";
		}
		else if(let == Letter.QUOT)
		{
			return "Quotation.JPG";
		}
		else if(let == Letter.SEMI)
		{
			return "Semicolon.JPG";
		}
		else if(let == Letter.SLASH)
		{
			return "Slash.JPG";
		}
		else if(let == Letter.UNDER)
		{
			return "Underscore.JPG";
		}
		
		return null;
	}
}
