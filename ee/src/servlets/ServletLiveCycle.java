package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LiveServlet")
public class ServletLiveCycle extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String s = "<html>" +
                "<header><title>This is title</title></header>" +
                "<body>" +
                "Hello world" +
                "</body>" +
                "</html>";
        resp.getWriter().write(s);
    }
}
