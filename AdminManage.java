import java.util.Scanner;

public class AdminManage {
	/**
	 * 书店销售管理系统--乌七八糟的管理
	 * 
	 * @version 2018年2月1日 10:48:47
	 * @author 朱恒
	 */

	// 登录
	static void login(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner login = new Scanner(System.in);
		for (int i = 2; i >= 0; i--) { // 三次输入机会
			System.out.println("\t\t书店销售管理系统");
			System.out
					.println("*************************************************");
			System.out.println("请输入帐号(admin)：");
			String account = login.next();
			System.out.println("请输入密码(123)");
			int password = login.nextInt();
			if (account.equals("1") && password == 1) { // 帐号为admin 密码为123
				firstMenu(userId, userAge, userPoints, bookName, bookPrice); // 登录成功进入主菜单
			} else if (i == 0) {
				System.out.println("连续三次输入输入错误，系统被迫退出！");
				System.exit(0);
			}
			System.out.println("输入错误，请重试！您还有" + i + "次机会！");
		}
	}

	// 主菜单
	public static void firstMenu(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner main = new Scanner(System.in);
		Menu.menu2();
		int num = main.nextInt();
		while (true) {
			switch (num) {
			case 1:
				UserManage.userManage(userId, userAge, userPoints, bookName,
						bookPrice);// 用户管理
			case 2:
				BookManage.bookManage(userId, userAge, userPoints, bookName,
						bookPrice);// 书籍管理
			case 3:
				Pay.pay(userId, userAge, userPoints, bookName, bookPrice);// 购物结算
			case 4:
				GiftManage.giftManage(userId, userAge, userPoints, bookName,
						bookPrice);// 积分兑换管理
			case 5:
				exit();
			default:
				inputNumError();
			}
		}

	}

	// 退出/注销
	static void exit() {
		System.out.println("已退出");
		System.exit(0); // 退出系统
	}

	// 数字输入错误
	static int inputNumError() {
		Scanner input = new Scanner(System.in);
		System.out.println("输入错误，请重试:");
		int rnum = input.nextInt();
		return rnum;
	}

}
