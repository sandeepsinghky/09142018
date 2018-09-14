package nc.dhhs.nccss.acts.ecsts.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManageReportsController {

	@RequestMapping(value = "/reports")
    public String LoginSuccess(Model model){
		System.out.println("reports Page");
		return "reports";
    }
}
