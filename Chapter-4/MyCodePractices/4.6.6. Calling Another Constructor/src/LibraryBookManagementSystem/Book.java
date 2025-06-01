package LibraryBookManagementSystem;

 class Book {

    private String title;
    private String author;

    // Constructor 1: If only title is provided, sets a default author

    public Book(String title){
        this(title, "Unkown Author");
    }

    // Constructor 2: If both title and author are provided
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBook(){
        System.out.println("Book: " + title + " | Author: " + author);

    }
}
