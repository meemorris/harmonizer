package com.music.exception;

public class TonalityException extends Exception {

    public TonalityException() {
        super("Please choose either major or minor");
    }
}
