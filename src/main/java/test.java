import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class test extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("GreetingServlet init: " + config);
        System.out.println("GreetingServlet country:" + config.getInitParameter("country"));
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("GreetingServlet destroy");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");

        // Creating session
        HttpSession session = request.getSession(true);
        session.setAttribute("name", name);

        // some business logic here. trolololo

        request.setAttribute("name2", "Lalala");
        //response.sendRedirect(request.getContextPath() + "/jsp/greet.jsp");
        request.getRequestDispatcher("jsp/greet.jsp").forward(request, response);

/*
        System.out.println(getInitParameter("country"));
        System.out.println(getServletContext().getInitParameter("contextParam"));
*/
    }

}