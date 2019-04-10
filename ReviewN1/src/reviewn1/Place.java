/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reviewn1;

/**
 *
 * @author lab801
 */
public class Place {
    private Coordinates coordinates;
    private String name;
    private String googlePlaceId;
    private String formattedAddress;

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGooglePlaceId() {
        return googlePlaceId;
    }

    public void setGooglePlaceId(String googlePlaceId) {
        this.googlePlaceId = googlePlaceId;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    public Place(Coordinates coordinates, String name, String googlePlaceId, String formattedAddress) {
        this.coordinates = coordinates;
        this.name = name;
        this.googlePlaceId = googlePlaceId;
        this.formattedAddress = formattedAddress;
    }

    @Override
    public String toString() {
        return "Place{" + "coordinates=" + coordinates + ", name=" + name + ", googlePlaceId=" + googlePlaceId + ", formattedAddress=" + formattedAddress + '}';
    }
    
}
