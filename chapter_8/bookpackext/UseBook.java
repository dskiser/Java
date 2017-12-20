//Use the Book class from bookpack
package bookpackext;

class UseBook {
    public static void main(String args[]) {
        bookpack.Book books[] = new bookpack.Book[3];

        books[0] = new bookpack.Book("Java: A Beginner's Guide", "Schildt", 2018);
        books[1] = new bookpack.Book("Divine Conspiracy", "Williard", 1984);
        books[2] = new bookpack.Book("Bible", "God", 100);

        for(int i=0; i < books.length; i++) {
            books[i].show();
        }
    }
}
