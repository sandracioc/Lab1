package p1;
import java.util.ArrayList;

public class Book {
	private String title;
    ArrayList<Author> authors = new ArrayList<>();
    ArrayList<Chapter> chapters = new ArrayList<>();
    TableOfContents tableofcontents;

    Book(String title){
        this.title = title;
    }

    void createAuthor(Author author){
        this.authors.add(author);
    }
    void createChapter(Chapter chapter){
        this.chapters.add(chapter);
    }
    void createTableOfContens(TableOfContents tableofcontents){
        this.tableofcontents = tableofcontents;
    }
    

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + title + '\'' +
                ", Authors=" + authors +
                ", Chapters=" + chapters +
                ", Table of Contents=" + tableofcontents +
                '}';
    }
}
