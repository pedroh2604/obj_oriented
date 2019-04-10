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
public class MainScreen {
    private Title title;
    private Picture picture;
    private Map map;
    private SearchInput searchInput;
    private SearchButton searchButton;

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public SearchInput getSearchInput() {
        return searchInput;
    }

    public void setSearchInput(SearchInput searchInput) {
        this.searchInput = searchInput;
    }

    public SearchButton getSearchButton() {
        return searchButton;
    }

    public void setSearchButton(SearchButton searchButton) {
        this.searchButton = searchButton;
    }

    public MainScreen(Title title, Picture picture, Map map, SearchInput searchInput, SearchButton searchButton) {
        this.title = title;
        this.picture = picture;
        this.map = map;
        this.searchInput = searchInput;
        this.searchButton = searchButton;
    }

    @Override
    public String toString() {
        return "MainScreen{" + "title=" + title + ", picture=" + picture + ", map=" + map + ", searchInput=" + searchInput + ", searchButton=" + searchButton + '}';
    }
    
    
}
