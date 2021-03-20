package com.music;

import com.music.music.MajorKey;
import com.music.music.Song;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MajorKeyTests {

    @Test
    public void calcKeyScale_for_c_major() {
        //Arrange
        Song sutSong = new Song();
        MajorKey sutKey = new MajorKey();
        sutSong.setKey("C");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "C", "D", "E", "F", "G", "A", "B");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_g_major() {
        //Arrange
        Song sutSong = new Song();
        MajorKey sutKey = new MajorKey();
        sutSong.setKey("G");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "G", "A", "B", "C", "D", "E", "F#");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_d_major() {
        //Arrange
        Song sutSong = new Song();
        MajorKey sutKey = new MajorKey();
        sutSong.setKey("D");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "D", "E", "F#", "G", "A", "B", "C#");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_a_major() {
        //Arrange
        Song sutSong = new Song();
        MajorKey sutKey = new MajorKey();
        sutSong.setKey("A");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "A", "B", "C#", "D", "E", "F#", "G#");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_e_major() {
        //Arrange
        Song sutSong = new Song();
        MajorKey sutKey = new MajorKey();
        sutSong.setKey("E");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "E", "F#", "G#", "A", "B", "C#", "D#");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_b_major() {
        //Arrange
        Song sutSong = new Song();
        MajorKey sutKey = new MajorKey();
        sutSong.setKey("B");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "B", "C#", "D#", "E", "F#", "G#", "A#");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_f_sharp_major() {
        //Arrange
        Song sutSong = new Song();
        MajorKey sutKey = new MajorKey();
        sutSong.setKey("F#");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "F#", "G#", "A#", "B", "C#", "D#", "E#");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_c_sharp_major() {
        //Arrange
        Song sutSong = new Song();
        MajorKey sutKey = new MajorKey();
        sutSong.setKey("C#");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "C#", "D#", "E#", "F#", "G#", "A#", "B#");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_f_flat_major() {
        //Arrange
        Song sutSong = new Song();
        MajorKey sutKey = new MajorKey();
        sutSong.setKey("F");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "F", "G", "A", "Bb", "C", "D", "E");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_b_flat_major() {
        //Arrange
        Song sutSong = new Song();
        MajorKey sutKey = new MajorKey();
        sutSong.setKey("Bb");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "Bb", "C", "D", "Eb", "F", "G", "A");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_e_flat_major() {
        //Arrange
        Song sutSong = new Song();
        MajorKey sutKey = new MajorKey();
        sutSong.setKey("Eb");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "Eb", "F", "G", "Ab", "Bb", "C", "D");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_a_flat_major() {
        //Arrange
        Song sutSong = new Song();
        MajorKey sutKey = new MajorKey();
        sutSong.setKey("Ab");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "Ab", "Bb", "C", "Db", "Eb", "F", "G");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_d_flat_major() {
        //Arrange
        Song sutSong = new Song();
        MajorKey sutKey = new MajorKey();
        sutSong.setKey("Db");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "Db", "Eb", "F", "Gb", "Ab", "Bb", "C");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_g_flat_major() {
        //Arrange
        Song sutSong = new Song();
        MajorKey sutKey = new MajorKey();
        sutSong.setKey("Gb");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "Gb", "Ab", "Bb", "Cb", "Db", "Eb", "F");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

    @Test
    public void calcKeyScale_for_c_flat_major() {
        //Arrange
        Song sutSong = new Song();
        MajorKey sutKey = new MajorKey();
        sutSong.setKey("Cb");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "Cb", "Db", "Eb", "Fb", "Gb", "Ab", "Bb");
        //Act
        List<String> scale =sutKey.calcKeyScale(sutKey.calcNotesAndTonic(sutSong));
        //Assert
        Assert.assertEquals(expected, scale);
    }

}
