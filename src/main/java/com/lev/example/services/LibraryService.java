package com.lev.example.services;

import com.lev.example.entity.Book;
import com.lev.example.entity.Library;
import com.lev.example.messages.AddNewRecordRequest;
import com.lev.example.messages.CloseRecordRequest;

import java.util.List;
import java.util.Optional;

public interface LibraryService {

    List<Book> getBooksByAuthor(int idAuthor);

    List<Book> getAllBooks();

    Optional<Book> getBookById(int id);

    void saveBook(Book book);

    void setAmountOfSpecificBook(int idBook, int amount);

    void newRecord(AddNewRecordRequest addNewRecordRequest);

    void closeRecord(CloseRecordRequest closeRecordRequest);
}
