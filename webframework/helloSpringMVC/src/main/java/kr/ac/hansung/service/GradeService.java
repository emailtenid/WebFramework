package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.Grade;
import kr.ac.hansung.dao.GradeDAO;

@Service("OfferService")
public class GradeService {

	private GradeDAO gradeDAO;

	@Autowired
	public void setOfferDAO(GradeDAO gradeDAO) {
		this.gradeDAO = gradeDAO;
	}

	public List<Grade> getGrade() {
		return gradeDAO.getGrade();
	}

}
