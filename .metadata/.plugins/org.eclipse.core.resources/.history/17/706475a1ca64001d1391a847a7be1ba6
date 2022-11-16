package com.controller.product;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProductDao;
import com.model.Product;

@WebServlet("/update")
public class UpdateProductController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		int uid = Integer.parseInt(req.getParameter("uid"));
		
		ProductDao pdao = new ProductDao();
		if(action.equals("delete")) {
			int i = pdao.deleteProduct(uid);
			if(i>0) {
				ArrayList<Product> al = pdao.getAllProduct();
				req.setAttribute("data", al);
				req.getRequestDispatcher("product.jsp").forward(req, resp);
			}
		}else if(action.equals("update")){
			Product p = pdao.getProductById(uid);
			ArrayList<Product> al = pdao.getAllProduct();
			req.setAttribute("pdata", p);
			req.setAttribute("data", al);
			req.getRequestDispatcher("product.jsp").forward(req, resp);
		}
	}
}
