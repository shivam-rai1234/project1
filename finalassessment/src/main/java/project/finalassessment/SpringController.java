package project.finalassessment;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SpringController {
	@Autowired
	private SpringRepo er;
	@GetMapping("/eligible") 
	public List<SpringEntity> getSample(){
		return er.findvalues();
}
	@GetMapping("/noteligible") 
	public List<SpringEntity> getSample1(){
		return er.findvalues1();
}

}
