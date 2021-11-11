/**
Compact Disc class
*/

public class CompactDisc implements RetailItem {

    private String title; // CD's title
    private String artist; // CD's artist
    private double retailPrice; // CD's retail price

    /**
    Constructor
    @param cdTitle Title of CD
    @param cdArtist Name of the artist
    @param cdPrice Price of CD
    */

    public CompactDisc(String cdTitle, String cdArtist, double cdPrice){

        title = cdTitle;
        artist = cdArtist;
        retailPrice = cdPrice;
    }

    /**
    getTitle method
    @return The CD's title
    */

    public String getTitle(){
        return title;
    }

    /**
    getArtist method
    @return The name of the artist
    */

    public String getArtist(){
        return artist;
    }

    /**
    getRetailPrice method (required by RetailItem interface)
    @return The retail price of the CD
    */

    public double getRetailPrice(){
        return retailPrice;
    }

}
