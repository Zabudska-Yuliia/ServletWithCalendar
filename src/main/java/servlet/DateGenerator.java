package servlet;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "Home",
        urlPatterns = {"/"}
)

public class DateGenerator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher;
        String dateM = "";
        requestDispatcher = getServletContext().getRequestDispatcher("/index.jsp");
        for(int i = 1970; i == 2016; i++){
            dateM +="<option value=\"" + i + "\"" + i + "</option>";
        }
        request.setAttribute("dateM", dateM);
        requestDispatcher.forward(request, response);
    }
}
