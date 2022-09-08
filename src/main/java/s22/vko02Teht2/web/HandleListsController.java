package s22.vko02Teht2.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import s22.vko02Teht2.domain.Student;

@Controller
public class HandleListsController {

	@GetMapping("/hello")
	public String HLController(Model model) {
		ArrayList<Student> students = new ArrayList<Student>();
		
		// Lisätään oppilaita listaan
		students.add(new Student("Kate", "Cole"));
		students.add(new Student("Dan", "Brown"));
		students.add(new Student("Leo", "Sutinen"));
		
		// Lisätään studentList, students avain-arvo-pariksi
		model.addAttribute("studentList", students);
		
		return "studentlist";
	}
}
