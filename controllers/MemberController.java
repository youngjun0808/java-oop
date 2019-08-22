package com.bitcamp.controllers;
import javax.swing.JOptionPane;
import com.bitcamp.domains.MemberBean;
import com.bitcamp.services.MemberService;

public class MemberController {
	public static void main(String[] args) {
		MemberBean member = null;
		MemberService service = new MemberService();
		
		
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료 \n" 
					+ "1.회원가입\n"
					+ "2.마이페이지\n"
					+ "3.비번 수정\n"
					+ "4.회원탈퇴\n"
					+ "5.회원목록\n"
					+ "6.아이디검색")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1":
				String spec = JOptionPane.showInputDialog("이름,아이디,비번,주민번호,혈액형,키,몸무게");
				System.out.println("****" + spec);
				String[] arr = spec.split(",");
				member = new MemberBean();
				member.setName(arr[0]);
				member.setId(arr[1]);
				member.setPw(arr[2]);
				member.setSsn(arr[3]);
				member.setBlood(arr[4]);
				member.setHeight(Double.parseDouble(arr[5]));
				member.setWeight(Double.parseDouble(arr[6]));
				
				JOptionPane.showMessageDialog(null, service.join(member));
				break;
			case "2":
				JOptionPane.showMessageDialog(null, service.getMyPage(member));
				break;
			case "3":

				break;
			case "4":

				break;
			case "5":
				JOptionPane.showMessageDialog(null, service.list());
				break;
			case "6":
				String searchId = JOptionPane.showInputDialog("검색 ID");
				member = service.findById(searchId);
				JOptionPane.showMessageDialog(null, member);
				break;

			default:
				break;
			}
		}
	}
}
