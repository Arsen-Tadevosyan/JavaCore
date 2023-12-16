package trials.musicStudia;

import trials.musicStudia.Autor_Music.Author;
import trials.musicStudia.Autor_Music.Music;
import trials.musicStudia.Storage.StorageAuthor;
import trials.musicStudia.Storage.StorageMusic;

import java.util.Date;
import java.util.Scanner;

public class StudiaTest implements Command {
    static Scanner scanner = new Scanner(System.in);
    static StorageAuthor storageAuthor = new StorageAuthor();
    static StorageMusic storageMusic = new StorageMusic();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Command.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case ADD_MUSIC:
                    addMusic();
                    break;
                case PRINT_ALL_AUTHORS:
                    storageAuthor.printAllAuthors();
                    break;
                case PRINT_ALL_MUSICS:
                    storageMusic.printAllMusics();
                    break;
                case SEARCH_MUSICS_BY_AUTHOR:
                    searchMusicByAuthor();
                    break;
                case SEARCH_MUSICS_BY_LENGUAGE:
                    searchMusicByLanguage();
                    break;
                case SEARCH_MUSICS_BY_ID:
                    searchMusicById();
                    break;
                case DELETE_MUSIC_BY_ID:
                    deleteMusicById();
                    break;
                case DELETE_AUTHOR_BY_ID:
                    deleteAuthorById();
                    break;
                default:
                    System.err.println("invalide command. try again");
            }
        }

    }

    private static void deleteAuthorById() {
        System.out.println("please choose author id");
        storageAuthor.printAllAuthors();
        String id = scanner.nextLine();
        Author authorFromStorage = storageAuthor.getById(id);
        if (authorFromStorage == null) {
            System.out.println("that author dose not exists");
            return;
        }
        storageAuthor.deleteById(authorFromStorage.getId());
    }

    private static void deleteMusicById() {
        System.out.println("please choose  music id ");
        storageMusic.printAllMusics();
        String musicId = scanner.nextLine();
        Music musicFromSorage = storageMusic.getById(musicId);
        if (musicFromSorage == null) {
            System.out.println("that music exsists");
            return;
        }
        storageMusic.deleteById(musicFromSorage.getId());
    }

    private static void searchMusicById() {
        System.out.println("please input music Id");
        String musicId = scanner.nextLine();
        System.out.println(storageMusic.getById(musicId));
    }

    private static void searchMusicByLanguage() {
        System.out.println("please input language ");
        String langauage = scanner.nextLine();
        storageMusic.getByLanguage(langauage);
    }

    private static void searchMusicByAuthor() {
        storageAuthor.printAllAuthors();
        System.out.println("please input author id. " +
                "songs by the author you want");
        String autorId = scanner.nextLine();
        Author authorFromStorage = storageAuthor.getById(autorId);
        if (authorFromStorage == null) {
            System.out.println("that author dose not exists");
            return;
        }
        storageMusic.getByAuthor(authorFromStorage);
    }


    private static void addMusic() {
        System.out.println("please choose author id");
        storageAuthor.printAllAuthors();
        String id = scanner.nextLine();
        Author authorFromStorage = storageAuthor.getById(id);
        if (authorFromStorage == null) {
            System.out.println("that author dose not exists");
            return;
        }
        System.out.println("please input music id ");
        String musicId = scanner.nextLine();
        Music musicFromSorage = storageMusic.getById(musicId);
        if (musicFromSorage != null) {
            System.out.println("that music exsists");
            return;
        }
        System.out.println("please input musicName");
        String musicName = scanner.nextLine();
        System.out.println("please input language music");
        String language = scanner.nextLine();
        System.out.println("please input style");
        String style = scanner.nextLine();
        Music music = new Music(authorFromStorage, musicId,
                musicName, language, style, new Date());
        storageMusic.add(music);
        System.err.println("music is registred");
    }

    private static void addAuthor() {
        System.out.println("please input Autor id");
        String autorId = scanner.nextLine();
        Author authorFromStorage = storageAuthor.getById(autorId);
        if (authorFromStorage != null) {
            System.err.println("that author exists");
            return;
        }
        System.out.println("please input author name");
        String name = scanner.nextLine();
        System.out.println("please input autor surname");
        String surname = scanner.nextLine();
        System.out.println("please input number phone");
        String phone = scanner.nextLine();
        System.out.println("please input email or gmail");
        String email = scanner.nextLine();
        System.out.println("please input instagram ");
        String instaram = scanner.nextLine();
        System.out.println("please input facebook");
        String facebook = scanner.nextLine();
        System.out.println("please input spotify");
        String sptify = scanner.nextLine();
        Author author = new Author(autorId, name, surname, phone, email
                , instaram, facebook, sptify);
        storageAuthor.add(author);
        System.err.println("Author is registred");
    }
}
