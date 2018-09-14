package nc.dhhs.nccss.acts.ecsts.config.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Component
public class ChildSupportAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

	@Autowired
	private ChildSupportUserDetailsService childSupportUserDetailsService;
	
	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails,
			UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication)
			throws AuthenticationException {
		
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = ((ServletRequestAttributes) requestAttributes).getRequest();
		HttpSession session = request.getSession();
		String ipaddress = request.getRemoteAddr();
		String browserUserAgent = request.getHeader("User-Agent");
		System.out.println( "User Name " + username+ " user password " + authentication.getCredentials().toString()+ " IP Address " +ipaddress+ " Browser " + browserUserAgent);
		
		UserDetails userDetails;
		userDetails =childSupportUserDetailsService.loadAndAuthenticate(username, authentication.getCredentials().toString(), ipaddress, browserUserAgent);
		return userDetails;
	}

}
