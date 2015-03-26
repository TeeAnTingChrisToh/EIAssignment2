package sloca.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sloca.model.DemographicDAO;
import sloca.model.User;

@WebServlet(name = "processLogin", urlPatterns = {"/process-Login.do"})
public class processLogin extends HttpServlet {

    /**
     * authenticates username and password
     *
     * <p>
     * if username is admin, direct to admin page, if normal user, direct to
     * MainMenu page
     * <p>
     * else if invalid username or password direct to login page and print error
     * message
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        username = username.trim();
        password = password.trim();

        if (username.equals("admin")) {
            if (password.equals("blackyellow")) {
                HttpSession session = request.getSession();
                session.setAttribute("authenticatedUser", username);
                response.sendRedirect("admin");
            } else {
                request.setAttribute("msg", "Invalid Username/Password");
                RequestDispatcher rd = request.getRequestDispatcher("LoginUI.jsp");
                rd.forward(request, response);
            }
        } else {
            if (DemographicDAO.retrieveUserID(username) == null) {
                request.setAttribute("msg", "Invalid Username/Password");
                RequestDispatcher rd = request.getRequestDispatcher("LoginUI.jsp");
                rd.forward(request, response);
            } else {
                //String userName = DemographicDAO.retrieveUserID(username);
                User user = DemographicDAO.retrieve(username);
                String pwd = user.getPwd();
                if (password.equals(pwd)) {
                    HttpSession session = request.getSession();
                    session.setAttribute("authenticatedUser", username);
                    //RequestDispatcher rd = request.getRequestDispatcher("MainMenuUI.jsp");
                    //rd.forward(request, response);
                    response.sendRedirect("MainMenuUI.jsp?username=" + username);
                } else {
                    request.setAttribute("msg", "Invalid Username/Password");
                    RequestDispatcher rd = request.getRequestDispatcher("LoginUI.jsp");
                    rd.forward(request, response);
                }
            }
        }
    }
}
