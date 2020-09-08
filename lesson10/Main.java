/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson10;

import View.BookView;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        BookView view = new BookView();
        view.execute();
    }
}
