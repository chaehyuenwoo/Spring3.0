package com.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

//��Ʈ�ѷ� ������ �ϱ� ����  AbstractWizardFormController���
public class MemController extends AbstractWizardFormController {
	
	//MemberCommand ��ü ����
	public MemController() {
		setCommandClass(MemCommand.class);
		setCommandName("info"); // ${info. ~ }
		//MemCommand info = new MemCommand();
	}

	@Override //�� ������(mem1,2,3)���� submit�� ��� ����ͼ� postProcessPage�޼��� ����
	protected void postProcessPage(HttpServletRequest request,
			Object command, Errors errors, int page)
			throws Exception {
		
		//�� ���������� submit�� ��� 
		MemCommand mem = (MemCommand)command;
		
		//mem1,2,3 � ���������� �Դ��� �˾ƾ���
		if(page==0) {
			
			if(mem.getSsn().equals("123")) { //mem.getSsn()�� ����ڰ� �Է��� �ֹι�ȣ
				
				String str = mem.getName() + "�� �̹� ���� �Ǿ��ֽ��ϴ�.";
				
				//�̹� ���ԵǾ������� men1.jsp���� ������Ѵ�. -> ������������ ���Ѿ
				errors.rejectValue("message", str); //���� �ڵ带 ����
				
				//���� �ڵ带 ��Ƽ� setMessage�� str�� ��´�.
				mem.setMessage(str); //mem�� �ٽ� �ִ´�
			}
			
		}else if(page==1) {
			
		}
		
		
	}

	@Override
	protected ModelAndView processCancel(HttpServletRequest request, 
			HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		
		//ȸ�������� ����� ���
		
		
		return new ModelAndView("test2/mem_cancel", errors.getModel()); //�Ѿ�� errors�� getModel()�� ��������.
	}

	@Override
	protected ModelAndView processFinish(HttpServletRequest request, 
			HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		
		// ������ �Է��� �������� ��
		//ȸ������ ó�� - (DB�� ������ DB�� insert�Ѵ�)
		
		return new ModelAndView("test2/mem_ok");
	}

	@Override //referenceData�� �̸� �غ��ϴ� ��
	protected Map<String, List<String>> referenceData(HttpServletRequest request, 
			Object command, Errors errors, int page) throws Exception {
		
		
		//���⼭�� page�� �Ѿ�´�,
		if(page==1) {
			
			List<String> types = new ArrayList<>();
			types.add("�Ϲ�ȸ��");
			types.add("���ȸ��");
			types.add("Ư��ȸ��");
			
			Map<String, List<String>> map = new HashMap<String, List<String>>();
			map.put("types", types);
			
			return map;
			
		}
		
		return null; //1�������� �ƴ� ���� null��ȯ - (�ϴ� ���� 2,3�������� �Ⱦ��ű⶧��)
		//�� ��������� �����̰��ϱ����� dispatcher-servlet �ۼ�
	}
	
	
	
	
}