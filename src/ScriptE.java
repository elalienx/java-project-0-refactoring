class SongInfo {
    private String songName;
    private String artist;
    private String albumName;
    private String songFile;
    private String image;
    private String genre;

    public SongInfo(String songName, String artist, String albumName , String songFile, String image, String genre) {
        this.songName = songName;
        this.artist = artist;
        this.albumName = albumName;
        this.songFile = songFile;
        this.image = image;
        this.genre = genre;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtist() {
        return this.artist;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getSongFile() {
        return songFile;
    }

    public String getImage() {
        return image;
    }

    public String getGenre() {
        return genre;
    }
}