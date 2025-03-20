package org.api.trackweatherapi.models;

public class TrackWeather {

    private String temperature;
    private String relativeHumidity;
    private String uncorrectedBarometer;
    private String correctedBarometer;
    private String windSpeed;
    private String windDirection;
    private String dewPoint;
    private String saturationPressure;
    private String vaporPressure;
    private String grains;
    private String airDensityNoWaterVapor;
    private String airDensityWithWaterVapor;
    private String densityAltitude;

    public TrackWeather() {

    }

    public TrackWeather(String densityAltitude, String airDensityWithWaterVapor, String airDensityNoWaterVapor, String grains, String vaporPressure, String saturationPressure, String dewPoint, String windDirection, String windSpeed, String correctedBarometer, String uncorrectedBarometer, String relativeHumidity, String temperature) {
        this.densityAltitude = densityAltitude;
        this.airDensityWithWaterVapor = airDensityWithWaterVapor;
        this.airDensityNoWaterVapor = airDensityNoWaterVapor;
        this.grains = grains;
        this.vaporPressure = vaporPressure;
        this.saturationPressure = saturationPressure;
        this.dewPoint = dewPoint;
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
        this.correctedBarometer = correctedBarometer;
        this.uncorrectedBarometer = uncorrectedBarometer;
        this.relativeHumidity = relativeHumidity;
        this.temperature = temperature;
    }

    public String getGrains() {
        return grains;
    }

    public void setGrains(String grains) {
        this.grains = grains;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(String relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public String getUncorrectedBarometer() {
        return uncorrectedBarometer;
    }

    public void setUncorrectedBarometer(String uncorrectedBarometer) {
        this.uncorrectedBarometer = uncorrectedBarometer;
    }

    public String getCorrectedBarometer() {
        return correctedBarometer;
    }

    public void setCorrectedBarometer(String correctedBarometer) {
        this.correctedBarometer = correctedBarometer;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(String dewPoint) {
        this.dewPoint = dewPoint;
    }

    public String getSaturationPressure() {
        return saturationPressure;
    }

    public void setSaturationPressure(String saturationPressure) {
        this.saturationPressure = saturationPressure;
    }

    public String getVaporPressure() {
        return vaporPressure;
    }

    public void setVaporPressure(String vaporPressure) {
        this.vaporPressure = vaporPressure;
    }

    public String getAirDensityNoWaterVapor() {
        return airDensityNoWaterVapor;
    }

    public void setAirDensityNoWaterVapor(String airDensityNoWaterVapor) {
        this.airDensityNoWaterVapor = airDensityNoWaterVapor;
    }

    public String getAirDensityWithWaterVapor() {
        return airDensityWithWaterVapor;
    }

    public void setAirDensityWithWaterVapor(String airDensityWithWaterVapor) {
        this.airDensityWithWaterVapor = airDensityWithWaterVapor;
    }

    public String getDensityAltitude() {
        return densityAltitude;
    }

    public void setDensityAltitude(String densityAltitude) {
        this.densityAltitude = densityAltitude;
    }
}
