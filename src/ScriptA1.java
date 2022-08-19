public class ScriptA1 {
    private void processMenuOption(String mainMenuSelectedOption) {
        int optionsCount = SpotifooModel.MAIN_MENU_OPTIONS_COUNT;
        boolean isValidInput = this.spotifooModel.isUserInputValid(mainMenuselectedoption, optionsCount);

        if (isValidInput) {
            int mainMenuSelectionOption = Integer.parseInt(mainMenuSelectedOption);
            this.spotifooView.flushScreen();

            switch (mainMenuSelectionOption) {
                case 1:
                    generateSongsMenu("Songs avaialable");
                    break;
                case 2:
                    generateCategoryMenu("Artist available", this.spotifooModel.ARTIST);
                    break;
                case 3:
                    generateCategoryMenu("Albums", this.spotifooModel.ALBUM);
                    break;
                case 4:
                    generateCategoryMenu("Music genres", this.spotifooModel.GENRE);
                case 5:
                    generateSearchMenu("Search menu");
                default:
            }
        }
    }

    private void generateSearchMenu(String search_menu) {
        System.out.println("Search menu");
    }

    private void generateSongsMenu(String title) {
        this.spotifooView.print(title, true);
        displaySongList(this.spotifooModel.getSongs());
    }

    private void generateCategoryMenu(String title, String category) {
            List<Song> songs = this.spotifooModel.getSongs();
            Map<string, List<Song>> songMapByCategory = this.spotifooModel.groupSongListByFilter(songs, category);
            final List<String> categoryList = songMapByCategory.keySet().stream().collect(toList());
            String selectedCategory = this.spotifooModel.getUserInput();
            int selectedOptionInCategoryMenu = Integer.parseInt(selectedCategory);

            this.spotifooView.print(title, true);
            this.spotifooModel.showOptionListWithIndexes(categoryList);
            this.spotifooView.showOptionPromptO();

            if (!this.spotifooModel.isUserInputValid(selectedCategory, categoryList.size())) {
                this.spotifooView.showWarning();
                this.spotifooView.showOptionPrompt();
                selectedCategory = this.spotifooModel.getUserInput();
            }

            printSongList(songMapByCategory, categoryList, selectedOptionInCategoryMenu);
    }
}
