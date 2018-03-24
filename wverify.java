package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Letter;
import model.MorseAudios;
import model.MorseLetters;
import model.MorsePics;

/**
 * Servlet implementation class verify
 */
@WebServlet("/wverify")
public class wverify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public wverify() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String word = request.getParameter("word");
		int counter = Integer.parseInt(request.getParameter("counter"));
		
		HttpSession session = request.getSession();
		
		//creates instance  of MorseLetters, which puts the word in the array
		MorseLetters mL = new MorseLetters(word);
		//here we retrieve the array with our word
		String [] submiss = mL.getSubmiss();
		//creating string array for whole - audio
		String [] wholeAudio = new String[word.length()];
		//creating string array for whole - pictures
		String [] wholePic = new String [word.length()];
		//creating loop to get wholeAudio and wholePic
		for(int i = 0; i <= counter; i++) {
			//based on the counter we match the letter
			Letter let = mL.matchLetter(submiss[counter]);
			//create instance of MorseAudio class
			MorseAudios mA = new MorseAudios(let);
			//call on method to get the audio file name
			String audioFile = mA.matchAudio();
			//storing audio string into array
			wholeAudio[counter] = audioFile;
			//create instance of MorsePics class
			MorsePics mP = new MorsePics(let);
			//call on method to get pic file name
			String picFile = mP.matchPic();
			//storing pic into wholePic
			wholePic[counter] = picFile;
			counter++;
		}//for
		//create the total counts of letters in submiss
		int total = submiss.length - 1;
		
		session.setAttribute("word", word);
		session.setAttribute("mP", wholePic);
		session.setAttribute("mA", wholeAudio);
		session.setAttribute("counter", counter);
		session.setAttribute("total", total);
		
		String url = "/result.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}