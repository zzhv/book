import java.util.Scanner;

public class Pay {
	/**
	 * 书店销售管理系统--数组都放在这
	 * 
	 * @version 0.1
	 * @author zhuheng
	 */
	public static void pay(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner input = new Scanner(System.in);
		int buySum = 0;// 购物总金额
		System.out.println("书店销售管理系统>购物结算");
		System.out.println("*********************书籍列表***********************");

		for (int i = 0; i < bookName.length; i++) {
			if (bookName[i] == null) {
				break;
			} else {
				System.out.println((i + 1) + "\t" + "书名" + bookName[i] + "\t"
						+ "价格" + bookPrice[i]);
			}
		}
		System.out
				.println("***************************************************");
		System.out.println("请输入会员号：");
		int UserId = 0;// 寻找会员ID所对应的数组编号,注意与数组userId区分开
		boolean userIdPanDuan = false;
		int inputUserId = input.nextInt();
		do {

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
			System.out.println("输入的会员ID错误请重新输入：");

		} while (true);
		// boolean xunhuan=true;
		while (true) {
			System.out.println("请输入书籍编号:");
			int inputBookId = input.nextInt();
			int bookMaxId = 0;
			for (int i = 0; i < bookName.length; i++) {
				if (bookName[i] == null) {
					bookMaxId = i;
					break;
				}
			}
			if (inputBookId > bookMaxId) {
				System.out.println("没有此书！重新来过");
				pressUBack(userId, userAge, userPoints, bookName, bookPrice);
			}

			System.out.println("请输入要购买的量:");
			int buyNum = input.nextInt();
			System.out.println(bookName[inputBookId - 1] + "\t￥"
					+ bookPrice[inputBookId - 1] + "\t￥"
					+ (buyNum * bookPrice[inputBookId - 1]));
			buySum += (buyNum * bookPrice[inputBookId - 1]);

			System.out.println("是否继续购买（y/n）?");
			String yn = input.next();
			if (!yn.equals("y")) {
				System.out.print("金额总计：\t￥" + buySum + "\n");
				System.out.print("交费金额：\t￥");
				int getMoney = input.nextInt();
				System.out.print("找零：\t￥" + (getMoney - buySum) + "\n");
				int points = (int) (buySum / 10);
				userPoints[UserId] = userPoints[UserId] + points;
				System.out.println("消费积分：\t￥" + points);
				System.out.println("购买成功!");
				pressUBack(userId, userAge, userPoints, bookName, bookPrice);
			}
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
