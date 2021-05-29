package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Capture the parameters from the POST request (the form)
       String first = request.getParameter("first_value");
       String second = request.getParameter("second_value");
       int intFirst;
       int intSecond;
 
       // Validation : if the parameters don't exist or are empty, show the first page again
       if(first == null || first.equals("") || second == null || second.equals("")){
           //Create a helpful message to send to the user
           request.setAttribute("result", "--");
           //forward the request and response to the JSP 
           //display the form again 
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
           return;
       }
       
        try {
            intFirst = Integer.parseInt(first);
            intSecond = Integer.parseInt(second);
        } 
        catch (NumberFormatException e) {
            request.setAttribute("result", "Invalid");
            //display the form again 
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
           return;
        }

     
       // Calculate the result
       int firstValue = Integer.parseInt(first);
       int secondValue = Integer.parseInt(second);
       int result = 0;
       
       String btn = request.getParameter("calculation");
       
       if(btn.equals("+")){
           result = firstValue + secondValue;
       }
       else if(btn.equals("-")){
           result = firstValue - secondValue;
       }
       else if(btn.equals("*")){
           result = firstValue * secondValue;
       }
       
       else {
           result = firstValue % secondValue;
       }
       

       request.setAttribute("result", result);
      
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
 
    }


}
