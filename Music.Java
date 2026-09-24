public class Main {
    public static void main(String[] args) {
        // Song details: titles, artists, duration (sec), play counts
        String[] titles = {"Blinding Lights", "Levitating", "Shape of You"};
        String[] artists = {"The Weeknd", "Dua Lipa", "Ed Sheeran"};
        int[] durations = {200, 203, 233};
        int[] plays = {3, 2, 1}; // hardcoded listening stats

        int totalPlaylistTime = 0;
        int totalListenTime = 0;

        System.out.println("=== PLAYLIST & STATS ===");
        for (int i = 0; i < titles.length; i++) {
            totalPlaylistTime += durations[i];
            totalListenTime += (plays[i] * durations[i]);

            System.out.println((i + 1) + ". " + artists[i] + " - " + titles[i]);
            System.out.println("   Plays: " + plays[i] + " | Total time: " + (plays[i] * durations[i]) + "s");
        }

        System.out.println("\nPlaylist Duration: " + totalPlaylistTime + " seconds");
        System.out.println("Total Listening Time: " + totalListenTime + " seconds");
    }
}