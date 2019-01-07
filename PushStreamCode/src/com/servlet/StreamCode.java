package com.servlet;

import java.io.FileWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public class StreamCode extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public StreamCode() {
        super();
        // TODO Auto-generated constructor stub
    }

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String addr = request.getParameter("addr");
		String code = request.getParameter("code");
		
		String writeToThisFile = "/root/douyu----------------------video3/1.txt";
		
		if(null==addr||"".equals(addr)||null==code||"".equals(code)){
			response.getWriter().write("url or code is null");;
		}else{
			code = code.replace("||", "&");
			FileWriter fw = new FileWriter(writeToThisFile);
			fw.write(addr+"/"+code );
			//System.out.println(code);
			fw.close();
			response.getWriter().write("fw is write over");;
		}
		
		
	}

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String addr = request.getParameter("addr");
		String code = request.getParameter("code");
		
		String writeToThisFile = "/root/douyu----------------------video3/1.txt";
		
		if(null==addr||"".equals(addr)||null==code||"".equals(code)){
			response.getWriter().write("url or code is null");;
		}else{
			code = code.replace("||", "&");
			FileWriter fw = new FileWriter(writeToThisFile);
			fw.write(addr+"/"+code );
			//System.out.println(code);
			fw.close();
			response.getWriter().write("fw is write over");;
		}
	}

}
