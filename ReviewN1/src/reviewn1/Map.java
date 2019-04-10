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
public class Map {
    private Coordinates coordinates;
    private Size size;
    private Place[] places = new Place[2];

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Place[] getPlaces() {
        return places;
    }

    public void setPlaces(Place[] places) {
        this.places = places;
    }

    public Map(Coordinates coordinates, Size size) {
        this.coordinates = coordinates;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Map{" + "coordinates=" + coordinates + ", size=" + size + ", places=" + places + '}';
    }
    
    
    
}
