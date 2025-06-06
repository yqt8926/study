package jdk8.lamda;

import java.util.List;

/**
 * @version V1.0.0
 * @description: 专辑，由若干曲目构成
 * @packagename: com.example.mybatisstudy.entity
 * @author: yuanqingtao
 * @date: 2024-10-27 10:45
 **/
public class Ablum {
    //专辑名称
    private String name;
    //曲目的列表
    private List<Track> tracks;
    //艺术家列表
    private List<Artist> musicians;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public List<Artist> getMusicians() {
        return musicians;
    }

    public void setMusicians(List<Artist> musicians) {
        this.musicians = musicians;
    }
}
