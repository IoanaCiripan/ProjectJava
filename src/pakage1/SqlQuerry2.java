package pakage1;

public interface SqlQuerry2 {

    String addNewBook= " INSERT INTO books (author, title, domain) VALUES (?, ? , ? )";

    String deleteBookByTitle = "DELETE FROM books WHERE title = ?";

    String deleteBookByAuthor = "DELETE FROM books WHERE author = ?";

    String deleteBookByDomain = "DELETE FROM books WHERE domain = ?";

    String searchBookByAuthor = "SELECT * FROM books WHERE author = ?";

    String searchBookByTitle = "SELECT * FROM books WHERE title = ?";

    String searchBookByDomain = "SELECT * FROM books WHERE domain = ?";
}
