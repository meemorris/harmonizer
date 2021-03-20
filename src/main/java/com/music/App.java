package com.music;

import com.music.exception.TonalityException;
import com.music.music.MajorKey;
import com.music.music.MinorKey;
import com.music.music.Song;
import com.music.view.CLI;


public class App {

    private static final String MENU_OPTION_HARMONIZE_MELODY = "Enter melody to harmonize";
    private static final String MENU_OPTION_PICK_SONG = "Pick a song to harmonize";
    private static final String MENU_OPTION_QUIT = "Quit the program";
    private static final String[] MAIN_MENU_OPTIONS = { MENU_OPTION_HARMONIZE_MELODY, MENU_OPTION_PICK_SONG, MENU_OPTION_QUIT};


    private final CLI ui = new CLI();
    private final Song song = new Song();
    private final MajorKey majorKey = new MajorKey();
    private final MinorKey minorKey = new MinorKey();


    public static void main(String[] args) {
        App app = new App();
        app.run();

    }

    public void run() {
        boolean running = true;
        while (running) {
            String selection = ui.promptForSelection(MAIN_MENU_OPTIONS);
            if (selection.equals(MENU_OPTION_HARMONIZE_MELODY)) {
                handleHarmonizeMelody();
            } else if (selection.equals(MENU_OPTION_PICK_SONG)) {
//                handlePickSong();
            } else if (selection.equals(MENU_OPTION_QUIT)) {
                running = false;
            }
        }
    }

    private void handleHarmonizeMelody() {
        handleKeyTonality();
        song.setKey(ui.prompt("What key is the song in? "));
        handleAboveOrBelow();
        handleMelodyInput();
        handleMinorOrMajor();
        ui.output(song.displayMelodyAndHarmony());
        handleReset();
        ui.pauseOutput();
    }

    private void handleAboveOrBelow() {
        String response = ui.prompt("Would you like to harmonize a third above the melody or a third below the melody? ").toLowerCase();
        if (response.contains("above")) {
            song.setHarmonyDirection("Third Above");
        } else if (response.contains("below")) {
            song.setHarmonyDirection("Third Below");
        }
    }

    private void handleMelodyInput() {
        String response = ui.prompt("Please enter the notes of the melody: ");
        song.setMelodyNotes(response.split(" "));
    }

    private void handleKeyTonality() {
        boolean finished = false;
        while (!finished) {
            try {
                String response = ui.prompt("Is the key major or minor? ").toLowerCase();
                if (response.contains("major")) {
                    song.setKeyTonality("Major");
                    finished = true;
                } else if (response.contains("minor")) {
                    song.setKeyTonality("Minor");
                    finished = true;
                } else {
                    throw new TonalityException();
                }
            } catch (TonalityException e) {
                ui.output(e.getMessage());
            }
        }
    }

    private void handleMinorOrMajor() {
        if (song.getKeyTonality().equals("Minor")) {
            minorKey.calcKeyScale(minorKey.calcNotesAndTonic(song));
            song.calcHarmony(minorKey.threeOctavesOfKey);
        } else {
            majorKey.calcKeyScale(majorKey.calcNotesAndTonic(song));
            song.calcHarmony(majorKey.threeOctavesOfKey);
        }
    }

    private void handleReset() {
        if (song.getKeyTonality().equals("Minor")) {
            minorKey.reset();
        } else {
            majorKey.reset();
        }
    }


    /*
    To Do List:
    Researching APIs - database of songs, notation software, etc.
    Build out a feature to transpose songs so that users can see those songs in any key (and then the harmonies
    for that song in any key as well)
    Build out a front end
     */

}
