package finalkeyword.inheritance;

public class BaseClass {
	
	private int member;

	/**
	 * @return the member
	 */
	public int getMember() {
		return member;
	}

	/**
	 * @param member the member to set
	 */
	public void setMember(int member) {
		this.member = member;
	}
	
	public void show() {
		System.out.println("Member from base class: " + member);
	}
	

}
