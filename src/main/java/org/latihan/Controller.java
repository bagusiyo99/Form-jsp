package org.latihan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

//	  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	        // Mendapatkan nilai dari parameter form
//		  response.getWriter().println(request.getParameter("name") + "<br/>") ;
//		  response.getWriter().println(request.getParameter("gender") + "<br/>") ;
//		    PrintWriter out = response.getWriter();
//	        String[] language = request.getParameterValues("language");
//	        
//	        if (language != null) {
//	            for (int i = 0;i < language.length; i++) {
//	                out.println(language[i] + "<br/>");
//	            }
//	        } else {
//	            out.println("Bahasa tidak dipilih");
//	        }
//	        
//			  response.getWriter().println(request.getParameter("country") + "<br/>") ;
//
//	  

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        String wa = request.getParameter("wa");
        String province = request.getParameter("province");
        String[] languages = request.getParameterValues("language");
        String message = request.getParameter("message");

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Pendaftaran</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Form Pendaftaran</h2>");
        out.println("<p><strong>Nama:</strong> " + name + "</p>");
        out.println("<p><strong>Jenis Kelamin:</strong> " + gender + "</p>");
        out.println("<p><strong>Alamat:</strong> " + address + "</p>");
        out.println("<p><strong>Nomor WhatsApp:</strong> " + wa + "</p>");
        out.println("<p><strong>Pesan:</strong> " + (message != null && !message.isEmpty() ? message : "(Tidak ada pesan yang dikirim)") + "</p>");
        out.println("<p><strong>Bahasa yang dikuasai:</strong></p>");
        if (languages != null) {
            out.println("<ul>");
            for (String language : languages) {
                out.println("<li>" + language + "</li>");
            }
            out.println("</ul>");
        } else {
            out.println("<p>(Tidak ada bahasa yang dipilih)</p>");
        }
        out.println("<p><strong>Provinsi:</strong> " + province + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
