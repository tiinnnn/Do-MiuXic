package com.example.assignmentnhom5.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SongID")
    private Integer id;

    @Column(name = "Title", nullable = false, length = 100)
    private String title;

    @Column(name = "Duration")
    private Integer duration; // tính bằng giây

    @Column(name = "FilePath", length = 255)
    private String filePath;

    @ManyToOne
    @JoinColumn(name = "ArtistID", referencedColumnName = "ArtistID")
    private Artist artist;

    @ManyToOne
    @JoinColumn(name = "GenreID", referencedColumnName = "GenreID")
    private Genre genre;
}

