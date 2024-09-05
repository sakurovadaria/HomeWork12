public class Book {
    private String nameBooks;
    private int agePublication;
    private String author;


    public Book(String nameBooks, String author, int agePublication) {

        this.nameBooks = nameBooks;
        this.agePublication = agePublication;
        this.author = author;
    }


    public int getAgePublication() {
        return this.agePublication;
    }

    public String getNameBook() {
        return this.nameBooks;
    }

    public String getAuthor() {
        return this.author;
    }


    public void setAgePublication(int agePublication) {
        this.agePublication = agePublication;
    }
}


