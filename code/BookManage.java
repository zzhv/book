import java.util.Scanner;

public class BookManage {
	/**
	 * 书店销售管理系统
	 * 
	 * @version 0.1
	 * @author zhuheng
	 */
	//主菜单
	static void bookManage(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner input = new Scanner(System.in);
		Menu.menu4();
		String function = input.next();
		while (true) {
			if (function.equals("1")) {
				showAllBookInfo(userId, userAge, userPoints, bookName,
						bookPrice);// 显示所有书籍
			} else if (function.equals("2")) {
				addBookInfo(userId, userAge, userPoints, bookName, bookPrice);// 增加书籍
			} else if (function.equals("3")) {
				delBookInfo(userId, userAge, userPoints, bookName, bookPrice);// 删除书籍信息
			} else if (function.equals("m")) {
				AdminManage.firstMenu(userId, userAge, userPoints, bookName,
						bookPrice);
			} else {
				System.out.println("输入错误，请重试：");
				function = input.next();
			}

		}

	}

	// 显示所有书籍信息
	static void showAllBookInfo(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		System.out.println("书店管理销售系统 > 书籍管理 > 书籍列表\n");
		for (int i = 0; i < bookName.length; i++) {
			if (bookName[i] == null) {
				break;
			} else {
				System.out.println("编号：" + (i + 1) + "\t" + "书名" + bookName[i]
						+ "\t" + "价格" + bookPrice[i]);
			}
		}
		pressUBack(userId, userAge, userPoints, bookName, bookPrice);
	}

	// 添加书籍
	static void addBookInfo(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("书店管理销售系统 > 书籍管理 > 添加书籍");
		System.out.print("请输入要添加的书的名称：");
		String newBookName = input.next();
		System.out.print("请输入价格：");
		double newBookPrice = input.nextDouble();
		for (int i = 0; i < bookName.length; i++) {
			if (bookName[i] == null) {// 因为String数组默认值为null，所以数组值为null时就代表bookName[i]无数据，此时就可以在空位写入书籍名称
				bookName[i] = newBookName;
				bookPrice[i] = newBookPrice;
				break;
			}

		}
		System.out.println("添加成功");
		pressUBack(userId, userAge, userPoints, bookName, bookPrice);

	}

	// 删除书籍
	static void delBookInfo(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("书店管理销售系统 > 书籍管理 > 书籍下架");
		System.out.print("请输入要删除的书的书名：");
		String inputBookName = input.next();
		boolean find = false;
		for (int i = 0; i < bookName.length; i++) {
			if (bookName[i].equals(inputBookName)) {
				System.out.println("找到书籍，编号为：" + (i + 1));
				find = true;
			}
			if (find) {
				bookName[i] = bookName[i + 1];
				bookPrice[i] = bookPrice[i + 1];
				if (bookPrice[i] == 0.0) {
					System.out.println("书籍被删除！");
					pressUBack(userId, userAge, userPoints, bookName, bookPrice);
				}
			}
		}
		System.out.println("没有找到该书籍");
		pressUBack(userId, userAge, userPoints, bookName, bookPrice);

	}

	// 请按'u'返回书籍管理菜单
	static void pressUBack(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("请按'u'返回书籍管理菜单:");
		String u = input.next();
		if (u.equals("u")) {
			BookManage.bookManage(userId, userAge, userPoints, bookName,
					bookPrice);
		} else {

			pressUBack(userId, userAge, userPoints, bookName, bookPrice);
		}
	}

}
