package Exceptions_14;

import java.sql.SQLException;

//    18. Write a program to generate SQLException
public class ExceptionExample18 {
    public static void main(String[] args) {
        try {
            throw new SQLException("Database Error");
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}
