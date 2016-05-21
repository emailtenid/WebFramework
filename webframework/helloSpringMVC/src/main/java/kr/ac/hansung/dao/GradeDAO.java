package kr.ac.hansung.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("offerDAO")
public class GradeDAO {

	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public List<Grade> getGrade() {

		String sqlStatement = "select * from grade";

		return jdbcTemplateObject.query(sqlStatement, new GradeMapper()); // Anonymous
																			// Classes

	}

	/*
	 * public boolean insert(Grade offer) {
	 * 
	 * String email = offer.getEmail(); String password = offer.getPassword();
	 * String company = offer.getCompany();
	 * 
	 * String sqlStatement =
	 * "insert into enterprise (email, password, company) values (?,?,?)";
	 * return (jdbcTemplateObject.update(sqlStatement, new Object[] { email,
	 * password, company }) == 1); }
	 */

}
