package rfronteddu.springFramework.springWebApp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rfronteddu.springFramework.springWebApp.domain.Author;
import rfronteddu.springFramework.springWebApp.domain.Book;
import rfronteddu.springFramework.springWebApp.domain.Publisher;
import rfronteddu.springFramework.springWebApp.repositories.AuthorRepository;
import rfronteddu.springFramework.springWebApp.repositories.BookRepository;
import rfronteddu.springFramework.springWebApp.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner
{
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData (AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override public void run (String... args) throws Exception {
        Publisher publisherDream = new Publisher ("DreamBooks", "302 Valdor Hill, FL, 32510");
        Author authorEric = new Author ("Eric", "Evans");
        Book bookDDD = new Book ("Domain Driven Design", "1234");
        Author authorRod = new Author ("Rod", "Johnson");
        Book bookJ2EE = new Book ("J2EE Development without EJB", "12342345");

        authorRepository.save (authorEric);
        bookRepository.save (bookDDD);
        authorRepository.save (authorRod);
        bookRepository.save (bookJ2EE);
        publisherRepository.save (publisherDream);

        authorEric.getBooks ().add (bookDDD);
        bookDDD.getAuthors ().add (authorEric);
        publisherDream.getBooks ().add (bookDDD);
        bookDDD.setPublisher (publisherDream);
        bookJ2EE.setPublisher (publisherDream);
        publisherDream.getBooks ().add (bookJ2EE);
        authorRod.getBooks ().add (bookJ2EE);
        bookJ2EE.getAuthors ().add (authorRod);

        authorRepository.save (authorEric);
        bookRepository.save (bookDDD);
        authorRepository.save (authorRod);
        bookRepository.save (bookJ2EE);
        publisherRepository.save (publisherDream);


        System.out.println ("Started in bootstrap");
        System.out.println ("Number of books: " + bookRepository.count ());
        System.out.println ("Number of books per publisher: " + publisherDream.getBooks ().size ());
        System.out.println ("Number of publishers: " + publisherRepository.count ());

    }
}
