package com.example.songapplication;

public class Song {
    private String singerName;
    private String songName;
    private String imageName;
    private int time;

    public Song(String singerName, String songName, String imageName, int time) {
        this.singerName = singerName;
        this.songName = songName;
        this.imageName = imageName;
        this.time = time;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Song{" +
                "singerName='" + singerName + '\'' +
                ", songName='" + songName + '\'' +
                ", imageName='" + imageName + '\'' +
                ", time=" + time +
                '}';
    }
}
