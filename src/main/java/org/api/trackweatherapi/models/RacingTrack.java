package org.api.trackweatherapi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tracks")
public class RacingTrack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String trackName;

    @Column(name = "website_url")
    private String trackWebsiteUrl;

    // Empty Constructor
    public RacingTrack() {

    }
    // Constructor with all three values
    public RacingTrack(Long id, String trackName, String trackWebsiteUrl) {
        this.id = id;
        this.trackName = trackName;
        this.trackWebsiteUrl = trackWebsiteUrl;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackWebsiteUrl() {
        return trackWebsiteUrl;
    }

    public void setTrackWebsiteUrl(String trackWebsiteUrl) {
        this.trackWebsiteUrl = trackWebsiteUrl;
    }
}
