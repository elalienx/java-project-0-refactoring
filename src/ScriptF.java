class MainMenu {
    public void showMenu() {
        SearchFilter searchFilter = new SearchFilter();

        searchFilter.searchBy();
    }
}

class SearchFilter {
    private ArrayList<String> songsDisplay;

    // This method search the song using keyword provided by user and plays the song
    public void searchBy() {
        // Data
        songsDisplay = SearchSong.search();

        // Actions
        System.out.println("Search for a song a song:");
        System.out.print("Write the name of a song and press enter:");
        SongPlay.playSong(songsDisplay);
    }
}