package com.music.music;

import java.util.ArrayList;
import java.util.List;

public class Song {

    private String key;
    private String keyTonality;
    private String harmonyDirection;
    private String[] melodyNotes;
    private String[] harmonyNotes;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKeyTonality() {
        return keyTonality;
    }

    public void setKeyTonality(String keyTonality) {
        this.keyTonality = keyTonality;
    }

    public String getHarmonyDirection() {
        return harmonyDirection;
    }

    public void setHarmonyDirection(String harmonyDirection) {
        this.harmonyDirection = harmonyDirection;
    }

    public String[] getMelodyNotes() {
        return melodyNotes;
    }

    public void setMelodyNotes(String[] melodyNotes) {
        this.melodyNotes = melodyNotes;
    }

    public String[] getHarmonyNotes() {
        return harmonyNotes;
    }

    public void setHarmonyNotes(String[] harmonyNotes) {
        this.harmonyNotes = harmonyNotes;
    }


    public void calcHarmony(List<String> threeOctavesOfKey) {
        List<String> songHarmony = new ArrayList<>();
        for (String melodyNote : melodyNotes) {
            int melodyStartingIndex = threeOctavesOfKey.indexOf(melodyNote) + 7;
            if (harmonyDirection.equals("Third Above")) {
                songHarmony.add(threeOctavesOfKey.get(melodyStartingIndex + 2));
            } else {
                songHarmony.add(threeOctavesOfKey.get(melodyStartingIndex - 2));
            }
        }
        harmonyNotes = new String[songHarmony.size()];
        harmonyNotes = songHarmony.toArray(harmonyNotes);
    }


    public String displayMelodyAndHarmony() {
        StringBuilder displayMusic = new StringBuilder();
        displayMusic.append("Melody ♬").append("      ").append("Harmony ♬").append(System.lineSeparator());
        displayMusic.append("━━━━━━━━━━━━━━━━━━━━━━━━━━").append(System.lineSeparator());
        for (int i = 0; i < melodyNotes.length; i++) {
            displayMusic.append(melodyNotes[i]);
            if (melodyNotes[i].length() > 1) {
                displayMusic.append("               ");
            } else {
                displayMusic.append("                ");
            }
            displayMusic.append(harmonyNotes[i]).append(System.lineSeparator());
        }
        return displayMusic.toString();
    }




}
