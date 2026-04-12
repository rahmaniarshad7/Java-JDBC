 class Book {
    static int totalNoOfBooks;
    String tile;
    String author;
    String isbn;
    boolean isBookAvilable;

    static {
        totalNoOfBooks = 0;
    }
    Book(String tile , String author , String isbn){
        this.tile = tile;
        this.author = author;
        this.isbn = isbn;
    }

    public int borrowBook(){
        return 0;
    }
    public int returnBook(){
        return 0;
    }

}
