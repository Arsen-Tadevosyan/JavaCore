package porcarkumner.musicStudia.Autor_Music;

import java.util.Date;

public class Music {

    private Author author;
    private String id;
    private String MusicName;
    private String languege;
    private String Style;
    private Date registerDate;

    public Music(Author author, String id, String musicName, String languege, String style, Date registerDate) {
        this.author = author;
        this.id = id;
        MusicName = musicName;
        this.languege = languege;
        Style = style;
        this.registerDate = registerDate;
    }

    public Music() {
    }

    @Override
    public String toString() {
        return "Music{" +
                "author=" + author +
                ", id='" + id + '\'' +
                ", MusicName='" + MusicName + '\'' +
                ", languege='" + languege + '\'' +
                ", Style='" + Style + '\'' +
                ", registerDate=" + registerDate +
                '}';
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMusicName() {
        return MusicName;
    }

    public void setMusicName(String musicName) {
        MusicName = musicName;
    }

    public String getLanguege() {
        return languege;
    }

    public void setLanguege(String languege) {
        this.languege = languege;
    }

    public String getStyle() {
        return Style;
    }

    public void setStyle(String style) {
        Style = style;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
}