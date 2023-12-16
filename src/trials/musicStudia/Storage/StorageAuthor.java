package trials.musicStudia.Storage;

import trials.musicStudia.Autor_Music.Author;

public class StorageAuthor {

    Author[] authors = new Author[10];
    private int size;

    public void add(Author author) {
        if (size == authors.length) {
            extend();
        }
        authors[size++] = author;
    }

    public void extend() {
        Author[] tmp = new Author[authors.length + 10];
        System.arraycopy(authors, 0, tmp, 0, size);
        authors = tmp;
    }

    public Author getById(String Id) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getId().equals(Id)) {
                return authors[i];
            }
        }
        return null;
    }

    public void printAllAuthors() {
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i]);
        }
    }

    public void deleteById(String id) {
        int indexById = getIndexById(id);
        if (indexById == -1) {
            System.out.println("dose not exsists");
        }
        for (int i = indexById; i < size; i++) {
            authors[i - 1] = authors[i];
        }
        size--;
    }

    private int getIndexById(String id) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

}
