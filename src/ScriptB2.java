public class ScriptB2 {
    private void generateSong() {
        do {
            validInput = true;

            try {
                checkMP3FileExtension("pepito.mp2");
            }
            catch (error Error) {
                System.out.println("Cannot open file");
            }
        }
    }

    private checkMP3FileExtension(String songName) {
        // openSong()
    }

    private openSong(String songPath) {
        // if, if/else if
    }
}
