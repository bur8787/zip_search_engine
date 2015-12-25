package jp.suzutt.zip_search_engine.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.suzutt.zip_search_engine.beans.ZipListBeans;

/**
 * Servlet implementation class SearchController
 */
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String INDEX_JSP = "/WEB-INF/index.jsp";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String zipCode = request.getParameter("zipcode");

		if (zipCode == null || zipCode.isEmpty()) {
			initialize(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	private void initialize(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher(INDEX_JSP);
		dispatcher.forward(request, response);
	}

	private ZipListBeans search(HttpServletRequest request, HttpServletResponse response) {
//		ZipListBeans zipListBeans = search(zipCode);

//		HttpSession session = request.getSession();
//		session.setAttribute("zipCodeList", zipListBeans);
		return null;
	}
}
