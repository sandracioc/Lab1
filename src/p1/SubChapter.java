package p1;
import java.util.ArrayList;
public class SubChapter extends Chapter{
	private String title;

    SubChapter(String title){
        this.title = title;
    }
    void createSubChapter(SubChapter subchapter){
        this.subchapters.add(subchapter);

    }

    ArrayList<Image> images = new ArrayList<>();
    ArrayList<Text> texte = new ArrayList<>();

    void addImage(Image image){
        this.images.add(image);
    }

    void addText(Text text){
        this.texte.add(text);
    }

    @Override
    public String toString() {
        return "SubChapter{" +
                "Title='" + title + '\'' +
                ", images=" + images +
                ", texte=" + texte +
                '}';
    }
}
