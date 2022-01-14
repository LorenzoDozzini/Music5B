package com.example.musica5b;

import java.util.Date;

public class Song {
    private String titolo;
    private String genere;
    private String autore;
    private Date datapublicazione;

    //public Song(String titolo, String genere, String autore, Date datapublicazione){
    //this.titolo = titolo;
    //this.genere = genere;
    //this.autore = autore;
    //this.datapublicazione = datapublicazione;
    //}

    public Song(){

    }

    public void setTitolo(String titolo){
        this.titolo = titolo;
    }
    public void setGenere(String genere){
        this.genere = genere;
    }
    public void setAutore(String autore){
        this.autore = autore;
    }
    public void setData(Date datapublicazione){
        this.datapublicazione = datapublicazione;
    }

    public String getTitolo(){
        return this.titolo;
    }
    public String getGenere(){
        return this.genere;
    }
    public String getAutore(){
        return this.autore;
    }
    public Date getData(){
        return this.datapublicazione;
    }
}
