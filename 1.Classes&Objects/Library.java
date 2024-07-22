public class Library {
    //Attributes of library
    String libraryName;
    int availableBooks;
    int borrowedBooks;
    int returnedBooks;

    //Constructor  for the class
    public Library(String libraryName,int availableBooks,int borrowedBooks,int returnedBooks){
        this.libraryName = libraryName;
        this.availableBooks = availableBooks;
        this.borrowedBooks = borrowedBooks;
        this.returnedBooks = returnedBooks;
    }
    //method for the library class
    public void LibrayInfo(){
        System.out.println("LibraryName: "+libraryName);
        System.out.println("AvailableBooks: "+availableBooks);
        System.out.println("BorrowedBooks: "+borrowedBooks);
        System.out.println("ReturnedBooks: "+returnedBooks);
    }
    public static void main(String[] args) {
        Library Library1 = new Library("TT-National Library", 45930,3434,3434);
        Library1.LibrayInfo();
    }
}
