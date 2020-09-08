/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DAO.BookDAO;
import Model.DTO.Book;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class BookController {
    private static final BookController INSTANCE = new BookController();

    public boolean addBook() {
        return bookDAO.addBook();
    }

    public  boolean deleteBookById(int deleteID) {
        return bookDAO.deleteBookById();
    }
    BookDAO bookDAO = new BookDAO();
    
    private BookController(){
   
    }
    public static BookController getInstance(){
        return INSTANCE;
    }
    public ArrayList<Book> getAllBook() throws SQLException {
        return bookDAO.getAllBook();
    }

    public boolean deleteBookByName(String deleteName) {
        return bookDAO.deleteBookByName();
    }


    public boolean updateBookByName(String updateName) {
        return bookDAO.updateBookByName();
    }

    public boolean updateBookById(int updateId) {
        return bookDAO.updateBookById();
    }

    public boolean updateBookByPrice(int updatePrice) {
        return bookDAO.updateBookByPrice();
    }
}
