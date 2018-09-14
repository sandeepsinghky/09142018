package nc.dhhs.nccss.acts.ecsts.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManageWorkloadsController {

	@RequestMapping(value = "/workload")
    public String LoginSuccess(Model model){
		System.out.println("Workload Page");
		return "workload";
    }
}
