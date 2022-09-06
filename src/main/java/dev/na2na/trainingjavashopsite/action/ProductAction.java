package dev.na2na.trainingjavashopsite.action;

import java.util.List;
import jakarta.servlet.http.*;

import dev.na2na.trainingjavashopsite.bean.ProductBean;
import dev.na2na.trainingjavashopsite.dao.ProductDAO;

public class ProductAction extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {
		HttpSession session=request.getSession();
		// keywordを受け取りproductDAOのsearchメソッドでProduct beanのList型を作りセッション属性にセット
		String keyword=request.getParameter("keyword");
		ProductDAO productDAO=new ProductDAO();
		List<ProductBean> list=productDAO.search(keyword);
		session.setAttribute("productList", list);
		return "product.jsp";
	}
}
