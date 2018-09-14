package nc.dhhs.nccss.acts.ecsts.web.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import nc.dhhs.nccss.acts.ecsts.beans.UserVO;
import nc.dhhs.nccss.acts.ecsts.service.UserService;

@Controller
public class LoginController {
	
	@Autowired 
	public UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String index(HttpServletRequest request, Model model){
		System.out.println("Redirecting to login");
		return "login";
    }
	
	@RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String home(HttpServletRequest request, Model model){
		System.out.println("Index Page");
		return "index";
    }
	
	@RequestMapping(value = {"/logout","/logout-success"})
    public String userLogOut(HttpServletRequest request){
		request.getSession(true).invalidate();
		SecurityContextHolder.clearContext();
		System.out.println("Logout Page ");
        return "logout";
    }
		
	@RequestMapping(value = "/accessdenied")
    public String userAceesDeniedt(HttpServletRequest request,Model model){
		System.out.println("Access denied Page ");
        return "accessdenied";
    }
	
	@Transactional(readOnly = true)
	@RequestMapping(value = "/welcome")
    public String LoginSuccess(HttpServletRequest request,Model model){
		try {
			//String userID = (String) request.getSession().getAttribute("username");
			 Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			 String userID= (String) authentication.getPrincipal();
			System.out.println(userID); 
			//For Testing Purpose
			 userID="ACTS1004";
			 System.out.println("Login Controller UserName" + userID);
		 	 UserVO userVO=userService.getUserDetail(userID);
		 	 model.addAttribute("userinfo", userVO);
		 	 System.out.println("Login Success go to Welcome Page " + userVO.getIdPassword()); 
		 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "welcome";
    }
}
