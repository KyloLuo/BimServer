package com.modelmanage;

import java.util.List;

import com.modelmanage.enumtype.priorityType;

public class VersionManageInterfaceTest {
	public static void main(String[] args) throws Exception {

		String url = "D:\\3n307_experiments\\modelManage2016-10-24_Wang\\modelManage\\modelManage\\data";

		//VersionMangeInterfaceImpl vm = new VersionMangeInterfaceImpl();
		//vm.setConfig(url, "ljn", "项目3");
		VersionMangeInterfaceImpl vm = new VersionMangeInterfaceImpl(url, "ch", "项目3");

		// 更改模式
//		    vm.change2Global();

		// 添加
//		     OperationFather operation = vm.createAddOperation("3", new ValueStore("我是初", "我是末"));
		// 修改
//		     OperationFather operation = vm.createModifyOperation("1", "attr2", "初值1", "末值5");
		// 删除
//		     OperationFather operation = vm.createDeleteOperation("1", new ValueStore("我被删了", "555"));
		// 添加到操作库
//		     vm.addOperation(operation);
		// 提交版本
//		     vm.submitVersion("我是ch版本2", "ch", "chwangchuhan@163.com", priorityType.highest);
		// 获取operation表
//		     List<OperationFather> ls =  vm.getOperationList();
		// 获取version表
//		     List<OVersion> ls = vm.getVersionList(1,2);
		// 获取photo表
//		     List<PhotoFather> ls = vm.getPhotoList();
		// 重置快照
		// vm.resetPhoto();
		// 克隆
//		      vm.cloneByUrl(vm.getUserPath("ch2"));
		// 推送
//		     vm.pushAuto();

		// 切换user拉取项目
//		     vm.setUser("ch");
//		     vm.pullAuto();

		// List<OperationFather> list = vm.getOperationList();
		// List<OVersion> list = vm.getVersionList();
		//foreach (OVersion item in list)
		//{
		//    item.getOperationList();
		//}
		// List<PhotoFather> list = vm.getPhotoList();

		vm.back2Version(1);
		// Console.WriteLine(vm.getLastVersion());

	}
}
