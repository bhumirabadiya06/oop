 import java.util.LinkedList;

public class prac31 {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();

        // 1. Add songs
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");

        // 2. Display full playlist
        System.out.println("Full Playlist: " + playlist);

        // 3. Play first song (remove from front)
        String firstSong = playlist.removeFirst();
        System.out.println("Now Playing: " + firstSong);
        System.out.println("Playlist after playing first song: " + playlist);

        // 4. Skip last song (remove from end)
        String lastSong = playlist.removeLast();
        System.out.println("Skipped Song: " + lastSong);
        System.out.println("Playlist after skipping last song: " + playlist);
    }
}
