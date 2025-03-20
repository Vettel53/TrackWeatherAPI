package org.api.trackweatherapi.services;

import org.api.trackweatherapi.models.TrackWeather;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public class TrackWebsiteScraper {

    public TrackWeather scrapeWeatherData(String websiteUrl) {
        TrackWeather weatherToReturn;
        Document doc;

        try {
            doc = Jsoup.connect(websiteUrl).get();
        } catch (Exception e) {
            System.err.println("Error scraping website: " + e.getMessage());
            return null;
        }

        // <li> elements are where the tracks weather attributes are stored
        Elements allListElements = doc.select("li");
        weatherToReturn = constructTrackWeather(allListElements);

        return weatherToReturn;
    }

    private TrackWeather constructTrackWeather(Elements allListElements) {
        TrackWeather constructedWeather = new TrackWeather();

        // Extract track name and weather details
        for (Element currentListElement : allListElements) {
            // Used to split unnecessary text from attributes
            int index = currentListElement.text().indexOf("=") + 2;

            if (currentListElement.text().contains("temperature")) {
                constructedWeather.setTemperature(currentListElement.text().substring(index));
            }
            if (currentListElement.text().contains("relative humidity")) {
                constructedWeather.setRelativeHumidity(currentListElement.text().substring(index));
            }
            if (currentListElement.text().contains("uncorrected barometer")) {
                constructedWeather.setUncorrectedBarometer(currentListElement.text().substring(index));
            }
            if (currentListElement.text().contains("corrected barometer")) {
                constructedWeather.setCorrectedBarometer(currentListElement.text().substring(index));
            }
            if (currentListElement.text().contains("wind speed")) {
                constructedWeather.setWindSpeed(currentListElement.text().substring(index));
            }
            if (currentListElement.text().contains("wind direction")) {
                constructedWeather.setWindDirection(currentListElement.text().substring(index));
            }
            if (currentListElement.text().contains("dew point")) {
                constructedWeather.setDewPoint(currentListElement.text().substring(index));
            }
            if (currentListElement.text().contains("saturation pressure")) {
                constructedWeather.setSaturationPressure(currentListElement.text().substring(index));
            }
            if (currentListElement.text().contains("vapor pressure")) {
                constructedWeather.setVaporPressure(currentListElement.text().substring(index));
            }
            if (currentListElement.text().contains("grains")) {
                constructedWeather.setGrains(currentListElement.text().substring(index));
            }
            if (currentListElement.text().contains("air density (w/o water vapor)")) {
                constructedWeather.setAirDensityNoWaterVapor(currentListElement.text().substring(index));
            }
            if (currentListElement.text().contains("air density (w water vapor)")) {
                constructedWeather.setAirDensityWithWaterVapor(currentListElement.text().substring(index));
            }
            if (currentListElement.text().contains("density altitude")) {
                constructedWeather.setDensityAltitude(currentListElement.text().substring(index));
            }
        }

        return constructedWeather;
    }
}
