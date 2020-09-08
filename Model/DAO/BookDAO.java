/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Helper.DatabaseUtil;
import Model.DTO.Book;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class BookDAO {
    DatabaseUtil dbUtil = new DatabaseUtil();
    public boolean deleteBookById;
   
    public ArrayList<Book> getAllBook() throws SQLException {
        String sql = "Select * from Book";
        ArrayList<Book> bookList = new ArrayList<>();
        ResultSet rs = dbUtil.executeQuery(sql);
        while (rs.next()) {
            Book temp = new Book();
            temp.setId(rs.getInt("id"));
            temp.setName(rs.getString("name"));
            temp.setPrice(rs.getInt("price"));
            bookList.add(temp);
        }
        return bookList;
    } 

    public boolean addBook() { 
        return false;
    }

    public boolean deleteBookById() {
        return false;
    }


    public boolean deleteBookByName() {
        return false;
    }

    public boolean updateBookByName() {
        return false;
    }

    public boolean updateBookById() {
        return false;
    }

    public boolean updateBookByPrice() {
        return false;
    }
}
