package Chapter12;

public class MeemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(100, "������");
		Member memberSon = new Member(100, "�չα�");
		Member memberPark = new Member(100, "�ڼ���");
		Member memberHong = new Member(100, "ȫ�浿");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember();
	}

}
