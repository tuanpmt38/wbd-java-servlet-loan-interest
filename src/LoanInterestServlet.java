import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoanInterestServlet", urlPatterns = "/loan_interest")
public class LoanInterestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        double price = Double.parseDouble(request.getParameter("price"));
        double interest = Double.parseDouble(request.getParameter("interest"));
        int month = Integer.parseInt(request.getParameter("month"));

        double loan_interest = price * interest * month;

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1> Sum price :"+loan_interest+"</h1>");
        printWriter.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
