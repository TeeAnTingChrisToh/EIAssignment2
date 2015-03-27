import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "processLogin", urlPatterns = {"processLogin"})
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
                
				request.setAttribute("msg", "Welcome ");
				RequestDispatcher rd = request.getRequestDispatcher("Input.html");
                rd.forward(request, response);
				
            } else {
                request.setAttribute("msg", "Invalid Username/Password");
                RequestDispatcher rd = request.getRequestDispatcher("Input.html");
                rd.forward(request, response);
            }
        } 
}
