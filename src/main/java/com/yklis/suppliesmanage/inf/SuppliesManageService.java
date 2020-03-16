package com.yklis.suppliesmanage.inf;

import com.yklis.suppliesmanage.entity.ReceiptEntity;

public interface SuppliesManageService {
		
	String queryNoAuditReceiptList();
	
    String deleteReceipt(String unid);
    String insertReceipt(ReceiptEntity receiptEntity);
    String updateReceipt(ReceiptEntity receiptEntity);
}
