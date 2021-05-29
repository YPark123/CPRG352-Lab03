package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgeCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     // Capture the parameters from the POST request (the form)
       String age = request.getParameter("age_input");
       int intAge;
 
       // Validation : if the parameters don't exist or are empty, show the first page again
       if(age == null || age.equals("")){
           //Create a helpful message to send to the user
           request.setAttribute("message", "You must give your current age");
           //forward the request and response to the JSP 
           //display the form again 
           getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
           return;
       }
       
        try {
            intAge = Integer.parseInt(age);
        } 
        catch (NumberFormatException e) {
            request.setAttribute("message", "You must enter a number.");
            //display the form again 
           getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
           return;
        }

     
       //Set the attributes for the JSP
       request.setAttribute("age", age);
       int nextAge = Integer.parseInt(age) + 1;
       request.setAttribute("result", "Your age next birthday will be " + nextAge);
      
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
       
    }

}
