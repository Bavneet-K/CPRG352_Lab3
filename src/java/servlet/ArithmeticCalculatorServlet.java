package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bavneet
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
        return;
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String first = request.getParameter("first_num");
        String second = request.getParameter("second_num");
        String operation = request.getParameter("operation");
        int result = 0;
        
        if(operation == "+"){
            result = Integer.parseInt(first) + Integer.parseInt(second);
        }
        else if(operation == "-"){
            result = Integer.parseInt(first) + Integer.parseInt(second);
        }
        else if(operation == "*"){
            result = Integer.parseInt(first) + Integer.parseInt(second);
        }
        else if(operation == "/"){
            result = Integer.parseInt(first) + Integer.parseInt(second);
        }
        
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        if( first == null || first.equals("") || second == null || second.equals("") ){
            String message = "You must give your current age";
            request.setAttribute("message", message);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return;
        }
 
        request.setAttribute("result", result);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
        return;
    }

}
