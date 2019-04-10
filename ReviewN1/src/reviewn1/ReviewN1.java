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
public class ReviewN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Position titlePosition = new Position(10,20);
        Title title = new Title(titlePosition, "red", "The most awesome app ever");
        
        Size pictureSize = new Size(30,10);
        Picture picture = new Picture("google.com/images/myImage.jpg", pictureSize);
        
        Size mapSize = new Size(40,15);
        Coordinates mapCoordinates = new Coordinates(-23.558950, -46.658932);
        Coordinates firstPlaceCoordinates = new Coordinates(-23.557636, -46.660418);
        Coordinates secondPlaceCoordinates = new Coordinates(-23.558082, -23.558082);
        Place firstPlace = new Place(firstPlaceCoordinates, "A Building", "hsadhashhsahsad7327hsafd", "Avenida Paulista, 2200");
        Place secondPlace = new Place(secondPlaceCoordinates, "Another Building", "34jsd8k@!jnfgjhdfg", "Avenida Paulista, 2100");
        Place[] mapPlaces = new Place[] {firstPlace, secondPlace};
        Map map = new Map(mapCoordinates, mapSize);
        map.setPlaces(mapPlaces);
        
        Size searchInputSize = new Size(10,5);
        Position searchInputPosition = new Position(50,60);
        SearchInput searchInput = new SearchInput("insert a place name here", searchInputSize, "Arial Bold", "black", searchInputPosition);
        
        SearchButton searchButton = new SearchButton();
        
        MainScreen mainScreen = new MainScreen(title, picture, map, searchInput, searchButton);
        
        System.out.println(mainScreen);
    }
    
}
