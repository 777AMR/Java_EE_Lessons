package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/temp")
public class TempServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setStatus(HttpServletResponse.SC_OK);
//        resp.sendRedirect("/hello");
//        resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Bad");

//        resp.setHeader("Refresh", "1");
//        System.out.println("hello");

        resp.setHeader("Refresh", "5;URL=https://google.com");
    }
}
