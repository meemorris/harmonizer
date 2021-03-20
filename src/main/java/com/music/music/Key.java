package com.music.music;

import java.util.ArrayList;
import java.util.List;

public abstract class Key {

    protected final List<String> pianoOctave = new ArrayList<>();
    protected List<String> scale = new ArrayList<>();
    protected List<String> threePianoOctaves = new ArrayList<>();
    public List<String> threeOctavesOfKey = new ArrayList<>();

    public void constructOctave() {
        pianoOctave.add("C");
        pianoOctave.add("C# / Db");
        pianoOctave.add("D");
        pianoOctave.add("D# / Eb");
        pianoOctave.add("E");
        pianoOctave.add("F");
        pianoOctave.add("F# / Gb");
        pianoOctave.add("G");
        pianoOctave.add("G# / Ab");
        pianoOctave.add("A");
        pianoOctave.add("A# / Bb");
        pianoOctave.add("B");
    }

    public void populateThreePianoOctavesForCalcKey() {
        threePianoOctaves.addAll(pianoOctave);
        threePianoOctaves.addAll(pianoOctave);
        threePianoOctaves.addAll(pianoOctave);
    }

    public int calcNotesAndTonic(Song song) {
        adjustBlackKeys(song);
        return threePianoOctaves.indexOf(song.getKey());
    }

    protected void calcSharpOctave(int i) {
        String newValue = threePianoOctaves.get(i).substring(0, 2);
        threePianoOctaves.set(i, newValue);
    }

    protected void calcFlatOctave(int i) {
        String newValue = threePianoOctaves.get(i).substring(5);
        threePianoOctaves.set(i, newValue);
    }

    protected void populateThreeOctavesOfKey() {
        threeOctavesOfKey.addAll(scale);
        threeOctavesOfKey.addAll(scale);
        threeOctavesOfKey.addAll(scale);
    }

    public void reset() {
        threePianoOctaves.clear();
        populateThreePianoOctavesForCalcKey();
        threeOctavesOfKey.clear();
        scale.clear();
    }


    public abstract List<String> calcKeyScale(int tonicStartIndex);

    protected abstract void adjustBlackKeys(Song song);



}
