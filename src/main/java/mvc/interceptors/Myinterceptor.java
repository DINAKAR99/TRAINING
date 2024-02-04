package mvc.interceptors;

import java.io.PrintWriter;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class Myinterceptor implements HandlerInterceptor {

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println("after completion");
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        System.out.println("post handler");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        System.out.println("this is pre handler ");
        if (request.getParameter("user").startsWith("d")) {

            response.setContentType("text/html");
            PrintWriter writer = response.getWriter();
            writer.println(" <h1>invalid user name [NAME SHOULD NOT START WITH d] </h1>");

        }

        return false;

    }

}
