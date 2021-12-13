package io.github.obasekiosa.bookspace.book;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BookController {
    
    @Autowired
    BookRepository bookRepository;

    private final String COVER_IMAGE_ROOT = "https://covers.openlibrary.org/b/id/";

    @GetMapping(value = "/books/{bookId}")
    public String getBook(@PathVariable String bookId, Model model) {
        Optional<Book> optBook = bookRepository.findById(bookId);
        if (optBook.isPresent()) {
            Book book = optBook.get();
            String coverImageUrl = "/images/no-image.png";
            if (book.getCoverIds() != null && !book.getCoverIds().isEmpty()) {
                coverImageUrl = COVER_IMAGE_ROOT + book.getCoverIds().get(0) + "-L.jpg";
            }
            model.addAttribute("coverImage", coverImageUrl);
            model.addAttribute("book", book);
            
            return "book";
        } else {
            return "book-not-found";
        }
    }
}
