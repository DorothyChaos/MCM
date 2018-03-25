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
import model.MorseConverter;

/**
 * Servlet implementation class compare
 */
@WebServlet("/compare")
public class compare extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public compare() {
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
		//read from practice.jsp
		String morseCode = request.getParameter("morseCode");
		String wordID = request.getParameter("wordID");
		String word = request.getParameter("word");
		int counter = Integer.parseInt(request.getParameter("counter"));
		counter = counter + 1;
		
		HttpSession session = request.getSession();
		
		//compare the input Morse Code IDs to the correct IDs
		//compare length first
		if(morseCode.length()==wordID.length()) {
			if(morseCode.equals(wordID)) {
				//send the response to the correct.jsp
				session.setAttribute("wordID", wordID);
				session.setAttribute("word", word);
				session.setAttribute("counter", counter);
				String url = "/correct.jsp";
				
				RequestDispatcher dispatcher = request.getRequestDispatcher(url);
				dispatcher.forward(request, response);
			}
			
			else {
				//send the response to wrong.jsp
				session.setAttribute("wordID", wordID);
				session.setAttribute("word", word);
				session.setAttribute("counter", counter);
				String url = "/wrong.jsp";
				
				RequestDispatcher dispatcher = request.getRequestDispatcher(url);
				dispatcher.forward(request, response);
			}
			
		}
		
		else {
			//send the response to wrong.jsp
			session.setAttribute("wordID", wordID);
			session.setAttribute("word", word);
			session.setAttribute("counter", counter);
			String url = "/wrong.jsp";
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request, response);
		}
		
	}

}
