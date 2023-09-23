class Book{
    public String name;
    public String author;

    Book(String name, String author){
        this.name=name;
        this.author=author;
    }

    public String toString(){
        return "Title: " + name + ", Author: " + author;
    }
}

class Library{
    public Book books[];
    

    Library(Book books[]){
        this.books=books;            
    }

    public void listBooks(){
        System.out.println("Books in the library:");
        for(int i=0;i<books.length;i++){
            System.out.println(books[i]);
        }
    }
}

public class objectcomposition {
    public static void main(String[] args) {
        Book b1 = new Book("Jujustu kaisen", "Gege Akutami");
        Book b2 = new Book("Demon slayer", "Koyoharu Gotouge");

        // Book bookarray[] = {b1,b2};
        Book bookarray[];
        bookarray = new Book[2];
        bookarray[0]=b1;
        bookarray[1]=b2;
        Library lib = new Library(bookarray);
        lib.listBooks();
    }
    
}
