package org.api.trackweatherapi.controllers;

import org.api.trackweatherapi.models.RacingTrack;
import org.api.trackweatherapi.models.TrackWeather;
import org.api.trackweatherapi.repository.TrackRepository;
import org.api.trackweatherapi.services.TrackDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrackWeatherController {

    private final TrackDataService trackDataService;

    public TrackWeatherController(TrackDataService trackDataService, TrackRepository trackRepository) {
        this.trackDataService = trackDataService;
    }

    @GetMapping("/tracks")
    public List<RacingTrack> trackWeather() {
        return trackDataService.getAllTracks();
    }

    @GetMapping("/weather")
    public TrackWeather getWeather(@RequestParam (required = true) String trackName) {

        //System.out.println(trackName);
        return trackDataService.getTrackWeather(trackName);
    }

}
