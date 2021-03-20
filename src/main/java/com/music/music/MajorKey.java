package com.music.music;

import java.util.List;

public class MajorKey extends Key {


    public MajorKey() {
        constructOctave();
        populateThreePianoOctavesForCalcKey();
    }

    @Override
    public List<String> calcKeyScale(int tonicStartIndex) {
        for (int i = tonicStartIndex; i < tonicStartIndex + 12; i++) {
            int wholeStep = i + 1;
            boolean wholeStepCriteria = i <= tonicStartIndex + 3 && i > tonicStartIndex || i > tonicStartIndex + 5;

            if (wholeStepCriteria) {
                scale.add(threePianoOctaves.get(wholeStep));
                i++;
            } else {
                scale.add(threePianoOctaves.get(i));
            }
        }
        populateThreeOctavesOfKey();
        return scale;
    }

    @Override
    protected void adjustBlackKeys(Song song) {
        if (song.getKey().contains("b") || song.getKey().equals("F")) {
            handleMajorKeysWithFlats(song);
        } else {
            handleMajorKeysWithSharps(song);
        }
    }


    private void handleMajorKeysWithSharps(Song song) {
        for (int i = 0; i < threePianoOctaves.size(); i++) {
            if (song.getKey().equals("F#")) {
                handleFSharp(i);
            } else if (song.getKey().equals("C#")) {
                handleCSharp(i);
            } else if (threePianoOctaves.get(i).contains("#")) {
                calcSharpOctave(i);
            }
        }
    }

    private void handleMajorKeysWithFlats(Song song) {
        for (int i = 0; i < threePianoOctaves.size(); i++) {
            if (song.getKey().equals("Gb")) {
                handleGFlat(i);
            } else if (song.getKey().equals("Cb")) {
                handleCFlat(i);
            } else if (threePianoOctaves.get(i).contains("b")) {
                calcFlatOctave(i);
            }
        }
    }

    private void handleFSharp(int i) {
        String value = threePianoOctaves.get(i);
        boolean isESharp = i == 5 || i == 17;
        if (isESharp) {
            value = threePianoOctaves.get(i - 1) + "#";
        } else if (threePianoOctaves.get(i).contains("#")) {
            value = threePianoOctaves.get(i).substring(0, 2);
        }
        threePianoOctaves.set(i, value);
    }

    private void handleCSharp(int i) {
        String value = threePianoOctaves.get(i);
        boolean isESharpOrBSharp = i == 5 || i == 17 || i == 12 || i == 24;
        if (isESharpOrBSharp) {
            value = threePianoOctaves.get(i - 1) + "#";
        } else if (threePianoOctaves.get(i).contains("#")){
            value = threePianoOctaves.get(i).substring(0, 2);
        }
        threePianoOctaves.set(i, value);
    }

    private void handleGFlat(int i) {
        String value = threePianoOctaves.get(i);
        boolean isCFlat = i == 11 || i == 23;
        if (isCFlat) {
            value = threePianoOctaves.get(i + 1) + "b";
        } else if (threePianoOctaves.get(i).contains("b")){
            value = threePianoOctaves.get(i).substring(5);
        }
        threePianoOctaves.set(i, value);
    }

    private void handleCFlat(int i) {
        String value = threePianoOctaves.get(i);
        boolean isCFlat = i == 11 || i == 23;
        boolean isFFlat = i == 4 || i == 16;
        if (isCFlat || isFFlat) {
            value = threePianoOctaves.get(i + 1) + "b";
        } else if (threePianoOctaves.get(i).contains("b")){
            value = threePianoOctaves.get(i).substring(5);
        }
        threePianoOctaves.set(i, value);
    }

}
