public class ScriptB1 {
    public void mainMenu(int selectedOption) {
        Helper.clearConsole();

        switch (selectedOption){
            case 1:
                System.out.println("The Song names are");
                SongSelection.displaySongNameInConsole();
                break;
            case 2:
                System.out.println("The Artist names are");
                SpotifooSelector.assignListHashset(AssetsFolderReader.artistList);
                break;
            case 3:
                System.out.println("The Album names are") ;
                SpotifooSelector.assignListHashset(AssetsFolderReader.albumList);
                break;
            case 4:
                System.out.println("The Genre are");
                SpotifooSelector.assignListHashset(AssetsFolderReader.genreList);
                break;
            case 5:
                System.out.println("Search menu");
                WordSearch.searchWordInput();
                break;
            default:
                System.out.println("Error something happend");
        }

        validInput = false;
        Helper.clearConsole();
    }
}
