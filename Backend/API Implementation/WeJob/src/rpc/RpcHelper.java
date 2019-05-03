package rpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

public class RpcHelper {
	public static void writeJsonArray(HttpServletResponse response, JSONArray array) throws IOException {
		response.setContentType("text/html");
		response.setHeader("Access-Control-Allow-Origin", "");
		//PrintWriter out;
		try(PrintWriter out = response.getWriter();) {
			out.print(array);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void writeJsonObject(HttpServletResponse response, JSONObject obj) throws IOException {
		response.setContentType("applicaiton/json");
		response.setHeader("Access-Control-Allow-Origin", "");
		
		try(PrintWriter out = response.getWriter();) {
			out.print(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	// Parses a JSONObject from http request.
	public static JSONObject readJSONObject(HttpServletRequest request) {
  	   StringBuilder sBuilder = new StringBuilder();
  	   try (BufferedReader reader = request.getReader()) {
  		 String line = null;
  		 while((line = reader.readLine()) != null) {
  			 sBuilder.append(line);
  		 }
  		 System.out.println(sBuilder.toString());
  		 return new JSONObject(sBuilder.toString());
  		
  	   } catch (Exception e) {
  		 e.printStackTrace();
  	   }
  	
  	  return new JSONObject();
            }
}
