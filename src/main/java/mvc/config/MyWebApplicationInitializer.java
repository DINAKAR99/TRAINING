package mvc.config;

import jakarta.servlet.MultipartConfigElement;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import jakarta.servlet.annotation.MultipartConfig;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@MultipartConfig
public class MyWebApplicationInitializer implements WebApplicationInitializer {

  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
    context.register(AppConfig.class);

    DispatcherServlet servlet = new DispatcherServlet(context);
    ServletRegistration.Dynamic registration = servletContext.addServlet(
        "spring",
        servlet);
    registration.setLoadOnStartup(1);
    registration.addMapping("/");

    MultipartConfigElement config = new MultipartConfigElement("C:\\temp", 20848820, 418018841, 1048576);

    registration
        .setMultipartConfig(new MultipartConfigElement("/org"));
  }
}
