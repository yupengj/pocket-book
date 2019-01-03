package org.jyp.pocketbook.wx.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jyp.pocketbook.core.utils.HttpUtils;
import org.jyp.pocketbook.wx.user.dto.WxLoginInfo;
import org.jyp.pocketbook.wx.user.dto.WxUserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("wx/user")
@Controller
public class WxLoginController {
	private final Log log = LogFactory.getLog(WxLoginController.class);

	@GetMapping("/test")
	public void test() {
		System.out.println("tttttttttttttttt");
	}

	@PostMapping("login")
	public Map<String, Object> login(@RequestBody WxLoginInfo loginInfo) {
		log.info(loginInfo.toString());

		String code = loginInfo.getCode();
		WxUserInfo userInfo = loginInfo.getUserInfo();

		String appId = "wxed1c1d2db476998b";
		String appSecret = "a4b97364c8c61cb25ee858448572b604";

		String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + appId + "&secret=" + appSecret
				+ "&js_code=" + code + "&grant_type=authorization_code";

		Object body = HttpUtils.sendGet(url);
		System.out.println(body);
		Map<String, Object> data = new HashMap<>();

		return data;
	}
}
