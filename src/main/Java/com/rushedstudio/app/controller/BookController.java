package com.rushedstudio.app.controller;

import com.rushedstudio.app.entity.Book;
import com.rushedstudio.app.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(value = "/list")
    public String bookList(Model model){
        List<Book> bookList = bookRepository.findAll();
        model.addAttribute("books", bookList);
        return "books";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String bookAddForm(Model model){
        Book book = new Book();
        model.addAttribute("book", book);
        return "book_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String bookAdd(@ModelAttribute Book book){
        bookRepository.save(book);
        return "redirect:/book/list";
    }

    @RequestMapping(value = "/delete/{id}")
    public String bookDelete(@PathVariable Long id){
        Book bookToDelete = bookRepository.findOne(id);
        bookRepository.delete(bookToDelete);
        return "redirect:/book/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String bookEdit(@PathVariable Long id,
                           Model model){
        Book bookToEdit = bookRepository.findOne(id);
        model.addAttribute("book", bookToEdit);
        return "book_edit";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String bookEditSave(@ModelAttribute Long id,
                               @ModelAttribute String title,
                               @ModelAttribute String author,
                               @ModelAttribute Double rating,
                               @ModelAttribute String publisher,
                               @ModelAttribute String description){
        Book book = bookRepository.findOne(id);
        book.setTitle(title);
        book.setAuthor(author);
        book.setRating(rating);
        book.setPublisher(publisher);
        book.setDescription(description);
        bookRepository.save(book);
        return "redirect:/book/list";
    }
}
