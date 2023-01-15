package com.learn.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

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
    }
}
