package finalkeyword;

public class UsingFinalKeyword {
	
	/*
	 * Using final keyword to define a constant in class scope
	 */
	public static final double PI = 3.14;
	
	/*
	 * Using final keyword to make a member constant once initialized by the
	 * constructor.
	 */
	private final int member;
	
	public UsingFinalKeyword(int member) {
		this.member = member;
	}
	
	/*
	 * Using final to make a read only parameter
	 */
	public double getCircleArea(final double radious) {
		return PI*radious*radious;
	}
	
	/**
	 * @return the member
	 */
	public int getMember() {
		return member;
	}
	
	/*
	 * A final member variable cannot be reassigned as follows.
	 * It will generate compiler error.
	 */
	/*
	public void setMember(int member) {
		this.member = member;
	}
	*/

}
