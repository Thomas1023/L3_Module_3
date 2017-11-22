package interfaces;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String string) {
		super(string);
	}

	@Override
	public String funkifyText(String s2) {
		char temp;
		StringBuilder s3=new StringBuilder(s2);
		for(int i = 0; i < s3.length(); i++) {
	        if(i % 2 == 0) {
	            temp = Character.toLowerCase(s3.charAt(i));
	            s3.setCharAt(i,temp);
	        } else {
	            temp = Character.toUpperCase(s3.charAt(i));
	            s3.setCharAt(i,temp);
	        }
	    }
		System.out.println(s3);
		return s3.toString();
	}
// string is immutable? ask in class
}
