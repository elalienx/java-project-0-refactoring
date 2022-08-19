public class ScriptL {

    public ArrayList<Artist> albums (String filterText) {
        ArrayList<Artist> results = new ArrayList<>();

        for (Artist artist:artists) {
            if (artist.getAlbumName().contains(filterText)) {
                boolean exist = false;

                checkMatches(results);

                if (!exist) {
                    results.add(matchedValue);
                }
            }
        }

        return results;
    }

    private void checkMatches(ArrayList<Artist> results) {
        for (Artist result: results) {
            String artistAlbum = artist.getAlbumName();
            String resultAlbum = result.getAlbumName();


            if (artistAlbum.equals(resultAlbum)){
                exist = true;
                break;
            }
        }
    }
}
