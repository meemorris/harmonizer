package com.music;

import com.music.music.MinorKey;
import com.music.music.Song;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinorKeyTests {

    @Test
    public void calcKeyScale_for_a_minor() {
        //Arrange
        Song sutSong = new Song();
        MinorKey sutKey = new MinorKey();
        sutSong.setKey("A");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "A", "B", "C", "D", "E", "F", "G");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_e_minor() {
        //Arrange
        Song sutSong = new Song();
        MinorKey sutKey = new MinorKey();
        sutSong.setKey("E");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "E", "F#", "G", "A", "B", "C", "D");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_b_minor() {
        //Arrange
        Song sutSong = new Song();
        MinorKey sutKey = new MinorKey();
        sutSong.setKey("B");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "B", "C#", "D", "E", "F#", "G", "A");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_f_sharp_minor() {
        //Arrange
        Song sutSong = new Song();
        MinorKey sutKey = new MinorKey();
        sutSong.setKey("F#");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "F#", "G#", "A", "B", "C#", "D", "E");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_c_sharp_minor() {
        //Arrange
        Song sutSong = new Song();
        MinorKey sutKey = new MinorKey();
        sutSong.setKey("C#");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "C#", "D#", "E", "F#", "G#", "A", "B");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_g_sharp_minor() {
        //Arrange
        Song sutSong = new Song();
        MinorKey sutKey = new MinorKey();
        sutSong.setKey("G#");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "G#", "A#", "B", "C#", "D#", "E", "F#");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_e_flat_minor() {
        //Arrange
        Song sutSong = new Song();
        MinorKey sutKey = new MinorKey();
        sutSong.setKey("Eb");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "Eb", "F", "Gb", "Ab", "Bb", "Cb", "Db");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_b_flat_minor() {
        //Arrange
        Song sutSong = new Song();
        MinorKey sutKey = new MinorKey();
        sutSong.setKey("Bb");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "Bb", "C", "Db", "Eb", "F", "Gb", "Ab");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_f_minor() {
        //Arrange
        Song sutSong = new Song();
        MinorKey sutKey = new MinorKey();
        sutSong.setKey("F");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "F", "G", "Ab", "Bb", "C", "Db", "Eb");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_c_minor() {
        //Arrange
        Song sutSong = new Song();
        MinorKey sutKey = new MinorKey();
        sutSong.setKey("C");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "C", "D", "Eb", "F", "G", "Ab", "Bb");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_g_minor() {
        //Arrange
        Song sutSong = new Song();
        MinorKey sutKey = new MinorKey();
        sutSong.setKey("G");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "G", "A", "Bb", "C", "D", "Eb", "F");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_d_minor() {
        //Arrange
        Song sutSong = new Song();
        MinorKey sutKey = new MinorKey();
        sutSong.setKey("D");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "D", "E", "F", "G", "A", "Bb", "C");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }
}
