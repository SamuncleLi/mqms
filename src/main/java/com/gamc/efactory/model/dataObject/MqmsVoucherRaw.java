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
public class MqmsVoucherRaw implements Serializable {

    private static final long serialVersionUID = 1578462297175L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer voucherId;

    /**
    * 单据编号
    * isNullAble:0
    */
    private String voucherCode;

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
    * vei系统状态
    * isNullAble:1
    */
    private String veiState;

    /**
    * 更新时间
    * isNullAble:1
    */
    private String updateTime;

    /**
    * 维修合同编码
    * isNullAble:1
    */
    private String maintenanceContractCode;

    /**
    * 
    * isNullAble:1
    */
    private String maintenanceItemCode;

    /**
    * 联系人
    * isNullAble:1
    */
    private String contact;

    /**
    * 电话号码
    * isNullAble:1
    */
    private String phoneNo;

    /**
    * 传真
    * isNullAble:1
    */
    private String fax;

    /**
    * 主题
    * isNullAble:1
    */
    private String theme;

    /**
    * vin码
    * isNullAble:1
    */
    private String vinCode;

    /**
    * 车辆类型
    * isNullAble:1
    */
    private String vehicleType;

    /**
    * 发动机号
    * isNullAble:1
    */
    private String egtypeCode;

    /**
    * 变速箱类型
    * isNullAble:1
    */
    private String transmissionType;

    /**
    * 里程
    * isNullAble:1
    */
    private Integer mileage;

    /**
    * 变速箱号
    * isNullAble:1
    */
    private String transmissionCode;

    /**
    * 
    * isNullAble:1
    */
    private String mtoc;

    /**
    * 故障日期
    * isNullAble:1
    */
    private String failureDate;

    /**
    * 故障部位编号
    * isNullAble:1
    */
    private String failureLocationCode;

    /**
    * 故障部位名称
    * isNullAble:1
    */
    private String failureLocationName;

    /**
    * 症状分类编号
    * isNullAble:1
    */
    private String symptomTypeCode;

    /**
    * 症状分类名称
    * isNullAble:1
    */
    private String symptomTypeName;

    /**
    * 症状编号
    * isNullAble:1
    */
    private String symptomCode;

    /**
    * 症状名称
    * isNullAble:1
    */
    private String symptomName;

    /**
    * 症状内容
    * isNullAble:1
    */
    private String symptomContent;

    /**
    * 提交时间
    * isNullAble:1
    */
    private String submitDate;

    /**
    * 重要级别
    * isNullAble:1
    */
    private String importantLevel;

    /**
    * 车种
    * isNullAble:1
    */
    private String carType;

    /**
    * 诊断结果
    * isNullAble:1
    */
    private String diagnosticResult;

    /**
    * vei系统备注
    * isNullAble:1
    */
    private String veiUserDescription;

    /**
    * 零部件编号
    * isNullAble:1
    */
    private String partsCode;

    /**
    * 
    * isNullAble:1
    */
    private String partsName;

    /**
    * 工时费
    * isNullAble:1
    */
    private java.math.BigDecimal manCost;

    /**
    * 材料费
    * isNullAble:1
    */
    private java.math.BigDecimal materialCost;

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
    * 确认者
    * isNullAble:1
    */
    private String confirmor;

    /**
    * 
    * isNullAble:1
    */
    private String confirmDate;

    /**
    * vei系统备注
    * isNullAble:1
    */
    private String veiSysDescription;

    /**
    * 车牌号
    * isNullAble:1
    */
    private String licenseCode;

    /**
    * 维修作业1
    * isNullAble:1
    */
    private String servicePerformance1;

    /**
    * 维修作业2
    * isNullAble:1
    */
    private String servicePerformance2;

    /**
    * 维修作业3
    * isNullAble:1
    */
    private String servicePerformance3;

    /**
    * 年款
    * isNullAble:1
    */
    private String modelYear;

    /**
    * 下线日期
    * isNullAble:1
    */
    private String offlineDate;

    /**
    * 销售日期
    * isNullAble:1
    */
    private String salesDate;


    public void setVoucherId(Integer voucherId){this.voucherId = voucherId;}

    public Integer getVoucherId(){return this.voucherId;}

    public void setVoucherCode(String voucherCode){this.voucherCode = voucherCode;}

    public String getVoucherCode(){return this.voucherCode;}

    public void setDealerCode(String dealerCode){this.dealerCode = dealerCode;}

    public String getDealerCode(){return this.dealerCode;}

    public void setDealerName(String dealerName){this.dealerName = dealerName;}

    public String getDealerName(){return this.dealerName;}

    public void setVeiState(String veiState){this.veiState = veiState;}

    public String getVeiState(){return this.veiState;}

    public void setUpdateTime(String updateTime){this.updateTime = updateTime;}

    public String getUpdateTime(){return this.updateTime;}

    public void setMaintenanceContractCode(String maintenanceContractCode){this.maintenanceContractCode = maintenanceContractCode;}

    public String getMaintenanceContractCode(){return this.maintenanceContractCode;}

    public void setMaintenanceItemCode(String maintenanceItemCode){this.maintenanceItemCode = maintenanceItemCode;}

    public String getMaintenanceItemCode(){return this.maintenanceItemCode;}

    public void setContact(String contact){this.contact = contact;}

    public String getContact(){return this.contact;}

    public void setPhoneNo(String phoneNo){this.phoneNo = phoneNo;}

    public String getPhoneNo(){return this.phoneNo;}

    public void setFax(String fax){this.fax = fax;}

    public String getFax(){return this.fax;}

    public void setTheme(String theme){this.theme = theme;}

    public String getTheme(){return this.theme;}

    public void setVinCode(String vinCode){this.vinCode = vinCode;}

    public String getVinCode(){return this.vinCode;}

    public void setVehicleType(String vehicleType){this.vehicleType = vehicleType;}

    public String getVehicleType(){return this.vehicleType;}

    public void setEgtypeCode(String egtypeCode){this.egtypeCode = egtypeCode;}

    public String getEgtypeCode(){return this.egtypeCode;}

    public void setTransmissionType(String transmissionType){this.transmissionType = transmissionType;}

    public String getTransmissionType(){return this.transmissionType;}

    public void setMileage(Integer mileage){this.mileage = mileage;}

    public Integer getMileage(){return this.mileage;}

    public void setTransmissionCode(String transmissionCode){this.transmissionCode = transmissionCode;}

    public String getTransmissionCode(){return this.transmissionCode;}

    public void setMtoc(String mtoc){this.mtoc = mtoc;}

    public String getMtoc(){return this.mtoc;}

    public void setFailureDate(String failureDate){this.failureDate = failureDate;}

    public String getFailureDate(){return this.failureDate;}

    public void setFailureLocationCode(String failureLocationCode){this.failureLocationCode = failureLocationCode;}

    public String getFailureLocationCode(){return this.failureLocationCode;}

    public void setFailureLocationName(String failureLocationName){this.failureLocationName = failureLocationName;}

    public String getFailureLocationName(){return this.failureLocationName;}

    public void setSymptomTypeCode(String symptomTypeCode){this.symptomTypeCode = symptomTypeCode;}

    public String getSymptomTypeCode(){return this.symptomTypeCode;}

    public void setSymptomTypeName(String symptomTypeName){this.symptomTypeName = symptomTypeName;}

    public String getSymptomTypeName(){return this.symptomTypeName;}

    public void setSymptomCode(String symptomCode){this.symptomCode = symptomCode;}

    public String getSymptomCode(){return this.symptomCode;}

    public void setSymptomName(String symptomName){this.symptomName = symptomName;}

    public String getSymptomName(){return this.symptomName;}

    public void setSymptomContent(String symptomContent){this.symptomContent = symptomContent;}

    public String getSymptomContent(){return this.symptomContent;}

    public void setSubmitDate(String submitDate){this.submitDate = submitDate;}

    public String getSubmitDate(){return this.submitDate;}

    public void setImportantLevel(String importantLevel){this.importantLevel = importantLevel;}

    public String getImportantLevel(){return this.importantLevel;}

    public void setCarType(String carType){this.carType = carType;}

    public String getCarType(){return this.carType;}

    public void setDiagnosticResult(String diagnosticResult){this.diagnosticResult = diagnosticResult;}

    public String getDiagnosticResult(){return this.diagnosticResult;}

    public void setVeiUserDescription(String veiUserDescription){this.veiUserDescription = veiUserDescription;}

    public String getVeiUserDescription(){return this.veiUserDescription;}

    public void setPartsCode(String partsCode){this.partsCode = partsCode;}

    public String getPartsCode(){return this.partsCode;}

    public void setPartsName(String partsName){this.partsName = partsName;}

    public String getPartsName(){return this.partsName;}

    public void setManCost(java.math.BigDecimal manCost){this.manCost = manCost;}

    public java.math.BigDecimal getManCost(){return this.manCost;}

    public void setMaterialCost(java.math.BigDecimal materialCost){this.materialCost = materialCost;}

    public java.math.BigDecimal getMaterialCost(){return this.materialCost;}

    public void setOtherCost(java.math.BigDecimal otherCost){this.otherCost = otherCost;}

    public java.math.BigDecimal getOtherCost(){return this.otherCost;}

    public void setTotalCost(java.math.BigDecimal totalCost){this.totalCost = totalCost;}

    public java.math.BigDecimal getTotalCost(){return this.totalCost;}

    public void setConfirmor(String confirmor){this.confirmor = confirmor;}

    public String getConfirmor(){return this.confirmor;}

    public void setConfirmDate(String confirmDate){this.confirmDate = confirmDate;}

    public String getConfirmDate(){return this.confirmDate;}

    public void setVeiSysDescription(String veiSysDescription){this.veiSysDescription = veiSysDescription;}

    public String getVeiSysDescription(){return this.veiSysDescription;}

    public void setLicenseCode(String licenseCode){this.licenseCode = licenseCode;}

    public String getLicenseCode(){return this.licenseCode;}

    public void setServicePerformance1(String servicePerformance1){this.servicePerformance1 = servicePerformance1;}

    public String getServicePerformance1(){return this.servicePerformance1;}

    public void setServicePerformance2(String servicePerformance2){this.servicePerformance2 = servicePerformance2;}

    public String getServicePerformance2(){return this.servicePerformance2;}

    public void setServicePerformance3(String servicePerformance3){this.servicePerformance3 = servicePerformance3;}

    public String getServicePerformance3(){return this.servicePerformance3;}

    public void setModelYear(String modelYear){this.modelYear = modelYear;}

    public String getModelYear(){return this.modelYear;}

    public void setOfflineDate(String offlineDate){this.offlineDate = offlineDate;}

    public String getOfflineDate(){return this.offlineDate;}

    public void setSalesDate(String salesDate){this.salesDate = salesDate;}

    public String getSalesDate(){return this.salesDate;}
    @Override
    public String toString() {
        return "MqmsVoucherRaw{" +
                "voucherId='" + voucherId + '\'' +
                "voucherCode='" + voucherCode + '\'' +
                "dealerCode='" + dealerCode + '\'' +
                "dealerName='" + dealerName + '\'' +
                "veiState='" + veiState + '\'' +
                "updateTime='" + updateTime + '\'' +
                "maintenanceContractCode='" + maintenanceContractCode + '\'' +
                "maintenanceItemCode='" + maintenanceItemCode + '\'' +
                "contact='" + contact + '\'' +
                "phoneNo='" + phoneNo + '\'' +
                "fax='" + fax + '\'' +
                "theme='" + theme + '\'' +
                "vinCode='" + vinCode + '\'' +
                "vehicleType='" + vehicleType + '\'' +
                "egtypeCode='" + egtypeCode + '\'' +
                "transmissionType='" + transmissionType + '\'' +
                "mileage='" + mileage + '\'' +
                "transmissionCode='" + transmissionCode + '\'' +
                "mtoc='" + mtoc + '\'' +
                "failureDate='" + failureDate + '\'' +
                "failureLocationCode='" + failureLocationCode + '\'' +
                "failureLocationName='" + failureLocationName + '\'' +
                "symptomTypeCode='" + symptomTypeCode + '\'' +
                "symptomTypeName='" + symptomTypeName + '\'' +
                "symptomCode='" + symptomCode + '\'' +
                "symptomName='" + symptomName + '\'' +
                "symptomContent='" + symptomContent + '\'' +
                "submitDate='" + submitDate + '\'' +
                "importantLevel='" + importantLevel + '\'' +
                "carType='" + carType + '\'' +
                "diagnosticResult='" + diagnosticResult + '\'' +
                "veiUserDescription='" + veiUserDescription + '\'' +
                "partsCode='" + partsCode + '\'' +
                "partsName='" + partsName + '\'' +
                "manCost='" + manCost + '\'' +
                "materialCost='" + materialCost + '\'' +
                "otherCost='" + otherCost + '\'' +
                "totalCost='" + totalCost + '\'' +
                "confirmor='" + confirmor + '\'' +
                "confirmDate='" + confirmDate + '\'' +
                "veiSysDescription='" + veiSysDescription + '\'' +
                "licenseCode='" + licenseCode + '\'' +
                "servicePerformance1='" + servicePerformance1 + '\'' +
                "servicePerformance2='" + servicePerformance2 + '\'' +
                "servicePerformance3='" + servicePerformance3 + '\'' +
                "modelYear='" + modelYear + '\'' +
                "offlineDate='" + offlineDate + '\'' +
                "salesDate='" + salesDate + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsVoucherRaw set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsVoucherRaw set){
            this.set = set;
            return this;
        }

        public MqmsVoucherRaw getSet(){
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

    public static class QueryBuilder extends MqmsVoucherRaw{
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
        private List<String> veiStateList;

        public List<String> getVeiStateList(){return this.veiStateList;}


        private List<String> fuzzyVeiState;

        public List<String> getFuzzyVeiState(){return this.fuzzyVeiState;}

        private List<String> rightFuzzyVeiState;

        public List<String> getRightFuzzyVeiState(){return this.rightFuzzyVeiState;}
        private List<String> updateTimeList;

        public List<String> getUpdateTimeList(){return this.updateTimeList;}


        private List<String> fuzzyUpdateTime;

        public List<String> getFuzzyUpdateTime(){return this.fuzzyUpdateTime;}

        private List<String> rightFuzzyUpdateTime;

        public List<String> getRightFuzzyUpdateTime(){return this.rightFuzzyUpdateTime;}
        private List<String> maintenanceContractCodeList;

        public List<String> getMaintenanceContractCodeList(){return this.maintenanceContractCodeList;}


        private List<String> fuzzyMaintenanceContractCode;

        public List<String> getFuzzyMaintenanceContractCode(){return this.fuzzyMaintenanceContractCode;}

        private List<String> rightFuzzyMaintenanceContractCode;

        public List<String> getRightFuzzyMaintenanceContractCode(){return this.rightFuzzyMaintenanceContractCode;}
        private List<String> maintenanceItemCodeList;

        public List<String> getMaintenanceItemCodeList(){return this.maintenanceItemCodeList;}


        private List<String> fuzzyMaintenanceItemCode;

        public List<String> getFuzzyMaintenanceItemCode(){return this.fuzzyMaintenanceItemCode;}

        private List<String> rightFuzzyMaintenanceItemCode;

        public List<String> getRightFuzzyMaintenanceItemCode(){return this.rightFuzzyMaintenanceItemCode;}
        private List<String> contactList;

        public List<String> getContactList(){return this.contactList;}


        private List<String> fuzzyContact;

        public List<String> getFuzzyContact(){return this.fuzzyContact;}

        private List<String> rightFuzzyContact;

        public List<String> getRightFuzzyContact(){return this.rightFuzzyContact;}
        private List<String> phoneNoList;

        public List<String> getPhoneNoList(){return this.phoneNoList;}


        private List<String> fuzzyPhoneNo;

        public List<String> getFuzzyPhoneNo(){return this.fuzzyPhoneNo;}

        private List<String> rightFuzzyPhoneNo;

        public List<String> getRightFuzzyPhoneNo(){return this.rightFuzzyPhoneNo;}
        private List<String> faxList;

        public List<String> getFaxList(){return this.faxList;}


        private List<String> fuzzyFax;

        public List<String> getFuzzyFax(){return this.fuzzyFax;}

        private List<String> rightFuzzyFax;

        public List<String> getRightFuzzyFax(){return this.rightFuzzyFax;}
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
        private List<String> egtypeCodeList;

        public List<String> getEgtypeCodeList(){return this.egtypeCodeList;}


        private List<String> fuzzyEgtypeCode;

        public List<String> getFuzzyEgtypeCode(){return this.fuzzyEgtypeCode;}

        private List<String> rightFuzzyEgtypeCode;

        public List<String> getRightFuzzyEgtypeCode(){return this.rightFuzzyEgtypeCode;}
        private List<String> transmissionTypeList;

        public List<String> getTransmissionTypeList(){return this.transmissionTypeList;}


        private List<String> fuzzyTransmissionType;

        public List<String> getFuzzyTransmissionType(){return this.fuzzyTransmissionType;}

        private List<String> rightFuzzyTransmissionType;

        public List<String> getRightFuzzyTransmissionType(){return this.rightFuzzyTransmissionType;}
        private List<Integer> mileageList;

        public List<Integer> getMileageList(){return this.mileageList;}

        private Integer mileageSt;

        private Integer mileageEd;

        public Integer getMileageSt(){return this.mileageSt;}

        public Integer getMileageEd(){return this.mileageEd;}

        private List<String> transmissionCodeList;

        public List<String> getTransmissionCodeList(){return this.transmissionCodeList;}


        private List<String> fuzzyTransmissionCode;

        public List<String> getFuzzyTransmissionCode(){return this.fuzzyTransmissionCode;}

        private List<String> rightFuzzyTransmissionCode;

        public List<String> getRightFuzzyTransmissionCode(){return this.rightFuzzyTransmissionCode;}
        private List<String> mtocList;

        public List<String> getMtocList(){return this.mtocList;}


        private List<String> fuzzyMtoc;

        public List<String> getFuzzyMtoc(){return this.fuzzyMtoc;}

        private List<String> rightFuzzyMtoc;

        public List<String> getRightFuzzyMtoc(){return this.rightFuzzyMtoc;}
        private List<String> failureDateList;

        public List<String> getFailureDateList(){return this.failureDateList;}


        private List<String> fuzzyFailureDate;

        public List<String> getFuzzyFailureDate(){return this.fuzzyFailureDate;}

        private List<String> rightFuzzyFailureDate;

        public List<String> getRightFuzzyFailureDate(){return this.rightFuzzyFailureDate;}
        private List<String> failureLocationCodeList;

        public List<String> getFailureLocationCodeList(){return this.failureLocationCodeList;}


        private List<String> fuzzyFailureLocationCode;

        public List<String> getFuzzyFailureLocationCode(){return this.fuzzyFailureLocationCode;}

        private List<String> rightFuzzyFailureLocationCode;

        public List<String> getRightFuzzyFailureLocationCode(){return this.rightFuzzyFailureLocationCode;}
        private List<String> failureLocationNameList;

        public List<String> getFailureLocationNameList(){return this.failureLocationNameList;}


        private List<String> fuzzyFailureLocationName;

        public List<String> getFuzzyFailureLocationName(){return this.fuzzyFailureLocationName;}

        private List<String> rightFuzzyFailureLocationName;

        public List<String> getRightFuzzyFailureLocationName(){return this.rightFuzzyFailureLocationName;}
        private List<String> symptomTypeCodeList;

        public List<String> getSymptomTypeCodeList(){return this.symptomTypeCodeList;}


        private List<String> fuzzySymptomTypeCode;

        public List<String> getFuzzySymptomTypeCode(){return this.fuzzySymptomTypeCode;}

        private List<String> rightFuzzySymptomTypeCode;

        public List<String> getRightFuzzySymptomTypeCode(){return this.rightFuzzySymptomTypeCode;}
        private List<String> symptomTypeNameList;

        public List<String> getSymptomTypeNameList(){return this.symptomTypeNameList;}


        private List<String> fuzzySymptomTypeName;

        public List<String> getFuzzySymptomTypeName(){return this.fuzzySymptomTypeName;}

        private List<String> rightFuzzySymptomTypeName;

        public List<String> getRightFuzzySymptomTypeName(){return this.rightFuzzySymptomTypeName;}
        private List<String> symptomCodeList;

        public List<String> getSymptomCodeList(){return this.symptomCodeList;}


        private List<String> fuzzySymptomCode;

        public List<String> getFuzzySymptomCode(){return this.fuzzySymptomCode;}

        private List<String> rightFuzzySymptomCode;

        public List<String> getRightFuzzySymptomCode(){return this.rightFuzzySymptomCode;}
        private List<String> symptomNameList;

        public List<String> getSymptomNameList(){return this.symptomNameList;}


        private List<String> fuzzySymptomName;

        public List<String> getFuzzySymptomName(){return this.fuzzySymptomName;}

        private List<String> rightFuzzySymptomName;

        public List<String> getRightFuzzySymptomName(){return this.rightFuzzySymptomName;}
        private List<String> symptomContentList;

        public List<String> getSymptomContentList(){return this.symptomContentList;}


        private List<String> fuzzySymptomContent;

        public List<String> getFuzzySymptomContent(){return this.fuzzySymptomContent;}

        private List<String> rightFuzzySymptomContent;

        public List<String> getRightFuzzySymptomContent(){return this.rightFuzzySymptomContent;}
        private List<String> submitDateList;

        public List<String> getSubmitDateList(){return this.submitDateList;}


        private List<String> fuzzySubmitDate;

        public List<String> getFuzzySubmitDate(){return this.fuzzySubmitDate;}

        private List<String> rightFuzzySubmitDate;

        public List<String> getRightFuzzySubmitDate(){return this.rightFuzzySubmitDate;}
        private List<String> importantLevelList;

        public List<String> getImportantLevelList(){return this.importantLevelList;}


        private List<String> fuzzyImportantLevel;

        public List<String> getFuzzyImportantLevel(){return this.fuzzyImportantLevel;}

        private List<String> rightFuzzyImportantLevel;

        public List<String> getRightFuzzyImportantLevel(){return this.rightFuzzyImportantLevel;}
        private List<String> carTypeList;

        public List<String> getCarTypeList(){return this.carTypeList;}


        private List<String> fuzzyCarType;

        public List<String> getFuzzyCarType(){return this.fuzzyCarType;}

        private List<String> rightFuzzyCarType;

        public List<String> getRightFuzzyCarType(){return this.rightFuzzyCarType;}
        private List<String> diagnosticResultList;

        public List<String> getDiagnosticResultList(){return this.diagnosticResultList;}


        private List<String> fuzzyDiagnosticResult;

        public List<String> getFuzzyDiagnosticResult(){return this.fuzzyDiagnosticResult;}

        private List<String> rightFuzzyDiagnosticResult;

        public List<String> getRightFuzzyDiagnosticResult(){return this.rightFuzzyDiagnosticResult;}
        private List<String> veiUserDescriptionList;

        public List<String> getVeiUserDescriptionList(){return this.veiUserDescriptionList;}


        private List<String> fuzzyVeiUserDescription;

        public List<String> getFuzzyVeiUserDescription(){return this.fuzzyVeiUserDescription;}

        private List<String> rightFuzzyVeiUserDescription;

        public List<String> getRightFuzzyVeiUserDescription(){return this.rightFuzzyVeiUserDescription;}
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

        private List<String> confirmorList;

        public List<String> getConfirmorList(){return this.confirmorList;}


        private List<String> fuzzyConfirmor;

        public List<String> getFuzzyConfirmor(){return this.fuzzyConfirmor;}

        private List<String> rightFuzzyConfirmor;

        public List<String> getRightFuzzyConfirmor(){return this.rightFuzzyConfirmor;}
        private List<String> confirmDateList;

        public List<String> getConfirmDateList(){return this.confirmDateList;}


        private List<String> fuzzyConfirmDate;

        public List<String> getFuzzyConfirmDate(){return this.fuzzyConfirmDate;}

        private List<String> rightFuzzyConfirmDate;

        public List<String> getRightFuzzyConfirmDate(){return this.rightFuzzyConfirmDate;}
        private List<String> veiSysDescriptionList;

        public List<String> getVeiSysDescriptionList(){return this.veiSysDescriptionList;}


        private List<String> fuzzyVeiSysDescription;

        public List<String> getFuzzyVeiSysDescription(){return this.fuzzyVeiSysDescription;}

        private List<String> rightFuzzyVeiSysDescription;

        public List<String> getRightFuzzyVeiSysDescription(){return this.rightFuzzyVeiSysDescription;}
        private List<String> licenseCodeList;

        public List<String> getLicenseCodeList(){return this.licenseCodeList;}


        private List<String> fuzzyLicenseCode;

        public List<String> getFuzzyLicenseCode(){return this.fuzzyLicenseCode;}

        private List<String> rightFuzzyLicenseCode;

        public List<String> getRightFuzzyLicenseCode(){return this.rightFuzzyLicenseCode;}
        private List<String> servicePerformance1List;

        public List<String> getServicePerformance1List(){return this.servicePerformance1List;}


        private List<String> fuzzyServicePerformance1;

        public List<String> getFuzzyServicePerformance1(){return this.fuzzyServicePerformance1;}

        private List<String> rightFuzzyServicePerformance1;

        public List<String> getRightFuzzyServicePerformance1(){return this.rightFuzzyServicePerformance1;}
        private List<String> servicePerformance2List;

        public List<String> getServicePerformance2List(){return this.servicePerformance2List;}


        private List<String> fuzzyServicePerformance2;

        public List<String> getFuzzyServicePerformance2(){return this.fuzzyServicePerformance2;}

        private List<String> rightFuzzyServicePerformance2;

        public List<String> getRightFuzzyServicePerformance2(){return this.rightFuzzyServicePerformance2;}
        private List<String> servicePerformance3List;

        public List<String> getServicePerformance3List(){return this.servicePerformance3List;}


        private List<String> fuzzyServicePerformance3;

        public List<String> getFuzzyServicePerformance3(){return this.fuzzyServicePerformance3;}

        private List<String> rightFuzzyServicePerformance3;

        public List<String> getRightFuzzyServicePerformance3(){return this.rightFuzzyServicePerformance3;}
        private List<String> modelYearList;

        public List<String> getModelYearList(){return this.modelYearList;}


        private List<String> fuzzyModelYear;

        public List<String> getFuzzyModelYear(){return this.fuzzyModelYear;}

        private List<String> rightFuzzyModelYear;

        public List<String> getRightFuzzyModelYear(){return this.rightFuzzyModelYear;}
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

        public QueryBuilder fuzzyVeiState (List<String> fuzzyVeiState){
            this.fuzzyVeiState = fuzzyVeiState;
            return this;
        }

        public QueryBuilder fuzzyVeiState (String ... fuzzyVeiState){
            this.fuzzyVeiState = solveNullList(fuzzyVeiState);
            return this;
        }

        public QueryBuilder rightFuzzyVeiState (List<String> rightFuzzyVeiState){
            this.rightFuzzyVeiState = rightFuzzyVeiState;
            return this;
        }

        public QueryBuilder rightFuzzyVeiState (String ... rightFuzzyVeiState){
            this.rightFuzzyVeiState = solveNullList(rightFuzzyVeiState);
            return this;
        }

        public QueryBuilder veiState(String veiState){
            setVeiState(veiState);
            return this;
        }

        public QueryBuilder veiStateList(String ... veiState){
            this.veiStateList = solveNullList(veiState);
            return this;
        }

        public QueryBuilder veiStateList(List<String> veiState){
            this.veiStateList = veiState;
            return this;
        }

        public QueryBuilder fetchVeiState(){
            setFetchFields("fetchFields","veiState");
            return this;
        }

        public QueryBuilder excludeVeiState(){
            setFetchFields("excludeFields","veiState");
            return this;
        }

        public QueryBuilder fuzzyUpdateTime (List<String> fuzzyUpdateTime){
            this.fuzzyUpdateTime = fuzzyUpdateTime;
            return this;
        }

        public QueryBuilder fuzzyUpdateTime (String ... fuzzyUpdateTime){
            this.fuzzyUpdateTime = solveNullList(fuzzyUpdateTime);
            return this;
        }

        public QueryBuilder rightFuzzyUpdateTime (List<String> rightFuzzyUpdateTime){
            this.rightFuzzyUpdateTime = rightFuzzyUpdateTime;
            return this;
        }

        public QueryBuilder rightFuzzyUpdateTime (String ... rightFuzzyUpdateTime){
            this.rightFuzzyUpdateTime = solveNullList(rightFuzzyUpdateTime);
            return this;
        }

        public QueryBuilder updateTime(String updateTime){
            setUpdateTime(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(String ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(List<String> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public QueryBuilder fetchUpdateTime(){
            setFetchFields("fetchFields","updateTime");
            return this;
        }

        public QueryBuilder excludeUpdateTime(){
            setFetchFields("excludeFields","updateTime");
            return this;
        }

        public QueryBuilder fuzzyMaintenanceContractCode (List<String> fuzzyMaintenanceContractCode){
            this.fuzzyMaintenanceContractCode = fuzzyMaintenanceContractCode;
            return this;
        }

        public QueryBuilder fuzzyMaintenanceContractCode (String ... fuzzyMaintenanceContractCode){
            this.fuzzyMaintenanceContractCode = solveNullList(fuzzyMaintenanceContractCode);
            return this;
        }

        public QueryBuilder rightFuzzyMaintenanceContractCode (List<String> rightFuzzyMaintenanceContractCode){
            this.rightFuzzyMaintenanceContractCode = rightFuzzyMaintenanceContractCode;
            return this;
        }

        public QueryBuilder rightFuzzyMaintenanceContractCode (String ... rightFuzzyMaintenanceContractCode){
            this.rightFuzzyMaintenanceContractCode = solveNullList(rightFuzzyMaintenanceContractCode);
            return this;
        }

        public QueryBuilder maintenanceContractCode(String maintenanceContractCode){
            setMaintenanceContractCode(maintenanceContractCode);
            return this;
        }

        public QueryBuilder maintenanceContractCodeList(String ... maintenanceContractCode){
            this.maintenanceContractCodeList = solveNullList(maintenanceContractCode);
            return this;
        }

        public QueryBuilder maintenanceContractCodeList(List<String> maintenanceContractCode){
            this.maintenanceContractCodeList = maintenanceContractCode;
            return this;
        }

        public QueryBuilder fetchMaintenanceContractCode(){
            setFetchFields("fetchFields","maintenanceContractCode");
            return this;
        }

        public QueryBuilder excludeMaintenanceContractCode(){
            setFetchFields("excludeFields","maintenanceContractCode");
            return this;
        }

        public QueryBuilder fuzzyMaintenanceItemCode (List<String> fuzzyMaintenanceItemCode){
            this.fuzzyMaintenanceItemCode = fuzzyMaintenanceItemCode;
            return this;
        }

        public QueryBuilder fuzzyMaintenanceItemCode (String ... fuzzyMaintenanceItemCode){
            this.fuzzyMaintenanceItemCode = solveNullList(fuzzyMaintenanceItemCode);
            return this;
        }

        public QueryBuilder rightFuzzyMaintenanceItemCode (List<String> rightFuzzyMaintenanceItemCode){
            this.rightFuzzyMaintenanceItemCode = rightFuzzyMaintenanceItemCode;
            return this;
        }

        public QueryBuilder rightFuzzyMaintenanceItemCode (String ... rightFuzzyMaintenanceItemCode){
            this.rightFuzzyMaintenanceItemCode = solveNullList(rightFuzzyMaintenanceItemCode);
            return this;
        }

        public QueryBuilder maintenanceItemCode(String maintenanceItemCode){
            setMaintenanceItemCode(maintenanceItemCode);
            return this;
        }

        public QueryBuilder maintenanceItemCodeList(String ... maintenanceItemCode){
            this.maintenanceItemCodeList = solveNullList(maintenanceItemCode);
            return this;
        }

        public QueryBuilder maintenanceItemCodeList(List<String> maintenanceItemCode){
            this.maintenanceItemCodeList = maintenanceItemCode;
            return this;
        }

        public QueryBuilder fetchMaintenanceItemCode(){
            setFetchFields("fetchFields","maintenanceItemCode");
            return this;
        }

        public QueryBuilder excludeMaintenanceItemCode(){
            setFetchFields("excludeFields","maintenanceItemCode");
            return this;
        }

        public QueryBuilder fuzzyContact (List<String> fuzzyContact){
            this.fuzzyContact = fuzzyContact;
            return this;
        }

        public QueryBuilder fuzzyContact (String ... fuzzyContact){
            this.fuzzyContact = solveNullList(fuzzyContact);
            return this;
        }

        public QueryBuilder rightFuzzyContact (List<String> rightFuzzyContact){
            this.rightFuzzyContact = rightFuzzyContact;
            return this;
        }

        public QueryBuilder rightFuzzyContact (String ... rightFuzzyContact){
            this.rightFuzzyContact = solveNullList(rightFuzzyContact);
            return this;
        }

        public QueryBuilder contact(String contact){
            setContact(contact);
            return this;
        }

        public QueryBuilder contactList(String ... contact){
            this.contactList = solveNullList(contact);
            return this;
        }

        public QueryBuilder contactList(List<String> contact){
            this.contactList = contact;
            return this;
        }

        public QueryBuilder fetchContact(){
            setFetchFields("fetchFields","contact");
            return this;
        }

        public QueryBuilder excludeContact(){
            setFetchFields("excludeFields","contact");
            return this;
        }

        public QueryBuilder fuzzyPhoneNo (List<String> fuzzyPhoneNo){
            this.fuzzyPhoneNo = fuzzyPhoneNo;
            return this;
        }

        public QueryBuilder fuzzyPhoneNo (String ... fuzzyPhoneNo){
            this.fuzzyPhoneNo = solveNullList(fuzzyPhoneNo);
            return this;
        }

        public QueryBuilder rightFuzzyPhoneNo (List<String> rightFuzzyPhoneNo){
            this.rightFuzzyPhoneNo = rightFuzzyPhoneNo;
            return this;
        }

        public QueryBuilder rightFuzzyPhoneNo (String ... rightFuzzyPhoneNo){
            this.rightFuzzyPhoneNo = solveNullList(rightFuzzyPhoneNo);
            return this;
        }

        public QueryBuilder phoneNo(String phoneNo){
            setPhoneNo(phoneNo);
            return this;
        }

        public QueryBuilder phoneNoList(String ... phoneNo){
            this.phoneNoList = solveNullList(phoneNo);
            return this;
        }

        public QueryBuilder phoneNoList(List<String> phoneNo){
            this.phoneNoList = phoneNo;
            return this;
        }

        public QueryBuilder fetchPhoneNo(){
            setFetchFields("fetchFields","phoneNo");
            return this;
        }

        public QueryBuilder excludePhoneNo(){
            setFetchFields("excludeFields","phoneNo");
            return this;
        }

        public QueryBuilder fuzzyFax (List<String> fuzzyFax){
            this.fuzzyFax = fuzzyFax;
            return this;
        }

        public QueryBuilder fuzzyFax (String ... fuzzyFax){
            this.fuzzyFax = solveNullList(fuzzyFax);
            return this;
        }

        public QueryBuilder rightFuzzyFax (List<String> rightFuzzyFax){
            this.rightFuzzyFax = rightFuzzyFax;
            return this;
        }

        public QueryBuilder rightFuzzyFax (String ... rightFuzzyFax){
            this.rightFuzzyFax = solveNullList(rightFuzzyFax);
            return this;
        }

        public QueryBuilder fax(String fax){
            setFax(fax);
            return this;
        }

        public QueryBuilder faxList(String ... fax){
            this.faxList = solveNullList(fax);
            return this;
        }

        public QueryBuilder faxList(List<String> fax){
            this.faxList = fax;
            return this;
        }

        public QueryBuilder fetchFax(){
            setFetchFields("fetchFields","fax");
            return this;
        }

        public QueryBuilder excludeFax(){
            setFetchFields("excludeFields","fax");
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

        public QueryBuilder fuzzyMtoc (List<String> fuzzyMtoc){
            this.fuzzyMtoc = fuzzyMtoc;
            return this;
        }

        public QueryBuilder fuzzyMtoc (String ... fuzzyMtoc){
            this.fuzzyMtoc = solveNullList(fuzzyMtoc);
            return this;
        }

        public QueryBuilder rightFuzzyMtoc (List<String> rightFuzzyMtoc){
            this.rightFuzzyMtoc = rightFuzzyMtoc;
            return this;
        }

        public QueryBuilder rightFuzzyMtoc (String ... rightFuzzyMtoc){
            this.rightFuzzyMtoc = solveNullList(rightFuzzyMtoc);
            return this;
        }

        public QueryBuilder mtoc(String mtoc){
            setMtoc(mtoc);
            return this;
        }

        public QueryBuilder mtocList(String ... mtoc){
            this.mtocList = solveNullList(mtoc);
            return this;
        }

        public QueryBuilder mtocList(List<String> mtoc){
            this.mtocList = mtoc;
            return this;
        }

        public QueryBuilder fetchMtoc(){
            setFetchFields("fetchFields","mtoc");
            return this;
        }

        public QueryBuilder excludeMtoc(){
            setFetchFields("excludeFields","mtoc");
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

        public QueryBuilder fuzzyFailureLocationCode (List<String> fuzzyFailureLocationCode){
            this.fuzzyFailureLocationCode = fuzzyFailureLocationCode;
            return this;
        }

        public QueryBuilder fuzzyFailureLocationCode (String ... fuzzyFailureLocationCode){
            this.fuzzyFailureLocationCode = solveNullList(fuzzyFailureLocationCode);
            return this;
        }

        public QueryBuilder rightFuzzyFailureLocationCode (List<String> rightFuzzyFailureLocationCode){
            this.rightFuzzyFailureLocationCode = rightFuzzyFailureLocationCode;
            return this;
        }

        public QueryBuilder rightFuzzyFailureLocationCode (String ... rightFuzzyFailureLocationCode){
            this.rightFuzzyFailureLocationCode = solveNullList(rightFuzzyFailureLocationCode);
            return this;
        }

        public QueryBuilder failureLocationCode(String failureLocationCode){
            setFailureLocationCode(failureLocationCode);
            return this;
        }

        public QueryBuilder failureLocationCodeList(String ... failureLocationCode){
            this.failureLocationCodeList = solveNullList(failureLocationCode);
            return this;
        }

        public QueryBuilder failureLocationCodeList(List<String> failureLocationCode){
            this.failureLocationCodeList = failureLocationCode;
            return this;
        }

        public QueryBuilder fetchFailureLocationCode(){
            setFetchFields("fetchFields","failureLocationCode");
            return this;
        }

        public QueryBuilder excludeFailureLocationCode(){
            setFetchFields("excludeFields","failureLocationCode");
            return this;
        }

        public QueryBuilder fuzzyFailureLocationName (List<String> fuzzyFailureLocationName){
            this.fuzzyFailureLocationName = fuzzyFailureLocationName;
            return this;
        }

        public QueryBuilder fuzzyFailureLocationName (String ... fuzzyFailureLocationName){
            this.fuzzyFailureLocationName = solveNullList(fuzzyFailureLocationName);
            return this;
        }

        public QueryBuilder rightFuzzyFailureLocationName (List<String> rightFuzzyFailureLocationName){
            this.rightFuzzyFailureLocationName = rightFuzzyFailureLocationName;
            return this;
        }

        public QueryBuilder rightFuzzyFailureLocationName (String ... rightFuzzyFailureLocationName){
            this.rightFuzzyFailureLocationName = solveNullList(rightFuzzyFailureLocationName);
            return this;
        }

        public QueryBuilder failureLocationName(String failureLocationName){
            setFailureLocationName(failureLocationName);
            return this;
        }

        public QueryBuilder failureLocationNameList(String ... failureLocationName){
            this.failureLocationNameList = solveNullList(failureLocationName);
            return this;
        }

        public QueryBuilder failureLocationNameList(List<String> failureLocationName){
            this.failureLocationNameList = failureLocationName;
            return this;
        }

        public QueryBuilder fetchFailureLocationName(){
            setFetchFields("fetchFields","failureLocationName");
            return this;
        }

        public QueryBuilder excludeFailureLocationName(){
            setFetchFields("excludeFields","failureLocationName");
            return this;
        }

        public QueryBuilder fuzzySymptomTypeCode (List<String> fuzzySymptomTypeCode){
            this.fuzzySymptomTypeCode = fuzzySymptomTypeCode;
            return this;
        }

        public QueryBuilder fuzzySymptomTypeCode (String ... fuzzySymptomTypeCode){
            this.fuzzySymptomTypeCode = solveNullList(fuzzySymptomTypeCode);
            return this;
        }

        public QueryBuilder rightFuzzySymptomTypeCode (List<String> rightFuzzySymptomTypeCode){
            this.rightFuzzySymptomTypeCode = rightFuzzySymptomTypeCode;
            return this;
        }

        public QueryBuilder rightFuzzySymptomTypeCode (String ... rightFuzzySymptomTypeCode){
            this.rightFuzzySymptomTypeCode = solveNullList(rightFuzzySymptomTypeCode);
            return this;
        }

        public QueryBuilder symptomTypeCode(String symptomTypeCode){
            setSymptomTypeCode(symptomTypeCode);
            return this;
        }

        public QueryBuilder symptomTypeCodeList(String ... symptomTypeCode){
            this.symptomTypeCodeList = solveNullList(symptomTypeCode);
            return this;
        }

        public QueryBuilder symptomTypeCodeList(List<String> symptomTypeCode){
            this.symptomTypeCodeList = symptomTypeCode;
            return this;
        }

        public QueryBuilder fetchSymptomTypeCode(){
            setFetchFields("fetchFields","symptomTypeCode");
            return this;
        }

        public QueryBuilder excludeSymptomTypeCode(){
            setFetchFields("excludeFields","symptomTypeCode");
            return this;
        }

        public QueryBuilder fuzzySymptomTypeName (List<String> fuzzySymptomTypeName){
            this.fuzzySymptomTypeName = fuzzySymptomTypeName;
            return this;
        }

        public QueryBuilder fuzzySymptomTypeName (String ... fuzzySymptomTypeName){
            this.fuzzySymptomTypeName = solveNullList(fuzzySymptomTypeName);
            return this;
        }

        public QueryBuilder rightFuzzySymptomTypeName (List<String> rightFuzzySymptomTypeName){
            this.rightFuzzySymptomTypeName = rightFuzzySymptomTypeName;
            return this;
        }

        public QueryBuilder rightFuzzySymptomTypeName (String ... rightFuzzySymptomTypeName){
            this.rightFuzzySymptomTypeName = solveNullList(rightFuzzySymptomTypeName);
            return this;
        }

        public QueryBuilder symptomTypeName(String symptomTypeName){
            setSymptomTypeName(symptomTypeName);
            return this;
        }

        public QueryBuilder symptomTypeNameList(String ... symptomTypeName){
            this.symptomTypeNameList = solveNullList(symptomTypeName);
            return this;
        }

        public QueryBuilder symptomTypeNameList(List<String> symptomTypeName){
            this.symptomTypeNameList = symptomTypeName;
            return this;
        }

        public QueryBuilder fetchSymptomTypeName(){
            setFetchFields("fetchFields","symptomTypeName");
            return this;
        }

        public QueryBuilder excludeSymptomTypeName(){
            setFetchFields("excludeFields","symptomTypeName");
            return this;
        }

        public QueryBuilder fuzzySymptomCode (List<String> fuzzySymptomCode){
            this.fuzzySymptomCode = fuzzySymptomCode;
            return this;
        }

        public QueryBuilder fuzzySymptomCode (String ... fuzzySymptomCode){
            this.fuzzySymptomCode = solveNullList(fuzzySymptomCode);
            return this;
        }

        public QueryBuilder rightFuzzySymptomCode (List<String> rightFuzzySymptomCode){
            this.rightFuzzySymptomCode = rightFuzzySymptomCode;
            return this;
        }

        public QueryBuilder rightFuzzySymptomCode (String ... rightFuzzySymptomCode){
            this.rightFuzzySymptomCode = solveNullList(rightFuzzySymptomCode);
            return this;
        }

        public QueryBuilder symptomCode(String symptomCode){
            setSymptomCode(symptomCode);
            return this;
        }

        public QueryBuilder symptomCodeList(String ... symptomCode){
            this.symptomCodeList = solveNullList(symptomCode);
            return this;
        }

        public QueryBuilder symptomCodeList(List<String> symptomCode){
            this.symptomCodeList = symptomCode;
            return this;
        }

        public QueryBuilder fetchSymptomCode(){
            setFetchFields("fetchFields","symptomCode");
            return this;
        }

        public QueryBuilder excludeSymptomCode(){
            setFetchFields("excludeFields","symptomCode");
            return this;
        }

        public QueryBuilder fuzzySymptomName (List<String> fuzzySymptomName){
            this.fuzzySymptomName = fuzzySymptomName;
            return this;
        }

        public QueryBuilder fuzzySymptomName (String ... fuzzySymptomName){
            this.fuzzySymptomName = solveNullList(fuzzySymptomName);
            return this;
        }

        public QueryBuilder rightFuzzySymptomName (List<String> rightFuzzySymptomName){
            this.rightFuzzySymptomName = rightFuzzySymptomName;
            return this;
        }

        public QueryBuilder rightFuzzySymptomName (String ... rightFuzzySymptomName){
            this.rightFuzzySymptomName = solveNullList(rightFuzzySymptomName);
            return this;
        }

        public QueryBuilder symptomName(String symptomName){
            setSymptomName(symptomName);
            return this;
        }

        public QueryBuilder symptomNameList(String ... symptomName){
            this.symptomNameList = solveNullList(symptomName);
            return this;
        }

        public QueryBuilder symptomNameList(List<String> symptomName){
            this.symptomNameList = symptomName;
            return this;
        }

        public QueryBuilder fetchSymptomName(){
            setFetchFields("fetchFields","symptomName");
            return this;
        }

        public QueryBuilder excludeSymptomName(){
            setFetchFields("excludeFields","symptomName");
            return this;
        }

        public QueryBuilder fuzzySymptomContent (List<String> fuzzySymptomContent){
            this.fuzzySymptomContent = fuzzySymptomContent;
            return this;
        }

        public QueryBuilder fuzzySymptomContent (String ... fuzzySymptomContent){
            this.fuzzySymptomContent = solveNullList(fuzzySymptomContent);
            return this;
        }

        public QueryBuilder rightFuzzySymptomContent (List<String> rightFuzzySymptomContent){
            this.rightFuzzySymptomContent = rightFuzzySymptomContent;
            return this;
        }

        public QueryBuilder rightFuzzySymptomContent (String ... rightFuzzySymptomContent){
            this.rightFuzzySymptomContent = solveNullList(rightFuzzySymptomContent);
            return this;
        }

        public QueryBuilder symptomContent(String symptomContent){
            setSymptomContent(symptomContent);
            return this;
        }

        public QueryBuilder symptomContentList(String ... symptomContent){
            this.symptomContentList = solveNullList(symptomContent);
            return this;
        }

        public QueryBuilder symptomContentList(List<String> symptomContent){
            this.symptomContentList = symptomContent;
            return this;
        }

        public QueryBuilder fetchSymptomContent(){
            setFetchFields("fetchFields","symptomContent");
            return this;
        }

        public QueryBuilder excludeSymptomContent(){
            setFetchFields("excludeFields","symptomContent");
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

        public QueryBuilder fuzzyCarType (List<String> fuzzyCarType){
            this.fuzzyCarType = fuzzyCarType;
            return this;
        }

        public QueryBuilder fuzzyCarType (String ... fuzzyCarType){
            this.fuzzyCarType = solveNullList(fuzzyCarType);
            return this;
        }

        public QueryBuilder rightFuzzyCarType (List<String> rightFuzzyCarType){
            this.rightFuzzyCarType = rightFuzzyCarType;
            return this;
        }

        public QueryBuilder rightFuzzyCarType (String ... rightFuzzyCarType){
            this.rightFuzzyCarType = solveNullList(rightFuzzyCarType);
            return this;
        }

        public QueryBuilder carType(String carType){
            setCarType(carType);
            return this;
        }

        public QueryBuilder carTypeList(String ... carType){
            this.carTypeList = solveNullList(carType);
            return this;
        }

        public QueryBuilder carTypeList(List<String> carType){
            this.carTypeList = carType;
            return this;
        }

        public QueryBuilder fetchCarType(){
            setFetchFields("fetchFields","carType");
            return this;
        }

        public QueryBuilder excludeCarType(){
            setFetchFields("excludeFields","carType");
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

        public QueryBuilder fuzzyVeiUserDescription (List<String> fuzzyVeiUserDescription){
            this.fuzzyVeiUserDescription = fuzzyVeiUserDescription;
            return this;
        }

        public QueryBuilder fuzzyVeiUserDescription (String ... fuzzyVeiUserDescription){
            this.fuzzyVeiUserDescription = solveNullList(fuzzyVeiUserDescription);
            return this;
        }

        public QueryBuilder rightFuzzyVeiUserDescription (List<String> rightFuzzyVeiUserDescription){
            this.rightFuzzyVeiUserDescription = rightFuzzyVeiUserDescription;
            return this;
        }

        public QueryBuilder rightFuzzyVeiUserDescription (String ... rightFuzzyVeiUserDescription){
            this.rightFuzzyVeiUserDescription = solveNullList(rightFuzzyVeiUserDescription);
            return this;
        }

        public QueryBuilder veiUserDescription(String veiUserDescription){
            setVeiUserDescription(veiUserDescription);
            return this;
        }

        public QueryBuilder veiUserDescriptionList(String ... veiUserDescription){
            this.veiUserDescriptionList = solveNullList(veiUserDescription);
            return this;
        }

        public QueryBuilder veiUserDescriptionList(List<String> veiUserDescription){
            this.veiUserDescriptionList = veiUserDescription;
            return this;
        }

        public QueryBuilder fetchVeiUserDescription(){
            setFetchFields("fetchFields","veiUserDescription");
            return this;
        }

        public QueryBuilder excludeVeiUserDescription(){
            setFetchFields("excludeFields","veiUserDescription");
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

        public QueryBuilder fuzzyConfirmor (List<String> fuzzyConfirmor){
            this.fuzzyConfirmor = fuzzyConfirmor;
            return this;
        }

        public QueryBuilder fuzzyConfirmor (String ... fuzzyConfirmor){
            this.fuzzyConfirmor = solveNullList(fuzzyConfirmor);
            return this;
        }

        public QueryBuilder rightFuzzyConfirmor (List<String> rightFuzzyConfirmor){
            this.rightFuzzyConfirmor = rightFuzzyConfirmor;
            return this;
        }

        public QueryBuilder rightFuzzyConfirmor (String ... rightFuzzyConfirmor){
            this.rightFuzzyConfirmor = solveNullList(rightFuzzyConfirmor);
            return this;
        }

        public QueryBuilder confirmor(String confirmor){
            setConfirmor(confirmor);
            return this;
        }

        public QueryBuilder confirmorList(String ... confirmor){
            this.confirmorList = solveNullList(confirmor);
            return this;
        }

        public QueryBuilder confirmorList(List<String> confirmor){
            this.confirmorList = confirmor;
            return this;
        }

        public QueryBuilder fetchConfirmor(){
            setFetchFields("fetchFields","confirmor");
            return this;
        }

        public QueryBuilder excludeConfirmor(){
            setFetchFields("excludeFields","confirmor");
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

        public QueryBuilder fuzzyVeiSysDescription (List<String> fuzzyVeiSysDescription){
            this.fuzzyVeiSysDescription = fuzzyVeiSysDescription;
            return this;
        }

        public QueryBuilder fuzzyVeiSysDescription (String ... fuzzyVeiSysDescription){
            this.fuzzyVeiSysDescription = solveNullList(fuzzyVeiSysDescription);
            return this;
        }

        public QueryBuilder rightFuzzyVeiSysDescription (List<String> rightFuzzyVeiSysDescription){
            this.rightFuzzyVeiSysDescription = rightFuzzyVeiSysDescription;
            return this;
        }

        public QueryBuilder rightFuzzyVeiSysDescription (String ... rightFuzzyVeiSysDescription){
            this.rightFuzzyVeiSysDescription = solveNullList(rightFuzzyVeiSysDescription);
            return this;
        }

        public QueryBuilder veiSysDescription(String veiSysDescription){
            setVeiSysDescription(veiSysDescription);
            return this;
        }

        public QueryBuilder veiSysDescriptionList(String ... veiSysDescription){
            this.veiSysDescriptionList = solveNullList(veiSysDescription);
            return this;
        }

        public QueryBuilder veiSysDescriptionList(List<String> veiSysDescription){
            this.veiSysDescriptionList = veiSysDescription;
            return this;
        }

        public QueryBuilder fetchVeiSysDescription(){
            setFetchFields("fetchFields","veiSysDescription");
            return this;
        }

        public QueryBuilder excludeVeiSysDescription(){
            setFetchFields("excludeFields","veiSysDescription");
            return this;
        }

        public QueryBuilder fuzzyLicenseCode (List<String> fuzzyLicenseCode){
            this.fuzzyLicenseCode = fuzzyLicenseCode;
            return this;
        }

        public QueryBuilder fuzzyLicenseCode (String ... fuzzyLicenseCode){
            this.fuzzyLicenseCode = solveNullList(fuzzyLicenseCode);
            return this;
        }

        public QueryBuilder rightFuzzyLicenseCode (List<String> rightFuzzyLicenseCode){
            this.rightFuzzyLicenseCode = rightFuzzyLicenseCode;
            return this;
        }

        public QueryBuilder rightFuzzyLicenseCode (String ... rightFuzzyLicenseCode){
            this.rightFuzzyLicenseCode = solveNullList(rightFuzzyLicenseCode);
            return this;
        }

        public QueryBuilder licenseCode(String licenseCode){
            setLicenseCode(licenseCode);
            return this;
        }

        public QueryBuilder licenseCodeList(String ... licenseCode){
            this.licenseCodeList = solveNullList(licenseCode);
            return this;
        }

        public QueryBuilder licenseCodeList(List<String> licenseCode){
            this.licenseCodeList = licenseCode;
            return this;
        }

        public QueryBuilder fetchLicenseCode(){
            setFetchFields("fetchFields","licenseCode");
            return this;
        }

        public QueryBuilder excludeLicenseCode(){
            setFetchFields("excludeFields","licenseCode");
            return this;
        }

        public QueryBuilder fuzzyServicePerformance1 (List<String> fuzzyServicePerformance1){
            this.fuzzyServicePerformance1 = fuzzyServicePerformance1;
            return this;
        }

        public QueryBuilder fuzzyServicePerformance1 (String ... fuzzyServicePerformance1){
            this.fuzzyServicePerformance1 = solveNullList(fuzzyServicePerformance1);
            return this;
        }

        public QueryBuilder rightFuzzyServicePerformance1 (List<String> rightFuzzyServicePerformance1){
            this.rightFuzzyServicePerformance1 = rightFuzzyServicePerformance1;
            return this;
        }

        public QueryBuilder rightFuzzyServicePerformance1 (String ... rightFuzzyServicePerformance1){
            this.rightFuzzyServicePerformance1 = solveNullList(rightFuzzyServicePerformance1);
            return this;
        }

        public QueryBuilder servicePerformance1(String servicePerformance1){
            setServicePerformance1(servicePerformance1);
            return this;
        }

        public QueryBuilder servicePerformance1List(String ... servicePerformance1){
            this.servicePerformance1List = solveNullList(servicePerformance1);
            return this;
        }

        public QueryBuilder servicePerformance1List(List<String> servicePerformance1){
            this.servicePerformance1List = servicePerformance1;
            return this;
        }

        public QueryBuilder fetchServicePerformance1(){
            setFetchFields("fetchFields","servicePerformance1");
            return this;
        }

        public QueryBuilder excludeServicePerformance1(){
            setFetchFields("excludeFields","servicePerformance1");
            return this;
        }

        public QueryBuilder fuzzyServicePerformance2 (List<String> fuzzyServicePerformance2){
            this.fuzzyServicePerformance2 = fuzzyServicePerformance2;
            return this;
        }

        public QueryBuilder fuzzyServicePerformance2 (String ... fuzzyServicePerformance2){
            this.fuzzyServicePerformance2 = solveNullList(fuzzyServicePerformance2);
            return this;
        }

        public QueryBuilder rightFuzzyServicePerformance2 (List<String> rightFuzzyServicePerformance2){
            this.rightFuzzyServicePerformance2 = rightFuzzyServicePerformance2;
            return this;
        }

        public QueryBuilder rightFuzzyServicePerformance2 (String ... rightFuzzyServicePerformance2){
            this.rightFuzzyServicePerformance2 = solveNullList(rightFuzzyServicePerformance2);
            return this;
        }

        public QueryBuilder servicePerformance2(String servicePerformance2){
            setServicePerformance2(servicePerformance2);
            return this;
        }

        public QueryBuilder servicePerformance2List(String ... servicePerformance2){
            this.servicePerformance2List = solveNullList(servicePerformance2);
            return this;
        }

        public QueryBuilder servicePerformance2List(List<String> servicePerformance2){
            this.servicePerformance2List = servicePerformance2;
            return this;
        }

        public QueryBuilder fetchServicePerformance2(){
            setFetchFields("fetchFields","servicePerformance2");
            return this;
        }

        public QueryBuilder excludeServicePerformance2(){
            setFetchFields("excludeFields","servicePerformance2");
            return this;
        }

        public QueryBuilder fuzzyServicePerformance3 (List<String> fuzzyServicePerformance3){
            this.fuzzyServicePerformance3 = fuzzyServicePerformance3;
            return this;
        }

        public QueryBuilder fuzzyServicePerformance3 (String ... fuzzyServicePerformance3){
            this.fuzzyServicePerformance3 = solveNullList(fuzzyServicePerformance3);
            return this;
        }

        public QueryBuilder rightFuzzyServicePerformance3 (List<String> rightFuzzyServicePerformance3){
            this.rightFuzzyServicePerformance3 = rightFuzzyServicePerformance3;
            return this;
        }

        public QueryBuilder rightFuzzyServicePerformance3 (String ... rightFuzzyServicePerformance3){
            this.rightFuzzyServicePerformance3 = solveNullList(rightFuzzyServicePerformance3);
            return this;
        }

        public QueryBuilder servicePerformance3(String servicePerformance3){
            setServicePerformance3(servicePerformance3);
            return this;
        }

        public QueryBuilder servicePerformance3List(String ... servicePerformance3){
            this.servicePerformance3List = solveNullList(servicePerformance3);
            return this;
        }

        public QueryBuilder servicePerformance3List(List<String> servicePerformance3){
            this.servicePerformance3List = servicePerformance3;
            return this;
        }

        public QueryBuilder fetchServicePerformance3(){
            setFetchFields("fetchFields","servicePerformance3");
            return this;
        }

        public QueryBuilder excludeServicePerformance3(){
            setFetchFields("excludeFields","servicePerformance3");
            return this;
        }

        public QueryBuilder fuzzyModelYear (List<String> fuzzyModelYear){
            this.fuzzyModelYear = fuzzyModelYear;
            return this;
        }

        public QueryBuilder fuzzyModelYear (String ... fuzzyModelYear){
            this.fuzzyModelYear = solveNullList(fuzzyModelYear);
            return this;
        }

        public QueryBuilder rightFuzzyModelYear (List<String> rightFuzzyModelYear){
            this.rightFuzzyModelYear = rightFuzzyModelYear;
            return this;
        }

        public QueryBuilder rightFuzzyModelYear (String ... rightFuzzyModelYear){
            this.rightFuzzyModelYear = solveNullList(rightFuzzyModelYear);
            return this;
        }

        public QueryBuilder modelYear(String modelYear){
            setModelYear(modelYear);
            return this;
        }

        public QueryBuilder modelYearList(String ... modelYear){
            this.modelYearList = solveNullList(modelYear);
            return this;
        }

        public QueryBuilder modelYearList(List<String> modelYear){
            this.modelYearList = modelYear;
            return this;
        }

        public QueryBuilder fetchModelYear(){
            setFetchFields("fetchFields","modelYear");
            return this;
        }

        public QueryBuilder excludeModelYear(){
            setFetchFields("excludeFields","modelYear");
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

        public MqmsVoucherRaw build(){return this;}
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
        private List<String> veiStateList;

        public List<String> getVeiStateList(){return this.veiStateList;}


        private List<String> fuzzyVeiState;

        public List<String> getFuzzyVeiState(){return this.fuzzyVeiState;}

        private List<String> rightFuzzyVeiState;

        public List<String> getRightFuzzyVeiState(){return this.rightFuzzyVeiState;}
        private List<String> updateTimeList;

        public List<String> getUpdateTimeList(){return this.updateTimeList;}


        private List<String> fuzzyUpdateTime;

        public List<String> getFuzzyUpdateTime(){return this.fuzzyUpdateTime;}

        private List<String> rightFuzzyUpdateTime;

        public List<String> getRightFuzzyUpdateTime(){return this.rightFuzzyUpdateTime;}
        private List<String> maintenanceContractCodeList;

        public List<String> getMaintenanceContractCodeList(){return this.maintenanceContractCodeList;}


        private List<String> fuzzyMaintenanceContractCode;

        public List<String> getFuzzyMaintenanceContractCode(){return this.fuzzyMaintenanceContractCode;}

        private List<String> rightFuzzyMaintenanceContractCode;

        public List<String> getRightFuzzyMaintenanceContractCode(){return this.rightFuzzyMaintenanceContractCode;}
        private List<String> maintenanceItemCodeList;

        public List<String> getMaintenanceItemCodeList(){return this.maintenanceItemCodeList;}


        private List<String> fuzzyMaintenanceItemCode;

        public List<String> getFuzzyMaintenanceItemCode(){return this.fuzzyMaintenanceItemCode;}

        private List<String> rightFuzzyMaintenanceItemCode;

        public List<String> getRightFuzzyMaintenanceItemCode(){return this.rightFuzzyMaintenanceItemCode;}
        private List<String> contactList;

        public List<String> getContactList(){return this.contactList;}


        private List<String> fuzzyContact;

        public List<String> getFuzzyContact(){return this.fuzzyContact;}

        private List<String> rightFuzzyContact;

        public List<String> getRightFuzzyContact(){return this.rightFuzzyContact;}
        private List<String> phoneNoList;

        public List<String> getPhoneNoList(){return this.phoneNoList;}


        private List<String> fuzzyPhoneNo;

        public List<String> getFuzzyPhoneNo(){return this.fuzzyPhoneNo;}

        private List<String> rightFuzzyPhoneNo;

        public List<String> getRightFuzzyPhoneNo(){return this.rightFuzzyPhoneNo;}
        private List<String> faxList;

        public List<String> getFaxList(){return this.faxList;}


        private List<String> fuzzyFax;

        public List<String> getFuzzyFax(){return this.fuzzyFax;}

        private List<String> rightFuzzyFax;

        public List<String> getRightFuzzyFax(){return this.rightFuzzyFax;}
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
        private List<String> egtypeCodeList;

        public List<String> getEgtypeCodeList(){return this.egtypeCodeList;}


        private List<String> fuzzyEgtypeCode;

        public List<String> getFuzzyEgtypeCode(){return this.fuzzyEgtypeCode;}

        private List<String> rightFuzzyEgtypeCode;

        public List<String> getRightFuzzyEgtypeCode(){return this.rightFuzzyEgtypeCode;}
        private List<String> transmissionTypeList;

        public List<String> getTransmissionTypeList(){return this.transmissionTypeList;}


        private List<String> fuzzyTransmissionType;

        public List<String> getFuzzyTransmissionType(){return this.fuzzyTransmissionType;}

        private List<String> rightFuzzyTransmissionType;

        public List<String> getRightFuzzyTransmissionType(){return this.rightFuzzyTransmissionType;}
        private List<Integer> mileageList;

        public List<Integer> getMileageList(){return this.mileageList;}

        private Integer mileageSt;

        private Integer mileageEd;

        public Integer getMileageSt(){return this.mileageSt;}

        public Integer getMileageEd(){return this.mileageEd;}

        private List<String> transmissionCodeList;

        public List<String> getTransmissionCodeList(){return this.transmissionCodeList;}


        private List<String> fuzzyTransmissionCode;

        public List<String> getFuzzyTransmissionCode(){return this.fuzzyTransmissionCode;}

        private List<String> rightFuzzyTransmissionCode;

        public List<String> getRightFuzzyTransmissionCode(){return this.rightFuzzyTransmissionCode;}
        private List<String> mtocList;

        public List<String> getMtocList(){return this.mtocList;}


        private List<String> fuzzyMtoc;

        public List<String> getFuzzyMtoc(){return this.fuzzyMtoc;}

        private List<String> rightFuzzyMtoc;

        public List<String> getRightFuzzyMtoc(){return this.rightFuzzyMtoc;}
        private List<String> failureDateList;

        public List<String> getFailureDateList(){return this.failureDateList;}


        private List<String> fuzzyFailureDate;

        public List<String> getFuzzyFailureDate(){return this.fuzzyFailureDate;}

        private List<String> rightFuzzyFailureDate;

        public List<String> getRightFuzzyFailureDate(){return this.rightFuzzyFailureDate;}
        private List<String> failureLocationCodeList;

        public List<String> getFailureLocationCodeList(){return this.failureLocationCodeList;}


        private List<String> fuzzyFailureLocationCode;

        public List<String> getFuzzyFailureLocationCode(){return this.fuzzyFailureLocationCode;}

        private List<String> rightFuzzyFailureLocationCode;

        public List<String> getRightFuzzyFailureLocationCode(){return this.rightFuzzyFailureLocationCode;}
        private List<String> failureLocationNameList;

        public List<String> getFailureLocationNameList(){return this.failureLocationNameList;}


        private List<String> fuzzyFailureLocationName;

        public List<String> getFuzzyFailureLocationName(){return this.fuzzyFailureLocationName;}

        private List<String> rightFuzzyFailureLocationName;

        public List<String> getRightFuzzyFailureLocationName(){return this.rightFuzzyFailureLocationName;}
        private List<String> symptomTypeCodeList;

        public List<String> getSymptomTypeCodeList(){return this.symptomTypeCodeList;}


        private List<String> fuzzySymptomTypeCode;

        public List<String> getFuzzySymptomTypeCode(){return this.fuzzySymptomTypeCode;}

        private List<String> rightFuzzySymptomTypeCode;

        public List<String> getRightFuzzySymptomTypeCode(){return this.rightFuzzySymptomTypeCode;}
        private List<String> symptomTypeNameList;

        public List<String> getSymptomTypeNameList(){return this.symptomTypeNameList;}


        private List<String> fuzzySymptomTypeName;

        public List<String> getFuzzySymptomTypeName(){return this.fuzzySymptomTypeName;}

        private List<String> rightFuzzySymptomTypeName;

        public List<String> getRightFuzzySymptomTypeName(){return this.rightFuzzySymptomTypeName;}
        private List<String> symptomCodeList;

        public List<String> getSymptomCodeList(){return this.symptomCodeList;}


        private List<String> fuzzySymptomCode;

        public List<String> getFuzzySymptomCode(){return this.fuzzySymptomCode;}

        private List<String> rightFuzzySymptomCode;

        public List<String> getRightFuzzySymptomCode(){return this.rightFuzzySymptomCode;}
        private List<String> symptomNameList;

        public List<String> getSymptomNameList(){return this.symptomNameList;}


        private List<String> fuzzySymptomName;

        public List<String> getFuzzySymptomName(){return this.fuzzySymptomName;}

        private List<String> rightFuzzySymptomName;

        public List<String> getRightFuzzySymptomName(){return this.rightFuzzySymptomName;}
        private List<String> symptomContentList;

        public List<String> getSymptomContentList(){return this.symptomContentList;}


        private List<String> fuzzySymptomContent;

        public List<String> getFuzzySymptomContent(){return this.fuzzySymptomContent;}

        private List<String> rightFuzzySymptomContent;

        public List<String> getRightFuzzySymptomContent(){return this.rightFuzzySymptomContent;}
        private List<String> submitDateList;

        public List<String> getSubmitDateList(){return this.submitDateList;}


        private List<String> fuzzySubmitDate;

        public List<String> getFuzzySubmitDate(){return this.fuzzySubmitDate;}

        private List<String> rightFuzzySubmitDate;

        public List<String> getRightFuzzySubmitDate(){return this.rightFuzzySubmitDate;}
        private List<String> importantLevelList;

        public List<String> getImportantLevelList(){return this.importantLevelList;}


        private List<String> fuzzyImportantLevel;

        public List<String> getFuzzyImportantLevel(){return this.fuzzyImportantLevel;}

        private List<String> rightFuzzyImportantLevel;

        public List<String> getRightFuzzyImportantLevel(){return this.rightFuzzyImportantLevel;}
        private List<String> carTypeList;

        public List<String> getCarTypeList(){return this.carTypeList;}


        private List<String> fuzzyCarType;

        public List<String> getFuzzyCarType(){return this.fuzzyCarType;}

        private List<String> rightFuzzyCarType;

        public List<String> getRightFuzzyCarType(){return this.rightFuzzyCarType;}
        private List<String> diagnosticResultList;

        public List<String> getDiagnosticResultList(){return this.diagnosticResultList;}


        private List<String> fuzzyDiagnosticResult;

        public List<String> getFuzzyDiagnosticResult(){return this.fuzzyDiagnosticResult;}

        private List<String> rightFuzzyDiagnosticResult;

        public List<String> getRightFuzzyDiagnosticResult(){return this.rightFuzzyDiagnosticResult;}
        private List<String> veiUserDescriptionList;

        public List<String> getVeiUserDescriptionList(){return this.veiUserDescriptionList;}


        private List<String> fuzzyVeiUserDescription;

        public List<String> getFuzzyVeiUserDescription(){return this.fuzzyVeiUserDescription;}

        private List<String> rightFuzzyVeiUserDescription;

        public List<String> getRightFuzzyVeiUserDescription(){return this.rightFuzzyVeiUserDescription;}
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

        private List<String> confirmorList;

        public List<String> getConfirmorList(){return this.confirmorList;}


        private List<String> fuzzyConfirmor;

        public List<String> getFuzzyConfirmor(){return this.fuzzyConfirmor;}

        private List<String> rightFuzzyConfirmor;

        public List<String> getRightFuzzyConfirmor(){return this.rightFuzzyConfirmor;}
        private List<String> confirmDateList;

        public List<String> getConfirmDateList(){return this.confirmDateList;}


        private List<String> fuzzyConfirmDate;

        public List<String> getFuzzyConfirmDate(){return this.fuzzyConfirmDate;}

        private List<String> rightFuzzyConfirmDate;

        public List<String> getRightFuzzyConfirmDate(){return this.rightFuzzyConfirmDate;}
        private List<String> veiSysDescriptionList;

        public List<String> getVeiSysDescriptionList(){return this.veiSysDescriptionList;}


        private List<String> fuzzyVeiSysDescription;

        public List<String> getFuzzyVeiSysDescription(){return this.fuzzyVeiSysDescription;}

        private List<String> rightFuzzyVeiSysDescription;

        public List<String> getRightFuzzyVeiSysDescription(){return this.rightFuzzyVeiSysDescription;}
        private List<String> licenseCodeList;

        public List<String> getLicenseCodeList(){return this.licenseCodeList;}


        private List<String> fuzzyLicenseCode;

        public List<String> getFuzzyLicenseCode(){return this.fuzzyLicenseCode;}

        private List<String> rightFuzzyLicenseCode;

        public List<String> getRightFuzzyLicenseCode(){return this.rightFuzzyLicenseCode;}
        private List<String> servicePerformance1List;

        public List<String> getServicePerformance1List(){return this.servicePerformance1List;}


        private List<String> fuzzyServicePerformance1;

        public List<String> getFuzzyServicePerformance1(){return this.fuzzyServicePerformance1;}

        private List<String> rightFuzzyServicePerformance1;

        public List<String> getRightFuzzyServicePerformance1(){return this.rightFuzzyServicePerformance1;}
        private List<String> servicePerformance2List;

        public List<String> getServicePerformance2List(){return this.servicePerformance2List;}


        private List<String> fuzzyServicePerformance2;

        public List<String> getFuzzyServicePerformance2(){return this.fuzzyServicePerformance2;}

        private List<String> rightFuzzyServicePerformance2;

        public List<String> getRightFuzzyServicePerformance2(){return this.rightFuzzyServicePerformance2;}
        private List<String> servicePerformance3List;

        public List<String> getServicePerformance3List(){return this.servicePerformance3List;}


        private List<String> fuzzyServicePerformance3;

        public List<String> getFuzzyServicePerformance3(){return this.fuzzyServicePerformance3;}

        private List<String> rightFuzzyServicePerformance3;

        public List<String> getRightFuzzyServicePerformance3(){return this.rightFuzzyServicePerformance3;}
        private List<String> modelYearList;

        public List<String> getModelYearList(){return this.modelYearList;}


        private List<String> fuzzyModelYear;

        public List<String> getFuzzyModelYear(){return this.fuzzyModelYear;}

        private List<String> rightFuzzyModelYear;

        public List<String> getRightFuzzyModelYear(){return this.rightFuzzyModelYear;}
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

        public ConditionBuilder fuzzyVeiState (List<String> fuzzyVeiState){
            this.fuzzyVeiState = fuzzyVeiState;
            return this;
        }

        public ConditionBuilder fuzzyVeiState (String ... fuzzyVeiState){
            this.fuzzyVeiState = solveNullList(fuzzyVeiState);
            return this;
        }

        public ConditionBuilder rightFuzzyVeiState (List<String> rightFuzzyVeiState){
            this.rightFuzzyVeiState = rightFuzzyVeiState;
            return this;
        }

        public ConditionBuilder rightFuzzyVeiState (String ... rightFuzzyVeiState){
            this.rightFuzzyVeiState = solveNullList(rightFuzzyVeiState);
            return this;
        }

        public ConditionBuilder veiStateList(String ... veiState){
            this.veiStateList = solveNullList(veiState);
            return this;
        }

        public ConditionBuilder veiStateList(List<String> veiState){
            this.veiStateList = veiState;
            return this;
        }

        public ConditionBuilder fuzzyUpdateTime (List<String> fuzzyUpdateTime){
            this.fuzzyUpdateTime = fuzzyUpdateTime;
            return this;
        }

        public ConditionBuilder fuzzyUpdateTime (String ... fuzzyUpdateTime){
            this.fuzzyUpdateTime = solveNullList(fuzzyUpdateTime);
            return this;
        }

        public ConditionBuilder rightFuzzyUpdateTime (List<String> rightFuzzyUpdateTime){
            this.rightFuzzyUpdateTime = rightFuzzyUpdateTime;
            return this;
        }

        public ConditionBuilder rightFuzzyUpdateTime (String ... rightFuzzyUpdateTime){
            this.rightFuzzyUpdateTime = solveNullList(rightFuzzyUpdateTime);
            return this;
        }

        public ConditionBuilder updateTimeList(String ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public ConditionBuilder updateTimeList(List<String> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public ConditionBuilder fuzzyMaintenanceContractCode (List<String> fuzzyMaintenanceContractCode){
            this.fuzzyMaintenanceContractCode = fuzzyMaintenanceContractCode;
            return this;
        }

        public ConditionBuilder fuzzyMaintenanceContractCode (String ... fuzzyMaintenanceContractCode){
            this.fuzzyMaintenanceContractCode = solveNullList(fuzzyMaintenanceContractCode);
            return this;
        }

        public ConditionBuilder rightFuzzyMaintenanceContractCode (List<String> rightFuzzyMaintenanceContractCode){
            this.rightFuzzyMaintenanceContractCode = rightFuzzyMaintenanceContractCode;
            return this;
        }

        public ConditionBuilder rightFuzzyMaintenanceContractCode (String ... rightFuzzyMaintenanceContractCode){
            this.rightFuzzyMaintenanceContractCode = solveNullList(rightFuzzyMaintenanceContractCode);
            return this;
        }

        public ConditionBuilder maintenanceContractCodeList(String ... maintenanceContractCode){
            this.maintenanceContractCodeList = solveNullList(maintenanceContractCode);
            return this;
        }

        public ConditionBuilder maintenanceContractCodeList(List<String> maintenanceContractCode){
            this.maintenanceContractCodeList = maintenanceContractCode;
            return this;
        }

        public ConditionBuilder fuzzyMaintenanceItemCode (List<String> fuzzyMaintenanceItemCode){
            this.fuzzyMaintenanceItemCode = fuzzyMaintenanceItemCode;
            return this;
        }

        public ConditionBuilder fuzzyMaintenanceItemCode (String ... fuzzyMaintenanceItemCode){
            this.fuzzyMaintenanceItemCode = solveNullList(fuzzyMaintenanceItemCode);
            return this;
        }

        public ConditionBuilder rightFuzzyMaintenanceItemCode (List<String> rightFuzzyMaintenanceItemCode){
            this.rightFuzzyMaintenanceItemCode = rightFuzzyMaintenanceItemCode;
            return this;
        }

        public ConditionBuilder rightFuzzyMaintenanceItemCode (String ... rightFuzzyMaintenanceItemCode){
            this.rightFuzzyMaintenanceItemCode = solveNullList(rightFuzzyMaintenanceItemCode);
            return this;
        }

        public ConditionBuilder maintenanceItemCodeList(String ... maintenanceItemCode){
            this.maintenanceItemCodeList = solveNullList(maintenanceItemCode);
            return this;
        }

        public ConditionBuilder maintenanceItemCodeList(List<String> maintenanceItemCode){
            this.maintenanceItemCodeList = maintenanceItemCode;
            return this;
        }

        public ConditionBuilder fuzzyContact (List<String> fuzzyContact){
            this.fuzzyContact = fuzzyContact;
            return this;
        }

        public ConditionBuilder fuzzyContact (String ... fuzzyContact){
            this.fuzzyContact = solveNullList(fuzzyContact);
            return this;
        }

        public ConditionBuilder rightFuzzyContact (List<String> rightFuzzyContact){
            this.rightFuzzyContact = rightFuzzyContact;
            return this;
        }

        public ConditionBuilder rightFuzzyContact (String ... rightFuzzyContact){
            this.rightFuzzyContact = solveNullList(rightFuzzyContact);
            return this;
        }

        public ConditionBuilder contactList(String ... contact){
            this.contactList = solveNullList(contact);
            return this;
        }

        public ConditionBuilder contactList(List<String> contact){
            this.contactList = contact;
            return this;
        }

        public ConditionBuilder fuzzyPhoneNo (List<String> fuzzyPhoneNo){
            this.fuzzyPhoneNo = fuzzyPhoneNo;
            return this;
        }

        public ConditionBuilder fuzzyPhoneNo (String ... fuzzyPhoneNo){
            this.fuzzyPhoneNo = solveNullList(fuzzyPhoneNo);
            return this;
        }

        public ConditionBuilder rightFuzzyPhoneNo (List<String> rightFuzzyPhoneNo){
            this.rightFuzzyPhoneNo = rightFuzzyPhoneNo;
            return this;
        }

        public ConditionBuilder rightFuzzyPhoneNo (String ... rightFuzzyPhoneNo){
            this.rightFuzzyPhoneNo = solveNullList(rightFuzzyPhoneNo);
            return this;
        }

        public ConditionBuilder phoneNoList(String ... phoneNo){
            this.phoneNoList = solveNullList(phoneNo);
            return this;
        }

        public ConditionBuilder phoneNoList(List<String> phoneNo){
            this.phoneNoList = phoneNo;
            return this;
        }

        public ConditionBuilder fuzzyFax (List<String> fuzzyFax){
            this.fuzzyFax = fuzzyFax;
            return this;
        }

        public ConditionBuilder fuzzyFax (String ... fuzzyFax){
            this.fuzzyFax = solveNullList(fuzzyFax);
            return this;
        }

        public ConditionBuilder rightFuzzyFax (List<String> rightFuzzyFax){
            this.rightFuzzyFax = rightFuzzyFax;
            return this;
        }

        public ConditionBuilder rightFuzzyFax (String ... rightFuzzyFax){
            this.rightFuzzyFax = solveNullList(rightFuzzyFax);
            return this;
        }

        public ConditionBuilder faxList(String ... fax){
            this.faxList = solveNullList(fax);
            return this;
        }

        public ConditionBuilder faxList(List<String> fax){
            this.faxList = fax;
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

        public ConditionBuilder fuzzyMtoc (List<String> fuzzyMtoc){
            this.fuzzyMtoc = fuzzyMtoc;
            return this;
        }

        public ConditionBuilder fuzzyMtoc (String ... fuzzyMtoc){
            this.fuzzyMtoc = solveNullList(fuzzyMtoc);
            return this;
        }

        public ConditionBuilder rightFuzzyMtoc (List<String> rightFuzzyMtoc){
            this.rightFuzzyMtoc = rightFuzzyMtoc;
            return this;
        }

        public ConditionBuilder rightFuzzyMtoc (String ... rightFuzzyMtoc){
            this.rightFuzzyMtoc = solveNullList(rightFuzzyMtoc);
            return this;
        }

        public ConditionBuilder mtocList(String ... mtoc){
            this.mtocList = solveNullList(mtoc);
            return this;
        }

        public ConditionBuilder mtocList(List<String> mtoc){
            this.mtocList = mtoc;
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

        public ConditionBuilder fuzzyFailureLocationCode (List<String> fuzzyFailureLocationCode){
            this.fuzzyFailureLocationCode = fuzzyFailureLocationCode;
            return this;
        }

        public ConditionBuilder fuzzyFailureLocationCode (String ... fuzzyFailureLocationCode){
            this.fuzzyFailureLocationCode = solveNullList(fuzzyFailureLocationCode);
            return this;
        }

        public ConditionBuilder rightFuzzyFailureLocationCode (List<String> rightFuzzyFailureLocationCode){
            this.rightFuzzyFailureLocationCode = rightFuzzyFailureLocationCode;
            return this;
        }

        public ConditionBuilder rightFuzzyFailureLocationCode (String ... rightFuzzyFailureLocationCode){
            this.rightFuzzyFailureLocationCode = solveNullList(rightFuzzyFailureLocationCode);
            return this;
        }

        public ConditionBuilder failureLocationCodeList(String ... failureLocationCode){
            this.failureLocationCodeList = solveNullList(failureLocationCode);
            return this;
        }

        public ConditionBuilder failureLocationCodeList(List<String> failureLocationCode){
            this.failureLocationCodeList = failureLocationCode;
            return this;
        }

        public ConditionBuilder fuzzyFailureLocationName (List<String> fuzzyFailureLocationName){
            this.fuzzyFailureLocationName = fuzzyFailureLocationName;
            return this;
        }

        public ConditionBuilder fuzzyFailureLocationName (String ... fuzzyFailureLocationName){
            this.fuzzyFailureLocationName = solveNullList(fuzzyFailureLocationName);
            return this;
        }

        public ConditionBuilder rightFuzzyFailureLocationName (List<String> rightFuzzyFailureLocationName){
            this.rightFuzzyFailureLocationName = rightFuzzyFailureLocationName;
            return this;
        }

        public ConditionBuilder rightFuzzyFailureLocationName (String ... rightFuzzyFailureLocationName){
            this.rightFuzzyFailureLocationName = solveNullList(rightFuzzyFailureLocationName);
            return this;
        }

        public ConditionBuilder failureLocationNameList(String ... failureLocationName){
            this.failureLocationNameList = solveNullList(failureLocationName);
            return this;
        }

        public ConditionBuilder failureLocationNameList(List<String> failureLocationName){
            this.failureLocationNameList = failureLocationName;
            return this;
        }

        public ConditionBuilder fuzzySymptomTypeCode (List<String> fuzzySymptomTypeCode){
            this.fuzzySymptomTypeCode = fuzzySymptomTypeCode;
            return this;
        }

        public ConditionBuilder fuzzySymptomTypeCode (String ... fuzzySymptomTypeCode){
            this.fuzzySymptomTypeCode = solveNullList(fuzzySymptomTypeCode);
            return this;
        }

        public ConditionBuilder rightFuzzySymptomTypeCode (List<String> rightFuzzySymptomTypeCode){
            this.rightFuzzySymptomTypeCode = rightFuzzySymptomTypeCode;
            return this;
        }

        public ConditionBuilder rightFuzzySymptomTypeCode (String ... rightFuzzySymptomTypeCode){
            this.rightFuzzySymptomTypeCode = solveNullList(rightFuzzySymptomTypeCode);
            return this;
        }

        public ConditionBuilder symptomTypeCodeList(String ... symptomTypeCode){
            this.symptomTypeCodeList = solveNullList(symptomTypeCode);
            return this;
        }

        public ConditionBuilder symptomTypeCodeList(List<String> symptomTypeCode){
            this.symptomTypeCodeList = symptomTypeCode;
            return this;
        }

        public ConditionBuilder fuzzySymptomTypeName (List<String> fuzzySymptomTypeName){
            this.fuzzySymptomTypeName = fuzzySymptomTypeName;
            return this;
        }

        public ConditionBuilder fuzzySymptomTypeName (String ... fuzzySymptomTypeName){
            this.fuzzySymptomTypeName = solveNullList(fuzzySymptomTypeName);
            return this;
        }

        public ConditionBuilder rightFuzzySymptomTypeName (List<String> rightFuzzySymptomTypeName){
            this.rightFuzzySymptomTypeName = rightFuzzySymptomTypeName;
            return this;
        }

        public ConditionBuilder rightFuzzySymptomTypeName (String ... rightFuzzySymptomTypeName){
            this.rightFuzzySymptomTypeName = solveNullList(rightFuzzySymptomTypeName);
            return this;
        }

        public ConditionBuilder symptomTypeNameList(String ... symptomTypeName){
            this.symptomTypeNameList = solveNullList(symptomTypeName);
            return this;
        }

        public ConditionBuilder symptomTypeNameList(List<String> symptomTypeName){
            this.symptomTypeNameList = symptomTypeName;
            return this;
        }

        public ConditionBuilder fuzzySymptomCode (List<String> fuzzySymptomCode){
            this.fuzzySymptomCode = fuzzySymptomCode;
            return this;
        }

        public ConditionBuilder fuzzySymptomCode (String ... fuzzySymptomCode){
            this.fuzzySymptomCode = solveNullList(fuzzySymptomCode);
            return this;
        }

        public ConditionBuilder rightFuzzySymptomCode (List<String> rightFuzzySymptomCode){
            this.rightFuzzySymptomCode = rightFuzzySymptomCode;
            return this;
        }

        public ConditionBuilder rightFuzzySymptomCode (String ... rightFuzzySymptomCode){
            this.rightFuzzySymptomCode = solveNullList(rightFuzzySymptomCode);
            return this;
        }

        public ConditionBuilder symptomCodeList(String ... symptomCode){
            this.symptomCodeList = solveNullList(symptomCode);
            return this;
        }

        public ConditionBuilder symptomCodeList(List<String> symptomCode){
            this.symptomCodeList = symptomCode;
            return this;
        }

        public ConditionBuilder fuzzySymptomName (List<String> fuzzySymptomName){
            this.fuzzySymptomName = fuzzySymptomName;
            return this;
        }

        public ConditionBuilder fuzzySymptomName (String ... fuzzySymptomName){
            this.fuzzySymptomName = solveNullList(fuzzySymptomName);
            return this;
        }

        public ConditionBuilder rightFuzzySymptomName (List<String> rightFuzzySymptomName){
            this.rightFuzzySymptomName = rightFuzzySymptomName;
            return this;
        }

        public ConditionBuilder rightFuzzySymptomName (String ... rightFuzzySymptomName){
            this.rightFuzzySymptomName = solveNullList(rightFuzzySymptomName);
            return this;
        }

        public ConditionBuilder symptomNameList(String ... symptomName){
            this.symptomNameList = solveNullList(symptomName);
            return this;
        }

        public ConditionBuilder symptomNameList(List<String> symptomName){
            this.symptomNameList = symptomName;
            return this;
        }

        public ConditionBuilder fuzzySymptomContent (List<String> fuzzySymptomContent){
            this.fuzzySymptomContent = fuzzySymptomContent;
            return this;
        }

        public ConditionBuilder fuzzySymptomContent (String ... fuzzySymptomContent){
            this.fuzzySymptomContent = solveNullList(fuzzySymptomContent);
            return this;
        }

        public ConditionBuilder rightFuzzySymptomContent (List<String> rightFuzzySymptomContent){
            this.rightFuzzySymptomContent = rightFuzzySymptomContent;
            return this;
        }

        public ConditionBuilder rightFuzzySymptomContent (String ... rightFuzzySymptomContent){
            this.rightFuzzySymptomContent = solveNullList(rightFuzzySymptomContent);
            return this;
        }

        public ConditionBuilder symptomContentList(String ... symptomContent){
            this.symptomContentList = solveNullList(symptomContent);
            return this;
        }

        public ConditionBuilder symptomContentList(List<String> symptomContent){
            this.symptomContentList = symptomContent;
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

        public ConditionBuilder fuzzyCarType (List<String> fuzzyCarType){
            this.fuzzyCarType = fuzzyCarType;
            return this;
        }

        public ConditionBuilder fuzzyCarType (String ... fuzzyCarType){
            this.fuzzyCarType = solveNullList(fuzzyCarType);
            return this;
        }

        public ConditionBuilder rightFuzzyCarType (List<String> rightFuzzyCarType){
            this.rightFuzzyCarType = rightFuzzyCarType;
            return this;
        }

        public ConditionBuilder rightFuzzyCarType (String ... rightFuzzyCarType){
            this.rightFuzzyCarType = solveNullList(rightFuzzyCarType);
            return this;
        }

        public ConditionBuilder carTypeList(String ... carType){
            this.carTypeList = solveNullList(carType);
            return this;
        }

        public ConditionBuilder carTypeList(List<String> carType){
            this.carTypeList = carType;
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

        public ConditionBuilder fuzzyVeiUserDescription (List<String> fuzzyVeiUserDescription){
            this.fuzzyVeiUserDescription = fuzzyVeiUserDescription;
            return this;
        }

        public ConditionBuilder fuzzyVeiUserDescription (String ... fuzzyVeiUserDescription){
            this.fuzzyVeiUserDescription = solveNullList(fuzzyVeiUserDescription);
            return this;
        }

        public ConditionBuilder rightFuzzyVeiUserDescription (List<String> rightFuzzyVeiUserDescription){
            this.rightFuzzyVeiUserDescription = rightFuzzyVeiUserDescription;
            return this;
        }

        public ConditionBuilder rightFuzzyVeiUserDescription (String ... rightFuzzyVeiUserDescription){
            this.rightFuzzyVeiUserDescription = solveNullList(rightFuzzyVeiUserDescription);
            return this;
        }

        public ConditionBuilder veiUserDescriptionList(String ... veiUserDescription){
            this.veiUserDescriptionList = solveNullList(veiUserDescription);
            return this;
        }

        public ConditionBuilder veiUserDescriptionList(List<String> veiUserDescription){
            this.veiUserDescriptionList = veiUserDescription;
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

        public ConditionBuilder fuzzyConfirmor (List<String> fuzzyConfirmor){
            this.fuzzyConfirmor = fuzzyConfirmor;
            return this;
        }

        public ConditionBuilder fuzzyConfirmor (String ... fuzzyConfirmor){
            this.fuzzyConfirmor = solveNullList(fuzzyConfirmor);
            return this;
        }

        public ConditionBuilder rightFuzzyConfirmor (List<String> rightFuzzyConfirmor){
            this.rightFuzzyConfirmor = rightFuzzyConfirmor;
            return this;
        }

        public ConditionBuilder rightFuzzyConfirmor (String ... rightFuzzyConfirmor){
            this.rightFuzzyConfirmor = solveNullList(rightFuzzyConfirmor);
            return this;
        }

        public ConditionBuilder confirmorList(String ... confirmor){
            this.confirmorList = solveNullList(confirmor);
            return this;
        }

        public ConditionBuilder confirmorList(List<String> confirmor){
            this.confirmorList = confirmor;
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

        public ConditionBuilder fuzzyVeiSysDescription (List<String> fuzzyVeiSysDescription){
            this.fuzzyVeiSysDescription = fuzzyVeiSysDescription;
            return this;
        }

        public ConditionBuilder fuzzyVeiSysDescription (String ... fuzzyVeiSysDescription){
            this.fuzzyVeiSysDescription = solveNullList(fuzzyVeiSysDescription);
            return this;
        }

        public ConditionBuilder rightFuzzyVeiSysDescription (List<String> rightFuzzyVeiSysDescription){
            this.rightFuzzyVeiSysDescription = rightFuzzyVeiSysDescription;
            return this;
        }

        public ConditionBuilder rightFuzzyVeiSysDescription (String ... rightFuzzyVeiSysDescription){
            this.rightFuzzyVeiSysDescription = solveNullList(rightFuzzyVeiSysDescription);
            return this;
        }

        public ConditionBuilder veiSysDescriptionList(String ... veiSysDescription){
            this.veiSysDescriptionList = solveNullList(veiSysDescription);
            return this;
        }

        public ConditionBuilder veiSysDescriptionList(List<String> veiSysDescription){
            this.veiSysDescriptionList = veiSysDescription;
            return this;
        }

        public ConditionBuilder fuzzyLicenseCode (List<String> fuzzyLicenseCode){
            this.fuzzyLicenseCode = fuzzyLicenseCode;
            return this;
        }

        public ConditionBuilder fuzzyLicenseCode (String ... fuzzyLicenseCode){
            this.fuzzyLicenseCode = solveNullList(fuzzyLicenseCode);
            return this;
        }

        public ConditionBuilder rightFuzzyLicenseCode (List<String> rightFuzzyLicenseCode){
            this.rightFuzzyLicenseCode = rightFuzzyLicenseCode;
            return this;
        }

        public ConditionBuilder rightFuzzyLicenseCode (String ... rightFuzzyLicenseCode){
            this.rightFuzzyLicenseCode = solveNullList(rightFuzzyLicenseCode);
            return this;
        }

        public ConditionBuilder licenseCodeList(String ... licenseCode){
            this.licenseCodeList = solveNullList(licenseCode);
            return this;
        }

        public ConditionBuilder licenseCodeList(List<String> licenseCode){
            this.licenseCodeList = licenseCode;
            return this;
        }

        public ConditionBuilder fuzzyServicePerformance1 (List<String> fuzzyServicePerformance1){
            this.fuzzyServicePerformance1 = fuzzyServicePerformance1;
            return this;
        }

        public ConditionBuilder fuzzyServicePerformance1 (String ... fuzzyServicePerformance1){
            this.fuzzyServicePerformance1 = solveNullList(fuzzyServicePerformance1);
            return this;
        }

        public ConditionBuilder rightFuzzyServicePerformance1 (List<String> rightFuzzyServicePerformance1){
            this.rightFuzzyServicePerformance1 = rightFuzzyServicePerformance1;
            return this;
        }

        public ConditionBuilder rightFuzzyServicePerformance1 (String ... rightFuzzyServicePerformance1){
            this.rightFuzzyServicePerformance1 = solveNullList(rightFuzzyServicePerformance1);
            return this;
        }

        public ConditionBuilder servicePerformance1List(String ... servicePerformance1){
            this.servicePerformance1List = solveNullList(servicePerformance1);
            return this;
        }

        public ConditionBuilder servicePerformance1List(List<String> servicePerformance1){
            this.servicePerformance1List = servicePerformance1;
            return this;
        }

        public ConditionBuilder fuzzyServicePerformance2 (List<String> fuzzyServicePerformance2){
            this.fuzzyServicePerformance2 = fuzzyServicePerformance2;
            return this;
        }

        public ConditionBuilder fuzzyServicePerformance2 (String ... fuzzyServicePerformance2){
            this.fuzzyServicePerformance2 = solveNullList(fuzzyServicePerformance2);
            return this;
        }

        public ConditionBuilder rightFuzzyServicePerformance2 (List<String> rightFuzzyServicePerformance2){
            this.rightFuzzyServicePerformance2 = rightFuzzyServicePerformance2;
            return this;
        }

        public ConditionBuilder rightFuzzyServicePerformance2 (String ... rightFuzzyServicePerformance2){
            this.rightFuzzyServicePerformance2 = solveNullList(rightFuzzyServicePerformance2);
            return this;
        }

        public ConditionBuilder servicePerformance2List(String ... servicePerformance2){
            this.servicePerformance2List = solveNullList(servicePerformance2);
            return this;
        }

        public ConditionBuilder servicePerformance2List(List<String> servicePerformance2){
            this.servicePerformance2List = servicePerformance2;
            return this;
        }

        public ConditionBuilder fuzzyServicePerformance3 (List<String> fuzzyServicePerformance3){
            this.fuzzyServicePerformance3 = fuzzyServicePerformance3;
            return this;
        }

        public ConditionBuilder fuzzyServicePerformance3 (String ... fuzzyServicePerformance3){
            this.fuzzyServicePerformance3 = solveNullList(fuzzyServicePerformance3);
            return this;
        }

        public ConditionBuilder rightFuzzyServicePerformance3 (List<String> rightFuzzyServicePerformance3){
            this.rightFuzzyServicePerformance3 = rightFuzzyServicePerformance3;
            return this;
        }

        public ConditionBuilder rightFuzzyServicePerformance3 (String ... rightFuzzyServicePerformance3){
            this.rightFuzzyServicePerformance3 = solveNullList(rightFuzzyServicePerformance3);
            return this;
        }

        public ConditionBuilder servicePerformance3List(String ... servicePerformance3){
            this.servicePerformance3List = solveNullList(servicePerformance3);
            return this;
        }

        public ConditionBuilder servicePerformance3List(List<String> servicePerformance3){
            this.servicePerformance3List = servicePerformance3;
            return this;
        }

        public ConditionBuilder fuzzyModelYear (List<String> fuzzyModelYear){
            this.fuzzyModelYear = fuzzyModelYear;
            return this;
        }

        public ConditionBuilder fuzzyModelYear (String ... fuzzyModelYear){
            this.fuzzyModelYear = solveNullList(fuzzyModelYear);
            return this;
        }

        public ConditionBuilder rightFuzzyModelYear (List<String> rightFuzzyModelYear){
            this.rightFuzzyModelYear = rightFuzzyModelYear;
            return this;
        }

        public ConditionBuilder rightFuzzyModelYear (String ... rightFuzzyModelYear){
            this.rightFuzzyModelYear = solveNullList(rightFuzzyModelYear);
            return this;
        }

        public ConditionBuilder modelYearList(String ... modelYear){
            this.modelYearList = solveNullList(modelYear);
            return this;
        }

        public ConditionBuilder modelYearList(List<String> modelYear){
            this.modelYearList = modelYear;
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

        private MqmsVoucherRaw obj;

        public Builder(){
            this.obj = new MqmsVoucherRaw();
        }

        public Builder voucherId(Integer voucherId){
            this.obj.setVoucherId(voucherId);
            return this;
        }
        public Builder voucherCode(String voucherCode){
            this.obj.setVoucherCode(voucherCode);
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
        public Builder veiState(String veiState){
            this.obj.setVeiState(veiState);
            return this;
        }
        public Builder updateTime(String updateTime){
            this.obj.setUpdateTime(updateTime);
            return this;
        }
        public Builder maintenanceContractCode(String maintenanceContractCode){
            this.obj.setMaintenanceContractCode(maintenanceContractCode);
            return this;
        }
        public Builder maintenanceItemCode(String maintenanceItemCode){
            this.obj.setMaintenanceItemCode(maintenanceItemCode);
            return this;
        }
        public Builder contact(String contact){
            this.obj.setContact(contact);
            return this;
        }
        public Builder phoneNo(String phoneNo){
            this.obj.setPhoneNo(phoneNo);
            return this;
        }
        public Builder fax(String fax){
            this.obj.setFax(fax);
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
        public Builder egtypeCode(String egtypeCode){
            this.obj.setEgtypeCode(egtypeCode);
            return this;
        }
        public Builder transmissionType(String transmissionType){
            this.obj.setTransmissionType(transmissionType);
            return this;
        }
        public Builder mileage(Integer mileage){
            this.obj.setMileage(mileage);
            return this;
        }
        public Builder transmissionCode(String transmissionCode){
            this.obj.setTransmissionCode(transmissionCode);
            return this;
        }
        public Builder mtoc(String mtoc){
            this.obj.setMtoc(mtoc);
            return this;
        }
        public Builder failureDate(String failureDate){
            this.obj.setFailureDate(failureDate);
            return this;
        }
        public Builder failureLocationCode(String failureLocationCode){
            this.obj.setFailureLocationCode(failureLocationCode);
            return this;
        }
        public Builder failureLocationName(String failureLocationName){
            this.obj.setFailureLocationName(failureLocationName);
            return this;
        }
        public Builder symptomTypeCode(String symptomTypeCode){
            this.obj.setSymptomTypeCode(symptomTypeCode);
            return this;
        }
        public Builder symptomTypeName(String symptomTypeName){
            this.obj.setSymptomTypeName(symptomTypeName);
            return this;
        }
        public Builder symptomCode(String symptomCode){
            this.obj.setSymptomCode(symptomCode);
            return this;
        }
        public Builder symptomName(String symptomName){
            this.obj.setSymptomName(symptomName);
            return this;
        }
        public Builder symptomContent(String symptomContent){
            this.obj.setSymptomContent(symptomContent);
            return this;
        }
        public Builder submitDate(String submitDate){
            this.obj.setSubmitDate(submitDate);
            return this;
        }
        public Builder importantLevel(String importantLevel){
            this.obj.setImportantLevel(importantLevel);
            return this;
        }
        public Builder carType(String carType){
            this.obj.setCarType(carType);
            return this;
        }
        public Builder diagnosticResult(String diagnosticResult){
            this.obj.setDiagnosticResult(diagnosticResult);
            return this;
        }
        public Builder veiUserDescription(String veiUserDescription){
            this.obj.setVeiUserDescription(veiUserDescription);
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
        public Builder manCost(java.math.BigDecimal manCost){
            this.obj.setManCost(manCost);
            return this;
        }
        public Builder materialCost(java.math.BigDecimal materialCost){
            this.obj.setMaterialCost(materialCost);
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
        public Builder confirmor(String confirmor){
            this.obj.setConfirmor(confirmor);
            return this;
        }
        public Builder confirmDate(String confirmDate){
            this.obj.setConfirmDate(confirmDate);
            return this;
        }
        public Builder veiSysDescription(String veiSysDescription){
            this.obj.setVeiSysDescription(veiSysDescription);
            return this;
        }
        public Builder licenseCode(String licenseCode){
            this.obj.setLicenseCode(licenseCode);
            return this;
        }
        public Builder servicePerformance1(String servicePerformance1){
            this.obj.setServicePerformance1(servicePerformance1);
            return this;
        }
        public Builder servicePerformance2(String servicePerformance2){
            this.obj.setServicePerformance2(servicePerformance2);
            return this;
        }
        public Builder servicePerformance3(String servicePerformance3){
            this.obj.setServicePerformance3(servicePerformance3);
            return this;
        }
        public Builder modelYear(String modelYear){
            this.obj.setModelYear(modelYear);
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
        public MqmsVoucherRaw build(){return obj;}
    }

}
