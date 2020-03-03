package com.gamc.efactory.model.dataObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author wangjian
*/
public class MqmsVoucher implements Serializable {

    private static final long serialVersionUID = 1583236759014L;


    /**
    * 主键
    * 系统id号
    * isNullAble:0
    */
    private Integer voucherId;

    /**
    * 单据编号
    * isNullAble:0
    */
    private String voucherCode;

    /**
    * 索赔单号
    * isNullAble:1
    */
    private String claimCode;

    /**
    * 经销商代码
    * isNullAble:1
    */
    private String dealerCode;

    /**
    * 经销商名称
    * isNullAble:1
    */
    private String dealerName;

    /**
    * 经销商简称
    * isNullAble:1
    */
    private String dealerShortName;

    /**
    * 主题
    * isNullAble:1
    */
    private String theme;

    /**
    * vin
    * isNullAble:1
    */
    private String vinCode;

    /**
    * 车型
    * isNullAble:1
    */
    private String vehicleType;

    /**
    * 产品编号
    * isNullAble:1
    */
    private String productionCode;

    /**
    * 零部件编号
    * isNullAble:1
    */
    private String partsCode;

    /**
    * 零部件名称
    * isNullAble:1
    */
    private String partsName;

    /**
    * 一级名称
    * isNullAble:1
    */
    private String divisionLevel1;

    /**
    * 二级名称
    * isNullAble:1
    */
    private String divisionLevel2;

    /**
    * 三级名称
    * isNullAble:1
    */
    private String divisionLevel3;

    /**
    * 零件简称-具体现象
    * isNullAble:1
    */
    private String partsAndSymptom;

    /**
    * 生产日期
    * isNullAble:1
    */
    private String offlineDate;

    /**
    * 销售日期
    * isNullAble:1
    */
    private String salesDate;

    /**
    * 故障日期
    * isNullAble:1
    */
    private String failureDate;

    /**
    * 里程
    * isNullAble:1
    */
    private Integer mileage;

    /**
    * 确认时间
    * isNullAble:1
    */
    private String confirmDate;

    /**
    * 车辆出库时间
    * isNullAble:1
    */
    private String warehousingDate;

    /**
    * 车辆发运时间
    * isNullAble:1
    */
    private String transportDate;

    /**
    * 车辆到店时间
    * isNullAble:1
    */
    private String shopArrivalDate;

    /**
    * 销售至故障经过月
    * isNullAble:1
    */
    private Integer salesFailureTime;

    /**
    * 故障描述
    * isNullAble:1
    */
    private String failureDesc;

    /**
    * 诊断过程
    * isNullAble:1
    */
    private String diagnosticResult;

    /**
    * 工时金额
    * isNullAble:1
    */
    private java.math.BigDecimal manCost;

    /**
    * 配件金额
    * isNullAble:1
    */
    private java.math.BigDecimal materialCost;

    /**
    * 配件管理费用
    * isNullAble:1
    */
    private java.math.BigDecimal materialManagementCost;

    /**
    * 外出费用
    * isNullAble:1
    */
    private java.math.BigDecimal goOutCost;

    /**
    * 保养费用
    * isNullAble:1
    */
    private java.math.BigDecimal maintainingCost;

    /**
    * 其他费用
    * isNullAble:1
    */
    private java.math.BigDecimal otherCost;

    /**
    * 总费用
    * isNullAble:1
    */
    private java.math.BigDecimal totalCost;

    /**
    * 重要度
    * isNullAble:1
    */
    private String importantLevel;

    /**
    * 变速箱类型
    * isNullAble:1
    */
    private String transmissionType;

    /**
    * 新件绑定号
    * isNullAble:1
    */
    private String newPartsBond;

    /**
    * 提交时间
    * isNullAble:1
    */
    private String submitDate;

    /**
    * 发动机号
    * isNullAble:1
    */
    private String egtypeCode;

    /**
    * 发动机生产日期
    * isNullAble:1
    */
    private String engProductionDate;

    /**
    * 变速箱号
    * isNullAble:1
    */
    private String transmissionCode;

    /**
    * 变速箱生产日期
    * isNullAble:1
    */
    private String transmissionProductionDate;

    /**
    * eng整理（故障分类）
    * isNullAble:1
    */
    private String engArrange;

    /**
    * 车型
    * isNullAble:1
    */
    private String carModel;

    /**
    * 发动机机型
    * isNullAble:1
    */
    private String engType;

    /**
    * 接收区间
    * isNullAble:1
    */
    private String receiveTime;

    /**
    * 是否算入索赔率统计
    * isNullAble:1
    */
    private String claimCompensation;

    /**
    * 备注1
    * isNullAble:1
    */
    private String productionRawDescription;

    /**
    * PDI
    * isNullAble:1
    */
    private String PDI;

    /**
    * 下线至确认经过月
    * isNullAble:1
    */
    private Integer offlineFailureTime;

    /**
    * 发动机或变速箱
    * isNullAble:1
    */
    private String engOrTran;

    /**
    * 系列号
    * isNullAble:1
    */
    private String carSeriesCode;

    /**
    * 短码
    * isNullAble:1
    */
    private String shortCode;

    /**
    * 故障码分类
    * isNullAble:1
    */
    private String faultCodeClassification;

    /**
    * 故障年
    * isNullAble:1
    */
    private String failureYear;

    /**
    * 故障月
    * isNullAble:1
    */
    private String failureMonth;

    /**
    * 变速箱短码
    * isNullAble:1,defaultVal:
    */
    private String transmissionShortCode;

    /**
    * 里程分布
    * isNullAble:1
    */
    private String mileageDistribution;

    /**
    * 是否要求返回
    * isNullAble:1
    */
    private String returnRequest;

    /**
    * 返回日期
    * isNullAble:1
    */
    private String returnDate;

    /**
    * 到厂日期
    * isNullAble:1
    */
    private String arriveDate;

    /**
    * 是否装车验证
    * isNullAble:1
    */
    private String loadingVerification;

    /**
    * 故障再现人
    * isNullAble:1
    */
    private String faultReconstructioner;

    /**
    * 装车日期
    * isNullAble:1
    */
    private String loadingDate;

    /**
    * 故障是否再现
    * isNullAble:1
    */
    private String faultReconstruction;

    /**
    * 故障再现日期
    * isNullAble:1
    */
    private String faultReconstructionDate;

    /**
    * 移交日期1
    * isNullAble:1
    */
    private String transferDate1;

    /**
    * 担当1
    * isNullAble:1
    */
    private String responsible1;

    /**
    * 移交日期2
    * isNullAble:1
    */
    private String transferDate2;

    /**
    * 担当2
    * isNullAble:1
    */
    private String responsible2;

    /**
    * 预计上会时间
    * isNullAble:1
    */
    private String estimateMeetingDate;

    /**
    * 是否提交报告
    * isNullAble:1
    */
    private String submitReport;

    /**
    * 原因
    * isNullAble:1
    */
    private String reason;

    /**
    * 对策
    * isNullAble:1
    */
    private String countermeasure;

    /**
    * 报告提交日期
    * isNullAble:1
    */
    private String reportSubmit;

    /**
    * 是否索赔
    * isNullAble:1
    */
    private String claimIndemnity;

    /**
    * 问题类型
    * isNullAble:1
    */
    private String questionType;

    /**
    * 状态
    * isNullAble:1
    */
    private String questionState;

    /**
    * 责任科室
    * isNullAble:1
    */
    private String responsibleDepartment;

    /**
    * 
    * isNullAble:1
    */
    private Integer applierId;

    /**
    * 
    * isNullAble:1
    */
    private String applierName;

    /**
    * 
    * isNullAble:1
    */
    private String applyTime;


    public void setVoucherId(Integer voucherId){this.voucherId = voucherId;}

    public Integer getVoucherId(){return this.voucherId;}

    public void setVoucherCode(String voucherCode){this.voucherCode = voucherCode;}

    public String getVoucherCode(){return this.voucherCode;}

    public void setClaimCode(String claimCode){this.claimCode = claimCode;}

    public String getClaimCode(){return this.claimCode;}

    public void setDealerCode(String dealerCode){this.dealerCode = dealerCode;}

    public String getDealerCode(){return this.dealerCode;}

    public void setDealerName(String dealerName){this.dealerName = dealerName;}

    public String getDealerName(){return this.dealerName;}

    public void setDealerShortName(String dealerShortName){this.dealerShortName = dealerShortName;}

    public String getDealerShortName(){return this.dealerShortName;}

    public void setTheme(String theme){this.theme = theme;}

    public String getTheme(){return this.theme;}

    public void setVinCode(String vinCode){this.vinCode = vinCode;}

    public String getVinCode(){return this.vinCode;}

    public void setVehicleType(String vehicleType){this.vehicleType = vehicleType;}

    public String getVehicleType(){return this.vehicleType;}

    public void setProductionCode(String productionCode){this.productionCode = productionCode;}

    public String getProductionCode(){return this.productionCode;}

    public void setPartsCode(String partsCode){this.partsCode = partsCode;}

    public String getPartsCode(){return this.partsCode;}

    public void setPartsName(String partsName){this.partsName = partsName;}

    public String getPartsName(){return this.partsName;}

    public void setDivisionLevel1(String divisionLevel1){this.divisionLevel1 = divisionLevel1;}

    public String getDivisionLevel1(){return this.divisionLevel1;}

    public void setDivisionLevel2(String divisionLevel2){this.divisionLevel2 = divisionLevel2;}

    public String getDivisionLevel2(){return this.divisionLevel2;}

    public void setDivisionLevel3(String divisionLevel3){this.divisionLevel3 = divisionLevel3;}

    public String getDivisionLevel3(){return this.divisionLevel3;}

    public void setPartsAndSymptom(String partsAndSymptom){this.partsAndSymptom = partsAndSymptom;}

    public String getPartsAndSymptom(){return this.partsAndSymptom;}

    public void setOfflineDate(String offlineDate){this.offlineDate = offlineDate;}

    public String getOfflineDate(){return this.offlineDate;}

    public void setSalesDate(String salesDate){this.salesDate = salesDate;}

    public String getSalesDate(){return this.salesDate;}

    public void setFailureDate(String failureDate){this.failureDate = failureDate;}

    public String getFailureDate(){return this.failureDate;}

    public void setMileage(Integer mileage){this.mileage = mileage;}

    public Integer getMileage(){return this.mileage;}

    public void setConfirmDate(String confirmDate){this.confirmDate = confirmDate;}

    public String getConfirmDate(){return this.confirmDate;}

    public void setWarehousingDate(String warehousingDate){this.warehousingDate = warehousingDate;}

    public String getWarehousingDate(){return this.warehousingDate;}

    public void setTransportDate(String transportDate){this.transportDate = transportDate;}

    public String getTransportDate(){return this.transportDate;}

    public void setShopArrivalDate(String shopArrivalDate){this.shopArrivalDate = shopArrivalDate;}

    public String getShopArrivalDate(){return this.shopArrivalDate;}

    public void setSalesFailureTime(Integer salesFailureTime){this.salesFailureTime = salesFailureTime;}

    public Integer getSalesFailureTime(){return this.salesFailureTime;}

    public void setFailureDesc(String failureDesc){this.failureDesc = failureDesc;}

    public String getFailureDesc(){return this.failureDesc;}

    public void setDiagnosticResult(String diagnosticResult){this.diagnosticResult = diagnosticResult;}

    public String getDiagnosticResult(){return this.diagnosticResult;}

    public void setManCost(java.math.BigDecimal manCost){this.manCost = manCost;}

    public java.math.BigDecimal getManCost(){return this.manCost;}

    public void setMaterialCost(java.math.BigDecimal materialCost){this.materialCost = materialCost;}

    public java.math.BigDecimal getMaterialCost(){return this.materialCost;}

    public void setMaterialManagementCost(java.math.BigDecimal materialManagementCost){this.materialManagementCost = materialManagementCost;}

    public java.math.BigDecimal getMaterialManagementCost(){return this.materialManagementCost;}

    public void setGoOutCost(java.math.BigDecimal goOutCost){this.goOutCost = goOutCost;}

    public java.math.BigDecimal getGoOutCost(){return this.goOutCost;}

    public void setMaintainingCost(java.math.BigDecimal maintainingCost){this.maintainingCost = maintainingCost;}

    public java.math.BigDecimal getMaintainingCost(){return this.maintainingCost;}

    public void setOtherCost(java.math.BigDecimal otherCost){this.otherCost = otherCost;}

    public java.math.BigDecimal getOtherCost(){return this.otherCost;}

    public void setTotalCost(java.math.BigDecimal totalCost){this.totalCost = totalCost;}

    public java.math.BigDecimal getTotalCost(){return this.totalCost;}

    public void setImportantLevel(String importantLevel){this.importantLevel = importantLevel;}

    public String getImportantLevel(){return this.importantLevel;}

    public void setTransmissionType(String transmissionType){this.transmissionType = transmissionType;}

    public String getTransmissionType(){return this.transmissionType;}

    public void setNewPartsBond(String newPartsBond){this.newPartsBond = newPartsBond;}

    public String getNewPartsBond(){return this.newPartsBond;}

    public void setSubmitDate(String submitDate){this.submitDate = submitDate;}

    public String getSubmitDate(){return this.submitDate;}

    public void setEgtypeCode(String egtypeCode){this.egtypeCode = egtypeCode;}

    public String getEgtypeCode(){return this.egtypeCode;}

    public void setEngProductionDate(String engProductionDate){this.engProductionDate = engProductionDate;}

    public String getEngProductionDate(){return this.engProductionDate;}

    public void setTransmissionCode(String transmissionCode){this.transmissionCode = transmissionCode;}

    public String getTransmissionCode(){return this.transmissionCode;}

    public void setTransmissionProductionDate(String transmissionProductionDate){this.transmissionProductionDate = transmissionProductionDate;}

    public String getTransmissionProductionDate(){return this.transmissionProductionDate;}

    public void setEngArrange(String engArrange){this.engArrange = engArrange;}

    public String getEngArrange(){return this.engArrange;}

    public void setCarModel(String carModel){this.carModel = carModel;}

    public String getCarModel(){return this.carModel;}

    public void setEngType(String engType){this.engType = engType;}

    public String getEngType(){return this.engType;}

    public void setReceiveTime(String receiveTime){this.receiveTime = receiveTime;}

    public String getReceiveTime(){return this.receiveTime;}

    public void setClaimCompensation(String claimCompensation){this.claimCompensation = claimCompensation;}

    public String getClaimCompensation(){return this.claimCompensation;}

    public void setProductionRawDescription(String productionRawDescription){this.productionRawDescription = productionRawDescription;}

    public String getProductionRawDescription(){return this.productionRawDescription;}

    public void setPDI(String PDI){this.PDI = PDI;}

    public String getPDI(){return this.PDI;}

    public void setOfflineFailureTime(Integer offlineFailureTime){this.offlineFailureTime = offlineFailureTime;}

    public Integer getOfflineFailureTime(){return this.offlineFailureTime;}

    public void setEngOrTran(String engOrTran){this.engOrTran = engOrTran;}

    public String getEngOrTran(){return this.engOrTran;}

    public void setCarSeriesCode(String carSeriesCode){this.carSeriesCode = carSeriesCode;}

    public String getCarSeriesCode(){return this.carSeriesCode;}

    public void setShortCode(String shortCode){this.shortCode = shortCode;}

    public String getShortCode(){return this.shortCode;}

    public void setFaultCodeClassification(String faultCodeClassification){this.faultCodeClassification = faultCodeClassification;}

    public String getFaultCodeClassification(){return this.faultCodeClassification;}

    public void setFailureYear(String failureYear){this.failureYear = failureYear;}

    public String getFailureYear(){return this.failureYear;}

    public void setFailureMonth(String failureMonth){this.failureMonth = failureMonth;}

    public String getFailureMonth(){return this.failureMonth;}

    public void setTransmissionShortCode(String transmissionShortCode){this.transmissionShortCode = transmissionShortCode;}

    public String getTransmissionShortCode(){return this.transmissionShortCode;}

    public void setMileageDistribution(String mileageDistribution){this.mileageDistribution = mileageDistribution;}

    public String getMileageDistribution(){return this.mileageDistribution;}

    public void setReturnRequest(String returnRequest){this.returnRequest = returnRequest;}

    public String getReturnRequest(){return this.returnRequest;}

    public void setReturnDate(String returnDate){this.returnDate = returnDate;}

    public String getReturnDate(){return this.returnDate;}

    public void setArriveDate(String arriveDate){this.arriveDate = arriveDate;}

    public String getArriveDate(){return this.arriveDate;}

    public void setLoadingVerification(String loadingVerification){this.loadingVerification = loadingVerification;}

    public String getLoadingVerification(){return this.loadingVerification;}

    public void setFaultReconstructioner(String faultReconstructioner){this.faultReconstructioner = faultReconstructioner;}

    public String getFaultReconstructioner(){return this.faultReconstructioner;}

    public void setLoadingDate(String loadingDate){this.loadingDate = loadingDate;}

    public String getLoadingDate(){return this.loadingDate;}

    public void setFaultReconstruction(String faultReconstruction){this.faultReconstruction = faultReconstruction;}

    public String getFaultReconstruction(){return this.faultReconstruction;}

    public void setFaultReconstructionDate(String faultReconstructionDate){this.faultReconstructionDate = faultReconstructionDate;}

    public String getFaultReconstructionDate(){return this.faultReconstructionDate;}

    public void setTransferDate1(String transferDate1){this.transferDate1 = transferDate1;}

    public String getTransferDate1(){return this.transferDate1;}

    public void setResponsible1(String responsible1){this.responsible1 = responsible1;}

    public String getResponsible1(){return this.responsible1;}

    public void setTransferDate2(String transferDate2){this.transferDate2 = transferDate2;}

    public String getTransferDate2(){return this.transferDate2;}

    public void setResponsible2(String responsible2){this.responsible2 = responsible2;}

    public String getResponsible2(){return this.responsible2;}

    public void setEstimateMeetingDate(String estimateMeetingDate){this.estimateMeetingDate = estimateMeetingDate;}

    public String getEstimateMeetingDate(){return this.estimateMeetingDate;}

    public void setSubmitReport(String submitReport){this.submitReport = submitReport;}

    public String getSubmitReport(){return this.submitReport;}

    public void setReason(String reason){this.reason = reason;}

    public String getReason(){return this.reason;}

    public void setCountermeasure(String countermeasure){this.countermeasure = countermeasure;}

    public String getCountermeasure(){return this.countermeasure;}

    public void setReportSubmit(String reportSubmit){this.reportSubmit = reportSubmit;}

    public String getReportSubmit(){return this.reportSubmit;}

    public void setClaimIndemnity(String claimIndemnity){this.claimIndemnity = claimIndemnity;}

    public String getClaimIndemnity(){return this.claimIndemnity;}

    public void setQuestionType(String questionType){this.questionType = questionType;}

    public String getQuestionType(){return this.questionType;}

    public void setQuestionState(String questionState){this.questionState = questionState;}

    public String getQuestionState(){return this.questionState;}

    public void setResponsibleDepartment(String responsibleDepartment){this.responsibleDepartment = responsibleDepartment;}

    public String getResponsibleDepartment(){return this.responsibleDepartment;}

    public void setApplierId(Integer applierId){this.applierId = applierId;}

    public Integer getApplierId(){return this.applierId;}

    public void setApplierName(String applierName){this.applierName = applierName;}

    public String getApplierName(){return this.applierName;}

    public void setApplyTime(String applyTime){this.applyTime = applyTime;}

    public String getApplyTime(){return this.applyTime;}
    @Override
    public String toString() {
        return "MqmsVoucher{" +
                "voucherId='" + voucherId + '\'' +
                "voucherCode='" + voucherCode + '\'' +
                "claimCode='" + claimCode + '\'' +
                "dealerCode='" + dealerCode + '\'' +
                "dealerName='" + dealerName + '\'' +
                "dealerShortName='" + dealerShortName + '\'' +
                "theme='" + theme + '\'' +
                "vinCode='" + vinCode + '\'' +
                "vehicleType='" + vehicleType + '\'' +
                "productionCode='" + productionCode + '\'' +
                "partsCode='" + partsCode + '\'' +
                "partsName='" + partsName + '\'' +
                "divisionLevel1='" + divisionLevel1 + '\'' +
                "divisionLevel2='" + divisionLevel2 + '\'' +
                "divisionLevel3='" + divisionLevel3 + '\'' +
                "partsAndSymptom='" + partsAndSymptom + '\'' +
                "offlineDate='" + offlineDate + '\'' +
                "salesDate='" + salesDate + '\'' +
                "failureDate='" + failureDate + '\'' +
                "mileage='" + mileage + '\'' +
                "confirmDate='" + confirmDate + '\'' +
                "warehousingDate='" + warehousingDate + '\'' +
                "transportDate='" + transportDate + '\'' +
                "shopArrivalDate='" + shopArrivalDate + '\'' +
                "salesFailureTime='" + salesFailureTime + '\'' +
                "failureDesc='" + failureDesc + '\'' +
                "diagnosticResult='" + diagnosticResult + '\'' +
                "manCost='" + manCost + '\'' +
                "materialCost='" + materialCost + '\'' +
                "materialManagementCost='" + materialManagementCost + '\'' +
                "goOutCost='" + goOutCost + '\'' +
                "maintainingCost='" + maintainingCost + '\'' +
                "otherCost='" + otherCost + '\'' +
                "totalCost='" + totalCost + '\'' +
                "importantLevel='" + importantLevel + '\'' +
                "transmissionType='" + transmissionType + '\'' +
                "newPartsBond='" + newPartsBond + '\'' +
                "submitDate='" + submitDate + '\'' +
                "egtypeCode='" + egtypeCode + '\'' +
                "engProductionDate='" + engProductionDate + '\'' +
                "transmissionCode='" + transmissionCode + '\'' +
                "transmissionProductionDate='" + transmissionProductionDate + '\'' +
                "engArrange='" + engArrange + '\'' +
                "carModel='" + carModel + '\'' +
                "engType='" + engType + '\'' +
                "receiveTime='" + receiveTime + '\'' +
                "claimCompensation='" + claimCompensation + '\'' +
                "productionRawDescription='" + productionRawDescription + '\'' +
                "PDI='" + PDI + '\'' +
                "offlineFailureTime='" + offlineFailureTime + '\'' +
                "engOrTran='" + engOrTran + '\'' +
                "carSeriesCode='" + carSeriesCode + '\'' +
                "shortCode='" + shortCode + '\'' +
                "faultCodeClassification='" + faultCodeClassification + '\'' +
                "failureYear='" + failureYear + '\'' +
                "failureMonth='" + failureMonth + '\'' +
                "transmissionShortCode='" + transmissionShortCode + '\'' +
                "mileageDistribution='" + mileageDistribution + '\'' +
                "returnRequest='" + returnRequest + '\'' +
                "returnDate='" + returnDate + '\'' +
                "arriveDate='" + arriveDate + '\'' +
                "loadingVerification='" + loadingVerification + '\'' +
                "faultReconstructioner='" + faultReconstructioner + '\'' +
                "loadingDate='" + loadingDate + '\'' +
                "faultReconstruction='" + faultReconstruction + '\'' +
                "faultReconstructionDate='" + faultReconstructionDate + '\'' +
                "transferDate1='" + transferDate1 + '\'' +
                "responsible1='" + responsible1 + '\'' +
                "transferDate2='" + transferDate2 + '\'' +
                "responsible2='" + responsible2 + '\'' +
                "estimateMeetingDate='" + estimateMeetingDate + '\'' +
                "submitReport='" + submitReport + '\'' +
                "reason='" + reason + '\'' +
                "countermeasure='" + countermeasure + '\'' +
                "reportSubmit='" + reportSubmit + '\'' +
                "claimIndemnity='" + claimIndemnity + '\'' +
                "questionType='" + questionType + '\'' +
                "questionState='" + questionState + '\'' +
                "responsibleDepartment='" + responsibleDepartment + '\'' +
                "applierId='" + applierId + '\'' +
                "applierName='" + applierName + '\'' +
                "applyTime='" + applyTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsVoucher set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsVoucher set){
            this.set = set;
            return this;
        }

        public MqmsVoucher getSet(){
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

    public static class QueryBuilder extends MqmsVoucher{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> voucherIdList;

        public List<Integer> getVoucherIdList(){return this.voucherIdList;}

        private Integer voucherIdSt;

        private Integer voucherIdEd;

        public Integer getVoucherIdSt(){return this.voucherIdSt;}

        public Integer getVoucherIdEd(){return this.voucherIdEd;}

        private List<String> voucherCodeList;

        public List<String> getVoucherCodeList(){return this.voucherCodeList;}


        private List<String> fuzzyVoucherCode;

        public List<String> getFuzzyVoucherCode(){return this.fuzzyVoucherCode;}

        private List<String> rightFuzzyVoucherCode;

        public List<String> getRightFuzzyVoucherCode(){return this.rightFuzzyVoucherCode;}
        private List<String> claimCodeList;

        public List<String> getClaimCodeList(){return this.claimCodeList;}


        private List<String> fuzzyClaimCode;

        public List<String> getFuzzyClaimCode(){return this.fuzzyClaimCode;}

        private List<String> rightFuzzyClaimCode;

        public List<String> getRightFuzzyClaimCode(){return this.rightFuzzyClaimCode;}
        private List<String> dealerCodeList;

        public List<String> getDealerCodeList(){return this.dealerCodeList;}


        private List<String> fuzzyDealerCode;

        public List<String> getFuzzyDealerCode(){return this.fuzzyDealerCode;}

        private List<String> rightFuzzyDealerCode;

        public List<String> getRightFuzzyDealerCode(){return this.rightFuzzyDealerCode;}
        private List<String> dealerNameList;

        public List<String> getDealerNameList(){return this.dealerNameList;}


        private List<String> fuzzyDealerName;

        public List<String> getFuzzyDealerName(){return this.fuzzyDealerName;}

        private List<String> rightFuzzyDealerName;

        public List<String> getRightFuzzyDealerName(){return this.rightFuzzyDealerName;}
        private List<String> dealerShortNameList;

        public List<String> getDealerShortNameList(){return this.dealerShortNameList;}


        private List<String> fuzzyDealerShortName;

        public List<String> getFuzzyDealerShortName(){return this.fuzzyDealerShortName;}

        private List<String> rightFuzzyDealerShortName;

        public List<String> getRightFuzzyDealerShortName(){return this.rightFuzzyDealerShortName;}
        private List<String> themeList;

        public List<String> getThemeList(){return this.themeList;}


        private List<String> fuzzyTheme;

        public List<String> getFuzzyTheme(){return this.fuzzyTheme;}

        private List<String> rightFuzzyTheme;

        public List<String> getRightFuzzyTheme(){return this.rightFuzzyTheme;}
        private List<String> vinCodeList;

        public List<String> getVinCodeList(){return this.vinCodeList;}


        private List<String> fuzzyVinCode;

        public List<String> getFuzzyVinCode(){return this.fuzzyVinCode;}

        private List<String> rightFuzzyVinCode;

        public List<String> getRightFuzzyVinCode(){return this.rightFuzzyVinCode;}
        private List<String> vehicleTypeList;

        public List<String> getVehicleTypeList(){return this.vehicleTypeList;}


        private List<String> fuzzyVehicleType;

        public List<String> getFuzzyVehicleType(){return this.fuzzyVehicleType;}

        private List<String> rightFuzzyVehicleType;

        public List<String> getRightFuzzyVehicleType(){return this.rightFuzzyVehicleType;}
        private List<String> productionCodeList;

        public List<String> getProductionCodeList(){return this.productionCodeList;}


        private List<String> fuzzyProductionCode;

        public List<String> getFuzzyProductionCode(){return this.fuzzyProductionCode;}

        private List<String> rightFuzzyProductionCode;

        public List<String> getRightFuzzyProductionCode(){return this.rightFuzzyProductionCode;}
        private List<String> partsCodeList;

        public List<String> getPartsCodeList(){return this.partsCodeList;}


        private List<String> fuzzyPartsCode;

        public List<String> getFuzzyPartsCode(){return this.fuzzyPartsCode;}

        private List<String> rightFuzzyPartsCode;

        public List<String> getRightFuzzyPartsCode(){return this.rightFuzzyPartsCode;}
        private List<String> partsNameList;

        public List<String> getPartsNameList(){return this.partsNameList;}


        private List<String> fuzzyPartsName;

        public List<String> getFuzzyPartsName(){return this.fuzzyPartsName;}

        private List<String> rightFuzzyPartsName;

        public List<String> getRightFuzzyPartsName(){return this.rightFuzzyPartsName;}
        private List<String> divisionLevel1List;

        public List<String> getDivisionLevel1List(){return this.divisionLevel1List;}


        private List<String> fuzzyDivisionLevel1;

        public List<String> getFuzzyDivisionLevel1(){return this.fuzzyDivisionLevel1;}

        private List<String> rightFuzzyDivisionLevel1;

        public List<String> getRightFuzzyDivisionLevel1(){return this.rightFuzzyDivisionLevel1;}
        private List<String> divisionLevel2List;

        public List<String> getDivisionLevel2List(){return this.divisionLevel2List;}


        private List<String> fuzzyDivisionLevel2;

        public List<String> getFuzzyDivisionLevel2(){return this.fuzzyDivisionLevel2;}

        private List<String> rightFuzzyDivisionLevel2;

        public List<String> getRightFuzzyDivisionLevel2(){return this.rightFuzzyDivisionLevel2;}
        private List<String> divisionLevel3List;

        public List<String> getDivisionLevel3List(){return this.divisionLevel3List;}


        private List<String> fuzzyDivisionLevel3;

        public List<String> getFuzzyDivisionLevel3(){return this.fuzzyDivisionLevel3;}

        private List<String> rightFuzzyDivisionLevel3;

        public List<String> getRightFuzzyDivisionLevel3(){return this.rightFuzzyDivisionLevel3;}
        private List<String> partsAndSymptomList;

        public List<String> getPartsAndSymptomList(){return this.partsAndSymptomList;}


        private List<String> fuzzyPartsAndSymptom;

        public List<String> getFuzzyPartsAndSymptom(){return this.fuzzyPartsAndSymptom;}

        private List<String> rightFuzzyPartsAndSymptom;

        public List<String> getRightFuzzyPartsAndSymptom(){return this.rightFuzzyPartsAndSymptom;}
        private List<String> offlineDateList;

        public List<String> getOfflineDateList(){return this.offlineDateList;}


        private List<String> fuzzyOfflineDate;

        public List<String> getFuzzyOfflineDate(){return this.fuzzyOfflineDate;}

        private List<String> rightFuzzyOfflineDate;

        public List<String> getRightFuzzyOfflineDate(){return this.rightFuzzyOfflineDate;}
        private List<String> salesDateList;

        public List<String> getSalesDateList(){return this.salesDateList;}


        private List<String> fuzzySalesDate;

        public List<String> getFuzzySalesDate(){return this.fuzzySalesDate;}

        private List<String> rightFuzzySalesDate;

        public List<String> getRightFuzzySalesDate(){return this.rightFuzzySalesDate;}
        private List<String> failureDateList;

        public List<String> getFailureDateList(){return this.failureDateList;}


        private List<String> fuzzyFailureDate;

        public List<String> getFuzzyFailureDate(){return this.fuzzyFailureDate;}

        private List<String> rightFuzzyFailureDate;

        public List<String> getRightFuzzyFailureDate(){return this.rightFuzzyFailureDate;}
        private List<Integer> mileageList;

        public List<Integer> getMileageList(){return this.mileageList;}

        private Integer mileageSt;

        private Integer mileageEd;

        public Integer getMileageSt(){return this.mileageSt;}

        public Integer getMileageEd(){return this.mileageEd;}

        private List<String> confirmDateList;

        public List<String> getConfirmDateList(){return this.confirmDateList;}


        private List<String> fuzzyConfirmDate;

        public List<String> getFuzzyConfirmDate(){return this.fuzzyConfirmDate;}

        private List<String> rightFuzzyConfirmDate;

        public List<String> getRightFuzzyConfirmDate(){return this.rightFuzzyConfirmDate;}
        private List<String> warehousingDateList;

        public List<String> getWarehousingDateList(){return this.warehousingDateList;}


        private List<String> fuzzyWarehousingDate;

        public List<String> getFuzzyWarehousingDate(){return this.fuzzyWarehousingDate;}

        private List<String> rightFuzzyWarehousingDate;

        public List<String> getRightFuzzyWarehousingDate(){return this.rightFuzzyWarehousingDate;}
        private List<String> transportDateList;

        public List<String> getTransportDateList(){return this.transportDateList;}


        private List<String> fuzzyTransportDate;

        public List<String> getFuzzyTransportDate(){return this.fuzzyTransportDate;}

        private List<String> rightFuzzyTransportDate;

        public List<String> getRightFuzzyTransportDate(){return this.rightFuzzyTransportDate;}
        private List<String> shopArrivalDateList;

        public List<String> getShopArrivalDateList(){return this.shopArrivalDateList;}


        private List<String> fuzzyShopArrivalDate;

        public List<String> getFuzzyShopArrivalDate(){return this.fuzzyShopArrivalDate;}

        private List<String> rightFuzzyShopArrivalDate;

        public List<String> getRightFuzzyShopArrivalDate(){return this.rightFuzzyShopArrivalDate;}
        private List<Integer> salesFailureTimeList;

        public List<Integer> getSalesFailureTimeList(){return this.salesFailureTimeList;}

        private Integer salesFailureTimeSt;

        private Integer salesFailureTimeEd;

        public Integer getSalesFailureTimeSt(){return this.salesFailureTimeSt;}

        public Integer getSalesFailureTimeEd(){return this.salesFailureTimeEd;}

        private List<String> failureDescList;

        public List<String> getFailureDescList(){return this.failureDescList;}


        private List<String> fuzzyFailureDesc;

        public List<String> getFuzzyFailureDesc(){return this.fuzzyFailureDesc;}

        private List<String> rightFuzzyFailureDesc;

        public List<String> getRightFuzzyFailureDesc(){return this.rightFuzzyFailureDesc;}
        private List<String> diagnosticResultList;

        public List<String> getDiagnosticResultList(){return this.diagnosticResultList;}


        private List<String> fuzzyDiagnosticResult;

        public List<String> getFuzzyDiagnosticResult(){return this.fuzzyDiagnosticResult;}

        private List<String> rightFuzzyDiagnosticResult;

        public List<String> getRightFuzzyDiagnosticResult(){return this.rightFuzzyDiagnosticResult;}
        private List<java.math.BigDecimal> manCostList;

        public List<java.math.BigDecimal> getManCostList(){return this.manCostList;}

        private java.math.BigDecimal manCostSt;

        private java.math.BigDecimal manCostEd;

        public java.math.BigDecimal getManCostSt(){return this.manCostSt;}

        public java.math.BigDecimal getManCostEd(){return this.manCostEd;}

        private List<java.math.BigDecimal> materialCostList;

        public List<java.math.BigDecimal> getMaterialCostList(){return this.materialCostList;}

        private java.math.BigDecimal materialCostSt;

        private java.math.BigDecimal materialCostEd;

        public java.math.BigDecimal getMaterialCostSt(){return this.materialCostSt;}

        public java.math.BigDecimal getMaterialCostEd(){return this.materialCostEd;}

        private List<java.math.BigDecimal> materialManagementCostList;

        public List<java.math.BigDecimal> getMaterialManagementCostList(){return this.materialManagementCostList;}

        private java.math.BigDecimal materialManagementCostSt;

        private java.math.BigDecimal materialManagementCostEd;

        public java.math.BigDecimal getMaterialManagementCostSt(){return this.materialManagementCostSt;}

        public java.math.BigDecimal getMaterialManagementCostEd(){return this.materialManagementCostEd;}

        private List<java.math.BigDecimal> goOutCostList;

        public List<java.math.BigDecimal> getGoOutCostList(){return this.goOutCostList;}

        private java.math.BigDecimal goOutCostSt;

        private java.math.BigDecimal goOutCostEd;

        public java.math.BigDecimal getGoOutCostSt(){return this.goOutCostSt;}

        public java.math.BigDecimal getGoOutCostEd(){return this.goOutCostEd;}

        private List<java.math.BigDecimal> maintainingCostList;

        public List<java.math.BigDecimal> getMaintainingCostList(){return this.maintainingCostList;}

        private java.math.BigDecimal maintainingCostSt;

        private java.math.BigDecimal maintainingCostEd;

        public java.math.BigDecimal getMaintainingCostSt(){return this.maintainingCostSt;}

        public java.math.BigDecimal getMaintainingCostEd(){return this.maintainingCostEd;}

        private List<java.math.BigDecimal> otherCostList;

        public List<java.math.BigDecimal> getOtherCostList(){return this.otherCostList;}

        private java.math.BigDecimal otherCostSt;

        private java.math.BigDecimal otherCostEd;

        public java.math.BigDecimal getOtherCostSt(){return this.otherCostSt;}

        public java.math.BigDecimal getOtherCostEd(){return this.otherCostEd;}

        private List<java.math.BigDecimal> totalCostList;

        public List<java.math.BigDecimal> getTotalCostList(){return this.totalCostList;}

        private java.math.BigDecimal totalCostSt;

        private java.math.BigDecimal totalCostEd;

        public java.math.BigDecimal getTotalCostSt(){return this.totalCostSt;}

        public java.math.BigDecimal getTotalCostEd(){return this.totalCostEd;}

        private List<String> importantLevelList;

        public List<String> getImportantLevelList(){return this.importantLevelList;}


        private List<String> fuzzyImportantLevel;

        public List<String> getFuzzyImportantLevel(){return this.fuzzyImportantLevel;}

        private List<String> rightFuzzyImportantLevel;

        public List<String> getRightFuzzyImportantLevel(){return this.rightFuzzyImportantLevel;}
        private List<String> transmissionTypeList;

        public List<String> getTransmissionTypeList(){return this.transmissionTypeList;}


        private List<String> fuzzyTransmissionType;

        public List<String> getFuzzyTransmissionType(){return this.fuzzyTransmissionType;}

        private List<String> rightFuzzyTransmissionType;

        public List<String> getRightFuzzyTransmissionType(){return this.rightFuzzyTransmissionType;}
        private List<String> newPartsBondList;

        public List<String> getNewPartsBondList(){return this.newPartsBondList;}


        private List<String> fuzzyNewPartsBond;

        public List<String> getFuzzyNewPartsBond(){return this.fuzzyNewPartsBond;}

        private List<String> rightFuzzyNewPartsBond;

        public List<String> getRightFuzzyNewPartsBond(){return this.rightFuzzyNewPartsBond;}
        private List<String> submitDateList;

        public List<String> getSubmitDateList(){return this.submitDateList;}


        private List<String> fuzzySubmitDate;

        public List<String> getFuzzySubmitDate(){return this.fuzzySubmitDate;}

        private List<String> rightFuzzySubmitDate;

        public List<String> getRightFuzzySubmitDate(){return this.rightFuzzySubmitDate;}
        private List<String> egtypeCodeList;

        public List<String> getEgtypeCodeList(){return this.egtypeCodeList;}


        private List<String> fuzzyEgtypeCode;

        public List<String> getFuzzyEgtypeCode(){return this.fuzzyEgtypeCode;}

        private List<String> rightFuzzyEgtypeCode;

        public List<String> getRightFuzzyEgtypeCode(){return this.rightFuzzyEgtypeCode;}
        private List<String> engProductionDateList;

        public List<String> getEngProductionDateList(){return this.engProductionDateList;}


        private List<String> fuzzyEngProductionDate;

        public List<String> getFuzzyEngProductionDate(){return this.fuzzyEngProductionDate;}

        private List<String> rightFuzzyEngProductionDate;

        public List<String> getRightFuzzyEngProductionDate(){return this.rightFuzzyEngProductionDate;}
        private List<String> transmissionCodeList;

        public List<String> getTransmissionCodeList(){return this.transmissionCodeList;}


        private List<String> fuzzyTransmissionCode;

        public List<String> getFuzzyTransmissionCode(){return this.fuzzyTransmissionCode;}

        private List<String> rightFuzzyTransmissionCode;

        public List<String> getRightFuzzyTransmissionCode(){return this.rightFuzzyTransmissionCode;}
        private List<String> transmissionProductionDateList;

        public List<String> getTransmissionProductionDateList(){return this.transmissionProductionDateList;}


        private List<String> fuzzyTransmissionProductionDate;

        public List<String> getFuzzyTransmissionProductionDate(){return this.fuzzyTransmissionProductionDate;}

        private List<String> rightFuzzyTransmissionProductionDate;

        public List<String> getRightFuzzyTransmissionProductionDate(){return this.rightFuzzyTransmissionProductionDate;}
        private List<String> engArrangeList;

        public List<String> getEngArrangeList(){return this.engArrangeList;}


        private List<String> fuzzyEngArrange;

        public List<String> getFuzzyEngArrange(){return this.fuzzyEngArrange;}

        private List<String> rightFuzzyEngArrange;

        public List<String> getRightFuzzyEngArrange(){return this.rightFuzzyEngArrange;}
        private List<String> carModelList;

        public List<String> getCarModelList(){return this.carModelList;}


        private List<String> fuzzyCarModel;

        public List<String> getFuzzyCarModel(){return this.fuzzyCarModel;}

        private List<String> rightFuzzyCarModel;

        public List<String> getRightFuzzyCarModel(){return this.rightFuzzyCarModel;}
        private List<String> engTypeList;

        public List<String> getEngTypeList(){return this.engTypeList;}


        private List<String> fuzzyEngType;

        public List<String> getFuzzyEngType(){return this.fuzzyEngType;}

        private List<String> rightFuzzyEngType;

        public List<String> getRightFuzzyEngType(){return this.rightFuzzyEngType;}
        private List<String> receiveTimeList;

        public List<String> getReceiveTimeList(){return this.receiveTimeList;}


        private List<String> fuzzyReceiveTime;

        public List<String> getFuzzyReceiveTime(){return this.fuzzyReceiveTime;}

        private List<String> rightFuzzyReceiveTime;

        public List<String> getRightFuzzyReceiveTime(){return this.rightFuzzyReceiveTime;}
        private List<String> claimCompensationList;

        public List<String> getClaimCompensationList(){return this.claimCompensationList;}


        private List<String> fuzzyClaimCompensation;

        public List<String> getFuzzyClaimCompensation(){return this.fuzzyClaimCompensation;}

        private List<String> rightFuzzyClaimCompensation;

        public List<String> getRightFuzzyClaimCompensation(){return this.rightFuzzyClaimCompensation;}
        private List<String> productionRawDescriptionList;

        public List<String> getProductionRawDescriptionList(){return this.productionRawDescriptionList;}


        private List<String> fuzzyProductionRawDescription;

        public List<String> getFuzzyProductionRawDescription(){return this.fuzzyProductionRawDescription;}

        private List<String> rightFuzzyProductionRawDescription;

        public List<String> getRightFuzzyProductionRawDescription(){return this.rightFuzzyProductionRawDescription;}
        private List<String> PDIList;

        public List<String> getPDIList(){return this.PDIList;}


        private List<String> fuzzyPDI;

        public List<String> getFuzzyPDI(){return this.fuzzyPDI;}

        private List<String> rightFuzzyPDI;

        public List<String> getRightFuzzyPDI(){return this.rightFuzzyPDI;}
        private List<Integer> offlineFailureTimeList;

        public List<Integer> getOfflineFailureTimeList(){return this.offlineFailureTimeList;}

        private Integer offlineFailureTimeSt;

        private Integer offlineFailureTimeEd;

        public Integer getOfflineFailureTimeSt(){return this.offlineFailureTimeSt;}

        public Integer getOfflineFailureTimeEd(){return this.offlineFailureTimeEd;}

        private List<String> engOrTranList;

        public List<String> getEngOrTranList(){return this.engOrTranList;}


        private List<String> fuzzyEngOrTran;

        public List<String> getFuzzyEngOrTran(){return this.fuzzyEngOrTran;}

        private List<String> rightFuzzyEngOrTran;

        public List<String> getRightFuzzyEngOrTran(){return this.rightFuzzyEngOrTran;}
        private List<String> carSeriesCodeList;

        public List<String> getCarSeriesCodeList(){return this.carSeriesCodeList;}


        private List<String> fuzzyCarSeriesCode;

        public List<String> getFuzzyCarSeriesCode(){return this.fuzzyCarSeriesCode;}

        private List<String> rightFuzzyCarSeriesCode;

        public List<String> getRightFuzzyCarSeriesCode(){return this.rightFuzzyCarSeriesCode;}
        private List<String> shortCodeList;

        public List<String> getShortCodeList(){return this.shortCodeList;}


        private List<String> fuzzyShortCode;

        public List<String> getFuzzyShortCode(){return this.fuzzyShortCode;}

        private List<String> rightFuzzyShortCode;

        public List<String> getRightFuzzyShortCode(){return this.rightFuzzyShortCode;}
        private List<String> faultCodeClassificationList;

        public List<String> getFaultCodeClassificationList(){return this.faultCodeClassificationList;}


        private List<String> fuzzyFaultCodeClassification;

        public List<String> getFuzzyFaultCodeClassification(){return this.fuzzyFaultCodeClassification;}

        private List<String> rightFuzzyFaultCodeClassification;

        public List<String> getRightFuzzyFaultCodeClassification(){return this.rightFuzzyFaultCodeClassification;}
        private List<String> failureYearList;

        public List<String> getFailureYearList(){return this.failureYearList;}


        private List<String> fuzzyFailureYear;

        public List<String> getFuzzyFailureYear(){return this.fuzzyFailureYear;}

        private List<String> rightFuzzyFailureYear;

        public List<String> getRightFuzzyFailureYear(){return this.rightFuzzyFailureYear;}
        private List<String> failureMonthList;

        public List<String> getFailureMonthList(){return this.failureMonthList;}


        private List<String> fuzzyFailureMonth;

        public List<String> getFuzzyFailureMonth(){return this.fuzzyFailureMonth;}

        private List<String> rightFuzzyFailureMonth;

        public List<String> getRightFuzzyFailureMonth(){return this.rightFuzzyFailureMonth;}
        private List<String> transmissionShortCodeList;

        public List<String> getTransmissionShortCodeList(){return this.transmissionShortCodeList;}


        private List<String> fuzzyTransmissionShortCode;

        public List<String> getFuzzyTransmissionShortCode(){return this.fuzzyTransmissionShortCode;}

        private List<String> rightFuzzyTransmissionShortCode;

        public List<String> getRightFuzzyTransmissionShortCode(){return this.rightFuzzyTransmissionShortCode;}
        private List<String> mileageDistributionList;

        public List<String> getMileageDistributionList(){return this.mileageDistributionList;}


        private List<String> fuzzyMileageDistribution;

        public List<String> getFuzzyMileageDistribution(){return this.fuzzyMileageDistribution;}

        private List<String> rightFuzzyMileageDistribution;

        public List<String> getRightFuzzyMileageDistribution(){return this.rightFuzzyMileageDistribution;}
        private List<String> returnRequestList;

        public List<String> getReturnRequestList(){return this.returnRequestList;}


        private List<String> fuzzyReturnRequest;

        public List<String> getFuzzyReturnRequest(){return this.fuzzyReturnRequest;}

        private List<String> rightFuzzyReturnRequest;

        public List<String> getRightFuzzyReturnRequest(){return this.rightFuzzyReturnRequest;}
        private List<String> returnDateList;

        public List<String> getReturnDateList(){return this.returnDateList;}


        private List<String> fuzzyReturnDate;

        public List<String> getFuzzyReturnDate(){return this.fuzzyReturnDate;}

        private List<String> rightFuzzyReturnDate;

        public List<String> getRightFuzzyReturnDate(){return this.rightFuzzyReturnDate;}
        private List<String> arriveDateList;

        public List<String> getArriveDateList(){return this.arriveDateList;}


        private List<String> fuzzyArriveDate;

        public List<String> getFuzzyArriveDate(){return this.fuzzyArriveDate;}

        private List<String> rightFuzzyArriveDate;

        public List<String> getRightFuzzyArriveDate(){return this.rightFuzzyArriveDate;}
        private List<String> loadingVerificationList;

        public List<String> getLoadingVerificationList(){return this.loadingVerificationList;}


        private List<String> fuzzyLoadingVerification;

        public List<String> getFuzzyLoadingVerification(){return this.fuzzyLoadingVerification;}

        private List<String> rightFuzzyLoadingVerification;

        public List<String> getRightFuzzyLoadingVerification(){return this.rightFuzzyLoadingVerification;}
        private List<String> faultReconstructionerList;

        public List<String> getFaultReconstructionerList(){return this.faultReconstructionerList;}


        private List<String> fuzzyFaultReconstructioner;

        public List<String> getFuzzyFaultReconstructioner(){return this.fuzzyFaultReconstructioner;}

        private List<String> rightFuzzyFaultReconstructioner;

        public List<String> getRightFuzzyFaultReconstructioner(){return this.rightFuzzyFaultReconstructioner;}
        private List<String> loadingDateList;

        public List<String> getLoadingDateList(){return this.loadingDateList;}


        private List<String> fuzzyLoadingDate;

        public List<String> getFuzzyLoadingDate(){return this.fuzzyLoadingDate;}

        private List<String> rightFuzzyLoadingDate;

        public List<String> getRightFuzzyLoadingDate(){return this.rightFuzzyLoadingDate;}
        private List<String> faultReconstructionList;

        public List<String> getFaultReconstructionList(){return this.faultReconstructionList;}


        private List<String> fuzzyFaultReconstruction;

        public List<String> getFuzzyFaultReconstruction(){return this.fuzzyFaultReconstruction;}

        private List<String> rightFuzzyFaultReconstruction;

        public List<String> getRightFuzzyFaultReconstruction(){return this.rightFuzzyFaultReconstruction;}
        private List<String> faultReconstructionDateList;

        public List<String> getFaultReconstructionDateList(){return this.faultReconstructionDateList;}


        private List<String> fuzzyFaultReconstructionDate;

        public List<String> getFuzzyFaultReconstructionDate(){return this.fuzzyFaultReconstructionDate;}

        private List<String> rightFuzzyFaultReconstructionDate;

        public List<String> getRightFuzzyFaultReconstructionDate(){return this.rightFuzzyFaultReconstructionDate;}
        private List<String> transferDate1List;

        public List<String> getTransferDate1List(){return this.transferDate1List;}


        private List<String> fuzzyTransferDate1;

        public List<String> getFuzzyTransferDate1(){return this.fuzzyTransferDate1;}

        private List<String> rightFuzzyTransferDate1;

        public List<String> getRightFuzzyTransferDate1(){return this.rightFuzzyTransferDate1;}
        private List<String> responsible1List;

        public List<String> getResponsible1List(){return this.responsible1List;}


        private List<String> fuzzyResponsible1;

        public List<String> getFuzzyResponsible1(){return this.fuzzyResponsible1;}

        private List<String> rightFuzzyResponsible1;

        public List<String> getRightFuzzyResponsible1(){return this.rightFuzzyResponsible1;}
        private List<String> transferDate2List;

        public List<String> getTransferDate2List(){return this.transferDate2List;}


        private List<String> fuzzyTransferDate2;

        public List<String> getFuzzyTransferDate2(){return this.fuzzyTransferDate2;}

        private List<String> rightFuzzyTransferDate2;

        public List<String> getRightFuzzyTransferDate2(){return this.rightFuzzyTransferDate2;}
        private List<String> responsible2List;

        public List<String> getResponsible2List(){return this.responsible2List;}


        private List<String> fuzzyResponsible2;

        public List<String> getFuzzyResponsible2(){return this.fuzzyResponsible2;}

        private List<String> rightFuzzyResponsible2;

        public List<String> getRightFuzzyResponsible2(){return this.rightFuzzyResponsible2;}
        private List<String> estimateMeetingDateList;

        public List<String> getEstimateMeetingDateList(){return this.estimateMeetingDateList;}


        private List<String> fuzzyEstimateMeetingDate;

        public List<String> getFuzzyEstimateMeetingDate(){return this.fuzzyEstimateMeetingDate;}

        private List<String> rightFuzzyEstimateMeetingDate;

        public List<String> getRightFuzzyEstimateMeetingDate(){return this.rightFuzzyEstimateMeetingDate;}
        private List<String> submitReportList;

        public List<String> getSubmitReportList(){return this.submitReportList;}


        private List<String> fuzzySubmitReport;

        public List<String> getFuzzySubmitReport(){return this.fuzzySubmitReport;}

        private List<String> rightFuzzySubmitReport;

        public List<String> getRightFuzzySubmitReport(){return this.rightFuzzySubmitReport;}
        private List<String> reasonList;

        public List<String> getReasonList(){return this.reasonList;}


        private List<String> fuzzyReason;

        public List<String> getFuzzyReason(){return this.fuzzyReason;}

        private List<String> rightFuzzyReason;

        public List<String> getRightFuzzyReason(){return this.rightFuzzyReason;}
        private List<String> countermeasureList;

        public List<String> getCountermeasureList(){return this.countermeasureList;}


        private List<String> fuzzyCountermeasure;

        public List<String> getFuzzyCountermeasure(){return this.fuzzyCountermeasure;}

        private List<String> rightFuzzyCountermeasure;

        public List<String> getRightFuzzyCountermeasure(){return this.rightFuzzyCountermeasure;}
        private List<String> reportSubmitList;

        public List<String> getReportSubmitList(){return this.reportSubmitList;}


        private List<String> fuzzyReportSubmit;

        public List<String> getFuzzyReportSubmit(){return this.fuzzyReportSubmit;}

        private List<String> rightFuzzyReportSubmit;

        public List<String> getRightFuzzyReportSubmit(){return this.rightFuzzyReportSubmit;}
        private List<String> claimIndemnityList;

        public List<String> getClaimIndemnityList(){return this.claimIndemnityList;}


        private List<String> fuzzyClaimIndemnity;

        public List<String> getFuzzyClaimIndemnity(){return this.fuzzyClaimIndemnity;}

        private List<String> rightFuzzyClaimIndemnity;

        public List<String> getRightFuzzyClaimIndemnity(){return this.rightFuzzyClaimIndemnity;}
        private List<String> questionTypeList;

        public List<String> getQuestionTypeList(){return this.questionTypeList;}


        private List<String> fuzzyQuestionType;

        public List<String> getFuzzyQuestionType(){return this.fuzzyQuestionType;}

        private List<String> rightFuzzyQuestionType;

        public List<String> getRightFuzzyQuestionType(){return this.rightFuzzyQuestionType;}
        private List<String> questionStateList;

        public List<String> getQuestionStateList(){return this.questionStateList;}


        private List<String> fuzzyQuestionState;

        public List<String> getFuzzyQuestionState(){return this.fuzzyQuestionState;}

        private List<String> rightFuzzyQuestionState;

        public List<String> getRightFuzzyQuestionState(){return this.rightFuzzyQuestionState;}
        private List<String> responsibleDepartmentList;

        public List<String> getResponsibleDepartmentList(){return this.responsibleDepartmentList;}


        private List<String> fuzzyResponsibleDepartment;

        public List<String> getFuzzyResponsibleDepartment(){return this.fuzzyResponsibleDepartment;}

        private List<String> rightFuzzyResponsibleDepartment;

        public List<String> getRightFuzzyResponsibleDepartment(){return this.rightFuzzyResponsibleDepartment;}
        private List<Integer> applierIdList;

        public List<Integer> getApplierIdList(){return this.applierIdList;}

        private Integer applierIdSt;

        private Integer applierIdEd;

        public Integer getApplierIdSt(){return this.applierIdSt;}

        public Integer getApplierIdEd(){return this.applierIdEd;}

        private List<String> applierNameList;

        public List<String> getApplierNameList(){return this.applierNameList;}


        private List<String> fuzzyApplierName;

        public List<String> getFuzzyApplierName(){return this.fuzzyApplierName;}

        private List<String> rightFuzzyApplierName;

        public List<String> getRightFuzzyApplierName(){return this.rightFuzzyApplierName;}
        private List<String> applyTimeList;

        public List<String> getApplyTimeList(){return this.applyTimeList;}


        private List<String> fuzzyApplyTime;

        public List<String> getFuzzyApplyTime(){return this.fuzzyApplyTime;}

        private List<String> rightFuzzyApplyTime;

        public List<String> getRightFuzzyApplyTime(){return this.rightFuzzyApplyTime;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder voucherIdBetWeen(Integer voucherIdSt,Integer voucherIdEd){
            this.voucherIdSt = voucherIdSt;
            this.voucherIdEd = voucherIdEd;
            return this;
        }

        public QueryBuilder voucherIdGreaterEqThan(Integer voucherIdSt){
            this.voucherIdSt = voucherIdSt;
            return this;
        }
        public QueryBuilder voucherIdLessEqThan(Integer voucherIdEd){
            this.voucherIdEd = voucherIdEd;
            return this;
        }


        public QueryBuilder voucherId(Integer voucherId){
            setVoucherId(voucherId);
            return this;
        }

        public QueryBuilder voucherIdList(Integer ... voucherId){
            this.voucherIdList = solveNullList(voucherId);
            return this;
        }

        public QueryBuilder voucherIdList(List<Integer> voucherId){
            this.voucherIdList = voucherId;
            return this;
        }

        public QueryBuilder fetchVoucherId(){
            setFetchFields("fetchFields","voucherId");
            return this;
        }

        public QueryBuilder excludeVoucherId(){
            setFetchFields("excludeFields","voucherId");
            return this;
        }

        public QueryBuilder fuzzyVoucherCode (List<String> fuzzyVoucherCode){
            this.fuzzyVoucherCode = fuzzyVoucherCode;
            return this;
        }

        public QueryBuilder fuzzyVoucherCode (String ... fuzzyVoucherCode){
            this.fuzzyVoucherCode = solveNullList(fuzzyVoucherCode);
            return this;
        }

        public QueryBuilder rightFuzzyVoucherCode (List<String> rightFuzzyVoucherCode){
            this.rightFuzzyVoucherCode = rightFuzzyVoucherCode;
            return this;
        }

        public QueryBuilder rightFuzzyVoucherCode (String ... rightFuzzyVoucherCode){
            this.rightFuzzyVoucherCode = solveNullList(rightFuzzyVoucherCode);
            return this;
        }

        public QueryBuilder voucherCode(String voucherCode){
            setVoucherCode(voucherCode);
            return this;
        }

        public QueryBuilder voucherCodeList(String ... voucherCode){
            this.voucherCodeList = solveNullList(voucherCode);
            return this;
        }

        public QueryBuilder voucherCodeList(List<String> voucherCode){
            this.voucherCodeList = voucherCode;
            return this;
        }

        public QueryBuilder fetchVoucherCode(){
            setFetchFields("fetchFields","voucherCode");
            return this;
        }

        public QueryBuilder excludeVoucherCode(){
            setFetchFields("excludeFields","voucherCode");
            return this;
        }

        public QueryBuilder fuzzyClaimCode (List<String> fuzzyClaimCode){
            this.fuzzyClaimCode = fuzzyClaimCode;
            return this;
        }

        public QueryBuilder fuzzyClaimCode (String ... fuzzyClaimCode){
            this.fuzzyClaimCode = solveNullList(fuzzyClaimCode);
            return this;
        }

        public QueryBuilder rightFuzzyClaimCode (List<String> rightFuzzyClaimCode){
            this.rightFuzzyClaimCode = rightFuzzyClaimCode;
            return this;
        }

        public QueryBuilder rightFuzzyClaimCode (String ... rightFuzzyClaimCode){
            this.rightFuzzyClaimCode = solveNullList(rightFuzzyClaimCode);
            return this;
        }

        public QueryBuilder claimCode(String claimCode){
            setClaimCode(claimCode);
            return this;
        }

        public QueryBuilder claimCodeList(String ... claimCode){
            this.claimCodeList = solveNullList(claimCode);
            return this;
        }

        public QueryBuilder claimCodeList(List<String> claimCode){
            this.claimCodeList = claimCode;
            return this;
        }

        public QueryBuilder fetchClaimCode(){
            setFetchFields("fetchFields","claimCode");
            return this;
        }

        public QueryBuilder excludeClaimCode(){
            setFetchFields("excludeFields","claimCode");
            return this;
        }

        public QueryBuilder fuzzyDealerCode (List<String> fuzzyDealerCode){
            this.fuzzyDealerCode = fuzzyDealerCode;
            return this;
        }

        public QueryBuilder fuzzyDealerCode (String ... fuzzyDealerCode){
            this.fuzzyDealerCode = solveNullList(fuzzyDealerCode);
            return this;
        }

        public QueryBuilder rightFuzzyDealerCode (List<String> rightFuzzyDealerCode){
            this.rightFuzzyDealerCode = rightFuzzyDealerCode;
            return this;
        }

        public QueryBuilder rightFuzzyDealerCode (String ... rightFuzzyDealerCode){
            this.rightFuzzyDealerCode = solveNullList(rightFuzzyDealerCode);
            return this;
        }

        public QueryBuilder dealerCode(String dealerCode){
            setDealerCode(dealerCode);
            return this;
        }

        public QueryBuilder dealerCodeList(String ... dealerCode){
            this.dealerCodeList = solveNullList(dealerCode);
            return this;
        }

        public QueryBuilder dealerCodeList(List<String> dealerCode){
            this.dealerCodeList = dealerCode;
            return this;
        }

        public QueryBuilder fetchDealerCode(){
            setFetchFields("fetchFields","dealerCode");
            return this;
        }

        public QueryBuilder excludeDealerCode(){
            setFetchFields("excludeFields","dealerCode");
            return this;
        }

        public QueryBuilder fuzzyDealerName (List<String> fuzzyDealerName){
            this.fuzzyDealerName = fuzzyDealerName;
            return this;
        }

        public QueryBuilder fuzzyDealerName (String ... fuzzyDealerName){
            this.fuzzyDealerName = solveNullList(fuzzyDealerName);
            return this;
        }

        public QueryBuilder rightFuzzyDealerName (List<String> rightFuzzyDealerName){
            this.rightFuzzyDealerName = rightFuzzyDealerName;
            return this;
        }

        public QueryBuilder rightFuzzyDealerName (String ... rightFuzzyDealerName){
            this.rightFuzzyDealerName = solveNullList(rightFuzzyDealerName);
            return this;
        }

        public QueryBuilder dealerName(String dealerName){
            setDealerName(dealerName);
            return this;
        }

        public QueryBuilder dealerNameList(String ... dealerName){
            this.dealerNameList = solveNullList(dealerName);
            return this;
        }

        public QueryBuilder dealerNameList(List<String> dealerName){
            this.dealerNameList = dealerName;
            return this;
        }

        public QueryBuilder fetchDealerName(){
            setFetchFields("fetchFields","dealerName");
            return this;
        }

        public QueryBuilder excludeDealerName(){
            setFetchFields("excludeFields","dealerName");
            return this;
        }

        public QueryBuilder fuzzyDealerShortName (List<String> fuzzyDealerShortName){
            this.fuzzyDealerShortName = fuzzyDealerShortName;
            return this;
        }

        public QueryBuilder fuzzyDealerShortName (String ... fuzzyDealerShortName){
            this.fuzzyDealerShortName = solveNullList(fuzzyDealerShortName);
            return this;
        }

        public QueryBuilder rightFuzzyDealerShortName (List<String> rightFuzzyDealerShortName){
            this.rightFuzzyDealerShortName = rightFuzzyDealerShortName;
            return this;
        }

        public QueryBuilder rightFuzzyDealerShortName (String ... rightFuzzyDealerShortName){
            this.rightFuzzyDealerShortName = solveNullList(rightFuzzyDealerShortName);
            return this;
        }

        public QueryBuilder dealerShortName(String dealerShortName){
            setDealerShortName(dealerShortName);
            return this;
        }

        public QueryBuilder dealerShortNameList(String ... dealerShortName){
            this.dealerShortNameList = solveNullList(dealerShortName);
            return this;
        }

        public QueryBuilder dealerShortNameList(List<String> dealerShortName){
            this.dealerShortNameList = dealerShortName;
            return this;
        }

        public QueryBuilder fetchDealerShortName(){
            setFetchFields("fetchFields","dealerShortName");
            return this;
        }

        public QueryBuilder excludeDealerShortName(){
            setFetchFields("excludeFields","dealerShortName");
            return this;
        }

        public QueryBuilder fuzzyTheme (List<String> fuzzyTheme){
            this.fuzzyTheme = fuzzyTheme;
            return this;
        }

        public QueryBuilder fuzzyTheme (String ... fuzzyTheme){
            this.fuzzyTheme = solveNullList(fuzzyTheme);
            return this;
        }

        public QueryBuilder rightFuzzyTheme (List<String> rightFuzzyTheme){
            this.rightFuzzyTheme = rightFuzzyTheme;
            return this;
        }

        public QueryBuilder rightFuzzyTheme (String ... rightFuzzyTheme){
            this.rightFuzzyTheme = solveNullList(rightFuzzyTheme);
            return this;
        }

        public QueryBuilder theme(String theme){
            setTheme(theme);
            return this;
        }

        public QueryBuilder themeList(String ... theme){
            this.themeList = solveNullList(theme);
            return this;
        }

        public QueryBuilder themeList(List<String> theme){
            this.themeList = theme;
            return this;
        }

        public QueryBuilder fetchTheme(){
            setFetchFields("fetchFields","theme");
            return this;
        }

        public QueryBuilder excludeTheme(){
            setFetchFields("excludeFields","theme");
            return this;
        }

        public QueryBuilder fuzzyVinCode (List<String> fuzzyVinCode){
            this.fuzzyVinCode = fuzzyVinCode;
            return this;
        }

        public QueryBuilder fuzzyVinCode (String ... fuzzyVinCode){
            this.fuzzyVinCode = solveNullList(fuzzyVinCode);
            return this;
        }

        public QueryBuilder rightFuzzyVinCode (List<String> rightFuzzyVinCode){
            this.rightFuzzyVinCode = rightFuzzyVinCode;
            return this;
        }

        public QueryBuilder rightFuzzyVinCode (String ... rightFuzzyVinCode){
            this.rightFuzzyVinCode = solveNullList(rightFuzzyVinCode);
            return this;
        }

        public QueryBuilder vinCode(String vinCode){
            setVinCode(vinCode);
            return this;
        }

        public QueryBuilder vinCodeList(String ... vinCode){
            this.vinCodeList = solveNullList(vinCode);
            return this;
        }

        public QueryBuilder vinCodeList(List<String> vinCode){
            this.vinCodeList = vinCode;
            return this;
        }

        public QueryBuilder fetchVinCode(){
            setFetchFields("fetchFields","vinCode");
            return this;
        }

        public QueryBuilder excludeVinCode(){
            setFetchFields("excludeFields","vinCode");
            return this;
        }

        public QueryBuilder fuzzyVehicleType (List<String> fuzzyVehicleType){
            this.fuzzyVehicleType = fuzzyVehicleType;
            return this;
        }

        public QueryBuilder fuzzyVehicleType (String ... fuzzyVehicleType){
            this.fuzzyVehicleType = solveNullList(fuzzyVehicleType);
            return this;
        }

        public QueryBuilder rightFuzzyVehicleType (List<String> rightFuzzyVehicleType){
            this.rightFuzzyVehicleType = rightFuzzyVehicleType;
            return this;
        }

        public QueryBuilder rightFuzzyVehicleType (String ... rightFuzzyVehicleType){
            this.rightFuzzyVehicleType = solveNullList(rightFuzzyVehicleType);
            return this;
        }

        public QueryBuilder vehicleType(String vehicleType){
            setVehicleType(vehicleType);
            return this;
        }

        public QueryBuilder vehicleTypeList(String ... vehicleType){
            this.vehicleTypeList = solveNullList(vehicleType);
            return this;
        }

        public QueryBuilder vehicleTypeList(List<String> vehicleType){
            this.vehicleTypeList = vehicleType;
            return this;
        }

        public QueryBuilder fetchVehicleType(){
            setFetchFields("fetchFields","vehicleType");
            return this;
        }

        public QueryBuilder excludeVehicleType(){
            setFetchFields("excludeFields","vehicleType");
            return this;
        }

        public QueryBuilder fuzzyProductionCode (List<String> fuzzyProductionCode){
            this.fuzzyProductionCode = fuzzyProductionCode;
            return this;
        }

        public QueryBuilder fuzzyProductionCode (String ... fuzzyProductionCode){
            this.fuzzyProductionCode = solveNullList(fuzzyProductionCode);
            return this;
        }

        public QueryBuilder rightFuzzyProductionCode (List<String> rightFuzzyProductionCode){
            this.rightFuzzyProductionCode = rightFuzzyProductionCode;
            return this;
        }

        public QueryBuilder rightFuzzyProductionCode (String ... rightFuzzyProductionCode){
            this.rightFuzzyProductionCode = solveNullList(rightFuzzyProductionCode);
            return this;
        }

        public QueryBuilder productionCode(String productionCode){
            setProductionCode(productionCode);
            return this;
        }

        public QueryBuilder productionCodeList(String ... productionCode){
            this.productionCodeList = solveNullList(productionCode);
            return this;
        }

        public QueryBuilder productionCodeList(List<String> productionCode){
            this.productionCodeList = productionCode;
            return this;
        }

        public QueryBuilder fetchProductionCode(){
            setFetchFields("fetchFields","productionCode");
            return this;
        }

        public QueryBuilder excludeProductionCode(){
            setFetchFields("excludeFields","productionCode");
            return this;
        }

        public QueryBuilder fuzzyPartsCode (List<String> fuzzyPartsCode){
            this.fuzzyPartsCode = fuzzyPartsCode;
            return this;
        }

        public QueryBuilder fuzzyPartsCode (String ... fuzzyPartsCode){
            this.fuzzyPartsCode = solveNullList(fuzzyPartsCode);
            return this;
        }

        public QueryBuilder rightFuzzyPartsCode (List<String> rightFuzzyPartsCode){
            this.rightFuzzyPartsCode = rightFuzzyPartsCode;
            return this;
        }

        public QueryBuilder rightFuzzyPartsCode (String ... rightFuzzyPartsCode){
            this.rightFuzzyPartsCode = solveNullList(rightFuzzyPartsCode);
            return this;
        }

        public QueryBuilder partsCode(String partsCode){
            setPartsCode(partsCode);
            return this;
        }

        public QueryBuilder partsCodeList(String ... partsCode){
            this.partsCodeList = solveNullList(partsCode);
            return this;
        }

        public QueryBuilder partsCodeList(List<String> partsCode){
            this.partsCodeList = partsCode;
            return this;
        }

        public QueryBuilder fetchPartsCode(){
            setFetchFields("fetchFields","partsCode");
            return this;
        }

        public QueryBuilder excludePartsCode(){
            setFetchFields("excludeFields","partsCode");
            return this;
        }

        public QueryBuilder fuzzyPartsName (List<String> fuzzyPartsName){
            this.fuzzyPartsName = fuzzyPartsName;
            return this;
        }

        public QueryBuilder fuzzyPartsName (String ... fuzzyPartsName){
            this.fuzzyPartsName = solveNullList(fuzzyPartsName);
            return this;
        }

        public QueryBuilder rightFuzzyPartsName (List<String> rightFuzzyPartsName){
            this.rightFuzzyPartsName = rightFuzzyPartsName;
            return this;
        }

        public QueryBuilder rightFuzzyPartsName (String ... rightFuzzyPartsName){
            this.rightFuzzyPartsName = solveNullList(rightFuzzyPartsName);
            return this;
        }

        public QueryBuilder partsName(String partsName){
            setPartsName(partsName);
            return this;
        }

        public QueryBuilder partsNameList(String ... partsName){
            this.partsNameList = solveNullList(partsName);
            return this;
        }

        public QueryBuilder partsNameList(List<String> partsName){
            this.partsNameList = partsName;
            return this;
        }

        public QueryBuilder fetchPartsName(){
            setFetchFields("fetchFields","partsName");
            return this;
        }

        public QueryBuilder excludePartsName(){
            setFetchFields("excludeFields","partsName");
            return this;
        }

        public QueryBuilder fuzzyDivisionLevel1 (List<String> fuzzyDivisionLevel1){
            this.fuzzyDivisionLevel1 = fuzzyDivisionLevel1;
            return this;
        }

        public QueryBuilder fuzzyDivisionLevel1 (String ... fuzzyDivisionLevel1){
            this.fuzzyDivisionLevel1 = solveNullList(fuzzyDivisionLevel1);
            return this;
        }

        public QueryBuilder rightFuzzyDivisionLevel1 (List<String> rightFuzzyDivisionLevel1){
            this.rightFuzzyDivisionLevel1 = rightFuzzyDivisionLevel1;
            return this;
        }

        public QueryBuilder rightFuzzyDivisionLevel1 (String ... rightFuzzyDivisionLevel1){
            this.rightFuzzyDivisionLevel1 = solveNullList(rightFuzzyDivisionLevel1);
            return this;
        }

        public QueryBuilder divisionLevel1(String divisionLevel1){
            setDivisionLevel1(divisionLevel1);
            return this;
        }

        public QueryBuilder divisionLevel1List(String ... divisionLevel1){
            this.divisionLevel1List = solveNullList(divisionLevel1);
            return this;
        }

        public QueryBuilder divisionLevel1List(List<String> divisionLevel1){
            this.divisionLevel1List = divisionLevel1;
            return this;
        }

        public QueryBuilder fetchDivisionLevel1(){
            setFetchFields("fetchFields","divisionLevel1");
            return this;
        }

        public QueryBuilder excludeDivisionLevel1(){
            setFetchFields("excludeFields","divisionLevel1");
            return this;
        }

        public QueryBuilder fuzzyDivisionLevel2 (List<String> fuzzyDivisionLevel2){
            this.fuzzyDivisionLevel2 = fuzzyDivisionLevel2;
            return this;
        }

        public QueryBuilder fuzzyDivisionLevel2 (String ... fuzzyDivisionLevel2){
            this.fuzzyDivisionLevel2 = solveNullList(fuzzyDivisionLevel2);
            return this;
        }

        public QueryBuilder rightFuzzyDivisionLevel2 (List<String> rightFuzzyDivisionLevel2){
            this.rightFuzzyDivisionLevel2 = rightFuzzyDivisionLevel2;
            return this;
        }

        public QueryBuilder rightFuzzyDivisionLevel2 (String ... rightFuzzyDivisionLevel2){
            this.rightFuzzyDivisionLevel2 = solveNullList(rightFuzzyDivisionLevel2);
            return this;
        }

        public QueryBuilder divisionLevel2(String divisionLevel2){
            setDivisionLevel2(divisionLevel2);
            return this;
        }

        public QueryBuilder divisionLevel2List(String ... divisionLevel2){
            this.divisionLevel2List = solveNullList(divisionLevel2);
            return this;
        }

        public QueryBuilder divisionLevel2List(List<String> divisionLevel2){
            this.divisionLevel2List = divisionLevel2;
            return this;
        }

        public QueryBuilder fetchDivisionLevel2(){
            setFetchFields("fetchFields","divisionLevel2");
            return this;
        }

        public QueryBuilder excludeDivisionLevel2(){
            setFetchFields("excludeFields","divisionLevel2");
            return this;
        }

        public QueryBuilder fuzzyDivisionLevel3 (List<String> fuzzyDivisionLevel3){
            this.fuzzyDivisionLevel3 = fuzzyDivisionLevel3;
            return this;
        }

        public QueryBuilder fuzzyDivisionLevel3 (String ... fuzzyDivisionLevel3){
            this.fuzzyDivisionLevel3 = solveNullList(fuzzyDivisionLevel3);
            return this;
        }

        public QueryBuilder rightFuzzyDivisionLevel3 (List<String> rightFuzzyDivisionLevel3){
            this.rightFuzzyDivisionLevel3 = rightFuzzyDivisionLevel3;
            return this;
        }

        public QueryBuilder rightFuzzyDivisionLevel3 (String ... rightFuzzyDivisionLevel3){
            this.rightFuzzyDivisionLevel3 = solveNullList(rightFuzzyDivisionLevel3);
            return this;
        }

        public QueryBuilder divisionLevel3(String divisionLevel3){
            setDivisionLevel3(divisionLevel3);
            return this;
        }

        public QueryBuilder divisionLevel3List(String ... divisionLevel3){
            this.divisionLevel3List = solveNullList(divisionLevel3);
            return this;
        }

        public QueryBuilder divisionLevel3List(List<String> divisionLevel3){
            this.divisionLevel3List = divisionLevel3;
            return this;
        }

        public QueryBuilder fetchDivisionLevel3(){
            setFetchFields("fetchFields","divisionLevel3");
            return this;
        }

        public QueryBuilder excludeDivisionLevel3(){
            setFetchFields("excludeFields","divisionLevel3");
            return this;
        }

        public QueryBuilder fuzzyPartsAndSymptom (List<String> fuzzyPartsAndSymptom){
            this.fuzzyPartsAndSymptom = fuzzyPartsAndSymptom;
            return this;
        }

        public QueryBuilder fuzzyPartsAndSymptom (String ... fuzzyPartsAndSymptom){
            this.fuzzyPartsAndSymptom = solveNullList(fuzzyPartsAndSymptom);
            return this;
        }

        public QueryBuilder rightFuzzyPartsAndSymptom (List<String> rightFuzzyPartsAndSymptom){
            this.rightFuzzyPartsAndSymptom = rightFuzzyPartsAndSymptom;
            return this;
        }

        public QueryBuilder rightFuzzyPartsAndSymptom (String ... rightFuzzyPartsAndSymptom){
            this.rightFuzzyPartsAndSymptom = solveNullList(rightFuzzyPartsAndSymptom);
            return this;
        }

        public QueryBuilder partsAndSymptom(String partsAndSymptom){
            setPartsAndSymptom(partsAndSymptom);
            return this;
        }

        public QueryBuilder partsAndSymptomList(String ... partsAndSymptom){
            this.partsAndSymptomList = solveNullList(partsAndSymptom);
            return this;
        }

        public QueryBuilder partsAndSymptomList(List<String> partsAndSymptom){
            this.partsAndSymptomList = partsAndSymptom;
            return this;
        }

        public QueryBuilder fetchPartsAndSymptom(){
            setFetchFields("fetchFields","partsAndSymptom");
            return this;
        }

        public QueryBuilder excludePartsAndSymptom(){
            setFetchFields("excludeFields","partsAndSymptom");
            return this;
        }

        public QueryBuilder fuzzyOfflineDate (List<String> fuzzyOfflineDate){
            this.fuzzyOfflineDate = fuzzyOfflineDate;
            return this;
        }

        public QueryBuilder fuzzyOfflineDate (String ... fuzzyOfflineDate){
            this.fuzzyOfflineDate = solveNullList(fuzzyOfflineDate);
            return this;
        }

        public QueryBuilder rightFuzzyOfflineDate (List<String> rightFuzzyOfflineDate){
            this.rightFuzzyOfflineDate = rightFuzzyOfflineDate;
            return this;
        }

        public QueryBuilder rightFuzzyOfflineDate (String ... rightFuzzyOfflineDate){
            this.rightFuzzyOfflineDate = solveNullList(rightFuzzyOfflineDate);
            return this;
        }

        public QueryBuilder offlineDate(String offlineDate){
            setOfflineDate(offlineDate);
            return this;
        }

        public QueryBuilder offlineDateList(String ... offlineDate){
            this.offlineDateList = solveNullList(offlineDate);
            return this;
        }

        public QueryBuilder offlineDateList(List<String> offlineDate){
            this.offlineDateList = offlineDate;
            return this;
        }

        public QueryBuilder fetchOfflineDate(){
            setFetchFields("fetchFields","offlineDate");
            return this;
        }

        public QueryBuilder excludeOfflineDate(){
            setFetchFields("excludeFields","offlineDate");
            return this;
        }

        public QueryBuilder fuzzySalesDate (List<String> fuzzySalesDate){
            this.fuzzySalesDate = fuzzySalesDate;
            return this;
        }

        public QueryBuilder fuzzySalesDate (String ... fuzzySalesDate){
            this.fuzzySalesDate = solveNullList(fuzzySalesDate);
            return this;
        }

        public QueryBuilder rightFuzzySalesDate (List<String> rightFuzzySalesDate){
            this.rightFuzzySalesDate = rightFuzzySalesDate;
            return this;
        }

        public QueryBuilder rightFuzzySalesDate (String ... rightFuzzySalesDate){
            this.rightFuzzySalesDate = solveNullList(rightFuzzySalesDate);
            return this;
        }

        public QueryBuilder salesDate(String salesDate){
            setSalesDate(salesDate);
            return this;
        }

        public QueryBuilder salesDateList(String ... salesDate){
            this.salesDateList = solveNullList(salesDate);
            return this;
        }

        public QueryBuilder salesDateList(List<String> salesDate){
            this.salesDateList = salesDate;
            return this;
        }

        public QueryBuilder fetchSalesDate(){
            setFetchFields("fetchFields","salesDate");
            return this;
        }

        public QueryBuilder excludeSalesDate(){
            setFetchFields("excludeFields","salesDate");
            return this;
        }

        public QueryBuilder fuzzyFailureDate (List<String> fuzzyFailureDate){
            this.fuzzyFailureDate = fuzzyFailureDate;
            return this;
        }

        public QueryBuilder fuzzyFailureDate (String ... fuzzyFailureDate){
            this.fuzzyFailureDate = solveNullList(fuzzyFailureDate);
            return this;
        }

        public QueryBuilder rightFuzzyFailureDate (List<String> rightFuzzyFailureDate){
            this.rightFuzzyFailureDate = rightFuzzyFailureDate;
            return this;
        }

        public QueryBuilder rightFuzzyFailureDate (String ... rightFuzzyFailureDate){
            this.rightFuzzyFailureDate = solveNullList(rightFuzzyFailureDate);
            return this;
        }

        public QueryBuilder failureDate(String failureDate){
            setFailureDate(failureDate);
            return this;
        }

        public QueryBuilder failureDateList(String ... failureDate){
            this.failureDateList = solveNullList(failureDate);
            return this;
        }

        public QueryBuilder failureDateList(List<String> failureDate){
            this.failureDateList = failureDate;
            return this;
        }

        public QueryBuilder fetchFailureDate(){
            setFetchFields("fetchFields","failureDate");
            return this;
        }

        public QueryBuilder excludeFailureDate(){
            setFetchFields("excludeFields","failureDate");
            return this;
        }

        public QueryBuilder mileageBetWeen(Integer mileageSt,Integer mileageEd){
            this.mileageSt = mileageSt;
            this.mileageEd = mileageEd;
            return this;
        }

        public QueryBuilder mileageGreaterEqThan(Integer mileageSt){
            this.mileageSt = mileageSt;
            return this;
        }
        public QueryBuilder mileageLessEqThan(Integer mileageEd){
            this.mileageEd = mileageEd;
            return this;
        }


        public QueryBuilder mileage(Integer mileage){
            setMileage(mileage);
            return this;
        }

        public QueryBuilder mileageList(Integer ... mileage){
            this.mileageList = solveNullList(mileage);
            return this;
        }

        public QueryBuilder mileageList(List<Integer> mileage){
            this.mileageList = mileage;
            return this;
        }

        public QueryBuilder fetchMileage(){
            setFetchFields("fetchFields","mileage");
            return this;
        }

        public QueryBuilder excludeMileage(){
            setFetchFields("excludeFields","mileage");
            return this;
        }

        public QueryBuilder fuzzyConfirmDate (List<String> fuzzyConfirmDate){
            this.fuzzyConfirmDate = fuzzyConfirmDate;
            return this;
        }

        public QueryBuilder fuzzyConfirmDate (String ... fuzzyConfirmDate){
            this.fuzzyConfirmDate = solveNullList(fuzzyConfirmDate);
            return this;
        }

        public QueryBuilder rightFuzzyConfirmDate (List<String> rightFuzzyConfirmDate){
            this.rightFuzzyConfirmDate = rightFuzzyConfirmDate;
            return this;
        }

        public QueryBuilder rightFuzzyConfirmDate (String ... rightFuzzyConfirmDate){
            this.rightFuzzyConfirmDate = solveNullList(rightFuzzyConfirmDate);
            return this;
        }

        public QueryBuilder confirmDate(String confirmDate){
            setConfirmDate(confirmDate);
            return this;
        }

        public QueryBuilder confirmDateList(String ... confirmDate){
            this.confirmDateList = solveNullList(confirmDate);
            return this;
        }

        public QueryBuilder confirmDateList(List<String> confirmDate){
            this.confirmDateList = confirmDate;
            return this;
        }

        public QueryBuilder fetchConfirmDate(){
            setFetchFields("fetchFields","confirmDate");
            return this;
        }

        public QueryBuilder excludeConfirmDate(){
            setFetchFields("excludeFields","confirmDate");
            return this;
        }

        public QueryBuilder fuzzyWarehousingDate (List<String> fuzzyWarehousingDate){
            this.fuzzyWarehousingDate = fuzzyWarehousingDate;
            return this;
        }

        public QueryBuilder fuzzyWarehousingDate (String ... fuzzyWarehousingDate){
            this.fuzzyWarehousingDate = solveNullList(fuzzyWarehousingDate);
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingDate (List<String> rightFuzzyWarehousingDate){
            this.rightFuzzyWarehousingDate = rightFuzzyWarehousingDate;
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingDate (String ... rightFuzzyWarehousingDate){
            this.rightFuzzyWarehousingDate = solveNullList(rightFuzzyWarehousingDate);
            return this;
        }

        public QueryBuilder warehousingDate(String warehousingDate){
            setWarehousingDate(warehousingDate);
            return this;
        }

        public QueryBuilder warehousingDateList(String ... warehousingDate){
            this.warehousingDateList = solveNullList(warehousingDate);
            return this;
        }

        public QueryBuilder warehousingDateList(List<String> warehousingDate){
            this.warehousingDateList = warehousingDate;
            return this;
        }

        public QueryBuilder fetchWarehousingDate(){
            setFetchFields("fetchFields","warehousingDate");
            return this;
        }

        public QueryBuilder excludeWarehousingDate(){
            setFetchFields("excludeFields","warehousingDate");
            return this;
        }

        public QueryBuilder fuzzyTransportDate (List<String> fuzzyTransportDate){
            this.fuzzyTransportDate = fuzzyTransportDate;
            return this;
        }

        public QueryBuilder fuzzyTransportDate (String ... fuzzyTransportDate){
            this.fuzzyTransportDate = solveNullList(fuzzyTransportDate);
            return this;
        }

        public QueryBuilder rightFuzzyTransportDate (List<String> rightFuzzyTransportDate){
            this.rightFuzzyTransportDate = rightFuzzyTransportDate;
            return this;
        }

        public QueryBuilder rightFuzzyTransportDate (String ... rightFuzzyTransportDate){
            this.rightFuzzyTransportDate = solveNullList(rightFuzzyTransportDate);
            return this;
        }

        public QueryBuilder transportDate(String transportDate){
            setTransportDate(transportDate);
            return this;
        }

        public QueryBuilder transportDateList(String ... transportDate){
            this.transportDateList = solveNullList(transportDate);
            return this;
        }

        public QueryBuilder transportDateList(List<String> transportDate){
            this.transportDateList = transportDate;
            return this;
        }

        public QueryBuilder fetchTransportDate(){
            setFetchFields("fetchFields","transportDate");
            return this;
        }

        public QueryBuilder excludeTransportDate(){
            setFetchFields("excludeFields","transportDate");
            return this;
        }

        public QueryBuilder fuzzyShopArrivalDate (List<String> fuzzyShopArrivalDate){
            this.fuzzyShopArrivalDate = fuzzyShopArrivalDate;
            return this;
        }

        public QueryBuilder fuzzyShopArrivalDate (String ... fuzzyShopArrivalDate){
            this.fuzzyShopArrivalDate = solveNullList(fuzzyShopArrivalDate);
            return this;
        }

        public QueryBuilder rightFuzzyShopArrivalDate (List<String> rightFuzzyShopArrivalDate){
            this.rightFuzzyShopArrivalDate = rightFuzzyShopArrivalDate;
            return this;
        }

        public QueryBuilder rightFuzzyShopArrivalDate (String ... rightFuzzyShopArrivalDate){
            this.rightFuzzyShopArrivalDate = solveNullList(rightFuzzyShopArrivalDate);
            return this;
        }

        public QueryBuilder shopArrivalDate(String shopArrivalDate){
            setShopArrivalDate(shopArrivalDate);
            return this;
        }

        public QueryBuilder shopArrivalDateList(String ... shopArrivalDate){
            this.shopArrivalDateList = solveNullList(shopArrivalDate);
            return this;
        }

        public QueryBuilder shopArrivalDateList(List<String> shopArrivalDate){
            this.shopArrivalDateList = shopArrivalDate;
            return this;
        }

        public QueryBuilder fetchShopArrivalDate(){
            setFetchFields("fetchFields","shopArrivalDate");
            return this;
        }

        public QueryBuilder excludeShopArrivalDate(){
            setFetchFields("excludeFields","shopArrivalDate");
            return this;
        }

        public QueryBuilder salesFailureTimeBetWeen(Integer salesFailureTimeSt,Integer salesFailureTimeEd){
            this.salesFailureTimeSt = salesFailureTimeSt;
            this.salesFailureTimeEd = salesFailureTimeEd;
            return this;
        }

        public QueryBuilder salesFailureTimeGreaterEqThan(Integer salesFailureTimeSt){
            this.salesFailureTimeSt = salesFailureTimeSt;
            return this;
        }
        public QueryBuilder salesFailureTimeLessEqThan(Integer salesFailureTimeEd){
            this.salesFailureTimeEd = salesFailureTimeEd;
            return this;
        }


        public QueryBuilder salesFailureTime(Integer salesFailureTime){
            setSalesFailureTime(salesFailureTime);
            return this;
        }

        public QueryBuilder salesFailureTimeList(Integer ... salesFailureTime){
            this.salesFailureTimeList = solveNullList(salesFailureTime);
            return this;
        }

        public QueryBuilder salesFailureTimeList(List<Integer> salesFailureTime){
            this.salesFailureTimeList = salesFailureTime;
            return this;
        }

        public QueryBuilder fetchSalesFailureTime(){
            setFetchFields("fetchFields","salesFailureTime");
            return this;
        }

        public QueryBuilder excludeSalesFailureTime(){
            setFetchFields("excludeFields","salesFailureTime");
            return this;
        }

        public QueryBuilder fuzzyFailureDesc (List<String> fuzzyFailureDesc){
            this.fuzzyFailureDesc = fuzzyFailureDesc;
            return this;
        }

        public QueryBuilder fuzzyFailureDesc (String ... fuzzyFailureDesc){
            this.fuzzyFailureDesc = solveNullList(fuzzyFailureDesc);
            return this;
        }

        public QueryBuilder rightFuzzyFailureDesc (List<String> rightFuzzyFailureDesc){
            this.rightFuzzyFailureDesc = rightFuzzyFailureDesc;
            return this;
        }

        public QueryBuilder rightFuzzyFailureDesc (String ... rightFuzzyFailureDesc){
            this.rightFuzzyFailureDesc = solveNullList(rightFuzzyFailureDesc);
            return this;
        }

        public QueryBuilder failureDesc(String failureDesc){
            setFailureDesc(failureDesc);
            return this;
        }

        public QueryBuilder failureDescList(String ... failureDesc){
            this.failureDescList = solveNullList(failureDesc);
            return this;
        }

        public QueryBuilder failureDescList(List<String> failureDesc){
            this.failureDescList = failureDesc;
            return this;
        }

        public QueryBuilder fetchFailureDesc(){
            setFetchFields("fetchFields","failureDesc");
            return this;
        }

        public QueryBuilder excludeFailureDesc(){
            setFetchFields("excludeFields","failureDesc");
            return this;
        }

        public QueryBuilder fuzzyDiagnosticResult (List<String> fuzzyDiagnosticResult){
            this.fuzzyDiagnosticResult = fuzzyDiagnosticResult;
            return this;
        }

        public QueryBuilder fuzzyDiagnosticResult (String ... fuzzyDiagnosticResult){
            this.fuzzyDiagnosticResult = solveNullList(fuzzyDiagnosticResult);
            return this;
        }

        public QueryBuilder rightFuzzyDiagnosticResult (List<String> rightFuzzyDiagnosticResult){
            this.rightFuzzyDiagnosticResult = rightFuzzyDiagnosticResult;
            return this;
        }

        public QueryBuilder rightFuzzyDiagnosticResult (String ... rightFuzzyDiagnosticResult){
            this.rightFuzzyDiagnosticResult = solveNullList(rightFuzzyDiagnosticResult);
            return this;
        }

        public QueryBuilder diagnosticResult(String diagnosticResult){
            setDiagnosticResult(diagnosticResult);
            return this;
        }

        public QueryBuilder diagnosticResultList(String ... diagnosticResult){
            this.diagnosticResultList = solveNullList(diagnosticResult);
            return this;
        }

        public QueryBuilder diagnosticResultList(List<String> diagnosticResult){
            this.diagnosticResultList = diagnosticResult;
            return this;
        }

        public QueryBuilder fetchDiagnosticResult(){
            setFetchFields("fetchFields","diagnosticResult");
            return this;
        }

        public QueryBuilder excludeDiagnosticResult(){
            setFetchFields("excludeFields","diagnosticResult");
            return this;
        }

        public QueryBuilder manCostBetWeen(java.math.BigDecimal manCostSt,java.math.BigDecimal manCostEd){
            this.manCostSt = manCostSt;
            this.manCostEd = manCostEd;
            return this;
        }

        public QueryBuilder manCostGreaterEqThan(java.math.BigDecimal manCostSt){
            this.manCostSt = manCostSt;
            return this;
        }
        public QueryBuilder manCostLessEqThan(java.math.BigDecimal manCostEd){
            this.manCostEd = manCostEd;
            return this;
        }


        public QueryBuilder manCost(java.math.BigDecimal manCost){
            setManCost(manCost);
            return this;
        }

        public QueryBuilder manCostList(java.math.BigDecimal ... manCost){
            this.manCostList = solveNullList(manCost);
            return this;
        }

        public QueryBuilder manCostList(List<java.math.BigDecimal> manCost){
            this.manCostList = manCost;
            return this;
        }

        public QueryBuilder fetchManCost(){
            setFetchFields("fetchFields","manCost");
            return this;
        }

        public QueryBuilder excludeManCost(){
            setFetchFields("excludeFields","manCost");
            return this;
        }

        public QueryBuilder materialCostBetWeen(java.math.BigDecimal materialCostSt,java.math.BigDecimal materialCostEd){
            this.materialCostSt = materialCostSt;
            this.materialCostEd = materialCostEd;
            return this;
        }

        public QueryBuilder materialCostGreaterEqThan(java.math.BigDecimal materialCostSt){
            this.materialCostSt = materialCostSt;
            return this;
        }
        public QueryBuilder materialCostLessEqThan(java.math.BigDecimal materialCostEd){
            this.materialCostEd = materialCostEd;
            return this;
        }


        public QueryBuilder materialCost(java.math.BigDecimal materialCost){
            setMaterialCost(materialCost);
            return this;
        }

        public QueryBuilder materialCostList(java.math.BigDecimal ... materialCost){
            this.materialCostList = solveNullList(materialCost);
            return this;
        }

        public QueryBuilder materialCostList(List<java.math.BigDecimal> materialCost){
            this.materialCostList = materialCost;
            return this;
        }

        public QueryBuilder fetchMaterialCost(){
            setFetchFields("fetchFields","materialCost");
            return this;
        }

        public QueryBuilder excludeMaterialCost(){
            setFetchFields("excludeFields","materialCost");
            return this;
        }

        public QueryBuilder materialManagementCostBetWeen(java.math.BigDecimal materialManagementCostSt,java.math.BigDecimal materialManagementCostEd){
            this.materialManagementCostSt = materialManagementCostSt;
            this.materialManagementCostEd = materialManagementCostEd;
            return this;
        }

        public QueryBuilder materialManagementCostGreaterEqThan(java.math.BigDecimal materialManagementCostSt){
            this.materialManagementCostSt = materialManagementCostSt;
            return this;
        }
        public QueryBuilder materialManagementCostLessEqThan(java.math.BigDecimal materialManagementCostEd){
            this.materialManagementCostEd = materialManagementCostEd;
            return this;
        }


        public QueryBuilder materialManagementCost(java.math.BigDecimal materialManagementCost){
            setMaterialManagementCost(materialManagementCost);
            return this;
        }

        public QueryBuilder materialManagementCostList(java.math.BigDecimal ... materialManagementCost){
            this.materialManagementCostList = solveNullList(materialManagementCost);
            return this;
        }

        public QueryBuilder materialManagementCostList(List<java.math.BigDecimal> materialManagementCost){
            this.materialManagementCostList = materialManagementCost;
            return this;
        }

        public QueryBuilder fetchMaterialManagementCost(){
            setFetchFields("fetchFields","materialManagementCost");
            return this;
        }

        public QueryBuilder excludeMaterialManagementCost(){
            setFetchFields("excludeFields","materialManagementCost");
            return this;
        }

        public QueryBuilder goOutCostBetWeen(java.math.BigDecimal goOutCostSt,java.math.BigDecimal goOutCostEd){
            this.goOutCostSt = goOutCostSt;
            this.goOutCostEd = goOutCostEd;
            return this;
        }

        public QueryBuilder goOutCostGreaterEqThan(java.math.BigDecimal goOutCostSt){
            this.goOutCostSt = goOutCostSt;
            return this;
        }
        public QueryBuilder goOutCostLessEqThan(java.math.BigDecimal goOutCostEd){
            this.goOutCostEd = goOutCostEd;
            return this;
        }


        public QueryBuilder goOutCost(java.math.BigDecimal goOutCost){
            setGoOutCost(goOutCost);
            return this;
        }

        public QueryBuilder goOutCostList(java.math.BigDecimal ... goOutCost){
            this.goOutCostList = solveNullList(goOutCost);
            return this;
        }

        public QueryBuilder goOutCostList(List<java.math.BigDecimal> goOutCost){
            this.goOutCostList = goOutCost;
            return this;
        }

        public QueryBuilder fetchGoOutCost(){
            setFetchFields("fetchFields","goOutCost");
            return this;
        }

        public QueryBuilder excludeGoOutCost(){
            setFetchFields("excludeFields","goOutCost");
            return this;
        }

        public QueryBuilder maintainingCostBetWeen(java.math.BigDecimal maintainingCostSt,java.math.BigDecimal maintainingCostEd){
            this.maintainingCostSt = maintainingCostSt;
            this.maintainingCostEd = maintainingCostEd;
            return this;
        }

        public QueryBuilder maintainingCostGreaterEqThan(java.math.BigDecimal maintainingCostSt){
            this.maintainingCostSt = maintainingCostSt;
            return this;
        }
        public QueryBuilder maintainingCostLessEqThan(java.math.BigDecimal maintainingCostEd){
            this.maintainingCostEd = maintainingCostEd;
            return this;
        }


        public QueryBuilder maintainingCost(java.math.BigDecimal maintainingCost){
            setMaintainingCost(maintainingCost);
            return this;
        }

        public QueryBuilder maintainingCostList(java.math.BigDecimal ... maintainingCost){
            this.maintainingCostList = solveNullList(maintainingCost);
            return this;
        }

        public QueryBuilder maintainingCostList(List<java.math.BigDecimal> maintainingCost){
            this.maintainingCostList = maintainingCost;
            return this;
        }

        public QueryBuilder fetchMaintainingCost(){
            setFetchFields("fetchFields","maintainingCost");
            return this;
        }

        public QueryBuilder excludeMaintainingCost(){
            setFetchFields("excludeFields","maintainingCost");
            return this;
        }

        public QueryBuilder otherCostBetWeen(java.math.BigDecimal otherCostSt,java.math.BigDecimal otherCostEd){
            this.otherCostSt = otherCostSt;
            this.otherCostEd = otherCostEd;
            return this;
        }

        public QueryBuilder otherCostGreaterEqThan(java.math.BigDecimal otherCostSt){
            this.otherCostSt = otherCostSt;
            return this;
        }
        public QueryBuilder otherCostLessEqThan(java.math.BigDecimal otherCostEd){
            this.otherCostEd = otherCostEd;
            return this;
        }


        public QueryBuilder otherCost(java.math.BigDecimal otherCost){
            setOtherCost(otherCost);
            return this;
        }

        public QueryBuilder otherCostList(java.math.BigDecimal ... otherCost){
            this.otherCostList = solveNullList(otherCost);
            return this;
        }

        public QueryBuilder otherCostList(List<java.math.BigDecimal> otherCost){
            this.otherCostList = otherCost;
            return this;
        }

        public QueryBuilder fetchOtherCost(){
            setFetchFields("fetchFields","otherCost");
            return this;
        }

        public QueryBuilder excludeOtherCost(){
            setFetchFields("excludeFields","otherCost");
            return this;
        }

        public QueryBuilder totalCostBetWeen(java.math.BigDecimal totalCostSt,java.math.BigDecimal totalCostEd){
            this.totalCostSt = totalCostSt;
            this.totalCostEd = totalCostEd;
            return this;
        }

        public QueryBuilder totalCostGreaterEqThan(java.math.BigDecimal totalCostSt){
            this.totalCostSt = totalCostSt;
            return this;
        }
        public QueryBuilder totalCostLessEqThan(java.math.BigDecimal totalCostEd){
            this.totalCostEd = totalCostEd;
            return this;
        }


        public QueryBuilder totalCost(java.math.BigDecimal totalCost){
            setTotalCost(totalCost);
            return this;
        }

        public QueryBuilder totalCostList(java.math.BigDecimal ... totalCost){
            this.totalCostList = solveNullList(totalCost);
            return this;
        }

        public QueryBuilder totalCostList(List<java.math.BigDecimal> totalCost){
            this.totalCostList = totalCost;
            return this;
        }

        public QueryBuilder fetchTotalCost(){
            setFetchFields("fetchFields","totalCost");
            return this;
        }

        public QueryBuilder excludeTotalCost(){
            setFetchFields("excludeFields","totalCost");
            return this;
        }

        public QueryBuilder fuzzyImportantLevel (List<String> fuzzyImportantLevel){
            this.fuzzyImportantLevel = fuzzyImportantLevel;
            return this;
        }

        public QueryBuilder fuzzyImportantLevel (String ... fuzzyImportantLevel){
            this.fuzzyImportantLevel = solveNullList(fuzzyImportantLevel);
            return this;
        }

        public QueryBuilder rightFuzzyImportantLevel (List<String> rightFuzzyImportantLevel){
            this.rightFuzzyImportantLevel = rightFuzzyImportantLevel;
            return this;
        }

        public QueryBuilder rightFuzzyImportantLevel (String ... rightFuzzyImportantLevel){
            this.rightFuzzyImportantLevel = solveNullList(rightFuzzyImportantLevel);
            return this;
        }

        public QueryBuilder importantLevel(String importantLevel){
            setImportantLevel(importantLevel);
            return this;
        }

        public QueryBuilder importantLevelList(String ... importantLevel){
            this.importantLevelList = solveNullList(importantLevel);
            return this;
        }

        public QueryBuilder importantLevelList(List<String> importantLevel){
            this.importantLevelList = importantLevel;
            return this;
        }

        public QueryBuilder fetchImportantLevel(){
            setFetchFields("fetchFields","importantLevel");
            return this;
        }

        public QueryBuilder excludeImportantLevel(){
            setFetchFields("excludeFields","importantLevel");
            return this;
        }

        public QueryBuilder fuzzyTransmissionType (List<String> fuzzyTransmissionType){
            this.fuzzyTransmissionType = fuzzyTransmissionType;
            return this;
        }

        public QueryBuilder fuzzyTransmissionType (String ... fuzzyTransmissionType){
            this.fuzzyTransmissionType = solveNullList(fuzzyTransmissionType);
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionType (List<String> rightFuzzyTransmissionType){
            this.rightFuzzyTransmissionType = rightFuzzyTransmissionType;
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionType (String ... rightFuzzyTransmissionType){
            this.rightFuzzyTransmissionType = solveNullList(rightFuzzyTransmissionType);
            return this;
        }

        public QueryBuilder transmissionType(String transmissionType){
            setTransmissionType(transmissionType);
            return this;
        }

        public QueryBuilder transmissionTypeList(String ... transmissionType){
            this.transmissionTypeList = solveNullList(transmissionType);
            return this;
        }

        public QueryBuilder transmissionTypeList(List<String> transmissionType){
            this.transmissionTypeList = transmissionType;
            return this;
        }

        public QueryBuilder fetchTransmissionType(){
            setFetchFields("fetchFields","transmissionType");
            return this;
        }

        public QueryBuilder excludeTransmissionType(){
            setFetchFields("excludeFields","transmissionType");
            return this;
        }

        public QueryBuilder fuzzyNewPartsBond (List<String> fuzzyNewPartsBond){
            this.fuzzyNewPartsBond = fuzzyNewPartsBond;
            return this;
        }

        public QueryBuilder fuzzyNewPartsBond (String ... fuzzyNewPartsBond){
            this.fuzzyNewPartsBond = solveNullList(fuzzyNewPartsBond);
            return this;
        }

        public QueryBuilder rightFuzzyNewPartsBond (List<String> rightFuzzyNewPartsBond){
            this.rightFuzzyNewPartsBond = rightFuzzyNewPartsBond;
            return this;
        }

        public QueryBuilder rightFuzzyNewPartsBond (String ... rightFuzzyNewPartsBond){
            this.rightFuzzyNewPartsBond = solveNullList(rightFuzzyNewPartsBond);
            return this;
        }

        public QueryBuilder newPartsBond(String newPartsBond){
            setNewPartsBond(newPartsBond);
            return this;
        }

        public QueryBuilder newPartsBondList(String ... newPartsBond){
            this.newPartsBondList = solveNullList(newPartsBond);
            return this;
        }

        public QueryBuilder newPartsBondList(List<String> newPartsBond){
            this.newPartsBondList = newPartsBond;
            return this;
        }

        public QueryBuilder fetchNewPartsBond(){
            setFetchFields("fetchFields","newPartsBond");
            return this;
        }

        public QueryBuilder excludeNewPartsBond(){
            setFetchFields("excludeFields","newPartsBond");
            return this;
        }

        public QueryBuilder fuzzySubmitDate (List<String> fuzzySubmitDate){
            this.fuzzySubmitDate = fuzzySubmitDate;
            return this;
        }

        public QueryBuilder fuzzySubmitDate (String ... fuzzySubmitDate){
            this.fuzzySubmitDate = solveNullList(fuzzySubmitDate);
            return this;
        }

        public QueryBuilder rightFuzzySubmitDate (List<String> rightFuzzySubmitDate){
            this.rightFuzzySubmitDate = rightFuzzySubmitDate;
            return this;
        }

        public QueryBuilder rightFuzzySubmitDate (String ... rightFuzzySubmitDate){
            this.rightFuzzySubmitDate = solveNullList(rightFuzzySubmitDate);
            return this;
        }

        public QueryBuilder submitDate(String submitDate){
            setSubmitDate(submitDate);
            return this;
        }

        public QueryBuilder submitDateList(String ... submitDate){
            this.submitDateList = solveNullList(submitDate);
            return this;
        }

        public QueryBuilder submitDateList(List<String> submitDate){
            this.submitDateList = submitDate;
            return this;
        }

        public QueryBuilder fetchSubmitDate(){
            setFetchFields("fetchFields","submitDate");
            return this;
        }

        public QueryBuilder excludeSubmitDate(){
            setFetchFields("excludeFields","submitDate");
            return this;
        }

        public QueryBuilder fuzzyEgtypeCode (List<String> fuzzyEgtypeCode){
            this.fuzzyEgtypeCode = fuzzyEgtypeCode;
            return this;
        }

        public QueryBuilder fuzzyEgtypeCode (String ... fuzzyEgtypeCode){
            this.fuzzyEgtypeCode = solveNullList(fuzzyEgtypeCode);
            return this;
        }

        public QueryBuilder rightFuzzyEgtypeCode (List<String> rightFuzzyEgtypeCode){
            this.rightFuzzyEgtypeCode = rightFuzzyEgtypeCode;
            return this;
        }

        public QueryBuilder rightFuzzyEgtypeCode (String ... rightFuzzyEgtypeCode){
            this.rightFuzzyEgtypeCode = solveNullList(rightFuzzyEgtypeCode);
            return this;
        }

        public QueryBuilder egtypeCode(String egtypeCode){
            setEgtypeCode(egtypeCode);
            return this;
        }

        public QueryBuilder egtypeCodeList(String ... egtypeCode){
            this.egtypeCodeList = solveNullList(egtypeCode);
            return this;
        }

        public QueryBuilder egtypeCodeList(List<String> egtypeCode){
            this.egtypeCodeList = egtypeCode;
            return this;
        }

        public QueryBuilder fetchEgtypeCode(){
            setFetchFields("fetchFields","egtypeCode");
            return this;
        }

        public QueryBuilder excludeEgtypeCode(){
            setFetchFields("excludeFields","egtypeCode");
            return this;
        }

        public QueryBuilder fuzzyEngProductionDate (List<String> fuzzyEngProductionDate){
            this.fuzzyEngProductionDate = fuzzyEngProductionDate;
            return this;
        }

        public QueryBuilder fuzzyEngProductionDate (String ... fuzzyEngProductionDate){
            this.fuzzyEngProductionDate = solveNullList(fuzzyEngProductionDate);
            return this;
        }

        public QueryBuilder rightFuzzyEngProductionDate (List<String> rightFuzzyEngProductionDate){
            this.rightFuzzyEngProductionDate = rightFuzzyEngProductionDate;
            return this;
        }

        public QueryBuilder rightFuzzyEngProductionDate (String ... rightFuzzyEngProductionDate){
            this.rightFuzzyEngProductionDate = solveNullList(rightFuzzyEngProductionDate);
            return this;
        }

        public QueryBuilder engProductionDate(String engProductionDate){
            setEngProductionDate(engProductionDate);
            return this;
        }

        public QueryBuilder engProductionDateList(String ... engProductionDate){
            this.engProductionDateList = solveNullList(engProductionDate);
            return this;
        }

        public QueryBuilder engProductionDateList(List<String> engProductionDate){
            this.engProductionDateList = engProductionDate;
            return this;
        }

        public QueryBuilder fetchEngProductionDate(){
            setFetchFields("fetchFields","engProductionDate");
            return this;
        }

        public QueryBuilder excludeEngProductionDate(){
            setFetchFields("excludeFields","engProductionDate");
            return this;
        }

        public QueryBuilder fuzzyTransmissionCode (List<String> fuzzyTransmissionCode){
            this.fuzzyTransmissionCode = fuzzyTransmissionCode;
            return this;
        }

        public QueryBuilder fuzzyTransmissionCode (String ... fuzzyTransmissionCode){
            this.fuzzyTransmissionCode = solveNullList(fuzzyTransmissionCode);
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionCode (List<String> rightFuzzyTransmissionCode){
            this.rightFuzzyTransmissionCode = rightFuzzyTransmissionCode;
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionCode (String ... rightFuzzyTransmissionCode){
            this.rightFuzzyTransmissionCode = solveNullList(rightFuzzyTransmissionCode);
            return this;
        }

        public QueryBuilder transmissionCode(String transmissionCode){
            setTransmissionCode(transmissionCode);
            return this;
        }

        public QueryBuilder transmissionCodeList(String ... transmissionCode){
            this.transmissionCodeList = solveNullList(transmissionCode);
            return this;
        }

        public QueryBuilder transmissionCodeList(List<String> transmissionCode){
            this.transmissionCodeList = transmissionCode;
            return this;
        }

        public QueryBuilder fetchTransmissionCode(){
            setFetchFields("fetchFields","transmissionCode");
            return this;
        }

        public QueryBuilder excludeTransmissionCode(){
            setFetchFields("excludeFields","transmissionCode");
            return this;
        }

        public QueryBuilder fuzzyTransmissionProductionDate (List<String> fuzzyTransmissionProductionDate){
            this.fuzzyTransmissionProductionDate = fuzzyTransmissionProductionDate;
            return this;
        }

        public QueryBuilder fuzzyTransmissionProductionDate (String ... fuzzyTransmissionProductionDate){
            this.fuzzyTransmissionProductionDate = solveNullList(fuzzyTransmissionProductionDate);
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionProductionDate (List<String> rightFuzzyTransmissionProductionDate){
            this.rightFuzzyTransmissionProductionDate = rightFuzzyTransmissionProductionDate;
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionProductionDate (String ... rightFuzzyTransmissionProductionDate){
            this.rightFuzzyTransmissionProductionDate = solveNullList(rightFuzzyTransmissionProductionDate);
            return this;
        }

        public QueryBuilder transmissionProductionDate(String transmissionProductionDate){
            setTransmissionProductionDate(transmissionProductionDate);
            return this;
        }

        public QueryBuilder transmissionProductionDateList(String ... transmissionProductionDate){
            this.transmissionProductionDateList = solveNullList(transmissionProductionDate);
            return this;
        }

        public QueryBuilder transmissionProductionDateList(List<String> transmissionProductionDate){
            this.transmissionProductionDateList = transmissionProductionDate;
            return this;
        }

        public QueryBuilder fetchTransmissionProductionDate(){
            setFetchFields("fetchFields","transmissionProductionDate");
            return this;
        }

        public QueryBuilder excludeTransmissionProductionDate(){
            setFetchFields("excludeFields","transmissionProductionDate");
            return this;
        }

        public QueryBuilder fuzzyEngArrange (List<String> fuzzyEngArrange){
            this.fuzzyEngArrange = fuzzyEngArrange;
            return this;
        }

        public QueryBuilder fuzzyEngArrange (String ... fuzzyEngArrange){
            this.fuzzyEngArrange = solveNullList(fuzzyEngArrange);
            return this;
        }

        public QueryBuilder rightFuzzyEngArrange (List<String> rightFuzzyEngArrange){
            this.rightFuzzyEngArrange = rightFuzzyEngArrange;
            return this;
        }

        public QueryBuilder rightFuzzyEngArrange (String ... rightFuzzyEngArrange){
            this.rightFuzzyEngArrange = solveNullList(rightFuzzyEngArrange);
            return this;
        }

        public QueryBuilder engArrange(String engArrange){
            setEngArrange(engArrange);
            return this;
        }

        public QueryBuilder engArrangeList(String ... engArrange){
            this.engArrangeList = solveNullList(engArrange);
            return this;
        }

        public QueryBuilder engArrangeList(List<String> engArrange){
            this.engArrangeList = engArrange;
            return this;
        }

        public QueryBuilder fetchEngArrange(){
            setFetchFields("fetchFields","engArrange");
            return this;
        }

        public QueryBuilder excludeEngArrange(){
            setFetchFields("excludeFields","engArrange");
            return this;
        }

        public QueryBuilder fuzzyCarModel (List<String> fuzzyCarModel){
            this.fuzzyCarModel = fuzzyCarModel;
            return this;
        }

        public QueryBuilder fuzzyCarModel (String ... fuzzyCarModel){
            this.fuzzyCarModel = solveNullList(fuzzyCarModel);
            return this;
        }

        public QueryBuilder rightFuzzyCarModel (List<String> rightFuzzyCarModel){
            this.rightFuzzyCarModel = rightFuzzyCarModel;
            return this;
        }

        public QueryBuilder rightFuzzyCarModel (String ... rightFuzzyCarModel){
            this.rightFuzzyCarModel = solveNullList(rightFuzzyCarModel);
            return this;
        }

        public QueryBuilder carModel(String carModel){
            setCarModel(carModel);
            return this;
        }

        public QueryBuilder carModelList(String ... carModel){
            this.carModelList = solveNullList(carModel);
            return this;
        }

        public QueryBuilder carModelList(List<String> carModel){
            this.carModelList = carModel;
            return this;
        }

        public QueryBuilder fetchCarModel(){
            setFetchFields("fetchFields","carModel");
            return this;
        }

        public QueryBuilder excludeCarModel(){
            setFetchFields("excludeFields","carModel");
            return this;
        }

        public QueryBuilder fuzzyEngType (List<String> fuzzyEngType){
            this.fuzzyEngType = fuzzyEngType;
            return this;
        }

        public QueryBuilder fuzzyEngType (String ... fuzzyEngType){
            this.fuzzyEngType = solveNullList(fuzzyEngType);
            return this;
        }

        public QueryBuilder rightFuzzyEngType (List<String> rightFuzzyEngType){
            this.rightFuzzyEngType = rightFuzzyEngType;
            return this;
        }

        public QueryBuilder rightFuzzyEngType (String ... rightFuzzyEngType){
            this.rightFuzzyEngType = solveNullList(rightFuzzyEngType);
            return this;
        }

        public QueryBuilder engType(String engType){
            setEngType(engType);
            return this;
        }

        public QueryBuilder engTypeList(String ... engType){
            this.engTypeList = solveNullList(engType);
            return this;
        }

        public QueryBuilder engTypeList(List<String> engType){
            this.engTypeList = engType;
            return this;
        }

        public QueryBuilder fetchEngType(){
            setFetchFields("fetchFields","engType");
            return this;
        }

        public QueryBuilder excludeEngType(){
            setFetchFields("excludeFields","engType");
            return this;
        }

        public QueryBuilder fuzzyReceiveTime (List<String> fuzzyReceiveTime){
            this.fuzzyReceiveTime = fuzzyReceiveTime;
            return this;
        }

        public QueryBuilder fuzzyReceiveTime (String ... fuzzyReceiveTime){
            this.fuzzyReceiveTime = solveNullList(fuzzyReceiveTime);
            return this;
        }

        public QueryBuilder rightFuzzyReceiveTime (List<String> rightFuzzyReceiveTime){
            this.rightFuzzyReceiveTime = rightFuzzyReceiveTime;
            return this;
        }

        public QueryBuilder rightFuzzyReceiveTime (String ... rightFuzzyReceiveTime){
            this.rightFuzzyReceiveTime = solveNullList(rightFuzzyReceiveTime);
            return this;
        }

        public QueryBuilder receiveTime(String receiveTime){
            setReceiveTime(receiveTime);
            return this;
        }

        public QueryBuilder receiveTimeList(String ... receiveTime){
            this.receiveTimeList = solveNullList(receiveTime);
            return this;
        }

        public QueryBuilder receiveTimeList(List<String> receiveTime){
            this.receiveTimeList = receiveTime;
            return this;
        }

        public QueryBuilder fetchReceiveTime(){
            setFetchFields("fetchFields","receiveTime");
            return this;
        }

        public QueryBuilder excludeReceiveTime(){
            setFetchFields("excludeFields","receiveTime");
            return this;
        }

        public QueryBuilder fuzzyClaimCompensation (List<String> fuzzyClaimCompensation){
            this.fuzzyClaimCompensation = fuzzyClaimCompensation;
            return this;
        }

        public QueryBuilder fuzzyClaimCompensation (String ... fuzzyClaimCompensation){
            this.fuzzyClaimCompensation = solveNullList(fuzzyClaimCompensation);
            return this;
        }

        public QueryBuilder rightFuzzyClaimCompensation (List<String> rightFuzzyClaimCompensation){
            this.rightFuzzyClaimCompensation = rightFuzzyClaimCompensation;
            return this;
        }

        public QueryBuilder rightFuzzyClaimCompensation (String ... rightFuzzyClaimCompensation){
            this.rightFuzzyClaimCompensation = solveNullList(rightFuzzyClaimCompensation);
            return this;
        }

        public QueryBuilder claimCompensation(String claimCompensation){
            setClaimCompensation(claimCompensation);
            return this;
        }

        public QueryBuilder claimCompensationList(String ... claimCompensation){
            this.claimCompensationList = solveNullList(claimCompensation);
            return this;
        }

        public QueryBuilder claimCompensationList(List<String> claimCompensation){
            this.claimCompensationList = claimCompensation;
            return this;
        }

        public QueryBuilder fetchClaimCompensation(){
            setFetchFields("fetchFields","claimCompensation");
            return this;
        }

        public QueryBuilder excludeClaimCompensation(){
            setFetchFields("excludeFields","claimCompensation");
            return this;
        }

        public QueryBuilder fuzzyProductionRawDescription (List<String> fuzzyProductionRawDescription){
            this.fuzzyProductionRawDescription = fuzzyProductionRawDescription;
            return this;
        }

        public QueryBuilder fuzzyProductionRawDescription (String ... fuzzyProductionRawDescription){
            this.fuzzyProductionRawDescription = solveNullList(fuzzyProductionRawDescription);
            return this;
        }

        public QueryBuilder rightFuzzyProductionRawDescription (List<String> rightFuzzyProductionRawDescription){
            this.rightFuzzyProductionRawDescription = rightFuzzyProductionRawDescription;
            return this;
        }

        public QueryBuilder rightFuzzyProductionRawDescription (String ... rightFuzzyProductionRawDescription){
            this.rightFuzzyProductionRawDescription = solveNullList(rightFuzzyProductionRawDescription);
            return this;
        }

        public QueryBuilder productionRawDescription(String productionRawDescription){
            setProductionRawDescription(productionRawDescription);
            return this;
        }

        public QueryBuilder productionRawDescriptionList(String ... productionRawDescription){
            this.productionRawDescriptionList = solveNullList(productionRawDescription);
            return this;
        }

        public QueryBuilder productionRawDescriptionList(List<String> productionRawDescription){
            this.productionRawDescriptionList = productionRawDescription;
            return this;
        }

        public QueryBuilder fetchProductionRawDescription(){
            setFetchFields("fetchFields","productionRawDescription");
            return this;
        }

        public QueryBuilder excludeProductionRawDescription(){
            setFetchFields("excludeFields","productionRawDescription");
            return this;
        }

        public QueryBuilder fuzzyPDI (List<String> fuzzyPDI){
            this.fuzzyPDI = fuzzyPDI;
            return this;
        }

        public QueryBuilder fuzzyPDI (String ... fuzzyPDI){
            this.fuzzyPDI = solveNullList(fuzzyPDI);
            return this;
        }

        public QueryBuilder rightFuzzyPDI (List<String> rightFuzzyPDI){
            this.rightFuzzyPDI = rightFuzzyPDI;
            return this;
        }

        public QueryBuilder rightFuzzyPDI (String ... rightFuzzyPDI){
            this.rightFuzzyPDI = solveNullList(rightFuzzyPDI);
            return this;
        }

        public QueryBuilder PDI(String PDI){
            setPDI(PDI);
            return this;
        }

        public QueryBuilder PDIList(String ... PDI){
            this.PDIList = solveNullList(PDI);
            return this;
        }

        public QueryBuilder PDIList(List<String> PDI){
            this.PDIList = PDI;
            return this;
        }

        public QueryBuilder fetchPDI(){
            setFetchFields("fetchFields","PDI");
            return this;
        }

        public QueryBuilder excludePDI(){
            setFetchFields("excludeFields","PDI");
            return this;
        }

        public QueryBuilder offlineFailureTimeBetWeen(Integer offlineFailureTimeSt,Integer offlineFailureTimeEd){
            this.offlineFailureTimeSt = offlineFailureTimeSt;
            this.offlineFailureTimeEd = offlineFailureTimeEd;
            return this;
        }

        public QueryBuilder offlineFailureTimeGreaterEqThan(Integer offlineFailureTimeSt){
            this.offlineFailureTimeSt = offlineFailureTimeSt;
            return this;
        }
        public QueryBuilder offlineFailureTimeLessEqThan(Integer offlineFailureTimeEd){
            this.offlineFailureTimeEd = offlineFailureTimeEd;
            return this;
        }


        public QueryBuilder offlineFailureTime(Integer offlineFailureTime){
            setOfflineFailureTime(offlineFailureTime);
            return this;
        }

        public QueryBuilder offlineFailureTimeList(Integer ... offlineFailureTime){
            this.offlineFailureTimeList = solveNullList(offlineFailureTime);
            return this;
        }

        public QueryBuilder offlineFailureTimeList(List<Integer> offlineFailureTime){
            this.offlineFailureTimeList = offlineFailureTime;
            return this;
        }

        public QueryBuilder fetchOfflineFailureTime(){
            setFetchFields("fetchFields","offlineFailureTime");
            return this;
        }

        public QueryBuilder excludeOfflineFailureTime(){
            setFetchFields("excludeFields","offlineFailureTime");
            return this;
        }

        public QueryBuilder fuzzyEngOrTran (List<String> fuzzyEngOrTran){
            this.fuzzyEngOrTran = fuzzyEngOrTran;
            return this;
        }

        public QueryBuilder fuzzyEngOrTran (String ... fuzzyEngOrTran){
            this.fuzzyEngOrTran = solveNullList(fuzzyEngOrTran);
            return this;
        }

        public QueryBuilder rightFuzzyEngOrTran (List<String> rightFuzzyEngOrTran){
            this.rightFuzzyEngOrTran = rightFuzzyEngOrTran;
            return this;
        }

        public QueryBuilder rightFuzzyEngOrTran (String ... rightFuzzyEngOrTran){
            this.rightFuzzyEngOrTran = solveNullList(rightFuzzyEngOrTran);
            return this;
        }

        public QueryBuilder engOrTran(String engOrTran){
            setEngOrTran(engOrTran);
            return this;
        }

        public QueryBuilder engOrTranList(String ... engOrTran){
            this.engOrTranList = solveNullList(engOrTran);
            return this;
        }

        public QueryBuilder engOrTranList(List<String> engOrTran){
            this.engOrTranList = engOrTran;
            return this;
        }

        public QueryBuilder fetchEngOrTran(){
            setFetchFields("fetchFields","engOrTran");
            return this;
        }

        public QueryBuilder excludeEngOrTran(){
            setFetchFields("excludeFields","engOrTran");
            return this;
        }

        public QueryBuilder fuzzyCarSeriesCode (List<String> fuzzyCarSeriesCode){
            this.fuzzyCarSeriesCode = fuzzyCarSeriesCode;
            return this;
        }

        public QueryBuilder fuzzyCarSeriesCode (String ... fuzzyCarSeriesCode){
            this.fuzzyCarSeriesCode = solveNullList(fuzzyCarSeriesCode);
            return this;
        }

        public QueryBuilder rightFuzzyCarSeriesCode (List<String> rightFuzzyCarSeriesCode){
            this.rightFuzzyCarSeriesCode = rightFuzzyCarSeriesCode;
            return this;
        }

        public QueryBuilder rightFuzzyCarSeriesCode (String ... rightFuzzyCarSeriesCode){
            this.rightFuzzyCarSeriesCode = solveNullList(rightFuzzyCarSeriesCode);
            return this;
        }

        public QueryBuilder carSeriesCode(String carSeriesCode){
            setCarSeriesCode(carSeriesCode);
            return this;
        }

        public QueryBuilder carSeriesCodeList(String ... carSeriesCode){
            this.carSeriesCodeList = solveNullList(carSeriesCode);
            return this;
        }

        public QueryBuilder carSeriesCodeList(List<String> carSeriesCode){
            this.carSeriesCodeList = carSeriesCode;
            return this;
        }

        public QueryBuilder fetchCarSeriesCode(){
            setFetchFields("fetchFields","carSeriesCode");
            return this;
        }

        public QueryBuilder excludeCarSeriesCode(){
            setFetchFields("excludeFields","carSeriesCode");
            return this;
        }

        public QueryBuilder fuzzyShortCode (List<String> fuzzyShortCode){
            this.fuzzyShortCode = fuzzyShortCode;
            return this;
        }

        public QueryBuilder fuzzyShortCode (String ... fuzzyShortCode){
            this.fuzzyShortCode = solveNullList(fuzzyShortCode);
            return this;
        }

        public QueryBuilder rightFuzzyShortCode (List<String> rightFuzzyShortCode){
            this.rightFuzzyShortCode = rightFuzzyShortCode;
            return this;
        }

        public QueryBuilder rightFuzzyShortCode (String ... rightFuzzyShortCode){
            this.rightFuzzyShortCode = solveNullList(rightFuzzyShortCode);
            return this;
        }

        public QueryBuilder shortCode(String shortCode){
            setShortCode(shortCode);
            return this;
        }

        public QueryBuilder shortCodeList(String ... shortCode){
            this.shortCodeList = solveNullList(shortCode);
            return this;
        }

        public QueryBuilder shortCodeList(List<String> shortCode){
            this.shortCodeList = shortCode;
            return this;
        }

        public QueryBuilder fetchShortCode(){
            setFetchFields("fetchFields","shortCode");
            return this;
        }

        public QueryBuilder excludeShortCode(){
            setFetchFields("excludeFields","shortCode");
            return this;
        }

        public QueryBuilder fuzzyFaultCodeClassification (List<String> fuzzyFaultCodeClassification){
            this.fuzzyFaultCodeClassification = fuzzyFaultCodeClassification;
            return this;
        }

        public QueryBuilder fuzzyFaultCodeClassification (String ... fuzzyFaultCodeClassification){
            this.fuzzyFaultCodeClassification = solveNullList(fuzzyFaultCodeClassification);
            return this;
        }

        public QueryBuilder rightFuzzyFaultCodeClassification (List<String> rightFuzzyFaultCodeClassification){
            this.rightFuzzyFaultCodeClassification = rightFuzzyFaultCodeClassification;
            return this;
        }

        public QueryBuilder rightFuzzyFaultCodeClassification (String ... rightFuzzyFaultCodeClassification){
            this.rightFuzzyFaultCodeClassification = solveNullList(rightFuzzyFaultCodeClassification);
            return this;
        }

        public QueryBuilder faultCodeClassification(String faultCodeClassification){
            setFaultCodeClassification(faultCodeClassification);
            return this;
        }

        public QueryBuilder faultCodeClassificationList(String ... faultCodeClassification){
            this.faultCodeClassificationList = solveNullList(faultCodeClassification);
            return this;
        }

        public QueryBuilder faultCodeClassificationList(List<String> faultCodeClassification){
            this.faultCodeClassificationList = faultCodeClassification;
            return this;
        }

        public QueryBuilder fetchFaultCodeClassification(){
            setFetchFields("fetchFields","faultCodeClassification");
            return this;
        }

        public QueryBuilder excludeFaultCodeClassification(){
            setFetchFields("excludeFields","faultCodeClassification");
            return this;
        }

        public QueryBuilder fuzzyFailureYear (List<String> fuzzyFailureYear){
            this.fuzzyFailureYear = fuzzyFailureYear;
            return this;
        }

        public QueryBuilder fuzzyFailureYear (String ... fuzzyFailureYear){
            this.fuzzyFailureYear = solveNullList(fuzzyFailureYear);
            return this;
        }

        public QueryBuilder rightFuzzyFailureYear (List<String> rightFuzzyFailureYear){
            this.rightFuzzyFailureYear = rightFuzzyFailureYear;
            return this;
        }

        public QueryBuilder rightFuzzyFailureYear (String ... rightFuzzyFailureYear){
            this.rightFuzzyFailureYear = solveNullList(rightFuzzyFailureYear);
            return this;
        }

        public QueryBuilder failureYear(String failureYear){
            setFailureYear(failureYear);
            return this;
        }

        public QueryBuilder failureYearList(String ... failureYear){
            this.failureYearList = solveNullList(failureYear);
            return this;
        }

        public QueryBuilder failureYearList(List<String> failureYear){
            this.failureYearList = failureYear;
            return this;
        }

        public QueryBuilder fetchFailureYear(){
            setFetchFields("fetchFields","failureYear");
            return this;
        }

        public QueryBuilder excludeFailureYear(){
            setFetchFields("excludeFields","failureYear");
            return this;
        }

        public QueryBuilder fuzzyFailureMonth (List<String> fuzzyFailureMonth){
            this.fuzzyFailureMonth = fuzzyFailureMonth;
            return this;
        }

        public QueryBuilder fuzzyFailureMonth (String ... fuzzyFailureMonth){
            this.fuzzyFailureMonth = solveNullList(fuzzyFailureMonth);
            return this;
        }

        public QueryBuilder rightFuzzyFailureMonth (List<String> rightFuzzyFailureMonth){
            this.rightFuzzyFailureMonth = rightFuzzyFailureMonth;
            return this;
        }

        public QueryBuilder rightFuzzyFailureMonth (String ... rightFuzzyFailureMonth){
            this.rightFuzzyFailureMonth = solveNullList(rightFuzzyFailureMonth);
            return this;
        }

        public QueryBuilder failureMonth(String failureMonth){
            setFailureMonth(failureMonth);
            return this;
        }

        public QueryBuilder failureMonthList(String ... failureMonth){
            this.failureMonthList = solveNullList(failureMonth);
            return this;
        }

        public QueryBuilder failureMonthList(List<String> failureMonth){
            this.failureMonthList = failureMonth;
            return this;
        }

        public QueryBuilder fetchFailureMonth(){
            setFetchFields("fetchFields","failureMonth");
            return this;
        }

        public QueryBuilder excludeFailureMonth(){
            setFetchFields("excludeFields","failureMonth");
            return this;
        }

        public QueryBuilder fuzzyTransmissionShortCode (List<String> fuzzyTransmissionShortCode){
            this.fuzzyTransmissionShortCode = fuzzyTransmissionShortCode;
            return this;
        }

        public QueryBuilder fuzzyTransmissionShortCode (String ... fuzzyTransmissionShortCode){
            this.fuzzyTransmissionShortCode = solveNullList(fuzzyTransmissionShortCode);
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionShortCode (List<String> rightFuzzyTransmissionShortCode){
            this.rightFuzzyTransmissionShortCode = rightFuzzyTransmissionShortCode;
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionShortCode (String ... rightFuzzyTransmissionShortCode){
            this.rightFuzzyTransmissionShortCode = solveNullList(rightFuzzyTransmissionShortCode);
            return this;
        }

        public QueryBuilder transmissionShortCode(String transmissionShortCode){
            setTransmissionShortCode(transmissionShortCode);
            return this;
        }

        public QueryBuilder transmissionShortCodeList(String ... transmissionShortCode){
            this.transmissionShortCodeList = solveNullList(transmissionShortCode);
            return this;
        }

        public QueryBuilder transmissionShortCodeList(List<String> transmissionShortCode){
            this.transmissionShortCodeList = transmissionShortCode;
            return this;
        }

        public QueryBuilder fetchTransmissionShortCode(){
            setFetchFields("fetchFields","transmissionShortCode");
            return this;
        }

        public QueryBuilder excludeTransmissionShortCode(){
            setFetchFields("excludeFields","transmissionShortCode");
            return this;
        }

        public QueryBuilder fuzzyMileageDistribution (List<String> fuzzyMileageDistribution){
            this.fuzzyMileageDistribution = fuzzyMileageDistribution;
            return this;
        }

        public QueryBuilder fuzzyMileageDistribution (String ... fuzzyMileageDistribution){
            this.fuzzyMileageDistribution = solveNullList(fuzzyMileageDistribution);
            return this;
        }

        public QueryBuilder rightFuzzyMileageDistribution (List<String> rightFuzzyMileageDistribution){
            this.rightFuzzyMileageDistribution = rightFuzzyMileageDistribution;
            return this;
        }

        public QueryBuilder rightFuzzyMileageDistribution (String ... rightFuzzyMileageDistribution){
            this.rightFuzzyMileageDistribution = solveNullList(rightFuzzyMileageDistribution);
            return this;
        }

        public QueryBuilder mileageDistribution(String mileageDistribution){
            setMileageDistribution(mileageDistribution);
            return this;
        }

        public QueryBuilder mileageDistributionList(String ... mileageDistribution){
            this.mileageDistributionList = solveNullList(mileageDistribution);
            return this;
        }

        public QueryBuilder mileageDistributionList(List<String> mileageDistribution){
            this.mileageDistributionList = mileageDistribution;
            return this;
        }

        public QueryBuilder fetchMileageDistribution(){
            setFetchFields("fetchFields","mileageDistribution");
            return this;
        }

        public QueryBuilder excludeMileageDistribution(){
            setFetchFields("excludeFields","mileageDistribution");
            return this;
        }

        public QueryBuilder fuzzyReturnRequest (List<String> fuzzyReturnRequest){
            this.fuzzyReturnRequest = fuzzyReturnRequest;
            return this;
        }

        public QueryBuilder fuzzyReturnRequest (String ... fuzzyReturnRequest){
            this.fuzzyReturnRequest = solveNullList(fuzzyReturnRequest);
            return this;
        }

        public QueryBuilder rightFuzzyReturnRequest (List<String> rightFuzzyReturnRequest){
            this.rightFuzzyReturnRequest = rightFuzzyReturnRequest;
            return this;
        }

        public QueryBuilder rightFuzzyReturnRequest (String ... rightFuzzyReturnRequest){
            this.rightFuzzyReturnRequest = solveNullList(rightFuzzyReturnRequest);
            return this;
        }

        public QueryBuilder returnRequest(String returnRequest){
            setReturnRequest(returnRequest);
            return this;
        }

        public QueryBuilder returnRequestList(String ... returnRequest){
            this.returnRequestList = solveNullList(returnRequest);
            return this;
        }

        public QueryBuilder returnRequestList(List<String> returnRequest){
            this.returnRequestList = returnRequest;
            return this;
        }

        public QueryBuilder fetchReturnRequest(){
            setFetchFields("fetchFields","returnRequest");
            return this;
        }

        public QueryBuilder excludeReturnRequest(){
            setFetchFields("excludeFields","returnRequest");
            return this;
        }

        public QueryBuilder fuzzyReturnDate (List<String> fuzzyReturnDate){
            this.fuzzyReturnDate = fuzzyReturnDate;
            return this;
        }

        public QueryBuilder fuzzyReturnDate (String ... fuzzyReturnDate){
            this.fuzzyReturnDate = solveNullList(fuzzyReturnDate);
            return this;
        }

        public QueryBuilder rightFuzzyReturnDate (List<String> rightFuzzyReturnDate){
            this.rightFuzzyReturnDate = rightFuzzyReturnDate;
            return this;
        }

        public QueryBuilder rightFuzzyReturnDate (String ... rightFuzzyReturnDate){
            this.rightFuzzyReturnDate = solveNullList(rightFuzzyReturnDate);
            return this;
        }

        public QueryBuilder returnDate(String returnDate){
            setReturnDate(returnDate);
            return this;
        }

        public QueryBuilder returnDateList(String ... returnDate){
            this.returnDateList = solveNullList(returnDate);
            return this;
        }

        public QueryBuilder returnDateList(List<String> returnDate){
            this.returnDateList = returnDate;
            return this;
        }

        public QueryBuilder fetchReturnDate(){
            setFetchFields("fetchFields","returnDate");
            return this;
        }

        public QueryBuilder excludeReturnDate(){
            setFetchFields("excludeFields","returnDate");
            return this;
        }

        public QueryBuilder fuzzyArriveDate (List<String> fuzzyArriveDate){
            this.fuzzyArriveDate = fuzzyArriveDate;
            return this;
        }

        public QueryBuilder fuzzyArriveDate (String ... fuzzyArriveDate){
            this.fuzzyArriveDate = solveNullList(fuzzyArriveDate);
            return this;
        }

        public QueryBuilder rightFuzzyArriveDate (List<String> rightFuzzyArriveDate){
            this.rightFuzzyArriveDate = rightFuzzyArriveDate;
            return this;
        }

        public QueryBuilder rightFuzzyArriveDate (String ... rightFuzzyArriveDate){
            this.rightFuzzyArriveDate = solveNullList(rightFuzzyArriveDate);
            return this;
        }

        public QueryBuilder arriveDate(String arriveDate){
            setArriveDate(arriveDate);
            return this;
        }

        public QueryBuilder arriveDateList(String ... arriveDate){
            this.arriveDateList = solveNullList(arriveDate);
            return this;
        }

        public QueryBuilder arriveDateList(List<String> arriveDate){
            this.arriveDateList = arriveDate;
            return this;
        }

        public QueryBuilder fetchArriveDate(){
            setFetchFields("fetchFields","arriveDate");
            return this;
        }

        public QueryBuilder excludeArriveDate(){
            setFetchFields("excludeFields","arriveDate");
            return this;
        }

        public QueryBuilder fuzzyLoadingVerification (List<String> fuzzyLoadingVerification){
            this.fuzzyLoadingVerification = fuzzyLoadingVerification;
            return this;
        }

        public QueryBuilder fuzzyLoadingVerification (String ... fuzzyLoadingVerification){
            this.fuzzyLoadingVerification = solveNullList(fuzzyLoadingVerification);
            return this;
        }

        public QueryBuilder rightFuzzyLoadingVerification (List<String> rightFuzzyLoadingVerification){
            this.rightFuzzyLoadingVerification = rightFuzzyLoadingVerification;
            return this;
        }

        public QueryBuilder rightFuzzyLoadingVerification (String ... rightFuzzyLoadingVerification){
            this.rightFuzzyLoadingVerification = solveNullList(rightFuzzyLoadingVerification);
            return this;
        }

        public QueryBuilder loadingVerification(String loadingVerification){
            setLoadingVerification(loadingVerification);
            return this;
        }

        public QueryBuilder loadingVerificationList(String ... loadingVerification){
            this.loadingVerificationList = solveNullList(loadingVerification);
            return this;
        }

        public QueryBuilder loadingVerificationList(List<String> loadingVerification){
            this.loadingVerificationList = loadingVerification;
            return this;
        }

        public QueryBuilder fetchLoadingVerification(){
            setFetchFields("fetchFields","loadingVerification");
            return this;
        }

        public QueryBuilder excludeLoadingVerification(){
            setFetchFields("excludeFields","loadingVerification");
            return this;
        }

        public QueryBuilder fuzzyFaultReconstructioner (List<String> fuzzyFaultReconstructioner){
            this.fuzzyFaultReconstructioner = fuzzyFaultReconstructioner;
            return this;
        }

        public QueryBuilder fuzzyFaultReconstructioner (String ... fuzzyFaultReconstructioner){
            this.fuzzyFaultReconstructioner = solveNullList(fuzzyFaultReconstructioner);
            return this;
        }

        public QueryBuilder rightFuzzyFaultReconstructioner (List<String> rightFuzzyFaultReconstructioner){
            this.rightFuzzyFaultReconstructioner = rightFuzzyFaultReconstructioner;
            return this;
        }

        public QueryBuilder rightFuzzyFaultReconstructioner (String ... rightFuzzyFaultReconstructioner){
            this.rightFuzzyFaultReconstructioner = solveNullList(rightFuzzyFaultReconstructioner);
            return this;
        }

        public QueryBuilder faultReconstructioner(String faultReconstructioner){
            setFaultReconstructioner(faultReconstructioner);
            return this;
        }

        public QueryBuilder faultReconstructionerList(String ... faultReconstructioner){
            this.faultReconstructionerList = solveNullList(faultReconstructioner);
            return this;
        }

        public QueryBuilder faultReconstructionerList(List<String> faultReconstructioner){
            this.faultReconstructionerList = faultReconstructioner;
            return this;
        }

        public QueryBuilder fetchFaultReconstructioner(){
            setFetchFields("fetchFields","faultReconstructioner");
            return this;
        }

        public QueryBuilder excludeFaultReconstructioner(){
            setFetchFields("excludeFields","faultReconstructioner");
            return this;
        }

        public QueryBuilder fuzzyLoadingDate (List<String> fuzzyLoadingDate){
            this.fuzzyLoadingDate = fuzzyLoadingDate;
            return this;
        }

        public QueryBuilder fuzzyLoadingDate (String ... fuzzyLoadingDate){
            this.fuzzyLoadingDate = solveNullList(fuzzyLoadingDate);
            return this;
        }

        public QueryBuilder rightFuzzyLoadingDate (List<String> rightFuzzyLoadingDate){
            this.rightFuzzyLoadingDate = rightFuzzyLoadingDate;
            return this;
        }

        public QueryBuilder rightFuzzyLoadingDate (String ... rightFuzzyLoadingDate){
            this.rightFuzzyLoadingDate = solveNullList(rightFuzzyLoadingDate);
            return this;
        }

        public QueryBuilder loadingDate(String loadingDate){
            setLoadingDate(loadingDate);
            return this;
        }

        public QueryBuilder loadingDateList(String ... loadingDate){
            this.loadingDateList = solveNullList(loadingDate);
            return this;
        }

        public QueryBuilder loadingDateList(List<String> loadingDate){
            this.loadingDateList = loadingDate;
            return this;
        }

        public QueryBuilder fetchLoadingDate(){
            setFetchFields("fetchFields","loadingDate");
            return this;
        }

        public QueryBuilder excludeLoadingDate(){
            setFetchFields("excludeFields","loadingDate");
            return this;
        }

        public QueryBuilder fuzzyFaultReconstruction (List<String> fuzzyFaultReconstruction){
            this.fuzzyFaultReconstruction = fuzzyFaultReconstruction;
            return this;
        }

        public QueryBuilder fuzzyFaultReconstruction (String ... fuzzyFaultReconstruction){
            this.fuzzyFaultReconstruction = solveNullList(fuzzyFaultReconstruction);
            return this;
        }

        public QueryBuilder rightFuzzyFaultReconstruction (List<String> rightFuzzyFaultReconstruction){
            this.rightFuzzyFaultReconstruction = rightFuzzyFaultReconstruction;
            return this;
        }

        public QueryBuilder rightFuzzyFaultReconstruction (String ... rightFuzzyFaultReconstruction){
            this.rightFuzzyFaultReconstruction = solveNullList(rightFuzzyFaultReconstruction);
            return this;
        }

        public QueryBuilder faultReconstruction(String faultReconstruction){
            setFaultReconstruction(faultReconstruction);
            return this;
        }

        public QueryBuilder faultReconstructionList(String ... faultReconstruction){
            this.faultReconstructionList = solveNullList(faultReconstruction);
            return this;
        }

        public QueryBuilder faultReconstructionList(List<String> faultReconstruction){
            this.faultReconstructionList = faultReconstruction;
            return this;
        }

        public QueryBuilder fetchFaultReconstruction(){
            setFetchFields("fetchFields","faultReconstruction");
            return this;
        }

        public QueryBuilder excludeFaultReconstruction(){
            setFetchFields("excludeFields","faultReconstruction");
            return this;
        }

        public QueryBuilder fuzzyFaultReconstructionDate (List<String> fuzzyFaultReconstructionDate){
            this.fuzzyFaultReconstructionDate = fuzzyFaultReconstructionDate;
            return this;
        }

        public QueryBuilder fuzzyFaultReconstructionDate (String ... fuzzyFaultReconstructionDate){
            this.fuzzyFaultReconstructionDate = solveNullList(fuzzyFaultReconstructionDate);
            return this;
        }

        public QueryBuilder rightFuzzyFaultReconstructionDate (List<String> rightFuzzyFaultReconstructionDate){
            this.rightFuzzyFaultReconstructionDate = rightFuzzyFaultReconstructionDate;
            return this;
        }

        public QueryBuilder rightFuzzyFaultReconstructionDate (String ... rightFuzzyFaultReconstructionDate){
            this.rightFuzzyFaultReconstructionDate = solveNullList(rightFuzzyFaultReconstructionDate);
            return this;
        }

        public QueryBuilder faultReconstructionDate(String faultReconstructionDate){
            setFaultReconstructionDate(faultReconstructionDate);
            return this;
        }

        public QueryBuilder faultReconstructionDateList(String ... faultReconstructionDate){
            this.faultReconstructionDateList = solveNullList(faultReconstructionDate);
            return this;
        }

        public QueryBuilder faultReconstructionDateList(List<String> faultReconstructionDate){
            this.faultReconstructionDateList = faultReconstructionDate;
            return this;
        }

        public QueryBuilder fetchFaultReconstructionDate(){
            setFetchFields("fetchFields","faultReconstructionDate");
            return this;
        }

        public QueryBuilder excludeFaultReconstructionDate(){
            setFetchFields("excludeFields","faultReconstructionDate");
            return this;
        }

        public QueryBuilder fuzzyTransferDate1 (List<String> fuzzyTransferDate1){
            this.fuzzyTransferDate1 = fuzzyTransferDate1;
            return this;
        }

        public QueryBuilder fuzzyTransferDate1 (String ... fuzzyTransferDate1){
            this.fuzzyTransferDate1 = solveNullList(fuzzyTransferDate1);
            return this;
        }

        public QueryBuilder rightFuzzyTransferDate1 (List<String> rightFuzzyTransferDate1){
            this.rightFuzzyTransferDate1 = rightFuzzyTransferDate1;
            return this;
        }

        public QueryBuilder rightFuzzyTransferDate1 (String ... rightFuzzyTransferDate1){
            this.rightFuzzyTransferDate1 = solveNullList(rightFuzzyTransferDate1);
            return this;
        }

        public QueryBuilder transferDate1(String transferDate1){
            setTransferDate1(transferDate1);
            return this;
        }

        public QueryBuilder transferDate1List(String ... transferDate1){
            this.transferDate1List = solveNullList(transferDate1);
            return this;
        }

        public QueryBuilder transferDate1List(List<String> transferDate1){
            this.transferDate1List = transferDate1;
            return this;
        }

        public QueryBuilder fetchTransferDate1(){
            setFetchFields("fetchFields","transferDate1");
            return this;
        }

        public QueryBuilder excludeTransferDate1(){
            setFetchFields("excludeFields","transferDate1");
            return this;
        }

        public QueryBuilder fuzzyResponsible1 (List<String> fuzzyResponsible1){
            this.fuzzyResponsible1 = fuzzyResponsible1;
            return this;
        }

        public QueryBuilder fuzzyResponsible1 (String ... fuzzyResponsible1){
            this.fuzzyResponsible1 = solveNullList(fuzzyResponsible1);
            return this;
        }

        public QueryBuilder rightFuzzyResponsible1 (List<String> rightFuzzyResponsible1){
            this.rightFuzzyResponsible1 = rightFuzzyResponsible1;
            return this;
        }

        public QueryBuilder rightFuzzyResponsible1 (String ... rightFuzzyResponsible1){
            this.rightFuzzyResponsible1 = solveNullList(rightFuzzyResponsible1);
            return this;
        }

        public QueryBuilder responsible1(String responsible1){
            setResponsible1(responsible1);
            return this;
        }

        public QueryBuilder responsible1List(String ... responsible1){
            this.responsible1List = solveNullList(responsible1);
            return this;
        }

        public QueryBuilder responsible1List(List<String> responsible1){
            this.responsible1List = responsible1;
            return this;
        }

        public QueryBuilder fetchResponsible1(){
            setFetchFields("fetchFields","responsible1");
            return this;
        }

        public QueryBuilder excludeResponsible1(){
            setFetchFields("excludeFields","responsible1");
            return this;
        }

        public QueryBuilder fuzzyTransferDate2 (List<String> fuzzyTransferDate2){
            this.fuzzyTransferDate2 = fuzzyTransferDate2;
            return this;
        }

        public QueryBuilder fuzzyTransferDate2 (String ... fuzzyTransferDate2){
            this.fuzzyTransferDate2 = solveNullList(fuzzyTransferDate2);
            return this;
        }

        public QueryBuilder rightFuzzyTransferDate2 (List<String> rightFuzzyTransferDate2){
            this.rightFuzzyTransferDate2 = rightFuzzyTransferDate2;
            return this;
        }

        public QueryBuilder rightFuzzyTransferDate2 (String ... rightFuzzyTransferDate2){
            this.rightFuzzyTransferDate2 = solveNullList(rightFuzzyTransferDate2);
            return this;
        }

        public QueryBuilder transferDate2(String transferDate2){
            setTransferDate2(transferDate2);
            return this;
        }

        public QueryBuilder transferDate2List(String ... transferDate2){
            this.transferDate2List = solveNullList(transferDate2);
            return this;
        }

        public QueryBuilder transferDate2List(List<String> transferDate2){
            this.transferDate2List = transferDate2;
            return this;
        }

        public QueryBuilder fetchTransferDate2(){
            setFetchFields("fetchFields","transferDate2");
            return this;
        }

        public QueryBuilder excludeTransferDate2(){
            setFetchFields("excludeFields","transferDate2");
            return this;
        }

        public QueryBuilder fuzzyResponsible2 (List<String> fuzzyResponsible2){
            this.fuzzyResponsible2 = fuzzyResponsible2;
            return this;
        }

        public QueryBuilder fuzzyResponsible2 (String ... fuzzyResponsible2){
            this.fuzzyResponsible2 = solveNullList(fuzzyResponsible2);
            return this;
        }

        public QueryBuilder rightFuzzyResponsible2 (List<String> rightFuzzyResponsible2){
            this.rightFuzzyResponsible2 = rightFuzzyResponsible2;
            return this;
        }

        public QueryBuilder rightFuzzyResponsible2 (String ... rightFuzzyResponsible2){
            this.rightFuzzyResponsible2 = solveNullList(rightFuzzyResponsible2);
            return this;
        }

        public QueryBuilder responsible2(String responsible2){
            setResponsible2(responsible2);
            return this;
        }

        public QueryBuilder responsible2List(String ... responsible2){
            this.responsible2List = solveNullList(responsible2);
            return this;
        }

        public QueryBuilder responsible2List(List<String> responsible2){
            this.responsible2List = responsible2;
            return this;
        }

        public QueryBuilder fetchResponsible2(){
            setFetchFields("fetchFields","responsible2");
            return this;
        }

        public QueryBuilder excludeResponsible2(){
            setFetchFields("excludeFields","responsible2");
            return this;
        }

        public QueryBuilder fuzzyEstimateMeetingDate (List<String> fuzzyEstimateMeetingDate){
            this.fuzzyEstimateMeetingDate = fuzzyEstimateMeetingDate;
            return this;
        }

        public QueryBuilder fuzzyEstimateMeetingDate (String ... fuzzyEstimateMeetingDate){
            this.fuzzyEstimateMeetingDate = solveNullList(fuzzyEstimateMeetingDate);
            return this;
        }

        public QueryBuilder rightFuzzyEstimateMeetingDate (List<String> rightFuzzyEstimateMeetingDate){
            this.rightFuzzyEstimateMeetingDate = rightFuzzyEstimateMeetingDate;
            return this;
        }

        public QueryBuilder rightFuzzyEstimateMeetingDate (String ... rightFuzzyEstimateMeetingDate){
            this.rightFuzzyEstimateMeetingDate = solveNullList(rightFuzzyEstimateMeetingDate);
            return this;
        }

        public QueryBuilder estimateMeetingDate(String estimateMeetingDate){
            setEstimateMeetingDate(estimateMeetingDate);
            return this;
        }

        public QueryBuilder estimateMeetingDateList(String ... estimateMeetingDate){
            this.estimateMeetingDateList = solveNullList(estimateMeetingDate);
            return this;
        }

        public QueryBuilder estimateMeetingDateList(List<String> estimateMeetingDate){
            this.estimateMeetingDateList = estimateMeetingDate;
            return this;
        }

        public QueryBuilder fetchEstimateMeetingDate(){
            setFetchFields("fetchFields","estimateMeetingDate");
            return this;
        }

        public QueryBuilder excludeEstimateMeetingDate(){
            setFetchFields("excludeFields","estimateMeetingDate");
            return this;
        }

        public QueryBuilder fuzzySubmitReport (List<String> fuzzySubmitReport){
            this.fuzzySubmitReport = fuzzySubmitReport;
            return this;
        }

        public QueryBuilder fuzzySubmitReport (String ... fuzzySubmitReport){
            this.fuzzySubmitReport = solveNullList(fuzzySubmitReport);
            return this;
        }

        public QueryBuilder rightFuzzySubmitReport (List<String> rightFuzzySubmitReport){
            this.rightFuzzySubmitReport = rightFuzzySubmitReport;
            return this;
        }

        public QueryBuilder rightFuzzySubmitReport (String ... rightFuzzySubmitReport){
            this.rightFuzzySubmitReport = solveNullList(rightFuzzySubmitReport);
            return this;
        }

        public QueryBuilder submitReport(String submitReport){
            setSubmitReport(submitReport);
            return this;
        }

        public QueryBuilder submitReportList(String ... submitReport){
            this.submitReportList = solveNullList(submitReport);
            return this;
        }

        public QueryBuilder submitReportList(List<String> submitReport){
            this.submitReportList = submitReport;
            return this;
        }

        public QueryBuilder fetchSubmitReport(){
            setFetchFields("fetchFields","submitReport");
            return this;
        }

        public QueryBuilder excludeSubmitReport(){
            setFetchFields("excludeFields","submitReport");
            return this;
        }

        public QueryBuilder fuzzyReason (List<String> fuzzyReason){
            this.fuzzyReason = fuzzyReason;
            return this;
        }

        public QueryBuilder fuzzyReason (String ... fuzzyReason){
            this.fuzzyReason = solveNullList(fuzzyReason);
            return this;
        }

        public QueryBuilder rightFuzzyReason (List<String> rightFuzzyReason){
            this.rightFuzzyReason = rightFuzzyReason;
            return this;
        }

        public QueryBuilder rightFuzzyReason (String ... rightFuzzyReason){
            this.rightFuzzyReason = solveNullList(rightFuzzyReason);
            return this;
        }

        public QueryBuilder reason(String reason){
            setReason(reason);
            return this;
        }

        public QueryBuilder reasonList(String ... reason){
            this.reasonList = solveNullList(reason);
            return this;
        }

        public QueryBuilder reasonList(List<String> reason){
            this.reasonList = reason;
            return this;
        }

        public QueryBuilder fetchReason(){
            setFetchFields("fetchFields","reason");
            return this;
        }

        public QueryBuilder excludeReason(){
            setFetchFields("excludeFields","reason");
            return this;
        }

        public QueryBuilder fuzzyCountermeasure (List<String> fuzzyCountermeasure){
            this.fuzzyCountermeasure = fuzzyCountermeasure;
            return this;
        }

        public QueryBuilder fuzzyCountermeasure (String ... fuzzyCountermeasure){
            this.fuzzyCountermeasure = solveNullList(fuzzyCountermeasure);
            return this;
        }

        public QueryBuilder rightFuzzyCountermeasure (List<String> rightFuzzyCountermeasure){
            this.rightFuzzyCountermeasure = rightFuzzyCountermeasure;
            return this;
        }

        public QueryBuilder rightFuzzyCountermeasure (String ... rightFuzzyCountermeasure){
            this.rightFuzzyCountermeasure = solveNullList(rightFuzzyCountermeasure);
            return this;
        }

        public QueryBuilder countermeasure(String countermeasure){
            setCountermeasure(countermeasure);
            return this;
        }

        public QueryBuilder countermeasureList(String ... countermeasure){
            this.countermeasureList = solveNullList(countermeasure);
            return this;
        }

        public QueryBuilder countermeasureList(List<String> countermeasure){
            this.countermeasureList = countermeasure;
            return this;
        }

        public QueryBuilder fetchCountermeasure(){
            setFetchFields("fetchFields","countermeasure");
            return this;
        }

        public QueryBuilder excludeCountermeasure(){
            setFetchFields("excludeFields","countermeasure");
            return this;
        }

        public QueryBuilder fuzzyReportSubmit (List<String> fuzzyReportSubmit){
            this.fuzzyReportSubmit = fuzzyReportSubmit;
            return this;
        }

        public QueryBuilder fuzzyReportSubmit (String ... fuzzyReportSubmit){
            this.fuzzyReportSubmit = solveNullList(fuzzyReportSubmit);
            return this;
        }

        public QueryBuilder rightFuzzyReportSubmit (List<String> rightFuzzyReportSubmit){
            this.rightFuzzyReportSubmit = rightFuzzyReportSubmit;
            return this;
        }

        public QueryBuilder rightFuzzyReportSubmit (String ... rightFuzzyReportSubmit){
            this.rightFuzzyReportSubmit = solveNullList(rightFuzzyReportSubmit);
            return this;
        }

        public QueryBuilder reportSubmit(String reportSubmit){
            setReportSubmit(reportSubmit);
            return this;
        }

        public QueryBuilder reportSubmitList(String ... reportSubmit){
            this.reportSubmitList = solveNullList(reportSubmit);
            return this;
        }

        public QueryBuilder reportSubmitList(List<String> reportSubmit){
            this.reportSubmitList = reportSubmit;
            return this;
        }

        public QueryBuilder fetchReportSubmit(){
            setFetchFields("fetchFields","reportSubmit");
            return this;
        }

        public QueryBuilder excludeReportSubmit(){
            setFetchFields("excludeFields","reportSubmit");
            return this;
        }

        public QueryBuilder fuzzyClaimIndemnity (List<String> fuzzyClaimIndemnity){
            this.fuzzyClaimIndemnity = fuzzyClaimIndemnity;
            return this;
        }

        public QueryBuilder fuzzyClaimIndemnity (String ... fuzzyClaimIndemnity){
            this.fuzzyClaimIndemnity = solveNullList(fuzzyClaimIndemnity);
            return this;
        }

        public QueryBuilder rightFuzzyClaimIndemnity (List<String> rightFuzzyClaimIndemnity){
            this.rightFuzzyClaimIndemnity = rightFuzzyClaimIndemnity;
            return this;
        }

        public QueryBuilder rightFuzzyClaimIndemnity (String ... rightFuzzyClaimIndemnity){
            this.rightFuzzyClaimIndemnity = solveNullList(rightFuzzyClaimIndemnity);
            return this;
        }

        public QueryBuilder claimIndemnity(String claimIndemnity){
            setClaimIndemnity(claimIndemnity);
            return this;
        }

        public QueryBuilder claimIndemnityList(String ... claimIndemnity){
            this.claimIndemnityList = solveNullList(claimIndemnity);
            return this;
        }

        public QueryBuilder claimIndemnityList(List<String> claimIndemnity){
            this.claimIndemnityList = claimIndemnity;
            return this;
        }

        public QueryBuilder fetchClaimIndemnity(){
            setFetchFields("fetchFields","claimIndemnity");
            return this;
        }

        public QueryBuilder excludeClaimIndemnity(){
            setFetchFields("excludeFields","claimIndemnity");
            return this;
        }

        public QueryBuilder fuzzyQuestionType (List<String> fuzzyQuestionType){
            this.fuzzyQuestionType = fuzzyQuestionType;
            return this;
        }

        public QueryBuilder fuzzyQuestionType (String ... fuzzyQuestionType){
            this.fuzzyQuestionType = solveNullList(fuzzyQuestionType);
            return this;
        }

        public QueryBuilder rightFuzzyQuestionType (List<String> rightFuzzyQuestionType){
            this.rightFuzzyQuestionType = rightFuzzyQuestionType;
            return this;
        }

        public QueryBuilder rightFuzzyQuestionType (String ... rightFuzzyQuestionType){
            this.rightFuzzyQuestionType = solveNullList(rightFuzzyQuestionType);
            return this;
        }

        public QueryBuilder questionType(String questionType){
            setQuestionType(questionType);
            return this;
        }

        public QueryBuilder questionTypeList(String ... questionType){
            this.questionTypeList = solveNullList(questionType);
            return this;
        }

        public QueryBuilder questionTypeList(List<String> questionType){
            this.questionTypeList = questionType;
            return this;
        }

        public QueryBuilder fetchQuestionType(){
            setFetchFields("fetchFields","questionType");
            return this;
        }

        public QueryBuilder excludeQuestionType(){
            setFetchFields("excludeFields","questionType");
            return this;
        }

        public QueryBuilder fuzzyQuestionState (List<String> fuzzyQuestionState){
            this.fuzzyQuestionState = fuzzyQuestionState;
            return this;
        }

        public QueryBuilder fuzzyQuestionState (String ... fuzzyQuestionState){
            this.fuzzyQuestionState = solveNullList(fuzzyQuestionState);
            return this;
        }

        public QueryBuilder rightFuzzyQuestionState (List<String> rightFuzzyQuestionState){
            this.rightFuzzyQuestionState = rightFuzzyQuestionState;
            return this;
        }

        public QueryBuilder rightFuzzyQuestionState (String ... rightFuzzyQuestionState){
            this.rightFuzzyQuestionState = solveNullList(rightFuzzyQuestionState);
            return this;
        }

        public QueryBuilder questionState(String questionState){
            setQuestionState(questionState);
            return this;
        }

        public QueryBuilder questionStateList(String ... questionState){
            this.questionStateList = solveNullList(questionState);
            return this;
        }

        public QueryBuilder questionStateList(List<String> questionState){
            this.questionStateList = questionState;
            return this;
        }

        public QueryBuilder fetchQuestionState(){
            setFetchFields("fetchFields","questionState");
            return this;
        }

        public QueryBuilder excludeQuestionState(){
            setFetchFields("excludeFields","questionState");
            return this;
        }

        public QueryBuilder fuzzyResponsibleDepartment (List<String> fuzzyResponsibleDepartment){
            this.fuzzyResponsibleDepartment = fuzzyResponsibleDepartment;
            return this;
        }

        public QueryBuilder fuzzyResponsibleDepartment (String ... fuzzyResponsibleDepartment){
            this.fuzzyResponsibleDepartment = solveNullList(fuzzyResponsibleDepartment);
            return this;
        }

        public QueryBuilder rightFuzzyResponsibleDepartment (List<String> rightFuzzyResponsibleDepartment){
            this.rightFuzzyResponsibleDepartment = rightFuzzyResponsibleDepartment;
            return this;
        }

        public QueryBuilder rightFuzzyResponsibleDepartment (String ... rightFuzzyResponsibleDepartment){
            this.rightFuzzyResponsibleDepartment = solveNullList(rightFuzzyResponsibleDepartment);
            return this;
        }

        public QueryBuilder responsibleDepartment(String responsibleDepartment){
            setResponsibleDepartment(responsibleDepartment);
            return this;
        }

        public QueryBuilder responsibleDepartmentList(String ... responsibleDepartment){
            this.responsibleDepartmentList = solveNullList(responsibleDepartment);
            return this;
        }

        public QueryBuilder responsibleDepartmentList(List<String> responsibleDepartment){
            this.responsibleDepartmentList = responsibleDepartment;
            return this;
        }

        public QueryBuilder fetchResponsibleDepartment(){
            setFetchFields("fetchFields","responsibleDepartment");
            return this;
        }

        public QueryBuilder excludeResponsibleDepartment(){
            setFetchFields("excludeFields","responsibleDepartment");
            return this;
        }

        public QueryBuilder applierIdBetWeen(Integer applierIdSt,Integer applierIdEd){
            this.applierIdSt = applierIdSt;
            this.applierIdEd = applierIdEd;
            return this;
        }

        public QueryBuilder applierIdGreaterEqThan(Integer applierIdSt){
            this.applierIdSt = applierIdSt;
            return this;
        }
        public QueryBuilder applierIdLessEqThan(Integer applierIdEd){
            this.applierIdEd = applierIdEd;
            return this;
        }


        public QueryBuilder applierId(Integer applierId){
            setApplierId(applierId);
            return this;
        }

        public QueryBuilder applierIdList(Integer ... applierId){
            this.applierIdList = solveNullList(applierId);
            return this;
        }

        public QueryBuilder applierIdList(List<Integer> applierId){
            this.applierIdList = applierId;
            return this;
        }

        public QueryBuilder fetchApplierId(){
            setFetchFields("fetchFields","applierId");
            return this;
        }

        public QueryBuilder excludeApplierId(){
            setFetchFields("excludeFields","applierId");
            return this;
        }

        public QueryBuilder fuzzyApplierName (List<String> fuzzyApplierName){
            this.fuzzyApplierName = fuzzyApplierName;
            return this;
        }

        public QueryBuilder fuzzyApplierName (String ... fuzzyApplierName){
            this.fuzzyApplierName = solveNullList(fuzzyApplierName);
            return this;
        }

        public QueryBuilder rightFuzzyApplierName (List<String> rightFuzzyApplierName){
            this.rightFuzzyApplierName = rightFuzzyApplierName;
            return this;
        }

        public QueryBuilder rightFuzzyApplierName (String ... rightFuzzyApplierName){
            this.rightFuzzyApplierName = solveNullList(rightFuzzyApplierName);
            return this;
        }

        public QueryBuilder applierName(String applierName){
            setApplierName(applierName);
            return this;
        }

        public QueryBuilder applierNameList(String ... applierName){
            this.applierNameList = solveNullList(applierName);
            return this;
        }

        public QueryBuilder applierNameList(List<String> applierName){
            this.applierNameList = applierName;
            return this;
        }

        public QueryBuilder fetchApplierName(){
            setFetchFields("fetchFields","applierName");
            return this;
        }

        public QueryBuilder excludeApplierName(){
            setFetchFields("excludeFields","applierName");
            return this;
        }

        public QueryBuilder fuzzyApplyTime (List<String> fuzzyApplyTime){
            this.fuzzyApplyTime = fuzzyApplyTime;
            return this;
        }

        public QueryBuilder fuzzyApplyTime (String ... fuzzyApplyTime){
            this.fuzzyApplyTime = solveNullList(fuzzyApplyTime);
            return this;
        }

        public QueryBuilder rightFuzzyApplyTime (List<String> rightFuzzyApplyTime){
            this.rightFuzzyApplyTime = rightFuzzyApplyTime;
            return this;
        }

        public QueryBuilder rightFuzzyApplyTime (String ... rightFuzzyApplyTime){
            this.rightFuzzyApplyTime = solveNullList(rightFuzzyApplyTime);
            return this;
        }

        public QueryBuilder applyTime(String applyTime){
            setApplyTime(applyTime);
            return this;
        }

        public QueryBuilder applyTimeList(String ... applyTime){
            this.applyTimeList = solveNullList(applyTime);
            return this;
        }

        public QueryBuilder applyTimeList(List<String> applyTime){
            this.applyTimeList = applyTime;
            return this;
        }

        public QueryBuilder fetchApplyTime(){
            setFetchFields("fetchFields","applyTime");
            return this;
        }

        public QueryBuilder excludeApplyTime(){
            setFetchFields("excludeFields","applyTime");
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

        public MqmsVoucher build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> voucherIdList;

        public List<Integer> getVoucherIdList(){return this.voucherIdList;}

        private Integer voucherIdSt;

        private Integer voucherIdEd;

        public Integer getVoucherIdSt(){return this.voucherIdSt;}

        public Integer getVoucherIdEd(){return this.voucherIdEd;}

        private List<String> voucherCodeList;

        public List<String> getVoucherCodeList(){return this.voucherCodeList;}


        private List<String> fuzzyVoucherCode;

        public List<String> getFuzzyVoucherCode(){return this.fuzzyVoucherCode;}

        private List<String> rightFuzzyVoucherCode;

        public List<String> getRightFuzzyVoucherCode(){return this.rightFuzzyVoucherCode;}
        private List<String> claimCodeList;

        public List<String> getClaimCodeList(){return this.claimCodeList;}


        private List<String> fuzzyClaimCode;

        public List<String> getFuzzyClaimCode(){return this.fuzzyClaimCode;}

        private List<String> rightFuzzyClaimCode;

        public List<String> getRightFuzzyClaimCode(){return this.rightFuzzyClaimCode;}
        private List<String> dealerCodeList;

        public List<String> getDealerCodeList(){return this.dealerCodeList;}


        private List<String> fuzzyDealerCode;

        public List<String> getFuzzyDealerCode(){return this.fuzzyDealerCode;}

        private List<String> rightFuzzyDealerCode;

        public List<String> getRightFuzzyDealerCode(){return this.rightFuzzyDealerCode;}
        private List<String> dealerNameList;

        public List<String> getDealerNameList(){return this.dealerNameList;}


        private List<String> fuzzyDealerName;

        public List<String> getFuzzyDealerName(){return this.fuzzyDealerName;}

        private List<String> rightFuzzyDealerName;

        public List<String> getRightFuzzyDealerName(){return this.rightFuzzyDealerName;}
        private List<String> dealerShortNameList;

        public List<String> getDealerShortNameList(){return this.dealerShortNameList;}


        private List<String> fuzzyDealerShortName;

        public List<String> getFuzzyDealerShortName(){return this.fuzzyDealerShortName;}

        private List<String> rightFuzzyDealerShortName;

        public List<String> getRightFuzzyDealerShortName(){return this.rightFuzzyDealerShortName;}
        private List<String> themeList;

        public List<String> getThemeList(){return this.themeList;}


        private List<String> fuzzyTheme;

        public List<String> getFuzzyTheme(){return this.fuzzyTheme;}

        private List<String> rightFuzzyTheme;

        public List<String> getRightFuzzyTheme(){return this.rightFuzzyTheme;}
        private List<String> vinCodeList;

        public List<String> getVinCodeList(){return this.vinCodeList;}


        private List<String> fuzzyVinCode;

        public List<String> getFuzzyVinCode(){return this.fuzzyVinCode;}

        private List<String> rightFuzzyVinCode;

        public List<String> getRightFuzzyVinCode(){return this.rightFuzzyVinCode;}
        private List<String> vehicleTypeList;

        public List<String> getVehicleTypeList(){return this.vehicleTypeList;}


        private List<String> fuzzyVehicleType;

        public List<String> getFuzzyVehicleType(){return this.fuzzyVehicleType;}

        private List<String> rightFuzzyVehicleType;

        public List<String> getRightFuzzyVehicleType(){return this.rightFuzzyVehicleType;}
        private List<String> productionCodeList;

        public List<String> getProductionCodeList(){return this.productionCodeList;}


        private List<String> fuzzyProductionCode;

        public List<String> getFuzzyProductionCode(){return this.fuzzyProductionCode;}

        private List<String> rightFuzzyProductionCode;

        public List<String> getRightFuzzyProductionCode(){return this.rightFuzzyProductionCode;}
        private List<String> partsCodeList;

        public List<String> getPartsCodeList(){return this.partsCodeList;}


        private List<String> fuzzyPartsCode;

        public List<String> getFuzzyPartsCode(){return this.fuzzyPartsCode;}

        private List<String> rightFuzzyPartsCode;

        public List<String> getRightFuzzyPartsCode(){return this.rightFuzzyPartsCode;}
        private List<String> partsNameList;

        public List<String> getPartsNameList(){return this.partsNameList;}


        private List<String> fuzzyPartsName;

        public List<String> getFuzzyPartsName(){return this.fuzzyPartsName;}

        private List<String> rightFuzzyPartsName;

        public List<String> getRightFuzzyPartsName(){return this.rightFuzzyPartsName;}
        private List<String> divisionLevel1List;

        public List<String> getDivisionLevel1List(){return this.divisionLevel1List;}


        private List<String> fuzzyDivisionLevel1;

        public List<String> getFuzzyDivisionLevel1(){return this.fuzzyDivisionLevel1;}

        private List<String> rightFuzzyDivisionLevel1;

        public List<String> getRightFuzzyDivisionLevel1(){return this.rightFuzzyDivisionLevel1;}
        private List<String> divisionLevel2List;

        public List<String> getDivisionLevel2List(){return this.divisionLevel2List;}


        private List<String> fuzzyDivisionLevel2;

        public List<String> getFuzzyDivisionLevel2(){return this.fuzzyDivisionLevel2;}

        private List<String> rightFuzzyDivisionLevel2;

        public List<String> getRightFuzzyDivisionLevel2(){return this.rightFuzzyDivisionLevel2;}
        private List<String> divisionLevel3List;

        public List<String> getDivisionLevel3List(){return this.divisionLevel3List;}


        private List<String> fuzzyDivisionLevel3;

        public List<String> getFuzzyDivisionLevel3(){return this.fuzzyDivisionLevel3;}

        private List<String> rightFuzzyDivisionLevel3;

        public List<String> getRightFuzzyDivisionLevel3(){return this.rightFuzzyDivisionLevel3;}
        private List<String> partsAndSymptomList;

        public List<String> getPartsAndSymptomList(){return this.partsAndSymptomList;}


        private List<String> fuzzyPartsAndSymptom;

        public List<String> getFuzzyPartsAndSymptom(){return this.fuzzyPartsAndSymptom;}

        private List<String> rightFuzzyPartsAndSymptom;

        public List<String> getRightFuzzyPartsAndSymptom(){return this.rightFuzzyPartsAndSymptom;}
        private List<String> offlineDateList;

        public List<String> getOfflineDateList(){return this.offlineDateList;}


        private List<String> fuzzyOfflineDate;

        public List<String> getFuzzyOfflineDate(){return this.fuzzyOfflineDate;}

        private List<String> rightFuzzyOfflineDate;

        public List<String> getRightFuzzyOfflineDate(){return this.rightFuzzyOfflineDate;}
        private List<String> salesDateList;

        public List<String> getSalesDateList(){return this.salesDateList;}


        private List<String> fuzzySalesDate;

        public List<String> getFuzzySalesDate(){return this.fuzzySalesDate;}

        private List<String> rightFuzzySalesDate;

        public List<String> getRightFuzzySalesDate(){return this.rightFuzzySalesDate;}
        private List<String> failureDateList;

        public List<String> getFailureDateList(){return this.failureDateList;}


        private List<String> fuzzyFailureDate;

        public List<String> getFuzzyFailureDate(){return this.fuzzyFailureDate;}

        private List<String> rightFuzzyFailureDate;

        public List<String> getRightFuzzyFailureDate(){return this.rightFuzzyFailureDate;}
        private List<Integer> mileageList;

        public List<Integer> getMileageList(){return this.mileageList;}

        private Integer mileageSt;

        private Integer mileageEd;

        public Integer getMileageSt(){return this.mileageSt;}

        public Integer getMileageEd(){return this.mileageEd;}

        private List<String> confirmDateList;

        public List<String> getConfirmDateList(){return this.confirmDateList;}


        private List<String> fuzzyConfirmDate;

        public List<String> getFuzzyConfirmDate(){return this.fuzzyConfirmDate;}

        private List<String> rightFuzzyConfirmDate;

        public List<String> getRightFuzzyConfirmDate(){return this.rightFuzzyConfirmDate;}
        private List<String> warehousingDateList;

        public List<String> getWarehousingDateList(){return this.warehousingDateList;}


        private List<String> fuzzyWarehousingDate;

        public List<String> getFuzzyWarehousingDate(){return this.fuzzyWarehousingDate;}

        private List<String> rightFuzzyWarehousingDate;

        public List<String> getRightFuzzyWarehousingDate(){return this.rightFuzzyWarehousingDate;}
        private List<String> transportDateList;

        public List<String> getTransportDateList(){return this.transportDateList;}


        private List<String> fuzzyTransportDate;

        public List<String> getFuzzyTransportDate(){return this.fuzzyTransportDate;}

        private List<String> rightFuzzyTransportDate;

        public List<String> getRightFuzzyTransportDate(){return this.rightFuzzyTransportDate;}
        private List<String> shopArrivalDateList;

        public List<String> getShopArrivalDateList(){return this.shopArrivalDateList;}


        private List<String> fuzzyShopArrivalDate;

        public List<String> getFuzzyShopArrivalDate(){return this.fuzzyShopArrivalDate;}

        private List<String> rightFuzzyShopArrivalDate;

        public List<String> getRightFuzzyShopArrivalDate(){return this.rightFuzzyShopArrivalDate;}
        private List<Integer> salesFailureTimeList;

        public List<Integer> getSalesFailureTimeList(){return this.salesFailureTimeList;}

        private Integer salesFailureTimeSt;

        private Integer salesFailureTimeEd;

        public Integer getSalesFailureTimeSt(){return this.salesFailureTimeSt;}

        public Integer getSalesFailureTimeEd(){return this.salesFailureTimeEd;}

        private List<String> failureDescList;

        public List<String> getFailureDescList(){return this.failureDescList;}


        private List<String> fuzzyFailureDesc;

        public List<String> getFuzzyFailureDesc(){return this.fuzzyFailureDesc;}

        private List<String> rightFuzzyFailureDesc;

        public List<String> getRightFuzzyFailureDesc(){return this.rightFuzzyFailureDesc;}
        private List<String> diagnosticResultList;

        public List<String> getDiagnosticResultList(){return this.diagnosticResultList;}


        private List<String> fuzzyDiagnosticResult;

        public List<String> getFuzzyDiagnosticResult(){return this.fuzzyDiagnosticResult;}

        private List<String> rightFuzzyDiagnosticResult;

        public List<String> getRightFuzzyDiagnosticResult(){return this.rightFuzzyDiagnosticResult;}
        private List<java.math.BigDecimal> manCostList;

        public List<java.math.BigDecimal> getManCostList(){return this.manCostList;}

        private java.math.BigDecimal manCostSt;

        private java.math.BigDecimal manCostEd;

        public java.math.BigDecimal getManCostSt(){return this.manCostSt;}

        public java.math.BigDecimal getManCostEd(){return this.manCostEd;}

        private List<java.math.BigDecimal> materialCostList;

        public List<java.math.BigDecimal> getMaterialCostList(){return this.materialCostList;}

        private java.math.BigDecimal materialCostSt;

        private java.math.BigDecimal materialCostEd;

        public java.math.BigDecimal getMaterialCostSt(){return this.materialCostSt;}

        public java.math.BigDecimal getMaterialCostEd(){return this.materialCostEd;}

        private List<java.math.BigDecimal> materialManagementCostList;

        public List<java.math.BigDecimal> getMaterialManagementCostList(){return this.materialManagementCostList;}

        private java.math.BigDecimal materialManagementCostSt;

        private java.math.BigDecimal materialManagementCostEd;

        public java.math.BigDecimal getMaterialManagementCostSt(){return this.materialManagementCostSt;}

        public java.math.BigDecimal getMaterialManagementCostEd(){return this.materialManagementCostEd;}

        private List<java.math.BigDecimal> goOutCostList;

        public List<java.math.BigDecimal> getGoOutCostList(){return this.goOutCostList;}

        private java.math.BigDecimal goOutCostSt;

        private java.math.BigDecimal goOutCostEd;

        public java.math.BigDecimal getGoOutCostSt(){return this.goOutCostSt;}

        public java.math.BigDecimal getGoOutCostEd(){return this.goOutCostEd;}

        private List<java.math.BigDecimal> maintainingCostList;

        public List<java.math.BigDecimal> getMaintainingCostList(){return this.maintainingCostList;}

        private java.math.BigDecimal maintainingCostSt;

        private java.math.BigDecimal maintainingCostEd;

        public java.math.BigDecimal getMaintainingCostSt(){return this.maintainingCostSt;}

        public java.math.BigDecimal getMaintainingCostEd(){return this.maintainingCostEd;}

        private List<java.math.BigDecimal> otherCostList;

        public List<java.math.BigDecimal> getOtherCostList(){return this.otherCostList;}

        private java.math.BigDecimal otherCostSt;

        private java.math.BigDecimal otherCostEd;

        public java.math.BigDecimal getOtherCostSt(){return this.otherCostSt;}

        public java.math.BigDecimal getOtherCostEd(){return this.otherCostEd;}

        private List<java.math.BigDecimal> totalCostList;

        public List<java.math.BigDecimal> getTotalCostList(){return this.totalCostList;}

        private java.math.BigDecimal totalCostSt;

        private java.math.BigDecimal totalCostEd;

        public java.math.BigDecimal getTotalCostSt(){return this.totalCostSt;}

        public java.math.BigDecimal getTotalCostEd(){return this.totalCostEd;}

        private List<String> importantLevelList;

        public List<String> getImportantLevelList(){return this.importantLevelList;}


        private List<String> fuzzyImportantLevel;

        public List<String> getFuzzyImportantLevel(){return this.fuzzyImportantLevel;}

        private List<String> rightFuzzyImportantLevel;

        public List<String> getRightFuzzyImportantLevel(){return this.rightFuzzyImportantLevel;}
        private List<String> transmissionTypeList;

        public List<String> getTransmissionTypeList(){return this.transmissionTypeList;}


        private List<String> fuzzyTransmissionType;

        public List<String> getFuzzyTransmissionType(){return this.fuzzyTransmissionType;}

        private List<String> rightFuzzyTransmissionType;

        public List<String> getRightFuzzyTransmissionType(){return this.rightFuzzyTransmissionType;}
        private List<String> newPartsBondList;

        public List<String> getNewPartsBondList(){return this.newPartsBondList;}


        private List<String> fuzzyNewPartsBond;

        public List<String> getFuzzyNewPartsBond(){return this.fuzzyNewPartsBond;}

        private List<String> rightFuzzyNewPartsBond;

        public List<String> getRightFuzzyNewPartsBond(){return this.rightFuzzyNewPartsBond;}
        private List<String> submitDateList;

        public List<String> getSubmitDateList(){return this.submitDateList;}


        private List<String> fuzzySubmitDate;

        public List<String> getFuzzySubmitDate(){return this.fuzzySubmitDate;}

        private List<String> rightFuzzySubmitDate;

        public List<String> getRightFuzzySubmitDate(){return this.rightFuzzySubmitDate;}
        private List<String> egtypeCodeList;

        public List<String> getEgtypeCodeList(){return this.egtypeCodeList;}


        private List<String> fuzzyEgtypeCode;

        public List<String> getFuzzyEgtypeCode(){return this.fuzzyEgtypeCode;}

        private List<String> rightFuzzyEgtypeCode;

        public List<String> getRightFuzzyEgtypeCode(){return this.rightFuzzyEgtypeCode;}
        private List<String> engProductionDateList;

        public List<String> getEngProductionDateList(){return this.engProductionDateList;}


        private List<String> fuzzyEngProductionDate;

        public List<String> getFuzzyEngProductionDate(){return this.fuzzyEngProductionDate;}

        private List<String> rightFuzzyEngProductionDate;

        public List<String> getRightFuzzyEngProductionDate(){return this.rightFuzzyEngProductionDate;}
        private List<String> transmissionCodeList;

        public List<String> getTransmissionCodeList(){return this.transmissionCodeList;}


        private List<String> fuzzyTransmissionCode;

        public List<String> getFuzzyTransmissionCode(){return this.fuzzyTransmissionCode;}

        private List<String> rightFuzzyTransmissionCode;

        public List<String> getRightFuzzyTransmissionCode(){return this.rightFuzzyTransmissionCode;}
        private List<String> transmissionProductionDateList;

        public List<String> getTransmissionProductionDateList(){return this.transmissionProductionDateList;}


        private List<String> fuzzyTransmissionProductionDate;

        public List<String> getFuzzyTransmissionProductionDate(){return this.fuzzyTransmissionProductionDate;}

        private List<String> rightFuzzyTransmissionProductionDate;

        public List<String> getRightFuzzyTransmissionProductionDate(){return this.rightFuzzyTransmissionProductionDate;}
        private List<String> engArrangeList;

        public List<String> getEngArrangeList(){return this.engArrangeList;}


        private List<String> fuzzyEngArrange;

        public List<String> getFuzzyEngArrange(){return this.fuzzyEngArrange;}

        private List<String> rightFuzzyEngArrange;

        public List<String> getRightFuzzyEngArrange(){return this.rightFuzzyEngArrange;}
        private List<String> carModelList;

        public List<String> getCarModelList(){return this.carModelList;}


        private List<String> fuzzyCarModel;

        public List<String> getFuzzyCarModel(){return this.fuzzyCarModel;}

        private List<String> rightFuzzyCarModel;

        public List<String> getRightFuzzyCarModel(){return this.rightFuzzyCarModel;}
        private List<String> engTypeList;

        public List<String> getEngTypeList(){return this.engTypeList;}


        private List<String> fuzzyEngType;

        public List<String> getFuzzyEngType(){return this.fuzzyEngType;}

        private List<String> rightFuzzyEngType;

        public List<String> getRightFuzzyEngType(){return this.rightFuzzyEngType;}
        private List<String> receiveTimeList;

        public List<String> getReceiveTimeList(){return this.receiveTimeList;}


        private List<String> fuzzyReceiveTime;

        public List<String> getFuzzyReceiveTime(){return this.fuzzyReceiveTime;}

        private List<String> rightFuzzyReceiveTime;

        public List<String> getRightFuzzyReceiveTime(){return this.rightFuzzyReceiveTime;}
        private List<String> claimCompensationList;

        public List<String> getClaimCompensationList(){return this.claimCompensationList;}


        private List<String> fuzzyClaimCompensation;

        public List<String> getFuzzyClaimCompensation(){return this.fuzzyClaimCompensation;}

        private List<String> rightFuzzyClaimCompensation;

        public List<String> getRightFuzzyClaimCompensation(){return this.rightFuzzyClaimCompensation;}
        private List<String> productionRawDescriptionList;

        public List<String> getProductionRawDescriptionList(){return this.productionRawDescriptionList;}


        private List<String> fuzzyProductionRawDescription;

        public List<String> getFuzzyProductionRawDescription(){return this.fuzzyProductionRawDescription;}

        private List<String> rightFuzzyProductionRawDescription;

        public List<String> getRightFuzzyProductionRawDescription(){return this.rightFuzzyProductionRawDescription;}
        private List<String> PDIList;

        public List<String> getPDIList(){return this.PDIList;}


        private List<String> fuzzyPDI;

        public List<String> getFuzzyPDI(){return this.fuzzyPDI;}

        private List<String> rightFuzzyPDI;

        public List<String> getRightFuzzyPDI(){return this.rightFuzzyPDI;}
        private List<Integer> offlineFailureTimeList;

        public List<Integer> getOfflineFailureTimeList(){return this.offlineFailureTimeList;}

        private Integer offlineFailureTimeSt;

        private Integer offlineFailureTimeEd;

        public Integer getOfflineFailureTimeSt(){return this.offlineFailureTimeSt;}

        public Integer getOfflineFailureTimeEd(){return this.offlineFailureTimeEd;}

        private List<String> engOrTranList;

        public List<String> getEngOrTranList(){return this.engOrTranList;}


        private List<String> fuzzyEngOrTran;

        public List<String> getFuzzyEngOrTran(){return this.fuzzyEngOrTran;}

        private List<String> rightFuzzyEngOrTran;

        public List<String> getRightFuzzyEngOrTran(){return this.rightFuzzyEngOrTran;}
        private List<String> carSeriesCodeList;

        public List<String> getCarSeriesCodeList(){return this.carSeriesCodeList;}


        private List<String> fuzzyCarSeriesCode;

        public List<String> getFuzzyCarSeriesCode(){return this.fuzzyCarSeriesCode;}

        private List<String> rightFuzzyCarSeriesCode;

        public List<String> getRightFuzzyCarSeriesCode(){return this.rightFuzzyCarSeriesCode;}
        private List<String> shortCodeList;

        public List<String> getShortCodeList(){return this.shortCodeList;}


        private List<String> fuzzyShortCode;

        public List<String> getFuzzyShortCode(){return this.fuzzyShortCode;}

        private List<String> rightFuzzyShortCode;

        public List<String> getRightFuzzyShortCode(){return this.rightFuzzyShortCode;}
        private List<String> faultCodeClassificationList;

        public List<String> getFaultCodeClassificationList(){return this.faultCodeClassificationList;}


        private List<String> fuzzyFaultCodeClassification;

        public List<String> getFuzzyFaultCodeClassification(){return this.fuzzyFaultCodeClassification;}

        private List<String> rightFuzzyFaultCodeClassification;

        public List<String> getRightFuzzyFaultCodeClassification(){return this.rightFuzzyFaultCodeClassification;}
        private List<String> failureYearList;

        public List<String> getFailureYearList(){return this.failureYearList;}


        private List<String> fuzzyFailureYear;

        public List<String> getFuzzyFailureYear(){return this.fuzzyFailureYear;}

        private List<String> rightFuzzyFailureYear;

        public List<String> getRightFuzzyFailureYear(){return this.rightFuzzyFailureYear;}
        private List<String> failureMonthList;

        public List<String> getFailureMonthList(){return this.failureMonthList;}


        private List<String> fuzzyFailureMonth;

        public List<String> getFuzzyFailureMonth(){return this.fuzzyFailureMonth;}

        private List<String> rightFuzzyFailureMonth;

        public List<String> getRightFuzzyFailureMonth(){return this.rightFuzzyFailureMonth;}
        private List<String> transmissionShortCodeList;

        public List<String> getTransmissionShortCodeList(){return this.transmissionShortCodeList;}


        private List<String> fuzzyTransmissionShortCode;

        public List<String> getFuzzyTransmissionShortCode(){return this.fuzzyTransmissionShortCode;}

        private List<String> rightFuzzyTransmissionShortCode;

        public List<String> getRightFuzzyTransmissionShortCode(){return this.rightFuzzyTransmissionShortCode;}
        private List<String> mileageDistributionList;

        public List<String> getMileageDistributionList(){return this.mileageDistributionList;}


        private List<String> fuzzyMileageDistribution;

        public List<String> getFuzzyMileageDistribution(){return this.fuzzyMileageDistribution;}

        private List<String> rightFuzzyMileageDistribution;

        public List<String> getRightFuzzyMileageDistribution(){return this.rightFuzzyMileageDistribution;}
        private List<String> returnRequestList;

        public List<String> getReturnRequestList(){return this.returnRequestList;}


        private List<String> fuzzyReturnRequest;

        public List<String> getFuzzyReturnRequest(){return this.fuzzyReturnRequest;}

        private List<String> rightFuzzyReturnRequest;

        public List<String> getRightFuzzyReturnRequest(){return this.rightFuzzyReturnRequest;}
        private List<String> returnDateList;

        public List<String> getReturnDateList(){return this.returnDateList;}


        private List<String> fuzzyReturnDate;

        public List<String> getFuzzyReturnDate(){return this.fuzzyReturnDate;}

        private List<String> rightFuzzyReturnDate;

        public List<String> getRightFuzzyReturnDate(){return this.rightFuzzyReturnDate;}
        private List<String> arriveDateList;

        public List<String> getArriveDateList(){return this.arriveDateList;}


        private List<String> fuzzyArriveDate;

        public List<String> getFuzzyArriveDate(){return this.fuzzyArriveDate;}

        private List<String> rightFuzzyArriveDate;

        public List<String> getRightFuzzyArriveDate(){return this.rightFuzzyArriveDate;}
        private List<String> loadingVerificationList;

        public List<String> getLoadingVerificationList(){return this.loadingVerificationList;}


        private List<String> fuzzyLoadingVerification;

        public List<String> getFuzzyLoadingVerification(){return this.fuzzyLoadingVerification;}

        private List<String> rightFuzzyLoadingVerification;

        public List<String> getRightFuzzyLoadingVerification(){return this.rightFuzzyLoadingVerification;}
        private List<String> faultReconstructionerList;

        public List<String> getFaultReconstructionerList(){return this.faultReconstructionerList;}


        private List<String> fuzzyFaultReconstructioner;

        public List<String> getFuzzyFaultReconstructioner(){return this.fuzzyFaultReconstructioner;}

        private List<String> rightFuzzyFaultReconstructioner;

        public List<String> getRightFuzzyFaultReconstructioner(){return this.rightFuzzyFaultReconstructioner;}
        private List<String> loadingDateList;

        public List<String> getLoadingDateList(){return this.loadingDateList;}


        private List<String> fuzzyLoadingDate;

        public List<String> getFuzzyLoadingDate(){return this.fuzzyLoadingDate;}

        private List<String> rightFuzzyLoadingDate;

        public List<String> getRightFuzzyLoadingDate(){return this.rightFuzzyLoadingDate;}
        private List<String> faultReconstructionList;

        public List<String> getFaultReconstructionList(){return this.faultReconstructionList;}


        private List<String> fuzzyFaultReconstruction;

        public List<String> getFuzzyFaultReconstruction(){return this.fuzzyFaultReconstruction;}

        private List<String> rightFuzzyFaultReconstruction;

        public List<String> getRightFuzzyFaultReconstruction(){return this.rightFuzzyFaultReconstruction;}
        private List<String> faultReconstructionDateList;

        public List<String> getFaultReconstructionDateList(){return this.faultReconstructionDateList;}


        private List<String> fuzzyFaultReconstructionDate;

        public List<String> getFuzzyFaultReconstructionDate(){return this.fuzzyFaultReconstructionDate;}

        private List<String> rightFuzzyFaultReconstructionDate;

        public List<String> getRightFuzzyFaultReconstructionDate(){return this.rightFuzzyFaultReconstructionDate;}
        private List<String> transferDate1List;

        public List<String> getTransferDate1List(){return this.transferDate1List;}


        private List<String> fuzzyTransferDate1;

        public List<String> getFuzzyTransferDate1(){return this.fuzzyTransferDate1;}

        private List<String> rightFuzzyTransferDate1;

        public List<String> getRightFuzzyTransferDate1(){return this.rightFuzzyTransferDate1;}
        private List<String> responsible1List;

        public List<String> getResponsible1List(){return this.responsible1List;}


        private List<String> fuzzyResponsible1;

        public List<String> getFuzzyResponsible1(){return this.fuzzyResponsible1;}

        private List<String> rightFuzzyResponsible1;

        public List<String> getRightFuzzyResponsible1(){return this.rightFuzzyResponsible1;}
        private List<String> transferDate2List;

        public List<String> getTransferDate2List(){return this.transferDate2List;}


        private List<String> fuzzyTransferDate2;

        public List<String> getFuzzyTransferDate2(){return this.fuzzyTransferDate2;}

        private List<String> rightFuzzyTransferDate2;

        public List<String> getRightFuzzyTransferDate2(){return this.rightFuzzyTransferDate2;}
        private List<String> responsible2List;

        public List<String> getResponsible2List(){return this.responsible2List;}


        private List<String> fuzzyResponsible2;

        public List<String> getFuzzyResponsible2(){return this.fuzzyResponsible2;}

        private List<String> rightFuzzyResponsible2;

        public List<String> getRightFuzzyResponsible2(){return this.rightFuzzyResponsible2;}
        private List<String> estimateMeetingDateList;

        public List<String> getEstimateMeetingDateList(){return this.estimateMeetingDateList;}


        private List<String> fuzzyEstimateMeetingDate;

        public List<String> getFuzzyEstimateMeetingDate(){return this.fuzzyEstimateMeetingDate;}

        private List<String> rightFuzzyEstimateMeetingDate;

        public List<String> getRightFuzzyEstimateMeetingDate(){return this.rightFuzzyEstimateMeetingDate;}
        private List<String> submitReportList;

        public List<String> getSubmitReportList(){return this.submitReportList;}


        private List<String> fuzzySubmitReport;

        public List<String> getFuzzySubmitReport(){return this.fuzzySubmitReport;}

        private List<String> rightFuzzySubmitReport;

        public List<String> getRightFuzzySubmitReport(){return this.rightFuzzySubmitReport;}
        private List<String> reasonList;

        public List<String> getReasonList(){return this.reasonList;}


        private List<String> fuzzyReason;

        public List<String> getFuzzyReason(){return this.fuzzyReason;}

        private List<String> rightFuzzyReason;

        public List<String> getRightFuzzyReason(){return this.rightFuzzyReason;}
        private List<String> countermeasureList;

        public List<String> getCountermeasureList(){return this.countermeasureList;}


        private List<String> fuzzyCountermeasure;

        public List<String> getFuzzyCountermeasure(){return this.fuzzyCountermeasure;}

        private List<String> rightFuzzyCountermeasure;

        public List<String> getRightFuzzyCountermeasure(){return this.rightFuzzyCountermeasure;}
        private List<String> reportSubmitList;

        public List<String> getReportSubmitList(){return this.reportSubmitList;}


        private List<String> fuzzyReportSubmit;

        public List<String> getFuzzyReportSubmit(){return this.fuzzyReportSubmit;}

        private List<String> rightFuzzyReportSubmit;

        public List<String> getRightFuzzyReportSubmit(){return this.rightFuzzyReportSubmit;}
        private List<String> claimIndemnityList;

        public List<String> getClaimIndemnityList(){return this.claimIndemnityList;}


        private List<String> fuzzyClaimIndemnity;

        public List<String> getFuzzyClaimIndemnity(){return this.fuzzyClaimIndemnity;}

        private List<String> rightFuzzyClaimIndemnity;

        public List<String> getRightFuzzyClaimIndemnity(){return this.rightFuzzyClaimIndemnity;}
        private List<String> questionTypeList;

        public List<String> getQuestionTypeList(){return this.questionTypeList;}


        private List<String> fuzzyQuestionType;

        public List<String> getFuzzyQuestionType(){return this.fuzzyQuestionType;}

        private List<String> rightFuzzyQuestionType;

        public List<String> getRightFuzzyQuestionType(){return this.rightFuzzyQuestionType;}
        private List<String> questionStateList;

        public List<String> getQuestionStateList(){return this.questionStateList;}


        private List<String> fuzzyQuestionState;

        public List<String> getFuzzyQuestionState(){return this.fuzzyQuestionState;}

        private List<String> rightFuzzyQuestionState;

        public List<String> getRightFuzzyQuestionState(){return this.rightFuzzyQuestionState;}
        private List<String> responsibleDepartmentList;

        public List<String> getResponsibleDepartmentList(){return this.responsibleDepartmentList;}


        private List<String> fuzzyResponsibleDepartment;

        public List<String> getFuzzyResponsibleDepartment(){return this.fuzzyResponsibleDepartment;}

        private List<String> rightFuzzyResponsibleDepartment;

        public List<String> getRightFuzzyResponsibleDepartment(){return this.rightFuzzyResponsibleDepartment;}
        private List<Integer> applierIdList;

        public List<Integer> getApplierIdList(){return this.applierIdList;}

        private Integer applierIdSt;

        private Integer applierIdEd;

        public Integer getApplierIdSt(){return this.applierIdSt;}

        public Integer getApplierIdEd(){return this.applierIdEd;}

        private List<String> applierNameList;

        public List<String> getApplierNameList(){return this.applierNameList;}


        private List<String> fuzzyApplierName;

        public List<String> getFuzzyApplierName(){return this.fuzzyApplierName;}

        private List<String> rightFuzzyApplierName;

        public List<String> getRightFuzzyApplierName(){return this.rightFuzzyApplierName;}
        private List<String> applyTimeList;

        public List<String> getApplyTimeList(){return this.applyTimeList;}


        private List<String> fuzzyApplyTime;

        public List<String> getFuzzyApplyTime(){return this.fuzzyApplyTime;}

        private List<String> rightFuzzyApplyTime;

        public List<String> getRightFuzzyApplyTime(){return this.rightFuzzyApplyTime;}

        public ConditionBuilder voucherIdBetWeen(Integer voucherIdSt,Integer voucherIdEd){
            this.voucherIdSt = voucherIdSt;
            this.voucherIdEd = voucherIdEd;
            return this;
        }

        public ConditionBuilder voucherIdGreaterEqThan(Integer voucherIdSt){
            this.voucherIdSt = voucherIdSt;
            return this;
        }
        public ConditionBuilder voucherIdLessEqThan(Integer voucherIdEd){
            this.voucherIdEd = voucherIdEd;
            return this;
        }


        public ConditionBuilder voucherIdList(Integer ... voucherId){
            this.voucherIdList = solveNullList(voucherId);
            return this;
        }

        public ConditionBuilder voucherIdList(List<Integer> voucherId){
            this.voucherIdList = voucherId;
            return this;
        }

        public ConditionBuilder fuzzyVoucherCode (List<String> fuzzyVoucherCode){
            this.fuzzyVoucherCode = fuzzyVoucherCode;
            return this;
        }

        public ConditionBuilder fuzzyVoucherCode (String ... fuzzyVoucherCode){
            this.fuzzyVoucherCode = solveNullList(fuzzyVoucherCode);
            return this;
        }

        public ConditionBuilder rightFuzzyVoucherCode (List<String> rightFuzzyVoucherCode){
            this.rightFuzzyVoucherCode = rightFuzzyVoucherCode;
            return this;
        }

        public ConditionBuilder rightFuzzyVoucherCode (String ... rightFuzzyVoucherCode){
            this.rightFuzzyVoucherCode = solveNullList(rightFuzzyVoucherCode);
            return this;
        }

        public ConditionBuilder voucherCodeList(String ... voucherCode){
            this.voucherCodeList = solveNullList(voucherCode);
            return this;
        }

        public ConditionBuilder voucherCodeList(List<String> voucherCode){
            this.voucherCodeList = voucherCode;
            return this;
        }

        public ConditionBuilder fuzzyClaimCode (List<String> fuzzyClaimCode){
            this.fuzzyClaimCode = fuzzyClaimCode;
            return this;
        }

        public ConditionBuilder fuzzyClaimCode (String ... fuzzyClaimCode){
            this.fuzzyClaimCode = solveNullList(fuzzyClaimCode);
            return this;
        }

        public ConditionBuilder rightFuzzyClaimCode (List<String> rightFuzzyClaimCode){
            this.rightFuzzyClaimCode = rightFuzzyClaimCode;
            return this;
        }

        public ConditionBuilder rightFuzzyClaimCode (String ... rightFuzzyClaimCode){
            this.rightFuzzyClaimCode = solveNullList(rightFuzzyClaimCode);
            return this;
        }

        public ConditionBuilder claimCodeList(String ... claimCode){
            this.claimCodeList = solveNullList(claimCode);
            return this;
        }

        public ConditionBuilder claimCodeList(List<String> claimCode){
            this.claimCodeList = claimCode;
            return this;
        }

        public ConditionBuilder fuzzyDealerCode (List<String> fuzzyDealerCode){
            this.fuzzyDealerCode = fuzzyDealerCode;
            return this;
        }

        public ConditionBuilder fuzzyDealerCode (String ... fuzzyDealerCode){
            this.fuzzyDealerCode = solveNullList(fuzzyDealerCode);
            return this;
        }

        public ConditionBuilder rightFuzzyDealerCode (List<String> rightFuzzyDealerCode){
            this.rightFuzzyDealerCode = rightFuzzyDealerCode;
            return this;
        }

        public ConditionBuilder rightFuzzyDealerCode (String ... rightFuzzyDealerCode){
            this.rightFuzzyDealerCode = solveNullList(rightFuzzyDealerCode);
            return this;
        }

        public ConditionBuilder dealerCodeList(String ... dealerCode){
            this.dealerCodeList = solveNullList(dealerCode);
            return this;
        }

        public ConditionBuilder dealerCodeList(List<String> dealerCode){
            this.dealerCodeList = dealerCode;
            return this;
        }

        public ConditionBuilder fuzzyDealerName (List<String> fuzzyDealerName){
            this.fuzzyDealerName = fuzzyDealerName;
            return this;
        }

        public ConditionBuilder fuzzyDealerName (String ... fuzzyDealerName){
            this.fuzzyDealerName = solveNullList(fuzzyDealerName);
            return this;
        }

        public ConditionBuilder rightFuzzyDealerName (List<String> rightFuzzyDealerName){
            this.rightFuzzyDealerName = rightFuzzyDealerName;
            return this;
        }

        public ConditionBuilder rightFuzzyDealerName (String ... rightFuzzyDealerName){
            this.rightFuzzyDealerName = solveNullList(rightFuzzyDealerName);
            return this;
        }

        public ConditionBuilder dealerNameList(String ... dealerName){
            this.dealerNameList = solveNullList(dealerName);
            return this;
        }

        public ConditionBuilder dealerNameList(List<String> dealerName){
            this.dealerNameList = dealerName;
            return this;
        }

        public ConditionBuilder fuzzyDealerShortName (List<String> fuzzyDealerShortName){
            this.fuzzyDealerShortName = fuzzyDealerShortName;
            return this;
        }

        public ConditionBuilder fuzzyDealerShortName (String ... fuzzyDealerShortName){
            this.fuzzyDealerShortName = solveNullList(fuzzyDealerShortName);
            return this;
        }

        public ConditionBuilder rightFuzzyDealerShortName (List<String> rightFuzzyDealerShortName){
            this.rightFuzzyDealerShortName = rightFuzzyDealerShortName;
            return this;
        }

        public ConditionBuilder rightFuzzyDealerShortName (String ... rightFuzzyDealerShortName){
            this.rightFuzzyDealerShortName = solveNullList(rightFuzzyDealerShortName);
            return this;
        }

        public ConditionBuilder dealerShortNameList(String ... dealerShortName){
            this.dealerShortNameList = solveNullList(dealerShortName);
            return this;
        }

        public ConditionBuilder dealerShortNameList(List<String> dealerShortName){
            this.dealerShortNameList = dealerShortName;
            return this;
        }

        public ConditionBuilder fuzzyTheme (List<String> fuzzyTheme){
            this.fuzzyTheme = fuzzyTheme;
            return this;
        }

        public ConditionBuilder fuzzyTheme (String ... fuzzyTheme){
            this.fuzzyTheme = solveNullList(fuzzyTheme);
            return this;
        }

        public ConditionBuilder rightFuzzyTheme (List<String> rightFuzzyTheme){
            this.rightFuzzyTheme = rightFuzzyTheme;
            return this;
        }

        public ConditionBuilder rightFuzzyTheme (String ... rightFuzzyTheme){
            this.rightFuzzyTheme = solveNullList(rightFuzzyTheme);
            return this;
        }

        public ConditionBuilder themeList(String ... theme){
            this.themeList = solveNullList(theme);
            return this;
        }

        public ConditionBuilder themeList(List<String> theme){
            this.themeList = theme;
            return this;
        }

        public ConditionBuilder fuzzyVinCode (List<String> fuzzyVinCode){
            this.fuzzyVinCode = fuzzyVinCode;
            return this;
        }

        public ConditionBuilder fuzzyVinCode (String ... fuzzyVinCode){
            this.fuzzyVinCode = solveNullList(fuzzyVinCode);
            return this;
        }

        public ConditionBuilder rightFuzzyVinCode (List<String> rightFuzzyVinCode){
            this.rightFuzzyVinCode = rightFuzzyVinCode;
            return this;
        }

        public ConditionBuilder rightFuzzyVinCode (String ... rightFuzzyVinCode){
            this.rightFuzzyVinCode = solveNullList(rightFuzzyVinCode);
            return this;
        }

        public ConditionBuilder vinCodeList(String ... vinCode){
            this.vinCodeList = solveNullList(vinCode);
            return this;
        }

        public ConditionBuilder vinCodeList(List<String> vinCode){
            this.vinCodeList = vinCode;
            return this;
        }

        public ConditionBuilder fuzzyVehicleType (List<String> fuzzyVehicleType){
            this.fuzzyVehicleType = fuzzyVehicleType;
            return this;
        }

        public ConditionBuilder fuzzyVehicleType (String ... fuzzyVehicleType){
            this.fuzzyVehicleType = solveNullList(fuzzyVehicleType);
            return this;
        }

        public ConditionBuilder rightFuzzyVehicleType (List<String> rightFuzzyVehicleType){
            this.rightFuzzyVehicleType = rightFuzzyVehicleType;
            return this;
        }

        public ConditionBuilder rightFuzzyVehicleType (String ... rightFuzzyVehicleType){
            this.rightFuzzyVehicleType = solveNullList(rightFuzzyVehicleType);
            return this;
        }

        public ConditionBuilder vehicleTypeList(String ... vehicleType){
            this.vehicleTypeList = solveNullList(vehicleType);
            return this;
        }

        public ConditionBuilder vehicleTypeList(List<String> vehicleType){
            this.vehicleTypeList = vehicleType;
            return this;
        }

        public ConditionBuilder fuzzyProductionCode (List<String> fuzzyProductionCode){
            this.fuzzyProductionCode = fuzzyProductionCode;
            return this;
        }

        public ConditionBuilder fuzzyProductionCode (String ... fuzzyProductionCode){
            this.fuzzyProductionCode = solveNullList(fuzzyProductionCode);
            return this;
        }

        public ConditionBuilder rightFuzzyProductionCode (List<String> rightFuzzyProductionCode){
            this.rightFuzzyProductionCode = rightFuzzyProductionCode;
            return this;
        }

        public ConditionBuilder rightFuzzyProductionCode (String ... rightFuzzyProductionCode){
            this.rightFuzzyProductionCode = solveNullList(rightFuzzyProductionCode);
            return this;
        }

        public ConditionBuilder productionCodeList(String ... productionCode){
            this.productionCodeList = solveNullList(productionCode);
            return this;
        }

        public ConditionBuilder productionCodeList(List<String> productionCode){
            this.productionCodeList = productionCode;
            return this;
        }

        public ConditionBuilder fuzzyPartsCode (List<String> fuzzyPartsCode){
            this.fuzzyPartsCode = fuzzyPartsCode;
            return this;
        }

        public ConditionBuilder fuzzyPartsCode (String ... fuzzyPartsCode){
            this.fuzzyPartsCode = solveNullList(fuzzyPartsCode);
            return this;
        }

        public ConditionBuilder rightFuzzyPartsCode (List<String> rightFuzzyPartsCode){
            this.rightFuzzyPartsCode = rightFuzzyPartsCode;
            return this;
        }

        public ConditionBuilder rightFuzzyPartsCode (String ... rightFuzzyPartsCode){
            this.rightFuzzyPartsCode = solveNullList(rightFuzzyPartsCode);
            return this;
        }

        public ConditionBuilder partsCodeList(String ... partsCode){
            this.partsCodeList = solveNullList(partsCode);
            return this;
        }

        public ConditionBuilder partsCodeList(List<String> partsCode){
            this.partsCodeList = partsCode;
            return this;
        }

        public ConditionBuilder fuzzyPartsName (List<String> fuzzyPartsName){
            this.fuzzyPartsName = fuzzyPartsName;
            return this;
        }

        public ConditionBuilder fuzzyPartsName (String ... fuzzyPartsName){
            this.fuzzyPartsName = solveNullList(fuzzyPartsName);
            return this;
        }

        public ConditionBuilder rightFuzzyPartsName (List<String> rightFuzzyPartsName){
            this.rightFuzzyPartsName = rightFuzzyPartsName;
            return this;
        }

        public ConditionBuilder rightFuzzyPartsName (String ... rightFuzzyPartsName){
            this.rightFuzzyPartsName = solveNullList(rightFuzzyPartsName);
            return this;
        }

        public ConditionBuilder partsNameList(String ... partsName){
            this.partsNameList = solveNullList(partsName);
            return this;
        }

        public ConditionBuilder partsNameList(List<String> partsName){
            this.partsNameList = partsName;
            return this;
        }

        public ConditionBuilder fuzzyDivisionLevel1 (List<String> fuzzyDivisionLevel1){
            this.fuzzyDivisionLevel1 = fuzzyDivisionLevel1;
            return this;
        }

        public ConditionBuilder fuzzyDivisionLevel1 (String ... fuzzyDivisionLevel1){
            this.fuzzyDivisionLevel1 = solveNullList(fuzzyDivisionLevel1);
            return this;
        }

        public ConditionBuilder rightFuzzyDivisionLevel1 (List<String> rightFuzzyDivisionLevel1){
            this.rightFuzzyDivisionLevel1 = rightFuzzyDivisionLevel1;
            return this;
        }

        public ConditionBuilder rightFuzzyDivisionLevel1 (String ... rightFuzzyDivisionLevel1){
            this.rightFuzzyDivisionLevel1 = solveNullList(rightFuzzyDivisionLevel1);
            return this;
        }

        public ConditionBuilder divisionLevel1List(String ... divisionLevel1){
            this.divisionLevel1List = solveNullList(divisionLevel1);
            return this;
        }

        public ConditionBuilder divisionLevel1List(List<String> divisionLevel1){
            this.divisionLevel1List = divisionLevel1;
            return this;
        }

        public ConditionBuilder fuzzyDivisionLevel2 (List<String> fuzzyDivisionLevel2){
            this.fuzzyDivisionLevel2 = fuzzyDivisionLevel2;
            return this;
        }

        public ConditionBuilder fuzzyDivisionLevel2 (String ... fuzzyDivisionLevel2){
            this.fuzzyDivisionLevel2 = solveNullList(fuzzyDivisionLevel2);
            return this;
        }

        public ConditionBuilder rightFuzzyDivisionLevel2 (List<String> rightFuzzyDivisionLevel2){
            this.rightFuzzyDivisionLevel2 = rightFuzzyDivisionLevel2;
            return this;
        }

        public ConditionBuilder rightFuzzyDivisionLevel2 (String ... rightFuzzyDivisionLevel2){
            this.rightFuzzyDivisionLevel2 = solveNullList(rightFuzzyDivisionLevel2);
            return this;
        }

        public ConditionBuilder divisionLevel2List(String ... divisionLevel2){
            this.divisionLevel2List = solveNullList(divisionLevel2);
            return this;
        }

        public ConditionBuilder divisionLevel2List(List<String> divisionLevel2){
            this.divisionLevel2List = divisionLevel2;
            return this;
        }

        public ConditionBuilder fuzzyDivisionLevel3 (List<String> fuzzyDivisionLevel3){
            this.fuzzyDivisionLevel3 = fuzzyDivisionLevel3;
            return this;
        }

        public ConditionBuilder fuzzyDivisionLevel3 (String ... fuzzyDivisionLevel3){
            this.fuzzyDivisionLevel3 = solveNullList(fuzzyDivisionLevel3);
            return this;
        }

        public ConditionBuilder rightFuzzyDivisionLevel3 (List<String> rightFuzzyDivisionLevel3){
            this.rightFuzzyDivisionLevel3 = rightFuzzyDivisionLevel3;
            return this;
        }

        public ConditionBuilder rightFuzzyDivisionLevel3 (String ... rightFuzzyDivisionLevel3){
            this.rightFuzzyDivisionLevel3 = solveNullList(rightFuzzyDivisionLevel3);
            return this;
        }

        public ConditionBuilder divisionLevel3List(String ... divisionLevel3){
            this.divisionLevel3List = solveNullList(divisionLevel3);
            return this;
        }

        public ConditionBuilder divisionLevel3List(List<String> divisionLevel3){
            this.divisionLevel3List = divisionLevel3;
            return this;
        }

        public ConditionBuilder fuzzyPartsAndSymptom (List<String> fuzzyPartsAndSymptom){
            this.fuzzyPartsAndSymptom = fuzzyPartsAndSymptom;
            return this;
        }

        public ConditionBuilder fuzzyPartsAndSymptom (String ... fuzzyPartsAndSymptom){
            this.fuzzyPartsAndSymptom = solveNullList(fuzzyPartsAndSymptom);
            return this;
        }

        public ConditionBuilder rightFuzzyPartsAndSymptom (List<String> rightFuzzyPartsAndSymptom){
            this.rightFuzzyPartsAndSymptom = rightFuzzyPartsAndSymptom;
            return this;
        }

        public ConditionBuilder rightFuzzyPartsAndSymptom (String ... rightFuzzyPartsAndSymptom){
            this.rightFuzzyPartsAndSymptom = solveNullList(rightFuzzyPartsAndSymptom);
            return this;
        }

        public ConditionBuilder partsAndSymptomList(String ... partsAndSymptom){
            this.partsAndSymptomList = solveNullList(partsAndSymptom);
            return this;
        }

        public ConditionBuilder partsAndSymptomList(List<String> partsAndSymptom){
            this.partsAndSymptomList = partsAndSymptom;
            return this;
        }

        public ConditionBuilder fuzzyOfflineDate (List<String> fuzzyOfflineDate){
            this.fuzzyOfflineDate = fuzzyOfflineDate;
            return this;
        }

        public ConditionBuilder fuzzyOfflineDate (String ... fuzzyOfflineDate){
            this.fuzzyOfflineDate = solveNullList(fuzzyOfflineDate);
            return this;
        }

        public ConditionBuilder rightFuzzyOfflineDate (List<String> rightFuzzyOfflineDate){
            this.rightFuzzyOfflineDate = rightFuzzyOfflineDate;
            return this;
        }

        public ConditionBuilder rightFuzzyOfflineDate (String ... rightFuzzyOfflineDate){
            this.rightFuzzyOfflineDate = solveNullList(rightFuzzyOfflineDate);
            return this;
        }

        public ConditionBuilder offlineDateList(String ... offlineDate){
            this.offlineDateList = solveNullList(offlineDate);
            return this;
        }

        public ConditionBuilder offlineDateList(List<String> offlineDate){
            this.offlineDateList = offlineDate;
            return this;
        }

        public ConditionBuilder fuzzySalesDate (List<String> fuzzySalesDate){
            this.fuzzySalesDate = fuzzySalesDate;
            return this;
        }

        public ConditionBuilder fuzzySalesDate (String ... fuzzySalesDate){
            this.fuzzySalesDate = solveNullList(fuzzySalesDate);
            return this;
        }

        public ConditionBuilder rightFuzzySalesDate (List<String> rightFuzzySalesDate){
            this.rightFuzzySalesDate = rightFuzzySalesDate;
            return this;
        }

        public ConditionBuilder rightFuzzySalesDate (String ... rightFuzzySalesDate){
            this.rightFuzzySalesDate = solveNullList(rightFuzzySalesDate);
            return this;
        }

        public ConditionBuilder salesDateList(String ... salesDate){
            this.salesDateList = solveNullList(salesDate);
            return this;
        }

        public ConditionBuilder salesDateList(List<String> salesDate){
            this.salesDateList = salesDate;
            return this;
        }

        public ConditionBuilder fuzzyFailureDate (List<String> fuzzyFailureDate){
            this.fuzzyFailureDate = fuzzyFailureDate;
            return this;
        }

        public ConditionBuilder fuzzyFailureDate (String ... fuzzyFailureDate){
            this.fuzzyFailureDate = solveNullList(fuzzyFailureDate);
            return this;
        }

        public ConditionBuilder rightFuzzyFailureDate (List<String> rightFuzzyFailureDate){
            this.rightFuzzyFailureDate = rightFuzzyFailureDate;
            return this;
        }

        public ConditionBuilder rightFuzzyFailureDate (String ... rightFuzzyFailureDate){
            this.rightFuzzyFailureDate = solveNullList(rightFuzzyFailureDate);
            return this;
        }

        public ConditionBuilder failureDateList(String ... failureDate){
            this.failureDateList = solveNullList(failureDate);
            return this;
        }

        public ConditionBuilder failureDateList(List<String> failureDate){
            this.failureDateList = failureDate;
            return this;
        }

        public ConditionBuilder mileageBetWeen(Integer mileageSt,Integer mileageEd){
            this.mileageSt = mileageSt;
            this.mileageEd = mileageEd;
            return this;
        }

        public ConditionBuilder mileageGreaterEqThan(Integer mileageSt){
            this.mileageSt = mileageSt;
            return this;
        }
        public ConditionBuilder mileageLessEqThan(Integer mileageEd){
            this.mileageEd = mileageEd;
            return this;
        }


        public ConditionBuilder mileageList(Integer ... mileage){
            this.mileageList = solveNullList(mileage);
            return this;
        }

        public ConditionBuilder mileageList(List<Integer> mileage){
            this.mileageList = mileage;
            return this;
        }

        public ConditionBuilder fuzzyConfirmDate (List<String> fuzzyConfirmDate){
            this.fuzzyConfirmDate = fuzzyConfirmDate;
            return this;
        }

        public ConditionBuilder fuzzyConfirmDate (String ... fuzzyConfirmDate){
            this.fuzzyConfirmDate = solveNullList(fuzzyConfirmDate);
            return this;
        }

        public ConditionBuilder rightFuzzyConfirmDate (List<String> rightFuzzyConfirmDate){
            this.rightFuzzyConfirmDate = rightFuzzyConfirmDate;
            return this;
        }

        public ConditionBuilder rightFuzzyConfirmDate (String ... rightFuzzyConfirmDate){
            this.rightFuzzyConfirmDate = solveNullList(rightFuzzyConfirmDate);
            return this;
        }

        public ConditionBuilder confirmDateList(String ... confirmDate){
            this.confirmDateList = solveNullList(confirmDate);
            return this;
        }

        public ConditionBuilder confirmDateList(List<String> confirmDate){
            this.confirmDateList = confirmDate;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingDate (List<String> fuzzyWarehousingDate){
            this.fuzzyWarehousingDate = fuzzyWarehousingDate;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingDate (String ... fuzzyWarehousingDate){
            this.fuzzyWarehousingDate = solveNullList(fuzzyWarehousingDate);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingDate (List<String> rightFuzzyWarehousingDate){
            this.rightFuzzyWarehousingDate = rightFuzzyWarehousingDate;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingDate (String ... rightFuzzyWarehousingDate){
            this.rightFuzzyWarehousingDate = solveNullList(rightFuzzyWarehousingDate);
            return this;
        }

        public ConditionBuilder warehousingDateList(String ... warehousingDate){
            this.warehousingDateList = solveNullList(warehousingDate);
            return this;
        }

        public ConditionBuilder warehousingDateList(List<String> warehousingDate){
            this.warehousingDateList = warehousingDate;
            return this;
        }

        public ConditionBuilder fuzzyTransportDate (List<String> fuzzyTransportDate){
            this.fuzzyTransportDate = fuzzyTransportDate;
            return this;
        }

        public ConditionBuilder fuzzyTransportDate (String ... fuzzyTransportDate){
            this.fuzzyTransportDate = solveNullList(fuzzyTransportDate);
            return this;
        }

        public ConditionBuilder rightFuzzyTransportDate (List<String> rightFuzzyTransportDate){
            this.rightFuzzyTransportDate = rightFuzzyTransportDate;
            return this;
        }

        public ConditionBuilder rightFuzzyTransportDate (String ... rightFuzzyTransportDate){
            this.rightFuzzyTransportDate = solveNullList(rightFuzzyTransportDate);
            return this;
        }

        public ConditionBuilder transportDateList(String ... transportDate){
            this.transportDateList = solveNullList(transportDate);
            return this;
        }

        public ConditionBuilder transportDateList(List<String> transportDate){
            this.transportDateList = transportDate;
            return this;
        }

        public ConditionBuilder fuzzyShopArrivalDate (List<String> fuzzyShopArrivalDate){
            this.fuzzyShopArrivalDate = fuzzyShopArrivalDate;
            return this;
        }

        public ConditionBuilder fuzzyShopArrivalDate (String ... fuzzyShopArrivalDate){
            this.fuzzyShopArrivalDate = solveNullList(fuzzyShopArrivalDate);
            return this;
        }

        public ConditionBuilder rightFuzzyShopArrivalDate (List<String> rightFuzzyShopArrivalDate){
            this.rightFuzzyShopArrivalDate = rightFuzzyShopArrivalDate;
            return this;
        }

        public ConditionBuilder rightFuzzyShopArrivalDate (String ... rightFuzzyShopArrivalDate){
            this.rightFuzzyShopArrivalDate = solveNullList(rightFuzzyShopArrivalDate);
            return this;
        }

        public ConditionBuilder shopArrivalDateList(String ... shopArrivalDate){
            this.shopArrivalDateList = solveNullList(shopArrivalDate);
            return this;
        }

        public ConditionBuilder shopArrivalDateList(List<String> shopArrivalDate){
            this.shopArrivalDateList = shopArrivalDate;
            return this;
        }

        public ConditionBuilder salesFailureTimeBetWeen(Integer salesFailureTimeSt,Integer salesFailureTimeEd){
            this.salesFailureTimeSt = salesFailureTimeSt;
            this.salesFailureTimeEd = salesFailureTimeEd;
            return this;
        }

        public ConditionBuilder salesFailureTimeGreaterEqThan(Integer salesFailureTimeSt){
            this.salesFailureTimeSt = salesFailureTimeSt;
            return this;
        }
        public ConditionBuilder salesFailureTimeLessEqThan(Integer salesFailureTimeEd){
            this.salesFailureTimeEd = salesFailureTimeEd;
            return this;
        }


        public ConditionBuilder salesFailureTimeList(Integer ... salesFailureTime){
            this.salesFailureTimeList = solveNullList(salesFailureTime);
            return this;
        }

        public ConditionBuilder salesFailureTimeList(List<Integer> salesFailureTime){
            this.salesFailureTimeList = salesFailureTime;
            return this;
        }

        public ConditionBuilder fuzzyFailureDesc (List<String> fuzzyFailureDesc){
            this.fuzzyFailureDesc = fuzzyFailureDesc;
            return this;
        }

        public ConditionBuilder fuzzyFailureDesc (String ... fuzzyFailureDesc){
            this.fuzzyFailureDesc = solveNullList(fuzzyFailureDesc);
            return this;
        }

        public ConditionBuilder rightFuzzyFailureDesc (List<String> rightFuzzyFailureDesc){
            this.rightFuzzyFailureDesc = rightFuzzyFailureDesc;
            return this;
        }

        public ConditionBuilder rightFuzzyFailureDesc (String ... rightFuzzyFailureDesc){
            this.rightFuzzyFailureDesc = solveNullList(rightFuzzyFailureDesc);
            return this;
        }

        public ConditionBuilder failureDescList(String ... failureDesc){
            this.failureDescList = solveNullList(failureDesc);
            return this;
        }

        public ConditionBuilder failureDescList(List<String> failureDesc){
            this.failureDescList = failureDesc;
            return this;
        }

        public ConditionBuilder fuzzyDiagnosticResult (List<String> fuzzyDiagnosticResult){
            this.fuzzyDiagnosticResult = fuzzyDiagnosticResult;
            return this;
        }

        public ConditionBuilder fuzzyDiagnosticResult (String ... fuzzyDiagnosticResult){
            this.fuzzyDiagnosticResult = solveNullList(fuzzyDiagnosticResult);
            return this;
        }

        public ConditionBuilder rightFuzzyDiagnosticResult (List<String> rightFuzzyDiagnosticResult){
            this.rightFuzzyDiagnosticResult = rightFuzzyDiagnosticResult;
            return this;
        }

        public ConditionBuilder rightFuzzyDiagnosticResult (String ... rightFuzzyDiagnosticResult){
            this.rightFuzzyDiagnosticResult = solveNullList(rightFuzzyDiagnosticResult);
            return this;
        }

        public ConditionBuilder diagnosticResultList(String ... diagnosticResult){
            this.diagnosticResultList = solveNullList(diagnosticResult);
            return this;
        }

        public ConditionBuilder diagnosticResultList(List<String> diagnosticResult){
            this.diagnosticResultList = diagnosticResult;
            return this;
        }

        public ConditionBuilder manCostBetWeen(java.math.BigDecimal manCostSt,java.math.BigDecimal manCostEd){
            this.manCostSt = manCostSt;
            this.manCostEd = manCostEd;
            return this;
        }

        public ConditionBuilder manCostGreaterEqThan(java.math.BigDecimal manCostSt){
            this.manCostSt = manCostSt;
            return this;
        }
        public ConditionBuilder manCostLessEqThan(java.math.BigDecimal manCostEd){
            this.manCostEd = manCostEd;
            return this;
        }


        public ConditionBuilder manCostList(java.math.BigDecimal ... manCost){
            this.manCostList = solveNullList(manCost);
            return this;
        }

        public ConditionBuilder manCostList(List<java.math.BigDecimal> manCost){
            this.manCostList = manCost;
            return this;
        }

        public ConditionBuilder materialCostBetWeen(java.math.BigDecimal materialCostSt,java.math.BigDecimal materialCostEd){
            this.materialCostSt = materialCostSt;
            this.materialCostEd = materialCostEd;
            return this;
        }

        public ConditionBuilder materialCostGreaterEqThan(java.math.BigDecimal materialCostSt){
            this.materialCostSt = materialCostSt;
            return this;
        }
        public ConditionBuilder materialCostLessEqThan(java.math.BigDecimal materialCostEd){
            this.materialCostEd = materialCostEd;
            return this;
        }


        public ConditionBuilder materialCostList(java.math.BigDecimal ... materialCost){
            this.materialCostList = solveNullList(materialCost);
            return this;
        }

        public ConditionBuilder materialCostList(List<java.math.BigDecimal> materialCost){
            this.materialCostList = materialCost;
            return this;
        }

        public ConditionBuilder materialManagementCostBetWeen(java.math.BigDecimal materialManagementCostSt,java.math.BigDecimal materialManagementCostEd){
            this.materialManagementCostSt = materialManagementCostSt;
            this.materialManagementCostEd = materialManagementCostEd;
            return this;
        }

        public ConditionBuilder materialManagementCostGreaterEqThan(java.math.BigDecimal materialManagementCostSt){
            this.materialManagementCostSt = materialManagementCostSt;
            return this;
        }
        public ConditionBuilder materialManagementCostLessEqThan(java.math.BigDecimal materialManagementCostEd){
            this.materialManagementCostEd = materialManagementCostEd;
            return this;
        }


        public ConditionBuilder materialManagementCostList(java.math.BigDecimal ... materialManagementCost){
            this.materialManagementCostList = solveNullList(materialManagementCost);
            return this;
        }

        public ConditionBuilder materialManagementCostList(List<java.math.BigDecimal> materialManagementCost){
            this.materialManagementCostList = materialManagementCost;
            return this;
        }

        public ConditionBuilder goOutCostBetWeen(java.math.BigDecimal goOutCostSt,java.math.BigDecimal goOutCostEd){
            this.goOutCostSt = goOutCostSt;
            this.goOutCostEd = goOutCostEd;
            return this;
        }

        public ConditionBuilder goOutCostGreaterEqThan(java.math.BigDecimal goOutCostSt){
            this.goOutCostSt = goOutCostSt;
            return this;
        }
        public ConditionBuilder goOutCostLessEqThan(java.math.BigDecimal goOutCostEd){
            this.goOutCostEd = goOutCostEd;
            return this;
        }


        public ConditionBuilder goOutCostList(java.math.BigDecimal ... goOutCost){
            this.goOutCostList = solveNullList(goOutCost);
            return this;
        }

        public ConditionBuilder goOutCostList(List<java.math.BigDecimal> goOutCost){
            this.goOutCostList = goOutCost;
            return this;
        }

        public ConditionBuilder maintainingCostBetWeen(java.math.BigDecimal maintainingCostSt,java.math.BigDecimal maintainingCostEd){
            this.maintainingCostSt = maintainingCostSt;
            this.maintainingCostEd = maintainingCostEd;
            return this;
        }

        public ConditionBuilder maintainingCostGreaterEqThan(java.math.BigDecimal maintainingCostSt){
            this.maintainingCostSt = maintainingCostSt;
            return this;
        }
        public ConditionBuilder maintainingCostLessEqThan(java.math.BigDecimal maintainingCostEd){
            this.maintainingCostEd = maintainingCostEd;
            return this;
        }


        public ConditionBuilder maintainingCostList(java.math.BigDecimal ... maintainingCost){
            this.maintainingCostList = solveNullList(maintainingCost);
            return this;
        }

        public ConditionBuilder maintainingCostList(List<java.math.BigDecimal> maintainingCost){
            this.maintainingCostList = maintainingCost;
            return this;
        }

        public ConditionBuilder otherCostBetWeen(java.math.BigDecimal otherCostSt,java.math.BigDecimal otherCostEd){
            this.otherCostSt = otherCostSt;
            this.otherCostEd = otherCostEd;
            return this;
        }

        public ConditionBuilder otherCostGreaterEqThan(java.math.BigDecimal otherCostSt){
            this.otherCostSt = otherCostSt;
            return this;
        }
        public ConditionBuilder otherCostLessEqThan(java.math.BigDecimal otherCostEd){
            this.otherCostEd = otherCostEd;
            return this;
        }


        public ConditionBuilder otherCostList(java.math.BigDecimal ... otherCost){
            this.otherCostList = solveNullList(otherCost);
            return this;
        }

        public ConditionBuilder otherCostList(List<java.math.BigDecimal> otherCost){
            this.otherCostList = otherCost;
            return this;
        }

        public ConditionBuilder totalCostBetWeen(java.math.BigDecimal totalCostSt,java.math.BigDecimal totalCostEd){
            this.totalCostSt = totalCostSt;
            this.totalCostEd = totalCostEd;
            return this;
        }

        public ConditionBuilder totalCostGreaterEqThan(java.math.BigDecimal totalCostSt){
            this.totalCostSt = totalCostSt;
            return this;
        }
        public ConditionBuilder totalCostLessEqThan(java.math.BigDecimal totalCostEd){
            this.totalCostEd = totalCostEd;
            return this;
        }


        public ConditionBuilder totalCostList(java.math.BigDecimal ... totalCost){
            this.totalCostList = solveNullList(totalCost);
            return this;
        }

        public ConditionBuilder totalCostList(List<java.math.BigDecimal> totalCost){
            this.totalCostList = totalCost;
            return this;
        }

        public ConditionBuilder fuzzyImportantLevel (List<String> fuzzyImportantLevel){
            this.fuzzyImportantLevel = fuzzyImportantLevel;
            return this;
        }

        public ConditionBuilder fuzzyImportantLevel (String ... fuzzyImportantLevel){
            this.fuzzyImportantLevel = solveNullList(fuzzyImportantLevel);
            return this;
        }

        public ConditionBuilder rightFuzzyImportantLevel (List<String> rightFuzzyImportantLevel){
            this.rightFuzzyImportantLevel = rightFuzzyImportantLevel;
            return this;
        }

        public ConditionBuilder rightFuzzyImportantLevel (String ... rightFuzzyImportantLevel){
            this.rightFuzzyImportantLevel = solveNullList(rightFuzzyImportantLevel);
            return this;
        }

        public ConditionBuilder importantLevelList(String ... importantLevel){
            this.importantLevelList = solveNullList(importantLevel);
            return this;
        }

        public ConditionBuilder importantLevelList(List<String> importantLevel){
            this.importantLevelList = importantLevel;
            return this;
        }

        public ConditionBuilder fuzzyTransmissionType (List<String> fuzzyTransmissionType){
            this.fuzzyTransmissionType = fuzzyTransmissionType;
            return this;
        }

        public ConditionBuilder fuzzyTransmissionType (String ... fuzzyTransmissionType){
            this.fuzzyTransmissionType = solveNullList(fuzzyTransmissionType);
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionType (List<String> rightFuzzyTransmissionType){
            this.rightFuzzyTransmissionType = rightFuzzyTransmissionType;
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionType (String ... rightFuzzyTransmissionType){
            this.rightFuzzyTransmissionType = solveNullList(rightFuzzyTransmissionType);
            return this;
        }

        public ConditionBuilder transmissionTypeList(String ... transmissionType){
            this.transmissionTypeList = solveNullList(transmissionType);
            return this;
        }

        public ConditionBuilder transmissionTypeList(List<String> transmissionType){
            this.transmissionTypeList = transmissionType;
            return this;
        }

        public ConditionBuilder fuzzyNewPartsBond (List<String> fuzzyNewPartsBond){
            this.fuzzyNewPartsBond = fuzzyNewPartsBond;
            return this;
        }

        public ConditionBuilder fuzzyNewPartsBond (String ... fuzzyNewPartsBond){
            this.fuzzyNewPartsBond = solveNullList(fuzzyNewPartsBond);
            return this;
        }

        public ConditionBuilder rightFuzzyNewPartsBond (List<String> rightFuzzyNewPartsBond){
            this.rightFuzzyNewPartsBond = rightFuzzyNewPartsBond;
            return this;
        }

        public ConditionBuilder rightFuzzyNewPartsBond (String ... rightFuzzyNewPartsBond){
            this.rightFuzzyNewPartsBond = solveNullList(rightFuzzyNewPartsBond);
            return this;
        }

        public ConditionBuilder newPartsBondList(String ... newPartsBond){
            this.newPartsBondList = solveNullList(newPartsBond);
            return this;
        }

        public ConditionBuilder newPartsBondList(List<String> newPartsBond){
            this.newPartsBondList = newPartsBond;
            return this;
        }

        public ConditionBuilder fuzzySubmitDate (List<String> fuzzySubmitDate){
            this.fuzzySubmitDate = fuzzySubmitDate;
            return this;
        }

        public ConditionBuilder fuzzySubmitDate (String ... fuzzySubmitDate){
            this.fuzzySubmitDate = solveNullList(fuzzySubmitDate);
            return this;
        }

        public ConditionBuilder rightFuzzySubmitDate (List<String> rightFuzzySubmitDate){
            this.rightFuzzySubmitDate = rightFuzzySubmitDate;
            return this;
        }

        public ConditionBuilder rightFuzzySubmitDate (String ... rightFuzzySubmitDate){
            this.rightFuzzySubmitDate = solveNullList(rightFuzzySubmitDate);
            return this;
        }

        public ConditionBuilder submitDateList(String ... submitDate){
            this.submitDateList = solveNullList(submitDate);
            return this;
        }

        public ConditionBuilder submitDateList(List<String> submitDate){
            this.submitDateList = submitDate;
            return this;
        }

        public ConditionBuilder fuzzyEgtypeCode (List<String> fuzzyEgtypeCode){
            this.fuzzyEgtypeCode = fuzzyEgtypeCode;
            return this;
        }

        public ConditionBuilder fuzzyEgtypeCode (String ... fuzzyEgtypeCode){
            this.fuzzyEgtypeCode = solveNullList(fuzzyEgtypeCode);
            return this;
        }

        public ConditionBuilder rightFuzzyEgtypeCode (List<String> rightFuzzyEgtypeCode){
            this.rightFuzzyEgtypeCode = rightFuzzyEgtypeCode;
            return this;
        }

        public ConditionBuilder rightFuzzyEgtypeCode (String ... rightFuzzyEgtypeCode){
            this.rightFuzzyEgtypeCode = solveNullList(rightFuzzyEgtypeCode);
            return this;
        }

        public ConditionBuilder egtypeCodeList(String ... egtypeCode){
            this.egtypeCodeList = solveNullList(egtypeCode);
            return this;
        }

        public ConditionBuilder egtypeCodeList(List<String> egtypeCode){
            this.egtypeCodeList = egtypeCode;
            return this;
        }

        public ConditionBuilder fuzzyEngProductionDate (List<String> fuzzyEngProductionDate){
            this.fuzzyEngProductionDate = fuzzyEngProductionDate;
            return this;
        }

        public ConditionBuilder fuzzyEngProductionDate (String ... fuzzyEngProductionDate){
            this.fuzzyEngProductionDate = solveNullList(fuzzyEngProductionDate);
            return this;
        }

        public ConditionBuilder rightFuzzyEngProductionDate (List<String> rightFuzzyEngProductionDate){
            this.rightFuzzyEngProductionDate = rightFuzzyEngProductionDate;
            return this;
        }

        public ConditionBuilder rightFuzzyEngProductionDate (String ... rightFuzzyEngProductionDate){
            this.rightFuzzyEngProductionDate = solveNullList(rightFuzzyEngProductionDate);
            return this;
        }

        public ConditionBuilder engProductionDateList(String ... engProductionDate){
            this.engProductionDateList = solveNullList(engProductionDate);
            return this;
        }

        public ConditionBuilder engProductionDateList(List<String> engProductionDate){
            this.engProductionDateList = engProductionDate;
            return this;
        }

        public ConditionBuilder fuzzyTransmissionCode (List<String> fuzzyTransmissionCode){
            this.fuzzyTransmissionCode = fuzzyTransmissionCode;
            return this;
        }

        public ConditionBuilder fuzzyTransmissionCode (String ... fuzzyTransmissionCode){
            this.fuzzyTransmissionCode = solveNullList(fuzzyTransmissionCode);
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionCode (List<String> rightFuzzyTransmissionCode){
            this.rightFuzzyTransmissionCode = rightFuzzyTransmissionCode;
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionCode (String ... rightFuzzyTransmissionCode){
            this.rightFuzzyTransmissionCode = solveNullList(rightFuzzyTransmissionCode);
            return this;
        }

        public ConditionBuilder transmissionCodeList(String ... transmissionCode){
            this.transmissionCodeList = solveNullList(transmissionCode);
            return this;
        }

        public ConditionBuilder transmissionCodeList(List<String> transmissionCode){
            this.transmissionCodeList = transmissionCode;
            return this;
        }

        public ConditionBuilder fuzzyTransmissionProductionDate (List<String> fuzzyTransmissionProductionDate){
            this.fuzzyTransmissionProductionDate = fuzzyTransmissionProductionDate;
            return this;
        }

        public ConditionBuilder fuzzyTransmissionProductionDate (String ... fuzzyTransmissionProductionDate){
            this.fuzzyTransmissionProductionDate = solveNullList(fuzzyTransmissionProductionDate);
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionProductionDate (List<String> rightFuzzyTransmissionProductionDate){
            this.rightFuzzyTransmissionProductionDate = rightFuzzyTransmissionProductionDate;
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionProductionDate (String ... rightFuzzyTransmissionProductionDate){
            this.rightFuzzyTransmissionProductionDate = solveNullList(rightFuzzyTransmissionProductionDate);
            return this;
        }

        public ConditionBuilder transmissionProductionDateList(String ... transmissionProductionDate){
            this.transmissionProductionDateList = solveNullList(transmissionProductionDate);
            return this;
        }

        public ConditionBuilder transmissionProductionDateList(List<String> transmissionProductionDate){
            this.transmissionProductionDateList = transmissionProductionDate;
            return this;
        }

        public ConditionBuilder fuzzyEngArrange (List<String> fuzzyEngArrange){
            this.fuzzyEngArrange = fuzzyEngArrange;
            return this;
        }

        public ConditionBuilder fuzzyEngArrange (String ... fuzzyEngArrange){
            this.fuzzyEngArrange = solveNullList(fuzzyEngArrange);
            return this;
        }

        public ConditionBuilder rightFuzzyEngArrange (List<String> rightFuzzyEngArrange){
            this.rightFuzzyEngArrange = rightFuzzyEngArrange;
            return this;
        }

        public ConditionBuilder rightFuzzyEngArrange (String ... rightFuzzyEngArrange){
            this.rightFuzzyEngArrange = solveNullList(rightFuzzyEngArrange);
            return this;
        }

        public ConditionBuilder engArrangeList(String ... engArrange){
            this.engArrangeList = solveNullList(engArrange);
            return this;
        }

        public ConditionBuilder engArrangeList(List<String> engArrange){
            this.engArrangeList = engArrange;
            return this;
        }

        public ConditionBuilder fuzzyCarModel (List<String> fuzzyCarModel){
            this.fuzzyCarModel = fuzzyCarModel;
            return this;
        }

        public ConditionBuilder fuzzyCarModel (String ... fuzzyCarModel){
            this.fuzzyCarModel = solveNullList(fuzzyCarModel);
            return this;
        }

        public ConditionBuilder rightFuzzyCarModel (List<String> rightFuzzyCarModel){
            this.rightFuzzyCarModel = rightFuzzyCarModel;
            return this;
        }

        public ConditionBuilder rightFuzzyCarModel (String ... rightFuzzyCarModel){
            this.rightFuzzyCarModel = solveNullList(rightFuzzyCarModel);
            return this;
        }

        public ConditionBuilder carModelList(String ... carModel){
            this.carModelList = solveNullList(carModel);
            return this;
        }

        public ConditionBuilder carModelList(List<String> carModel){
            this.carModelList = carModel;
            return this;
        }

        public ConditionBuilder fuzzyEngType (List<String> fuzzyEngType){
            this.fuzzyEngType = fuzzyEngType;
            return this;
        }

        public ConditionBuilder fuzzyEngType (String ... fuzzyEngType){
            this.fuzzyEngType = solveNullList(fuzzyEngType);
            return this;
        }

        public ConditionBuilder rightFuzzyEngType (List<String> rightFuzzyEngType){
            this.rightFuzzyEngType = rightFuzzyEngType;
            return this;
        }

        public ConditionBuilder rightFuzzyEngType (String ... rightFuzzyEngType){
            this.rightFuzzyEngType = solveNullList(rightFuzzyEngType);
            return this;
        }

        public ConditionBuilder engTypeList(String ... engType){
            this.engTypeList = solveNullList(engType);
            return this;
        }

        public ConditionBuilder engTypeList(List<String> engType){
            this.engTypeList = engType;
            return this;
        }

        public ConditionBuilder fuzzyReceiveTime (List<String> fuzzyReceiveTime){
            this.fuzzyReceiveTime = fuzzyReceiveTime;
            return this;
        }

        public ConditionBuilder fuzzyReceiveTime (String ... fuzzyReceiveTime){
            this.fuzzyReceiveTime = solveNullList(fuzzyReceiveTime);
            return this;
        }

        public ConditionBuilder rightFuzzyReceiveTime (List<String> rightFuzzyReceiveTime){
            this.rightFuzzyReceiveTime = rightFuzzyReceiveTime;
            return this;
        }

        public ConditionBuilder rightFuzzyReceiveTime (String ... rightFuzzyReceiveTime){
            this.rightFuzzyReceiveTime = solveNullList(rightFuzzyReceiveTime);
            return this;
        }

        public ConditionBuilder receiveTimeList(String ... receiveTime){
            this.receiveTimeList = solveNullList(receiveTime);
            return this;
        }

        public ConditionBuilder receiveTimeList(List<String> receiveTime){
            this.receiveTimeList = receiveTime;
            return this;
        }

        public ConditionBuilder fuzzyClaimCompensation (List<String> fuzzyClaimCompensation){
            this.fuzzyClaimCompensation = fuzzyClaimCompensation;
            return this;
        }

        public ConditionBuilder fuzzyClaimCompensation (String ... fuzzyClaimCompensation){
            this.fuzzyClaimCompensation = solveNullList(fuzzyClaimCompensation);
            return this;
        }

        public ConditionBuilder rightFuzzyClaimCompensation (List<String> rightFuzzyClaimCompensation){
            this.rightFuzzyClaimCompensation = rightFuzzyClaimCompensation;
            return this;
        }

        public ConditionBuilder rightFuzzyClaimCompensation (String ... rightFuzzyClaimCompensation){
            this.rightFuzzyClaimCompensation = solveNullList(rightFuzzyClaimCompensation);
            return this;
        }

        public ConditionBuilder claimCompensationList(String ... claimCompensation){
            this.claimCompensationList = solveNullList(claimCompensation);
            return this;
        }

        public ConditionBuilder claimCompensationList(List<String> claimCompensation){
            this.claimCompensationList = claimCompensation;
            return this;
        }

        public ConditionBuilder fuzzyProductionRawDescription (List<String> fuzzyProductionRawDescription){
            this.fuzzyProductionRawDescription = fuzzyProductionRawDescription;
            return this;
        }

        public ConditionBuilder fuzzyProductionRawDescription (String ... fuzzyProductionRawDescription){
            this.fuzzyProductionRawDescription = solveNullList(fuzzyProductionRawDescription);
            return this;
        }

        public ConditionBuilder rightFuzzyProductionRawDescription (List<String> rightFuzzyProductionRawDescription){
            this.rightFuzzyProductionRawDescription = rightFuzzyProductionRawDescription;
            return this;
        }

        public ConditionBuilder rightFuzzyProductionRawDescription (String ... rightFuzzyProductionRawDescription){
            this.rightFuzzyProductionRawDescription = solveNullList(rightFuzzyProductionRawDescription);
            return this;
        }

        public ConditionBuilder productionRawDescriptionList(String ... productionRawDescription){
            this.productionRawDescriptionList = solveNullList(productionRawDescription);
            return this;
        }

        public ConditionBuilder productionRawDescriptionList(List<String> productionRawDescription){
            this.productionRawDescriptionList = productionRawDescription;
            return this;
        }

        public ConditionBuilder fuzzyPDI (List<String> fuzzyPDI){
            this.fuzzyPDI = fuzzyPDI;
            return this;
        }

        public ConditionBuilder fuzzyPDI (String ... fuzzyPDI){
            this.fuzzyPDI = solveNullList(fuzzyPDI);
            return this;
        }

        public ConditionBuilder rightFuzzyPDI (List<String> rightFuzzyPDI){
            this.rightFuzzyPDI = rightFuzzyPDI;
            return this;
        }

        public ConditionBuilder rightFuzzyPDI (String ... rightFuzzyPDI){
            this.rightFuzzyPDI = solveNullList(rightFuzzyPDI);
            return this;
        }

        public ConditionBuilder PDIList(String ... PDI){
            this.PDIList = solveNullList(PDI);
            return this;
        }

        public ConditionBuilder PDIList(List<String> PDI){
            this.PDIList = PDI;
            return this;
        }

        public ConditionBuilder offlineFailureTimeBetWeen(Integer offlineFailureTimeSt,Integer offlineFailureTimeEd){
            this.offlineFailureTimeSt = offlineFailureTimeSt;
            this.offlineFailureTimeEd = offlineFailureTimeEd;
            return this;
        }

        public ConditionBuilder offlineFailureTimeGreaterEqThan(Integer offlineFailureTimeSt){
            this.offlineFailureTimeSt = offlineFailureTimeSt;
            return this;
        }
        public ConditionBuilder offlineFailureTimeLessEqThan(Integer offlineFailureTimeEd){
            this.offlineFailureTimeEd = offlineFailureTimeEd;
            return this;
        }


        public ConditionBuilder offlineFailureTimeList(Integer ... offlineFailureTime){
            this.offlineFailureTimeList = solveNullList(offlineFailureTime);
            return this;
        }

        public ConditionBuilder offlineFailureTimeList(List<Integer> offlineFailureTime){
            this.offlineFailureTimeList = offlineFailureTime;
            return this;
        }

        public ConditionBuilder fuzzyEngOrTran (List<String> fuzzyEngOrTran){
            this.fuzzyEngOrTran = fuzzyEngOrTran;
            return this;
        }

        public ConditionBuilder fuzzyEngOrTran (String ... fuzzyEngOrTran){
            this.fuzzyEngOrTran = solveNullList(fuzzyEngOrTran);
            return this;
        }

        public ConditionBuilder rightFuzzyEngOrTran (List<String> rightFuzzyEngOrTran){
            this.rightFuzzyEngOrTran = rightFuzzyEngOrTran;
            return this;
        }

        public ConditionBuilder rightFuzzyEngOrTran (String ... rightFuzzyEngOrTran){
            this.rightFuzzyEngOrTran = solveNullList(rightFuzzyEngOrTran);
            return this;
        }

        public ConditionBuilder engOrTranList(String ... engOrTran){
            this.engOrTranList = solveNullList(engOrTran);
            return this;
        }

        public ConditionBuilder engOrTranList(List<String> engOrTran){
            this.engOrTranList = engOrTran;
            return this;
        }

        public ConditionBuilder fuzzyCarSeriesCode (List<String> fuzzyCarSeriesCode){
            this.fuzzyCarSeriesCode = fuzzyCarSeriesCode;
            return this;
        }

        public ConditionBuilder fuzzyCarSeriesCode (String ... fuzzyCarSeriesCode){
            this.fuzzyCarSeriesCode = solveNullList(fuzzyCarSeriesCode);
            return this;
        }

        public ConditionBuilder rightFuzzyCarSeriesCode (List<String> rightFuzzyCarSeriesCode){
            this.rightFuzzyCarSeriesCode = rightFuzzyCarSeriesCode;
            return this;
        }

        public ConditionBuilder rightFuzzyCarSeriesCode (String ... rightFuzzyCarSeriesCode){
            this.rightFuzzyCarSeriesCode = solveNullList(rightFuzzyCarSeriesCode);
            return this;
        }

        public ConditionBuilder carSeriesCodeList(String ... carSeriesCode){
            this.carSeriesCodeList = solveNullList(carSeriesCode);
            return this;
        }

        public ConditionBuilder carSeriesCodeList(List<String> carSeriesCode){
            this.carSeriesCodeList = carSeriesCode;
            return this;
        }

        public ConditionBuilder fuzzyShortCode (List<String> fuzzyShortCode){
            this.fuzzyShortCode = fuzzyShortCode;
            return this;
        }

        public ConditionBuilder fuzzyShortCode (String ... fuzzyShortCode){
            this.fuzzyShortCode = solveNullList(fuzzyShortCode);
            return this;
        }

        public ConditionBuilder rightFuzzyShortCode (List<String> rightFuzzyShortCode){
            this.rightFuzzyShortCode = rightFuzzyShortCode;
            return this;
        }

        public ConditionBuilder rightFuzzyShortCode (String ... rightFuzzyShortCode){
            this.rightFuzzyShortCode = solveNullList(rightFuzzyShortCode);
            return this;
        }

        public ConditionBuilder shortCodeList(String ... shortCode){
            this.shortCodeList = solveNullList(shortCode);
            return this;
        }

        public ConditionBuilder shortCodeList(List<String> shortCode){
            this.shortCodeList = shortCode;
            return this;
        }

        public ConditionBuilder fuzzyFaultCodeClassification (List<String> fuzzyFaultCodeClassification){
            this.fuzzyFaultCodeClassification = fuzzyFaultCodeClassification;
            return this;
        }

        public ConditionBuilder fuzzyFaultCodeClassification (String ... fuzzyFaultCodeClassification){
            this.fuzzyFaultCodeClassification = solveNullList(fuzzyFaultCodeClassification);
            return this;
        }

        public ConditionBuilder rightFuzzyFaultCodeClassification (List<String> rightFuzzyFaultCodeClassification){
            this.rightFuzzyFaultCodeClassification = rightFuzzyFaultCodeClassification;
            return this;
        }

        public ConditionBuilder rightFuzzyFaultCodeClassification (String ... rightFuzzyFaultCodeClassification){
            this.rightFuzzyFaultCodeClassification = solveNullList(rightFuzzyFaultCodeClassification);
            return this;
        }

        public ConditionBuilder faultCodeClassificationList(String ... faultCodeClassification){
            this.faultCodeClassificationList = solveNullList(faultCodeClassification);
            return this;
        }

        public ConditionBuilder faultCodeClassificationList(List<String> faultCodeClassification){
            this.faultCodeClassificationList = faultCodeClassification;
            return this;
        }

        public ConditionBuilder fuzzyFailureYear (List<String> fuzzyFailureYear){
            this.fuzzyFailureYear = fuzzyFailureYear;
            return this;
        }

        public ConditionBuilder fuzzyFailureYear (String ... fuzzyFailureYear){
            this.fuzzyFailureYear = solveNullList(fuzzyFailureYear);
            return this;
        }

        public ConditionBuilder rightFuzzyFailureYear (List<String> rightFuzzyFailureYear){
            this.rightFuzzyFailureYear = rightFuzzyFailureYear;
            return this;
        }

        public ConditionBuilder rightFuzzyFailureYear (String ... rightFuzzyFailureYear){
            this.rightFuzzyFailureYear = solveNullList(rightFuzzyFailureYear);
            return this;
        }

        public ConditionBuilder failureYearList(String ... failureYear){
            this.failureYearList = solveNullList(failureYear);
            return this;
        }

        public ConditionBuilder failureYearList(List<String> failureYear){
            this.failureYearList = failureYear;
            return this;
        }

        public ConditionBuilder fuzzyFailureMonth (List<String> fuzzyFailureMonth){
            this.fuzzyFailureMonth = fuzzyFailureMonth;
            return this;
        }

        public ConditionBuilder fuzzyFailureMonth (String ... fuzzyFailureMonth){
            this.fuzzyFailureMonth = solveNullList(fuzzyFailureMonth);
            return this;
        }

        public ConditionBuilder rightFuzzyFailureMonth (List<String> rightFuzzyFailureMonth){
            this.rightFuzzyFailureMonth = rightFuzzyFailureMonth;
            return this;
        }

        public ConditionBuilder rightFuzzyFailureMonth (String ... rightFuzzyFailureMonth){
            this.rightFuzzyFailureMonth = solveNullList(rightFuzzyFailureMonth);
            return this;
        }

        public ConditionBuilder failureMonthList(String ... failureMonth){
            this.failureMonthList = solveNullList(failureMonth);
            return this;
        }

        public ConditionBuilder failureMonthList(List<String> failureMonth){
            this.failureMonthList = failureMonth;
            return this;
        }

        public ConditionBuilder fuzzyTransmissionShortCode (List<String> fuzzyTransmissionShortCode){
            this.fuzzyTransmissionShortCode = fuzzyTransmissionShortCode;
            return this;
        }

        public ConditionBuilder fuzzyTransmissionShortCode (String ... fuzzyTransmissionShortCode){
            this.fuzzyTransmissionShortCode = solveNullList(fuzzyTransmissionShortCode);
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionShortCode (List<String> rightFuzzyTransmissionShortCode){
            this.rightFuzzyTransmissionShortCode = rightFuzzyTransmissionShortCode;
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionShortCode (String ... rightFuzzyTransmissionShortCode){
            this.rightFuzzyTransmissionShortCode = solveNullList(rightFuzzyTransmissionShortCode);
            return this;
        }

        public ConditionBuilder transmissionShortCodeList(String ... transmissionShortCode){
            this.transmissionShortCodeList = solveNullList(transmissionShortCode);
            return this;
        }

        public ConditionBuilder transmissionShortCodeList(List<String> transmissionShortCode){
            this.transmissionShortCodeList = transmissionShortCode;
            return this;
        }

        public ConditionBuilder fuzzyMileageDistribution (List<String> fuzzyMileageDistribution){
            this.fuzzyMileageDistribution = fuzzyMileageDistribution;
            return this;
        }

        public ConditionBuilder fuzzyMileageDistribution (String ... fuzzyMileageDistribution){
            this.fuzzyMileageDistribution = solveNullList(fuzzyMileageDistribution);
            return this;
        }

        public ConditionBuilder rightFuzzyMileageDistribution (List<String> rightFuzzyMileageDistribution){
            this.rightFuzzyMileageDistribution = rightFuzzyMileageDistribution;
            return this;
        }

        public ConditionBuilder rightFuzzyMileageDistribution (String ... rightFuzzyMileageDistribution){
            this.rightFuzzyMileageDistribution = solveNullList(rightFuzzyMileageDistribution);
            return this;
        }

        public ConditionBuilder mileageDistributionList(String ... mileageDistribution){
            this.mileageDistributionList = solveNullList(mileageDistribution);
            return this;
        }

        public ConditionBuilder mileageDistributionList(List<String> mileageDistribution){
            this.mileageDistributionList = mileageDistribution;
            return this;
        }

        public ConditionBuilder fuzzyReturnRequest (List<String> fuzzyReturnRequest){
            this.fuzzyReturnRequest = fuzzyReturnRequest;
            return this;
        }

        public ConditionBuilder fuzzyReturnRequest (String ... fuzzyReturnRequest){
            this.fuzzyReturnRequest = solveNullList(fuzzyReturnRequest);
            return this;
        }

        public ConditionBuilder rightFuzzyReturnRequest (List<String> rightFuzzyReturnRequest){
            this.rightFuzzyReturnRequest = rightFuzzyReturnRequest;
            return this;
        }

        public ConditionBuilder rightFuzzyReturnRequest (String ... rightFuzzyReturnRequest){
            this.rightFuzzyReturnRequest = solveNullList(rightFuzzyReturnRequest);
            return this;
        }

        public ConditionBuilder returnRequestList(String ... returnRequest){
            this.returnRequestList = solveNullList(returnRequest);
            return this;
        }

        public ConditionBuilder returnRequestList(List<String> returnRequest){
            this.returnRequestList = returnRequest;
            return this;
        }

        public ConditionBuilder fuzzyReturnDate (List<String> fuzzyReturnDate){
            this.fuzzyReturnDate = fuzzyReturnDate;
            return this;
        }

        public ConditionBuilder fuzzyReturnDate (String ... fuzzyReturnDate){
            this.fuzzyReturnDate = solveNullList(fuzzyReturnDate);
            return this;
        }

        public ConditionBuilder rightFuzzyReturnDate (List<String> rightFuzzyReturnDate){
            this.rightFuzzyReturnDate = rightFuzzyReturnDate;
            return this;
        }

        public ConditionBuilder rightFuzzyReturnDate (String ... rightFuzzyReturnDate){
            this.rightFuzzyReturnDate = solveNullList(rightFuzzyReturnDate);
            return this;
        }

        public ConditionBuilder returnDateList(String ... returnDate){
            this.returnDateList = solveNullList(returnDate);
            return this;
        }

        public ConditionBuilder returnDateList(List<String> returnDate){
            this.returnDateList = returnDate;
            return this;
        }

        public ConditionBuilder fuzzyArriveDate (List<String> fuzzyArriveDate){
            this.fuzzyArriveDate = fuzzyArriveDate;
            return this;
        }

        public ConditionBuilder fuzzyArriveDate (String ... fuzzyArriveDate){
            this.fuzzyArriveDate = solveNullList(fuzzyArriveDate);
            return this;
        }

        public ConditionBuilder rightFuzzyArriveDate (List<String> rightFuzzyArriveDate){
            this.rightFuzzyArriveDate = rightFuzzyArriveDate;
            return this;
        }

        public ConditionBuilder rightFuzzyArriveDate (String ... rightFuzzyArriveDate){
            this.rightFuzzyArriveDate = solveNullList(rightFuzzyArriveDate);
            return this;
        }

        public ConditionBuilder arriveDateList(String ... arriveDate){
            this.arriveDateList = solveNullList(arriveDate);
            return this;
        }

        public ConditionBuilder arriveDateList(List<String> arriveDate){
            this.arriveDateList = arriveDate;
            return this;
        }

        public ConditionBuilder fuzzyLoadingVerification (List<String> fuzzyLoadingVerification){
            this.fuzzyLoadingVerification = fuzzyLoadingVerification;
            return this;
        }

        public ConditionBuilder fuzzyLoadingVerification (String ... fuzzyLoadingVerification){
            this.fuzzyLoadingVerification = solveNullList(fuzzyLoadingVerification);
            return this;
        }

        public ConditionBuilder rightFuzzyLoadingVerification (List<String> rightFuzzyLoadingVerification){
            this.rightFuzzyLoadingVerification = rightFuzzyLoadingVerification;
            return this;
        }

        public ConditionBuilder rightFuzzyLoadingVerification (String ... rightFuzzyLoadingVerification){
            this.rightFuzzyLoadingVerification = solveNullList(rightFuzzyLoadingVerification);
            return this;
        }

        public ConditionBuilder loadingVerificationList(String ... loadingVerification){
            this.loadingVerificationList = solveNullList(loadingVerification);
            return this;
        }

        public ConditionBuilder loadingVerificationList(List<String> loadingVerification){
            this.loadingVerificationList = loadingVerification;
            return this;
        }

        public ConditionBuilder fuzzyFaultReconstructioner (List<String> fuzzyFaultReconstructioner){
            this.fuzzyFaultReconstructioner = fuzzyFaultReconstructioner;
            return this;
        }

        public ConditionBuilder fuzzyFaultReconstructioner (String ... fuzzyFaultReconstructioner){
            this.fuzzyFaultReconstructioner = solveNullList(fuzzyFaultReconstructioner);
            return this;
        }

        public ConditionBuilder rightFuzzyFaultReconstructioner (List<String> rightFuzzyFaultReconstructioner){
            this.rightFuzzyFaultReconstructioner = rightFuzzyFaultReconstructioner;
            return this;
        }

        public ConditionBuilder rightFuzzyFaultReconstructioner (String ... rightFuzzyFaultReconstructioner){
            this.rightFuzzyFaultReconstructioner = solveNullList(rightFuzzyFaultReconstructioner);
            return this;
        }

        public ConditionBuilder faultReconstructionerList(String ... faultReconstructioner){
            this.faultReconstructionerList = solveNullList(faultReconstructioner);
            return this;
        }

        public ConditionBuilder faultReconstructionerList(List<String> faultReconstructioner){
            this.faultReconstructionerList = faultReconstructioner;
            return this;
        }

        public ConditionBuilder fuzzyLoadingDate (List<String> fuzzyLoadingDate){
            this.fuzzyLoadingDate = fuzzyLoadingDate;
            return this;
        }

        public ConditionBuilder fuzzyLoadingDate (String ... fuzzyLoadingDate){
            this.fuzzyLoadingDate = solveNullList(fuzzyLoadingDate);
            return this;
        }

        public ConditionBuilder rightFuzzyLoadingDate (List<String> rightFuzzyLoadingDate){
            this.rightFuzzyLoadingDate = rightFuzzyLoadingDate;
            return this;
        }

        public ConditionBuilder rightFuzzyLoadingDate (String ... rightFuzzyLoadingDate){
            this.rightFuzzyLoadingDate = solveNullList(rightFuzzyLoadingDate);
            return this;
        }

        public ConditionBuilder loadingDateList(String ... loadingDate){
            this.loadingDateList = solveNullList(loadingDate);
            return this;
        }

        public ConditionBuilder loadingDateList(List<String> loadingDate){
            this.loadingDateList = loadingDate;
            return this;
        }

        public ConditionBuilder fuzzyFaultReconstruction (List<String> fuzzyFaultReconstruction){
            this.fuzzyFaultReconstruction = fuzzyFaultReconstruction;
            return this;
        }

        public ConditionBuilder fuzzyFaultReconstruction (String ... fuzzyFaultReconstruction){
            this.fuzzyFaultReconstruction = solveNullList(fuzzyFaultReconstruction);
            return this;
        }

        public ConditionBuilder rightFuzzyFaultReconstruction (List<String> rightFuzzyFaultReconstruction){
            this.rightFuzzyFaultReconstruction = rightFuzzyFaultReconstruction;
            return this;
        }

        public ConditionBuilder rightFuzzyFaultReconstruction (String ... rightFuzzyFaultReconstruction){
            this.rightFuzzyFaultReconstruction = solveNullList(rightFuzzyFaultReconstruction);
            return this;
        }

        public ConditionBuilder faultReconstructionList(String ... faultReconstruction){
            this.faultReconstructionList = solveNullList(faultReconstruction);
            return this;
        }

        public ConditionBuilder faultReconstructionList(List<String> faultReconstruction){
            this.faultReconstructionList = faultReconstruction;
            return this;
        }

        public ConditionBuilder fuzzyFaultReconstructionDate (List<String> fuzzyFaultReconstructionDate){
            this.fuzzyFaultReconstructionDate = fuzzyFaultReconstructionDate;
            return this;
        }

        public ConditionBuilder fuzzyFaultReconstructionDate (String ... fuzzyFaultReconstructionDate){
            this.fuzzyFaultReconstructionDate = solveNullList(fuzzyFaultReconstructionDate);
            return this;
        }

        public ConditionBuilder rightFuzzyFaultReconstructionDate (List<String> rightFuzzyFaultReconstructionDate){
            this.rightFuzzyFaultReconstructionDate = rightFuzzyFaultReconstructionDate;
            return this;
        }

        public ConditionBuilder rightFuzzyFaultReconstructionDate (String ... rightFuzzyFaultReconstructionDate){
            this.rightFuzzyFaultReconstructionDate = solveNullList(rightFuzzyFaultReconstructionDate);
            return this;
        }

        public ConditionBuilder faultReconstructionDateList(String ... faultReconstructionDate){
            this.faultReconstructionDateList = solveNullList(faultReconstructionDate);
            return this;
        }

        public ConditionBuilder faultReconstructionDateList(List<String> faultReconstructionDate){
            this.faultReconstructionDateList = faultReconstructionDate;
            return this;
        }

        public ConditionBuilder fuzzyTransferDate1 (List<String> fuzzyTransferDate1){
            this.fuzzyTransferDate1 = fuzzyTransferDate1;
            return this;
        }

        public ConditionBuilder fuzzyTransferDate1 (String ... fuzzyTransferDate1){
            this.fuzzyTransferDate1 = solveNullList(fuzzyTransferDate1);
            return this;
        }

        public ConditionBuilder rightFuzzyTransferDate1 (List<String> rightFuzzyTransferDate1){
            this.rightFuzzyTransferDate1 = rightFuzzyTransferDate1;
            return this;
        }

        public ConditionBuilder rightFuzzyTransferDate1 (String ... rightFuzzyTransferDate1){
            this.rightFuzzyTransferDate1 = solveNullList(rightFuzzyTransferDate1);
            return this;
        }

        public ConditionBuilder transferDate1List(String ... transferDate1){
            this.transferDate1List = solveNullList(transferDate1);
            return this;
        }

        public ConditionBuilder transferDate1List(List<String> transferDate1){
            this.transferDate1List = transferDate1;
            return this;
        }

        public ConditionBuilder fuzzyResponsible1 (List<String> fuzzyResponsible1){
            this.fuzzyResponsible1 = fuzzyResponsible1;
            return this;
        }

        public ConditionBuilder fuzzyResponsible1 (String ... fuzzyResponsible1){
            this.fuzzyResponsible1 = solveNullList(fuzzyResponsible1);
            return this;
        }

        public ConditionBuilder rightFuzzyResponsible1 (List<String> rightFuzzyResponsible1){
            this.rightFuzzyResponsible1 = rightFuzzyResponsible1;
            return this;
        }

        public ConditionBuilder rightFuzzyResponsible1 (String ... rightFuzzyResponsible1){
            this.rightFuzzyResponsible1 = solveNullList(rightFuzzyResponsible1);
            return this;
        }

        public ConditionBuilder responsible1List(String ... responsible1){
            this.responsible1List = solveNullList(responsible1);
            return this;
        }

        public ConditionBuilder responsible1List(List<String> responsible1){
            this.responsible1List = responsible1;
            return this;
        }

        public ConditionBuilder fuzzyTransferDate2 (List<String> fuzzyTransferDate2){
            this.fuzzyTransferDate2 = fuzzyTransferDate2;
            return this;
        }

        public ConditionBuilder fuzzyTransferDate2 (String ... fuzzyTransferDate2){
            this.fuzzyTransferDate2 = solveNullList(fuzzyTransferDate2);
            return this;
        }

        public ConditionBuilder rightFuzzyTransferDate2 (List<String> rightFuzzyTransferDate2){
            this.rightFuzzyTransferDate2 = rightFuzzyTransferDate2;
            return this;
        }

        public ConditionBuilder rightFuzzyTransferDate2 (String ... rightFuzzyTransferDate2){
            this.rightFuzzyTransferDate2 = solveNullList(rightFuzzyTransferDate2);
            return this;
        }

        public ConditionBuilder transferDate2List(String ... transferDate2){
            this.transferDate2List = solveNullList(transferDate2);
            return this;
        }

        public ConditionBuilder transferDate2List(List<String> transferDate2){
            this.transferDate2List = transferDate2;
            return this;
        }

        public ConditionBuilder fuzzyResponsible2 (List<String> fuzzyResponsible2){
            this.fuzzyResponsible2 = fuzzyResponsible2;
            return this;
        }

        public ConditionBuilder fuzzyResponsible2 (String ... fuzzyResponsible2){
            this.fuzzyResponsible2 = solveNullList(fuzzyResponsible2);
            return this;
        }

        public ConditionBuilder rightFuzzyResponsible2 (List<String> rightFuzzyResponsible2){
            this.rightFuzzyResponsible2 = rightFuzzyResponsible2;
            return this;
        }

        public ConditionBuilder rightFuzzyResponsible2 (String ... rightFuzzyResponsible2){
            this.rightFuzzyResponsible2 = solveNullList(rightFuzzyResponsible2);
            return this;
        }

        public ConditionBuilder responsible2List(String ... responsible2){
            this.responsible2List = solveNullList(responsible2);
            return this;
        }

        public ConditionBuilder responsible2List(List<String> responsible2){
            this.responsible2List = responsible2;
            return this;
        }

        public ConditionBuilder fuzzyEstimateMeetingDate (List<String> fuzzyEstimateMeetingDate){
            this.fuzzyEstimateMeetingDate = fuzzyEstimateMeetingDate;
            return this;
        }

        public ConditionBuilder fuzzyEstimateMeetingDate (String ... fuzzyEstimateMeetingDate){
            this.fuzzyEstimateMeetingDate = solveNullList(fuzzyEstimateMeetingDate);
            return this;
        }

        public ConditionBuilder rightFuzzyEstimateMeetingDate (List<String> rightFuzzyEstimateMeetingDate){
            this.rightFuzzyEstimateMeetingDate = rightFuzzyEstimateMeetingDate;
            return this;
        }

        public ConditionBuilder rightFuzzyEstimateMeetingDate (String ... rightFuzzyEstimateMeetingDate){
            this.rightFuzzyEstimateMeetingDate = solveNullList(rightFuzzyEstimateMeetingDate);
            return this;
        }

        public ConditionBuilder estimateMeetingDateList(String ... estimateMeetingDate){
            this.estimateMeetingDateList = solveNullList(estimateMeetingDate);
            return this;
        }

        public ConditionBuilder estimateMeetingDateList(List<String> estimateMeetingDate){
            this.estimateMeetingDateList = estimateMeetingDate;
            return this;
        }

        public ConditionBuilder fuzzySubmitReport (List<String> fuzzySubmitReport){
            this.fuzzySubmitReport = fuzzySubmitReport;
            return this;
        }

        public ConditionBuilder fuzzySubmitReport (String ... fuzzySubmitReport){
            this.fuzzySubmitReport = solveNullList(fuzzySubmitReport);
            return this;
        }

        public ConditionBuilder rightFuzzySubmitReport (List<String> rightFuzzySubmitReport){
            this.rightFuzzySubmitReport = rightFuzzySubmitReport;
            return this;
        }

        public ConditionBuilder rightFuzzySubmitReport (String ... rightFuzzySubmitReport){
            this.rightFuzzySubmitReport = solveNullList(rightFuzzySubmitReport);
            return this;
        }

        public ConditionBuilder submitReportList(String ... submitReport){
            this.submitReportList = solveNullList(submitReport);
            return this;
        }

        public ConditionBuilder submitReportList(List<String> submitReport){
            this.submitReportList = submitReport;
            return this;
        }

        public ConditionBuilder fuzzyReason (List<String> fuzzyReason){
            this.fuzzyReason = fuzzyReason;
            return this;
        }

        public ConditionBuilder fuzzyReason (String ... fuzzyReason){
            this.fuzzyReason = solveNullList(fuzzyReason);
            return this;
        }

        public ConditionBuilder rightFuzzyReason (List<String> rightFuzzyReason){
            this.rightFuzzyReason = rightFuzzyReason;
            return this;
        }

        public ConditionBuilder rightFuzzyReason (String ... rightFuzzyReason){
            this.rightFuzzyReason = solveNullList(rightFuzzyReason);
            return this;
        }

        public ConditionBuilder reasonList(String ... reason){
            this.reasonList = solveNullList(reason);
            return this;
        }

        public ConditionBuilder reasonList(List<String> reason){
            this.reasonList = reason;
            return this;
        }

        public ConditionBuilder fuzzyCountermeasure (List<String> fuzzyCountermeasure){
            this.fuzzyCountermeasure = fuzzyCountermeasure;
            return this;
        }

        public ConditionBuilder fuzzyCountermeasure (String ... fuzzyCountermeasure){
            this.fuzzyCountermeasure = solveNullList(fuzzyCountermeasure);
            return this;
        }

        public ConditionBuilder rightFuzzyCountermeasure (List<String> rightFuzzyCountermeasure){
            this.rightFuzzyCountermeasure = rightFuzzyCountermeasure;
            return this;
        }

        public ConditionBuilder rightFuzzyCountermeasure (String ... rightFuzzyCountermeasure){
            this.rightFuzzyCountermeasure = solveNullList(rightFuzzyCountermeasure);
            return this;
        }

        public ConditionBuilder countermeasureList(String ... countermeasure){
            this.countermeasureList = solveNullList(countermeasure);
            return this;
        }

        public ConditionBuilder countermeasureList(List<String> countermeasure){
            this.countermeasureList = countermeasure;
            return this;
        }

        public ConditionBuilder fuzzyReportSubmit (List<String> fuzzyReportSubmit){
            this.fuzzyReportSubmit = fuzzyReportSubmit;
            return this;
        }

        public ConditionBuilder fuzzyReportSubmit (String ... fuzzyReportSubmit){
            this.fuzzyReportSubmit = solveNullList(fuzzyReportSubmit);
            return this;
        }

        public ConditionBuilder rightFuzzyReportSubmit (List<String> rightFuzzyReportSubmit){
            this.rightFuzzyReportSubmit = rightFuzzyReportSubmit;
            return this;
        }

        public ConditionBuilder rightFuzzyReportSubmit (String ... rightFuzzyReportSubmit){
            this.rightFuzzyReportSubmit = solveNullList(rightFuzzyReportSubmit);
            return this;
        }

        public ConditionBuilder reportSubmitList(String ... reportSubmit){
            this.reportSubmitList = solveNullList(reportSubmit);
            return this;
        }

        public ConditionBuilder reportSubmitList(List<String> reportSubmit){
            this.reportSubmitList = reportSubmit;
            return this;
        }

        public ConditionBuilder fuzzyClaimIndemnity (List<String> fuzzyClaimIndemnity){
            this.fuzzyClaimIndemnity = fuzzyClaimIndemnity;
            return this;
        }

        public ConditionBuilder fuzzyClaimIndemnity (String ... fuzzyClaimIndemnity){
            this.fuzzyClaimIndemnity = solveNullList(fuzzyClaimIndemnity);
            return this;
        }

        public ConditionBuilder rightFuzzyClaimIndemnity (List<String> rightFuzzyClaimIndemnity){
            this.rightFuzzyClaimIndemnity = rightFuzzyClaimIndemnity;
            return this;
        }

        public ConditionBuilder rightFuzzyClaimIndemnity (String ... rightFuzzyClaimIndemnity){
            this.rightFuzzyClaimIndemnity = solveNullList(rightFuzzyClaimIndemnity);
            return this;
        }

        public ConditionBuilder claimIndemnityList(String ... claimIndemnity){
            this.claimIndemnityList = solveNullList(claimIndemnity);
            return this;
        }

        public ConditionBuilder claimIndemnityList(List<String> claimIndemnity){
            this.claimIndemnityList = claimIndemnity;
            return this;
        }

        public ConditionBuilder fuzzyQuestionType (List<String> fuzzyQuestionType){
            this.fuzzyQuestionType = fuzzyQuestionType;
            return this;
        }

        public ConditionBuilder fuzzyQuestionType (String ... fuzzyQuestionType){
            this.fuzzyQuestionType = solveNullList(fuzzyQuestionType);
            return this;
        }

        public ConditionBuilder rightFuzzyQuestionType (List<String> rightFuzzyQuestionType){
            this.rightFuzzyQuestionType = rightFuzzyQuestionType;
            return this;
        }

        public ConditionBuilder rightFuzzyQuestionType (String ... rightFuzzyQuestionType){
            this.rightFuzzyQuestionType = solveNullList(rightFuzzyQuestionType);
            return this;
        }

        public ConditionBuilder questionTypeList(String ... questionType){
            this.questionTypeList = solveNullList(questionType);
            return this;
        }

        public ConditionBuilder questionTypeList(List<String> questionType){
            this.questionTypeList = questionType;
            return this;
        }

        public ConditionBuilder fuzzyQuestionState (List<String> fuzzyQuestionState){
            this.fuzzyQuestionState = fuzzyQuestionState;
            return this;
        }

        public ConditionBuilder fuzzyQuestionState (String ... fuzzyQuestionState){
            this.fuzzyQuestionState = solveNullList(fuzzyQuestionState);
            return this;
        }

        public ConditionBuilder rightFuzzyQuestionState (List<String> rightFuzzyQuestionState){
            this.rightFuzzyQuestionState = rightFuzzyQuestionState;
            return this;
        }

        public ConditionBuilder rightFuzzyQuestionState (String ... rightFuzzyQuestionState){
            this.rightFuzzyQuestionState = solveNullList(rightFuzzyQuestionState);
            return this;
        }

        public ConditionBuilder questionStateList(String ... questionState){
            this.questionStateList = solveNullList(questionState);
            return this;
        }

        public ConditionBuilder questionStateList(List<String> questionState){
            this.questionStateList = questionState;
            return this;
        }

        public ConditionBuilder fuzzyResponsibleDepartment (List<String> fuzzyResponsibleDepartment){
            this.fuzzyResponsibleDepartment = fuzzyResponsibleDepartment;
            return this;
        }

        public ConditionBuilder fuzzyResponsibleDepartment (String ... fuzzyResponsibleDepartment){
            this.fuzzyResponsibleDepartment = solveNullList(fuzzyResponsibleDepartment);
            return this;
        }

        public ConditionBuilder rightFuzzyResponsibleDepartment (List<String> rightFuzzyResponsibleDepartment){
            this.rightFuzzyResponsibleDepartment = rightFuzzyResponsibleDepartment;
            return this;
        }

        public ConditionBuilder rightFuzzyResponsibleDepartment (String ... rightFuzzyResponsibleDepartment){
            this.rightFuzzyResponsibleDepartment = solveNullList(rightFuzzyResponsibleDepartment);
            return this;
        }

        public ConditionBuilder responsibleDepartmentList(String ... responsibleDepartment){
            this.responsibleDepartmentList = solveNullList(responsibleDepartment);
            return this;
        }

        public ConditionBuilder responsibleDepartmentList(List<String> responsibleDepartment){
            this.responsibleDepartmentList = responsibleDepartment;
            return this;
        }

        public ConditionBuilder applierIdBetWeen(Integer applierIdSt,Integer applierIdEd){
            this.applierIdSt = applierIdSt;
            this.applierIdEd = applierIdEd;
            return this;
        }

        public ConditionBuilder applierIdGreaterEqThan(Integer applierIdSt){
            this.applierIdSt = applierIdSt;
            return this;
        }
        public ConditionBuilder applierIdLessEqThan(Integer applierIdEd){
            this.applierIdEd = applierIdEd;
            return this;
        }


        public ConditionBuilder applierIdList(Integer ... applierId){
            this.applierIdList = solveNullList(applierId);
            return this;
        }

        public ConditionBuilder applierIdList(List<Integer> applierId){
            this.applierIdList = applierId;
            return this;
        }

        public ConditionBuilder fuzzyApplierName (List<String> fuzzyApplierName){
            this.fuzzyApplierName = fuzzyApplierName;
            return this;
        }

        public ConditionBuilder fuzzyApplierName (String ... fuzzyApplierName){
            this.fuzzyApplierName = solveNullList(fuzzyApplierName);
            return this;
        }

        public ConditionBuilder rightFuzzyApplierName (List<String> rightFuzzyApplierName){
            this.rightFuzzyApplierName = rightFuzzyApplierName;
            return this;
        }

        public ConditionBuilder rightFuzzyApplierName (String ... rightFuzzyApplierName){
            this.rightFuzzyApplierName = solveNullList(rightFuzzyApplierName);
            return this;
        }

        public ConditionBuilder applierNameList(String ... applierName){
            this.applierNameList = solveNullList(applierName);
            return this;
        }

        public ConditionBuilder applierNameList(List<String> applierName){
            this.applierNameList = applierName;
            return this;
        }

        public ConditionBuilder fuzzyApplyTime (List<String> fuzzyApplyTime){
            this.fuzzyApplyTime = fuzzyApplyTime;
            return this;
        }

        public ConditionBuilder fuzzyApplyTime (String ... fuzzyApplyTime){
            this.fuzzyApplyTime = solveNullList(fuzzyApplyTime);
            return this;
        }

        public ConditionBuilder rightFuzzyApplyTime (List<String> rightFuzzyApplyTime){
            this.rightFuzzyApplyTime = rightFuzzyApplyTime;
            return this;
        }

        public ConditionBuilder rightFuzzyApplyTime (String ... rightFuzzyApplyTime){
            this.rightFuzzyApplyTime = solveNullList(rightFuzzyApplyTime);
            return this;
        }

        public ConditionBuilder applyTimeList(String ... applyTime){
            this.applyTimeList = solveNullList(applyTime);
            return this;
        }

        public ConditionBuilder applyTimeList(List<String> applyTime){
            this.applyTimeList = applyTime;
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

        private MqmsVoucher obj;

        public Builder(){
            this.obj = new MqmsVoucher();
        }

        public Builder voucherId(Integer voucherId){
            this.obj.setVoucherId(voucherId);
            return this;
        }
        public Builder voucherCode(String voucherCode){
            this.obj.setVoucherCode(voucherCode);
            return this;
        }
        public Builder claimCode(String claimCode){
            this.obj.setClaimCode(claimCode);
            return this;
        }
        public Builder dealerCode(String dealerCode){
            this.obj.setDealerCode(dealerCode);
            return this;
        }
        public Builder dealerName(String dealerName){
            this.obj.setDealerName(dealerName);
            return this;
        }
        public Builder dealerShortName(String dealerShortName){
            this.obj.setDealerShortName(dealerShortName);
            return this;
        }
        public Builder theme(String theme){
            this.obj.setTheme(theme);
            return this;
        }
        public Builder vinCode(String vinCode){
            this.obj.setVinCode(vinCode);
            return this;
        }
        public Builder vehicleType(String vehicleType){
            this.obj.setVehicleType(vehicleType);
            return this;
        }
        public Builder productionCode(String productionCode){
            this.obj.setProductionCode(productionCode);
            return this;
        }
        public Builder partsCode(String partsCode){
            this.obj.setPartsCode(partsCode);
            return this;
        }
        public Builder partsName(String partsName){
            this.obj.setPartsName(partsName);
            return this;
        }
        public Builder divisionLevel1(String divisionLevel1){
            this.obj.setDivisionLevel1(divisionLevel1);
            return this;
        }
        public Builder divisionLevel2(String divisionLevel2){
            this.obj.setDivisionLevel2(divisionLevel2);
            return this;
        }
        public Builder divisionLevel3(String divisionLevel3){
            this.obj.setDivisionLevel3(divisionLevel3);
            return this;
        }
        public Builder partsAndSymptom(String partsAndSymptom){
            this.obj.setPartsAndSymptom(partsAndSymptom);
            return this;
        }
        public Builder offlineDate(String offlineDate){
            this.obj.setOfflineDate(offlineDate);
            return this;
        }
        public Builder salesDate(String salesDate){
            this.obj.setSalesDate(salesDate);
            return this;
        }
        public Builder failureDate(String failureDate){
            this.obj.setFailureDate(failureDate);
            return this;
        }
        public Builder mileage(Integer mileage){
            this.obj.setMileage(mileage);
            return this;
        }
        public Builder confirmDate(String confirmDate){
            this.obj.setConfirmDate(confirmDate);
            return this;
        }
        public Builder warehousingDate(String warehousingDate){
            this.obj.setWarehousingDate(warehousingDate);
            return this;
        }
        public Builder transportDate(String transportDate){
            this.obj.setTransportDate(transportDate);
            return this;
        }
        public Builder shopArrivalDate(String shopArrivalDate){
            this.obj.setShopArrivalDate(shopArrivalDate);
            return this;
        }
        public Builder salesFailureTime(Integer salesFailureTime){
            this.obj.setSalesFailureTime(salesFailureTime);
            return this;
        }
        public Builder failureDesc(String failureDesc){
            this.obj.setFailureDesc(failureDesc);
            return this;
        }
        public Builder diagnosticResult(String diagnosticResult){
            this.obj.setDiagnosticResult(diagnosticResult);
            return this;
        }
        public Builder manCost(java.math.BigDecimal manCost){
            this.obj.setManCost(manCost);
            return this;
        }
        public Builder materialCost(java.math.BigDecimal materialCost){
            this.obj.setMaterialCost(materialCost);
            return this;
        }
        public Builder materialManagementCost(java.math.BigDecimal materialManagementCost){
            this.obj.setMaterialManagementCost(materialManagementCost);
            return this;
        }
        public Builder goOutCost(java.math.BigDecimal goOutCost){
            this.obj.setGoOutCost(goOutCost);
            return this;
        }
        public Builder maintainingCost(java.math.BigDecimal maintainingCost){
            this.obj.setMaintainingCost(maintainingCost);
            return this;
        }
        public Builder otherCost(java.math.BigDecimal otherCost){
            this.obj.setOtherCost(otherCost);
            return this;
        }
        public Builder totalCost(java.math.BigDecimal totalCost){
            this.obj.setTotalCost(totalCost);
            return this;
        }
        public Builder importantLevel(String importantLevel){
            this.obj.setImportantLevel(importantLevel);
            return this;
        }
        public Builder transmissionType(String transmissionType){
            this.obj.setTransmissionType(transmissionType);
            return this;
        }
        public Builder newPartsBond(String newPartsBond){
            this.obj.setNewPartsBond(newPartsBond);
            return this;
        }
        public Builder submitDate(String submitDate){
            this.obj.setSubmitDate(submitDate);
            return this;
        }
        public Builder egtypeCode(String egtypeCode){
            this.obj.setEgtypeCode(egtypeCode);
            return this;
        }
        public Builder engProductionDate(String engProductionDate){
            this.obj.setEngProductionDate(engProductionDate);
            return this;
        }
        public Builder transmissionCode(String transmissionCode){
            this.obj.setTransmissionCode(transmissionCode);
            return this;
        }
        public Builder transmissionProductionDate(String transmissionProductionDate){
            this.obj.setTransmissionProductionDate(transmissionProductionDate);
            return this;
        }
        public Builder engArrange(String engArrange){
            this.obj.setEngArrange(engArrange);
            return this;
        }
        public Builder carModel(String carModel){
            this.obj.setCarModel(carModel);
            return this;
        }
        public Builder engType(String engType){
            this.obj.setEngType(engType);
            return this;
        }
        public Builder receiveTime(String receiveTime){
            this.obj.setReceiveTime(receiveTime);
            return this;
        }
        public Builder claimCompensation(String claimCompensation){
            this.obj.setClaimCompensation(claimCompensation);
            return this;
        }
        public Builder productionRawDescription(String productionRawDescription){
            this.obj.setProductionRawDescription(productionRawDescription);
            return this;
        }
        public Builder PDI(String PDI){
            this.obj.setPDI(PDI);
            return this;
        }
        public Builder offlineFailureTime(Integer offlineFailureTime){
            this.obj.setOfflineFailureTime(offlineFailureTime);
            return this;
        }
        public Builder engOrTran(String engOrTran){
            this.obj.setEngOrTran(engOrTran);
            return this;
        }
        public Builder carSeriesCode(String carSeriesCode){
            this.obj.setCarSeriesCode(carSeriesCode);
            return this;
        }
        public Builder shortCode(String shortCode){
            this.obj.setShortCode(shortCode);
            return this;
        }
        public Builder faultCodeClassification(String faultCodeClassification){
            this.obj.setFaultCodeClassification(faultCodeClassification);
            return this;
        }
        public Builder failureYear(String failureYear){
            this.obj.setFailureYear(failureYear);
            return this;
        }
        public Builder failureMonth(String failureMonth){
            this.obj.setFailureMonth(failureMonth);
            return this;
        }
        public Builder transmissionShortCode(String transmissionShortCode){
            this.obj.setTransmissionShortCode(transmissionShortCode);
            return this;
        }
        public Builder mileageDistribution(String mileageDistribution){
            this.obj.setMileageDistribution(mileageDistribution);
            return this;
        }
        public Builder returnRequest(String returnRequest){
            this.obj.setReturnRequest(returnRequest);
            return this;
        }
        public Builder returnDate(String returnDate){
            this.obj.setReturnDate(returnDate);
            return this;
        }
        public Builder arriveDate(String arriveDate){
            this.obj.setArriveDate(arriveDate);
            return this;
        }
        public Builder loadingVerification(String loadingVerification){
            this.obj.setLoadingVerification(loadingVerification);
            return this;
        }
        public Builder faultReconstructioner(String faultReconstructioner){
            this.obj.setFaultReconstructioner(faultReconstructioner);
            return this;
        }
        public Builder loadingDate(String loadingDate){
            this.obj.setLoadingDate(loadingDate);
            return this;
        }
        public Builder faultReconstruction(String faultReconstruction){
            this.obj.setFaultReconstruction(faultReconstruction);
            return this;
        }
        public Builder faultReconstructionDate(String faultReconstructionDate){
            this.obj.setFaultReconstructionDate(faultReconstructionDate);
            return this;
        }
        public Builder transferDate1(String transferDate1){
            this.obj.setTransferDate1(transferDate1);
            return this;
        }
        public Builder responsible1(String responsible1){
            this.obj.setResponsible1(responsible1);
            return this;
        }
        public Builder transferDate2(String transferDate2){
            this.obj.setTransferDate2(transferDate2);
            return this;
        }
        public Builder responsible2(String responsible2){
            this.obj.setResponsible2(responsible2);
            return this;
        }
        public Builder estimateMeetingDate(String estimateMeetingDate){
            this.obj.setEstimateMeetingDate(estimateMeetingDate);
            return this;
        }
        public Builder submitReport(String submitReport){
            this.obj.setSubmitReport(submitReport);
            return this;
        }
        public Builder reason(String reason){
            this.obj.setReason(reason);
            return this;
        }
        public Builder countermeasure(String countermeasure){
            this.obj.setCountermeasure(countermeasure);
            return this;
        }
        public Builder reportSubmit(String reportSubmit){
            this.obj.setReportSubmit(reportSubmit);
            return this;
        }
        public Builder claimIndemnity(String claimIndemnity){
            this.obj.setClaimIndemnity(claimIndemnity);
            return this;
        }
        public Builder questionType(String questionType){
            this.obj.setQuestionType(questionType);
            return this;
        }
        public Builder questionState(String questionState){
            this.obj.setQuestionState(questionState);
            return this;
        }
        public Builder responsibleDepartment(String responsibleDepartment){
            this.obj.setResponsibleDepartment(responsibleDepartment);
            return this;
        }
        public Builder applierId(Integer applierId){
            this.obj.setApplierId(applierId);
            return this;
        }
        public Builder applierName(String applierName){
            this.obj.setApplierName(applierName);
            return this;
        }
        public Builder applyTime(String applyTime){
            this.obj.setApplyTime(applyTime);
            return this;
        }
        public MqmsVoucher build(){return obj;}
    }

}
