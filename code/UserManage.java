import java.util.Scanner;

public class UserManage {
	/**
	 * 书店销售管理系统
	 * 
	 * @version 0.1
	 * @author zhuheng
	 */
	
	// 主菜单
	static void userManage(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner input = new Scanner(System.in);
		Menu.menu3();
		String function = input.next();
		while (true) {
			if (function.equals("1")) {
				showAllUserInfo(userId, userAge, userPoints, bookName,
						bookPrice);// 显示所有用户信息
			} else if (function.equals("2")) {
				addUserInfo(userId, userAge, userPoints, bookName, bookPrice);
			} else if (function.equals("3")) {
				changeUserInfo(userId, userAge, userPoints, bookName, bookPrice);
			} else if (function.equals("m")) {
				AdminManage.firstMenu(userId, userAge, userPoints, bookName,
						bookPrice);
			} else {
				System.out.println("输入错误，请重试：");
				function = input.next();
			}

		}

	}

	// 显示所有会员信息
	static void showAllUserInfo(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		System.out.println("书店管理销售系统 > 会员信息管理 > 显示会员信息\n");
		System.out.println("\t\t会员号\t年龄\t积分");
		for (int i = 0; i < userId.length; i++) {
			if (userId[i] == 0) {// 因为int数组默认值为0，所以当数组值为0时就结束打印
				break;
			} else {
				System.out.println("\t\t" + userId[i] + "\t" + userAge[i]
						+ "\t" + userPoints[i]);
			}
		}
		pressUBack(userId, userAge, userPoints, bookName, bookPrice);
	}

	// 添加会员
	static void addUserInfo(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("书店管理销售系统 > 会员信息管理 > 新增会员信息");
		System.out.print("请输入会员账号：");
		int id = input.nextInt();
		System.out.print("请输入会员年龄：");
		int age = input.nextInt();
		System.out.print("请输入会员积分：");
		int points = input.nextInt();
		for (int i = 0; i < userId.length; i++) {
			if (userId[i] == 0) {// 因为int数组默认值为0，所以数组值为0时就代表userId[i]五数据，此时就可以写入id
				userId[i] = id;
				userAge[i] = age;
				userPoints[i] = points;
				break;
			}

		}
		System.out.println("添加成功");
		pressUBack(userId, userAge, userPoints, bookName, bookPrice);

	}

	// 修改会员信息
	static void changeUserInfo(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("书店管理销售系统 > 会员信息管理 > 修改会员信息");
		System.out.print("请输入会员号：");
		int inputUserId = input.nextInt();
		for (int i = 0; i < userId.length; i++) {
			if (userId[i] == inputUserId) {
				System.out.println(userId[i] + "号会员的年龄是:" + userAge[i] + "积分是:"
						+ userPoints[i]);
				System.out.println("请输入新的会员年龄：");
				int newUserAge = input.nextInt();
				System.out.println("请输入新的会员积分：");
				int newUserPoints = input.nextInt();
				userAge[i] = newUserAge;
				userPoints[i] = newUserPoints;
				System.out.println("修改成功！");
				pressUBack(userId, userAge, userPoints, bookName, bookPrice);
			}

		}
		System.out.println("没有找到该会员ID!");
		pressUBack(userId, userAge, userPoints, bookName, bookPrice);
	}

	// 请按'u'返回用户管理菜单
	static void pressUBack(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("请按'u'返回用户管理菜单:");
		String u = input.next();
		if (u.equals("u")) {
			UserManage.userManage(userId, userAge, userPoints, bookName,
					bookPrice);
		} else {

			pressUBack(userId, userAge, userPoints, bookName, bookPrice);
		}
	}

}
