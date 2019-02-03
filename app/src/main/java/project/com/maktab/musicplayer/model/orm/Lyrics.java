package project.com.maktab.musicplayer.model.orm;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;


@Entity
public class Lyrics {

    private String text;

    private int duration;

    @Id(autoincrement = true)
    private Long id;


    private Long songId;


    @Generated(hash = 1220473512)
    public Lyrics(String text, int duration, Long id, Long songId) {
        this.text = text;
        this.duration = duration;
        this.id = id;
        this.songId = songId;
    }


    @Generated(hash = 949589868)
    public Lyrics() {
    }


    public String getText() {
        return this.text;
    }


    public void setText(String text) {
        this.text = text;
    }


    public int getDuration() {
        return this.duration;
    }


    public void setDuration(int duration) {
        this.duration = duration;
    }


    public Long getId() {
        return this.id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Long getSongId() {
        return this.songId;
    }


    public void setSongId(Long songId) {
        this.songId = songId;
    }





}
