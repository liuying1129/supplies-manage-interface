package com.yklis.suppliesmanage.inf.entity;

public class LodopDesignEntity {
	
	//类的数据成员是基本类型时,即使没有进行初始化,JAVA也会确保它获得默认值
	//但基本类型的局部变量并不会自动初始化
	//int为基本类型,默认值为0.数据库中为null,经过mybatis查询返为0。注:包装类Integer的默认值为null
	private int unid;
	private String id;
	private String name;
	private String remark;
	private String reserve;
	
    public int getUnid() {
        return unid;
    }
    public void setUnid(int unid) {
       this.unid = unid;
    }	

    public String getId() {
        return id;
    }
    public void setId(String id) {
       this.id = id;
    }		

    public String getName() {
        return name;
    }
    public void setName(String name) {
       this.name = name;
    }		
		
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
       this.remark = remark;
    }		

    public String getReserve() {
        return reserve;
    }
    public void setReserve(String reserve) {
       this.reserve = reserve;
    }
}
