package controllers;

import jsp.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/tempController")
public class TempController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = new Student("Max", 22);
        req.setAttribute("stud", student);
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        req.setAttribute("list", list);

        Map<String, String> map = new HashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        req.setAttribute("map", map);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/jsp/Temp.jsp");
        requestDispatcher.forward(req, resp);
    }
}