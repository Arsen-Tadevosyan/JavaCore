package porcarkumner.musicStudia.Storage;

import porcarkumner.musicStudia.Autor_Music.Author;
import porcarkumner.musicStudia.Autor_Music.Music;

public class StorageMusic {
    Music[] musics = new Music[10];
    private int size;

    public void add(Music music) {
        if (musics.length == size) {
            extend();
        }
        musics[size++] = music;
    }

    public void extend() {
        Music[] tmp = new Music[musics.length + 10];
        System.arraycopy(musics, 0, tmp, 0, size);
        musics = tmp;
    }

    public Music getById(String musicId) {
        for (int i = 0; i < size; i++) {
            if (musics[i].getId().equals(musicId)) {
                return musics[i];
            }
        }
        return null;
    }

    public void printAllMusics() {
        for (int i = 0; i < size; i++) {
            System.out.println(musics[i]);
        }
    }

    public void getByAuthor(Author author) {
        for (int i = 0; i < size; i++) {
            if (musics[i].getAuthor().equals(author)) {
                System.out.println(musics[i]);
            }
        }
    }

    public void getByLanguage(String langauage) {
        for (int i = 0; i < size; i++) {
            if (musics[i].getLanguege().equals(langauage)) {
                System.out.println(musics[i]);
            }
        }
    }

    public void deleteById(String id) {
        int indexById = getIndexById(id);
        if (indexById == -1) {
            System.out.println("dose not exsists");
        }
        for (int i = indexById; i < size; i++) {
            musics[i - 1] = musics[i];
        }
        size--;
    }

    private int getIndexById(String id) {
        for (int i = 0; i < size; i++) {
            if (musics[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

}
