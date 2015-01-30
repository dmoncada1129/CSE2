//Daniel Moncada
//Cyclometer
//January 28, 2015
//CSE2
//program to print number of minutes,counts, distance,
//and distance for 2 trips combined for bike
//define a class
public class Cyclometer{
    
    //add main method
    public static void main(String [ ] args) {
        //input data
        int secsTrip1=480; //makes the trip seconds an integer
        int secsTrip2=3220; //makes 2nd trip secs an integer
        int countsTrip1=1561; //makes the 1st trip counts integers
        int countsTrip2=9037; //same as above, but with 2nd trip
        
        double wheelDiameter=27.0, //making wheel diameter information a decimal
        PI=3.14159, //makes variable PI equal to pi value
        feetPerMile=5280, //stores value 5280 into feetpermile variable
        inchesPerFoot=12, //assigns 12 data to inchesperfoot variable
        secondsPerMinute=60; //makes secondsPerMinute equal to 60
        double distanceTrip1, distanceTrip2, totalDistance; //makes these variables decimal values
        
        System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) +" minutes and had "+
        countsTrip1 +" counts.");
        
        System.out.println("Trip 1 took" + 
            (secsTrip1/secondsPerMinute) + " minutes and had " +
            countsTrip1+ " counts.");
        System.out.println("Trip 2 took" + 
            (secsTrip2/secondsPerMinute) + " minutes and had "+
                countsTrip2 + " counts.");
                
        //run the calculations; sotre the values. 
        //document calculations here
        //calculating the distance by multiplying counts from trip1 with the wheel diameter
        //times Pi
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //gives the above distance in inches
        //for each count that the of the wheel makes
        //the diameter in inches time PI
        distanceTrip1/=inchesPerFoot*feetPerMile; //gives dist. in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; 
        totalDistance=distanceTrip1+distanceTrip2; 
        
        //print the output data
        System.out.println("Trip 1 was " + distanceTrip1+" miles");
        System.out.println("Trip 1 was " + distanceTrip2+" miles");
        System.out.println("The total distance was " + totalDistance+" miles");
        
    }
}