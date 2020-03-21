package com.yklis.suppliesmanage.inf;

import com.yklis.suppliesmanage.entity.ReceiptEntity;

public interface SuppliesManageService {
		
	String queryNoAuditReceiptList();
	
    String deleteReceipt(String unid);
    String insertReceipt(ReceiptEntity receiptEntity);
    String updateReceipt(ReceiptEntity receiptEntity);
    String loadSJ_JBXX();
    String loadSJ_Pack(String sjunid);
    String queryReceiptList(String rkrqRadioValue);
    String audit(String unid);
    String queryInventoryList();
    String outputInventory(String unid,String rlr,int sl,String dw,String ckrq,String memo);
    String queryOutputList();
}
