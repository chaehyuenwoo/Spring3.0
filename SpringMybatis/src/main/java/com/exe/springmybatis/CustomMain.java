package com.exe.springmybatis;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

//�ܼ��̶� mainŬ���� �����
public class CustomMain {

	public static void main(String[] args) {
		
		//�ֿܼ����� �̰� �ʿ�
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("app-context.xml");//app-context.xml��ü����
		
		
		//customDAO��� �̸����� ������� Bean��ü�� �����ͼ� dao�� ����
		CustomDAO dao = (CustomDAO)context.getBean("customDAO"); 
		
		
		CustomDTO dto;
		
		//insert
		/*
		dto = new CustomDTO();
		
		dto.setId("777");
		dto.setName("������");
		dto.setAge(26);
		
		dao.insertData(dto);
		
		System.out.println("insert �Ϸ�");
		*/
		
		
		//select				
		/*
		List<CustomDTO> lists = dao.getList();
		
		for(CustomDTO dto1 : lists) { //dto�� ���� ������ �ߺ������� 1�ٿ��ذ���
			
			System.out.printf("%s %s %d\n",                     
					dto1.getId(),dto1.getName(),dto1.getAge()); //%d ��Ʈ�� %s ��Ʈ����
			
		}
		
		System.out.println("select �Ϸ�.");
		*/
		
		
		  //OneSelect 
		  
		  dto = dao.getReadData(777);
		 
		  if(dto!=null) { System.out.printf("%s %s %d\n",
		  dto.getId(),dto.getName(),dto.getAge());
		  
		  }
		  
		  System.out.println("Oneselect �Ϸ�.");
		  
		  
		//update
		/*
		  dto = new CustomDTO();
		  dto.setId(777);
		  dto.setName("����");
		  dto.setAge(24);
		  
		  dao.updateData(dto);
		  
		  System.out.println("update �Ϸ�.");
		  */
		
		//delete
		/*
		dao.deleteData(555);
		
		System.out.println("delete �Ϸ�");
		*/
	}

}