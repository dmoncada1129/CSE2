
public class Arithemetic {

		public static void main (String[] args) {

			int nSocks = 3;
			double socksCost = 2.58;
			int nGlasses = 6;
			double glassesCost = 2.29;
			int nEnvelope = 1;
			double envelopeCost = 3.25;
			double taxPercent = 1.06;

			double totalSocks = nSocks * socksCost;
			double socksTax = totalSocks * taxPercent;
			double totalGlasses = nGlasses * glassesCost;
			double glassesTax = totalGlasses * taxPercent;
			double totalEnv = nEnvelope * envelopeCost;
			double envelopeTax = totalEnv * taxPercent;
			double beforeTax = totalEnv + totalGlasses + totalSocks;
			double afterTax = socksTax + glassesTax + envelopeTax;
			double afterTax1 = (int)(afterTax*100)/100;

			System.out.println("Socks go for "+ socksCost + "each, if you bought 3 of them it would cost "+totalSocks+ "before tax and" + socksTax + "after");
			System.out.println("Glasses go for "+ glassesCost + "each, if you bought 6 of them, before tax it would cost "+totalGlasses+"and "+glassesTax+"after");
			System.out.println("1 envelope would cost "+envelopeCost+"before tax and" + envelopeTax + "after");
			System.out.println("Before tax, all of this would cost " + beforeTax);
			System.out.println("Because of tax, this will now cost "+ afterTax1);



		}
}