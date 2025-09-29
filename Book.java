/**
 * GDEV-242-51
 * P2 - Book
 * 
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author edited by Franco Acosta
 * @version (09/24/25.)
 */
class Book
{
    // The fields, added int field pages for 2.85
    private String author;
    private String title;
    private int pages;
    private String refNumber; //Added field for 2.88
    private int burrowed = 0; // Added field for 2.91
    private boolean courseText; // Added field for 2.92
    
    /**
     * CONSTRUCTOR
     * asks user for String bookAuthor & bookTitle, int pages , and boolean courseBook.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean courseBook)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        courseText = courseBook;
    }

    /* 2.83
     * Accessor method for String author.
     */
    public String getAuthor()
    {
        return author;
    }
    
    /* 2.83
     * Accesor method for String title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /* 2.91
     * Method to increment int burrowed by 1 each time the method is called.
     */
    public void burrow()
    {
        burrowed += 1;
    }
    
    /* 2.91
     * Accessor added to return amount of times burrow() has been called in an instance.
     */
    public int getBurrowed()
    {
        return burrowed;
    }
    
    /* 2.84
     * Non-return method to print author to terminal.
     */
    public void printAuthor()
    {
        System.out.println("The author of the book is: " + author);
    }
    
    /* 2.84
     * Non-return method to print title to terminal.
     */
    public void printTitle()
    {
        System.out.println("The title of the book is: " + title);
    }
    
    /* 2.85
     * Accessor method for int pages.
     */
    public int getPages()
    {
        return pages;
    }
    
    /* 2.92
     * Accesor method that returns boolean courseText from constructor parameter.
     */
    public boolean isCourseText()
    {
        return courseText;
    }
    
    /* 2.87
     * Non-return method to print object/book's details to terminal.
     */
    public void printDetails()
    {
        System.out.println("This book is titled '" + title + "' by " + author + " and it has " + pages + " pages.");
        System.out.println("It has been burrowed " + burrowed + " times.");
        if ( refNumber.length() > 0 ){ // Added conditional statement for 2.89
            System.out.println("The reference number is " + refNumber);
        }
        else{
            System.out.println("The reference number is 'ZZZ'");
        }
    }
    
    /* 2.88
     * Create set & get method for String field refNumber.
     */
    public void setRefNumber(String ref)
    {
        if ( ref.length() < 3 ) { // 2.90 - Added conditional statement for refNumber to have at least 3 String characters.
            System.out.println("Error, reference number must have at least 3 characters.");
        }
        else {
            refNumber = ref ;
        }
    } 
    public String getRefNumber()
    {
        return refNumber;
    }
}
// End of editor.