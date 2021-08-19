package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/temp")
public class TempServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        for (Cookie s: cookies) {
            System.out.println(s.getName());
            System.out.println(s.getValue());
            System.out.println(s.getMaxAge());
        }

        Cookie cookie = new Cookie("name","value");
//        cookie.setPath("/temp.html");
//        cookie.setDomain("my.localhost.com");
//        cookie.setMaxAge(24 * 60 * 60);
//        cookie.setSecure(true);
        resp.addCookie(cookie);

    }
}
