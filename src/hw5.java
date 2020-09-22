
public class hw5 {
//Bible book: Give name, chapters, and brief description. Object
	public static void main(String[] args) {
		Biblebook m=new Biblebook("Mark", 16, "The Second Gospel of Jesus");
		m.display();
		Biblebook t=new Biblebook("1 Timothy", 6, "The First Letter from Paul to Tim");
		t.display();
		Biblebook r=new Biblebook("Revelation", 22, "The End of the World");
		r.display();
	}
}
