package com.test1;
//Authenticator�������̽��� ������ Ŭ����
public class LoginAuthenticatorImpl implements Authenticator {

	@Override
	public void authen(String userId, String userPwd)//�ָ� ȣ������ ��
			throws UserException {
		
		if(!userId.equals("suzi") || !userPwd.equals("123")) {
			//suzi, 123�� �ƴϸ� ���ܸ� �߻���Ų��.
			throw new UserException("invalid id: " + userId);
		}
		
	}

}