//Demonstrate protected
package bookpackext;

class ExtBook extends bookpack.Book {
    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() { return publisher;}
    public void setPublisher(String p) { publisher = p; }

    public String getTitle() { return title; }
    public void setTitle(String t) { title = t; }
    public String getAuthor() { return author; }
    public void setAuthor(String a) { author = a;}
    public int getPubDate() { return pubDate; }
    public void setPubDate(int d) { pubDate = d; }
}

class ProtectDemo {
    public static void main(String args[]) {
        ExtBook books[] = new ExtBook[3];

        books[0] = new ExtBook("Java: A Beginner's Guide", "Schildt", 2018, "Oracle Press");
        books[1] = new ExtBook("Divine Conspiracy", "Williard", 1984, "Zondervan");
        books[2] = new ExtBook("Bible", "God", 100, "Zondervan");

        System.out.println("Showing all books by Williard.");
        for(int i=0; i < books.length; i++)
            if(books[i].getAuthor() == "Williard")
                System.out.println(books[i].getTitle());
    }
}
