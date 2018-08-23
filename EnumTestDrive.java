class FreshJuice {
	enum FreshJuiceSize { SMALL, MEDIUM, LARGE }
	enum FreshJuiceFruit { APPLE, ORANGE, PINEAPPLE, MOSAMBI, POMOGRANATE}
	FreshJuiceSize size;
	FreshJuiceFruit fruit;
}

public class EnumTestDrive {
	public static void main(String[] args) {
		FreshJuice juice1 = new FreshJuice();
		juice1.size = FreshJuice.FreshJuiceSize.MEDIUM;
		System.out.println(juice1.size);
	}
}