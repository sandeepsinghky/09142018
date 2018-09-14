package nc.dhhs.nccss.acts.ecsts.config;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jndi.JndiTemplate;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

 

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "nc.dhhs.nccss.acts.ecsts")
public class AppConfig extends WebMvcConfigurerAdapter {
	Logger log = Logger.getLogger(AppConfig.class);
	/**
	 * Configure TilesConfigurer.
	 */
	@Bean
	public TilesConfigurer tilesConfigurer() {
		log.info("Configuring Tiles");
		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		tilesConfigurer.setDefinitions(new String[] { "/WEB-INF/tiles/tiles.xml" });
		tilesConfigurer.setCheckRefresh(true);
		return tilesConfigurer;
	}
	
	/**
	 * Configure ViewResolvers to deliver preferred views.
	 */
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		TilesViewResolver viewResolver = new TilesViewResolver();
		registry.viewResolver(viewResolver);
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
		registry.addResourceHandler("/resources/css/**").addResourceLocations("/resources/css/");
		registry.addResourceHandler("/resources/images/**").addResourceLocations("/resources/images/");
	}
	
	/**
	 * Optional. It's only required when handling '.' in @PathVariables which
	 * otherwise ignore everything after last '.' in @PathVaidables argument.
	 * It's a known bug in Spring [https://jira.spring.io/browse/SPR-6164],
	 * still present in Spring 4.1.7. This is a workaround for this issue.
	 */
	@Override
	public void configurePathMatch(PathMatchConfigurer matcher) {
		matcher.setUseRegisteredSuffixPatternMatch(true);
	}
	
	@Bean
	public RequestContextListener requestContextListener() {
		return new RequestContextListener();
	}
	
	 @Bean
	 public DataSource getDbDataSource() throws NamingException {
	 	JndiTemplate jndiTemplate = new JndiTemplate(); 
	 	DataSource dataSource = null;
	 	
	 	 dataSource = jndiTemplate.lookup("java:comp/env/jdbc/ecoaDS", DataSource.class);
	 	System.out.println("Data Source" + dataSource);
	 	 return dataSource;
	 } 
}

