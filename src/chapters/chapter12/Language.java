package chapters.chapter12;

public enum Language {

    HY("hayeren"),
    RU,
    ENG("angleren");

    private String  languageName;

    Language(String languageName) {
        this.languageName = languageName;
    }

    public String getLanguageName() {
        return languageName;
    }

    Language() {
    }
}
