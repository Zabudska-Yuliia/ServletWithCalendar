import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.YearMonth;

@WebServlet(
        name = "Calendar",
        urlPatterns = {"/calendar"}
)
public class Calendar extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ServletException, IOException {
        RequestDispatcher requestDispatcher;
        String fullCalendar = getCalendar(request);

        requestDispatcher = getServletContext().getRequestDispatcher("/jsp/calendar.jsp");
        request.setAttribute("calendar", fullCalendar);
        requestDispatcher.forward(request, response);
    }

    private String getCalendar(HttpServletRequest request){
        String fullCalendar;
        Calendat calendat;
        int year = Integer.parseInt(request.getParameter("year"));
        int month = Integer.parseInt(request.getParameter("month"));

        try {
            calendat = new Calendat(YearMonth.of(year, month), LocalDate.of(year, month, LocalDate.now().getDayOfMonth()));
        }catch (Exception e) {
            calendat = new Calendat(YearMonth.now(), LocalDate.now());
        }
        HtmlView htmlView = new HtmlView();
        fullCalendar = htmlView.addContentToFile(calendat);
        return fullCalendar;
    }

}
