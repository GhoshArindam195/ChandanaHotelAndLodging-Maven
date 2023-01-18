package com.learn.DAO;

import com.learn.entity.Feedback;
import com.learn.helper.CP;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class FeedbackDAO
{
    public static boolean saveFeedback(Feedback feedback)
    {
        boolean result = false;
        try
        {
            Connection con = CP.getCon();
            String query = "Insert into Feedback(f_from, f_type, f_subject, f_content, is_actioned) values(?,?,?,?,?) ";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, feedback.getF_from());
            pstmt.setString(2, feedback.getF_type());
            pstmt.setString(3, feedback.getF_subject());
            pstmt.setString(4, feedback.getF_content());
            pstmt.setBoolean(5, feedback.isIs_actioned());

            pstmt.executeUpdate();

            result = true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }
}
