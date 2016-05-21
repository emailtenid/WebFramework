package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class GradeMapper implements RowMapper<Grade> {

	
		public Grade mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			Grade grade =new Grade();
			
			grade.setYear(rs.getString("year"));
			grade.setSemester(rs.getString("semester"));
			grade.setName(rs.getString("name"));
			grade.setCode(rs.getString("code"));
			grade.setDivision(rs.getString("division"));
			grade.setGrade(rs.getInt("grade"));
			
			
			
			return grade;
			
		}
		
	}


