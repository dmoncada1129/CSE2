//Daniel Moncada
//CSE2
//Arithmetic program
//FEB 1, 2015
//Prof. Chen

public class Arithmetic {
        
    //main method
    public static void main(String [ ] args) {
            
        //numbers of pairs of socks
        int nSocks = 3;
            
        //sock cost per pair
        double sockCost$=2.58;
            
        //## of drinking glasses
        int nGlasses=6;
            
        //cost per glass
        double glassCost$=2.29;
        
        //number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=.06; //tax 
        
        double totalSockCost$; //total cost of socks
        double totalGlassCost$; //total cost of glass
        double totalEnvCost$; //total envvelope cost
        double envCostTax$; //total envelope cost with tax
        double glassCostTax$; //total glass cost with tax
        double sockCostTax$; //total sock cost with tax
        double costBeforeTax$; //total cost of everything before tax
        double costWithTax$; //total cost of everything with tax
        
        totalSockCost$= sockCost$ * nSocks; 
        sockCostTax$= (sockCost$ * ( 1 + taxPercent));
        totalGlassCost$= glassCost$ * nGlasses;
        glassCostTax$= (glassCost$ * ( 1 + taxPercent));
        totalEnvCost$=(envelopeCost$ * nEnvelopes);
        envCostTax$=(envelopeCost$*(1 + taxPercent));
        costBeforeTax$= totalEnvCost$ + totalGlassCost$ + totalSockCost$;
        costWithTax$= costBeforeTax$ * (1 + taxPercent);
        
        
        System.out.println("You are buying " + nSocks + " socks for " + sockCost$ + " each" );
        System.out.println(nSocks + " for " + sockCost$ + " each " + " with a tax of " + taxPercent+ " would come out to " + sockCostTax$ + " for each sock ");
        System.out.println("You are buying " + nGlasses + " glasses for " + glassCost$ + " each" );
        System.out.println(nGlasses + " for " + glassCost$ + " each " + " with a tax of " + taxPercent+ " would come out to " + glassCostTax$ + " for each sock ");
        System.out.println("You are buying " + nEnvelopes + " envelopes for " + envelopeCost$ + " each" );
        System.out.println(nEnvelopes + " for " + envelopeCost$ + " each " + " with a tax of " + taxPercent+ " would come out to " + envCostTax$ + " for each sock ");
        System.out.println("Without tax, this would cost " + costBeforeTax$);
        System.out.println("With tax, this will cost you " + costWithTax$);
        
        
    }
}