package FourthWeek;

//Create a Book class with attribute like title, author and isAvailable. Write methods to lend a book and return it.
//Ensure a book cannot be lent if it is already borrowed

class Book{
    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public void lend(){
        if(isAvailable){
            isAvailable = false;
            System.out.println("You have successfully lent the book");
        }
        else{
            System.out.println("You can't lent"+ title + "book");
        }
    }
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Thank you for returning the book: " + title);
        } else {
            System.out.println("The book '" + title + "' was not borrowed.");
        }
    }

    // Getters for the attributes
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        book1.lend(); // Should succeed
        book1.lend(); // Should fail (already borrowed)

        // Return the book
        book1.returnBook(); // Should succeed
        book1.returnBook();
    }
}
