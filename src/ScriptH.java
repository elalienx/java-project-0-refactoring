public class ScriptH {
    public void handleUserSelection(int selectedOption) {
        // 11 vs 16
        switch (selectedOption) {
            case 1:
                songsMenu();
                break;
            case 2:
                categoryMenu("Artist", "artist");
                break;
            case 3:
                categoryMenu("Albums", "album");
                break;
            case 4:
                categoryMenu("Genres", "genre");
                break;
            case 5:
                searchMenu();
                break;
        }

    }

    private void searchMenu() {
    }

    private void categoryMenu(String title, String category) {

    }

    private void songsMenu() {

    }
}
