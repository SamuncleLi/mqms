package com.gamc.efactory.model.viewObject;

/**
 * Created by Zeho Lee on 2019/7/26.
 */
public class SparePartsOrderVO {
    private static final long serialVersionUID = 1564108329087L;


    /**
     * 主键
     * 订单Id
     * isNullAble:0
     */
    private Long orderId;

    /**
     * 经办人
     * isNullAble:1,defaultVal:
     */
    private String orderOperaterUserName;

    /**
     * 申请日期
     * isNullAble:1,defaultVal:
     */
    private String orderOperaterTime;

    /**
     * 类别
     * isNullAble:1,defaultVal:
     */
    private String orderType;

    /**
     * 财务审批表
     * isNullAble:1,defaultVal:
     */
    private String financialListCode;

    /**
     * 采购申请单号
     * isNullAble:1,defaultVal:
     */
    private String purchasingListCode;

    /**
     * 物料号
     * isNullAble:1,defaultVal:
     */
    private String materialCode;

    /**
     * 申请名称
     * isNullAble:1,defaultVal:
     */
    private String materialName;

    /**
     * 确定名称
     * isNullAble:1,defaultVal:
     */
    private String confirmMaterialName;

    /**
     * 申请规格型号
     * isNullAble:1,defaultVal:
     */
    private String materialSpecs;

    /**
     * 确定规格型号
     * isNullAble:1,defaultVal:
     */
    private String confirmMaterialSpecs;

    /**
     * 申请品牌
     * isNullAble:1,defaultVal:
     */
    private String materialBrand;

    /**
     * 确定品牌
     * isNullAble:1,defaultVal:
     */
    private String confirmMaterialBrand;

    /**
     * 单位
     * isNullAble:1,defaultVal:
     */
    private String materialUnit;

    /**
     * 订购数量
     * isNullAble:1
     */
    private Integer orderMaterialNum;

    /**
     * 费用中心
     * isNullAble:1,defaultVal:
     */
    private String financialCenterCode;

    /**
     * 采购担当
     * isNullAble:1,defaultVal:
     */
    private String orderBuyer;

    /**
     * 供应商名称
     * isNullAble:1,defaultVal:
     */
    private String supplierName;

    /**
     * 当前状态
     * isNullAble:1,defaultVal:
     */
    private String orderState;

    /**
     * 采购审核日期
     * isNullAble:1,defaultVal:
     */
    private String orderBuyerCheckDate;

    /**
     * 价格审核日期
     * isNullAble:1,defaultVal:
     */
    private String orderPriceCheckDate;

    /**
     * 采购订单号
     * isNullAble:1,defaultVal:
     */
    private String purchasingOrderCode;

    /**
     * 到货日期
     * isNullAble:1,defaultVal:
     */
    private String arrivalDate;

    /**
     * 验收数量
     * isNullAble:1
     */
    private Integer receivedNum;

    /**
     * 验收日期
     * isNullAble:1,defaultVal:
     */
    private String receivedDate;

    /**
     * 验收日期
     * isNullAble:1,defaultVal:
     */
    private String paymentType;

    /**
     * 付款比率
     * isNullAble:1,defaultVal:
     */
    private String paymentRate;

    /**
     * 预算类别
     * isNullAble:1,defaultVal:
     */
    private String budgetType;

    /**
     * 预算科目
     * isNullAble:1,defaultVal:
     */
    private String budgetSubject;

    /**
     * 投资管理号
     * isNullAble:1,defaultVal:
     */
    private String investManagementCode;

    /**
     * 研试费项目
     * isNullAble:1,defaultVal:
     */
    private String researchTestProject;

    /**
     * 建单人
     * isNullAble:1,defaultVal:
     */
    private String orderBuilderName;

    /**
     * 备注
     * isNullAble:1,defaultVal:
     */
    private String orderDescription;

    /**
     * WMS提单人
     * isNullAble:1
     */
    private Integer orderInitialUserId;

    /**
     * WMS提单时间
     * isNullAble:1,defaultVal:
     */
    private String orderInitialTime;

    /**
     * WMS审核状态
     * isNullAble:1,defaultVal:
     */
    private String orderInitialState;

    /**
     * 管理类型
     * isNullAble:1,defaultVal:
     */
    private String orderManagementType;

    /**
     *
     * isNullAble:1
     */
    private String orderManagementFormName;

    /**
     * 在外部管理表的id
     * isNullAble:1
     */
    private Integer orderManagementFormId;

    /**
     * 流程单号
     * isNullAble:1
     */
    private Long simpleApplicationObjectId;

    /**
     * 期望到货时间
     * isNullAble:1
     */
    private String prospectiveArrivalDate;

    /**
     * 供应商代码
     * isNullAble:1
     */
    private String supplierCode;

    /**
     * 是否已签开口合同
     * isNullAble:1
     */
    private String contractType;

    /**
     * 申请科室
     * isNullAble:1
     */
    private String orderInitialDepartment;

    /**
     * 申请人姓名
     * isNullAble:1
     */
    private String orderInitialUserName;

    /**
     * 推荐供应商名称
     * isNullAble:1
     */
    private String recommendedSupplierName;

    /**
     * 在库区分
     * isNullAble:1
     */
    private String warehouseSymbol;

    /**
     * 是否成本管理
     * isNullAble:1
     */
    private String costManagement;

    /**
     * 主键
     * 备件订单id
     * isNullAble:0
     */
    private Integer sparePartsOrderId;

    /**
     * 订单编号
     * isNullAble:1
     */
    private String orderCode;

    /**
     * 生产线
     * isNullAble:1
     */
    private String productionLine;

    /**
     * 工序号
     * isNullAble:1
     */
    private String operationPositionCode;

    /**
     * 设备厂家
     * isNullAble:1
     */
    private String equipmentCompany;

    /**
     * 品牌
     * isNullAble:1
     */
    private String sparePartsBrand;

    /**
     * 订购说明
     * isNullAble:1
     */
    private String sparePartsOrderDesc;

    /**
     * 紧急性
     * isNullAble:1
     */
    private String sparePartsEmergency;

    /**
     * 订购性质
     * isNullAble:1
     */
    private String sparePartsOrderReason;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderOperaterUserName() {
        return orderOperaterUserName;
    }

    public void setOrderOperaterUserName(String orderOperaterUserName) {
        this.orderOperaterUserName = orderOperaterUserName;
    }

    public String getOrderOperaterTime() {
        return orderOperaterTime;
    }

    public void setOrderOperaterTime(String orderOperaterTime) {
        this.orderOperaterTime = orderOperaterTime;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getFinancialListCode() {
        return financialListCode;
    }

    public void setFinancialListCode(String financialListCode) {
        this.financialListCode = financialListCode;
    }

    public String getPurchasingListCode() {
        return purchasingListCode;
    }

    public void setPurchasingListCode(String purchasingListCode) {
        this.purchasingListCode = purchasingListCode;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getConfirmMaterialName() {
        return confirmMaterialName;
    }

    public void setConfirmMaterialName(String confirmMaterialName) {
        this.confirmMaterialName = confirmMaterialName;
    }

    public String getMaterialSpecs() {
        return materialSpecs;
    }

    public void setMaterialSpecs(String materialSpecs) {
        this.materialSpecs = materialSpecs;
    }

    public String getConfirmMaterialSpecs() {
        return confirmMaterialSpecs;
    }

    public void setConfirmMaterialSpecs(String confirmMaterialSpecs) {
        this.confirmMaterialSpecs = confirmMaterialSpecs;
    }

    public String getMaterialBrand() {
        return materialBrand;
    }

    public void setMaterialBrand(String materialBrand) {
        this.materialBrand = materialBrand;
    }

    public String getConfirmMaterialBrand() {
        return confirmMaterialBrand;
    }

    public void setConfirmMaterialBrand(String confirmMaterialBrand) {
        this.confirmMaterialBrand = confirmMaterialBrand;
    }

    public String getMaterialUnit() {
        return materialUnit;
    }

    public void setMaterialUnit(String materialUnit) {
        this.materialUnit = materialUnit;
    }

    public Integer getOrderMaterialNum() {
        return orderMaterialNum;
    }

    public void setOrderMaterialNum(Integer orderMaterialNum) {
        this.orderMaterialNum = orderMaterialNum;
    }

    public String getFinancialCenterCode() {
        return financialCenterCode;
    }

    public void setFinancialCenterCode(String financialCenterCode) {
        this.financialCenterCode = financialCenterCode;
    }

    public String getOrderBuyer() {
        return orderBuyer;
    }

    public void setOrderBuyer(String orderBuyer) {
        this.orderBuyer = orderBuyer;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getOrderBuyerCheckDate() {
        return orderBuyerCheckDate;
    }

    public void setOrderBuyerCheckDate(String orderBuyerCheckDate) {
        this.orderBuyerCheckDate = orderBuyerCheckDate;
    }

    public String getOrderPriceCheckDate() {
        return orderPriceCheckDate;
    }

    public void setOrderPriceCheckDate(String orderPriceCheckDate) {
        this.orderPriceCheckDate = orderPriceCheckDate;
    }

    public String getPurchasingOrderCode() {
        return purchasingOrderCode;
    }

    public void setPurchasingOrderCode(String purchasingOrderCode) {
        this.purchasingOrderCode = purchasingOrderCode;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Integer getReceivedNum() {
        return receivedNum;
    }

    public void setReceivedNum(Integer receivedNum) {
        this.receivedNum = receivedNum;
    }

    public String getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(String receivedDate) {
        this.receivedDate = receivedDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentRate() {
        return paymentRate;
    }

    public void setPaymentRate(String paymentRate) {
        this.paymentRate = paymentRate;
    }

    public String getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(String budgetType) {
        this.budgetType = budgetType;
    }

    public String getBudgetSubject() {
        return budgetSubject;
    }

    public void setBudgetSubject(String budgetSubject) {
        this.budgetSubject = budgetSubject;
    }

    public String getInvestManagementCode() {
        return investManagementCode;
    }

    public void setInvestManagementCode(String investManagementCode) {
        this.investManagementCode = investManagementCode;
    }

    public String getResearchTestProject() {
        return researchTestProject;
    }

    public void setResearchTestProject(String researchTestProject) {
        this.researchTestProject = researchTestProject;
    }

    public String getOrderBuilderName() {
        return orderBuilderName;
    }

    public void setOrderBuilderName(String orderBuilderName) {
        this.orderBuilderName = orderBuilderName;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public Integer getOrderInitialUserId() {
        return orderInitialUserId;
    }

    public void setOrderInitialUserId(Integer orderInitialUserId) {
        this.orderInitialUserId = orderInitialUserId;
    }

    public String getOrderInitialTime() {
        return orderInitialTime;
    }

    public void setOrderInitialTime(String orderInitialTime) {
        this.orderInitialTime = orderInitialTime;
    }

    public String getOrderInitialState() {
        return orderInitialState;
    }

    public void setOrderInitialState(String orderInitialState) {
        this.orderInitialState = orderInitialState;
    }

    public String getOrderManagementType() {
        return orderManagementType;
    }

    public void setOrderManagementType(String orderManagementType) {
        this.orderManagementType = orderManagementType;
    }

    public String getOrderManagementFormName() {
        return orderManagementFormName;
    }

    public void setOrderManagementFormName(String orderManagementFormName) {
        this.orderManagementFormName = orderManagementFormName;
    }

    public Integer getOrderManagementFormId() {
        return orderManagementFormId;
    }

    public void setOrderManagementFormId(Integer orderManagementFormId) {
        this.orderManagementFormId = orderManagementFormId;
    }

    public Long getSimpleApplicationObjectId() {
        return simpleApplicationObjectId;
    }

    public void setSimpleApplicationObjectId(Long simpleApplicationObjectId) {
        this.simpleApplicationObjectId = simpleApplicationObjectId;
    }

    public String getProspectiveArrivalDate() {
        return prospectiveArrivalDate;
    }

    public void setProspectiveArrivalDate(String prospectiveArrivalDate) {
        this.prospectiveArrivalDate = prospectiveArrivalDate;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getOrderInitialDepartment() {
        return orderInitialDepartment;
    }

    public void setOrderInitialDepartment(String orderInitialDepartment) {
        this.orderInitialDepartment = orderInitialDepartment;
    }

    public String getOrderInitialUserName() {
        return orderInitialUserName;
    }

    public void setOrderInitialUserName(String orderInitialUserName) {
        this.orderInitialUserName = orderInitialUserName;
    }

    public String getRecommendedSupplierName() {
        return recommendedSupplierName;
    }

    public void setRecommendedSupplierName(String recommendedSupplierName) {
        this.recommendedSupplierName = recommendedSupplierName;
    }

    public String getWarehouseSymbol() {
        return warehouseSymbol;
    }

    public void setWarehouseSymbol(String warehouseSymbol) {
        this.warehouseSymbol = warehouseSymbol;
    }

    public String getCostManagement() {
        return costManagement;
    }

    public void setCostManagement(String costManagement) {
        this.costManagement = costManagement;
    }

    public Integer getSparePartsOrderId() {
        return sparePartsOrderId;
    }

    public void setSparePartsOrderId(Integer sparePartsOrderId) {
        this.sparePartsOrderId = sparePartsOrderId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getProductionLine() {
        return productionLine;
    }

    public void setProductionLine(String productionLine) {
        this.productionLine = productionLine;
    }

    public String getOperationPositionCode() {
        return operationPositionCode;
    }

    public void setOperationPositionCode(String operationPositionCode) {
        this.operationPositionCode = operationPositionCode;
    }

    public String getEquipmentCompany() {
        return equipmentCompany;
    }

    public void setEquipmentCompany(String equipmentCompany) {
        this.equipmentCompany = equipmentCompany;
    }

    public String getSparePartsBrand() {
        return sparePartsBrand;
    }

    public void setSparePartsBrand(String sparePartsBrand) {
        this.sparePartsBrand = sparePartsBrand;
    }

    public String getSparePartsOrderDesc() {
        return sparePartsOrderDesc;
    }

    public void setSparePartsOrderDesc(String sparePartsOrderDesc) {
        this.sparePartsOrderDesc = sparePartsOrderDesc;
    }

    public String getSparePartsEmergency() {
        return sparePartsEmergency;
    }

    public void setSparePartsEmergency(String sparePartsEmergency) {
        this.sparePartsEmergency = sparePartsEmergency;
    }

    public String getSparePartsOrderReason() {
        return sparePartsOrderReason;
    }

    public void setSparePartsOrderReason(String sparePartsOrderReason) {
        this.sparePartsOrderReason = sparePartsOrderReason;
    }
}
