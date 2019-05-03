package rpc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.RecommendUtil;

@WebServlet("/recommend")
public class RecommendJob extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
		String recWeight = request.getParameter("recWeight");
		String useLocation = request.getParameter("useLocation");
		RecommendUtil.recommend(recWeight, useLocation);
	}
}
