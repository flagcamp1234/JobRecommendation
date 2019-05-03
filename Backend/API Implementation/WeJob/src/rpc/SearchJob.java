package rpc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.SearchUtil;

@WebServlet("/search")
public class SearchJob extends HttpServlet {

	/** 
	 * Search jobs
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	   		 throws ServletException, IOException {	
		doGet(request, response);
	}
	
	/**
	 * Search Job
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("application/json");
		String searchTerm = request.getParameter("searchTerm");
		String location = request.getParameter("location");
		SearchUtil.search(searchTerm, location);
	}
}
