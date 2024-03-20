package org.latihan;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
 public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String page = request.getParameter("page");

		
		    switch (page) {
		        case "home":
		            // Tampilkan halaman index.jsp
		            request.getRequestDispatcher("index.jsp").forward(request, response);
		            break;
		        case "listuser":
		            // Proses untuk menampilkan daftar pengguna
		            request.getRequestDispatcher("listuser.jsp").forward(request, response);
		            break;
		        default:
		            // Jika permintaan tidak sesuai dengan yang diharapkan
		            response.sendError(HttpServletResponse.SC_NOT_FOUND);
		            break; // tambahkan break setelah default case
		    }
		
		}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
