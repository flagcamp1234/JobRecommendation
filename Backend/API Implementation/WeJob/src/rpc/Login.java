package rpc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;

import db.DBConnection;
import db.DBConnectionFactory;

@WebServlet("/login")
public class Login extends HttpServlet {
	 /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *  	response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
   		 throws ServletException, IOException {		
		DBConnection connection = DBConnectionFactory.getConnection();
		try {
			JSONObject input = RpcHelper.readJSONObject(request);
			String username = input.getString("user_id");
			
			JSONObject obj = new JSONObject();
			if (connection.getUserProfile(username) != null) {
				HttpSession session = request.getSession();
				session.setAttribute("user_id", username);
				session.setMaxInactiveInterval(600);
				obj.put("status", "OK").put("user_id", username);
			} else {
				obj.put("status", "User Doesn't Exist");
				response.setStatus(401);
			}
			RpcHelper.writeJsonObject(response, obj);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
    }
}
