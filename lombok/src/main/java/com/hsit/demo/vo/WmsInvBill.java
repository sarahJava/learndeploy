package com.hsit.demo.vo;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * 出入库单
 * 文件名：WmsInvBill.java
 * 说明：
 * 作者：jiangxy
 * 创建时间：2018年05月21日
 */
@Data
public class WmsInvBill implements Serializable{
	
	private static final long serialVersionUID = 8656006353376570120L;
	private String wmsInvBillId;//主键
	private String noticeId;//通知单主键
	private String wmsAsnId;//任务单主键
	private String billDate;//出入库日期
	private String beginDate;//开始日期
	private String billNo;//出入库单据号
	
}
