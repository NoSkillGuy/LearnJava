class Movie {
	String name;
	String genre;
	int rating;

	void playIt(){
		System.out.println("Playing the Movie!!");
	}
}

public class MovieTestDrive {
	public static void main(String[] args){
		Movie one = new Movie();
		one.name = "Avengers Infinity War";
		one.genre = "Fiction";
		one.rating = 10;
		Movie two = new Movie();
		two.name = "Avatar";
		two.genre = "Fiction";
		two.rating = 10;
		one.playIt();
	}
}