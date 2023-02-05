package com.learn.DAO;

import com.learn.entity.Room;
import com.learn.helper.CP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class RoomDAO
{
    public static boolean saveRoom(Room room)
    {
        boolean result = false;
        try
        {
            Connection con = CP.getCon();
            String query = "INSERT INTO ROOM VALUES('"+room.getNumber()+"','"+room.getType()+"',"+room.getHas_ac()+","+room.getBeds()+")";
            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.executeUpdate();
            result = true;

        }
        catch (Exception e)
        {
            return true;
        }

        return result;
    }

//    public static List<Room> getRooms()
//    {
//
//    }

//    getAvailableRooms()
//    {
//
//    }

//    getAcRooms()
//    {
//
//    }
//    getDoubleRooms()
//    {
//
//    }
//    getSingleRooms()
//    {
//
//    }
//    getDeluxRooms()
//    {
//
//    }
//
//    getAvaialbleDeluxRooms()
//    {
//
//    }


}
