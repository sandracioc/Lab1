package p1;
import java.util.ArrayList;
public class Chapter extends Book{
	private String name;
    public Book() {
	}
	public Chapter(String name) {
		this.name = name;
	};
	

	ArrayList<SubChapter> subchapters = new ArrayList<>();

    void createSubChapter(SubChapter subchapter){
        subchapters.add(subchapter);
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "Name='" + name + '\'' +
                ", subchapters=" + subchapters +
                '}';
    }
}
