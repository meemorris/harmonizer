package com.music.music;

import java.util.List;

public class MinorKey extends Key {

    public MinorKey() {
        constructOctave();
        populateThreePianoOctavesForCalcKey();
    }


    @Override
    public List<String> calcKeyScale(int tonicStartIndex) {
        for (int i = tonicStartIndex; i < tonicStartIndex + 11; i++) {
            int wholeStep = i + 1;
            boolean halfStepCriteria = i == tonicStartIndex + 3 || i == tonicStartIndex + 8;

            if (i == tonicStartIndex || halfStepCriteria) {
                scale.add(threePianoOctaves.get(i));
            } else {
                scale.add(threePianoOctaves.get(wholeStep));
                i++;
            }
        }
        populateThreeOctavesOfKey();
        return scale;
    }

    @Override
    protected void adjustBlackKeys(Song song) {
        boolean sharpKeyCriteria = song.getKey().contains("A") || song.getKey().contains("E") && !song.getKey().contains("b")||
                song.getKey().contains("B") && !song.getKey().contains("b");
        if (song.getKey().contains("#") || sharpKeyCriteria) {
            handleMinorKeysWithSharps();
        } else {
            handleMinorKeysWithFLats(song);
        }
    }

    private void handleMinorKeysWithSharps() {
        for (int i = 0; i < threePianoOctaves.size(); i++) {
            if (threePianoOctaves.get(i).contains("#")) {
                calcSharpOctave(i);
            }
        }
    }

    private void handleMinorKeysWithFLats(Song song) {
        for (int i = 0; i < threePianoOctaves.size(); i++) {
            if (song.getKey().equals("Eb")) {
                handleEFlat(i);
            } else if (threePianoOctaves.get(i).contains("b")){
                calcFlatOctave(i);
            }
        }
    }

    private void handleEFlat(int i) {
        String value = threePianoOctaves.get(i);
        boolean isCFlat = i == 11 || i == 23;
        if (isCFlat) {
            value = threePianoOctaves.get(i + 1) + "b";
        } else if (threePianoOctaves.get(i).contains("b")) {
            value = threePianoOctaves.get(i).substring(5);
        }
        threePianoOctaves.set(i, value);
    }







}
