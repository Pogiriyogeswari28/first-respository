package com.jspiders.entity;

import com.jspiders.enums.MovieStatus;
import jakarta.persistence.*;

@Entity
@Table(name="movie")
public class MovieEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="title", nullable = false)
    private String title;

    @Column(name="language" ,nullable = false)
    private String language;

    @Column(name="duration" ,nullable = false)
    private Integer duration;

    @Column(name="certifaction" ,nullable = false)
    private String certifaction;

    @Enumerated(EnumType.STRING )
    @Column(name="status")
    private MovieStatus status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getCertifaction() {
        return certifaction;
    }

    public void setCertifaction(String certifaction) {
        this.certifaction = certifaction;
    }

    public MovieStatus getStatus() {
        return status;
    }

    public void setStatus(MovieStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MovieEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", language='" + language + '\'' +
                ", duration=" + duration +
                ", certifaction='" + certifaction + '\'' +
                ", status=" + status +
                '}';
    }
}
