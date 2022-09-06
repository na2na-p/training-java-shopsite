package dev.na2na.trainingjavashopsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dev.na2na.trainingjavashopsite.bean.ProductBean;

public class ProductDAO extends DAO {
	public List<ProductBean> search(String keyword) throws Exception {
		List<ProductBean> list= new ArrayList<>();

		Connection con=getConnection();

		try (PreparedStatement st = con.prepareStatement(
			"select * from product where name like ?")) {
			st.setString(1, "%" + keyword + "%");
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				ProductBean p = new ProductBean();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setPrice(rs.getInt("price"));
				list.add(p);
			}

			st.close();
		}
		con.close();

		return list;
	}
}
