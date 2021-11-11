/**
DVD Movie class
*/

public class DVDMovie implements RetailItem {

    private String title; // DVD's title
    private int runningTime; // Running time in minutes
    private double retailPrice; // Price of DVD

    /**
    Constructor
    @param dvdTitle The DVD title
    @param runTime The running time in minutes
    @param dvdPrice Price of DVD
    */

    public DVDMovie(String dvdTitle, int runTime, double dvdPrice){

        title = dvdTitle;
        runningTime = runTime;
        retailPrice = dvdPrice;

    }

    /**
    getTitle method
    @return The DVD's title
    */

    public String getTitle() {
        return title;
    }

    /**
    getRunningTime method
    @return The running time in minutes
    */

    public int getRunningTime(){
        return runningTime;
    }

    /**
    getRetailPrice method (required by RetailItem interface)
    @return The retail price of the DVD
    */

    public double getRetailPrice(){
        return retailPrice;
    }

}
