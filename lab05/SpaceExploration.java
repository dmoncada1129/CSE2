//Daniel Moncada
//CSE2
//Space Exploration lab
//lab05
//2.17.15

import java.text.DecimalFormat; //importing decimalclass
import java.util.Random; //importing random class
import java.lang.Math; //impoting math lang class

public class SpaceExploration {
        
        public static void main (String [ ] args) {
                
                double year1 = ((Math.random())*10)+2000;
                double year = (Math.floor(year1));
                System.out.println("Here is a timeline of space exploration events from " + (int)year + " to 2000");
                switch ((int)year) {
                    case 2000:
                        System.out.println("First spacecraft orbits an asteroid");
                    break;
                    
                    case 2001:
                        System.out.println("First spacecraft lands on asteroid");
                    break;
                    
                    case 2002:
                        System.out.println("N/A");
                    break;
                    
                    case 2003:
                        System.out.println("Lagerst infrared telescope released ");
                    break;
                
                    case 2004:
                        System.out.println("N/A");
                    break;
                    
                    case 2005:
                        System.out.println("Spacecraft collies with comet");
                    break;
                    
                    case 2006:
                        System.out.println("Spacecraft returns with collections from comet");
                    break;
                    
                    case 2007:
                        System.out.println("N/A");
                    break;
                    
                    case 2008:
                        System.out.println("Kepler launched to explore deep space");
                    break;
                    
                    case 2009:
                        System.out.println("N/A");
                    break;
                    
                    case 2010:
                        System.out.println("SpaceX successfully sends spacecraft to orbit and back");
                    
                    default:
                        System.out.println(" ");
                    
                }
        }
}
