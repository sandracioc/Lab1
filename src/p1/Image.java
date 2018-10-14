package p1;

public class Image extends SubChapter{
	private String imgPath;

    Image(String imgPath){
        this.imgPath = imgPath;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    @Override
    public String toString() {
        return "Image{" +
                "imgPath='" + imgPath + '\'' +
                '}';
    }
}
