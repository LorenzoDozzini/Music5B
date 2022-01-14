package com.example.musica5b;

import java.util.ArrayList;

public class GestoreBrani {
    ArrayList<Song> songList;
    public GestoreBrani() {
        songList = new ArrayList<Song>();
    }

    public void addBrano(){
        Song nb = new Song();
        songList.add(nb);
    }
}
