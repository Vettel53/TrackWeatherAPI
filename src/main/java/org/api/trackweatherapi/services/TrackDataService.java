package org.api.trackweatherapi.services;

import org.api.trackweatherapi.models.RacingTrack;
import org.api.trackweatherapi.models.TrackWeather;
import org.api.trackweatherapi.repository.TrackRepository;
import org.springframework.stereotype.Service;

import javax.sound.midi.Track;
import java.util.List;

@Service
public class TrackDataService {

    private final TrackRepository trackRepository;
    private final TrackWebsiteScraper trackWebsiteScraper;

    public TrackDataService(TrackRepository trackRepository, TrackWebsiteScraper trackWebsiteScraper) {
        this.trackRepository = trackRepository;
        this.trackWebsiteScraper = trackWebsiteScraper;
    }

    public List<RacingTrack> getAllTracks() {
        return trackRepository.findAll();
    }

    public TrackWeather getTrackWeather(String trackName) {
        RacingTrack track = trackRepository.findByTrackName(trackName);
        // Track not found
        if (track == null) {
            return null;
        }

        // Scrape weather data
        String trackWebsiteUrl = track.getTrackWebsiteUrl();
        return trackWebsiteScraper.scrapeWeatherData(trackWebsiteUrl);
    }

}
