import java.util.StringJoiner;


public class StringEx4 {

	public static void main(String[] args) {
		String animalsString = "dog,cat,bear";
		String[] arr = animalsString.split(",");
		
		System.out.println(String.join("-", arr));
		
		StringJoiner sj = new StringJoiner("/","[","]");
		for(String s : arr)
			sj.add(s);
		
		System.out.println(sj.toString());
		

	}

}
