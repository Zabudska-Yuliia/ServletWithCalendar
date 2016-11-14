package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "Greeter",
        urlPatterns = {"/greeter"}
)
public class Greeter extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = "";
        RequestDispatcher requestDispatcher;
        name = request.getParameter("name");
        requestDispatcher = getServletContext().getRequestDispatcher("/jsp/greeter.jsp");
        if(name.isEmpty() || name == null){
            name = "InterLink";
        }
        request.setAttribute("name", name);
        requestDispatcher.forward(request, response);
    }
}
