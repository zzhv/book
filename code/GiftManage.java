import java.util.Scanner;

public class GiftManage {
	/**
	 * 书店销售管理系统--数组都放在这
	 * 
	 * @version 0.1
	 * @author zhuheng
	 */

	public static void giftManage(int userId[], int userAge[],
			int userPoints[], String bookName[], double bookPrice[]) {
		Scanner input = new Scanner(System.in);
		Menu.menu5();
		int UserId = 0;// 寻找会员ID所对应的数组编号,注意与数组userId区分开
		boolean userIdPanDuan = false;
		do {

			int inputUserId = input.nextInt();
			for (UserId = 0; userId[UserId] != 0; UserId++) {
				if (inputUserId != userId[UserId]) {
					continue;
				}
					userIdPanDuan = true;
					break;
				
			}
			if (userIdPanDuan = true) {
				break;
			}
			System.out.print("输入的会员ID错误请重新输入：");
		} while (true);
		String giftName = null;
		int giftPoints = 0;
		System.out.println("请输入礼物编号:");
		int num = input.nextInt();
		switch (num) {
		case 1:
			giftName = "鼠标垫";
			giftPoints = 10;

			break;

		case 2:
			giftName = "usb小台灯";
			giftPoints = 100;
			break;

		case 3:
			giftName = "usb小电扇";
			giftPoints = 200;
			break;

		case 4:
			giftName = "运动背包";
			giftPoints = 1000;
			break;
		// default:
		// System.out.println("没有此编号的礼品，请重试!");
		// num = input.nextInt();
		}
		if (giftPoints == 0) {
			System.out.println("对不起，您输入的编号没有对应的礼品。");
		} else if (giftPoints > userPoints[UserId]) {
			System.out.println("你的积分不够，不能兑换" + giftName);
			pressUBack(userId, userAge, userPoints, bookName, bookPrice);
		} else {
			userPoints[UserId] = (userPoints[UserId] - giftPoints);
			System.out.println("你成功兑换了一个" + giftName + ",你还有"
					+ userPoints[UserId] + "积分");
			pressUBack(userId, userAge, userPoints, bookName, bookPrice);
		}
	}

	// 请按'u'返回主管理菜单
	static void pressUBack(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("请按'u'返回主菜单:");
		String u = input.next();
		if (u.equals("u")) {
			AdminManage.firstMenu(userId, userAge, userPoints, bookName,
					bookPrice);
		} else {
			pressUBack(userId, userAge, userPoints, bookName, bookPrice);

		}
	}
}
