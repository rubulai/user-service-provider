package com.bdm.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import com.bdm.gmall.bean.UserAddress;
import com.bdm.gmall.service.UserService;

public class UserServiceImpl2 implements UserService {

	public List<UserAddress> getUserAddressList(String userId) {
		UserAddress address1 = new UserAddress(1, "�����в�ƽ���긣�Ƽ�԰�ۺ�¥3��", "1", "����ʦ", "010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "�����б�����������ȴ���B��3�㣨���ڷ�У��", "1", "����ʦ", "010-56253825", "N");
		return Arrays.asList(address1, address2);
	}
}
