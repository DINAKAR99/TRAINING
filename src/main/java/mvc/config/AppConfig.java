package mvc.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import mvc.interceptors.Myinterceptor;
import mvc.models.User;

@Configuration
@EnableTransactionManagement
@EnableWebMvc

@ComponentScan(basePackages = "mvc.*")
public class AppConfig implements WebMvcConfigurer {

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new Myinterceptor()).addPathPatterns("/welcome");
  }

  @Bean("viewResolver")
  InternalResourceViewResolver getViewResolver() {
    InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
    internalResourceViewResolver.setPrefix("/WEB-INF/views/");
    internalResourceViewResolver.setSuffix(".jsp");

    return internalResourceViewResolver;
  }

  @Bean
  StandardServletMultipartResolver getResolver() {
    StandardServletMultipartResolver resolver = new StandardServletMultipartResolver();
    return resolver;

  }

  @Bean("ds")
  DriverManagerDataSource getDataSource() {
    DriverManagerDataSource ds = new DriverManagerDataSource();
    ds.setDriverClassName("org.postgresql.Driver");
    ds.setUrl("jdbc:postgresql://localhost:5433/spring_mvc_orm");
    ds.setUsername("postgres");
    ds.setPassword("dinakar1.");
    return ds;
  }

  @Bean("factory")
  LocalSessionFactoryBean getFactory() {
    LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
    factory.setDataSource(getDataSource());
    Properties p = new Properties();
    p.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
    p.put("hibernate.hbm2ddl.auto", "update");
    p.put("hibernate.format_sql", "true");
    p.put("hibernate.show_sql", "true");
    factory.setHibernateProperties(p);
    factory.setAnnotatedClasses(User.class);
    return factory;
  }

  @Bean("tx")
  HibernateTransactionManager getTransactionManager() {
    return new HibernateTransactionManager(
        (SessionFactory) getFactory().getObject());
  }

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {

    registry.addResourceHandler("/resources/**").addResourceLocations(
        "/WEB-INF/resources/");
  }

  @Bean
  Myinterceptor myinterceptor() {
    return new Myinterceptor();
  }
}
