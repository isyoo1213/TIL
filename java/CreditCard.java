public class CreditCard {
	String ownerName;
	String cardID;
	int cardLimit;
	int membershipFee;
	
	public CreditCard(String ownerName, String cardID, int cardLimit, int membershipFee) {
		this.ownerName = ownerName;
		this.cardID = cardID;
		this.cardLimit = cardLimit;
		this.membershipFee = membershipFee;		
	}
	
	public String CardInfo() {
		return String.format("소유자명 : %s \n카드 번호 : %s\n 카드 한도: %s\n 연회비 : %d", ownerName, cardID, cardLimit, membershipFee);
	}

}
