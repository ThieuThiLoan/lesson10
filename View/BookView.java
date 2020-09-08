/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.BookController;
import Model.DTO.Book;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BookView {

    BookController bookController = BookController.getInstance();
    Scanner sc = new Scanner(System.in);

    public void execute() throws SQLException {
        while (true) {
            System.out.println("1.Show");
            System.out.println("2.Add");
            System.out.println("3.Delete");
            System.out.println("4.Update");
            System.out.println("5.Exit");
            int inputuser = sc.nextInt();
            sc.nextLine();
            switch (inputuser) {
                case 1:
                    ArrayList<Book> allBooks = bookController.getAllBook();
                    for (int i = 0; i < allBooks.size(); i++) {
                        System.out.println("STT" + i + ":" + allBooks.get(i).toString());
                    }
                    break;
                case 2:
                    System.out.println("Ten sach muon nhap");
                    String name = sc.next();
                    System.out.println("id sach muon nhap");
                    int id = sc.nextInt();
                    System.out.println("price sach muon nhap");
                    int price = sc.nextInt();
                    Book book = new Book(id, name, price);
                    boolean checkBook = bookController.addBook();
                    if (checkBook = true) {
                        System.out.println("Add book thanh cong");
                    } else {
                        System.out.println("Add fail");
                    }
                    break;
                case 3:
                    int input;
                    System.out.println("Nhap vao lua chon: 1 la xoa bang name, 2 la xoa bang id");
                    input = sc.nextInt();
                    if (input == 1) {
                        System.out.println("Ten sach muon xoa");
                        String deleteName = sc.next();
                        boolean checkDeleteBook = bookController.deleteBookByName(deleteName);
                        if (checkDeleteBook = true) {
                            System.out.println("Delete book thanh cong");
                        } else {
                            System.out.println("Delete fail");
                        }
                    } else if (input == 2) {
                        System.out.println("id sach muon xoa");
                        int deleteId = sc.nextInt();
                        boolean checkDeleteBook = bookController.deleteBookById(deleteId);
                        if (checkDeleteBook = true) {
                            System.out.println("Delete book thanh cong");
                        } else {
                            System.out.println("Delete fail");
                        }
                    }  else {
                        return;
                    }                    
                        break;
                case 4:
                    int updateInput;
                    System.out.println("Nhap vao lua chon: 1 la update name, 2 la update id, 3 la update price");
                    updateInput = sc.nextInt();
                    if (updateInput == 1 ) {
                      System.out.println("Name sach muon update");
                    String updateName = sc.next();
                    boolean checkUpdateBook = bookController.updateBookByName(updateName);
                        if (checkUpdateBook = true) {
                            System.out.println("Update name thanh cong");
                        }else {
                            System.out.println("Update fail");
                        }
                    }else if (updateInput == 2) {
                        System.out.println("Id sach muon xoa");
                        int updateId = sc.nextInt();
                        boolean checkUpdateBook = bookController.updateBookById(updateId);
                        if (checkUpdateBook = true) {
                            System.out.println("Update id thanh cong");                           
                        }else {
                            System.out.println("Update fail");
                        }                               
                    } else if (updateInput == 3) {
                        System.out.println("Price sach muon update");
                        int updatePrice = sc.nextInt();
                        boolean checkUpdateBook = bookController.updateBookByPrice(updatePrice);
                        if (checkUpdateBook = true) {
                            System.out.println("Update thanh cong");                               
                        } else {
                            System.out.println("Update fail");
                        }
                    } else {
                        return;
                    }                    
                    break;
            }
        }
    }
}
