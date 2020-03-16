package com.yklis.suppliesmanage.entity;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * 该实体类只有实现Serializable接口，才能在提供者与消费者之间传输
 * 尽管什么也没做，只是加了implements Serializable
 * @author ying07.liu
 * 为什么要序列化？
 * 1、将对象的状态保存在存储媒体中以便可以在以后重新创建出完全相同的副本
 * 2、按值将对象从一个应用程序域发送至另一个应用程序域
 */
public class ReceiptEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//类的数据成员是基本类型时,即使没有进行初始化,JAVA也会确保它获得默认值
	//但基本类型的局部变量并不会自动初始化
	//int为基本类型,默认值为0.数据库中为null,经过mybatis查询返为0。注:包装类Integer的默认值为null
	private int unid;
	private int sjunid;
	private String vendor;
	private String djh;
	private String ph;
	private LocalDate yxq;
	private int sl;
	private String dw;
	private LocalDate rkrq;
	
    public int getUnid() {
        return unid;
    }
    public void setUnid(int unid) {
       this.unid = unid;
    }		

    public int getSjunid() {
        return sjunid;
    }
    public void setSjunid(int sjunid) {
       this.sjunid = sjunid;
    }		

    public String getVendor() {
        return vendor;
    }
    public void setVendor(String vendor) {
       this.vendor = vendor;
    }		

    public String getDjh() {
        return djh;
    }
    public void setDjh(String djh) {
       this.djh = djh;
    }		

    public String getPh() {
        return ph;
    }
    public void setPh(String ph) {
       this.ph = ph;
    }		

    public LocalDate getYxq() {
        return yxq;
    }
    public void setYxq(LocalDate yxq) {
       this.yxq = yxq;
    }		

    public int getSl() {
        return sl;
    }
    public void setSl(int sl) {
       this.sl = sl;
    }		

    public String getDw() {
        return dw;
    }
    public void setDw(String dw) {
       this.dw = dw;
    }		

    public LocalDate getRkrq() {
        return rkrq;
    }
    public void setRkrq(LocalDate rkrq) {
       this.rkrq = rkrq;
    }
}
