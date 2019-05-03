package rpc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import db.DBConnection;
import db.DBConnectionFactory;

@WebServlet("/like")
public class FavorJob extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/** 
	 * Favor a single job id
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	   		 throws ServletException, IOException {	

	}
	/**
	 * Delete a single job id
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) {

	}
	
	/**
	 * Get liked job list from the user
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {

	}
}
