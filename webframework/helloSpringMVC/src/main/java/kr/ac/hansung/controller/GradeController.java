package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.dao.Grade;
import kr.ac.hansung.service.GradeService;

@Controller 
public class GradeController {

	private GradeService gradeService;

	@Autowired 
	public void setGradeService(GradeService gradeService) {
		this.gradeService = gradeService;
	}

	@RequestMapping("/grade")
	public String showgrade(Model model) {

		List<Grade> grade = gradeService.getGrade();

		model.addAttribute("grade", grade);

		return "grade";

	}

}
