package com.exe.springJdbcTemplate;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

//�ܼ��̶� mainŬ���� �����
public class CustomMain {

	public static void main(String[] args) {
		
		//�ֿܼ����� �̰� �ʿ�
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("app-context.xml");//app-context.xml��ü����
		
		
		//DB�����ҷ��� DAO�� �ʿ��ϴ�.
		// context�� ������� ��ü�� ������
		
		//customDAO��� �̸����� ������� Bean��ü�� �����ͼ� dao�� ����
		//�̰� �Ϲ� JDBC  
		//CustomDAO dao = (CustomDAO)context.getBean("customDAO");
		
		//�������� JDBC
		CustomDAO2 dao = (CustomDAO2)context.getBean("customDAO2");
		
		CustomDTO dto;
		
		//insert
		
		dto = new CustomDTO();
		
		dto.setId("333"); 
		dto.setName("������"); 
		dto.setAge(27);
		 
		dao.insertData(dto);
		System.out.println("insert �Ϸ�");
		 
		
		//select
		/* List<CustomDTO> lists = dao.getList();
		
		for(CustomDTO dto1 : lists) {
			
			System.out.printf("%s %s %d\n",
					dto1.getId(),dto1.getName(),dto1.getAge());
		}
		
		System.out.println("select �Ϸ�.."); */
		
		
		//OneSelect
		/* dto = dao.getReadData("111");
		
		if(dto!=null) {
			System.out.printf("%s %s %d\n", 
					dto.getId(),dto.getName(),dto.getAge());
		}
		
		System.out.println("OneSelect �Ϸ�..."); */
		
		
		//update
		/*dto = new CustomDTO();
		dto.setId("222");
		dto.setName("���μ�");
		dto.setAge(28);
		
		dao.updateData(dto);
		
		System.out.println("update �Ϸ�..."); */
		
		
		//delete
		/*dao.deleteData("222");
		
		System.out.println("delete �Ϸ�.."); */
		
		

	}

}