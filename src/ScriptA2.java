public class ScriptA2 {
    public static Map<String, List<Song>> groupSongListByFilter(List<Song> songs, String filterName) {
        LinkedHashMap<String, List<Song>> filteredSongs = new LinkedHashMap<>();

        switch(filterName) {
            case SONG:
                filteredSongs = songList.stream().collect(Collectors.groupingBy(getName, new, toList()));
                break;
        }
    }
}
