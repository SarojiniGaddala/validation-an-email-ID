package mphasis;
import java.util.regex.Pattern;
import java.util.*;
public class Test1 {
	
		
			public static boolean isValid(String email)
			{
				String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
									"[a-zA-Z0-9_+&*-]+)*@" +
									"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
									"A-Z]{2,7}$";
									
				Pattern pat = Pattern.compile(emailRegex);
				if (email == null)
					return false;
				return pat.matcher(email).matches();
			}

			public static void main(String[] args)
			{
				ArrayList<String> address = new ArrayList<>();
					
				address.add("gaddala.sarojini@mphasis.com");
				address.add("swarajmphasis.com");
				address.add("arigela.vasavi@mphasis.com");
				address.add("esha.gowry@mphasis.com");
				address.add("swapna82mphasis.com");
				address.add("sailaja43@mphasis.com");
				address.add("swathi.bandari12@mphasis.com");
					
				for(String i : address){
					if (isValid(i))
						System.out.println(i + " - Yes");
					else
						System.out.println(i + " - No");
				}
			
			}

	}


