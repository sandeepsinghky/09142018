package nc.dhhs.nccss.acts.ecsts.config.security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ChildSupportUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public UserDetails loadAndAuthenticate(String userName, String password, String ipaddress, String browserUserAgent)
	{
		return loadUser(userName, password, ipaddress, browserUserAgent, true);
	}
	
	private UserDetails loadUser(String username, String password, String ipaddress, String browserUserAgent,
			boolean authenticate) throws AuthenticationException, DataAccessException
	{
		UserDetails userDetails = null;
		return userDetails;
	}

}
