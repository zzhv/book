import java.util.Scanner;

public class StartSMS {
	/**
	 * 书店销售管理系统--数组都放在这
	 * 
	 * @version 0.1
	 * @author zhuheng
	 */

	// 最初的起点
	public static void main(String[] args) {
		Scanner main = new Scanner(System.in);
		int userId[] = Data.UserId();// 用户Id
		int userAge[] = Data.UserAge();// 用户年龄
		int userPoints[] = Data.UserPoints();// 用户积分
		String booksName[] = Data.BookName();// 书籍名字
		double booksPrice[] = Data.BookPrice();// 书籍价格
		// String giftName[]=Data.GiftName();//礼物名字
		// int giftPoints[]=Data.GiftPoints();//礼物兑换积分
		Menu.menu1();
		int num = main.nextInt();
		while (true) {
			if (num == 1) {
				AdminManage.login(userId, userAge, userPoints, booksName,
						booksPrice);
			} else if (num == 2) {
				AdminManage.exit();
			} else {
				System.out.println("输入错误，请重试:");
				num = main.nextInt();
			}
		}
	}
}