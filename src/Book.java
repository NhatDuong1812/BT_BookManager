public class Book implements IBook {
    public int id;
    public String name;
    public String publishDate;
    public String author;
    public String language;
    public float tbPrice;

    public Book() {
    }

    public Book(int id, String name, String publishDate, String author, String language, float tbPrice) {
        this.id = id;
        this.name = name;
        this.publishDate = publishDate;
        this.author = author;
        this.language = language;
        this.tbPrice = tbPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public float getTbPrice() {
        return tbPrice;
    }

    public void setTbPrice(float tbPrice) {
        this.tbPrice = tbPrice;
    }

    @Override
    public void display() {
//        System.out.println("---ID: " + id);
//        System.out.println("Name: " + name);
//        System.out.println("Publish Date: " + publishDate);
//        System.out.println("Author: " + author);
//        System.out.println("Language: " + language);
//        System.out.println("Price: " + tbPrice);
        System.out.println("Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", author='" + author + '\'' +
                ", language='" + language + '\'' +
                ", tbPrice=" + tbPrice +
                '}');
    }
}
