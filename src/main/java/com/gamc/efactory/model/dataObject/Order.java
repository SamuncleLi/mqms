package com.gamc.efactory.model.dataObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class Order implements Serializable {

    private static final long serialVersionUID = 1566895023830L;


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
    * 在外部管理表的表名
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
    * 备件品牌
    * isNullAble:1
    */
    private String sparePartsBrand;

    /**
    * 备件订购说明
    * isNullAble:1
    */
    private String sparePartsOrderDesc;

    /**
    * 订购紧急性
    * isNullAble:1
    */
    private String sparePartsEmergency;

    /**
    * 订购原因（补充说明）
    * isNullAble:1
    */
    private String extraOrderReason;

    /**
    * 刀号
    * isNullAble:1
    */
    private String knifeCode;

    /**
    * 重点项目管理号
    * isNullAble:1
    */
    private String importantProjectCode;

    /**
    * 调整原因代码
    * isNullAble:1
    */
    private String warehousingReasonCode;

    /**
    * 汇总订单号
    * isNullAble:1
    */
    private String orderListCode;

    /**
    * 
    * isNullAble:1
    */
    private String variables;

    /**
    * 仓库代码
    * isNullAble:1
    */
    private String warehouseCode;


    public void setOrderId(Long orderId){this.orderId = orderId;}

    public Long getOrderId(){return this.orderId;}

    public void setOrderOperaterUserName(String orderOperaterUserName){this.orderOperaterUserName = orderOperaterUserName;}

    public String getOrderOperaterUserName(){return this.orderOperaterUserName;}

    public void setOrderOperaterTime(String orderOperaterTime){this.orderOperaterTime = orderOperaterTime;}

    public String getOrderOperaterTime(){return this.orderOperaterTime;}

    public void setOrderType(String orderType){this.orderType = orderType;}

    public String getOrderType(){return this.orderType;}

    public void setFinancialListCode(String financialListCode){this.financialListCode = financialListCode;}

    public String getFinancialListCode(){return this.financialListCode;}

    public void setPurchasingListCode(String purchasingListCode){this.purchasingListCode = purchasingListCode;}

    public String getPurchasingListCode(){return this.purchasingListCode;}

    public void setMaterialCode(String materialCode){this.materialCode = materialCode;}

    public String getMaterialCode(){return this.materialCode;}

    public void setMaterialName(String materialName){this.materialName = materialName;}

    public String getMaterialName(){return this.materialName;}

    public void setConfirmMaterialName(String confirmMaterialName){this.confirmMaterialName = confirmMaterialName;}

    public String getConfirmMaterialName(){return this.confirmMaterialName;}

    public void setMaterialSpecs(String materialSpecs){this.materialSpecs = materialSpecs;}

    public String getMaterialSpecs(){return this.materialSpecs;}

    public void setConfirmMaterialSpecs(String confirmMaterialSpecs){this.confirmMaterialSpecs = confirmMaterialSpecs;}

    public String getConfirmMaterialSpecs(){return this.confirmMaterialSpecs;}

    public void setMaterialBrand(String materialBrand){this.materialBrand = materialBrand;}

    public String getMaterialBrand(){return this.materialBrand;}

    public void setConfirmMaterialBrand(String confirmMaterialBrand){this.confirmMaterialBrand = confirmMaterialBrand;}

    public String getConfirmMaterialBrand(){return this.confirmMaterialBrand;}

    public void setMaterialUnit(String materialUnit){this.materialUnit = materialUnit;}

    public String getMaterialUnit(){return this.materialUnit;}

    public void setOrderMaterialNum(Integer orderMaterialNum){this.orderMaterialNum = orderMaterialNum;}

    public Integer getOrderMaterialNum(){return this.orderMaterialNum;}

    public void setFinancialCenterCode(String financialCenterCode){this.financialCenterCode = financialCenterCode;}

    public String getFinancialCenterCode(){return this.financialCenterCode;}

    public void setOrderBuyer(String orderBuyer){this.orderBuyer = orderBuyer;}

    public String getOrderBuyer(){return this.orderBuyer;}

    public void setSupplierName(String supplierName){this.supplierName = supplierName;}

    public String getSupplierName(){return this.supplierName;}

    public void setOrderState(String orderState){this.orderState = orderState;}

    public String getOrderState(){return this.orderState;}

    public void setOrderBuyerCheckDate(String orderBuyerCheckDate){this.orderBuyerCheckDate = orderBuyerCheckDate;}

    public String getOrderBuyerCheckDate(){return this.orderBuyerCheckDate;}

    public void setOrderPriceCheckDate(String orderPriceCheckDate){this.orderPriceCheckDate = orderPriceCheckDate;}

    public String getOrderPriceCheckDate(){return this.orderPriceCheckDate;}

    public void setPurchasingOrderCode(String purchasingOrderCode){this.purchasingOrderCode = purchasingOrderCode;}

    public String getPurchasingOrderCode(){return this.purchasingOrderCode;}

    public void setArrivalDate(String arrivalDate){this.arrivalDate = arrivalDate;}

    public String getArrivalDate(){return this.arrivalDate;}

    public void setReceivedNum(Integer receivedNum){this.receivedNum = receivedNum;}

    public Integer getReceivedNum(){return this.receivedNum;}

    public void setReceivedDate(String receivedDate){this.receivedDate = receivedDate;}

    public String getReceivedDate(){return this.receivedDate;}

    public void setPaymentType(String paymentType){this.paymentType = paymentType;}

    public String getPaymentType(){return this.paymentType;}

    public void setPaymentRate(String paymentRate){this.paymentRate = paymentRate;}

    public String getPaymentRate(){return this.paymentRate;}

    public void setBudgetType(String budgetType){this.budgetType = budgetType;}

    public String getBudgetType(){return this.budgetType;}

    public void setBudgetSubject(String budgetSubject){this.budgetSubject = budgetSubject;}

    public String getBudgetSubject(){return this.budgetSubject;}

    public void setInvestManagementCode(String investManagementCode){this.investManagementCode = investManagementCode;}

    public String getInvestManagementCode(){return this.investManagementCode;}

    public void setResearchTestProject(String researchTestProject){this.researchTestProject = researchTestProject;}

    public String getResearchTestProject(){return this.researchTestProject;}

    public void setOrderBuilderName(String orderBuilderName){this.orderBuilderName = orderBuilderName;}

    public String getOrderBuilderName(){return this.orderBuilderName;}

    public void setOrderDescription(String orderDescription){this.orderDescription = orderDescription;}

    public String getOrderDescription(){return this.orderDescription;}

    public void setOrderInitialUserId(Integer orderInitialUserId){this.orderInitialUserId = orderInitialUserId;}

    public Integer getOrderInitialUserId(){return this.orderInitialUserId;}

    public void setOrderInitialTime(String orderInitialTime){this.orderInitialTime = orderInitialTime;}

    public String getOrderInitialTime(){return this.orderInitialTime;}

    public void setOrderInitialState(String orderInitialState){this.orderInitialState = orderInitialState;}

    public String getOrderInitialState(){return this.orderInitialState;}

    public void setOrderManagementType(String orderManagementType){this.orderManagementType = orderManagementType;}

    public String getOrderManagementType(){return this.orderManagementType;}

    public void setOrderManagementFormName(String orderManagementFormName){this.orderManagementFormName = orderManagementFormName;}

    public String getOrderManagementFormName(){return this.orderManagementFormName;}

    public void setOrderManagementFormId(Integer orderManagementFormId){this.orderManagementFormId = orderManagementFormId;}

    public Integer getOrderManagementFormId(){return this.orderManagementFormId;}

    public void setSimpleApplicationObjectId(Long simpleApplicationObjectId){this.simpleApplicationObjectId = simpleApplicationObjectId;}

    public Long getSimpleApplicationObjectId(){return this.simpleApplicationObjectId;}

    public void setProspectiveArrivalDate(String prospectiveArrivalDate){this.prospectiveArrivalDate = prospectiveArrivalDate;}

    public String getProspectiveArrivalDate(){return this.prospectiveArrivalDate;}

    public void setSupplierCode(String supplierCode){this.supplierCode = supplierCode;}

    public String getSupplierCode(){return this.supplierCode;}

    public void setContractType(String contractType){this.contractType = contractType;}

    public String getContractType(){return this.contractType;}

    public void setOrderInitialDepartment(String orderInitialDepartment){this.orderInitialDepartment = orderInitialDepartment;}

    public String getOrderInitialDepartment(){return this.orderInitialDepartment;}

    public void setOrderInitialUserName(String orderInitialUserName){this.orderInitialUserName = orderInitialUserName;}

    public String getOrderInitialUserName(){return this.orderInitialUserName;}

    public void setRecommendedSupplierName(String recommendedSupplierName){this.recommendedSupplierName = recommendedSupplierName;}

    public String getRecommendedSupplierName(){return this.recommendedSupplierName;}

    public void setWarehouseSymbol(String warehouseSymbol){this.warehouseSymbol = warehouseSymbol;}

    public String getWarehouseSymbol(){return this.warehouseSymbol;}

    public void setCostManagement(String costManagement){this.costManagement = costManagement;}

    public String getCostManagement(){return this.costManagement;}

    public void setProductionLine(String productionLine){this.productionLine = productionLine;}

    public String getProductionLine(){return this.productionLine;}

    public void setOperationPositionCode(String operationPositionCode){this.operationPositionCode = operationPositionCode;}

    public String getOperationPositionCode(){return this.operationPositionCode;}

    public void setEquipmentCompany(String equipmentCompany){this.equipmentCompany = equipmentCompany;}

    public String getEquipmentCompany(){return this.equipmentCompany;}

    public void setSparePartsBrand(String sparePartsBrand){this.sparePartsBrand = sparePartsBrand;}

    public String getSparePartsBrand(){return this.sparePartsBrand;}

    public void setSparePartsOrderDesc(String sparePartsOrderDesc){this.sparePartsOrderDesc = sparePartsOrderDesc;}

    public String getSparePartsOrderDesc(){return this.sparePartsOrderDesc;}

    public void setSparePartsEmergency(String sparePartsEmergency){this.sparePartsEmergency = sparePartsEmergency;}

    public String getSparePartsEmergency(){return this.sparePartsEmergency;}

    public void setExtraOrderReason(String extraOrderReason){this.extraOrderReason = extraOrderReason;}

    public String getExtraOrderReason(){return this.extraOrderReason;}

    public void setKnifeCode(String knifeCode){this.knifeCode = knifeCode;}

    public String getKnifeCode(){return this.knifeCode;}

    public void setImportantProjectCode(String importantProjectCode){this.importantProjectCode = importantProjectCode;}

    public String getImportantProjectCode(){return this.importantProjectCode;}

    public void setWarehousingReasonCode(String warehousingReasonCode){this.warehousingReasonCode = warehousingReasonCode;}

    public String getWarehousingReasonCode(){return this.warehousingReasonCode;}

    public void setOrderListCode(String orderListCode){this.orderListCode = orderListCode;}

    public String getOrderListCode(){return this.orderListCode;}

    public void setVariables(String variables){this.variables = variables;}

    public String getVariables(){return this.variables;}

    public void setWarehouseCode(String warehouseCode){this.warehouseCode = warehouseCode;}

    public String getWarehouseCode(){return this.warehouseCode;}
    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                "orderOperaterUserName='" + orderOperaterUserName + '\'' +
                "orderOperaterTime='" + orderOperaterTime + '\'' +
                "orderType='" + orderType + '\'' +
                "financialListCode='" + financialListCode + '\'' +
                "purchasingListCode='" + purchasingListCode + '\'' +
                "materialCode='" + materialCode + '\'' +
                "materialName='" + materialName + '\'' +
                "confirmMaterialName='" + confirmMaterialName + '\'' +
                "materialSpecs='" + materialSpecs + '\'' +
                "confirmMaterialSpecs='" + confirmMaterialSpecs + '\'' +
                "materialBrand='" + materialBrand + '\'' +
                "confirmMaterialBrand='" + confirmMaterialBrand + '\'' +
                "materialUnit='" + materialUnit + '\'' +
                "orderMaterialNum='" + orderMaterialNum + '\'' +
                "financialCenterCode='" + financialCenterCode + '\'' +
                "orderBuyer='" + orderBuyer + '\'' +
                "supplierName='" + supplierName + '\'' +
                "orderState='" + orderState + '\'' +
                "orderBuyerCheckDate='" + orderBuyerCheckDate + '\'' +
                "orderPriceCheckDate='" + orderPriceCheckDate + '\'' +
                "purchasingOrderCode='" + purchasingOrderCode + '\'' +
                "arrivalDate='" + arrivalDate + '\'' +
                "receivedNum='" + receivedNum + '\'' +
                "receivedDate='" + receivedDate + '\'' +
                "paymentType='" + paymentType + '\'' +
                "paymentRate='" + paymentRate + '\'' +
                "budgetType='" + budgetType + '\'' +
                "budgetSubject='" + budgetSubject + '\'' +
                "investManagementCode='" + investManagementCode + '\'' +
                "researchTestProject='" + researchTestProject + '\'' +
                "orderBuilderName='" + orderBuilderName + '\'' +
                "orderDescription='" + orderDescription + '\'' +
                "orderInitialUserId='" + orderInitialUserId + '\'' +
                "orderInitialTime='" + orderInitialTime + '\'' +
                "orderInitialState='" + orderInitialState + '\'' +
                "orderManagementType='" + orderManagementType + '\'' +
                "orderManagementFormName='" + orderManagementFormName + '\'' +
                "orderManagementFormId='" + orderManagementFormId + '\'' +
                "simpleApplicationObjectId='" + simpleApplicationObjectId + '\'' +
                "prospectiveArrivalDate='" + prospectiveArrivalDate + '\'' +
                "supplierCode='" + supplierCode + '\'' +
                "contractType='" + contractType + '\'' +
                "orderInitialDepartment='" + orderInitialDepartment + '\'' +
                "orderInitialUserName='" + orderInitialUserName + '\'' +
                "recommendedSupplierName='" + recommendedSupplierName + '\'' +
                "warehouseSymbol='" + warehouseSymbol + '\'' +
                "costManagement='" + costManagement + '\'' +
                "productionLine='" + productionLine + '\'' +
                "operationPositionCode='" + operationPositionCode + '\'' +
                "equipmentCompany='" + equipmentCompany + '\'' +
                "sparePartsBrand='" + sparePartsBrand + '\'' +
                "sparePartsOrderDesc='" + sparePartsOrderDesc + '\'' +
                "sparePartsEmergency='" + sparePartsEmergency + '\'' +
                "extraOrderReason='" + extraOrderReason + '\'' +
                "knifeCode='" + knifeCode + '\'' +
                "importantProjectCode='" + importantProjectCode + '\'' +
                "warehousingReasonCode='" + warehousingReasonCode + '\'' +
                "orderListCode='" + orderListCode + '\'' +
                "variables='" + variables + '\'' +
                "warehouseCode='" + warehouseCode + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Order set;

        private ConditionBuilder where;

        public UpdateBuilder set(Order set){
            this.set = set;
            return this;
        }

        public Order getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends Order{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Long> orderIdList;

        public List<Long> getOrderIdList(){return this.orderIdList;}

        private Long orderIdSt;

        private Long orderIdEd;

        public Long getOrderIdSt(){return this.orderIdSt;}

        public Long getOrderIdEd(){return this.orderIdEd;}

        private List<String> orderOperaterUserNameList;

        public List<String> getOrderOperaterUserNameList(){return this.orderOperaterUserNameList;}


        private List<String> fuzzyOrderOperaterUserName;

        public List<String> getFuzzyOrderOperaterUserName(){return this.fuzzyOrderOperaterUserName;}

        private List<String> rightFuzzyOrderOperaterUserName;

        public List<String> getRightFuzzyOrderOperaterUserName(){return this.rightFuzzyOrderOperaterUserName;}
        private List<String> orderOperaterTimeList;

        public List<String> getOrderOperaterTimeList(){return this.orderOperaterTimeList;}


        private List<String> fuzzyOrderOperaterTime;

        public List<String> getFuzzyOrderOperaterTime(){return this.fuzzyOrderOperaterTime;}

        private List<String> rightFuzzyOrderOperaterTime;

        public List<String> getRightFuzzyOrderOperaterTime(){return this.rightFuzzyOrderOperaterTime;}
        private List<String> orderTypeList;

        public List<String> getOrderTypeList(){return this.orderTypeList;}


        private List<String> fuzzyOrderType;

        public List<String> getFuzzyOrderType(){return this.fuzzyOrderType;}

        private List<String> rightFuzzyOrderType;

        public List<String> getRightFuzzyOrderType(){return this.rightFuzzyOrderType;}
        private List<String> financialListCodeList;

        public List<String> getFinancialListCodeList(){return this.financialListCodeList;}


        private List<String> fuzzyFinancialListCode;

        public List<String> getFuzzyFinancialListCode(){return this.fuzzyFinancialListCode;}

        private List<String> rightFuzzyFinancialListCode;

        public List<String> getRightFuzzyFinancialListCode(){return this.rightFuzzyFinancialListCode;}
        private List<String> purchasingListCodeList;

        public List<String> getPurchasingListCodeList(){return this.purchasingListCodeList;}


        private List<String> fuzzyPurchasingListCode;

        public List<String> getFuzzyPurchasingListCode(){return this.fuzzyPurchasingListCode;}

        private List<String> rightFuzzyPurchasingListCode;

        public List<String> getRightFuzzyPurchasingListCode(){return this.rightFuzzyPurchasingListCode;}
        private List<String> materialCodeList;

        public List<String> getMaterialCodeList(){return this.materialCodeList;}


        private List<String> fuzzyMaterialCode;

        public List<String> getFuzzyMaterialCode(){return this.fuzzyMaterialCode;}

        private List<String> rightFuzzyMaterialCode;

        public List<String> getRightFuzzyMaterialCode(){return this.rightFuzzyMaterialCode;}
        private List<String> materialNameList;

        public List<String> getMaterialNameList(){return this.materialNameList;}


        private List<String> fuzzyMaterialName;

        public List<String> getFuzzyMaterialName(){return this.fuzzyMaterialName;}

        private List<String> rightFuzzyMaterialName;

        public List<String> getRightFuzzyMaterialName(){return this.rightFuzzyMaterialName;}
        private List<String> confirmMaterialNameList;

        public List<String> getConfirmMaterialNameList(){return this.confirmMaterialNameList;}


        private List<String> fuzzyConfirmMaterialName;

        public List<String> getFuzzyConfirmMaterialName(){return this.fuzzyConfirmMaterialName;}

        private List<String> rightFuzzyConfirmMaterialName;

        public List<String> getRightFuzzyConfirmMaterialName(){return this.rightFuzzyConfirmMaterialName;}
        private List<String> materialSpecsList;

        public List<String> getMaterialSpecsList(){return this.materialSpecsList;}


        private List<String> fuzzyMaterialSpecs;

        public List<String> getFuzzyMaterialSpecs(){return this.fuzzyMaterialSpecs;}

        private List<String> rightFuzzyMaterialSpecs;

        public List<String> getRightFuzzyMaterialSpecs(){return this.rightFuzzyMaterialSpecs;}
        private List<String> confirmMaterialSpecsList;

        public List<String> getConfirmMaterialSpecsList(){return this.confirmMaterialSpecsList;}


        private List<String> fuzzyConfirmMaterialSpecs;

        public List<String> getFuzzyConfirmMaterialSpecs(){return this.fuzzyConfirmMaterialSpecs;}

        private List<String> rightFuzzyConfirmMaterialSpecs;

        public List<String> getRightFuzzyConfirmMaterialSpecs(){return this.rightFuzzyConfirmMaterialSpecs;}
        private List<String> materialBrandList;

        public List<String> getMaterialBrandList(){return this.materialBrandList;}


        private List<String> fuzzyMaterialBrand;

        public List<String> getFuzzyMaterialBrand(){return this.fuzzyMaterialBrand;}

        private List<String> rightFuzzyMaterialBrand;

        public List<String> getRightFuzzyMaterialBrand(){return this.rightFuzzyMaterialBrand;}
        private List<String> confirmMaterialBrandList;

        public List<String> getConfirmMaterialBrandList(){return this.confirmMaterialBrandList;}


        private List<String> fuzzyConfirmMaterialBrand;

        public List<String> getFuzzyConfirmMaterialBrand(){return this.fuzzyConfirmMaterialBrand;}

        private List<String> rightFuzzyConfirmMaterialBrand;

        public List<String> getRightFuzzyConfirmMaterialBrand(){return this.rightFuzzyConfirmMaterialBrand;}
        private List<String> materialUnitList;

        public List<String> getMaterialUnitList(){return this.materialUnitList;}


        private List<String> fuzzyMaterialUnit;

        public List<String> getFuzzyMaterialUnit(){return this.fuzzyMaterialUnit;}

        private List<String> rightFuzzyMaterialUnit;

        public List<String> getRightFuzzyMaterialUnit(){return this.rightFuzzyMaterialUnit;}
        private List<Integer> orderMaterialNumList;

        public List<Integer> getOrderMaterialNumList(){return this.orderMaterialNumList;}

        private Integer orderMaterialNumSt;

        private Integer orderMaterialNumEd;

        public Integer getOrderMaterialNumSt(){return this.orderMaterialNumSt;}

        public Integer getOrderMaterialNumEd(){return this.orderMaterialNumEd;}

        private List<String> financialCenterCodeList;

        public List<String> getFinancialCenterCodeList(){return this.financialCenterCodeList;}


        private List<String> fuzzyFinancialCenterCode;

        public List<String> getFuzzyFinancialCenterCode(){return this.fuzzyFinancialCenterCode;}

        private List<String> rightFuzzyFinancialCenterCode;

        public List<String> getRightFuzzyFinancialCenterCode(){return this.rightFuzzyFinancialCenterCode;}
        private List<String> orderBuyerList;

        public List<String> getOrderBuyerList(){return this.orderBuyerList;}


        private List<String> fuzzyOrderBuyer;

        public List<String> getFuzzyOrderBuyer(){return this.fuzzyOrderBuyer;}

        private List<String> rightFuzzyOrderBuyer;

        public List<String> getRightFuzzyOrderBuyer(){return this.rightFuzzyOrderBuyer;}
        private List<String> supplierNameList;

        public List<String> getSupplierNameList(){return this.supplierNameList;}


        private List<String> fuzzySupplierName;

        public List<String> getFuzzySupplierName(){return this.fuzzySupplierName;}

        private List<String> rightFuzzySupplierName;

        public List<String> getRightFuzzySupplierName(){return this.rightFuzzySupplierName;}
        private List<String> orderStateList;

        public List<String> getOrderStateList(){return this.orderStateList;}


        private List<String> fuzzyOrderState;

        public List<String> getFuzzyOrderState(){return this.fuzzyOrderState;}

        private List<String> rightFuzzyOrderState;

        public List<String> getRightFuzzyOrderState(){return this.rightFuzzyOrderState;}
        private List<String> orderBuyerCheckDateList;

        public List<String> getOrderBuyerCheckDateList(){return this.orderBuyerCheckDateList;}


        private List<String> fuzzyOrderBuyerCheckDate;

        public List<String> getFuzzyOrderBuyerCheckDate(){return this.fuzzyOrderBuyerCheckDate;}

        private List<String> rightFuzzyOrderBuyerCheckDate;

        public List<String> getRightFuzzyOrderBuyerCheckDate(){return this.rightFuzzyOrderBuyerCheckDate;}
        private List<String> orderPriceCheckDateList;

        public List<String> getOrderPriceCheckDateList(){return this.orderPriceCheckDateList;}


        private List<String> fuzzyOrderPriceCheckDate;

        public List<String> getFuzzyOrderPriceCheckDate(){return this.fuzzyOrderPriceCheckDate;}

        private List<String> rightFuzzyOrderPriceCheckDate;

        public List<String> getRightFuzzyOrderPriceCheckDate(){return this.rightFuzzyOrderPriceCheckDate;}
        private List<String> purchasingOrderCodeList;

        public List<String> getPurchasingOrderCodeList(){return this.purchasingOrderCodeList;}


        private List<String> fuzzyPurchasingOrderCode;

        public List<String> getFuzzyPurchasingOrderCode(){return this.fuzzyPurchasingOrderCode;}

        private List<String> rightFuzzyPurchasingOrderCode;

        public List<String> getRightFuzzyPurchasingOrderCode(){return this.rightFuzzyPurchasingOrderCode;}
        private List<String> arrivalDateList;

        public List<String> getArrivalDateList(){return this.arrivalDateList;}


        private List<String> fuzzyArrivalDate;

        public List<String> getFuzzyArrivalDate(){return this.fuzzyArrivalDate;}

        private List<String> rightFuzzyArrivalDate;

        public List<String> getRightFuzzyArrivalDate(){return this.rightFuzzyArrivalDate;}
        private List<Integer> receivedNumList;

        public List<Integer> getReceivedNumList(){return this.receivedNumList;}

        private Integer receivedNumSt;

        private Integer receivedNumEd;

        public Integer getReceivedNumSt(){return this.receivedNumSt;}

        public Integer getReceivedNumEd(){return this.receivedNumEd;}

        private List<String> receivedDateList;

        public List<String> getReceivedDateList(){return this.receivedDateList;}


        private List<String> fuzzyReceivedDate;

        public List<String> getFuzzyReceivedDate(){return this.fuzzyReceivedDate;}

        private List<String> rightFuzzyReceivedDate;

        public List<String> getRightFuzzyReceivedDate(){return this.rightFuzzyReceivedDate;}
        private List<String> paymentTypeList;

        public List<String> getPaymentTypeList(){return this.paymentTypeList;}


        private List<String> fuzzyPaymentType;

        public List<String> getFuzzyPaymentType(){return this.fuzzyPaymentType;}

        private List<String> rightFuzzyPaymentType;

        public List<String> getRightFuzzyPaymentType(){return this.rightFuzzyPaymentType;}
        private List<String> paymentRateList;

        public List<String> getPaymentRateList(){return this.paymentRateList;}


        private List<String> fuzzyPaymentRate;

        public List<String> getFuzzyPaymentRate(){return this.fuzzyPaymentRate;}

        private List<String> rightFuzzyPaymentRate;

        public List<String> getRightFuzzyPaymentRate(){return this.rightFuzzyPaymentRate;}
        private List<String> budgetTypeList;

        public List<String> getBudgetTypeList(){return this.budgetTypeList;}


        private List<String> fuzzyBudgetType;

        public List<String> getFuzzyBudgetType(){return this.fuzzyBudgetType;}

        private List<String> rightFuzzyBudgetType;

        public List<String> getRightFuzzyBudgetType(){return this.rightFuzzyBudgetType;}
        private List<String> budgetSubjectList;

        public List<String> getBudgetSubjectList(){return this.budgetSubjectList;}


        private List<String> fuzzyBudgetSubject;

        public List<String> getFuzzyBudgetSubject(){return this.fuzzyBudgetSubject;}

        private List<String> rightFuzzyBudgetSubject;

        public List<String> getRightFuzzyBudgetSubject(){return this.rightFuzzyBudgetSubject;}
        private List<String> investManagementCodeList;

        public List<String> getInvestManagementCodeList(){return this.investManagementCodeList;}


        private List<String> fuzzyInvestManagementCode;

        public List<String> getFuzzyInvestManagementCode(){return this.fuzzyInvestManagementCode;}

        private List<String> rightFuzzyInvestManagementCode;

        public List<String> getRightFuzzyInvestManagementCode(){return this.rightFuzzyInvestManagementCode;}
        private List<String> researchTestProjectList;

        public List<String> getResearchTestProjectList(){return this.researchTestProjectList;}


        private List<String> fuzzyResearchTestProject;

        public List<String> getFuzzyResearchTestProject(){return this.fuzzyResearchTestProject;}

        private List<String> rightFuzzyResearchTestProject;

        public List<String> getRightFuzzyResearchTestProject(){return this.rightFuzzyResearchTestProject;}
        private List<String> orderBuilderNameList;

        public List<String> getOrderBuilderNameList(){return this.orderBuilderNameList;}


        private List<String> fuzzyOrderBuilderName;

        public List<String> getFuzzyOrderBuilderName(){return this.fuzzyOrderBuilderName;}

        private List<String> rightFuzzyOrderBuilderName;

        public List<String> getRightFuzzyOrderBuilderName(){return this.rightFuzzyOrderBuilderName;}
        private List<String> orderDescriptionList;

        public List<String> getOrderDescriptionList(){return this.orderDescriptionList;}


        private List<String> fuzzyOrderDescription;

        public List<String> getFuzzyOrderDescription(){return this.fuzzyOrderDescription;}

        private List<String> rightFuzzyOrderDescription;

        public List<String> getRightFuzzyOrderDescription(){return this.rightFuzzyOrderDescription;}
        private List<Integer> orderInitialUserIdList;

        public List<Integer> getOrderInitialUserIdList(){return this.orderInitialUserIdList;}

        private Integer orderInitialUserIdSt;

        private Integer orderInitialUserIdEd;

        public Integer getOrderInitialUserIdSt(){return this.orderInitialUserIdSt;}

        public Integer getOrderInitialUserIdEd(){return this.orderInitialUserIdEd;}

        private List<String> orderInitialTimeList;

        public List<String> getOrderInitialTimeList(){return this.orderInitialTimeList;}


        private List<String> fuzzyOrderInitialTime;

        public List<String> getFuzzyOrderInitialTime(){return this.fuzzyOrderInitialTime;}

        private List<String> rightFuzzyOrderInitialTime;

        public List<String> getRightFuzzyOrderInitialTime(){return this.rightFuzzyOrderInitialTime;}
        private List<String> orderInitialStateList;

        public List<String> getOrderInitialStateList(){return this.orderInitialStateList;}


        private List<String> fuzzyOrderInitialState;

        public List<String> getFuzzyOrderInitialState(){return this.fuzzyOrderInitialState;}

        private List<String> rightFuzzyOrderInitialState;

        public List<String> getRightFuzzyOrderInitialState(){return this.rightFuzzyOrderInitialState;}
        private List<String> orderManagementTypeList;

        public List<String> getOrderManagementTypeList(){return this.orderManagementTypeList;}


        private List<String> fuzzyOrderManagementType;

        public List<String> getFuzzyOrderManagementType(){return this.fuzzyOrderManagementType;}

        private List<String> rightFuzzyOrderManagementType;

        public List<String> getRightFuzzyOrderManagementType(){return this.rightFuzzyOrderManagementType;}
        private List<String> orderManagementFormNameList;

        public List<String> getOrderManagementFormNameList(){return this.orderManagementFormNameList;}


        private List<String> fuzzyOrderManagementFormName;

        public List<String> getFuzzyOrderManagementFormName(){return this.fuzzyOrderManagementFormName;}

        private List<String> rightFuzzyOrderManagementFormName;

        public List<String> getRightFuzzyOrderManagementFormName(){return this.rightFuzzyOrderManagementFormName;}
        private List<Integer> orderManagementFormIdList;

        public List<Integer> getOrderManagementFormIdList(){return this.orderManagementFormIdList;}

        private Integer orderManagementFormIdSt;

        private Integer orderManagementFormIdEd;

        public Integer getOrderManagementFormIdSt(){return this.orderManagementFormIdSt;}

        public Integer getOrderManagementFormIdEd(){return this.orderManagementFormIdEd;}

        private List<Long> simpleApplicationObjectIdList;

        public List<Long> getSimpleApplicationObjectIdList(){return this.simpleApplicationObjectIdList;}

        private Long simpleApplicationObjectIdSt;

        private Long simpleApplicationObjectIdEd;

        public Long getSimpleApplicationObjectIdSt(){return this.simpleApplicationObjectIdSt;}

        public Long getSimpleApplicationObjectIdEd(){return this.simpleApplicationObjectIdEd;}

        private List<String> prospectiveArrivalDateList;

        public List<String> getProspectiveArrivalDateList(){return this.prospectiveArrivalDateList;}


        private List<String> fuzzyProspectiveArrivalDate;

        public List<String> getFuzzyProspectiveArrivalDate(){return this.fuzzyProspectiveArrivalDate;}

        private List<String> rightFuzzyProspectiveArrivalDate;

        public List<String> getRightFuzzyProspectiveArrivalDate(){return this.rightFuzzyProspectiveArrivalDate;}
        private List<String> supplierCodeList;

        public List<String> getSupplierCodeList(){return this.supplierCodeList;}


        private List<String> fuzzySupplierCode;

        public List<String> getFuzzySupplierCode(){return this.fuzzySupplierCode;}

        private List<String> rightFuzzySupplierCode;

        public List<String> getRightFuzzySupplierCode(){return this.rightFuzzySupplierCode;}
        private List<String> contractTypeList;

        public List<String> getContractTypeList(){return this.contractTypeList;}


        private List<String> fuzzyContractType;

        public List<String> getFuzzyContractType(){return this.fuzzyContractType;}

        private List<String> rightFuzzyContractType;

        public List<String> getRightFuzzyContractType(){return this.rightFuzzyContractType;}
        private List<String> orderInitialDepartmentList;

        public List<String> getOrderInitialDepartmentList(){return this.orderInitialDepartmentList;}


        private List<String> fuzzyOrderInitialDepartment;

        public List<String> getFuzzyOrderInitialDepartment(){return this.fuzzyOrderInitialDepartment;}

        private List<String> rightFuzzyOrderInitialDepartment;

        public List<String> getRightFuzzyOrderInitialDepartment(){return this.rightFuzzyOrderInitialDepartment;}
        private List<String> orderInitialUserNameList;

        public List<String> getOrderInitialUserNameList(){return this.orderInitialUserNameList;}


        private List<String> fuzzyOrderInitialUserName;

        public List<String> getFuzzyOrderInitialUserName(){return this.fuzzyOrderInitialUserName;}

        private List<String> rightFuzzyOrderInitialUserName;

        public List<String> getRightFuzzyOrderInitialUserName(){return this.rightFuzzyOrderInitialUserName;}
        private List<String> recommendedSupplierNameList;

        public List<String> getRecommendedSupplierNameList(){return this.recommendedSupplierNameList;}


        private List<String> fuzzyRecommendedSupplierName;

        public List<String> getFuzzyRecommendedSupplierName(){return this.fuzzyRecommendedSupplierName;}

        private List<String> rightFuzzyRecommendedSupplierName;

        public List<String> getRightFuzzyRecommendedSupplierName(){return this.rightFuzzyRecommendedSupplierName;}
        private List<String> warehouseSymbolList;

        public List<String> getWarehouseSymbolList(){return this.warehouseSymbolList;}


        private List<String> fuzzyWarehouseSymbol;

        public List<String> getFuzzyWarehouseSymbol(){return this.fuzzyWarehouseSymbol;}

        private List<String> rightFuzzyWarehouseSymbol;

        public List<String> getRightFuzzyWarehouseSymbol(){return this.rightFuzzyWarehouseSymbol;}
        private List<String> costManagementList;

        public List<String> getCostManagementList(){return this.costManagementList;}


        private List<String> fuzzyCostManagement;

        public List<String> getFuzzyCostManagement(){return this.fuzzyCostManagement;}

        private List<String> rightFuzzyCostManagement;

        public List<String> getRightFuzzyCostManagement(){return this.rightFuzzyCostManagement;}
        private List<String> productionLineList;

        public List<String> getProductionLineList(){return this.productionLineList;}


        private List<String> fuzzyProductionLine;

        public List<String> getFuzzyProductionLine(){return this.fuzzyProductionLine;}

        private List<String> rightFuzzyProductionLine;

        public List<String> getRightFuzzyProductionLine(){return this.rightFuzzyProductionLine;}
        private List<String> operationPositionCodeList;

        public List<String> getOperationPositionCodeList(){return this.operationPositionCodeList;}


        private List<String> fuzzyOperationPositionCode;

        public List<String> getFuzzyOperationPositionCode(){return this.fuzzyOperationPositionCode;}

        private List<String> rightFuzzyOperationPositionCode;

        public List<String> getRightFuzzyOperationPositionCode(){return this.rightFuzzyOperationPositionCode;}
        private List<String> equipmentCompanyList;

        public List<String> getEquipmentCompanyList(){return this.equipmentCompanyList;}


        private List<String> fuzzyEquipmentCompany;

        public List<String> getFuzzyEquipmentCompany(){return this.fuzzyEquipmentCompany;}

        private List<String> rightFuzzyEquipmentCompany;

        public List<String> getRightFuzzyEquipmentCompany(){return this.rightFuzzyEquipmentCompany;}
        private List<String> sparePartsBrandList;

        public List<String> getSparePartsBrandList(){return this.sparePartsBrandList;}


        private List<String> fuzzySparePartsBrand;

        public List<String> getFuzzySparePartsBrand(){return this.fuzzySparePartsBrand;}

        private List<String> rightFuzzySparePartsBrand;

        public List<String> getRightFuzzySparePartsBrand(){return this.rightFuzzySparePartsBrand;}
        private List<String> sparePartsOrderDescList;

        public List<String> getSparePartsOrderDescList(){return this.sparePartsOrderDescList;}


        private List<String> fuzzySparePartsOrderDesc;

        public List<String> getFuzzySparePartsOrderDesc(){return this.fuzzySparePartsOrderDesc;}

        private List<String> rightFuzzySparePartsOrderDesc;

        public List<String> getRightFuzzySparePartsOrderDesc(){return this.rightFuzzySparePartsOrderDesc;}
        private List<String> sparePartsEmergencyList;

        public List<String> getSparePartsEmergencyList(){return this.sparePartsEmergencyList;}


        private List<String> fuzzySparePartsEmergency;

        public List<String> getFuzzySparePartsEmergency(){return this.fuzzySparePartsEmergency;}

        private List<String> rightFuzzySparePartsEmergency;

        public List<String> getRightFuzzySparePartsEmergency(){return this.rightFuzzySparePartsEmergency;}
        private List<String> extraOrderReasonList;

        public List<String> getExtraOrderReasonList(){return this.extraOrderReasonList;}


        private List<String> fuzzyExtraOrderReason;

        public List<String> getFuzzyExtraOrderReason(){return this.fuzzyExtraOrderReason;}

        private List<String> rightFuzzyExtraOrderReason;

        public List<String> getRightFuzzyExtraOrderReason(){return this.rightFuzzyExtraOrderReason;}
        private List<String> knifeCodeList;

        public List<String> getKnifeCodeList(){return this.knifeCodeList;}


        private List<String> fuzzyKnifeCode;

        public List<String> getFuzzyKnifeCode(){return this.fuzzyKnifeCode;}

        private List<String> rightFuzzyKnifeCode;

        public List<String> getRightFuzzyKnifeCode(){return this.rightFuzzyKnifeCode;}
        private List<String> importantProjectCodeList;

        public List<String> getImportantProjectCodeList(){return this.importantProjectCodeList;}


        private List<String> fuzzyImportantProjectCode;

        public List<String> getFuzzyImportantProjectCode(){return this.fuzzyImportantProjectCode;}

        private List<String> rightFuzzyImportantProjectCode;

        public List<String> getRightFuzzyImportantProjectCode(){return this.rightFuzzyImportantProjectCode;}
        private List<String> warehousingReasonCodeList;

        public List<String> getWarehousingReasonCodeList(){return this.warehousingReasonCodeList;}


        private List<String> fuzzyWarehousingReasonCode;

        public List<String> getFuzzyWarehousingReasonCode(){return this.fuzzyWarehousingReasonCode;}

        private List<String> rightFuzzyWarehousingReasonCode;

        public List<String> getRightFuzzyWarehousingReasonCode(){return this.rightFuzzyWarehousingReasonCode;}
        private List<String> orderListCodeList;

        public List<String> getOrderListCodeList(){return this.orderListCodeList;}


        private List<String> fuzzyOrderListCode;

        public List<String> getFuzzyOrderListCode(){return this.fuzzyOrderListCode;}

        private List<String> rightFuzzyOrderListCode;

        public List<String> getRightFuzzyOrderListCode(){return this.rightFuzzyOrderListCode;}
        private List<String> variablesList;

        public List<String> getVariablesList(){return this.variablesList;}


        private List<String> fuzzyVariables;

        public List<String> getFuzzyVariables(){return this.fuzzyVariables;}

        private List<String> rightFuzzyVariables;

        public List<String> getRightFuzzyVariables(){return this.rightFuzzyVariables;}
        private List<String> warehouseCodeList;

        public List<String> getWarehouseCodeList(){return this.warehouseCodeList;}


        private List<String> fuzzyWarehouseCode;

        public List<String> getFuzzyWarehouseCode(){return this.fuzzyWarehouseCode;}

        private List<String> rightFuzzyWarehouseCode;

        public List<String> getRightFuzzyWarehouseCode(){return this.rightFuzzyWarehouseCode;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder orderIdBetWeen(Long orderIdSt,Long orderIdEd){
            this.orderIdSt = orderIdSt;
            this.orderIdEd = orderIdEd;
            return this;
        }

        public QueryBuilder orderIdGreaterEqThan(Long orderIdSt){
            this.orderIdSt = orderIdSt;
            return this;
        }
        public QueryBuilder orderIdLessEqThan(Long orderIdEd){
            this.orderIdEd = orderIdEd;
            return this;
        }


        public QueryBuilder orderId(Long orderId){
            setOrderId(orderId);
            return this;
        }

        public QueryBuilder orderIdList(Long ... orderId){
            this.orderIdList = solveNullList(orderId);
            return this;
        }

        public QueryBuilder orderIdList(List<Long> orderId){
            this.orderIdList = orderId;
            return this;
        }

        public QueryBuilder fetchOrderId(){
            setFetchFields("fetchFields","orderId");
            return this;
        }

        public QueryBuilder excludeOrderId(){
            setFetchFields("excludeFields","orderId");
            return this;
        }

        public QueryBuilder fuzzyOrderOperaterUserName (List<String> fuzzyOrderOperaterUserName){
            this.fuzzyOrderOperaterUserName = fuzzyOrderOperaterUserName;
            return this;
        }

        public QueryBuilder fuzzyOrderOperaterUserName (String ... fuzzyOrderOperaterUserName){
            this.fuzzyOrderOperaterUserName = solveNullList(fuzzyOrderOperaterUserName);
            return this;
        }

        public QueryBuilder rightFuzzyOrderOperaterUserName (List<String> rightFuzzyOrderOperaterUserName){
            this.rightFuzzyOrderOperaterUserName = rightFuzzyOrderOperaterUserName;
            return this;
        }

        public QueryBuilder rightFuzzyOrderOperaterUserName (String ... rightFuzzyOrderOperaterUserName){
            this.rightFuzzyOrderOperaterUserName = solveNullList(rightFuzzyOrderOperaterUserName);
            return this;
        }

        public QueryBuilder orderOperaterUserName(String orderOperaterUserName){
            setOrderOperaterUserName(orderOperaterUserName);
            return this;
        }

        public QueryBuilder orderOperaterUserNameList(String ... orderOperaterUserName){
            this.orderOperaterUserNameList = solveNullList(orderOperaterUserName);
            return this;
        }

        public QueryBuilder orderOperaterUserNameList(List<String> orderOperaterUserName){
            this.orderOperaterUserNameList = orderOperaterUserName;
            return this;
        }

        public QueryBuilder fetchOrderOperaterUserName(){
            setFetchFields("fetchFields","orderOperaterUserName");
            return this;
        }

        public QueryBuilder excludeOrderOperaterUserName(){
            setFetchFields("excludeFields","orderOperaterUserName");
            return this;
        }

        public QueryBuilder fuzzyOrderOperaterTime (List<String> fuzzyOrderOperaterTime){
            this.fuzzyOrderOperaterTime = fuzzyOrderOperaterTime;
            return this;
        }

        public QueryBuilder fuzzyOrderOperaterTime (String ... fuzzyOrderOperaterTime){
            this.fuzzyOrderOperaterTime = solveNullList(fuzzyOrderOperaterTime);
            return this;
        }

        public QueryBuilder rightFuzzyOrderOperaterTime (List<String> rightFuzzyOrderOperaterTime){
            this.rightFuzzyOrderOperaterTime = rightFuzzyOrderOperaterTime;
            return this;
        }

        public QueryBuilder rightFuzzyOrderOperaterTime (String ... rightFuzzyOrderOperaterTime){
            this.rightFuzzyOrderOperaterTime = solveNullList(rightFuzzyOrderOperaterTime);
            return this;
        }

        public QueryBuilder orderOperaterTime(String orderOperaterTime){
            setOrderOperaterTime(orderOperaterTime);
            return this;
        }

        public QueryBuilder orderOperaterTimeList(String ... orderOperaterTime){
            this.orderOperaterTimeList = solveNullList(orderOperaterTime);
            return this;
        }

        public QueryBuilder orderOperaterTimeList(List<String> orderOperaterTime){
            this.orderOperaterTimeList = orderOperaterTime;
            return this;
        }

        public QueryBuilder fetchOrderOperaterTime(){
            setFetchFields("fetchFields","orderOperaterTime");
            return this;
        }

        public QueryBuilder excludeOrderOperaterTime(){
            setFetchFields("excludeFields","orderOperaterTime");
            return this;
        }

        public QueryBuilder fuzzyOrderType (List<String> fuzzyOrderType){
            this.fuzzyOrderType = fuzzyOrderType;
            return this;
        }

        public QueryBuilder fuzzyOrderType (String ... fuzzyOrderType){
            this.fuzzyOrderType = solveNullList(fuzzyOrderType);
            return this;
        }

        public QueryBuilder rightFuzzyOrderType (List<String> rightFuzzyOrderType){
            this.rightFuzzyOrderType = rightFuzzyOrderType;
            return this;
        }

        public QueryBuilder rightFuzzyOrderType (String ... rightFuzzyOrderType){
            this.rightFuzzyOrderType = solveNullList(rightFuzzyOrderType);
            return this;
        }

        public QueryBuilder orderType(String orderType){
            setOrderType(orderType);
            return this;
        }

        public QueryBuilder orderTypeList(String ... orderType){
            this.orderTypeList = solveNullList(orderType);
            return this;
        }

        public QueryBuilder orderTypeList(List<String> orderType){
            this.orderTypeList = orderType;
            return this;
        }

        public QueryBuilder fetchOrderType(){
            setFetchFields("fetchFields","orderType");
            return this;
        }

        public QueryBuilder excludeOrderType(){
            setFetchFields("excludeFields","orderType");
            return this;
        }

        public QueryBuilder fuzzyFinancialListCode (List<String> fuzzyFinancialListCode){
            this.fuzzyFinancialListCode = fuzzyFinancialListCode;
            return this;
        }

        public QueryBuilder fuzzyFinancialListCode (String ... fuzzyFinancialListCode){
            this.fuzzyFinancialListCode = solveNullList(fuzzyFinancialListCode);
            return this;
        }

        public QueryBuilder rightFuzzyFinancialListCode (List<String> rightFuzzyFinancialListCode){
            this.rightFuzzyFinancialListCode = rightFuzzyFinancialListCode;
            return this;
        }

        public QueryBuilder rightFuzzyFinancialListCode (String ... rightFuzzyFinancialListCode){
            this.rightFuzzyFinancialListCode = solveNullList(rightFuzzyFinancialListCode);
            return this;
        }

        public QueryBuilder financialListCode(String financialListCode){
            setFinancialListCode(financialListCode);
            return this;
        }

        public QueryBuilder financialListCodeList(String ... financialListCode){
            this.financialListCodeList = solveNullList(financialListCode);
            return this;
        }

        public QueryBuilder financialListCodeList(List<String> financialListCode){
            this.financialListCodeList = financialListCode;
            return this;
        }

        public QueryBuilder fetchFinancialListCode(){
            setFetchFields("fetchFields","financialListCode");
            return this;
        }

        public QueryBuilder excludeFinancialListCode(){
            setFetchFields("excludeFields","financialListCode");
            return this;
        }

        public QueryBuilder fuzzyPurchasingListCode (List<String> fuzzyPurchasingListCode){
            this.fuzzyPurchasingListCode = fuzzyPurchasingListCode;
            return this;
        }

        public QueryBuilder fuzzyPurchasingListCode (String ... fuzzyPurchasingListCode){
            this.fuzzyPurchasingListCode = solveNullList(fuzzyPurchasingListCode);
            return this;
        }

        public QueryBuilder rightFuzzyPurchasingListCode (List<String> rightFuzzyPurchasingListCode){
            this.rightFuzzyPurchasingListCode = rightFuzzyPurchasingListCode;
            return this;
        }

        public QueryBuilder rightFuzzyPurchasingListCode (String ... rightFuzzyPurchasingListCode){
            this.rightFuzzyPurchasingListCode = solveNullList(rightFuzzyPurchasingListCode);
            return this;
        }

        public QueryBuilder purchasingListCode(String purchasingListCode){
            setPurchasingListCode(purchasingListCode);
            return this;
        }

        public QueryBuilder purchasingListCodeList(String ... purchasingListCode){
            this.purchasingListCodeList = solveNullList(purchasingListCode);
            return this;
        }

        public QueryBuilder purchasingListCodeList(List<String> purchasingListCode){
            this.purchasingListCodeList = purchasingListCode;
            return this;
        }

        public QueryBuilder fetchPurchasingListCode(){
            setFetchFields("fetchFields","purchasingListCode");
            return this;
        }

        public QueryBuilder excludePurchasingListCode(){
            setFetchFields("excludeFields","purchasingListCode");
            return this;
        }

        public QueryBuilder fuzzyMaterialCode (List<String> fuzzyMaterialCode){
            this.fuzzyMaterialCode = fuzzyMaterialCode;
            return this;
        }

        public QueryBuilder fuzzyMaterialCode (String ... fuzzyMaterialCode){
            this.fuzzyMaterialCode = solveNullList(fuzzyMaterialCode);
            return this;
        }

        public QueryBuilder rightFuzzyMaterialCode (List<String> rightFuzzyMaterialCode){
            this.rightFuzzyMaterialCode = rightFuzzyMaterialCode;
            return this;
        }

        public QueryBuilder rightFuzzyMaterialCode (String ... rightFuzzyMaterialCode){
            this.rightFuzzyMaterialCode = solveNullList(rightFuzzyMaterialCode);
            return this;
        }

        public QueryBuilder materialCode(String materialCode){
            setMaterialCode(materialCode);
            return this;
        }

        public QueryBuilder materialCodeList(String ... materialCode){
            this.materialCodeList = solveNullList(materialCode);
            return this;
        }

        public QueryBuilder materialCodeList(List<String> materialCode){
            this.materialCodeList = materialCode;
            return this;
        }

        public QueryBuilder fetchMaterialCode(){
            setFetchFields("fetchFields","materialCode");
            return this;
        }

        public QueryBuilder excludeMaterialCode(){
            setFetchFields("excludeFields","materialCode");
            return this;
        }

        public QueryBuilder fuzzyMaterialName (List<String> fuzzyMaterialName){
            this.fuzzyMaterialName = fuzzyMaterialName;
            return this;
        }

        public QueryBuilder fuzzyMaterialName (String ... fuzzyMaterialName){
            this.fuzzyMaterialName = solveNullList(fuzzyMaterialName);
            return this;
        }

        public QueryBuilder rightFuzzyMaterialName (List<String> rightFuzzyMaterialName){
            this.rightFuzzyMaterialName = rightFuzzyMaterialName;
            return this;
        }

        public QueryBuilder rightFuzzyMaterialName (String ... rightFuzzyMaterialName){
            this.rightFuzzyMaterialName = solveNullList(rightFuzzyMaterialName);
            return this;
        }

        public QueryBuilder materialName(String materialName){
            setMaterialName(materialName);
            return this;
        }

        public QueryBuilder materialNameList(String ... materialName){
            this.materialNameList = solveNullList(materialName);
            return this;
        }

        public QueryBuilder materialNameList(List<String> materialName){
            this.materialNameList = materialName;
            return this;
        }

        public QueryBuilder fetchMaterialName(){
            setFetchFields("fetchFields","materialName");
            return this;
        }

        public QueryBuilder excludeMaterialName(){
            setFetchFields("excludeFields","materialName");
            return this;
        }

        public QueryBuilder fuzzyConfirmMaterialName (List<String> fuzzyConfirmMaterialName){
            this.fuzzyConfirmMaterialName = fuzzyConfirmMaterialName;
            return this;
        }

        public QueryBuilder fuzzyConfirmMaterialName (String ... fuzzyConfirmMaterialName){
            this.fuzzyConfirmMaterialName = solveNullList(fuzzyConfirmMaterialName);
            return this;
        }

        public QueryBuilder rightFuzzyConfirmMaterialName (List<String> rightFuzzyConfirmMaterialName){
            this.rightFuzzyConfirmMaterialName = rightFuzzyConfirmMaterialName;
            return this;
        }

        public QueryBuilder rightFuzzyConfirmMaterialName (String ... rightFuzzyConfirmMaterialName){
            this.rightFuzzyConfirmMaterialName = solveNullList(rightFuzzyConfirmMaterialName);
            return this;
        }

        public QueryBuilder confirmMaterialName(String confirmMaterialName){
            setConfirmMaterialName(confirmMaterialName);
            return this;
        }

        public QueryBuilder confirmMaterialNameList(String ... confirmMaterialName){
            this.confirmMaterialNameList = solveNullList(confirmMaterialName);
            return this;
        }

        public QueryBuilder confirmMaterialNameList(List<String> confirmMaterialName){
            this.confirmMaterialNameList = confirmMaterialName;
            return this;
        }

        public QueryBuilder fetchConfirmMaterialName(){
            setFetchFields("fetchFields","confirmMaterialName");
            return this;
        }

        public QueryBuilder excludeConfirmMaterialName(){
            setFetchFields("excludeFields","confirmMaterialName");
            return this;
        }

        public QueryBuilder fuzzyMaterialSpecs (List<String> fuzzyMaterialSpecs){
            this.fuzzyMaterialSpecs = fuzzyMaterialSpecs;
            return this;
        }

        public QueryBuilder fuzzyMaterialSpecs (String ... fuzzyMaterialSpecs){
            this.fuzzyMaterialSpecs = solveNullList(fuzzyMaterialSpecs);
            return this;
        }

        public QueryBuilder rightFuzzyMaterialSpecs (List<String> rightFuzzyMaterialSpecs){
            this.rightFuzzyMaterialSpecs = rightFuzzyMaterialSpecs;
            return this;
        }

        public QueryBuilder rightFuzzyMaterialSpecs (String ... rightFuzzyMaterialSpecs){
            this.rightFuzzyMaterialSpecs = solveNullList(rightFuzzyMaterialSpecs);
            return this;
        }

        public QueryBuilder materialSpecs(String materialSpecs){
            setMaterialSpecs(materialSpecs);
            return this;
        }

        public QueryBuilder materialSpecsList(String ... materialSpecs){
            this.materialSpecsList = solveNullList(materialSpecs);
            return this;
        }

        public QueryBuilder materialSpecsList(List<String> materialSpecs){
            this.materialSpecsList = materialSpecs;
            return this;
        }

        public QueryBuilder fetchMaterialSpecs(){
            setFetchFields("fetchFields","materialSpecs");
            return this;
        }

        public QueryBuilder excludeMaterialSpecs(){
            setFetchFields("excludeFields","materialSpecs");
            return this;
        }

        public QueryBuilder fuzzyConfirmMaterialSpecs (List<String> fuzzyConfirmMaterialSpecs){
            this.fuzzyConfirmMaterialSpecs = fuzzyConfirmMaterialSpecs;
            return this;
        }

        public QueryBuilder fuzzyConfirmMaterialSpecs (String ... fuzzyConfirmMaterialSpecs){
            this.fuzzyConfirmMaterialSpecs = solveNullList(fuzzyConfirmMaterialSpecs);
            return this;
        }

        public QueryBuilder rightFuzzyConfirmMaterialSpecs (List<String> rightFuzzyConfirmMaterialSpecs){
            this.rightFuzzyConfirmMaterialSpecs = rightFuzzyConfirmMaterialSpecs;
            return this;
        }

        public QueryBuilder rightFuzzyConfirmMaterialSpecs (String ... rightFuzzyConfirmMaterialSpecs){
            this.rightFuzzyConfirmMaterialSpecs = solveNullList(rightFuzzyConfirmMaterialSpecs);
            return this;
        }

        public QueryBuilder confirmMaterialSpecs(String confirmMaterialSpecs){
            setConfirmMaterialSpecs(confirmMaterialSpecs);
            return this;
        }

        public QueryBuilder confirmMaterialSpecsList(String ... confirmMaterialSpecs){
            this.confirmMaterialSpecsList = solveNullList(confirmMaterialSpecs);
            return this;
        }

        public QueryBuilder confirmMaterialSpecsList(List<String> confirmMaterialSpecs){
            this.confirmMaterialSpecsList = confirmMaterialSpecs;
            return this;
        }

        public QueryBuilder fetchConfirmMaterialSpecs(){
            setFetchFields("fetchFields","confirmMaterialSpecs");
            return this;
        }

        public QueryBuilder excludeConfirmMaterialSpecs(){
            setFetchFields("excludeFields","confirmMaterialSpecs");
            return this;
        }

        public QueryBuilder fuzzyMaterialBrand (List<String> fuzzyMaterialBrand){
            this.fuzzyMaterialBrand = fuzzyMaterialBrand;
            return this;
        }

        public QueryBuilder fuzzyMaterialBrand (String ... fuzzyMaterialBrand){
            this.fuzzyMaterialBrand = solveNullList(fuzzyMaterialBrand);
            return this;
        }

        public QueryBuilder rightFuzzyMaterialBrand (List<String> rightFuzzyMaterialBrand){
            this.rightFuzzyMaterialBrand = rightFuzzyMaterialBrand;
            return this;
        }

        public QueryBuilder rightFuzzyMaterialBrand (String ... rightFuzzyMaterialBrand){
            this.rightFuzzyMaterialBrand = solveNullList(rightFuzzyMaterialBrand);
            return this;
        }

        public QueryBuilder materialBrand(String materialBrand){
            setMaterialBrand(materialBrand);
            return this;
        }

        public QueryBuilder materialBrandList(String ... materialBrand){
            this.materialBrandList = solveNullList(materialBrand);
            return this;
        }

        public QueryBuilder materialBrandList(List<String> materialBrand){
            this.materialBrandList = materialBrand;
            return this;
        }

        public QueryBuilder fetchMaterialBrand(){
            setFetchFields("fetchFields","materialBrand");
            return this;
        }

        public QueryBuilder excludeMaterialBrand(){
            setFetchFields("excludeFields","materialBrand");
            return this;
        }

        public QueryBuilder fuzzyConfirmMaterialBrand (List<String> fuzzyConfirmMaterialBrand){
            this.fuzzyConfirmMaterialBrand = fuzzyConfirmMaterialBrand;
            return this;
        }

        public QueryBuilder fuzzyConfirmMaterialBrand (String ... fuzzyConfirmMaterialBrand){
            this.fuzzyConfirmMaterialBrand = solveNullList(fuzzyConfirmMaterialBrand);
            return this;
        }

        public QueryBuilder rightFuzzyConfirmMaterialBrand (List<String> rightFuzzyConfirmMaterialBrand){
            this.rightFuzzyConfirmMaterialBrand = rightFuzzyConfirmMaterialBrand;
            return this;
        }

        public QueryBuilder rightFuzzyConfirmMaterialBrand (String ... rightFuzzyConfirmMaterialBrand){
            this.rightFuzzyConfirmMaterialBrand = solveNullList(rightFuzzyConfirmMaterialBrand);
            return this;
        }

        public QueryBuilder confirmMaterialBrand(String confirmMaterialBrand){
            setConfirmMaterialBrand(confirmMaterialBrand);
            return this;
        }

        public QueryBuilder confirmMaterialBrandList(String ... confirmMaterialBrand){
            this.confirmMaterialBrandList = solveNullList(confirmMaterialBrand);
            return this;
        }

        public QueryBuilder confirmMaterialBrandList(List<String> confirmMaterialBrand){
            this.confirmMaterialBrandList = confirmMaterialBrand;
            return this;
        }

        public QueryBuilder fetchConfirmMaterialBrand(){
            setFetchFields("fetchFields","confirmMaterialBrand");
            return this;
        }

        public QueryBuilder excludeConfirmMaterialBrand(){
            setFetchFields("excludeFields","confirmMaterialBrand");
            return this;
        }

        public QueryBuilder fuzzyMaterialUnit (List<String> fuzzyMaterialUnit){
            this.fuzzyMaterialUnit = fuzzyMaterialUnit;
            return this;
        }

        public QueryBuilder fuzzyMaterialUnit (String ... fuzzyMaterialUnit){
            this.fuzzyMaterialUnit = solveNullList(fuzzyMaterialUnit);
            return this;
        }

        public QueryBuilder rightFuzzyMaterialUnit (List<String> rightFuzzyMaterialUnit){
            this.rightFuzzyMaterialUnit = rightFuzzyMaterialUnit;
            return this;
        }

        public QueryBuilder rightFuzzyMaterialUnit (String ... rightFuzzyMaterialUnit){
            this.rightFuzzyMaterialUnit = solveNullList(rightFuzzyMaterialUnit);
            return this;
        }

        public QueryBuilder materialUnit(String materialUnit){
            setMaterialUnit(materialUnit);
            return this;
        }

        public QueryBuilder materialUnitList(String ... materialUnit){
            this.materialUnitList = solveNullList(materialUnit);
            return this;
        }

        public QueryBuilder materialUnitList(List<String> materialUnit){
            this.materialUnitList = materialUnit;
            return this;
        }

        public QueryBuilder fetchMaterialUnit(){
            setFetchFields("fetchFields","materialUnit");
            return this;
        }

        public QueryBuilder excludeMaterialUnit(){
            setFetchFields("excludeFields","materialUnit");
            return this;
        }

        public QueryBuilder orderMaterialNumBetWeen(Integer orderMaterialNumSt,Integer orderMaterialNumEd){
            this.orderMaterialNumSt = orderMaterialNumSt;
            this.orderMaterialNumEd = orderMaterialNumEd;
            return this;
        }

        public QueryBuilder orderMaterialNumGreaterEqThan(Integer orderMaterialNumSt){
            this.orderMaterialNumSt = orderMaterialNumSt;
            return this;
        }
        public QueryBuilder orderMaterialNumLessEqThan(Integer orderMaterialNumEd){
            this.orderMaterialNumEd = orderMaterialNumEd;
            return this;
        }


        public QueryBuilder orderMaterialNum(Integer orderMaterialNum){
            setOrderMaterialNum(orderMaterialNum);
            return this;
        }

        public QueryBuilder orderMaterialNumList(Integer ... orderMaterialNum){
            this.orderMaterialNumList = solveNullList(orderMaterialNum);
            return this;
        }

        public QueryBuilder orderMaterialNumList(List<Integer> orderMaterialNum){
            this.orderMaterialNumList = orderMaterialNum;
            return this;
        }

        public QueryBuilder fetchOrderMaterialNum(){
            setFetchFields("fetchFields","orderMaterialNum");
            return this;
        }

        public QueryBuilder excludeOrderMaterialNum(){
            setFetchFields("excludeFields","orderMaterialNum");
            return this;
        }

        public QueryBuilder fuzzyFinancialCenterCode (List<String> fuzzyFinancialCenterCode){
            this.fuzzyFinancialCenterCode = fuzzyFinancialCenterCode;
            return this;
        }

        public QueryBuilder fuzzyFinancialCenterCode (String ... fuzzyFinancialCenterCode){
            this.fuzzyFinancialCenterCode = solveNullList(fuzzyFinancialCenterCode);
            return this;
        }

        public QueryBuilder rightFuzzyFinancialCenterCode (List<String> rightFuzzyFinancialCenterCode){
            this.rightFuzzyFinancialCenterCode = rightFuzzyFinancialCenterCode;
            return this;
        }

        public QueryBuilder rightFuzzyFinancialCenterCode (String ... rightFuzzyFinancialCenterCode){
            this.rightFuzzyFinancialCenterCode = solveNullList(rightFuzzyFinancialCenterCode);
            return this;
        }

        public QueryBuilder financialCenterCode(String financialCenterCode){
            setFinancialCenterCode(financialCenterCode);
            return this;
        }

        public QueryBuilder financialCenterCodeList(String ... financialCenterCode){
            this.financialCenterCodeList = solveNullList(financialCenterCode);
            return this;
        }

        public QueryBuilder financialCenterCodeList(List<String> financialCenterCode){
            this.financialCenterCodeList = financialCenterCode;
            return this;
        }

        public QueryBuilder fetchFinancialCenterCode(){
            setFetchFields("fetchFields","financialCenterCode");
            return this;
        }

        public QueryBuilder excludeFinancialCenterCode(){
            setFetchFields("excludeFields","financialCenterCode");
            return this;
        }

        public QueryBuilder fuzzyOrderBuyer (List<String> fuzzyOrderBuyer){
            this.fuzzyOrderBuyer = fuzzyOrderBuyer;
            return this;
        }

        public QueryBuilder fuzzyOrderBuyer (String ... fuzzyOrderBuyer){
            this.fuzzyOrderBuyer = solveNullList(fuzzyOrderBuyer);
            return this;
        }

        public QueryBuilder rightFuzzyOrderBuyer (List<String> rightFuzzyOrderBuyer){
            this.rightFuzzyOrderBuyer = rightFuzzyOrderBuyer;
            return this;
        }

        public QueryBuilder rightFuzzyOrderBuyer (String ... rightFuzzyOrderBuyer){
            this.rightFuzzyOrderBuyer = solveNullList(rightFuzzyOrderBuyer);
            return this;
        }

        public QueryBuilder orderBuyer(String orderBuyer){
            setOrderBuyer(orderBuyer);
            return this;
        }

        public QueryBuilder orderBuyerList(String ... orderBuyer){
            this.orderBuyerList = solveNullList(orderBuyer);
            return this;
        }

        public QueryBuilder orderBuyerList(List<String> orderBuyer){
            this.orderBuyerList = orderBuyer;
            return this;
        }

        public QueryBuilder fetchOrderBuyer(){
            setFetchFields("fetchFields","orderBuyer");
            return this;
        }

        public QueryBuilder excludeOrderBuyer(){
            setFetchFields("excludeFields","orderBuyer");
            return this;
        }

        public QueryBuilder fuzzySupplierName (List<String> fuzzySupplierName){
            this.fuzzySupplierName = fuzzySupplierName;
            return this;
        }

        public QueryBuilder fuzzySupplierName (String ... fuzzySupplierName){
            this.fuzzySupplierName = solveNullList(fuzzySupplierName);
            return this;
        }

        public QueryBuilder rightFuzzySupplierName (List<String> rightFuzzySupplierName){
            this.rightFuzzySupplierName = rightFuzzySupplierName;
            return this;
        }

        public QueryBuilder rightFuzzySupplierName (String ... rightFuzzySupplierName){
            this.rightFuzzySupplierName = solveNullList(rightFuzzySupplierName);
            return this;
        }

        public QueryBuilder supplierName(String supplierName){
            setSupplierName(supplierName);
            return this;
        }

        public QueryBuilder supplierNameList(String ... supplierName){
            this.supplierNameList = solveNullList(supplierName);
            return this;
        }

        public QueryBuilder supplierNameList(List<String> supplierName){
            this.supplierNameList = supplierName;
            return this;
        }

        public QueryBuilder fetchSupplierName(){
            setFetchFields("fetchFields","supplierName");
            return this;
        }

        public QueryBuilder excludeSupplierName(){
            setFetchFields("excludeFields","supplierName");
            return this;
        }

        public QueryBuilder fuzzyOrderState (List<String> fuzzyOrderState){
            this.fuzzyOrderState = fuzzyOrderState;
            return this;
        }

        public QueryBuilder fuzzyOrderState (String ... fuzzyOrderState){
            this.fuzzyOrderState = solveNullList(fuzzyOrderState);
            return this;
        }

        public QueryBuilder rightFuzzyOrderState (List<String> rightFuzzyOrderState){
            this.rightFuzzyOrderState = rightFuzzyOrderState;
            return this;
        }

        public QueryBuilder rightFuzzyOrderState (String ... rightFuzzyOrderState){
            this.rightFuzzyOrderState = solveNullList(rightFuzzyOrderState);
            return this;
        }

        public QueryBuilder orderState(String orderState){
            setOrderState(orderState);
            return this;
        }

        public QueryBuilder orderStateList(String ... orderState){
            this.orderStateList = solveNullList(orderState);
            return this;
        }

        public QueryBuilder orderStateList(List<String> orderState){
            this.orderStateList = orderState;
            return this;
        }

        public QueryBuilder fetchOrderState(){
            setFetchFields("fetchFields","orderState");
            return this;
        }

        public QueryBuilder excludeOrderState(){
            setFetchFields("excludeFields","orderState");
            return this;
        }

        public QueryBuilder fuzzyOrderBuyerCheckDate (List<String> fuzzyOrderBuyerCheckDate){
            this.fuzzyOrderBuyerCheckDate = fuzzyOrderBuyerCheckDate;
            return this;
        }

        public QueryBuilder fuzzyOrderBuyerCheckDate (String ... fuzzyOrderBuyerCheckDate){
            this.fuzzyOrderBuyerCheckDate = solveNullList(fuzzyOrderBuyerCheckDate);
            return this;
        }

        public QueryBuilder rightFuzzyOrderBuyerCheckDate (List<String> rightFuzzyOrderBuyerCheckDate){
            this.rightFuzzyOrderBuyerCheckDate = rightFuzzyOrderBuyerCheckDate;
            return this;
        }

        public QueryBuilder rightFuzzyOrderBuyerCheckDate (String ... rightFuzzyOrderBuyerCheckDate){
            this.rightFuzzyOrderBuyerCheckDate = solveNullList(rightFuzzyOrderBuyerCheckDate);
            return this;
        }

        public QueryBuilder orderBuyerCheckDate(String orderBuyerCheckDate){
            setOrderBuyerCheckDate(orderBuyerCheckDate);
            return this;
        }

        public QueryBuilder orderBuyerCheckDateList(String ... orderBuyerCheckDate){
            this.orderBuyerCheckDateList = solveNullList(orderBuyerCheckDate);
            return this;
        }

        public QueryBuilder orderBuyerCheckDateList(List<String> orderBuyerCheckDate){
            this.orderBuyerCheckDateList = orderBuyerCheckDate;
            return this;
        }

        public QueryBuilder fetchOrderBuyerCheckDate(){
            setFetchFields("fetchFields","orderBuyerCheckDate");
            return this;
        }

        public QueryBuilder excludeOrderBuyerCheckDate(){
            setFetchFields("excludeFields","orderBuyerCheckDate");
            return this;
        }

        public QueryBuilder fuzzyOrderPriceCheckDate (List<String> fuzzyOrderPriceCheckDate){
            this.fuzzyOrderPriceCheckDate = fuzzyOrderPriceCheckDate;
            return this;
        }

        public QueryBuilder fuzzyOrderPriceCheckDate (String ... fuzzyOrderPriceCheckDate){
            this.fuzzyOrderPriceCheckDate = solveNullList(fuzzyOrderPriceCheckDate);
            return this;
        }

        public QueryBuilder rightFuzzyOrderPriceCheckDate (List<String> rightFuzzyOrderPriceCheckDate){
            this.rightFuzzyOrderPriceCheckDate = rightFuzzyOrderPriceCheckDate;
            return this;
        }

        public QueryBuilder rightFuzzyOrderPriceCheckDate (String ... rightFuzzyOrderPriceCheckDate){
            this.rightFuzzyOrderPriceCheckDate = solveNullList(rightFuzzyOrderPriceCheckDate);
            return this;
        }

        public QueryBuilder orderPriceCheckDate(String orderPriceCheckDate){
            setOrderPriceCheckDate(orderPriceCheckDate);
            return this;
        }

        public QueryBuilder orderPriceCheckDateList(String ... orderPriceCheckDate){
            this.orderPriceCheckDateList = solveNullList(orderPriceCheckDate);
            return this;
        }

        public QueryBuilder orderPriceCheckDateList(List<String> orderPriceCheckDate){
            this.orderPriceCheckDateList = orderPriceCheckDate;
            return this;
        }

        public QueryBuilder fetchOrderPriceCheckDate(){
            setFetchFields("fetchFields","orderPriceCheckDate");
            return this;
        }

        public QueryBuilder excludeOrderPriceCheckDate(){
            setFetchFields("excludeFields","orderPriceCheckDate");
            return this;
        }

        public QueryBuilder fuzzyPurchasingOrderCode (List<String> fuzzyPurchasingOrderCode){
            this.fuzzyPurchasingOrderCode = fuzzyPurchasingOrderCode;
            return this;
        }

        public QueryBuilder fuzzyPurchasingOrderCode (String ... fuzzyPurchasingOrderCode){
            this.fuzzyPurchasingOrderCode = solveNullList(fuzzyPurchasingOrderCode);
            return this;
        }

        public QueryBuilder rightFuzzyPurchasingOrderCode (List<String> rightFuzzyPurchasingOrderCode){
            this.rightFuzzyPurchasingOrderCode = rightFuzzyPurchasingOrderCode;
            return this;
        }

        public QueryBuilder rightFuzzyPurchasingOrderCode (String ... rightFuzzyPurchasingOrderCode){
            this.rightFuzzyPurchasingOrderCode = solveNullList(rightFuzzyPurchasingOrderCode);
            return this;
        }

        public QueryBuilder purchasingOrderCode(String purchasingOrderCode){
            setPurchasingOrderCode(purchasingOrderCode);
            return this;
        }

        public QueryBuilder purchasingOrderCodeList(String ... purchasingOrderCode){
            this.purchasingOrderCodeList = solveNullList(purchasingOrderCode);
            return this;
        }

        public QueryBuilder purchasingOrderCodeList(List<String> purchasingOrderCode){
            this.purchasingOrderCodeList = purchasingOrderCode;
            return this;
        }

        public QueryBuilder fetchPurchasingOrderCode(){
            setFetchFields("fetchFields","purchasingOrderCode");
            return this;
        }

        public QueryBuilder excludePurchasingOrderCode(){
            setFetchFields("excludeFields","purchasingOrderCode");
            return this;
        }

        public QueryBuilder fuzzyArrivalDate (List<String> fuzzyArrivalDate){
            this.fuzzyArrivalDate = fuzzyArrivalDate;
            return this;
        }

        public QueryBuilder fuzzyArrivalDate (String ... fuzzyArrivalDate){
            this.fuzzyArrivalDate = solveNullList(fuzzyArrivalDate);
            return this;
        }

        public QueryBuilder rightFuzzyArrivalDate (List<String> rightFuzzyArrivalDate){
            this.rightFuzzyArrivalDate = rightFuzzyArrivalDate;
            return this;
        }

        public QueryBuilder rightFuzzyArrivalDate (String ... rightFuzzyArrivalDate){
            this.rightFuzzyArrivalDate = solveNullList(rightFuzzyArrivalDate);
            return this;
        }

        public QueryBuilder arrivalDate(String arrivalDate){
            setArrivalDate(arrivalDate);
            return this;
        }

        public QueryBuilder arrivalDateList(String ... arrivalDate){
            this.arrivalDateList = solveNullList(arrivalDate);
            return this;
        }

        public QueryBuilder arrivalDateList(List<String> arrivalDate){
            this.arrivalDateList = arrivalDate;
            return this;
        }

        public QueryBuilder fetchArrivalDate(){
            setFetchFields("fetchFields","arrivalDate");
            return this;
        }

        public QueryBuilder excludeArrivalDate(){
            setFetchFields("excludeFields","arrivalDate");
            return this;
        }

        public QueryBuilder receivedNumBetWeen(Integer receivedNumSt,Integer receivedNumEd){
            this.receivedNumSt = receivedNumSt;
            this.receivedNumEd = receivedNumEd;
            return this;
        }

        public QueryBuilder receivedNumGreaterEqThan(Integer receivedNumSt){
            this.receivedNumSt = receivedNumSt;
            return this;
        }
        public QueryBuilder receivedNumLessEqThan(Integer receivedNumEd){
            this.receivedNumEd = receivedNumEd;
            return this;
        }


        public QueryBuilder receivedNum(Integer receivedNum){
            setReceivedNum(receivedNum);
            return this;
        }

        public QueryBuilder receivedNumList(Integer ... receivedNum){
            this.receivedNumList = solveNullList(receivedNum);
            return this;
        }

        public QueryBuilder receivedNumList(List<Integer> receivedNum){
            this.receivedNumList = receivedNum;
            return this;
        }

        public QueryBuilder fetchReceivedNum(){
            setFetchFields("fetchFields","receivedNum");
            return this;
        }

        public QueryBuilder excludeReceivedNum(){
            setFetchFields("excludeFields","receivedNum");
            return this;
        }

        public QueryBuilder fuzzyReceivedDate (List<String> fuzzyReceivedDate){
            this.fuzzyReceivedDate = fuzzyReceivedDate;
            return this;
        }

        public QueryBuilder fuzzyReceivedDate (String ... fuzzyReceivedDate){
            this.fuzzyReceivedDate = solveNullList(fuzzyReceivedDate);
            return this;
        }

        public QueryBuilder rightFuzzyReceivedDate (List<String> rightFuzzyReceivedDate){
            this.rightFuzzyReceivedDate = rightFuzzyReceivedDate;
            return this;
        }

        public QueryBuilder rightFuzzyReceivedDate (String ... rightFuzzyReceivedDate){
            this.rightFuzzyReceivedDate = solveNullList(rightFuzzyReceivedDate);
            return this;
        }

        public QueryBuilder receivedDate(String receivedDate){
            setReceivedDate(receivedDate);
            return this;
        }

        public QueryBuilder receivedDateList(String ... receivedDate){
            this.receivedDateList = solveNullList(receivedDate);
            return this;
        }

        public QueryBuilder receivedDateList(List<String> receivedDate){
            this.receivedDateList = receivedDate;
            return this;
        }

        public QueryBuilder fetchReceivedDate(){
            setFetchFields("fetchFields","receivedDate");
            return this;
        }

        public QueryBuilder excludeReceivedDate(){
            setFetchFields("excludeFields","receivedDate");
            return this;
        }

        public QueryBuilder fuzzyPaymentType (List<String> fuzzyPaymentType){
            this.fuzzyPaymentType = fuzzyPaymentType;
            return this;
        }

        public QueryBuilder fuzzyPaymentType (String ... fuzzyPaymentType){
            this.fuzzyPaymentType = solveNullList(fuzzyPaymentType);
            return this;
        }

        public QueryBuilder rightFuzzyPaymentType (List<String> rightFuzzyPaymentType){
            this.rightFuzzyPaymentType = rightFuzzyPaymentType;
            return this;
        }

        public QueryBuilder rightFuzzyPaymentType (String ... rightFuzzyPaymentType){
            this.rightFuzzyPaymentType = solveNullList(rightFuzzyPaymentType);
            return this;
        }

        public QueryBuilder paymentType(String paymentType){
            setPaymentType(paymentType);
            return this;
        }

        public QueryBuilder paymentTypeList(String ... paymentType){
            this.paymentTypeList = solveNullList(paymentType);
            return this;
        }

        public QueryBuilder paymentTypeList(List<String> paymentType){
            this.paymentTypeList = paymentType;
            return this;
        }

        public QueryBuilder fetchPaymentType(){
            setFetchFields("fetchFields","paymentType");
            return this;
        }

        public QueryBuilder excludePaymentType(){
            setFetchFields("excludeFields","paymentType");
            return this;
        }

        public QueryBuilder fuzzyPaymentRate (List<String> fuzzyPaymentRate){
            this.fuzzyPaymentRate = fuzzyPaymentRate;
            return this;
        }

        public QueryBuilder fuzzyPaymentRate (String ... fuzzyPaymentRate){
            this.fuzzyPaymentRate = solveNullList(fuzzyPaymentRate);
            return this;
        }

        public QueryBuilder rightFuzzyPaymentRate (List<String> rightFuzzyPaymentRate){
            this.rightFuzzyPaymentRate = rightFuzzyPaymentRate;
            return this;
        }

        public QueryBuilder rightFuzzyPaymentRate (String ... rightFuzzyPaymentRate){
            this.rightFuzzyPaymentRate = solveNullList(rightFuzzyPaymentRate);
            return this;
        }

        public QueryBuilder paymentRate(String paymentRate){
            setPaymentRate(paymentRate);
            return this;
        }

        public QueryBuilder paymentRateList(String ... paymentRate){
            this.paymentRateList = solveNullList(paymentRate);
            return this;
        }

        public QueryBuilder paymentRateList(List<String> paymentRate){
            this.paymentRateList = paymentRate;
            return this;
        }

        public QueryBuilder fetchPaymentRate(){
            setFetchFields("fetchFields","paymentRate");
            return this;
        }

        public QueryBuilder excludePaymentRate(){
            setFetchFields("excludeFields","paymentRate");
            return this;
        }

        public QueryBuilder fuzzyBudgetType (List<String> fuzzyBudgetType){
            this.fuzzyBudgetType = fuzzyBudgetType;
            return this;
        }

        public QueryBuilder fuzzyBudgetType (String ... fuzzyBudgetType){
            this.fuzzyBudgetType = solveNullList(fuzzyBudgetType);
            return this;
        }

        public QueryBuilder rightFuzzyBudgetType (List<String> rightFuzzyBudgetType){
            this.rightFuzzyBudgetType = rightFuzzyBudgetType;
            return this;
        }

        public QueryBuilder rightFuzzyBudgetType (String ... rightFuzzyBudgetType){
            this.rightFuzzyBudgetType = solveNullList(rightFuzzyBudgetType);
            return this;
        }

        public QueryBuilder budgetType(String budgetType){
            setBudgetType(budgetType);
            return this;
        }

        public QueryBuilder budgetTypeList(String ... budgetType){
            this.budgetTypeList = solveNullList(budgetType);
            return this;
        }

        public QueryBuilder budgetTypeList(List<String> budgetType){
            this.budgetTypeList = budgetType;
            return this;
        }

        public QueryBuilder fetchBudgetType(){
            setFetchFields("fetchFields","budgetType");
            return this;
        }

        public QueryBuilder excludeBudgetType(){
            setFetchFields("excludeFields","budgetType");
            return this;
        }

        public QueryBuilder fuzzyBudgetSubject (List<String> fuzzyBudgetSubject){
            this.fuzzyBudgetSubject = fuzzyBudgetSubject;
            return this;
        }

        public QueryBuilder fuzzyBudgetSubject (String ... fuzzyBudgetSubject){
            this.fuzzyBudgetSubject = solveNullList(fuzzyBudgetSubject);
            return this;
        }

        public QueryBuilder rightFuzzyBudgetSubject (List<String> rightFuzzyBudgetSubject){
            this.rightFuzzyBudgetSubject = rightFuzzyBudgetSubject;
            return this;
        }

        public QueryBuilder rightFuzzyBudgetSubject (String ... rightFuzzyBudgetSubject){
            this.rightFuzzyBudgetSubject = solveNullList(rightFuzzyBudgetSubject);
            return this;
        }

        public QueryBuilder budgetSubject(String budgetSubject){
            setBudgetSubject(budgetSubject);
            return this;
        }

        public QueryBuilder budgetSubjectList(String ... budgetSubject){
            this.budgetSubjectList = solveNullList(budgetSubject);
            return this;
        }

        public QueryBuilder budgetSubjectList(List<String> budgetSubject){
            this.budgetSubjectList = budgetSubject;
            return this;
        }

        public QueryBuilder fetchBudgetSubject(){
            setFetchFields("fetchFields","budgetSubject");
            return this;
        }

        public QueryBuilder excludeBudgetSubject(){
            setFetchFields("excludeFields","budgetSubject");
            return this;
        }

        public QueryBuilder fuzzyInvestManagementCode (List<String> fuzzyInvestManagementCode){
            this.fuzzyInvestManagementCode = fuzzyInvestManagementCode;
            return this;
        }

        public QueryBuilder fuzzyInvestManagementCode (String ... fuzzyInvestManagementCode){
            this.fuzzyInvestManagementCode = solveNullList(fuzzyInvestManagementCode);
            return this;
        }

        public QueryBuilder rightFuzzyInvestManagementCode (List<String> rightFuzzyInvestManagementCode){
            this.rightFuzzyInvestManagementCode = rightFuzzyInvestManagementCode;
            return this;
        }

        public QueryBuilder rightFuzzyInvestManagementCode (String ... rightFuzzyInvestManagementCode){
            this.rightFuzzyInvestManagementCode = solveNullList(rightFuzzyInvestManagementCode);
            return this;
        }

        public QueryBuilder investManagementCode(String investManagementCode){
            setInvestManagementCode(investManagementCode);
            return this;
        }

        public QueryBuilder investManagementCodeList(String ... investManagementCode){
            this.investManagementCodeList = solveNullList(investManagementCode);
            return this;
        }

        public QueryBuilder investManagementCodeList(List<String> investManagementCode){
            this.investManagementCodeList = investManagementCode;
            return this;
        }

        public QueryBuilder fetchInvestManagementCode(){
            setFetchFields("fetchFields","investManagementCode");
            return this;
        }

        public QueryBuilder excludeInvestManagementCode(){
            setFetchFields("excludeFields","investManagementCode");
            return this;
        }

        public QueryBuilder fuzzyResearchTestProject (List<String> fuzzyResearchTestProject){
            this.fuzzyResearchTestProject = fuzzyResearchTestProject;
            return this;
        }

        public QueryBuilder fuzzyResearchTestProject (String ... fuzzyResearchTestProject){
            this.fuzzyResearchTestProject = solveNullList(fuzzyResearchTestProject);
            return this;
        }

        public QueryBuilder rightFuzzyResearchTestProject (List<String> rightFuzzyResearchTestProject){
            this.rightFuzzyResearchTestProject = rightFuzzyResearchTestProject;
            return this;
        }

        public QueryBuilder rightFuzzyResearchTestProject (String ... rightFuzzyResearchTestProject){
            this.rightFuzzyResearchTestProject = solveNullList(rightFuzzyResearchTestProject);
            return this;
        }

        public QueryBuilder researchTestProject(String researchTestProject){
            setResearchTestProject(researchTestProject);
            return this;
        }

        public QueryBuilder researchTestProjectList(String ... researchTestProject){
            this.researchTestProjectList = solveNullList(researchTestProject);
            return this;
        }

        public QueryBuilder researchTestProjectList(List<String> researchTestProject){
            this.researchTestProjectList = researchTestProject;
            return this;
        }

        public QueryBuilder fetchResearchTestProject(){
            setFetchFields("fetchFields","researchTestProject");
            return this;
        }

        public QueryBuilder excludeResearchTestProject(){
            setFetchFields("excludeFields","researchTestProject");
            return this;
        }

        public QueryBuilder fuzzyOrderBuilderName (List<String> fuzzyOrderBuilderName){
            this.fuzzyOrderBuilderName = fuzzyOrderBuilderName;
            return this;
        }

        public QueryBuilder fuzzyOrderBuilderName (String ... fuzzyOrderBuilderName){
            this.fuzzyOrderBuilderName = solveNullList(fuzzyOrderBuilderName);
            return this;
        }

        public QueryBuilder rightFuzzyOrderBuilderName (List<String> rightFuzzyOrderBuilderName){
            this.rightFuzzyOrderBuilderName = rightFuzzyOrderBuilderName;
            return this;
        }

        public QueryBuilder rightFuzzyOrderBuilderName (String ... rightFuzzyOrderBuilderName){
            this.rightFuzzyOrderBuilderName = solveNullList(rightFuzzyOrderBuilderName);
            return this;
        }

        public QueryBuilder orderBuilderName(String orderBuilderName){
            setOrderBuilderName(orderBuilderName);
            return this;
        }

        public QueryBuilder orderBuilderNameList(String ... orderBuilderName){
            this.orderBuilderNameList = solveNullList(orderBuilderName);
            return this;
        }

        public QueryBuilder orderBuilderNameList(List<String> orderBuilderName){
            this.orderBuilderNameList = orderBuilderName;
            return this;
        }

        public QueryBuilder fetchOrderBuilderName(){
            setFetchFields("fetchFields","orderBuilderName");
            return this;
        }

        public QueryBuilder excludeOrderBuilderName(){
            setFetchFields("excludeFields","orderBuilderName");
            return this;
        }

        public QueryBuilder fuzzyOrderDescription (List<String> fuzzyOrderDescription){
            this.fuzzyOrderDescription = fuzzyOrderDescription;
            return this;
        }

        public QueryBuilder fuzzyOrderDescription (String ... fuzzyOrderDescription){
            this.fuzzyOrderDescription = solveNullList(fuzzyOrderDescription);
            return this;
        }

        public QueryBuilder rightFuzzyOrderDescription (List<String> rightFuzzyOrderDescription){
            this.rightFuzzyOrderDescription = rightFuzzyOrderDescription;
            return this;
        }

        public QueryBuilder rightFuzzyOrderDescription (String ... rightFuzzyOrderDescription){
            this.rightFuzzyOrderDescription = solveNullList(rightFuzzyOrderDescription);
            return this;
        }

        public QueryBuilder orderDescription(String orderDescription){
            setOrderDescription(orderDescription);
            return this;
        }

        public QueryBuilder orderDescriptionList(String ... orderDescription){
            this.orderDescriptionList = solveNullList(orderDescription);
            return this;
        }

        public QueryBuilder orderDescriptionList(List<String> orderDescription){
            this.orderDescriptionList = orderDescription;
            return this;
        }

        public QueryBuilder fetchOrderDescription(){
            setFetchFields("fetchFields","orderDescription");
            return this;
        }

        public QueryBuilder excludeOrderDescription(){
            setFetchFields("excludeFields","orderDescription");
            return this;
        }

        public QueryBuilder orderInitialUserIdBetWeen(Integer orderInitialUserIdSt,Integer orderInitialUserIdEd){
            this.orderInitialUserIdSt = orderInitialUserIdSt;
            this.orderInitialUserIdEd = orderInitialUserIdEd;
            return this;
        }

        public QueryBuilder orderInitialUserIdGreaterEqThan(Integer orderInitialUserIdSt){
            this.orderInitialUserIdSt = orderInitialUserIdSt;
            return this;
        }
        public QueryBuilder orderInitialUserIdLessEqThan(Integer orderInitialUserIdEd){
            this.orderInitialUserIdEd = orderInitialUserIdEd;
            return this;
        }


        public QueryBuilder orderInitialUserId(Integer orderInitialUserId){
            setOrderInitialUserId(orderInitialUserId);
            return this;
        }

        public QueryBuilder orderInitialUserIdList(Integer ... orderInitialUserId){
            this.orderInitialUserIdList = solveNullList(orderInitialUserId);
            return this;
        }

        public QueryBuilder orderInitialUserIdList(List<Integer> orderInitialUserId){
            this.orderInitialUserIdList = orderInitialUserId;
            return this;
        }

        public QueryBuilder fetchOrderInitialUserId(){
            setFetchFields("fetchFields","orderInitialUserId");
            return this;
        }

        public QueryBuilder excludeOrderInitialUserId(){
            setFetchFields("excludeFields","orderInitialUserId");
            return this;
        }

        public QueryBuilder fuzzyOrderInitialTime (List<String> fuzzyOrderInitialTime){
            this.fuzzyOrderInitialTime = fuzzyOrderInitialTime;
            return this;
        }

        public QueryBuilder fuzzyOrderInitialTime (String ... fuzzyOrderInitialTime){
            this.fuzzyOrderInitialTime = solveNullList(fuzzyOrderInitialTime);
            return this;
        }

        public QueryBuilder rightFuzzyOrderInitialTime (List<String> rightFuzzyOrderInitialTime){
            this.rightFuzzyOrderInitialTime = rightFuzzyOrderInitialTime;
            return this;
        }

        public QueryBuilder rightFuzzyOrderInitialTime (String ... rightFuzzyOrderInitialTime){
            this.rightFuzzyOrderInitialTime = solveNullList(rightFuzzyOrderInitialTime);
            return this;
        }

        public QueryBuilder orderInitialTime(String orderInitialTime){
            setOrderInitialTime(orderInitialTime);
            return this;
        }

        public QueryBuilder orderInitialTimeList(String ... orderInitialTime){
            this.orderInitialTimeList = solveNullList(orderInitialTime);
            return this;
        }

        public QueryBuilder orderInitialTimeList(List<String> orderInitialTime){
            this.orderInitialTimeList = orderInitialTime;
            return this;
        }

        public QueryBuilder fetchOrderInitialTime(){
            setFetchFields("fetchFields","orderInitialTime");
            return this;
        }

        public QueryBuilder excludeOrderInitialTime(){
            setFetchFields("excludeFields","orderInitialTime");
            return this;
        }

        public QueryBuilder fuzzyOrderInitialState (List<String> fuzzyOrderInitialState){
            this.fuzzyOrderInitialState = fuzzyOrderInitialState;
            return this;
        }

        public QueryBuilder fuzzyOrderInitialState (String ... fuzzyOrderInitialState){
            this.fuzzyOrderInitialState = solveNullList(fuzzyOrderInitialState);
            return this;
        }

        public QueryBuilder rightFuzzyOrderInitialState (List<String> rightFuzzyOrderInitialState){
            this.rightFuzzyOrderInitialState = rightFuzzyOrderInitialState;
            return this;
        }

        public QueryBuilder rightFuzzyOrderInitialState (String ... rightFuzzyOrderInitialState){
            this.rightFuzzyOrderInitialState = solveNullList(rightFuzzyOrderInitialState);
            return this;
        }

        public QueryBuilder orderInitialState(String orderInitialState){
            setOrderInitialState(orderInitialState);
            return this;
        }

        public QueryBuilder orderInitialStateList(String ... orderInitialState){
            this.orderInitialStateList = solveNullList(orderInitialState);
            return this;
        }

        public QueryBuilder orderInitialStateList(List<String> orderInitialState){
            this.orderInitialStateList = orderInitialState;
            return this;
        }

        public QueryBuilder fetchOrderInitialState(){
            setFetchFields("fetchFields","orderInitialState");
            return this;
        }

        public QueryBuilder excludeOrderInitialState(){
            setFetchFields("excludeFields","orderInitialState");
            return this;
        }

        public QueryBuilder fuzzyOrderManagementType (List<String> fuzzyOrderManagementType){
            this.fuzzyOrderManagementType = fuzzyOrderManagementType;
            return this;
        }

        public QueryBuilder fuzzyOrderManagementType (String ... fuzzyOrderManagementType){
            this.fuzzyOrderManagementType = solveNullList(fuzzyOrderManagementType);
            return this;
        }

        public QueryBuilder rightFuzzyOrderManagementType (List<String> rightFuzzyOrderManagementType){
            this.rightFuzzyOrderManagementType = rightFuzzyOrderManagementType;
            return this;
        }

        public QueryBuilder rightFuzzyOrderManagementType (String ... rightFuzzyOrderManagementType){
            this.rightFuzzyOrderManagementType = solveNullList(rightFuzzyOrderManagementType);
            return this;
        }

        public QueryBuilder orderManagementType(String orderManagementType){
            setOrderManagementType(orderManagementType);
            return this;
        }

        public QueryBuilder orderManagementTypeList(String ... orderManagementType){
            this.orderManagementTypeList = solveNullList(orderManagementType);
            return this;
        }

        public QueryBuilder orderManagementTypeList(List<String> orderManagementType){
            this.orderManagementTypeList = orderManagementType;
            return this;
        }

        public QueryBuilder fetchOrderManagementType(){
            setFetchFields("fetchFields","orderManagementType");
            return this;
        }

        public QueryBuilder excludeOrderManagementType(){
            setFetchFields("excludeFields","orderManagementType");
            return this;
        }

        public QueryBuilder fuzzyOrderManagementFormName (List<String> fuzzyOrderManagementFormName){
            this.fuzzyOrderManagementFormName = fuzzyOrderManagementFormName;
            return this;
        }

        public QueryBuilder fuzzyOrderManagementFormName (String ... fuzzyOrderManagementFormName){
            this.fuzzyOrderManagementFormName = solveNullList(fuzzyOrderManagementFormName);
            return this;
        }

        public QueryBuilder rightFuzzyOrderManagementFormName (List<String> rightFuzzyOrderManagementFormName){
            this.rightFuzzyOrderManagementFormName = rightFuzzyOrderManagementFormName;
            return this;
        }

        public QueryBuilder rightFuzzyOrderManagementFormName (String ... rightFuzzyOrderManagementFormName){
            this.rightFuzzyOrderManagementFormName = solveNullList(rightFuzzyOrderManagementFormName);
            return this;
        }

        public QueryBuilder orderManagementFormName(String orderManagementFormName){
            setOrderManagementFormName(orderManagementFormName);
            return this;
        }

        public QueryBuilder orderManagementFormNameList(String ... orderManagementFormName){
            this.orderManagementFormNameList = solveNullList(orderManagementFormName);
            return this;
        }

        public QueryBuilder orderManagementFormNameList(List<String> orderManagementFormName){
            this.orderManagementFormNameList = orderManagementFormName;
            return this;
        }

        public QueryBuilder fetchOrderManagementFormName(){
            setFetchFields("fetchFields","orderManagementFormName");
            return this;
        }

        public QueryBuilder excludeOrderManagementFormName(){
            setFetchFields("excludeFields","orderManagementFormName");
            return this;
        }

        public QueryBuilder orderManagementFormIdBetWeen(Integer orderManagementFormIdSt,Integer orderManagementFormIdEd){
            this.orderManagementFormIdSt = orderManagementFormIdSt;
            this.orderManagementFormIdEd = orderManagementFormIdEd;
            return this;
        }

        public QueryBuilder orderManagementFormIdGreaterEqThan(Integer orderManagementFormIdSt){
            this.orderManagementFormIdSt = orderManagementFormIdSt;
            return this;
        }
        public QueryBuilder orderManagementFormIdLessEqThan(Integer orderManagementFormIdEd){
            this.orderManagementFormIdEd = orderManagementFormIdEd;
            return this;
        }


        public QueryBuilder orderManagementFormId(Integer orderManagementFormId){
            setOrderManagementFormId(orderManagementFormId);
            return this;
        }

        public QueryBuilder orderManagementFormIdList(Integer ... orderManagementFormId){
            this.orderManagementFormIdList = solveNullList(orderManagementFormId);
            return this;
        }

        public QueryBuilder orderManagementFormIdList(List<Integer> orderManagementFormId){
            this.orderManagementFormIdList = orderManagementFormId;
            return this;
        }

        public QueryBuilder fetchOrderManagementFormId(){
            setFetchFields("fetchFields","orderManagementFormId");
            return this;
        }

        public QueryBuilder excludeOrderManagementFormId(){
            setFetchFields("excludeFields","orderManagementFormId");
            return this;
        }

        public QueryBuilder simpleApplicationObjectIdBetWeen(Long simpleApplicationObjectIdSt,Long simpleApplicationObjectIdEd){
            this.simpleApplicationObjectIdSt = simpleApplicationObjectIdSt;
            this.simpleApplicationObjectIdEd = simpleApplicationObjectIdEd;
            return this;
        }

        public QueryBuilder simpleApplicationObjectIdGreaterEqThan(Long simpleApplicationObjectIdSt){
            this.simpleApplicationObjectIdSt = simpleApplicationObjectIdSt;
            return this;
        }
        public QueryBuilder simpleApplicationObjectIdLessEqThan(Long simpleApplicationObjectIdEd){
            this.simpleApplicationObjectIdEd = simpleApplicationObjectIdEd;
            return this;
        }


        public QueryBuilder simpleApplicationObjectId(Long simpleApplicationObjectId){
            setSimpleApplicationObjectId(simpleApplicationObjectId);
            return this;
        }

        public QueryBuilder simpleApplicationObjectIdList(Long ... simpleApplicationObjectId){
            this.simpleApplicationObjectIdList = solveNullList(simpleApplicationObjectId);
            return this;
        }

        public QueryBuilder simpleApplicationObjectIdList(List<Long> simpleApplicationObjectId){
            this.simpleApplicationObjectIdList = simpleApplicationObjectId;
            return this;
        }

        public QueryBuilder fetchSimpleApplicationObjectId(){
            setFetchFields("fetchFields","simpleApplicationObjectId");
            return this;
        }

        public QueryBuilder excludeSimpleApplicationObjectId(){
            setFetchFields("excludeFields","simpleApplicationObjectId");
            return this;
        }

        public QueryBuilder fuzzyProspectiveArrivalDate (List<String> fuzzyProspectiveArrivalDate){
            this.fuzzyProspectiveArrivalDate = fuzzyProspectiveArrivalDate;
            return this;
        }

        public QueryBuilder fuzzyProspectiveArrivalDate (String ... fuzzyProspectiveArrivalDate){
            this.fuzzyProspectiveArrivalDate = solveNullList(fuzzyProspectiveArrivalDate);
            return this;
        }

        public QueryBuilder rightFuzzyProspectiveArrivalDate (List<String> rightFuzzyProspectiveArrivalDate){
            this.rightFuzzyProspectiveArrivalDate = rightFuzzyProspectiveArrivalDate;
            return this;
        }

        public QueryBuilder rightFuzzyProspectiveArrivalDate (String ... rightFuzzyProspectiveArrivalDate){
            this.rightFuzzyProspectiveArrivalDate = solveNullList(rightFuzzyProspectiveArrivalDate);
            return this;
        }

        public QueryBuilder prospectiveArrivalDate(String prospectiveArrivalDate){
            setProspectiveArrivalDate(prospectiveArrivalDate);
            return this;
        }

        public QueryBuilder prospectiveArrivalDateList(String ... prospectiveArrivalDate){
            this.prospectiveArrivalDateList = solveNullList(prospectiveArrivalDate);
            return this;
        }

        public QueryBuilder prospectiveArrivalDateList(List<String> prospectiveArrivalDate){
            this.prospectiveArrivalDateList = prospectiveArrivalDate;
            return this;
        }

        public QueryBuilder fetchProspectiveArrivalDate(){
            setFetchFields("fetchFields","prospectiveArrivalDate");
            return this;
        }

        public QueryBuilder excludeProspectiveArrivalDate(){
            setFetchFields("excludeFields","prospectiveArrivalDate");
            return this;
        }

        public QueryBuilder fuzzySupplierCode (List<String> fuzzySupplierCode){
            this.fuzzySupplierCode = fuzzySupplierCode;
            return this;
        }

        public QueryBuilder fuzzySupplierCode (String ... fuzzySupplierCode){
            this.fuzzySupplierCode = solveNullList(fuzzySupplierCode);
            return this;
        }

        public QueryBuilder rightFuzzySupplierCode (List<String> rightFuzzySupplierCode){
            this.rightFuzzySupplierCode = rightFuzzySupplierCode;
            return this;
        }

        public QueryBuilder rightFuzzySupplierCode (String ... rightFuzzySupplierCode){
            this.rightFuzzySupplierCode = solveNullList(rightFuzzySupplierCode);
            return this;
        }

        public QueryBuilder supplierCode(String supplierCode){
            setSupplierCode(supplierCode);
            return this;
        }

        public QueryBuilder supplierCodeList(String ... supplierCode){
            this.supplierCodeList = solveNullList(supplierCode);
            return this;
        }

        public QueryBuilder supplierCodeList(List<String> supplierCode){
            this.supplierCodeList = supplierCode;
            return this;
        }

        public QueryBuilder fetchSupplierCode(){
            setFetchFields("fetchFields","supplierCode");
            return this;
        }

        public QueryBuilder excludeSupplierCode(){
            setFetchFields("excludeFields","supplierCode");
            return this;
        }

        public QueryBuilder fuzzyContractType (List<String> fuzzyContractType){
            this.fuzzyContractType = fuzzyContractType;
            return this;
        }

        public QueryBuilder fuzzyContractType (String ... fuzzyContractType){
            this.fuzzyContractType = solveNullList(fuzzyContractType);
            return this;
        }

        public QueryBuilder rightFuzzyContractType (List<String> rightFuzzyContractType){
            this.rightFuzzyContractType = rightFuzzyContractType;
            return this;
        }

        public QueryBuilder rightFuzzyContractType (String ... rightFuzzyContractType){
            this.rightFuzzyContractType = solveNullList(rightFuzzyContractType);
            return this;
        }

        public QueryBuilder contractType(String contractType){
            setContractType(contractType);
            return this;
        }

        public QueryBuilder contractTypeList(String ... contractType){
            this.contractTypeList = solveNullList(contractType);
            return this;
        }

        public QueryBuilder contractTypeList(List<String> contractType){
            this.contractTypeList = contractType;
            return this;
        }

        public QueryBuilder fetchContractType(){
            setFetchFields("fetchFields","contractType");
            return this;
        }

        public QueryBuilder excludeContractType(){
            setFetchFields("excludeFields","contractType");
            return this;
        }

        public QueryBuilder fuzzyOrderInitialDepartment (List<String> fuzzyOrderInitialDepartment){
            this.fuzzyOrderInitialDepartment = fuzzyOrderInitialDepartment;
            return this;
        }

        public QueryBuilder fuzzyOrderInitialDepartment (String ... fuzzyOrderInitialDepartment){
            this.fuzzyOrderInitialDepartment = solveNullList(fuzzyOrderInitialDepartment);
            return this;
        }

        public QueryBuilder rightFuzzyOrderInitialDepartment (List<String> rightFuzzyOrderInitialDepartment){
            this.rightFuzzyOrderInitialDepartment = rightFuzzyOrderInitialDepartment;
            return this;
        }

        public QueryBuilder rightFuzzyOrderInitialDepartment (String ... rightFuzzyOrderInitialDepartment){
            this.rightFuzzyOrderInitialDepartment = solveNullList(rightFuzzyOrderInitialDepartment);
            return this;
        }

        public QueryBuilder orderInitialDepartment(String orderInitialDepartment){
            setOrderInitialDepartment(orderInitialDepartment);
            return this;
        }

        public QueryBuilder orderInitialDepartmentList(String ... orderInitialDepartment){
            this.orderInitialDepartmentList = solveNullList(orderInitialDepartment);
            return this;
        }

        public QueryBuilder orderInitialDepartmentList(List<String> orderInitialDepartment){
            this.orderInitialDepartmentList = orderInitialDepartment;
            return this;
        }

        public QueryBuilder fetchOrderInitialDepartment(){
            setFetchFields("fetchFields","orderInitialDepartment");
            return this;
        }

        public QueryBuilder excludeOrderInitialDepartment(){
            setFetchFields("excludeFields","orderInitialDepartment");
            return this;
        }

        public QueryBuilder fuzzyOrderInitialUserName (List<String> fuzzyOrderInitialUserName){
            this.fuzzyOrderInitialUserName = fuzzyOrderInitialUserName;
            return this;
        }

        public QueryBuilder fuzzyOrderInitialUserName (String ... fuzzyOrderInitialUserName){
            this.fuzzyOrderInitialUserName = solveNullList(fuzzyOrderInitialUserName);
            return this;
        }

        public QueryBuilder rightFuzzyOrderInitialUserName (List<String> rightFuzzyOrderInitialUserName){
            this.rightFuzzyOrderInitialUserName = rightFuzzyOrderInitialUserName;
            return this;
        }

        public QueryBuilder rightFuzzyOrderInitialUserName (String ... rightFuzzyOrderInitialUserName){
            this.rightFuzzyOrderInitialUserName = solveNullList(rightFuzzyOrderInitialUserName);
            return this;
        }

        public QueryBuilder orderInitialUserName(String orderInitialUserName){
            setOrderInitialUserName(orderInitialUserName);
            return this;
        }

        public QueryBuilder orderInitialUserNameList(String ... orderInitialUserName){
            this.orderInitialUserNameList = solveNullList(orderInitialUserName);
            return this;
        }

        public QueryBuilder orderInitialUserNameList(List<String> orderInitialUserName){
            this.orderInitialUserNameList = orderInitialUserName;
            return this;
        }

        public QueryBuilder fetchOrderInitialUserName(){
            setFetchFields("fetchFields","orderInitialUserName");
            return this;
        }

        public QueryBuilder excludeOrderInitialUserName(){
            setFetchFields("excludeFields","orderInitialUserName");
            return this;
        }

        public QueryBuilder fuzzyRecommendedSupplierName (List<String> fuzzyRecommendedSupplierName){
            this.fuzzyRecommendedSupplierName = fuzzyRecommendedSupplierName;
            return this;
        }

        public QueryBuilder fuzzyRecommendedSupplierName (String ... fuzzyRecommendedSupplierName){
            this.fuzzyRecommendedSupplierName = solveNullList(fuzzyRecommendedSupplierName);
            return this;
        }

        public QueryBuilder rightFuzzyRecommendedSupplierName (List<String> rightFuzzyRecommendedSupplierName){
            this.rightFuzzyRecommendedSupplierName = rightFuzzyRecommendedSupplierName;
            return this;
        }

        public QueryBuilder rightFuzzyRecommendedSupplierName (String ... rightFuzzyRecommendedSupplierName){
            this.rightFuzzyRecommendedSupplierName = solveNullList(rightFuzzyRecommendedSupplierName);
            return this;
        }

        public QueryBuilder recommendedSupplierName(String recommendedSupplierName){
            setRecommendedSupplierName(recommendedSupplierName);
            return this;
        }

        public QueryBuilder recommendedSupplierNameList(String ... recommendedSupplierName){
            this.recommendedSupplierNameList = solveNullList(recommendedSupplierName);
            return this;
        }

        public QueryBuilder recommendedSupplierNameList(List<String> recommendedSupplierName){
            this.recommendedSupplierNameList = recommendedSupplierName;
            return this;
        }

        public QueryBuilder fetchRecommendedSupplierName(){
            setFetchFields("fetchFields","recommendedSupplierName");
            return this;
        }

        public QueryBuilder excludeRecommendedSupplierName(){
            setFetchFields("excludeFields","recommendedSupplierName");
            return this;
        }

        public QueryBuilder fuzzyWarehouseSymbol (List<String> fuzzyWarehouseSymbol){
            this.fuzzyWarehouseSymbol = fuzzyWarehouseSymbol;
            return this;
        }

        public QueryBuilder fuzzyWarehouseSymbol (String ... fuzzyWarehouseSymbol){
            this.fuzzyWarehouseSymbol = solveNullList(fuzzyWarehouseSymbol);
            return this;
        }

        public QueryBuilder rightFuzzyWarehouseSymbol (List<String> rightFuzzyWarehouseSymbol){
            this.rightFuzzyWarehouseSymbol = rightFuzzyWarehouseSymbol;
            return this;
        }

        public QueryBuilder rightFuzzyWarehouseSymbol (String ... rightFuzzyWarehouseSymbol){
            this.rightFuzzyWarehouseSymbol = solveNullList(rightFuzzyWarehouseSymbol);
            return this;
        }

        public QueryBuilder warehouseSymbol(String warehouseSymbol){
            setWarehouseSymbol(warehouseSymbol);
            return this;
        }

        public QueryBuilder warehouseSymbolList(String ... warehouseSymbol){
            this.warehouseSymbolList = solveNullList(warehouseSymbol);
            return this;
        }

        public QueryBuilder warehouseSymbolList(List<String> warehouseSymbol){
            this.warehouseSymbolList = warehouseSymbol;
            return this;
        }

        public QueryBuilder fetchWarehouseSymbol(){
            setFetchFields("fetchFields","warehouseSymbol");
            return this;
        }

        public QueryBuilder excludeWarehouseSymbol(){
            setFetchFields("excludeFields","warehouseSymbol");
            return this;
        }

        public QueryBuilder fuzzyCostManagement (List<String> fuzzyCostManagement){
            this.fuzzyCostManagement = fuzzyCostManagement;
            return this;
        }

        public QueryBuilder fuzzyCostManagement (String ... fuzzyCostManagement){
            this.fuzzyCostManagement = solveNullList(fuzzyCostManagement);
            return this;
        }

        public QueryBuilder rightFuzzyCostManagement (List<String> rightFuzzyCostManagement){
            this.rightFuzzyCostManagement = rightFuzzyCostManagement;
            return this;
        }

        public QueryBuilder rightFuzzyCostManagement (String ... rightFuzzyCostManagement){
            this.rightFuzzyCostManagement = solveNullList(rightFuzzyCostManagement);
            return this;
        }

        public QueryBuilder costManagement(String costManagement){
            setCostManagement(costManagement);
            return this;
        }

        public QueryBuilder costManagementList(String ... costManagement){
            this.costManagementList = solveNullList(costManagement);
            return this;
        }

        public QueryBuilder costManagementList(List<String> costManagement){
            this.costManagementList = costManagement;
            return this;
        }

        public QueryBuilder fetchCostManagement(){
            setFetchFields("fetchFields","costManagement");
            return this;
        }

        public QueryBuilder excludeCostManagement(){
            setFetchFields("excludeFields","costManagement");
            return this;
        }

        public QueryBuilder fuzzyProductionLine (List<String> fuzzyProductionLine){
            this.fuzzyProductionLine = fuzzyProductionLine;
            return this;
        }

        public QueryBuilder fuzzyProductionLine (String ... fuzzyProductionLine){
            this.fuzzyProductionLine = solveNullList(fuzzyProductionLine);
            return this;
        }

        public QueryBuilder rightFuzzyProductionLine (List<String> rightFuzzyProductionLine){
            this.rightFuzzyProductionLine = rightFuzzyProductionLine;
            return this;
        }

        public QueryBuilder rightFuzzyProductionLine (String ... rightFuzzyProductionLine){
            this.rightFuzzyProductionLine = solveNullList(rightFuzzyProductionLine);
            return this;
        }

        public QueryBuilder productionLine(String productionLine){
            setProductionLine(productionLine);
            return this;
        }

        public QueryBuilder productionLineList(String ... productionLine){
            this.productionLineList = solveNullList(productionLine);
            return this;
        }

        public QueryBuilder productionLineList(List<String> productionLine){
            this.productionLineList = productionLine;
            return this;
        }

        public QueryBuilder fetchProductionLine(){
            setFetchFields("fetchFields","productionLine");
            return this;
        }

        public QueryBuilder excludeProductionLine(){
            setFetchFields("excludeFields","productionLine");
            return this;
        }

        public QueryBuilder fuzzyOperationPositionCode (List<String> fuzzyOperationPositionCode){
            this.fuzzyOperationPositionCode = fuzzyOperationPositionCode;
            return this;
        }

        public QueryBuilder fuzzyOperationPositionCode (String ... fuzzyOperationPositionCode){
            this.fuzzyOperationPositionCode = solveNullList(fuzzyOperationPositionCode);
            return this;
        }

        public QueryBuilder rightFuzzyOperationPositionCode (List<String> rightFuzzyOperationPositionCode){
            this.rightFuzzyOperationPositionCode = rightFuzzyOperationPositionCode;
            return this;
        }

        public QueryBuilder rightFuzzyOperationPositionCode (String ... rightFuzzyOperationPositionCode){
            this.rightFuzzyOperationPositionCode = solveNullList(rightFuzzyOperationPositionCode);
            return this;
        }

        public QueryBuilder operationPositionCode(String operationPositionCode){
            setOperationPositionCode(operationPositionCode);
            return this;
        }

        public QueryBuilder operationPositionCodeList(String ... operationPositionCode){
            this.operationPositionCodeList = solveNullList(operationPositionCode);
            return this;
        }

        public QueryBuilder operationPositionCodeList(List<String> operationPositionCode){
            this.operationPositionCodeList = operationPositionCode;
            return this;
        }

        public QueryBuilder fetchOperationPositionCode(){
            setFetchFields("fetchFields","operationPositionCode");
            return this;
        }

        public QueryBuilder excludeOperationPositionCode(){
            setFetchFields("excludeFields","operationPositionCode");
            return this;
        }

        public QueryBuilder fuzzyEquipmentCompany (List<String> fuzzyEquipmentCompany){
            this.fuzzyEquipmentCompany = fuzzyEquipmentCompany;
            return this;
        }

        public QueryBuilder fuzzyEquipmentCompany (String ... fuzzyEquipmentCompany){
            this.fuzzyEquipmentCompany = solveNullList(fuzzyEquipmentCompany);
            return this;
        }

        public QueryBuilder rightFuzzyEquipmentCompany (List<String> rightFuzzyEquipmentCompany){
            this.rightFuzzyEquipmentCompany = rightFuzzyEquipmentCompany;
            return this;
        }

        public QueryBuilder rightFuzzyEquipmentCompany (String ... rightFuzzyEquipmentCompany){
            this.rightFuzzyEquipmentCompany = solveNullList(rightFuzzyEquipmentCompany);
            return this;
        }

        public QueryBuilder equipmentCompany(String equipmentCompany){
            setEquipmentCompany(equipmentCompany);
            return this;
        }

        public QueryBuilder equipmentCompanyList(String ... equipmentCompany){
            this.equipmentCompanyList = solveNullList(equipmentCompany);
            return this;
        }

        public QueryBuilder equipmentCompanyList(List<String> equipmentCompany){
            this.equipmentCompanyList = equipmentCompany;
            return this;
        }

        public QueryBuilder fetchEquipmentCompany(){
            setFetchFields("fetchFields","equipmentCompany");
            return this;
        }

        public QueryBuilder excludeEquipmentCompany(){
            setFetchFields("excludeFields","equipmentCompany");
            return this;
        }

        public QueryBuilder fuzzySparePartsBrand (List<String> fuzzySparePartsBrand){
            this.fuzzySparePartsBrand = fuzzySparePartsBrand;
            return this;
        }

        public QueryBuilder fuzzySparePartsBrand (String ... fuzzySparePartsBrand){
            this.fuzzySparePartsBrand = solveNullList(fuzzySparePartsBrand);
            return this;
        }

        public QueryBuilder rightFuzzySparePartsBrand (List<String> rightFuzzySparePartsBrand){
            this.rightFuzzySparePartsBrand = rightFuzzySparePartsBrand;
            return this;
        }

        public QueryBuilder rightFuzzySparePartsBrand (String ... rightFuzzySparePartsBrand){
            this.rightFuzzySparePartsBrand = solveNullList(rightFuzzySparePartsBrand);
            return this;
        }

        public QueryBuilder sparePartsBrand(String sparePartsBrand){
            setSparePartsBrand(sparePartsBrand);
            return this;
        }

        public QueryBuilder sparePartsBrandList(String ... sparePartsBrand){
            this.sparePartsBrandList = solveNullList(sparePartsBrand);
            return this;
        }

        public QueryBuilder sparePartsBrandList(List<String> sparePartsBrand){
            this.sparePartsBrandList = sparePartsBrand;
            return this;
        }

        public QueryBuilder fetchSparePartsBrand(){
            setFetchFields("fetchFields","sparePartsBrand");
            return this;
        }

        public QueryBuilder excludeSparePartsBrand(){
            setFetchFields("excludeFields","sparePartsBrand");
            return this;
        }

        public QueryBuilder fuzzySparePartsOrderDesc (List<String> fuzzySparePartsOrderDesc){
            this.fuzzySparePartsOrderDesc = fuzzySparePartsOrderDesc;
            return this;
        }

        public QueryBuilder fuzzySparePartsOrderDesc (String ... fuzzySparePartsOrderDesc){
            this.fuzzySparePartsOrderDesc = solveNullList(fuzzySparePartsOrderDesc);
            return this;
        }

        public QueryBuilder rightFuzzySparePartsOrderDesc (List<String> rightFuzzySparePartsOrderDesc){
            this.rightFuzzySparePartsOrderDesc = rightFuzzySparePartsOrderDesc;
            return this;
        }

        public QueryBuilder rightFuzzySparePartsOrderDesc (String ... rightFuzzySparePartsOrderDesc){
            this.rightFuzzySparePartsOrderDesc = solveNullList(rightFuzzySparePartsOrderDesc);
            return this;
        }

        public QueryBuilder sparePartsOrderDesc(String sparePartsOrderDesc){
            setSparePartsOrderDesc(sparePartsOrderDesc);
            return this;
        }

        public QueryBuilder sparePartsOrderDescList(String ... sparePartsOrderDesc){
            this.sparePartsOrderDescList = solveNullList(sparePartsOrderDesc);
            return this;
        }

        public QueryBuilder sparePartsOrderDescList(List<String> sparePartsOrderDesc){
            this.sparePartsOrderDescList = sparePartsOrderDesc;
            return this;
        }

        public QueryBuilder fetchSparePartsOrderDesc(){
            setFetchFields("fetchFields","sparePartsOrderDesc");
            return this;
        }

        public QueryBuilder excludeSparePartsOrderDesc(){
            setFetchFields("excludeFields","sparePartsOrderDesc");
            return this;
        }

        public QueryBuilder fuzzySparePartsEmergency (List<String> fuzzySparePartsEmergency){
            this.fuzzySparePartsEmergency = fuzzySparePartsEmergency;
            return this;
        }

        public QueryBuilder fuzzySparePartsEmergency (String ... fuzzySparePartsEmergency){
            this.fuzzySparePartsEmergency = solveNullList(fuzzySparePartsEmergency);
            return this;
        }

        public QueryBuilder rightFuzzySparePartsEmergency (List<String> rightFuzzySparePartsEmergency){
            this.rightFuzzySparePartsEmergency = rightFuzzySparePartsEmergency;
            return this;
        }

        public QueryBuilder rightFuzzySparePartsEmergency (String ... rightFuzzySparePartsEmergency){
            this.rightFuzzySparePartsEmergency = solveNullList(rightFuzzySparePartsEmergency);
            return this;
        }

        public QueryBuilder sparePartsEmergency(String sparePartsEmergency){
            setSparePartsEmergency(sparePartsEmergency);
            return this;
        }

        public QueryBuilder sparePartsEmergencyList(String ... sparePartsEmergency){
            this.sparePartsEmergencyList = solveNullList(sparePartsEmergency);
            return this;
        }

        public QueryBuilder sparePartsEmergencyList(List<String> sparePartsEmergency){
            this.sparePartsEmergencyList = sparePartsEmergency;
            return this;
        }

        public QueryBuilder fetchSparePartsEmergency(){
            setFetchFields("fetchFields","sparePartsEmergency");
            return this;
        }

        public QueryBuilder excludeSparePartsEmergency(){
            setFetchFields("excludeFields","sparePartsEmergency");
            return this;
        }

        public QueryBuilder fuzzyExtraOrderReason (List<String> fuzzyExtraOrderReason){
            this.fuzzyExtraOrderReason = fuzzyExtraOrderReason;
            return this;
        }

        public QueryBuilder fuzzyExtraOrderReason (String ... fuzzyExtraOrderReason){
            this.fuzzyExtraOrderReason = solveNullList(fuzzyExtraOrderReason);
            return this;
        }

        public QueryBuilder rightFuzzyExtraOrderReason (List<String> rightFuzzyExtraOrderReason){
            this.rightFuzzyExtraOrderReason = rightFuzzyExtraOrderReason;
            return this;
        }

        public QueryBuilder rightFuzzyExtraOrderReason (String ... rightFuzzyExtraOrderReason){
            this.rightFuzzyExtraOrderReason = solveNullList(rightFuzzyExtraOrderReason);
            return this;
        }

        public QueryBuilder extraOrderReason(String extraOrderReason){
            setExtraOrderReason(extraOrderReason);
            return this;
        }

        public QueryBuilder extraOrderReasonList(String ... extraOrderReason){
            this.extraOrderReasonList = solveNullList(extraOrderReason);
            return this;
        }

        public QueryBuilder extraOrderReasonList(List<String> extraOrderReason){
            this.extraOrderReasonList = extraOrderReason;
            return this;
        }

        public QueryBuilder fetchExtraOrderReason(){
            setFetchFields("fetchFields","extraOrderReason");
            return this;
        }

        public QueryBuilder excludeExtraOrderReason(){
            setFetchFields("excludeFields","extraOrderReason");
            return this;
        }

        public QueryBuilder fuzzyKnifeCode (List<String> fuzzyKnifeCode){
            this.fuzzyKnifeCode = fuzzyKnifeCode;
            return this;
        }

        public QueryBuilder fuzzyKnifeCode (String ... fuzzyKnifeCode){
            this.fuzzyKnifeCode = solveNullList(fuzzyKnifeCode);
            return this;
        }

        public QueryBuilder rightFuzzyKnifeCode (List<String> rightFuzzyKnifeCode){
            this.rightFuzzyKnifeCode = rightFuzzyKnifeCode;
            return this;
        }

        public QueryBuilder rightFuzzyKnifeCode (String ... rightFuzzyKnifeCode){
            this.rightFuzzyKnifeCode = solveNullList(rightFuzzyKnifeCode);
            return this;
        }

        public QueryBuilder knifeCode(String knifeCode){
            setKnifeCode(knifeCode);
            return this;
        }

        public QueryBuilder knifeCodeList(String ... knifeCode){
            this.knifeCodeList = solveNullList(knifeCode);
            return this;
        }

        public QueryBuilder knifeCodeList(List<String> knifeCode){
            this.knifeCodeList = knifeCode;
            return this;
        }

        public QueryBuilder fetchKnifeCode(){
            setFetchFields("fetchFields","knifeCode");
            return this;
        }

        public QueryBuilder excludeKnifeCode(){
            setFetchFields("excludeFields","knifeCode");
            return this;
        }

        public QueryBuilder fuzzyImportantProjectCode (List<String> fuzzyImportantProjectCode){
            this.fuzzyImportantProjectCode = fuzzyImportantProjectCode;
            return this;
        }

        public QueryBuilder fuzzyImportantProjectCode (String ... fuzzyImportantProjectCode){
            this.fuzzyImportantProjectCode = solveNullList(fuzzyImportantProjectCode);
            return this;
        }

        public QueryBuilder rightFuzzyImportantProjectCode (List<String> rightFuzzyImportantProjectCode){
            this.rightFuzzyImportantProjectCode = rightFuzzyImportantProjectCode;
            return this;
        }

        public QueryBuilder rightFuzzyImportantProjectCode (String ... rightFuzzyImportantProjectCode){
            this.rightFuzzyImportantProjectCode = solveNullList(rightFuzzyImportantProjectCode);
            return this;
        }

        public QueryBuilder importantProjectCode(String importantProjectCode){
            setImportantProjectCode(importantProjectCode);
            return this;
        }

        public QueryBuilder importantProjectCodeList(String ... importantProjectCode){
            this.importantProjectCodeList = solveNullList(importantProjectCode);
            return this;
        }

        public QueryBuilder importantProjectCodeList(List<String> importantProjectCode){
            this.importantProjectCodeList = importantProjectCode;
            return this;
        }

        public QueryBuilder fetchImportantProjectCode(){
            setFetchFields("fetchFields","importantProjectCode");
            return this;
        }

        public QueryBuilder excludeImportantProjectCode(){
            setFetchFields("excludeFields","importantProjectCode");
            return this;
        }

        public QueryBuilder fuzzyWarehousingReasonCode (List<String> fuzzyWarehousingReasonCode){
            this.fuzzyWarehousingReasonCode = fuzzyWarehousingReasonCode;
            return this;
        }

        public QueryBuilder fuzzyWarehousingReasonCode (String ... fuzzyWarehousingReasonCode){
            this.fuzzyWarehousingReasonCode = solveNullList(fuzzyWarehousingReasonCode);
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingReasonCode (List<String> rightFuzzyWarehousingReasonCode){
            this.rightFuzzyWarehousingReasonCode = rightFuzzyWarehousingReasonCode;
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingReasonCode (String ... rightFuzzyWarehousingReasonCode){
            this.rightFuzzyWarehousingReasonCode = solveNullList(rightFuzzyWarehousingReasonCode);
            return this;
        }

        public QueryBuilder warehousingReasonCode(String warehousingReasonCode){
            setWarehousingReasonCode(warehousingReasonCode);
            return this;
        }

        public QueryBuilder warehousingReasonCodeList(String ... warehousingReasonCode){
            this.warehousingReasonCodeList = solveNullList(warehousingReasonCode);
            return this;
        }

        public QueryBuilder warehousingReasonCodeList(List<String> warehousingReasonCode){
            this.warehousingReasonCodeList = warehousingReasonCode;
            return this;
        }

        public QueryBuilder fetchWarehousingReasonCode(){
            setFetchFields("fetchFields","warehousingReasonCode");
            return this;
        }

        public QueryBuilder excludeWarehousingReasonCode(){
            setFetchFields("excludeFields","warehousingReasonCode");
            return this;
        }

        public QueryBuilder fuzzyOrderListCode (List<String> fuzzyOrderListCode){
            this.fuzzyOrderListCode = fuzzyOrderListCode;
            return this;
        }

        public QueryBuilder fuzzyOrderListCode (String ... fuzzyOrderListCode){
            this.fuzzyOrderListCode = solveNullList(fuzzyOrderListCode);
            return this;
        }

        public QueryBuilder rightFuzzyOrderListCode (List<String> rightFuzzyOrderListCode){
            this.rightFuzzyOrderListCode = rightFuzzyOrderListCode;
            return this;
        }

        public QueryBuilder rightFuzzyOrderListCode (String ... rightFuzzyOrderListCode){
            this.rightFuzzyOrderListCode = solveNullList(rightFuzzyOrderListCode);
            return this;
        }

        public QueryBuilder orderListCode(String orderListCode){
            setOrderListCode(orderListCode);
            return this;
        }

        public QueryBuilder orderListCodeList(String ... orderListCode){
            this.orderListCodeList = solveNullList(orderListCode);
            return this;
        }

        public QueryBuilder orderListCodeList(List<String> orderListCode){
            this.orderListCodeList = orderListCode;
            return this;
        }

        public QueryBuilder fetchOrderListCode(){
            setFetchFields("fetchFields","orderListCode");
            return this;
        }

        public QueryBuilder excludeOrderListCode(){
            setFetchFields("excludeFields","orderListCode");
            return this;
        }

        public QueryBuilder fuzzyVariables (List<String> fuzzyVariables){
            this.fuzzyVariables = fuzzyVariables;
            return this;
        }

        public QueryBuilder fuzzyVariables (String ... fuzzyVariables){
            this.fuzzyVariables = solveNullList(fuzzyVariables);
            return this;
        }

        public QueryBuilder rightFuzzyVariables (List<String> rightFuzzyVariables){
            this.rightFuzzyVariables = rightFuzzyVariables;
            return this;
        }

        public QueryBuilder rightFuzzyVariables (String ... rightFuzzyVariables){
            this.rightFuzzyVariables = solveNullList(rightFuzzyVariables);
            return this;
        }

        public QueryBuilder variables(String variables){
            setVariables(variables);
            return this;
        }

        public QueryBuilder variablesList(String ... variables){
            this.variablesList = solveNullList(variables);
            return this;
        }

        public QueryBuilder variablesList(List<String> variables){
            this.variablesList = variables;
            return this;
        }

        public QueryBuilder fetchVariables(){
            setFetchFields("fetchFields","variables");
            return this;
        }

        public QueryBuilder excludeVariables(){
            setFetchFields("excludeFields","variables");
            return this;
        }

        public QueryBuilder fuzzyWarehouseCode (List<String> fuzzyWarehouseCode){
            this.fuzzyWarehouseCode = fuzzyWarehouseCode;
            return this;
        }

        public QueryBuilder fuzzyWarehouseCode (String ... fuzzyWarehouseCode){
            this.fuzzyWarehouseCode = solveNullList(fuzzyWarehouseCode);
            return this;
        }

        public QueryBuilder rightFuzzyWarehouseCode (List<String> rightFuzzyWarehouseCode){
            this.rightFuzzyWarehouseCode = rightFuzzyWarehouseCode;
            return this;
        }

        public QueryBuilder rightFuzzyWarehouseCode (String ... rightFuzzyWarehouseCode){
            this.rightFuzzyWarehouseCode = solveNullList(rightFuzzyWarehouseCode);
            return this;
        }

        public QueryBuilder warehouseCode(String warehouseCode){
            setWarehouseCode(warehouseCode);
            return this;
        }

        public QueryBuilder warehouseCodeList(String ... warehouseCode){
            this.warehouseCodeList = solveNullList(warehouseCode);
            return this;
        }

        public QueryBuilder warehouseCodeList(List<String> warehouseCode){
            this.warehouseCodeList = warehouseCode;
            return this;
        }

        public QueryBuilder fetchWarehouseCode(){
            setFetchFields("fetchFields","warehouseCode");
            return this;
        }

        public QueryBuilder excludeWarehouseCode(){
            setFetchFields("excludeFields","warehouseCode");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public Order build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> orderIdList;

        public List<Long> getOrderIdList(){return this.orderIdList;}

        private Long orderIdSt;

        private Long orderIdEd;

        public Long getOrderIdSt(){return this.orderIdSt;}

        public Long getOrderIdEd(){return this.orderIdEd;}

        private List<String> orderOperaterUserNameList;

        public List<String> getOrderOperaterUserNameList(){return this.orderOperaterUserNameList;}


        private List<String> fuzzyOrderOperaterUserName;

        public List<String> getFuzzyOrderOperaterUserName(){return this.fuzzyOrderOperaterUserName;}

        private List<String> rightFuzzyOrderOperaterUserName;

        public List<String> getRightFuzzyOrderOperaterUserName(){return this.rightFuzzyOrderOperaterUserName;}
        private List<String> orderOperaterTimeList;

        public List<String> getOrderOperaterTimeList(){return this.orderOperaterTimeList;}


        private List<String> fuzzyOrderOperaterTime;

        public List<String> getFuzzyOrderOperaterTime(){return this.fuzzyOrderOperaterTime;}

        private List<String> rightFuzzyOrderOperaterTime;

        public List<String> getRightFuzzyOrderOperaterTime(){return this.rightFuzzyOrderOperaterTime;}
        private List<String> orderTypeList;

        public List<String> getOrderTypeList(){return this.orderTypeList;}


        private List<String> fuzzyOrderType;

        public List<String> getFuzzyOrderType(){return this.fuzzyOrderType;}

        private List<String> rightFuzzyOrderType;

        public List<String> getRightFuzzyOrderType(){return this.rightFuzzyOrderType;}
        private List<String> financialListCodeList;

        public List<String> getFinancialListCodeList(){return this.financialListCodeList;}


        private List<String> fuzzyFinancialListCode;

        public List<String> getFuzzyFinancialListCode(){return this.fuzzyFinancialListCode;}

        private List<String> rightFuzzyFinancialListCode;

        public List<String> getRightFuzzyFinancialListCode(){return this.rightFuzzyFinancialListCode;}
        private List<String> purchasingListCodeList;

        public List<String> getPurchasingListCodeList(){return this.purchasingListCodeList;}


        private List<String> fuzzyPurchasingListCode;

        public List<String> getFuzzyPurchasingListCode(){return this.fuzzyPurchasingListCode;}

        private List<String> rightFuzzyPurchasingListCode;

        public List<String> getRightFuzzyPurchasingListCode(){return this.rightFuzzyPurchasingListCode;}
        private List<String> materialCodeList;

        public List<String> getMaterialCodeList(){return this.materialCodeList;}


        private List<String> fuzzyMaterialCode;

        public List<String> getFuzzyMaterialCode(){return this.fuzzyMaterialCode;}

        private List<String> rightFuzzyMaterialCode;

        public List<String> getRightFuzzyMaterialCode(){return this.rightFuzzyMaterialCode;}
        private List<String> materialNameList;

        public List<String> getMaterialNameList(){return this.materialNameList;}


        private List<String> fuzzyMaterialName;

        public List<String> getFuzzyMaterialName(){return this.fuzzyMaterialName;}

        private List<String> rightFuzzyMaterialName;

        public List<String> getRightFuzzyMaterialName(){return this.rightFuzzyMaterialName;}
        private List<String> confirmMaterialNameList;

        public List<String> getConfirmMaterialNameList(){return this.confirmMaterialNameList;}


        private List<String> fuzzyConfirmMaterialName;

        public List<String> getFuzzyConfirmMaterialName(){return this.fuzzyConfirmMaterialName;}

        private List<String> rightFuzzyConfirmMaterialName;

        public List<String> getRightFuzzyConfirmMaterialName(){return this.rightFuzzyConfirmMaterialName;}
        private List<String> materialSpecsList;

        public List<String> getMaterialSpecsList(){return this.materialSpecsList;}


        private List<String> fuzzyMaterialSpecs;

        public List<String> getFuzzyMaterialSpecs(){return this.fuzzyMaterialSpecs;}

        private List<String> rightFuzzyMaterialSpecs;

        public List<String> getRightFuzzyMaterialSpecs(){return this.rightFuzzyMaterialSpecs;}
        private List<String> confirmMaterialSpecsList;

        public List<String> getConfirmMaterialSpecsList(){return this.confirmMaterialSpecsList;}


        private List<String> fuzzyConfirmMaterialSpecs;

        public List<String> getFuzzyConfirmMaterialSpecs(){return this.fuzzyConfirmMaterialSpecs;}

        private List<String> rightFuzzyConfirmMaterialSpecs;

        public List<String> getRightFuzzyConfirmMaterialSpecs(){return this.rightFuzzyConfirmMaterialSpecs;}
        private List<String> materialBrandList;

        public List<String> getMaterialBrandList(){return this.materialBrandList;}


        private List<String> fuzzyMaterialBrand;

        public List<String> getFuzzyMaterialBrand(){return this.fuzzyMaterialBrand;}

        private List<String> rightFuzzyMaterialBrand;

        public List<String> getRightFuzzyMaterialBrand(){return this.rightFuzzyMaterialBrand;}
        private List<String> confirmMaterialBrandList;

        public List<String> getConfirmMaterialBrandList(){return this.confirmMaterialBrandList;}


        private List<String> fuzzyConfirmMaterialBrand;

        public List<String> getFuzzyConfirmMaterialBrand(){return this.fuzzyConfirmMaterialBrand;}

        private List<String> rightFuzzyConfirmMaterialBrand;

        public List<String> getRightFuzzyConfirmMaterialBrand(){return this.rightFuzzyConfirmMaterialBrand;}
        private List<String> materialUnitList;

        public List<String> getMaterialUnitList(){return this.materialUnitList;}


        private List<String> fuzzyMaterialUnit;

        public List<String> getFuzzyMaterialUnit(){return this.fuzzyMaterialUnit;}

        private List<String> rightFuzzyMaterialUnit;

        public List<String> getRightFuzzyMaterialUnit(){return this.rightFuzzyMaterialUnit;}
        private List<Integer> orderMaterialNumList;

        public List<Integer> getOrderMaterialNumList(){return this.orderMaterialNumList;}

        private Integer orderMaterialNumSt;

        private Integer orderMaterialNumEd;

        public Integer getOrderMaterialNumSt(){return this.orderMaterialNumSt;}

        public Integer getOrderMaterialNumEd(){return this.orderMaterialNumEd;}

        private List<String> financialCenterCodeList;

        public List<String> getFinancialCenterCodeList(){return this.financialCenterCodeList;}


        private List<String> fuzzyFinancialCenterCode;

        public List<String> getFuzzyFinancialCenterCode(){return this.fuzzyFinancialCenterCode;}

        private List<String> rightFuzzyFinancialCenterCode;

        public List<String> getRightFuzzyFinancialCenterCode(){return this.rightFuzzyFinancialCenterCode;}
        private List<String> orderBuyerList;

        public List<String> getOrderBuyerList(){return this.orderBuyerList;}


        private List<String> fuzzyOrderBuyer;

        public List<String> getFuzzyOrderBuyer(){return this.fuzzyOrderBuyer;}

        private List<String> rightFuzzyOrderBuyer;

        public List<String> getRightFuzzyOrderBuyer(){return this.rightFuzzyOrderBuyer;}
        private List<String> supplierNameList;

        public List<String> getSupplierNameList(){return this.supplierNameList;}


        private List<String> fuzzySupplierName;

        public List<String> getFuzzySupplierName(){return this.fuzzySupplierName;}

        private List<String> rightFuzzySupplierName;

        public List<String> getRightFuzzySupplierName(){return this.rightFuzzySupplierName;}
        private List<String> orderStateList;

        public List<String> getOrderStateList(){return this.orderStateList;}


        private List<String> fuzzyOrderState;

        public List<String> getFuzzyOrderState(){return this.fuzzyOrderState;}

        private List<String> rightFuzzyOrderState;

        public List<String> getRightFuzzyOrderState(){return this.rightFuzzyOrderState;}
        private List<String> orderBuyerCheckDateList;

        public List<String> getOrderBuyerCheckDateList(){return this.orderBuyerCheckDateList;}


        private List<String> fuzzyOrderBuyerCheckDate;

        public List<String> getFuzzyOrderBuyerCheckDate(){return this.fuzzyOrderBuyerCheckDate;}

        private List<String> rightFuzzyOrderBuyerCheckDate;

        public List<String> getRightFuzzyOrderBuyerCheckDate(){return this.rightFuzzyOrderBuyerCheckDate;}
        private List<String> orderPriceCheckDateList;

        public List<String> getOrderPriceCheckDateList(){return this.orderPriceCheckDateList;}


        private List<String> fuzzyOrderPriceCheckDate;

        public List<String> getFuzzyOrderPriceCheckDate(){return this.fuzzyOrderPriceCheckDate;}

        private List<String> rightFuzzyOrderPriceCheckDate;

        public List<String> getRightFuzzyOrderPriceCheckDate(){return this.rightFuzzyOrderPriceCheckDate;}
        private List<String> purchasingOrderCodeList;

        public List<String> getPurchasingOrderCodeList(){return this.purchasingOrderCodeList;}


        private List<String> fuzzyPurchasingOrderCode;

        public List<String> getFuzzyPurchasingOrderCode(){return this.fuzzyPurchasingOrderCode;}

        private List<String> rightFuzzyPurchasingOrderCode;

        public List<String> getRightFuzzyPurchasingOrderCode(){return this.rightFuzzyPurchasingOrderCode;}
        private List<String> arrivalDateList;

        public List<String> getArrivalDateList(){return this.arrivalDateList;}


        private List<String> fuzzyArrivalDate;

        public List<String> getFuzzyArrivalDate(){return this.fuzzyArrivalDate;}

        private List<String> rightFuzzyArrivalDate;

        public List<String> getRightFuzzyArrivalDate(){return this.rightFuzzyArrivalDate;}
        private List<Integer> receivedNumList;

        public List<Integer> getReceivedNumList(){return this.receivedNumList;}

        private Integer receivedNumSt;

        private Integer receivedNumEd;

        public Integer getReceivedNumSt(){return this.receivedNumSt;}

        public Integer getReceivedNumEd(){return this.receivedNumEd;}

        private List<String> receivedDateList;

        public List<String> getReceivedDateList(){return this.receivedDateList;}


        private List<String> fuzzyReceivedDate;

        public List<String> getFuzzyReceivedDate(){return this.fuzzyReceivedDate;}

        private List<String> rightFuzzyReceivedDate;

        public List<String> getRightFuzzyReceivedDate(){return this.rightFuzzyReceivedDate;}
        private List<String> paymentTypeList;

        public List<String> getPaymentTypeList(){return this.paymentTypeList;}


        private List<String> fuzzyPaymentType;

        public List<String> getFuzzyPaymentType(){return this.fuzzyPaymentType;}

        private List<String> rightFuzzyPaymentType;

        public List<String> getRightFuzzyPaymentType(){return this.rightFuzzyPaymentType;}
        private List<String> paymentRateList;

        public List<String> getPaymentRateList(){return this.paymentRateList;}


        private List<String> fuzzyPaymentRate;

        public List<String> getFuzzyPaymentRate(){return this.fuzzyPaymentRate;}

        private List<String> rightFuzzyPaymentRate;

        public List<String> getRightFuzzyPaymentRate(){return this.rightFuzzyPaymentRate;}
        private List<String> budgetTypeList;

        public List<String> getBudgetTypeList(){return this.budgetTypeList;}


        private List<String> fuzzyBudgetType;

        public List<String> getFuzzyBudgetType(){return this.fuzzyBudgetType;}

        private List<String> rightFuzzyBudgetType;

        public List<String> getRightFuzzyBudgetType(){return this.rightFuzzyBudgetType;}
        private List<String> budgetSubjectList;

        public List<String> getBudgetSubjectList(){return this.budgetSubjectList;}


        private List<String> fuzzyBudgetSubject;

        public List<String> getFuzzyBudgetSubject(){return this.fuzzyBudgetSubject;}

        private List<String> rightFuzzyBudgetSubject;

        public List<String> getRightFuzzyBudgetSubject(){return this.rightFuzzyBudgetSubject;}
        private List<String> investManagementCodeList;

        public List<String> getInvestManagementCodeList(){return this.investManagementCodeList;}


        private List<String> fuzzyInvestManagementCode;

        public List<String> getFuzzyInvestManagementCode(){return this.fuzzyInvestManagementCode;}

        private List<String> rightFuzzyInvestManagementCode;

        public List<String> getRightFuzzyInvestManagementCode(){return this.rightFuzzyInvestManagementCode;}
        private List<String> researchTestProjectList;

        public List<String> getResearchTestProjectList(){return this.researchTestProjectList;}


        private List<String> fuzzyResearchTestProject;

        public List<String> getFuzzyResearchTestProject(){return this.fuzzyResearchTestProject;}

        private List<String> rightFuzzyResearchTestProject;

        public List<String> getRightFuzzyResearchTestProject(){return this.rightFuzzyResearchTestProject;}
        private List<String> orderBuilderNameList;

        public List<String> getOrderBuilderNameList(){return this.orderBuilderNameList;}


        private List<String> fuzzyOrderBuilderName;

        public List<String> getFuzzyOrderBuilderName(){return this.fuzzyOrderBuilderName;}

        private List<String> rightFuzzyOrderBuilderName;

        public List<String> getRightFuzzyOrderBuilderName(){return this.rightFuzzyOrderBuilderName;}
        private List<String> orderDescriptionList;

        public List<String> getOrderDescriptionList(){return this.orderDescriptionList;}


        private List<String> fuzzyOrderDescription;

        public List<String> getFuzzyOrderDescription(){return this.fuzzyOrderDescription;}

        private List<String> rightFuzzyOrderDescription;

        public List<String> getRightFuzzyOrderDescription(){return this.rightFuzzyOrderDescription;}
        private List<Integer> orderInitialUserIdList;

        public List<Integer> getOrderInitialUserIdList(){return this.orderInitialUserIdList;}

        private Integer orderInitialUserIdSt;

        private Integer orderInitialUserIdEd;

        public Integer getOrderInitialUserIdSt(){return this.orderInitialUserIdSt;}

        public Integer getOrderInitialUserIdEd(){return this.orderInitialUserIdEd;}

        private List<String> orderInitialTimeList;

        public List<String> getOrderInitialTimeList(){return this.orderInitialTimeList;}


        private List<String> fuzzyOrderInitialTime;

        public List<String> getFuzzyOrderInitialTime(){return this.fuzzyOrderInitialTime;}

        private List<String> rightFuzzyOrderInitialTime;

        public List<String> getRightFuzzyOrderInitialTime(){return this.rightFuzzyOrderInitialTime;}
        private List<String> orderInitialStateList;

        public List<String> getOrderInitialStateList(){return this.orderInitialStateList;}


        private List<String> fuzzyOrderInitialState;

        public List<String> getFuzzyOrderInitialState(){return this.fuzzyOrderInitialState;}

        private List<String> rightFuzzyOrderInitialState;

        public List<String> getRightFuzzyOrderInitialState(){return this.rightFuzzyOrderInitialState;}
        private List<String> orderManagementTypeList;

        public List<String> getOrderManagementTypeList(){return this.orderManagementTypeList;}


        private List<String> fuzzyOrderManagementType;

        public List<String> getFuzzyOrderManagementType(){return this.fuzzyOrderManagementType;}

        private List<String> rightFuzzyOrderManagementType;

        public List<String> getRightFuzzyOrderManagementType(){return this.rightFuzzyOrderManagementType;}
        private List<String> orderManagementFormNameList;

        public List<String> getOrderManagementFormNameList(){return this.orderManagementFormNameList;}


        private List<String> fuzzyOrderManagementFormName;

        public List<String> getFuzzyOrderManagementFormName(){return this.fuzzyOrderManagementFormName;}

        private List<String> rightFuzzyOrderManagementFormName;

        public List<String> getRightFuzzyOrderManagementFormName(){return this.rightFuzzyOrderManagementFormName;}
        private List<Integer> orderManagementFormIdList;

        public List<Integer> getOrderManagementFormIdList(){return this.orderManagementFormIdList;}

        private Integer orderManagementFormIdSt;

        private Integer orderManagementFormIdEd;

        public Integer getOrderManagementFormIdSt(){return this.orderManagementFormIdSt;}

        public Integer getOrderManagementFormIdEd(){return this.orderManagementFormIdEd;}

        private List<Long> simpleApplicationObjectIdList;

        public List<Long> getSimpleApplicationObjectIdList(){return this.simpleApplicationObjectIdList;}

        private Long simpleApplicationObjectIdSt;

        private Long simpleApplicationObjectIdEd;

        public Long getSimpleApplicationObjectIdSt(){return this.simpleApplicationObjectIdSt;}

        public Long getSimpleApplicationObjectIdEd(){return this.simpleApplicationObjectIdEd;}

        private List<String> prospectiveArrivalDateList;

        public List<String> getProspectiveArrivalDateList(){return this.prospectiveArrivalDateList;}


        private List<String> fuzzyProspectiveArrivalDate;

        public List<String> getFuzzyProspectiveArrivalDate(){return this.fuzzyProspectiveArrivalDate;}

        private List<String> rightFuzzyProspectiveArrivalDate;

        public List<String> getRightFuzzyProspectiveArrivalDate(){return this.rightFuzzyProspectiveArrivalDate;}
        private List<String> supplierCodeList;

        public List<String> getSupplierCodeList(){return this.supplierCodeList;}


        private List<String> fuzzySupplierCode;

        public List<String> getFuzzySupplierCode(){return this.fuzzySupplierCode;}

        private List<String> rightFuzzySupplierCode;

        public List<String> getRightFuzzySupplierCode(){return this.rightFuzzySupplierCode;}
        private List<String> contractTypeList;

        public List<String> getContractTypeList(){return this.contractTypeList;}


        private List<String> fuzzyContractType;

        public List<String> getFuzzyContractType(){return this.fuzzyContractType;}

        private List<String> rightFuzzyContractType;

        public List<String> getRightFuzzyContractType(){return this.rightFuzzyContractType;}
        private List<String> orderInitialDepartmentList;

        public List<String> getOrderInitialDepartmentList(){return this.orderInitialDepartmentList;}


        private List<String> fuzzyOrderInitialDepartment;

        public List<String> getFuzzyOrderInitialDepartment(){return this.fuzzyOrderInitialDepartment;}

        private List<String> rightFuzzyOrderInitialDepartment;

        public List<String> getRightFuzzyOrderInitialDepartment(){return this.rightFuzzyOrderInitialDepartment;}
        private List<String> orderInitialUserNameList;

        public List<String> getOrderInitialUserNameList(){return this.orderInitialUserNameList;}


        private List<String> fuzzyOrderInitialUserName;

        public List<String> getFuzzyOrderInitialUserName(){return this.fuzzyOrderInitialUserName;}

        private List<String> rightFuzzyOrderInitialUserName;

        public List<String> getRightFuzzyOrderInitialUserName(){return this.rightFuzzyOrderInitialUserName;}
        private List<String> recommendedSupplierNameList;

        public List<String> getRecommendedSupplierNameList(){return this.recommendedSupplierNameList;}


        private List<String> fuzzyRecommendedSupplierName;

        public List<String> getFuzzyRecommendedSupplierName(){return this.fuzzyRecommendedSupplierName;}

        private List<String> rightFuzzyRecommendedSupplierName;

        public List<String> getRightFuzzyRecommendedSupplierName(){return this.rightFuzzyRecommendedSupplierName;}
        private List<String> warehouseSymbolList;

        public List<String> getWarehouseSymbolList(){return this.warehouseSymbolList;}


        private List<String> fuzzyWarehouseSymbol;

        public List<String> getFuzzyWarehouseSymbol(){return this.fuzzyWarehouseSymbol;}

        private List<String> rightFuzzyWarehouseSymbol;

        public List<String> getRightFuzzyWarehouseSymbol(){return this.rightFuzzyWarehouseSymbol;}
        private List<String> costManagementList;

        public List<String> getCostManagementList(){return this.costManagementList;}


        private List<String> fuzzyCostManagement;

        public List<String> getFuzzyCostManagement(){return this.fuzzyCostManagement;}

        private List<String> rightFuzzyCostManagement;

        public List<String> getRightFuzzyCostManagement(){return this.rightFuzzyCostManagement;}
        private List<String> productionLineList;

        public List<String> getProductionLineList(){return this.productionLineList;}


        private List<String> fuzzyProductionLine;

        public List<String> getFuzzyProductionLine(){return this.fuzzyProductionLine;}

        private List<String> rightFuzzyProductionLine;

        public List<String> getRightFuzzyProductionLine(){return this.rightFuzzyProductionLine;}
        private List<String> operationPositionCodeList;

        public List<String> getOperationPositionCodeList(){return this.operationPositionCodeList;}


        private List<String> fuzzyOperationPositionCode;

        public List<String> getFuzzyOperationPositionCode(){return this.fuzzyOperationPositionCode;}

        private List<String> rightFuzzyOperationPositionCode;

        public List<String> getRightFuzzyOperationPositionCode(){return this.rightFuzzyOperationPositionCode;}
        private List<String> equipmentCompanyList;

        public List<String> getEquipmentCompanyList(){return this.equipmentCompanyList;}


        private List<String> fuzzyEquipmentCompany;

        public List<String> getFuzzyEquipmentCompany(){return this.fuzzyEquipmentCompany;}

        private List<String> rightFuzzyEquipmentCompany;

        public List<String> getRightFuzzyEquipmentCompany(){return this.rightFuzzyEquipmentCompany;}
        private List<String> sparePartsBrandList;

        public List<String> getSparePartsBrandList(){return this.sparePartsBrandList;}


        private List<String> fuzzySparePartsBrand;

        public List<String> getFuzzySparePartsBrand(){return this.fuzzySparePartsBrand;}

        private List<String> rightFuzzySparePartsBrand;

        public List<String> getRightFuzzySparePartsBrand(){return this.rightFuzzySparePartsBrand;}
        private List<String> sparePartsOrderDescList;

        public List<String> getSparePartsOrderDescList(){return this.sparePartsOrderDescList;}


        private List<String> fuzzySparePartsOrderDesc;

        public List<String> getFuzzySparePartsOrderDesc(){return this.fuzzySparePartsOrderDesc;}

        private List<String> rightFuzzySparePartsOrderDesc;

        public List<String> getRightFuzzySparePartsOrderDesc(){return this.rightFuzzySparePartsOrderDesc;}
        private List<String> sparePartsEmergencyList;

        public List<String> getSparePartsEmergencyList(){return this.sparePartsEmergencyList;}


        private List<String> fuzzySparePartsEmergency;

        public List<String> getFuzzySparePartsEmergency(){return this.fuzzySparePartsEmergency;}

        private List<String> rightFuzzySparePartsEmergency;

        public List<String> getRightFuzzySparePartsEmergency(){return this.rightFuzzySparePartsEmergency;}
        private List<String> extraOrderReasonList;

        public List<String> getExtraOrderReasonList(){return this.extraOrderReasonList;}


        private List<String> fuzzyExtraOrderReason;

        public List<String> getFuzzyExtraOrderReason(){return this.fuzzyExtraOrderReason;}

        private List<String> rightFuzzyExtraOrderReason;

        public List<String> getRightFuzzyExtraOrderReason(){return this.rightFuzzyExtraOrderReason;}
        private List<String> knifeCodeList;

        public List<String> getKnifeCodeList(){return this.knifeCodeList;}


        private List<String> fuzzyKnifeCode;

        public List<String> getFuzzyKnifeCode(){return this.fuzzyKnifeCode;}

        private List<String> rightFuzzyKnifeCode;

        public List<String> getRightFuzzyKnifeCode(){return this.rightFuzzyKnifeCode;}
        private List<String> importantProjectCodeList;

        public List<String> getImportantProjectCodeList(){return this.importantProjectCodeList;}


        private List<String> fuzzyImportantProjectCode;

        public List<String> getFuzzyImportantProjectCode(){return this.fuzzyImportantProjectCode;}

        private List<String> rightFuzzyImportantProjectCode;

        public List<String> getRightFuzzyImportantProjectCode(){return this.rightFuzzyImportantProjectCode;}
        private List<String> warehousingReasonCodeList;

        public List<String> getWarehousingReasonCodeList(){return this.warehousingReasonCodeList;}


        private List<String> fuzzyWarehousingReasonCode;

        public List<String> getFuzzyWarehousingReasonCode(){return this.fuzzyWarehousingReasonCode;}

        private List<String> rightFuzzyWarehousingReasonCode;

        public List<String> getRightFuzzyWarehousingReasonCode(){return this.rightFuzzyWarehousingReasonCode;}
        private List<String> orderListCodeList;

        public List<String> getOrderListCodeList(){return this.orderListCodeList;}


        private List<String> fuzzyOrderListCode;

        public List<String> getFuzzyOrderListCode(){return this.fuzzyOrderListCode;}

        private List<String> rightFuzzyOrderListCode;

        public List<String> getRightFuzzyOrderListCode(){return this.rightFuzzyOrderListCode;}
        private List<String> variablesList;

        public List<String> getVariablesList(){return this.variablesList;}


        private List<String> fuzzyVariables;

        public List<String> getFuzzyVariables(){return this.fuzzyVariables;}

        private List<String> rightFuzzyVariables;

        public List<String> getRightFuzzyVariables(){return this.rightFuzzyVariables;}
        private List<String> warehouseCodeList;

        public List<String> getWarehouseCodeList(){return this.warehouseCodeList;}


        private List<String> fuzzyWarehouseCode;

        public List<String> getFuzzyWarehouseCode(){return this.fuzzyWarehouseCode;}

        private List<String> rightFuzzyWarehouseCode;

        public List<String> getRightFuzzyWarehouseCode(){return this.rightFuzzyWarehouseCode;}

        public ConditionBuilder orderIdBetWeen(Long orderIdSt,Long orderIdEd){
            this.orderIdSt = orderIdSt;
            this.orderIdEd = orderIdEd;
            return this;
        }

        public ConditionBuilder orderIdGreaterEqThan(Long orderIdSt){
            this.orderIdSt = orderIdSt;
            return this;
        }
        public ConditionBuilder orderIdLessEqThan(Long orderIdEd){
            this.orderIdEd = orderIdEd;
            return this;
        }


        public ConditionBuilder orderIdList(Long ... orderId){
            this.orderIdList = solveNullList(orderId);
            return this;
        }

        public ConditionBuilder orderIdList(List<Long> orderId){
            this.orderIdList = orderId;
            return this;
        }

        public ConditionBuilder fuzzyOrderOperaterUserName (List<String> fuzzyOrderOperaterUserName){
            this.fuzzyOrderOperaterUserName = fuzzyOrderOperaterUserName;
            return this;
        }

        public ConditionBuilder fuzzyOrderOperaterUserName (String ... fuzzyOrderOperaterUserName){
            this.fuzzyOrderOperaterUserName = solveNullList(fuzzyOrderOperaterUserName);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderOperaterUserName (List<String> rightFuzzyOrderOperaterUserName){
            this.rightFuzzyOrderOperaterUserName = rightFuzzyOrderOperaterUserName;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderOperaterUserName (String ... rightFuzzyOrderOperaterUserName){
            this.rightFuzzyOrderOperaterUserName = solveNullList(rightFuzzyOrderOperaterUserName);
            return this;
        }

        public ConditionBuilder orderOperaterUserNameList(String ... orderOperaterUserName){
            this.orderOperaterUserNameList = solveNullList(orderOperaterUserName);
            return this;
        }

        public ConditionBuilder orderOperaterUserNameList(List<String> orderOperaterUserName){
            this.orderOperaterUserNameList = orderOperaterUserName;
            return this;
        }

        public ConditionBuilder fuzzyOrderOperaterTime (List<String> fuzzyOrderOperaterTime){
            this.fuzzyOrderOperaterTime = fuzzyOrderOperaterTime;
            return this;
        }

        public ConditionBuilder fuzzyOrderOperaterTime (String ... fuzzyOrderOperaterTime){
            this.fuzzyOrderOperaterTime = solveNullList(fuzzyOrderOperaterTime);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderOperaterTime (List<String> rightFuzzyOrderOperaterTime){
            this.rightFuzzyOrderOperaterTime = rightFuzzyOrderOperaterTime;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderOperaterTime (String ... rightFuzzyOrderOperaterTime){
            this.rightFuzzyOrderOperaterTime = solveNullList(rightFuzzyOrderOperaterTime);
            return this;
        }

        public ConditionBuilder orderOperaterTimeList(String ... orderOperaterTime){
            this.orderOperaterTimeList = solveNullList(orderOperaterTime);
            return this;
        }

        public ConditionBuilder orderOperaterTimeList(List<String> orderOperaterTime){
            this.orderOperaterTimeList = orderOperaterTime;
            return this;
        }

        public ConditionBuilder fuzzyOrderType (List<String> fuzzyOrderType){
            this.fuzzyOrderType = fuzzyOrderType;
            return this;
        }

        public ConditionBuilder fuzzyOrderType (String ... fuzzyOrderType){
            this.fuzzyOrderType = solveNullList(fuzzyOrderType);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderType (List<String> rightFuzzyOrderType){
            this.rightFuzzyOrderType = rightFuzzyOrderType;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderType (String ... rightFuzzyOrderType){
            this.rightFuzzyOrderType = solveNullList(rightFuzzyOrderType);
            return this;
        }

        public ConditionBuilder orderTypeList(String ... orderType){
            this.orderTypeList = solveNullList(orderType);
            return this;
        }

        public ConditionBuilder orderTypeList(List<String> orderType){
            this.orderTypeList = orderType;
            return this;
        }

        public ConditionBuilder fuzzyFinancialListCode (List<String> fuzzyFinancialListCode){
            this.fuzzyFinancialListCode = fuzzyFinancialListCode;
            return this;
        }

        public ConditionBuilder fuzzyFinancialListCode (String ... fuzzyFinancialListCode){
            this.fuzzyFinancialListCode = solveNullList(fuzzyFinancialListCode);
            return this;
        }

        public ConditionBuilder rightFuzzyFinancialListCode (List<String> rightFuzzyFinancialListCode){
            this.rightFuzzyFinancialListCode = rightFuzzyFinancialListCode;
            return this;
        }

        public ConditionBuilder rightFuzzyFinancialListCode (String ... rightFuzzyFinancialListCode){
            this.rightFuzzyFinancialListCode = solveNullList(rightFuzzyFinancialListCode);
            return this;
        }

        public ConditionBuilder financialListCodeList(String ... financialListCode){
            this.financialListCodeList = solveNullList(financialListCode);
            return this;
        }

        public ConditionBuilder financialListCodeList(List<String> financialListCode){
            this.financialListCodeList = financialListCode;
            return this;
        }

        public ConditionBuilder fuzzyPurchasingListCode (List<String> fuzzyPurchasingListCode){
            this.fuzzyPurchasingListCode = fuzzyPurchasingListCode;
            return this;
        }

        public ConditionBuilder fuzzyPurchasingListCode (String ... fuzzyPurchasingListCode){
            this.fuzzyPurchasingListCode = solveNullList(fuzzyPurchasingListCode);
            return this;
        }

        public ConditionBuilder rightFuzzyPurchasingListCode (List<String> rightFuzzyPurchasingListCode){
            this.rightFuzzyPurchasingListCode = rightFuzzyPurchasingListCode;
            return this;
        }

        public ConditionBuilder rightFuzzyPurchasingListCode (String ... rightFuzzyPurchasingListCode){
            this.rightFuzzyPurchasingListCode = solveNullList(rightFuzzyPurchasingListCode);
            return this;
        }

        public ConditionBuilder purchasingListCodeList(String ... purchasingListCode){
            this.purchasingListCodeList = solveNullList(purchasingListCode);
            return this;
        }

        public ConditionBuilder purchasingListCodeList(List<String> purchasingListCode){
            this.purchasingListCodeList = purchasingListCode;
            return this;
        }

        public ConditionBuilder fuzzyMaterialCode (List<String> fuzzyMaterialCode){
            this.fuzzyMaterialCode = fuzzyMaterialCode;
            return this;
        }

        public ConditionBuilder fuzzyMaterialCode (String ... fuzzyMaterialCode){
            this.fuzzyMaterialCode = solveNullList(fuzzyMaterialCode);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialCode (List<String> rightFuzzyMaterialCode){
            this.rightFuzzyMaterialCode = rightFuzzyMaterialCode;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialCode (String ... rightFuzzyMaterialCode){
            this.rightFuzzyMaterialCode = solveNullList(rightFuzzyMaterialCode);
            return this;
        }

        public ConditionBuilder materialCodeList(String ... materialCode){
            this.materialCodeList = solveNullList(materialCode);
            return this;
        }

        public ConditionBuilder materialCodeList(List<String> materialCode){
            this.materialCodeList = materialCode;
            return this;
        }

        public ConditionBuilder fuzzyMaterialName (List<String> fuzzyMaterialName){
            this.fuzzyMaterialName = fuzzyMaterialName;
            return this;
        }

        public ConditionBuilder fuzzyMaterialName (String ... fuzzyMaterialName){
            this.fuzzyMaterialName = solveNullList(fuzzyMaterialName);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialName (List<String> rightFuzzyMaterialName){
            this.rightFuzzyMaterialName = rightFuzzyMaterialName;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialName (String ... rightFuzzyMaterialName){
            this.rightFuzzyMaterialName = solveNullList(rightFuzzyMaterialName);
            return this;
        }

        public ConditionBuilder materialNameList(String ... materialName){
            this.materialNameList = solveNullList(materialName);
            return this;
        }

        public ConditionBuilder materialNameList(List<String> materialName){
            this.materialNameList = materialName;
            return this;
        }

        public ConditionBuilder fuzzyConfirmMaterialName (List<String> fuzzyConfirmMaterialName){
            this.fuzzyConfirmMaterialName = fuzzyConfirmMaterialName;
            return this;
        }

        public ConditionBuilder fuzzyConfirmMaterialName (String ... fuzzyConfirmMaterialName){
            this.fuzzyConfirmMaterialName = solveNullList(fuzzyConfirmMaterialName);
            return this;
        }

        public ConditionBuilder rightFuzzyConfirmMaterialName (List<String> rightFuzzyConfirmMaterialName){
            this.rightFuzzyConfirmMaterialName = rightFuzzyConfirmMaterialName;
            return this;
        }

        public ConditionBuilder rightFuzzyConfirmMaterialName (String ... rightFuzzyConfirmMaterialName){
            this.rightFuzzyConfirmMaterialName = solveNullList(rightFuzzyConfirmMaterialName);
            return this;
        }

        public ConditionBuilder confirmMaterialNameList(String ... confirmMaterialName){
            this.confirmMaterialNameList = solveNullList(confirmMaterialName);
            return this;
        }

        public ConditionBuilder confirmMaterialNameList(List<String> confirmMaterialName){
            this.confirmMaterialNameList = confirmMaterialName;
            return this;
        }

        public ConditionBuilder fuzzyMaterialSpecs (List<String> fuzzyMaterialSpecs){
            this.fuzzyMaterialSpecs = fuzzyMaterialSpecs;
            return this;
        }

        public ConditionBuilder fuzzyMaterialSpecs (String ... fuzzyMaterialSpecs){
            this.fuzzyMaterialSpecs = solveNullList(fuzzyMaterialSpecs);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialSpecs (List<String> rightFuzzyMaterialSpecs){
            this.rightFuzzyMaterialSpecs = rightFuzzyMaterialSpecs;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialSpecs (String ... rightFuzzyMaterialSpecs){
            this.rightFuzzyMaterialSpecs = solveNullList(rightFuzzyMaterialSpecs);
            return this;
        }

        public ConditionBuilder materialSpecsList(String ... materialSpecs){
            this.materialSpecsList = solveNullList(materialSpecs);
            return this;
        }

        public ConditionBuilder materialSpecsList(List<String> materialSpecs){
            this.materialSpecsList = materialSpecs;
            return this;
        }

        public ConditionBuilder fuzzyConfirmMaterialSpecs (List<String> fuzzyConfirmMaterialSpecs){
            this.fuzzyConfirmMaterialSpecs = fuzzyConfirmMaterialSpecs;
            return this;
        }

        public ConditionBuilder fuzzyConfirmMaterialSpecs (String ... fuzzyConfirmMaterialSpecs){
            this.fuzzyConfirmMaterialSpecs = solveNullList(fuzzyConfirmMaterialSpecs);
            return this;
        }

        public ConditionBuilder rightFuzzyConfirmMaterialSpecs (List<String> rightFuzzyConfirmMaterialSpecs){
            this.rightFuzzyConfirmMaterialSpecs = rightFuzzyConfirmMaterialSpecs;
            return this;
        }

        public ConditionBuilder rightFuzzyConfirmMaterialSpecs (String ... rightFuzzyConfirmMaterialSpecs){
            this.rightFuzzyConfirmMaterialSpecs = solveNullList(rightFuzzyConfirmMaterialSpecs);
            return this;
        }

        public ConditionBuilder confirmMaterialSpecsList(String ... confirmMaterialSpecs){
            this.confirmMaterialSpecsList = solveNullList(confirmMaterialSpecs);
            return this;
        }

        public ConditionBuilder confirmMaterialSpecsList(List<String> confirmMaterialSpecs){
            this.confirmMaterialSpecsList = confirmMaterialSpecs;
            return this;
        }

        public ConditionBuilder fuzzyMaterialBrand (List<String> fuzzyMaterialBrand){
            this.fuzzyMaterialBrand = fuzzyMaterialBrand;
            return this;
        }

        public ConditionBuilder fuzzyMaterialBrand (String ... fuzzyMaterialBrand){
            this.fuzzyMaterialBrand = solveNullList(fuzzyMaterialBrand);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialBrand (List<String> rightFuzzyMaterialBrand){
            this.rightFuzzyMaterialBrand = rightFuzzyMaterialBrand;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialBrand (String ... rightFuzzyMaterialBrand){
            this.rightFuzzyMaterialBrand = solveNullList(rightFuzzyMaterialBrand);
            return this;
        }

        public ConditionBuilder materialBrandList(String ... materialBrand){
            this.materialBrandList = solveNullList(materialBrand);
            return this;
        }

        public ConditionBuilder materialBrandList(List<String> materialBrand){
            this.materialBrandList = materialBrand;
            return this;
        }

        public ConditionBuilder fuzzyConfirmMaterialBrand (List<String> fuzzyConfirmMaterialBrand){
            this.fuzzyConfirmMaterialBrand = fuzzyConfirmMaterialBrand;
            return this;
        }

        public ConditionBuilder fuzzyConfirmMaterialBrand (String ... fuzzyConfirmMaterialBrand){
            this.fuzzyConfirmMaterialBrand = solveNullList(fuzzyConfirmMaterialBrand);
            return this;
        }

        public ConditionBuilder rightFuzzyConfirmMaterialBrand (List<String> rightFuzzyConfirmMaterialBrand){
            this.rightFuzzyConfirmMaterialBrand = rightFuzzyConfirmMaterialBrand;
            return this;
        }

        public ConditionBuilder rightFuzzyConfirmMaterialBrand (String ... rightFuzzyConfirmMaterialBrand){
            this.rightFuzzyConfirmMaterialBrand = solveNullList(rightFuzzyConfirmMaterialBrand);
            return this;
        }

        public ConditionBuilder confirmMaterialBrandList(String ... confirmMaterialBrand){
            this.confirmMaterialBrandList = solveNullList(confirmMaterialBrand);
            return this;
        }

        public ConditionBuilder confirmMaterialBrandList(List<String> confirmMaterialBrand){
            this.confirmMaterialBrandList = confirmMaterialBrand;
            return this;
        }

        public ConditionBuilder fuzzyMaterialUnit (List<String> fuzzyMaterialUnit){
            this.fuzzyMaterialUnit = fuzzyMaterialUnit;
            return this;
        }

        public ConditionBuilder fuzzyMaterialUnit (String ... fuzzyMaterialUnit){
            this.fuzzyMaterialUnit = solveNullList(fuzzyMaterialUnit);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialUnit (List<String> rightFuzzyMaterialUnit){
            this.rightFuzzyMaterialUnit = rightFuzzyMaterialUnit;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialUnit (String ... rightFuzzyMaterialUnit){
            this.rightFuzzyMaterialUnit = solveNullList(rightFuzzyMaterialUnit);
            return this;
        }

        public ConditionBuilder materialUnitList(String ... materialUnit){
            this.materialUnitList = solveNullList(materialUnit);
            return this;
        }

        public ConditionBuilder materialUnitList(List<String> materialUnit){
            this.materialUnitList = materialUnit;
            return this;
        }

        public ConditionBuilder orderMaterialNumBetWeen(Integer orderMaterialNumSt,Integer orderMaterialNumEd){
            this.orderMaterialNumSt = orderMaterialNumSt;
            this.orderMaterialNumEd = orderMaterialNumEd;
            return this;
        }

        public ConditionBuilder orderMaterialNumGreaterEqThan(Integer orderMaterialNumSt){
            this.orderMaterialNumSt = orderMaterialNumSt;
            return this;
        }
        public ConditionBuilder orderMaterialNumLessEqThan(Integer orderMaterialNumEd){
            this.orderMaterialNumEd = orderMaterialNumEd;
            return this;
        }


        public ConditionBuilder orderMaterialNumList(Integer ... orderMaterialNum){
            this.orderMaterialNumList = solveNullList(orderMaterialNum);
            return this;
        }

        public ConditionBuilder orderMaterialNumList(List<Integer> orderMaterialNum){
            this.orderMaterialNumList = orderMaterialNum;
            return this;
        }

        public ConditionBuilder fuzzyFinancialCenterCode (List<String> fuzzyFinancialCenterCode){
            this.fuzzyFinancialCenterCode = fuzzyFinancialCenterCode;
            return this;
        }

        public ConditionBuilder fuzzyFinancialCenterCode (String ... fuzzyFinancialCenterCode){
            this.fuzzyFinancialCenterCode = solveNullList(fuzzyFinancialCenterCode);
            return this;
        }

        public ConditionBuilder rightFuzzyFinancialCenterCode (List<String> rightFuzzyFinancialCenterCode){
            this.rightFuzzyFinancialCenterCode = rightFuzzyFinancialCenterCode;
            return this;
        }

        public ConditionBuilder rightFuzzyFinancialCenterCode (String ... rightFuzzyFinancialCenterCode){
            this.rightFuzzyFinancialCenterCode = solveNullList(rightFuzzyFinancialCenterCode);
            return this;
        }

        public ConditionBuilder financialCenterCodeList(String ... financialCenterCode){
            this.financialCenterCodeList = solveNullList(financialCenterCode);
            return this;
        }

        public ConditionBuilder financialCenterCodeList(List<String> financialCenterCode){
            this.financialCenterCodeList = financialCenterCode;
            return this;
        }

        public ConditionBuilder fuzzyOrderBuyer (List<String> fuzzyOrderBuyer){
            this.fuzzyOrderBuyer = fuzzyOrderBuyer;
            return this;
        }

        public ConditionBuilder fuzzyOrderBuyer (String ... fuzzyOrderBuyer){
            this.fuzzyOrderBuyer = solveNullList(fuzzyOrderBuyer);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderBuyer (List<String> rightFuzzyOrderBuyer){
            this.rightFuzzyOrderBuyer = rightFuzzyOrderBuyer;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderBuyer (String ... rightFuzzyOrderBuyer){
            this.rightFuzzyOrderBuyer = solveNullList(rightFuzzyOrderBuyer);
            return this;
        }

        public ConditionBuilder orderBuyerList(String ... orderBuyer){
            this.orderBuyerList = solveNullList(orderBuyer);
            return this;
        }

        public ConditionBuilder orderBuyerList(List<String> orderBuyer){
            this.orderBuyerList = orderBuyer;
            return this;
        }

        public ConditionBuilder fuzzySupplierName (List<String> fuzzySupplierName){
            this.fuzzySupplierName = fuzzySupplierName;
            return this;
        }

        public ConditionBuilder fuzzySupplierName (String ... fuzzySupplierName){
            this.fuzzySupplierName = solveNullList(fuzzySupplierName);
            return this;
        }

        public ConditionBuilder rightFuzzySupplierName (List<String> rightFuzzySupplierName){
            this.rightFuzzySupplierName = rightFuzzySupplierName;
            return this;
        }

        public ConditionBuilder rightFuzzySupplierName (String ... rightFuzzySupplierName){
            this.rightFuzzySupplierName = solveNullList(rightFuzzySupplierName);
            return this;
        }

        public ConditionBuilder supplierNameList(String ... supplierName){
            this.supplierNameList = solveNullList(supplierName);
            return this;
        }

        public ConditionBuilder supplierNameList(List<String> supplierName){
            this.supplierNameList = supplierName;
            return this;
        }

        public ConditionBuilder fuzzyOrderState (List<String> fuzzyOrderState){
            this.fuzzyOrderState = fuzzyOrderState;
            return this;
        }

        public ConditionBuilder fuzzyOrderState (String ... fuzzyOrderState){
            this.fuzzyOrderState = solveNullList(fuzzyOrderState);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderState (List<String> rightFuzzyOrderState){
            this.rightFuzzyOrderState = rightFuzzyOrderState;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderState (String ... rightFuzzyOrderState){
            this.rightFuzzyOrderState = solveNullList(rightFuzzyOrderState);
            return this;
        }

        public ConditionBuilder orderStateList(String ... orderState){
            this.orderStateList = solveNullList(orderState);
            return this;
        }

        public ConditionBuilder orderStateList(List<String> orderState){
            this.orderStateList = orderState;
            return this;
        }

        public ConditionBuilder fuzzyOrderBuyerCheckDate (List<String> fuzzyOrderBuyerCheckDate){
            this.fuzzyOrderBuyerCheckDate = fuzzyOrderBuyerCheckDate;
            return this;
        }

        public ConditionBuilder fuzzyOrderBuyerCheckDate (String ... fuzzyOrderBuyerCheckDate){
            this.fuzzyOrderBuyerCheckDate = solveNullList(fuzzyOrderBuyerCheckDate);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderBuyerCheckDate (List<String> rightFuzzyOrderBuyerCheckDate){
            this.rightFuzzyOrderBuyerCheckDate = rightFuzzyOrderBuyerCheckDate;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderBuyerCheckDate (String ... rightFuzzyOrderBuyerCheckDate){
            this.rightFuzzyOrderBuyerCheckDate = solveNullList(rightFuzzyOrderBuyerCheckDate);
            return this;
        }

        public ConditionBuilder orderBuyerCheckDateList(String ... orderBuyerCheckDate){
            this.orderBuyerCheckDateList = solveNullList(orderBuyerCheckDate);
            return this;
        }

        public ConditionBuilder orderBuyerCheckDateList(List<String> orderBuyerCheckDate){
            this.orderBuyerCheckDateList = orderBuyerCheckDate;
            return this;
        }

        public ConditionBuilder fuzzyOrderPriceCheckDate (List<String> fuzzyOrderPriceCheckDate){
            this.fuzzyOrderPriceCheckDate = fuzzyOrderPriceCheckDate;
            return this;
        }

        public ConditionBuilder fuzzyOrderPriceCheckDate (String ... fuzzyOrderPriceCheckDate){
            this.fuzzyOrderPriceCheckDate = solveNullList(fuzzyOrderPriceCheckDate);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderPriceCheckDate (List<String> rightFuzzyOrderPriceCheckDate){
            this.rightFuzzyOrderPriceCheckDate = rightFuzzyOrderPriceCheckDate;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderPriceCheckDate (String ... rightFuzzyOrderPriceCheckDate){
            this.rightFuzzyOrderPriceCheckDate = solveNullList(rightFuzzyOrderPriceCheckDate);
            return this;
        }

        public ConditionBuilder orderPriceCheckDateList(String ... orderPriceCheckDate){
            this.orderPriceCheckDateList = solveNullList(orderPriceCheckDate);
            return this;
        }

        public ConditionBuilder orderPriceCheckDateList(List<String> orderPriceCheckDate){
            this.orderPriceCheckDateList = orderPriceCheckDate;
            return this;
        }

        public ConditionBuilder fuzzyPurchasingOrderCode (List<String> fuzzyPurchasingOrderCode){
            this.fuzzyPurchasingOrderCode = fuzzyPurchasingOrderCode;
            return this;
        }

        public ConditionBuilder fuzzyPurchasingOrderCode (String ... fuzzyPurchasingOrderCode){
            this.fuzzyPurchasingOrderCode = solveNullList(fuzzyPurchasingOrderCode);
            return this;
        }

        public ConditionBuilder rightFuzzyPurchasingOrderCode (List<String> rightFuzzyPurchasingOrderCode){
            this.rightFuzzyPurchasingOrderCode = rightFuzzyPurchasingOrderCode;
            return this;
        }

        public ConditionBuilder rightFuzzyPurchasingOrderCode (String ... rightFuzzyPurchasingOrderCode){
            this.rightFuzzyPurchasingOrderCode = solveNullList(rightFuzzyPurchasingOrderCode);
            return this;
        }

        public ConditionBuilder purchasingOrderCodeList(String ... purchasingOrderCode){
            this.purchasingOrderCodeList = solveNullList(purchasingOrderCode);
            return this;
        }

        public ConditionBuilder purchasingOrderCodeList(List<String> purchasingOrderCode){
            this.purchasingOrderCodeList = purchasingOrderCode;
            return this;
        }

        public ConditionBuilder fuzzyArrivalDate (List<String> fuzzyArrivalDate){
            this.fuzzyArrivalDate = fuzzyArrivalDate;
            return this;
        }

        public ConditionBuilder fuzzyArrivalDate (String ... fuzzyArrivalDate){
            this.fuzzyArrivalDate = solveNullList(fuzzyArrivalDate);
            return this;
        }

        public ConditionBuilder rightFuzzyArrivalDate (List<String> rightFuzzyArrivalDate){
            this.rightFuzzyArrivalDate = rightFuzzyArrivalDate;
            return this;
        }

        public ConditionBuilder rightFuzzyArrivalDate (String ... rightFuzzyArrivalDate){
            this.rightFuzzyArrivalDate = solveNullList(rightFuzzyArrivalDate);
            return this;
        }

        public ConditionBuilder arrivalDateList(String ... arrivalDate){
            this.arrivalDateList = solveNullList(arrivalDate);
            return this;
        }

        public ConditionBuilder arrivalDateList(List<String> arrivalDate){
            this.arrivalDateList = arrivalDate;
            return this;
        }

        public ConditionBuilder receivedNumBetWeen(Integer receivedNumSt,Integer receivedNumEd){
            this.receivedNumSt = receivedNumSt;
            this.receivedNumEd = receivedNumEd;
            return this;
        }

        public ConditionBuilder receivedNumGreaterEqThan(Integer receivedNumSt){
            this.receivedNumSt = receivedNumSt;
            return this;
        }
        public ConditionBuilder receivedNumLessEqThan(Integer receivedNumEd){
            this.receivedNumEd = receivedNumEd;
            return this;
        }


        public ConditionBuilder receivedNumList(Integer ... receivedNum){
            this.receivedNumList = solveNullList(receivedNum);
            return this;
        }

        public ConditionBuilder receivedNumList(List<Integer> receivedNum){
            this.receivedNumList = receivedNum;
            return this;
        }

        public ConditionBuilder fuzzyReceivedDate (List<String> fuzzyReceivedDate){
            this.fuzzyReceivedDate = fuzzyReceivedDate;
            return this;
        }

        public ConditionBuilder fuzzyReceivedDate (String ... fuzzyReceivedDate){
            this.fuzzyReceivedDate = solveNullList(fuzzyReceivedDate);
            return this;
        }

        public ConditionBuilder rightFuzzyReceivedDate (List<String> rightFuzzyReceivedDate){
            this.rightFuzzyReceivedDate = rightFuzzyReceivedDate;
            return this;
        }

        public ConditionBuilder rightFuzzyReceivedDate (String ... rightFuzzyReceivedDate){
            this.rightFuzzyReceivedDate = solveNullList(rightFuzzyReceivedDate);
            return this;
        }

        public ConditionBuilder receivedDateList(String ... receivedDate){
            this.receivedDateList = solveNullList(receivedDate);
            return this;
        }

        public ConditionBuilder receivedDateList(List<String> receivedDate){
            this.receivedDateList = receivedDate;
            return this;
        }

        public ConditionBuilder fuzzyPaymentType (List<String> fuzzyPaymentType){
            this.fuzzyPaymentType = fuzzyPaymentType;
            return this;
        }

        public ConditionBuilder fuzzyPaymentType (String ... fuzzyPaymentType){
            this.fuzzyPaymentType = solveNullList(fuzzyPaymentType);
            return this;
        }

        public ConditionBuilder rightFuzzyPaymentType (List<String> rightFuzzyPaymentType){
            this.rightFuzzyPaymentType = rightFuzzyPaymentType;
            return this;
        }

        public ConditionBuilder rightFuzzyPaymentType (String ... rightFuzzyPaymentType){
            this.rightFuzzyPaymentType = solveNullList(rightFuzzyPaymentType);
            return this;
        }

        public ConditionBuilder paymentTypeList(String ... paymentType){
            this.paymentTypeList = solveNullList(paymentType);
            return this;
        }

        public ConditionBuilder paymentTypeList(List<String> paymentType){
            this.paymentTypeList = paymentType;
            return this;
        }

        public ConditionBuilder fuzzyPaymentRate (List<String> fuzzyPaymentRate){
            this.fuzzyPaymentRate = fuzzyPaymentRate;
            return this;
        }

        public ConditionBuilder fuzzyPaymentRate (String ... fuzzyPaymentRate){
            this.fuzzyPaymentRate = solveNullList(fuzzyPaymentRate);
            return this;
        }

        public ConditionBuilder rightFuzzyPaymentRate (List<String> rightFuzzyPaymentRate){
            this.rightFuzzyPaymentRate = rightFuzzyPaymentRate;
            return this;
        }

        public ConditionBuilder rightFuzzyPaymentRate (String ... rightFuzzyPaymentRate){
            this.rightFuzzyPaymentRate = solveNullList(rightFuzzyPaymentRate);
            return this;
        }

        public ConditionBuilder paymentRateList(String ... paymentRate){
            this.paymentRateList = solveNullList(paymentRate);
            return this;
        }

        public ConditionBuilder paymentRateList(List<String> paymentRate){
            this.paymentRateList = paymentRate;
            return this;
        }

        public ConditionBuilder fuzzyBudgetType (List<String> fuzzyBudgetType){
            this.fuzzyBudgetType = fuzzyBudgetType;
            return this;
        }

        public ConditionBuilder fuzzyBudgetType (String ... fuzzyBudgetType){
            this.fuzzyBudgetType = solveNullList(fuzzyBudgetType);
            return this;
        }

        public ConditionBuilder rightFuzzyBudgetType (List<String> rightFuzzyBudgetType){
            this.rightFuzzyBudgetType = rightFuzzyBudgetType;
            return this;
        }

        public ConditionBuilder rightFuzzyBudgetType (String ... rightFuzzyBudgetType){
            this.rightFuzzyBudgetType = solveNullList(rightFuzzyBudgetType);
            return this;
        }

        public ConditionBuilder budgetTypeList(String ... budgetType){
            this.budgetTypeList = solveNullList(budgetType);
            return this;
        }

        public ConditionBuilder budgetTypeList(List<String> budgetType){
            this.budgetTypeList = budgetType;
            return this;
        }

        public ConditionBuilder fuzzyBudgetSubject (List<String> fuzzyBudgetSubject){
            this.fuzzyBudgetSubject = fuzzyBudgetSubject;
            return this;
        }

        public ConditionBuilder fuzzyBudgetSubject (String ... fuzzyBudgetSubject){
            this.fuzzyBudgetSubject = solveNullList(fuzzyBudgetSubject);
            return this;
        }

        public ConditionBuilder rightFuzzyBudgetSubject (List<String> rightFuzzyBudgetSubject){
            this.rightFuzzyBudgetSubject = rightFuzzyBudgetSubject;
            return this;
        }

        public ConditionBuilder rightFuzzyBudgetSubject (String ... rightFuzzyBudgetSubject){
            this.rightFuzzyBudgetSubject = solveNullList(rightFuzzyBudgetSubject);
            return this;
        }

        public ConditionBuilder budgetSubjectList(String ... budgetSubject){
            this.budgetSubjectList = solveNullList(budgetSubject);
            return this;
        }

        public ConditionBuilder budgetSubjectList(List<String> budgetSubject){
            this.budgetSubjectList = budgetSubject;
            return this;
        }

        public ConditionBuilder fuzzyInvestManagementCode (List<String> fuzzyInvestManagementCode){
            this.fuzzyInvestManagementCode = fuzzyInvestManagementCode;
            return this;
        }

        public ConditionBuilder fuzzyInvestManagementCode (String ... fuzzyInvestManagementCode){
            this.fuzzyInvestManagementCode = solveNullList(fuzzyInvestManagementCode);
            return this;
        }

        public ConditionBuilder rightFuzzyInvestManagementCode (List<String> rightFuzzyInvestManagementCode){
            this.rightFuzzyInvestManagementCode = rightFuzzyInvestManagementCode;
            return this;
        }

        public ConditionBuilder rightFuzzyInvestManagementCode (String ... rightFuzzyInvestManagementCode){
            this.rightFuzzyInvestManagementCode = solveNullList(rightFuzzyInvestManagementCode);
            return this;
        }

        public ConditionBuilder investManagementCodeList(String ... investManagementCode){
            this.investManagementCodeList = solveNullList(investManagementCode);
            return this;
        }

        public ConditionBuilder investManagementCodeList(List<String> investManagementCode){
            this.investManagementCodeList = investManagementCode;
            return this;
        }

        public ConditionBuilder fuzzyResearchTestProject (List<String> fuzzyResearchTestProject){
            this.fuzzyResearchTestProject = fuzzyResearchTestProject;
            return this;
        }

        public ConditionBuilder fuzzyResearchTestProject (String ... fuzzyResearchTestProject){
            this.fuzzyResearchTestProject = solveNullList(fuzzyResearchTestProject);
            return this;
        }

        public ConditionBuilder rightFuzzyResearchTestProject (List<String> rightFuzzyResearchTestProject){
            this.rightFuzzyResearchTestProject = rightFuzzyResearchTestProject;
            return this;
        }

        public ConditionBuilder rightFuzzyResearchTestProject (String ... rightFuzzyResearchTestProject){
            this.rightFuzzyResearchTestProject = solveNullList(rightFuzzyResearchTestProject);
            return this;
        }

        public ConditionBuilder researchTestProjectList(String ... researchTestProject){
            this.researchTestProjectList = solveNullList(researchTestProject);
            return this;
        }

        public ConditionBuilder researchTestProjectList(List<String> researchTestProject){
            this.researchTestProjectList = researchTestProject;
            return this;
        }

        public ConditionBuilder fuzzyOrderBuilderName (List<String> fuzzyOrderBuilderName){
            this.fuzzyOrderBuilderName = fuzzyOrderBuilderName;
            return this;
        }

        public ConditionBuilder fuzzyOrderBuilderName (String ... fuzzyOrderBuilderName){
            this.fuzzyOrderBuilderName = solveNullList(fuzzyOrderBuilderName);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderBuilderName (List<String> rightFuzzyOrderBuilderName){
            this.rightFuzzyOrderBuilderName = rightFuzzyOrderBuilderName;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderBuilderName (String ... rightFuzzyOrderBuilderName){
            this.rightFuzzyOrderBuilderName = solveNullList(rightFuzzyOrderBuilderName);
            return this;
        }

        public ConditionBuilder orderBuilderNameList(String ... orderBuilderName){
            this.orderBuilderNameList = solveNullList(orderBuilderName);
            return this;
        }

        public ConditionBuilder orderBuilderNameList(List<String> orderBuilderName){
            this.orderBuilderNameList = orderBuilderName;
            return this;
        }

        public ConditionBuilder fuzzyOrderDescription (List<String> fuzzyOrderDescription){
            this.fuzzyOrderDescription = fuzzyOrderDescription;
            return this;
        }

        public ConditionBuilder fuzzyOrderDescription (String ... fuzzyOrderDescription){
            this.fuzzyOrderDescription = solveNullList(fuzzyOrderDescription);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderDescription (List<String> rightFuzzyOrderDescription){
            this.rightFuzzyOrderDescription = rightFuzzyOrderDescription;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderDescription (String ... rightFuzzyOrderDescription){
            this.rightFuzzyOrderDescription = solveNullList(rightFuzzyOrderDescription);
            return this;
        }

        public ConditionBuilder orderDescriptionList(String ... orderDescription){
            this.orderDescriptionList = solveNullList(orderDescription);
            return this;
        }

        public ConditionBuilder orderDescriptionList(List<String> orderDescription){
            this.orderDescriptionList = orderDescription;
            return this;
        }

        public ConditionBuilder orderInitialUserIdBetWeen(Integer orderInitialUserIdSt,Integer orderInitialUserIdEd){
            this.orderInitialUserIdSt = orderInitialUserIdSt;
            this.orderInitialUserIdEd = orderInitialUserIdEd;
            return this;
        }

        public ConditionBuilder orderInitialUserIdGreaterEqThan(Integer orderInitialUserIdSt){
            this.orderInitialUserIdSt = orderInitialUserIdSt;
            return this;
        }
        public ConditionBuilder orderInitialUserIdLessEqThan(Integer orderInitialUserIdEd){
            this.orderInitialUserIdEd = orderInitialUserIdEd;
            return this;
        }


        public ConditionBuilder orderInitialUserIdList(Integer ... orderInitialUserId){
            this.orderInitialUserIdList = solveNullList(orderInitialUserId);
            return this;
        }

        public ConditionBuilder orderInitialUserIdList(List<Integer> orderInitialUserId){
            this.orderInitialUserIdList = orderInitialUserId;
            return this;
        }

        public ConditionBuilder fuzzyOrderInitialTime (List<String> fuzzyOrderInitialTime){
            this.fuzzyOrderInitialTime = fuzzyOrderInitialTime;
            return this;
        }

        public ConditionBuilder fuzzyOrderInitialTime (String ... fuzzyOrderInitialTime){
            this.fuzzyOrderInitialTime = solveNullList(fuzzyOrderInitialTime);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderInitialTime (List<String> rightFuzzyOrderInitialTime){
            this.rightFuzzyOrderInitialTime = rightFuzzyOrderInitialTime;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderInitialTime (String ... rightFuzzyOrderInitialTime){
            this.rightFuzzyOrderInitialTime = solveNullList(rightFuzzyOrderInitialTime);
            return this;
        }

        public ConditionBuilder orderInitialTimeList(String ... orderInitialTime){
            this.orderInitialTimeList = solveNullList(orderInitialTime);
            return this;
        }

        public ConditionBuilder orderInitialTimeList(List<String> orderInitialTime){
            this.orderInitialTimeList = orderInitialTime;
            return this;
        }

        public ConditionBuilder fuzzyOrderInitialState (List<String> fuzzyOrderInitialState){
            this.fuzzyOrderInitialState = fuzzyOrderInitialState;
            return this;
        }

        public ConditionBuilder fuzzyOrderInitialState (String ... fuzzyOrderInitialState){
            this.fuzzyOrderInitialState = solveNullList(fuzzyOrderInitialState);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderInitialState (List<String> rightFuzzyOrderInitialState){
            this.rightFuzzyOrderInitialState = rightFuzzyOrderInitialState;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderInitialState (String ... rightFuzzyOrderInitialState){
            this.rightFuzzyOrderInitialState = solveNullList(rightFuzzyOrderInitialState);
            return this;
        }

        public ConditionBuilder orderInitialStateList(String ... orderInitialState){
            this.orderInitialStateList = solveNullList(orderInitialState);
            return this;
        }

        public ConditionBuilder orderInitialStateList(List<String> orderInitialState){
            this.orderInitialStateList = orderInitialState;
            return this;
        }

        public ConditionBuilder fuzzyOrderManagementType (List<String> fuzzyOrderManagementType){
            this.fuzzyOrderManagementType = fuzzyOrderManagementType;
            return this;
        }

        public ConditionBuilder fuzzyOrderManagementType (String ... fuzzyOrderManagementType){
            this.fuzzyOrderManagementType = solveNullList(fuzzyOrderManagementType);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderManagementType (List<String> rightFuzzyOrderManagementType){
            this.rightFuzzyOrderManagementType = rightFuzzyOrderManagementType;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderManagementType (String ... rightFuzzyOrderManagementType){
            this.rightFuzzyOrderManagementType = solveNullList(rightFuzzyOrderManagementType);
            return this;
        }

        public ConditionBuilder orderManagementTypeList(String ... orderManagementType){
            this.orderManagementTypeList = solveNullList(orderManagementType);
            return this;
        }

        public ConditionBuilder orderManagementTypeList(List<String> orderManagementType){
            this.orderManagementTypeList = orderManagementType;
            return this;
        }

        public ConditionBuilder fuzzyOrderManagementFormName (List<String> fuzzyOrderManagementFormName){
            this.fuzzyOrderManagementFormName = fuzzyOrderManagementFormName;
            return this;
        }

        public ConditionBuilder fuzzyOrderManagementFormName (String ... fuzzyOrderManagementFormName){
            this.fuzzyOrderManagementFormName = solveNullList(fuzzyOrderManagementFormName);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderManagementFormName (List<String> rightFuzzyOrderManagementFormName){
            this.rightFuzzyOrderManagementFormName = rightFuzzyOrderManagementFormName;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderManagementFormName (String ... rightFuzzyOrderManagementFormName){
            this.rightFuzzyOrderManagementFormName = solveNullList(rightFuzzyOrderManagementFormName);
            return this;
        }

        public ConditionBuilder orderManagementFormNameList(String ... orderManagementFormName){
            this.orderManagementFormNameList = solveNullList(orderManagementFormName);
            return this;
        }

        public ConditionBuilder orderManagementFormNameList(List<String> orderManagementFormName){
            this.orderManagementFormNameList = orderManagementFormName;
            return this;
        }

        public ConditionBuilder orderManagementFormIdBetWeen(Integer orderManagementFormIdSt,Integer orderManagementFormIdEd){
            this.orderManagementFormIdSt = orderManagementFormIdSt;
            this.orderManagementFormIdEd = orderManagementFormIdEd;
            return this;
        }

        public ConditionBuilder orderManagementFormIdGreaterEqThan(Integer orderManagementFormIdSt){
            this.orderManagementFormIdSt = orderManagementFormIdSt;
            return this;
        }
        public ConditionBuilder orderManagementFormIdLessEqThan(Integer orderManagementFormIdEd){
            this.orderManagementFormIdEd = orderManagementFormIdEd;
            return this;
        }


        public ConditionBuilder orderManagementFormIdList(Integer ... orderManagementFormId){
            this.orderManagementFormIdList = solveNullList(orderManagementFormId);
            return this;
        }

        public ConditionBuilder orderManagementFormIdList(List<Integer> orderManagementFormId){
            this.orderManagementFormIdList = orderManagementFormId;
            return this;
        }

        public ConditionBuilder simpleApplicationObjectIdBetWeen(Long simpleApplicationObjectIdSt,Long simpleApplicationObjectIdEd){
            this.simpleApplicationObjectIdSt = simpleApplicationObjectIdSt;
            this.simpleApplicationObjectIdEd = simpleApplicationObjectIdEd;
            return this;
        }

        public ConditionBuilder simpleApplicationObjectIdGreaterEqThan(Long simpleApplicationObjectIdSt){
            this.simpleApplicationObjectIdSt = simpleApplicationObjectIdSt;
            return this;
        }
        public ConditionBuilder simpleApplicationObjectIdLessEqThan(Long simpleApplicationObjectIdEd){
            this.simpleApplicationObjectIdEd = simpleApplicationObjectIdEd;
            return this;
        }


        public ConditionBuilder simpleApplicationObjectIdList(Long ... simpleApplicationObjectId){
            this.simpleApplicationObjectIdList = solveNullList(simpleApplicationObjectId);
            return this;
        }

        public ConditionBuilder simpleApplicationObjectIdList(List<Long> simpleApplicationObjectId){
            this.simpleApplicationObjectIdList = simpleApplicationObjectId;
            return this;
        }

        public ConditionBuilder fuzzyProspectiveArrivalDate (List<String> fuzzyProspectiveArrivalDate){
            this.fuzzyProspectiveArrivalDate = fuzzyProspectiveArrivalDate;
            return this;
        }

        public ConditionBuilder fuzzyProspectiveArrivalDate (String ... fuzzyProspectiveArrivalDate){
            this.fuzzyProspectiveArrivalDate = solveNullList(fuzzyProspectiveArrivalDate);
            return this;
        }

        public ConditionBuilder rightFuzzyProspectiveArrivalDate (List<String> rightFuzzyProspectiveArrivalDate){
            this.rightFuzzyProspectiveArrivalDate = rightFuzzyProspectiveArrivalDate;
            return this;
        }

        public ConditionBuilder rightFuzzyProspectiveArrivalDate (String ... rightFuzzyProspectiveArrivalDate){
            this.rightFuzzyProspectiveArrivalDate = solveNullList(rightFuzzyProspectiveArrivalDate);
            return this;
        }

        public ConditionBuilder prospectiveArrivalDateList(String ... prospectiveArrivalDate){
            this.prospectiveArrivalDateList = solveNullList(prospectiveArrivalDate);
            return this;
        }

        public ConditionBuilder prospectiveArrivalDateList(List<String> prospectiveArrivalDate){
            this.prospectiveArrivalDateList = prospectiveArrivalDate;
            return this;
        }

        public ConditionBuilder fuzzySupplierCode (List<String> fuzzySupplierCode){
            this.fuzzySupplierCode = fuzzySupplierCode;
            return this;
        }

        public ConditionBuilder fuzzySupplierCode (String ... fuzzySupplierCode){
            this.fuzzySupplierCode = solveNullList(fuzzySupplierCode);
            return this;
        }

        public ConditionBuilder rightFuzzySupplierCode (List<String> rightFuzzySupplierCode){
            this.rightFuzzySupplierCode = rightFuzzySupplierCode;
            return this;
        }

        public ConditionBuilder rightFuzzySupplierCode (String ... rightFuzzySupplierCode){
            this.rightFuzzySupplierCode = solveNullList(rightFuzzySupplierCode);
            return this;
        }

        public ConditionBuilder supplierCodeList(String ... supplierCode){
            this.supplierCodeList = solveNullList(supplierCode);
            return this;
        }

        public ConditionBuilder supplierCodeList(List<String> supplierCode){
            this.supplierCodeList = supplierCode;
            return this;
        }

        public ConditionBuilder fuzzyContractType (List<String> fuzzyContractType){
            this.fuzzyContractType = fuzzyContractType;
            return this;
        }

        public ConditionBuilder fuzzyContractType (String ... fuzzyContractType){
            this.fuzzyContractType = solveNullList(fuzzyContractType);
            return this;
        }

        public ConditionBuilder rightFuzzyContractType (List<String> rightFuzzyContractType){
            this.rightFuzzyContractType = rightFuzzyContractType;
            return this;
        }

        public ConditionBuilder rightFuzzyContractType (String ... rightFuzzyContractType){
            this.rightFuzzyContractType = solveNullList(rightFuzzyContractType);
            return this;
        }

        public ConditionBuilder contractTypeList(String ... contractType){
            this.contractTypeList = solveNullList(contractType);
            return this;
        }

        public ConditionBuilder contractTypeList(List<String> contractType){
            this.contractTypeList = contractType;
            return this;
        }

        public ConditionBuilder fuzzyOrderInitialDepartment (List<String> fuzzyOrderInitialDepartment){
            this.fuzzyOrderInitialDepartment = fuzzyOrderInitialDepartment;
            return this;
        }

        public ConditionBuilder fuzzyOrderInitialDepartment (String ... fuzzyOrderInitialDepartment){
            this.fuzzyOrderInitialDepartment = solveNullList(fuzzyOrderInitialDepartment);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderInitialDepartment (List<String> rightFuzzyOrderInitialDepartment){
            this.rightFuzzyOrderInitialDepartment = rightFuzzyOrderInitialDepartment;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderInitialDepartment (String ... rightFuzzyOrderInitialDepartment){
            this.rightFuzzyOrderInitialDepartment = solveNullList(rightFuzzyOrderInitialDepartment);
            return this;
        }

        public ConditionBuilder orderInitialDepartmentList(String ... orderInitialDepartment){
            this.orderInitialDepartmentList = solveNullList(orderInitialDepartment);
            return this;
        }

        public ConditionBuilder orderInitialDepartmentList(List<String> orderInitialDepartment){
            this.orderInitialDepartmentList = orderInitialDepartment;
            return this;
        }

        public ConditionBuilder fuzzyOrderInitialUserName (List<String> fuzzyOrderInitialUserName){
            this.fuzzyOrderInitialUserName = fuzzyOrderInitialUserName;
            return this;
        }

        public ConditionBuilder fuzzyOrderInitialUserName (String ... fuzzyOrderInitialUserName){
            this.fuzzyOrderInitialUserName = solveNullList(fuzzyOrderInitialUserName);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderInitialUserName (List<String> rightFuzzyOrderInitialUserName){
            this.rightFuzzyOrderInitialUserName = rightFuzzyOrderInitialUserName;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderInitialUserName (String ... rightFuzzyOrderInitialUserName){
            this.rightFuzzyOrderInitialUserName = solveNullList(rightFuzzyOrderInitialUserName);
            return this;
        }

        public ConditionBuilder orderInitialUserNameList(String ... orderInitialUserName){
            this.orderInitialUserNameList = solveNullList(orderInitialUserName);
            return this;
        }

        public ConditionBuilder orderInitialUserNameList(List<String> orderInitialUserName){
            this.orderInitialUserNameList = orderInitialUserName;
            return this;
        }

        public ConditionBuilder fuzzyRecommendedSupplierName (List<String> fuzzyRecommendedSupplierName){
            this.fuzzyRecommendedSupplierName = fuzzyRecommendedSupplierName;
            return this;
        }

        public ConditionBuilder fuzzyRecommendedSupplierName (String ... fuzzyRecommendedSupplierName){
            this.fuzzyRecommendedSupplierName = solveNullList(fuzzyRecommendedSupplierName);
            return this;
        }

        public ConditionBuilder rightFuzzyRecommendedSupplierName (List<String> rightFuzzyRecommendedSupplierName){
            this.rightFuzzyRecommendedSupplierName = rightFuzzyRecommendedSupplierName;
            return this;
        }

        public ConditionBuilder rightFuzzyRecommendedSupplierName (String ... rightFuzzyRecommendedSupplierName){
            this.rightFuzzyRecommendedSupplierName = solveNullList(rightFuzzyRecommendedSupplierName);
            return this;
        }

        public ConditionBuilder recommendedSupplierNameList(String ... recommendedSupplierName){
            this.recommendedSupplierNameList = solveNullList(recommendedSupplierName);
            return this;
        }

        public ConditionBuilder recommendedSupplierNameList(List<String> recommendedSupplierName){
            this.recommendedSupplierNameList = recommendedSupplierName;
            return this;
        }

        public ConditionBuilder fuzzyWarehouseSymbol (List<String> fuzzyWarehouseSymbol){
            this.fuzzyWarehouseSymbol = fuzzyWarehouseSymbol;
            return this;
        }

        public ConditionBuilder fuzzyWarehouseSymbol (String ... fuzzyWarehouseSymbol){
            this.fuzzyWarehouseSymbol = solveNullList(fuzzyWarehouseSymbol);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehouseSymbol (List<String> rightFuzzyWarehouseSymbol){
            this.rightFuzzyWarehouseSymbol = rightFuzzyWarehouseSymbol;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehouseSymbol (String ... rightFuzzyWarehouseSymbol){
            this.rightFuzzyWarehouseSymbol = solveNullList(rightFuzzyWarehouseSymbol);
            return this;
        }

        public ConditionBuilder warehouseSymbolList(String ... warehouseSymbol){
            this.warehouseSymbolList = solveNullList(warehouseSymbol);
            return this;
        }

        public ConditionBuilder warehouseSymbolList(List<String> warehouseSymbol){
            this.warehouseSymbolList = warehouseSymbol;
            return this;
        }

        public ConditionBuilder fuzzyCostManagement (List<String> fuzzyCostManagement){
            this.fuzzyCostManagement = fuzzyCostManagement;
            return this;
        }

        public ConditionBuilder fuzzyCostManagement (String ... fuzzyCostManagement){
            this.fuzzyCostManagement = solveNullList(fuzzyCostManagement);
            return this;
        }

        public ConditionBuilder rightFuzzyCostManagement (List<String> rightFuzzyCostManagement){
            this.rightFuzzyCostManagement = rightFuzzyCostManagement;
            return this;
        }

        public ConditionBuilder rightFuzzyCostManagement (String ... rightFuzzyCostManagement){
            this.rightFuzzyCostManagement = solveNullList(rightFuzzyCostManagement);
            return this;
        }

        public ConditionBuilder costManagementList(String ... costManagement){
            this.costManagementList = solveNullList(costManagement);
            return this;
        }

        public ConditionBuilder costManagementList(List<String> costManagement){
            this.costManagementList = costManagement;
            return this;
        }

        public ConditionBuilder fuzzyProductionLine (List<String> fuzzyProductionLine){
            this.fuzzyProductionLine = fuzzyProductionLine;
            return this;
        }

        public ConditionBuilder fuzzyProductionLine (String ... fuzzyProductionLine){
            this.fuzzyProductionLine = solveNullList(fuzzyProductionLine);
            return this;
        }

        public ConditionBuilder rightFuzzyProductionLine (List<String> rightFuzzyProductionLine){
            this.rightFuzzyProductionLine = rightFuzzyProductionLine;
            return this;
        }

        public ConditionBuilder rightFuzzyProductionLine (String ... rightFuzzyProductionLine){
            this.rightFuzzyProductionLine = solveNullList(rightFuzzyProductionLine);
            return this;
        }

        public ConditionBuilder productionLineList(String ... productionLine){
            this.productionLineList = solveNullList(productionLine);
            return this;
        }

        public ConditionBuilder productionLineList(List<String> productionLine){
            this.productionLineList = productionLine;
            return this;
        }

        public ConditionBuilder fuzzyOperationPositionCode (List<String> fuzzyOperationPositionCode){
            this.fuzzyOperationPositionCode = fuzzyOperationPositionCode;
            return this;
        }

        public ConditionBuilder fuzzyOperationPositionCode (String ... fuzzyOperationPositionCode){
            this.fuzzyOperationPositionCode = solveNullList(fuzzyOperationPositionCode);
            return this;
        }

        public ConditionBuilder rightFuzzyOperationPositionCode (List<String> rightFuzzyOperationPositionCode){
            this.rightFuzzyOperationPositionCode = rightFuzzyOperationPositionCode;
            return this;
        }

        public ConditionBuilder rightFuzzyOperationPositionCode (String ... rightFuzzyOperationPositionCode){
            this.rightFuzzyOperationPositionCode = solveNullList(rightFuzzyOperationPositionCode);
            return this;
        }

        public ConditionBuilder operationPositionCodeList(String ... operationPositionCode){
            this.operationPositionCodeList = solveNullList(operationPositionCode);
            return this;
        }

        public ConditionBuilder operationPositionCodeList(List<String> operationPositionCode){
            this.operationPositionCodeList = operationPositionCode;
            return this;
        }

        public ConditionBuilder fuzzyEquipmentCompany (List<String> fuzzyEquipmentCompany){
            this.fuzzyEquipmentCompany = fuzzyEquipmentCompany;
            return this;
        }

        public ConditionBuilder fuzzyEquipmentCompany (String ... fuzzyEquipmentCompany){
            this.fuzzyEquipmentCompany = solveNullList(fuzzyEquipmentCompany);
            return this;
        }

        public ConditionBuilder rightFuzzyEquipmentCompany (List<String> rightFuzzyEquipmentCompany){
            this.rightFuzzyEquipmentCompany = rightFuzzyEquipmentCompany;
            return this;
        }

        public ConditionBuilder rightFuzzyEquipmentCompany (String ... rightFuzzyEquipmentCompany){
            this.rightFuzzyEquipmentCompany = solveNullList(rightFuzzyEquipmentCompany);
            return this;
        }

        public ConditionBuilder equipmentCompanyList(String ... equipmentCompany){
            this.equipmentCompanyList = solveNullList(equipmentCompany);
            return this;
        }

        public ConditionBuilder equipmentCompanyList(List<String> equipmentCompany){
            this.equipmentCompanyList = equipmentCompany;
            return this;
        }

        public ConditionBuilder fuzzySparePartsBrand (List<String> fuzzySparePartsBrand){
            this.fuzzySparePartsBrand = fuzzySparePartsBrand;
            return this;
        }

        public ConditionBuilder fuzzySparePartsBrand (String ... fuzzySparePartsBrand){
            this.fuzzySparePartsBrand = solveNullList(fuzzySparePartsBrand);
            return this;
        }

        public ConditionBuilder rightFuzzySparePartsBrand (List<String> rightFuzzySparePartsBrand){
            this.rightFuzzySparePartsBrand = rightFuzzySparePartsBrand;
            return this;
        }

        public ConditionBuilder rightFuzzySparePartsBrand (String ... rightFuzzySparePartsBrand){
            this.rightFuzzySparePartsBrand = solveNullList(rightFuzzySparePartsBrand);
            return this;
        }

        public ConditionBuilder sparePartsBrandList(String ... sparePartsBrand){
            this.sparePartsBrandList = solveNullList(sparePartsBrand);
            return this;
        }

        public ConditionBuilder sparePartsBrandList(List<String> sparePartsBrand){
            this.sparePartsBrandList = sparePartsBrand;
            return this;
        }

        public ConditionBuilder fuzzySparePartsOrderDesc (List<String> fuzzySparePartsOrderDesc){
            this.fuzzySparePartsOrderDesc = fuzzySparePartsOrderDesc;
            return this;
        }

        public ConditionBuilder fuzzySparePartsOrderDesc (String ... fuzzySparePartsOrderDesc){
            this.fuzzySparePartsOrderDesc = solveNullList(fuzzySparePartsOrderDesc);
            return this;
        }

        public ConditionBuilder rightFuzzySparePartsOrderDesc (List<String> rightFuzzySparePartsOrderDesc){
            this.rightFuzzySparePartsOrderDesc = rightFuzzySparePartsOrderDesc;
            return this;
        }

        public ConditionBuilder rightFuzzySparePartsOrderDesc (String ... rightFuzzySparePartsOrderDesc){
            this.rightFuzzySparePartsOrderDesc = solveNullList(rightFuzzySparePartsOrderDesc);
            return this;
        }

        public ConditionBuilder sparePartsOrderDescList(String ... sparePartsOrderDesc){
            this.sparePartsOrderDescList = solveNullList(sparePartsOrderDesc);
            return this;
        }

        public ConditionBuilder sparePartsOrderDescList(List<String> sparePartsOrderDesc){
            this.sparePartsOrderDescList = sparePartsOrderDesc;
            return this;
        }

        public ConditionBuilder fuzzySparePartsEmergency (List<String> fuzzySparePartsEmergency){
            this.fuzzySparePartsEmergency = fuzzySparePartsEmergency;
            return this;
        }

        public ConditionBuilder fuzzySparePartsEmergency (String ... fuzzySparePartsEmergency){
            this.fuzzySparePartsEmergency = solveNullList(fuzzySparePartsEmergency);
            return this;
        }

        public ConditionBuilder rightFuzzySparePartsEmergency (List<String> rightFuzzySparePartsEmergency){
            this.rightFuzzySparePartsEmergency = rightFuzzySparePartsEmergency;
            return this;
        }

        public ConditionBuilder rightFuzzySparePartsEmergency (String ... rightFuzzySparePartsEmergency){
            this.rightFuzzySparePartsEmergency = solveNullList(rightFuzzySparePartsEmergency);
            return this;
        }

        public ConditionBuilder sparePartsEmergencyList(String ... sparePartsEmergency){
            this.sparePartsEmergencyList = solveNullList(sparePartsEmergency);
            return this;
        }

        public ConditionBuilder sparePartsEmergencyList(List<String> sparePartsEmergency){
            this.sparePartsEmergencyList = sparePartsEmergency;
            return this;
        }

        public ConditionBuilder fuzzyExtraOrderReason (List<String> fuzzyExtraOrderReason){
            this.fuzzyExtraOrderReason = fuzzyExtraOrderReason;
            return this;
        }

        public ConditionBuilder fuzzyExtraOrderReason (String ... fuzzyExtraOrderReason){
            this.fuzzyExtraOrderReason = solveNullList(fuzzyExtraOrderReason);
            return this;
        }

        public ConditionBuilder rightFuzzyExtraOrderReason (List<String> rightFuzzyExtraOrderReason){
            this.rightFuzzyExtraOrderReason = rightFuzzyExtraOrderReason;
            return this;
        }

        public ConditionBuilder rightFuzzyExtraOrderReason (String ... rightFuzzyExtraOrderReason){
            this.rightFuzzyExtraOrderReason = solveNullList(rightFuzzyExtraOrderReason);
            return this;
        }

        public ConditionBuilder extraOrderReasonList(String ... extraOrderReason){
            this.extraOrderReasonList = solveNullList(extraOrderReason);
            return this;
        }

        public ConditionBuilder extraOrderReasonList(List<String> extraOrderReason){
            this.extraOrderReasonList = extraOrderReason;
            return this;
        }

        public ConditionBuilder fuzzyKnifeCode (List<String> fuzzyKnifeCode){
            this.fuzzyKnifeCode = fuzzyKnifeCode;
            return this;
        }

        public ConditionBuilder fuzzyKnifeCode (String ... fuzzyKnifeCode){
            this.fuzzyKnifeCode = solveNullList(fuzzyKnifeCode);
            return this;
        }

        public ConditionBuilder rightFuzzyKnifeCode (List<String> rightFuzzyKnifeCode){
            this.rightFuzzyKnifeCode = rightFuzzyKnifeCode;
            return this;
        }

        public ConditionBuilder rightFuzzyKnifeCode (String ... rightFuzzyKnifeCode){
            this.rightFuzzyKnifeCode = solveNullList(rightFuzzyKnifeCode);
            return this;
        }

        public ConditionBuilder knifeCodeList(String ... knifeCode){
            this.knifeCodeList = solveNullList(knifeCode);
            return this;
        }

        public ConditionBuilder knifeCodeList(List<String> knifeCode){
            this.knifeCodeList = knifeCode;
            return this;
        }

        public ConditionBuilder fuzzyImportantProjectCode (List<String> fuzzyImportantProjectCode){
            this.fuzzyImportantProjectCode = fuzzyImportantProjectCode;
            return this;
        }

        public ConditionBuilder fuzzyImportantProjectCode (String ... fuzzyImportantProjectCode){
            this.fuzzyImportantProjectCode = solveNullList(fuzzyImportantProjectCode);
            return this;
        }

        public ConditionBuilder rightFuzzyImportantProjectCode (List<String> rightFuzzyImportantProjectCode){
            this.rightFuzzyImportantProjectCode = rightFuzzyImportantProjectCode;
            return this;
        }

        public ConditionBuilder rightFuzzyImportantProjectCode (String ... rightFuzzyImportantProjectCode){
            this.rightFuzzyImportantProjectCode = solveNullList(rightFuzzyImportantProjectCode);
            return this;
        }

        public ConditionBuilder importantProjectCodeList(String ... importantProjectCode){
            this.importantProjectCodeList = solveNullList(importantProjectCode);
            return this;
        }

        public ConditionBuilder importantProjectCodeList(List<String> importantProjectCode){
            this.importantProjectCodeList = importantProjectCode;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingReasonCode (List<String> fuzzyWarehousingReasonCode){
            this.fuzzyWarehousingReasonCode = fuzzyWarehousingReasonCode;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingReasonCode (String ... fuzzyWarehousingReasonCode){
            this.fuzzyWarehousingReasonCode = solveNullList(fuzzyWarehousingReasonCode);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingReasonCode (List<String> rightFuzzyWarehousingReasonCode){
            this.rightFuzzyWarehousingReasonCode = rightFuzzyWarehousingReasonCode;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingReasonCode (String ... rightFuzzyWarehousingReasonCode){
            this.rightFuzzyWarehousingReasonCode = solveNullList(rightFuzzyWarehousingReasonCode);
            return this;
        }

        public ConditionBuilder warehousingReasonCodeList(String ... warehousingReasonCode){
            this.warehousingReasonCodeList = solveNullList(warehousingReasonCode);
            return this;
        }

        public ConditionBuilder warehousingReasonCodeList(List<String> warehousingReasonCode){
            this.warehousingReasonCodeList = warehousingReasonCode;
            return this;
        }

        public ConditionBuilder fuzzyOrderListCode (List<String> fuzzyOrderListCode){
            this.fuzzyOrderListCode = fuzzyOrderListCode;
            return this;
        }

        public ConditionBuilder fuzzyOrderListCode (String ... fuzzyOrderListCode){
            this.fuzzyOrderListCode = solveNullList(fuzzyOrderListCode);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderListCode (List<String> rightFuzzyOrderListCode){
            this.rightFuzzyOrderListCode = rightFuzzyOrderListCode;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderListCode (String ... rightFuzzyOrderListCode){
            this.rightFuzzyOrderListCode = solveNullList(rightFuzzyOrderListCode);
            return this;
        }

        public ConditionBuilder orderListCodeList(String ... orderListCode){
            this.orderListCodeList = solveNullList(orderListCode);
            return this;
        }

        public ConditionBuilder orderListCodeList(List<String> orderListCode){
            this.orderListCodeList = orderListCode;
            return this;
        }

        public ConditionBuilder fuzzyVariables (List<String> fuzzyVariables){
            this.fuzzyVariables = fuzzyVariables;
            return this;
        }

        public ConditionBuilder fuzzyVariables (String ... fuzzyVariables){
            this.fuzzyVariables = solveNullList(fuzzyVariables);
            return this;
        }

        public ConditionBuilder rightFuzzyVariables (List<String> rightFuzzyVariables){
            this.rightFuzzyVariables = rightFuzzyVariables;
            return this;
        }

        public ConditionBuilder rightFuzzyVariables (String ... rightFuzzyVariables){
            this.rightFuzzyVariables = solveNullList(rightFuzzyVariables);
            return this;
        }

        public ConditionBuilder variablesList(String ... variables){
            this.variablesList = solveNullList(variables);
            return this;
        }

        public ConditionBuilder variablesList(List<String> variables){
            this.variablesList = variables;
            return this;
        }

        public ConditionBuilder fuzzyWarehouseCode (List<String> fuzzyWarehouseCode){
            this.fuzzyWarehouseCode = fuzzyWarehouseCode;
            return this;
        }

        public ConditionBuilder fuzzyWarehouseCode (String ... fuzzyWarehouseCode){
            this.fuzzyWarehouseCode = solveNullList(fuzzyWarehouseCode);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehouseCode (List<String> rightFuzzyWarehouseCode){
            this.rightFuzzyWarehouseCode = rightFuzzyWarehouseCode;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehouseCode (String ... rightFuzzyWarehouseCode){
            this.rightFuzzyWarehouseCode = solveNullList(rightFuzzyWarehouseCode);
            return this;
        }

        public ConditionBuilder warehouseCodeList(String ... warehouseCode){
            this.warehouseCodeList = solveNullList(warehouseCode);
            return this;
        }

        public ConditionBuilder warehouseCodeList(List<String> warehouseCode){
            this.warehouseCodeList = warehouseCode;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private Order obj;

        public Builder(){
            this.obj = new Order();
        }

        public Builder orderId(Long orderId){
            this.obj.setOrderId(orderId);
            return this;
        }
        public Builder orderOperaterUserName(String orderOperaterUserName){
            this.obj.setOrderOperaterUserName(orderOperaterUserName);
            return this;
        }
        public Builder orderOperaterTime(String orderOperaterTime){
            this.obj.setOrderOperaterTime(orderOperaterTime);
            return this;
        }
        public Builder orderType(String orderType){
            this.obj.setOrderType(orderType);
            return this;
        }
        public Builder financialListCode(String financialListCode){
            this.obj.setFinancialListCode(financialListCode);
            return this;
        }
        public Builder purchasingListCode(String purchasingListCode){
            this.obj.setPurchasingListCode(purchasingListCode);
            return this;
        }
        public Builder materialCode(String materialCode){
            this.obj.setMaterialCode(materialCode);
            return this;
        }
        public Builder materialName(String materialName){
            this.obj.setMaterialName(materialName);
            return this;
        }
        public Builder confirmMaterialName(String confirmMaterialName){
            this.obj.setConfirmMaterialName(confirmMaterialName);
            return this;
        }
        public Builder materialSpecs(String materialSpecs){
            this.obj.setMaterialSpecs(materialSpecs);
            return this;
        }
        public Builder confirmMaterialSpecs(String confirmMaterialSpecs){
            this.obj.setConfirmMaterialSpecs(confirmMaterialSpecs);
            return this;
        }
        public Builder materialBrand(String materialBrand){
            this.obj.setMaterialBrand(materialBrand);
            return this;
        }
        public Builder confirmMaterialBrand(String confirmMaterialBrand){
            this.obj.setConfirmMaterialBrand(confirmMaterialBrand);
            return this;
        }
        public Builder materialUnit(String materialUnit){
            this.obj.setMaterialUnit(materialUnit);
            return this;
        }
        public Builder orderMaterialNum(Integer orderMaterialNum){
            this.obj.setOrderMaterialNum(orderMaterialNum);
            return this;
        }
        public Builder financialCenterCode(String financialCenterCode){
            this.obj.setFinancialCenterCode(financialCenterCode);
            return this;
        }
        public Builder orderBuyer(String orderBuyer){
            this.obj.setOrderBuyer(orderBuyer);
            return this;
        }
        public Builder supplierName(String supplierName){
            this.obj.setSupplierName(supplierName);
            return this;
        }
        public Builder orderState(String orderState){
            this.obj.setOrderState(orderState);
            return this;
        }
        public Builder orderBuyerCheckDate(String orderBuyerCheckDate){
            this.obj.setOrderBuyerCheckDate(orderBuyerCheckDate);
            return this;
        }
        public Builder orderPriceCheckDate(String orderPriceCheckDate){
            this.obj.setOrderPriceCheckDate(orderPriceCheckDate);
            return this;
        }
        public Builder purchasingOrderCode(String purchasingOrderCode){
            this.obj.setPurchasingOrderCode(purchasingOrderCode);
            return this;
        }
        public Builder arrivalDate(String arrivalDate){
            this.obj.setArrivalDate(arrivalDate);
            return this;
        }
        public Builder receivedNum(Integer receivedNum){
            this.obj.setReceivedNum(receivedNum);
            return this;
        }
        public Builder receivedDate(String receivedDate){
            this.obj.setReceivedDate(receivedDate);
            return this;
        }
        public Builder paymentType(String paymentType){
            this.obj.setPaymentType(paymentType);
            return this;
        }
        public Builder paymentRate(String paymentRate){
            this.obj.setPaymentRate(paymentRate);
            return this;
        }
        public Builder budgetType(String budgetType){
            this.obj.setBudgetType(budgetType);
            return this;
        }
        public Builder budgetSubject(String budgetSubject){
            this.obj.setBudgetSubject(budgetSubject);
            return this;
        }
        public Builder investManagementCode(String investManagementCode){
            this.obj.setInvestManagementCode(investManagementCode);
            return this;
        }
        public Builder researchTestProject(String researchTestProject){
            this.obj.setResearchTestProject(researchTestProject);
            return this;
        }
        public Builder orderBuilderName(String orderBuilderName){
            this.obj.setOrderBuilderName(orderBuilderName);
            return this;
        }
        public Builder orderDescription(String orderDescription){
            this.obj.setOrderDescription(orderDescription);
            return this;
        }
        public Builder orderInitialUserId(Integer orderInitialUserId){
            this.obj.setOrderInitialUserId(orderInitialUserId);
            return this;
        }
        public Builder orderInitialTime(String orderInitialTime){
            this.obj.setOrderInitialTime(orderInitialTime);
            return this;
        }
        public Builder orderInitialState(String orderInitialState){
            this.obj.setOrderInitialState(orderInitialState);
            return this;
        }
        public Builder orderManagementType(String orderManagementType){
            this.obj.setOrderManagementType(orderManagementType);
            return this;
        }
        public Builder orderManagementFormName(String orderManagementFormName){
            this.obj.setOrderManagementFormName(orderManagementFormName);
            return this;
        }
        public Builder orderManagementFormId(Integer orderManagementFormId){
            this.obj.setOrderManagementFormId(orderManagementFormId);
            return this;
        }
        public Builder simpleApplicationObjectId(Long simpleApplicationObjectId){
            this.obj.setSimpleApplicationObjectId(simpleApplicationObjectId);
            return this;
        }
        public Builder prospectiveArrivalDate(String prospectiveArrivalDate){
            this.obj.setProspectiveArrivalDate(prospectiveArrivalDate);
            return this;
        }
        public Builder supplierCode(String supplierCode){
            this.obj.setSupplierCode(supplierCode);
            return this;
        }
        public Builder contractType(String contractType){
            this.obj.setContractType(contractType);
            return this;
        }
        public Builder orderInitialDepartment(String orderInitialDepartment){
            this.obj.setOrderInitialDepartment(orderInitialDepartment);
            return this;
        }
        public Builder orderInitialUserName(String orderInitialUserName){
            this.obj.setOrderInitialUserName(orderInitialUserName);
            return this;
        }
        public Builder recommendedSupplierName(String recommendedSupplierName){
            this.obj.setRecommendedSupplierName(recommendedSupplierName);
            return this;
        }
        public Builder warehouseSymbol(String warehouseSymbol){
            this.obj.setWarehouseSymbol(warehouseSymbol);
            return this;
        }
        public Builder costManagement(String costManagement){
            this.obj.setCostManagement(costManagement);
            return this;
        }
        public Builder productionLine(String productionLine){
            this.obj.setProductionLine(productionLine);
            return this;
        }
        public Builder operationPositionCode(String operationPositionCode){
            this.obj.setOperationPositionCode(operationPositionCode);
            return this;
        }
        public Builder equipmentCompany(String equipmentCompany){
            this.obj.setEquipmentCompany(equipmentCompany);
            return this;
        }
        public Builder sparePartsBrand(String sparePartsBrand){
            this.obj.setSparePartsBrand(sparePartsBrand);
            return this;
        }
        public Builder sparePartsOrderDesc(String sparePartsOrderDesc){
            this.obj.setSparePartsOrderDesc(sparePartsOrderDesc);
            return this;
        }
        public Builder sparePartsEmergency(String sparePartsEmergency){
            this.obj.setSparePartsEmergency(sparePartsEmergency);
            return this;
        }
        public Builder extraOrderReason(String extraOrderReason){
            this.obj.setExtraOrderReason(extraOrderReason);
            return this;
        }
        public Builder knifeCode(String knifeCode){
            this.obj.setKnifeCode(knifeCode);
            return this;
        }
        public Builder importantProjectCode(String importantProjectCode){
            this.obj.setImportantProjectCode(importantProjectCode);
            return this;
        }
        public Builder warehousingReasonCode(String warehousingReasonCode){
            this.obj.setWarehousingReasonCode(warehousingReasonCode);
            return this;
        }
        public Builder orderListCode(String orderListCode){
            this.obj.setOrderListCode(orderListCode);
            return this;
        }
        public Builder variables(String variables){
            this.obj.setVariables(variables);
            return this;
        }
        public Builder warehouseCode(String warehouseCode){
            this.obj.setWarehouseCode(warehouseCode);
            return this;
        }
        public Order build(){return obj;}
    }

}
