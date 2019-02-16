package finalkeyword.inheritance;

public class FinalMethodBaseClass {
	
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
	
	public final void show() {
		System.out.println("Member from base class: " + member);
	}
	

}
