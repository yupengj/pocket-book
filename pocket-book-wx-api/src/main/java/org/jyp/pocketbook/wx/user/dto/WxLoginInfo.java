package org.jyp.pocketbook.wx.user.dto;

public class WxLoginInfo {
	private String code;
	private WxUserInfo userInfo;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public WxUserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(WxUserInfo userInfo) {
		this.userInfo = userInfo;
	}

	@Override
	public String toString() {
		return "WxLoginInfo [code=" + code + ", userInfo=" + userInfo + "]";
	}

}
