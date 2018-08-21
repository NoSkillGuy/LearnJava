public class PhaseOMatic {
	public static void main(String[] args) {
		String[] wordListOne = {
			"24/7","multi-Tier","30,000 feet"
		};
		String[] wordListTwo = {
			"empowered","sticky","valued"
		};
		String[] wordListThree = {
			"process","tipping point","Solution"
		};
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		int rand1 = (int) Math.random() * oneLength;
		int rand2 = (int) Math.random() * twoLength;
		int rand3 = (int) Math.random() * threeLength;

		System.out.println("What we would need is a "+ wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3]);
	}
}