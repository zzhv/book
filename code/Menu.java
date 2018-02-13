public class Menu {
	/**
	 * 书店销售管理系统
	 * 
	 * @version 0.1
	 * @author zhuheng
	 */

	static void menu1() {
		System.out.println("\t\t书店销售管理系统");
		System.out
				.println("***************************************************");
		System.out.println("\t\t1. 登 录 系 统");
		System.out.println("\t\t2. 退 出");
		System.out
				.println("***************************************************");
		System.out.println("请选择,输入数字:");
	}

	static void menu2() {
		System.out.println("\t\t书店销售管理系统系统");
		System.out
				.println("***************************************************");
		System.out.println("\t\t1. 会 员 管 理");
		System.out.println("\t\t2. 书 籍 管 理");
		System.out.println("\t\t3. 购 物 结 算");
		System.out.println("\t\t4. 积 分 兑 换 礼 品");
		System.out.println("\t\t5. 注 销");
		System.out
				.println("***************************************************");
		System.out.println("请选择,输入数字:");
	}

	static void menu3() {
		System.out.println("书店销售管理系统系统>会员管理\n");
		System.out
				.println("*****************************************************");
		System.out.println("\t\t1. 显 示 所 有 会 员 信 息");
		System.out.println("\t\t2. 添 加 会 员");
		System.out.println("\t\t3. 修 改 会 员");
		System.out.println("\t\tm. 返 回 主 菜 单");
		System.out
				.println("*****************************************************");
		System.out.println("请选择功能:");
	}

	static void menu4() {
		System.out.println("书店管理销售系统 >书籍管理");

		System.out
				.println("***************************************************");
		System.out.println("\t\t1. 查看书目");
		System.out.println("\t\t2. 添加书籍");
		System.out.println("\t\t3. 删除书籍");
		System.out.println("\t\tm. 返 回 主 菜 单");
		System.out
				.println("***************************************************");
		System.out.println("请选择功能：");
	}

	static void menu5() {
		System.out.println("书店管理销售系统>积分兑换礼品");
		System.out.println("*********************礼品清单***********************");
		System.out.println("礼品编号\t礼品名称\t\t兑换所需积分");
		System.out.println("1\t鼠标垫\t\t10分");
		System.out.println("2\tusb小台灯\t100分");
		System.out.println("3\tusb小电扇\t200分");
		System.out.println("4\t运动背包\t\t1000分");
		System.out
				.println("*******************************************************");
		System.out.println("请输入会员号：");
	}
}
