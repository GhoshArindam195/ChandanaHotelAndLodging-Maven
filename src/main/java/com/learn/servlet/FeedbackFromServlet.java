package com.learn.servlet;

import com.learn.DAO.FeedbackDAO;
import com.learn.entity.Feedback;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "feedbackFromServlet", value = "/feedbackFromServlet")
public class FeedbackFromServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String name = request.getParameter("name");
        String from_email = request.getParameter("from_email");
        String subject = request.getParameter("subject");
        String queryType = request.getParameter("queryType");
        String content = request.getParameter("content");

        Feedback feedback = new Feedback(from_email, queryType, subject, content, false);
        try(PrintWriter out = response.getWriter())
        {
            if(FeedbackDAO.saveFeedback(feedback))
            {
                out.println(queryType);
            }
            else
            {
                out.println("Failed");
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
