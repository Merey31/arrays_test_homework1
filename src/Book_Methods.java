
public class Book_Methods {
    Book[] books;

    //print all books in the array
    void printAllBooks(Book[] books) {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book.title + ": " + book.author + ", " + book.pages);
            }
        }
    }

    //total amount of books
    int getActualSize(Book[] books) {
        int count = 0;
        for (Book book : books) {
            if (book != null) {
                count++;
            }
        }
        return count;
    }

    //sum of pages from all the books
    int countTotalPages(Book[] books) {
        int pagesSum = 0;
        for (Book book : books) {
            if (book != null) {
                pagesSum += book.pages;
            }
        }
        return pagesSum;
    }

    //self-explanatory
    void findBookByTitle(Book[] books, String title) {
        for (Book book : books) {
            if (book != null && book.title.equals(title)) {
                System.out.println(book.title + ": " + book.author + ", " + book.pages);
            }
        }
    }

    //display all book titles
    void getBookTitles(Book[] books) {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book.title);
            }
        }
    }

    //book with the highest amount of pages
    void findLargestBook(Book[] books) {
        Book maxBook = new Book("placeholder", "placeholder", -1);
        for (Book book : books) {
            if (book != null && (book.pages > maxBook.pages)) {
                maxBook = book;
            }
        }
        System.out.println(maxBook.title + " is the largest book.");
    }
}
