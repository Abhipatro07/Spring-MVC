package jsp.Spring;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {StudentConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	

}
