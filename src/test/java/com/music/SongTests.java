package com.music;

import com.music.music.MajorKey;
import com.music.music.Song;
import org.junit.Assert;
import org.junit.Test;

public class SongTests {

    @Test
    public void calcHarmonyThirdAbove_returns_correct_harmony_for_C_major() {
        //Arrange
        Song sutSong = new Song();
        MajorKey sutKey = new MajorKey();
        sutSong.setKey("C");
        sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        String[] melody = {"G", "A", "E", "G", "A", "G", "A", "G", "F", "G"};
        sutSong.setMelodyNotes(melody);
        String[] expected = {"B", "C", "G", "B", "C", "B", "C", "B", "A", "B"};

        //Act
        sutSong.calcHarmony(sutKey.threeOctavesOfKey);
        String[] actual = sutSong.getHarmonyNotes();

        //Assert
        Assert.assertArrayEquals(expected, actual);
        //test currently isn't working, the actual array is empty. Testing it in the app, the method works but is printing two commas
    }
}
