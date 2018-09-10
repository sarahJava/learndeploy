package com.hsit.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsit.demo.vo.WmsInvBill;

import lombok.extern.slf4j.Slf4j;

/**
 * 原料入库管理
 * 文件名：MaterialInController.java
 * 说明：
 * 作者：jiangxy
 * 创建时间：2018年05月16日
 */
@RestController
@RequestMapping("/materialIn")
@Slf4j
public class MaterialInController{
	
	/**
	 * 获取原料入库通知列表
	 * @param request
	 * @return
	 * @throws Exception 
	 */
	@GetMapping("/getNoticePage")
	public String getNoticePage(HttpServletRequest request){
		WmsInvBill wmsInvBill = new WmsInvBill();
		wmsInvBill.setBillNo("11111");
		wmsInvBill.setNoticeId("22222");
		System.out.println(wmsInvBill.getBillNo());
		System.out.println(wmsInvBill);
		return "vvvv";
	}
	
	
}
