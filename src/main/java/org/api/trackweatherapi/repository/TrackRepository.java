package org.api.trackweatherapi.repository;

import org.api.trackweatherapi.models.RacingTrack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRepository extends JpaRepository<RacingTrack, Long> {
    RacingTrack findByTrackName(String trackName);
    RacingTrack findByTrackWebsiteUrl(String trackWebsiteUrl);
}
