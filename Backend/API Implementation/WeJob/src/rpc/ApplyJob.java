package rpc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/apply")
public class ApplyJob extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 
	 * Apply a single job
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	   		 throws ServletException, IOException {	

	}
	
	/**
	 * Get applied job list from the user
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {

	}
}
