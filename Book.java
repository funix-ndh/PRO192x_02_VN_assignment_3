/**
 * Book
 */
class Book {
    private String id;
    private String title;
    private String author;
    private boolean isBorrowed;

    /**
     * empty constructor
     */
    Book() {
    }

    /**
     * @param id
     * @param title
     * @param author
     * @param isBorrowed
     */
    Book(final String id, final String title, final String author, final boolean isBorrowed) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }

    /**
     * @return the id
     */
    String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    void setId(final String id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    void setTitle(final String title) {
        this.title = title;
    }

    /**
     * @return the author
     */
    String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    void setAuthor(final String author) {
        this.author = author;
    }

    /**
     * @return the isBorrowed
     */
    boolean isBorrowed() {
        return isBorrowed;
    }

    /**
     * @param isBorrowed the isBorrowed to set
     */
    void setBorrow(final boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    @Override
    public String toString() {
        return String.format("%-10s%-40s%-20s%-20b", id, title, author, isBorrowed);
    }
}
