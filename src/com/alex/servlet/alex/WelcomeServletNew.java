package com.alex.servlet.alex;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alex.service.demo.WelcomeService;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServletNew")
public class WelcomeServletNew extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServletNew() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1. Create the data (model) and andd to request object 
		// Invoking the business layer 
		
		WelcomeService welcomeService = new WelcomeService(); 
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Alex Trzeciak"); 
		request.setAttribute("myWelcomeMessage", welcomeMessage); 
		
		//2. Retrieve request dispatcher
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcomeNew.jsp");
		
		//3. Forward request to the view 
		requestDispatcher.forward(request, response);
		
		//		NOTES
		//		<!-- JSTL is JavaServerPages Standard Tag Library is a collection of useful JSP Tags -->
		//		<!-- similar to html tags and used in jsp files 
		//		help implement lots of core functionality such as itteration and 
		//		conditional tags for manipulating XML documents -->
		//
		//		<!-- Library indicates that it is a collection of java classes packed into .jar (java archive file) that 
		//		we can download into our project -->
		//
		//		<!-- Groups based on required fuctionality. Start by using <c:out/> for outputting data 
		//		and <c:forEach/> for iterating over collections -->
		//
		//		<!-- uri => uniform resource identifier --> 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
