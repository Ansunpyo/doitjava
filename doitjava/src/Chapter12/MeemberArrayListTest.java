package Chapter12;

public class MeemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(100, "ÀÌÁö¿ø");
		Member memberSon = new Member(100, "¼Õ¹Î±¹");
		Member memberPark = new Member(100, "¹Ú¼­ÈÍ");
		Member memberHong = new Member(100, "È«±æµ¿");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember();
	}

}
