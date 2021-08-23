package jsp;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(value = "/filterServlet", initParams = {@WebInitParam (name="name", value="value")})
public class MyNewFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(filterConfig.getInitParameter("name"));
        System.out.println("init filter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.getWriter().write("before ");
        if (true) {
            filterChain.doFilter(servletRequest, new MyResponseWrapper((HttpServletResponse)servletResponse));
        }
        servletResponse.getWriter().write(" after");
    }

    @Override
    public void destroy() {
        System.out.println("destroy filter");
    }
}

class MyResponseWrapper extends HttpServletResponseWrapper {
    public MyResponseWrapper(HttpServletResponse response) {
        super(response);
    }

    @Override
    public PrintWriter getWriter() throws IOException {

        return super.getWriter();
    }
}