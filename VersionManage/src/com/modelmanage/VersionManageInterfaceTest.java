package com.modelmanage;

import java.util.List;

import com.modelmanage.enumtype.priorityType;

public class VersionManageInterfaceTest {
	public static void main(String[] args) throws Exception {

		String url = "D:\\3n307_experiments\\modelManage2016-10-24_Wang\\modelManage\\modelManage\\data";

		//VersionMangeInterfaceImpl vm = new VersionMangeInterfaceImpl();
		//vm.setConfig(url, "ljn", "��Ŀ3");
		VersionMangeInterfaceImpl vm = new VersionMangeInterfaceImpl(url, "ch", "��Ŀ3");

		// ����ģʽ
//		    vm.change2Global();

		// ���
//		     OperationFather operation = vm.createAddOperation("3", new ValueStore("���ǳ�", "����ĩ"));
		// �޸�
//		     OperationFather operation = vm.createModifyOperation("1", "attr2", "��ֵ1", "ĩֵ5");
		// ɾ��
//		     OperationFather operation = vm.createDeleteOperation("1", new ValueStore("�ұ�ɾ��", "555"));
		// ��ӵ�������
//		     vm.addOperation(operation);
		// �ύ�汾
//		     vm.submitVersion("����ch�汾2", "ch", "chwangchuhan@163.com", priorityType.highest);
		// ��ȡoperation��
//		     List<OperationFather> ls =  vm.getOperationList();
		// ��ȡversion��
//		     List<OVersion> ls = vm.getVersionList(1,2);
		// ��ȡphoto��
//		     List<PhotoFather> ls = vm.getPhotoList();
		// ���ÿ���
		// vm.resetPhoto();
		// ��¡
//		      vm.cloneByUrl(vm.getUserPath("ch2"));
		// ����
//		     vm.pushAuto();

		// �л�user��ȡ��Ŀ
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
