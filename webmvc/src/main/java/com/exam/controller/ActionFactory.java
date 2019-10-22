package com.exam.controller;

import java.util.HashMap;
import java.util.Map;

import com.exam.controller.member.MainAction;
import com.exam.controller.member.MemberJoinAction;
import com.exam.controller.member.MemberJoinFormAction;
import com.exam.controller.member.MemberLoginAction;
import com.exam.controller.member.MemberLoginFormAction;
import com.exam.controller.member.MemberLogoutAction;

public class ActionFactory {
	
	private Map<String, Action> map = new HashMap<String, Action>();
	
	private static ActionFactory instance = new ActionFactory();
		
	public static ActionFactory getInstance() {
		return instance;
	}

	private ActionFactory() {
		// member 명령어 관련 Action객체 등록
		map.put("/memberJoinForm.do", new MemberJoinFormAction());
		map.put("/memberJoin.do", new MemberJoinAction());
		map.put("/memberLoginForm.do", new MemberLoginFormAction());
		map.put("/memberLogin.do", new MemberLoginAction());
		map.put("/main.do", new MainAction());
		map.put("/memberLogout.do", new MemberLogoutAction());
	} // 생성자

	
	public Action getAction(String command) {
		Action action = map.get(command);
		return action;
	} // getAction method
	
}
