public class Data {
	/**
	 * 书店销售管理系统--数组都放在这
	 * 
	 * @version 2018年2月1日 10:48:47
	 * @author 朱恒
	 */

	// 用户id
	public static int[] UserId() {
		int userId[] = new int[100];
		userId[0] = 1000;
		userId[1] = 1001;
		userId[2] = 1002;
		userId[3] = 1003;
		userId[4] = 1004;
		return userId;
	}

	// 用户年龄
	public static int[] UserAge() {
		int userAge[] = new int[100];
		userAge[0] = 8;
		userAge[1] = 26;
		userAge[2] = 63;
		userAge[3] = 80;
		userAge[4] = 122;
		return userAge;
	}

	// 积分
	public static int[] UserPoints() {
		int userPoints[] = new int[100];
		userPoints[0] = 1000;
		userPoints[1] = 2000;
		userPoints[2] = 3000;
		userPoints[3] = 4000;
		userPoints[4] = 500;
		return userPoints;
	}

	// 书籍名字
	public static String[] BookName() {
		String bookName[] = new String[100];
		bookName[0] = "C#2.0宝典";
		bookName[1] = "Java编程基础";
		bookName[2] = "J2SE桌面应用程序开发";
		bookName[3] = "数据库设计和应用";
		bookName[4] = "a";
		bookName[5] = "红楼梦";
		bookName[6] = "三国演义";
		bookName[7] = "西游记";
		return bookName;
	}

	// 书籍价格
	public static double[] BookPrice() {
		double bookPrice[] = new double[100];
		bookPrice[0] = 88;
		bookPrice[1] = 55;
		bookPrice[2] = 60;
		bookPrice[3] = 45;
		bookPrice[4] = 55.5;
		bookPrice[5] = 67;
		bookPrice[6] = 25;
		bookPrice[7] = 95.5;
		return bookPrice;
	}

//	public static String[] GiftName() {
//		String giftName[] = new String[100];
//		giftName[0] = "鼠标垫";
//		giftName[1] = "usb小台灯";
//		giftName[2] = "usb小电扇";
//		giftName[3] = "运动背包";
//		return giftName;
//	}
//
//	public static int[] GiftPoints() {
//		int giftPoints[] = new int[100];
//		giftPoints[0] = 10;
//		giftPoints[1] = 100;
//		giftPoints[2] = 200;
//		giftPoints[3] = 1000;
//		return giftPoints;
//	}
}
