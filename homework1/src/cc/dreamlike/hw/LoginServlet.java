package cc.dreamlike.hw;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Polomani on 21.01.2016.
 */
public class LoginServlet extends HttpServlet {

    private static final String LOGIN = "admin";
    private static final String PASS = "123";

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
        out.println("<form method=\"post\" action=\"/\">" +
                "<p><input type=\"text\" name=\"login\" placeholder=\"Username or Email\"></p>\n" +
                "<p><input type=\"password\" name=\"password\" placeholder=\"Password\"></p>" +
                "<p class=\"submit\"><input type=\"submit\" name=\"commit\" value=\"Login\"></p>" +
                "</form>");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
        String login = (String) req.getParameter("login");
        String password = (String) req.getParameter("password");
        if (LOGIN.equals(login) && PASS.equals(password))
            out.println("Hello, " + login + "!");
        else
            out.println("Error. Login or pass is incorrect.");
    }
}
