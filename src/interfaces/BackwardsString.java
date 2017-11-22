package interfaces;

public class BackwardsString extends SpecialString {

	public BackwardsString(String string) {
		super(string);
	}

	@Override
	public String funkifyText(String s2) {
		return new StringBuilder(s2).reverse().toString();
	}

}
