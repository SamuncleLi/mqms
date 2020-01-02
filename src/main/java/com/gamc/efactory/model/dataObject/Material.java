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
public class Material implements Serializable {

    private static final long serialVersionUID = 1567741801417L;


    /**
    * 主键
    * 物料ID
    * isNullAble:0
    */
    private Long materialId;

    /**
    * 物料编号
    * isNullAble:1,defaultVal:
    */
    private String materialCode;

    /**
    * 物料名称
    * isNullAble:1,defaultVal:
    */
    private String materialName;

    /**
    * 规格
    * isNullAble:1,defaultVal:
    */
    private String materialSpecs;

    /**
    * 单位
    * isNullAble:1,defaultVal:
    */
    private String materialUnit;

    /**
    * 供应商代码
    * isNullAble:1,defaultVal:
    */
    private String supplierCode;

    /**
    * 供应商名称
    * isNullAble:1,defaultVal:
    */
    private String supplierName;

    /**
    * 最少订购数
    * isNullAble:1,defaultVal:
    */
    private String materialOrderMinNum;

    /**
    * 交货周期
    * isNullAble:1,defaultVal:
    */
    private String materialLeadTime;

    /**
    * 仓库代码
    * isNullAble:1,defaultVal:
    */
    private String warehouseCode;

    /**
    * 货架号
    * isNullAble:1,defaultVal:
    */
    private String shelfCode;

    /**
    * 包装规格
    * isNullAble:1,defaultVal:
    */
    private String packageSpecs;

    /**
    * 最初申请部门
    * isNullAble:1,defaultVal:
    */
    private String initialDepartment;

    /**
    * 物料信号
    * isNullAble:1,defaultVal:
    */
    private String materialSignal;

    /**
    * 现有库存
    * isNullAble:1
    */
    private java.math.BigDecimal stockNumNow;

    /**
    * 最后更新
    * isNullAble:1,defaultVal:
    */
    private String lastUpdated;

    /**
    * 固定库存
    * isNullAble:1
    */
    private java.math.BigDecimal stockNumStatic;

    /**
    * 最大库存
    * isNullAble:1
    */
    private java.math.BigDecimal stockNumMax;

    /**
    * 安全库存
    * isNullAble:1
    */
    private java.math.BigDecimal stockNumSafe;

    /**
    * 类别
    * isNullAble:1,defaultVal:
    */
    private String materialType;

    /**
    * 最初申请人
    * isNullAble:1
    */
    private Integer initialUserId;

    /**
    * 最初申请时间
    * isNullAble:1,defaultVal:
    */
    private String initialTime;

    /**
    * 是否已签开口合同
    * isNullAble:1,defaultVal:
    */
    private String materialContract;

    /**
    * 品牌
    * isNullAble:1,defaultVal:
    */
    private String materialBrand;

    /**
    * 备注
    * isNullAble:1,defaultVal:
    */
    private String materialDescription;

    /**
    * 单价
    * isNullAble:1
    */
    private java.math.BigDecimal materialPrice;


    public void setMaterialId(Long materialId){this.materialId = materialId;}

    public Long getMaterialId(){return this.materialId;}

    public void setMaterialCode(String materialCode){this.materialCode = materialCode;}

    public String getMaterialCode(){return this.materialCode;}

    public void setMaterialName(String materialName){this.materialName = materialName;}

    public String getMaterialName(){return this.materialName;}

    public void setMaterialSpecs(String materialSpecs){this.materialSpecs = materialSpecs;}

    public String getMaterialSpecs(){return this.materialSpecs;}

    public void setMaterialUnit(String materialUnit){this.materialUnit = materialUnit;}

    public String getMaterialUnit(){return this.materialUnit;}

    public void setSupplierCode(String supplierCode){this.supplierCode = supplierCode;}

    public String getSupplierCode(){return this.supplierCode;}

    public void setSupplierName(String supplierName){this.supplierName = supplierName;}

    public String getSupplierName(){return this.supplierName;}

    public void setMaterialOrderMinNum(String materialOrderMinNum){this.materialOrderMinNum = materialOrderMinNum;}

    public String getMaterialOrderMinNum(){return this.materialOrderMinNum;}

    public void setMaterialLeadTime(String materialLeadTime){this.materialLeadTime = materialLeadTime;}

    public String getMaterialLeadTime(){return this.materialLeadTime;}

    public void setWarehouseCode(String warehouseCode){this.warehouseCode = warehouseCode;}

    public String getWarehouseCode(){return this.warehouseCode;}

    public void setShelfCode(String shelfCode){this.shelfCode = shelfCode;}

    public String getShelfCode(){return this.shelfCode;}

    public void setPackageSpecs(String packageSpecs){this.packageSpecs = packageSpecs;}

    public String getPackageSpecs(){return this.packageSpecs;}

    public void setInitialDepartment(String initialDepartment){this.initialDepartment = initialDepartment;}

    public String getInitialDepartment(){return this.initialDepartment;}

    public void setMaterialSignal(String materialSignal){this.materialSignal = materialSignal;}

    public String getMaterialSignal(){return this.materialSignal;}

    public void setStockNumNow(java.math.BigDecimal stockNumNow){this.stockNumNow = stockNumNow;}

    public java.math.BigDecimal getStockNumNow(){return this.stockNumNow;}

    public void setLastUpdated(String lastUpdated){this.lastUpdated = lastUpdated;}

    public String getLastUpdated(){return this.lastUpdated;}

    public void setStockNumStatic(java.math.BigDecimal stockNumStatic){this.stockNumStatic = stockNumStatic;}

    public java.math.BigDecimal getStockNumStatic(){return this.stockNumStatic;}

    public void setStockNumMax(java.math.BigDecimal stockNumMax){this.stockNumMax = stockNumMax;}

    public java.math.BigDecimal getStockNumMax(){return this.stockNumMax;}

    public void setStockNumSafe(java.math.BigDecimal stockNumSafe){this.stockNumSafe = stockNumSafe;}

    public java.math.BigDecimal getStockNumSafe(){return this.stockNumSafe;}

    public void setMaterialType(String materialType){this.materialType = materialType;}

    public String getMaterialType(){return this.materialType;}

    public void setInitialUserId(Integer initialUserId){this.initialUserId = initialUserId;}

    public Integer getInitialUserId(){return this.initialUserId;}

    public void setInitialTime(String initialTime){this.initialTime = initialTime;}

    public String getInitialTime(){return this.initialTime;}

    public void setMaterialContract(String materialContract){this.materialContract = materialContract;}

    public String getMaterialContract(){return this.materialContract;}

    public void setMaterialBrand(String materialBrand){this.materialBrand = materialBrand;}

    public String getMaterialBrand(){return this.materialBrand;}

    public void setMaterialDescription(String materialDescription){this.materialDescription = materialDescription;}

    public String getMaterialDescription(){return this.materialDescription;}

    public void setMaterialPrice(java.math.BigDecimal materialPrice){this.materialPrice = materialPrice;}

    public java.math.BigDecimal getMaterialPrice(){return this.materialPrice;}
    @Override
    public String toString() {
        return "Material{" +
                "materialId='" + materialId + '\'' +
                "materialCode='" + materialCode + '\'' +
                "materialName='" + materialName + '\'' +
                "materialSpecs='" + materialSpecs + '\'' +
                "materialUnit='" + materialUnit + '\'' +
                "supplierCode='" + supplierCode + '\'' +
                "supplierName='" + supplierName + '\'' +
                "materialOrderMinNum='" + materialOrderMinNum + '\'' +
                "materialLeadTime='" + materialLeadTime + '\'' +
                "warehouseCode='" + warehouseCode + '\'' +
                "shelfCode='" + shelfCode + '\'' +
                "packageSpecs='" + packageSpecs + '\'' +
                "initialDepartment='" + initialDepartment + '\'' +
                "materialSignal='" + materialSignal + '\'' +
                "stockNumNow='" + stockNumNow + '\'' +
                "lastUpdated='" + lastUpdated + '\'' +
                "stockNumStatic='" + stockNumStatic + '\'' +
                "stockNumMax='" + stockNumMax + '\'' +
                "stockNumSafe='" + stockNumSafe + '\'' +
                "materialType='" + materialType + '\'' +
                "initialUserId='" + initialUserId + '\'' +
                "initialTime='" + initialTime + '\'' +
                "materialContract='" + materialContract + '\'' +
                "materialBrand='" + materialBrand + '\'' +
                "materialDescription='" + materialDescription + '\'' +
                "materialPrice='" + materialPrice + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Material set;

        private ConditionBuilder where;

        public UpdateBuilder set(Material set){
            this.set = set;
            return this;
        }

        public Material getSet(){
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

    public static class QueryBuilder extends Material{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Long> materialIdList;

        public List<Long> getMaterialIdList(){return this.materialIdList;}

        private Long materialIdSt;

        private Long materialIdEd;

        public Long getMaterialIdSt(){return this.materialIdSt;}

        public Long getMaterialIdEd(){return this.materialIdEd;}

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
        private List<String> materialSpecsList;

        public List<String> getMaterialSpecsList(){return this.materialSpecsList;}


        private List<String> fuzzyMaterialSpecs;

        public List<String> getFuzzyMaterialSpecs(){return this.fuzzyMaterialSpecs;}

        private List<String> rightFuzzyMaterialSpecs;

        public List<String> getRightFuzzyMaterialSpecs(){return this.rightFuzzyMaterialSpecs;}
        private List<String> materialUnitList;

        public List<String> getMaterialUnitList(){return this.materialUnitList;}


        private List<String> fuzzyMaterialUnit;

        public List<String> getFuzzyMaterialUnit(){return this.fuzzyMaterialUnit;}

        private List<String> rightFuzzyMaterialUnit;

        public List<String> getRightFuzzyMaterialUnit(){return this.rightFuzzyMaterialUnit;}
        private List<String> supplierCodeList;

        public List<String> getSupplierCodeList(){return this.supplierCodeList;}


        private List<String> fuzzySupplierCode;

        public List<String> getFuzzySupplierCode(){return this.fuzzySupplierCode;}

        private List<String> rightFuzzySupplierCode;

        public List<String> getRightFuzzySupplierCode(){return this.rightFuzzySupplierCode;}
        private List<String> supplierNameList;

        public List<String> getSupplierNameList(){return this.supplierNameList;}


        private List<String> fuzzySupplierName;

        public List<String> getFuzzySupplierName(){return this.fuzzySupplierName;}

        private List<String> rightFuzzySupplierName;

        public List<String> getRightFuzzySupplierName(){return this.rightFuzzySupplierName;}
        private List<String> materialOrderMinNumList;

        public List<String> getMaterialOrderMinNumList(){return this.materialOrderMinNumList;}


        private List<String> fuzzyMaterialOrderMinNum;

        public List<String> getFuzzyMaterialOrderMinNum(){return this.fuzzyMaterialOrderMinNum;}

        private List<String> rightFuzzyMaterialOrderMinNum;

        public List<String> getRightFuzzyMaterialOrderMinNum(){return this.rightFuzzyMaterialOrderMinNum;}
        private List<String> materialLeadTimeList;

        public List<String> getMaterialLeadTimeList(){return this.materialLeadTimeList;}


        private List<String> fuzzyMaterialLeadTime;

        public List<String> getFuzzyMaterialLeadTime(){return this.fuzzyMaterialLeadTime;}

        private List<String> rightFuzzyMaterialLeadTime;

        public List<String> getRightFuzzyMaterialLeadTime(){return this.rightFuzzyMaterialLeadTime;}
        private List<String> warehouseCodeList;

        public List<String> getWarehouseCodeList(){return this.warehouseCodeList;}


        private List<String> fuzzyWarehouseCode;

        public List<String> getFuzzyWarehouseCode(){return this.fuzzyWarehouseCode;}

        private List<String> rightFuzzyWarehouseCode;

        public List<String> getRightFuzzyWarehouseCode(){return this.rightFuzzyWarehouseCode;}
        private List<String> shelfCodeList;

        public List<String> getShelfCodeList(){return this.shelfCodeList;}


        private List<String> fuzzyShelfCode;

        public List<String> getFuzzyShelfCode(){return this.fuzzyShelfCode;}

        private List<String> rightFuzzyShelfCode;

        public List<String> getRightFuzzyShelfCode(){return this.rightFuzzyShelfCode;}
        private List<String> packageSpecsList;

        public List<String> getPackageSpecsList(){return this.packageSpecsList;}


        private List<String> fuzzyPackageSpecs;

        public List<String> getFuzzyPackageSpecs(){return this.fuzzyPackageSpecs;}

        private List<String> rightFuzzyPackageSpecs;

        public List<String> getRightFuzzyPackageSpecs(){return this.rightFuzzyPackageSpecs;}
        private List<String> initialDepartmentList;

        public List<String> getInitialDepartmentList(){return this.initialDepartmentList;}


        private List<String> fuzzyInitialDepartment;

        public List<String> getFuzzyInitialDepartment(){return this.fuzzyInitialDepartment;}

        private List<String> rightFuzzyInitialDepartment;

        public List<String> getRightFuzzyInitialDepartment(){return this.rightFuzzyInitialDepartment;}
        private List<String> materialSignalList;

        public List<String> getMaterialSignalList(){return this.materialSignalList;}


        private List<String> fuzzyMaterialSignal;

        public List<String> getFuzzyMaterialSignal(){return this.fuzzyMaterialSignal;}

        private List<String> rightFuzzyMaterialSignal;

        public List<String> getRightFuzzyMaterialSignal(){return this.rightFuzzyMaterialSignal;}
        private List<java.math.BigDecimal> stockNumNowList;

        public List<java.math.BigDecimal> getStockNumNowList(){return this.stockNumNowList;}

        private java.math.BigDecimal stockNumNowSt;

        private java.math.BigDecimal stockNumNowEd;

        public java.math.BigDecimal getStockNumNowSt(){return this.stockNumNowSt;}

        public java.math.BigDecimal getStockNumNowEd(){return this.stockNumNowEd;}

        private List<String> lastUpdatedList;

        public List<String> getLastUpdatedList(){return this.lastUpdatedList;}


        private List<String> fuzzyLastUpdated;

        public List<String> getFuzzyLastUpdated(){return this.fuzzyLastUpdated;}

        private List<String> rightFuzzyLastUpdated;

        public List<String> getRightFuzzyLastUpdated(){return this.rightFuzzyLastUpdated;}
        private List<java.math.BigDecimal> stockNumStaticList;

        public List<java.math.BigDecimal> getStockNumStaticList(){return this.stockNumStaticList;}

        private java.math.BigDecimal stockNumStaticSt;

        private java.math.BigDecimal stockNumStaticEd;

        public java.math.BigDecimal getStockNumStaticSt(){return this.stockNumStaticSt;}

        public java.math.BigDecimal getStockNumStaticEd(){return this.stockNumStaticEd;}

        private List<java.math.BigDecimal> stockNumMaxList;

        public List<java.math.BigDecimal> getStockNumMaxList(){return this.stockNumMaxList;}

        private java.math.BigDecimal stockNumMaxSt;

        private java.math.BigDecimal stockNumMaxEd;

        public java.math.BigDecimal getStockNumMaxSt(){return this.stockNumMaxSt;}

        public java.math.BigDecimal getStockNumMaxEd(){return this.stockNumMaxEd;}

        private List<java.math.BigDecimal> stockNumSafeList;

        public List<java.math.BigDecimal> getStockNumSafeList(){return this.stockNumSafeList;}

        private java.math.BigDecimal stockNumSafeSt;

        private java.math.BigDecimal stockNumSafeEd;

        public java.math.BigDecimal getStockNumSafeSt(){return this.stockNumSafeSt;}

        public java.math.BigDecimal getStockNumSafeEd(){return this.stockNumSafeEd;}

        private List<String> materialTypeList;

        public List<String> getMaterialTypeList(){return this.materialTypeList;}


        private List<String> fuzzyMaterialType;

        public List<String> getFuzzyMaterialType(){return this.fuzzyMaterialType;}

        private List<String> rightFuzzyMaterialType;

        public List<String> getRightFuzzyMaterialType(){return this.rightFuzzyMaterialType;}
        private List<Integer> initialUserIdList;

        public List<Integer> getInitialUserIdList(){return this.initialUserIdList;}

        private Integer initialUserIdSt;

        private Integer initialUserIdEd;

        public Integer getInitialUserIdSt(){return this.initialUserIdSt;}

        public Integer getInitialUserIdEd(){return this.initialUserIdEd;}

        private List<String> initialTimeList;

        public List<String> getInitialTimeList(){return this.initialTimeList;}


        private List<String> fuzzyInitialTime;

        public List<String> getFuzzyInitialTime(){return this.fuzzyInitialTime;}

        private List<String> rightFuzzyInitialTime;

        public List<String> getRightFuzzyInitialTime(){return this.rightFuzzyInitialTime;}
        private List<String> materialContractList;

        public List<String> getMaterialContractList(){return this.materialContractList;}


        private List<String> fuzzyMaterialContract;

        public List<String> getFuzzyMaterialContract(){return this.fuzzyMaterialContract;}

        private List<String> rightFuzzyMaterialContract;

        public List<String> getRightFuzzyMaterialContract(){return this.rightFuzzyMaterialContract;}
        private List<String> materialBrandList;

        public List<String> getMaterialBrandList(){return this.materialBrandList;}


        private List<String> fuzzyMaterialBrand;

        public List<String> getFuzzyMaterialBrand(){return this.fuzzyMaterialBrand;}

        private List<String> rightFuzzyMaterialBrand;

        public List<String> getRightFuzzyMaterialBrand(){return this.rightFuzzyMaterialBrand;}
        private List<String> materialDescriptionList;

        public List<String> getMaterialDescriptionList(){return this.materialDescriptionList;}


        private List<String> fuzzyMaterialDescription;

        public List<String> getFuzzyMaterialDescription(){return this.fuzzyMaterialDescription;}

        private List<String> rightFuzzyMaterialDescription;

        public List<String> getRightFuzzyMaterialDescription(){return this.rightFuzzyMaterialDescription;}
        private List<java.math.BigDecimal> materialPriceList;

        public List<java.math.BigDecimal> getMaterialPriceList(){return this.materialPriceList;}

        private java.math.BigDecimal materialPriceSt;

        private java.math.BigDecimal materialPriceEd;

        public java.math.BigDecimal getMaterialPriceSt(){return this.materialPriceSt;}

        public java.math.BigDecimal getMaterialPriceEd(){return this.materialPriceEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder materialIdBetWeen(Long materialIdSt,Long materialIdEd){
            this.materialIdSt = materialIdSt;
            this.materialIdEd = materialIdEd;
            return this;
        }

        public QueryBuilder materialIdGreaterEqThan(Long materialIdSt){
            this.materialIdSt = materialIdSt;
            return this;
        }
        public QueryBuilder materialIdLessEqThan(Long materialIdEd){
            this.materialIdEd = materialIdEd;
            return this;
        }


        public QueryBuilder materialId(Long materialId){
            setMaterialId(materialId);
            return this;
        }

        public QueryBuilder materialIdList(Long ... materialId){
            this.materialIdList = solveNullList(materialId);
            return this;
        }

        public QueryBuilder materialIdList(List<Long> materialId){
            this.materialIdList = materialId;
            return this;
        }

        public QueryBuilder fetchMaterialId(){
            setFetchFields("fetchFields","materialId");
            return this;
        }

        public QueryBuilder excludeMaterialId(){
            setFetchFields("excludeFields","materialId");
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

        public QueryBuilder fuzzyMaterialOrderMinNum (List<String> fuzzyMaterialOrderMinNum){
            this.fuzzyMaterialOrderMinNum = fuzzyMaterialOrderMinNum;
            return this;
        }

        public QueryBuilder fuzzyMaterialOrderMinNum (String ... fuzzyMaterialOrderMinNum){
            this.fuzzyMaterialOrderMinNum = solveNullList(fuzzyMaterialOrderMinNum);
            return this;
        }

        public QueryBuilder rightFuzzyMaterialOrderMinNum (List<String> rightFuzzyMaterialOrderMinNum){
            this.rightFuzzyMaterialOrderMinNum = rightFuzzyMaterialOrderMinNum;
            return this;
        }

        public QueryBuilder rightFuzzyMaterialOrderMinNum (String ... rightFuzzyMaterialOrderMinNum){
            this.rightFuzzyMaterialOrderMinNum = solveNullList(rightFuzzyMaterialOrderMinNum);
            return this;
        }

        public QueryBuilder materialOrderMinNum(String materialOrderMinNum){
            setMaterialOrderMinNum(materialOrderMinNum);
            return this;
        }

        public QueryBuilder materialOrderMinNumList(String ... materialOrderMinNum){
            this.materialOrderMinNumList = solveNullList(materialOrderMinNum);
            return this;
        }

        public QueryBuilder materialOrderMinNumList(List<String> materialOrderMinNum){
            this.materialOrderMinNumList = materialOrderMinNum;
            return this;
        }

        public QueryBuilder fetchMaterialOrderMinNum(){
            setFetchFields("fetchFields","materialOrderMinNum");
            return this;
        }

        public QueryBuilder excludeMaterialOrderMinNum(){
            setFetchFields("excludeFields","materialOrderMinNum");
            return this;
        }

        public QueryBuilder fuzzyMaterialLeadTime (List<String> fuzzyMaterialLeadTime){
            this.fuzzyMaterialLeadTime = fuzzyMaterialLeadTime;
            return this;
        }

        public QueryBuilder fuzzyMaterialLeadTime (String ... fuzzyMaterialLeadTime){
            this.fuzzyMaterialLeadTime = solveNullList(fuzzyMaterialLeadTime);
            return this;
        }

        public QueryBuilder rightFuzzyMaterialLeadTime (List<String> rightFuzzyMaterialLeadTime){
            this.rightFuzzyMaterialLeadTime = rightFuzzyMaterialLeadTime;
            return this;
        }

        public QueryBuilder rightFuzzyMaterialLeadTime (String ... rightFuzzyMaterialLeadTime){
            this.rightFuzzyMaterialLeadTime = solveNullList(rightFuzzyMaterialLeadTime);
            return this;
        }

        public QueryBuilder materialLeadTime(String materialLeadTime){
            setMaterialLeadTime(materialLeadTime);
            return this;
        }

        public QueryBuilder materialLeadTimeList(String ... materialLeadTime){
            this.materialLeadTimeList = solveNullList(materialLeadTime);
            return this;
        }

        public QueryBuilder materialLeadTimeList(List<String> materialLeadTime){
            this.materialLeadTimeList = materialLeadTime;
            return this;
        }

        public QueryBuilder fetchMaterialLeadTime(){
            setFetchFields("fetchFields","materialLeadTime");
            return this;
        }

        public QueryBuilder excludeMaterialLeadTime(){
            setFetchFields("excludeFields","materialLeadTime");
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

        public QueryBuilder fuzzyShelfCode (List<String> fuzzyShelfCode){
            this.fuzzyShelfCode = fuzzyShelfCode;
            return this;
        }

        public QueryBuilder fuzzyShelfCode (String ... fuzzyShelfCode){
            this.fuzzyShelfCode = solveNullList(fuzzyShelfCode);
            return this;
        }

        public QueryBuilder rightFuzzyShelfCode (List<String> rightFuzzyShelfCode){
            this.rightFuzzyShelfCode = rightFuzzyShelfCode;
            return this;
        }

        public QueryBuilder rightFuzzyShelfCode (String ... rightFuzzyShelfCode){
            this.rightFuzzyShelfCode = solveNullList(rightFuzzyShelfCode);
            return this;
        }

        public QueryBuilder shelfCode(String shelfCode){
            setShelfCode(shelfCode);
            return this;
        }

        public QueryBuilder shelfCodeList(String ... shelfCode){
            this.shelfCodeList = solveNullList(shelfCode);
            return this;
        }

        public QueryBuilder shelfCodeList(List<String> shelfCode){
            this.shelfCodeList = shelfCode;
            return this;
        }

        public QueryBuilder fetchShelfCode(){
            setFetchFields("fetchFields","shelfCode");
            return this;
        }

        public QueryBuilder excludeShelfCode(){
            setFetchFields("excludeFields","shelfCode");
            return this;
        }

        public QueryBuilder fuzzyPackageSpecs (List<String> fuzzyPackageSpecs){
            this.fuzzyPackageSpecs = fuzzyPackageSpecs;
            return this;
        }

        public QueryBuilder fuzzyPackageSpecs (String ... fuzzyPackageSpecs){
            this.fuzzyPackageSpecs = solveNullList(fuzzyPackageSpecs);
            return this;
        }

        public QueryBuilder rightFuzzyPackageSpecs (List<String> rightFuzzyPackageSpecs){
            this.rightFuzzyPackageSpecs = rightFuzzyPackageSpecs;
            return this;
        }

        public QueryBuilder rightFuzzyPackageSpecs (String ... rightFuzzyPackageSpecs){
            this.rightFuzzyPackageSpecs = solveNullList(rightFuzzyPackageSpecs);
            return this;
        }

        public QueryBuilder packageSpecs(String packageSpecs){
            setPackageSpecs(packageSpecs);
            return this;
        }

        public QueryBuilder packageSpecsList(String ... packageSpecs){
            this.packageSpecsList = solveNullList(packageSpecs);
            return this;
        }

        public QueryBuilder packageSpecsList(List<String> packageSpecs){
            this.packageSpecsList = packageSpecs;
            return this;
        }

        public QueryBuilder fetchPackageSpecs(){
            setFetchFields("fetchFields","packageSpecs");
            return this;
        }

        public QueryBuilder excludePackageSpecs(){
            setFetchFields("excludeFields","packageSpecs");
            return this;
        }

        public QueryBuilder fuzzyInitialDepartment (List<String> fuzzyInitialDepartment){
            this.fuzzyInitialDepartment = fuzzyInitialDepartment;
            return this;
        }

        public QueryBuilder fuzzyInitialDepartment (String ... fuzzyInitialDepartment){
            this.fuzzyInitialDepartment = solveNullList(fuzzyInitialDepartment);
            return this;
        }

        public QueryBuilder rightFuzzyInitialDepartment (List<String> rightFuzzyInitialDepartment){
            this.rightFuzzyInitialDepartment = rightFuzzyInitialDepartment;
            return this;
        }

        public QueryBuilder rightFuzzyInitialDepartment (String ... rightFuzzyInitialDepartment){
            this.rightFuzzyInitialDepartment = solveNullList(rightFuzzyInitialDepartment);
            return this;
        }

        public QueryBuilder initialDepartment(String initialDepartment){
            setInitialDepartment(initialDepartment);
            return this;
        }

        public QueryBuilder initialDepartmentList(String ... initialDepartment){
            this.initialDepartmentList = solveNullList(initialDepartment);
            return this;
        }

        public QueryBuilder initialDepartmentList(List<String> initialDepartment){
            this.initialDepartmentList = initialDepartment;
            return this;
        }

        public QueryBuilder fetchInitialDepartment(){
            setFetchFields("fetchFields","initialDepartment");
            return this;
        }

        public QueryBuilder excludeInitialDepartment(){
            setFetchFields("excludeFields","initialDepartment");
            return this;
        }

        public QueryBuilder fuzzyMaterialSignal (List<String> fuzzyMaterialSignal){
            this.fuzzyMaterialSignal = fuzzyMaterialSignal;
            return this;
        }

        public QueryBuilder fuzzyMaterialSignal (String ... fuzzyMaterialSignal){
            this.fuzzyMaterialSignal = solveNullList(fuzzyMaterialSignal);
            return this;
        }

        public QueryBuilder rightFuzzyMaterialSignal (List<String> rightFuzzyMaterialSignal){
            this.rightFuzzyMaterialSignal = rightFuzzyMaterialSignal;
            return this;
        }

        public QueryBuilder rightFuzzyMaterialSignal (String ... rightFuzzyMaterialSignal){
            this.rightFuzzyMaterialSignal = solveNullList(rightFuzzyMaterialSignal);
            return this;
        }

        public QueryBuilder materialSignal(String materialSignal){
            setMaterialSignal(materialSignal);
            return this;
        }

        public QueryBuilder materialSignalList(String ... materialSignal){
            this.materialSignalList = solveNullList(materialSignal);
            return this;
        }

        public QueryBuilder materialSignalList(List<String> materialSignal){
            this.materialSignalList = materialSignal;
            return this;
        }

        public QueryBuilder fetchMaterialSignal(){
            setFetchFields("fetchFields","materialSignal");
            return this;
        }

        public QueryBuilder excludeMaterialSignal(){
            setFetchFields("excludeFields","materialSignal");
            return this;
        }

        public QueryBuilder stockNumNowBetWeen(java.math.BigDecimal stockNumNowSt,java.math.BigDecimal stockNumNowEd){
            this.stockNumNowSt = stockNumNowSt;
            this.stockNumNowEd = stockNumNowEd;
            return this;
        }

        public QueryBuilder stockNumNowGreaterEqThan(java.math.BigDecimal stockNumNowSt){
            this.stockNumNowSt = stockNumNowSt;
            return this;
        }
        public QueryBuilder stockNumNowLessEqThan(java.math.BigDecimal stockNumNowEd){
            this.stockNumNowEd = stockNumNowEd;
            return this;
        }


        public QueryBuilder stockNumNow(java.math.BigDecimal stockNumNow){
            setStockNumNow(stockNumNow);
            return this;
        }

        public QueryBuilder stockNumNowList(java.math.BigDecimal ... stockNumNow){
            this.stockNumNowList = solveNullList(stockNumNow);
            return this;
        }

        public QueryBuilder stockNumNowList(List<java.math.BigDecimal> stockNumNow){
            this.stockNumNowList = stockNumNow;
            return this;
        }

        public QueryBuilder fetchStockNumNow(){
            setFetchFields("fetchFields","stockNumNow");
            return this;
        }

        public QueryBuilder excludeStockNumNow(){
            setFetchFields("excludeFields","stockNumNow");
            return this;
        }

        public QueryBuilder fuzzyLastUpdated (List<String> fuzzyLastUpdated){
            this.fuzzyLastUpdated = fuzzyLastUpdated;
            return this;
        }

        public QueryBuilder fuzzyLastUpdated (String ... fuzzyLastUpdated){
            this.fuzzyLastUpdated = solveNullList(fuzzyLastUpdated);
            return this;
        }

        public QueryBuilder rightFuzzyLastUpdated (List<String> rightFuzzyLastUpdated){
            this.rightFuzzyLastUpdated = rightFuzzyLastUpdated;
            return this;
        }

        public QueryBuilder rightFuzzyLastUpdated (String ... rightFuzzyLastUpdated){
            this.rightFuzzyLastUpdated = solveNullList(rightFuzzyLastUpdated);
            return this;
        }

        public QueryBuilder lastUpdated(String lastUpdated){
            setLastUpdated(lastUpdated);
            return this;
        }

        public QueryBuilder lastUpdatedList(String ... lastUpdated){
            this.lastUpdatedList = solveNullList(lastUpdated);
            return this;
        }

        public QueryBuilder lastUpdatedList(List<String> lastUpdated){
            this.lastUpdatedList = lastUpdated;
            return this;
        }

        public QueryBuilder fetchLastUpdated(){
            setFetchFields("fetchFields","lastUpdated");
            return this;
        }

        public QueryBuilder excludeLastUpdated(){
            setFetchFields("excludeFields","lastUpdated");
            return this;
        }

        public QueryBuilder stockNumStaticBetWeen(java.math.BigDecimal stockNumStaticSt,java.math.BigDecimal stockNumStaticEd){
            this.stockNumStaticSt = stockNumStaticSt;
            this.stockNumStaticEd = stockNumStaticEd;
            return this;
        }

        public QueryBuilder stockNumStaticGreaterEqThan(java.math.BigDecimal stockNumStaticSt){
            this.stockNumStaticSt = stockNumStaticSt;
            return this;
        }
        public QueryBuilder stockNumStaticLessEqThan(java.math.BigDecimal stockNumStaticEd){
            this.stockNumStaticEd = stockNumStaticEd;
            return this;
        }


        public QueryBuilder stockNumStatic(java.math.BigDecimal stockNumStatic){
            setStockNumStatic(stockNumStatic);
            return this;
        }

        public QueryBuilder stockNumStaticList(java.math.BigDecimal ... stockNumStatic){
            this.stockNumStaticList = solveNullList(stockNumStatic);
            return this;
        }

        public QueryBuilder stockNumStaticList(List<java.math.BigDecimal> stockNumStatic){
            this.stockNumStaticList = stockNumStatic;
            return this;
        }

        public QueryBuilder fetchStockNumStatic(){
            setFetchFields("fetchFields","stockNumStatic");
            return this;
        }

        public QueryBuilder excludeStockNumStatic(){
            setFetchFields("excludeFields","stockNumStatic");
            return this;
        }

        public QueryBuilder stockNumMaxBetWeen(java.math.BigDecimal stockNumMaxSt,java.math.BigDecimal stockNumMaxEd){
            this.stockNumMaxSt = stockNumMaxSt;
            this.stockNumMaxEd = stockNumMaxEd;
            return this;
        }

        public QueryBuilder stockNumMaxGreaterEqThan(java.math.BigDecimal stockNumMaxSt){
            this.stockNumMaxSt = stockNumMaxSt;
            return this;
        }
        public QueryBuilder stockNumMaxLessEqThan(java.math.BigDecimal stockNumMaxEd){
            this.stockNumMaxEd = stockNumMaxEd;
            return this;
        }


        public QueryBuilder stockNumMax(java.math.BigDecimal stockNumMax){
            setStockNumMax(stockNumMax);
            return this;
        }

        public QueryBuilder stockNumMaxList(java.math.BigDecimal ... stockNumMax){
            this.stockNumMaxList = solveNullList(stockNumMax);
            return this;
        }

        public QueryBuilder stockNumMaxList(List<java.math.BigDecimal> stockNumMax){
            this.stockNumMaxList = stockNumMax;
            return this;
        }

        public QueryBuilder fetchStockNumMax(){
            setFetchFields("fetchFields","stockNumMax");
            return this;
        }

        public QueryBuilder excludeStockNumMax(){
            setFetchFields("excludeFields","stockNumMax");
            return this;
        }

        public QueryBuilder stockNumSafeBetWeen(java.math.BigDecimal stockNumSafeSt,java.math.BigDecimal stockNumSafeEd){
            this.stockNumSafeSt = stockNumSafeSt;
            this.stockNumSafeEd = stockNumSafeEd;
            return this;
        }

        public QueryBuilder stockNumSafeGreaterEqThan(java.math.BigDecimal stockNumSafeSt){
            this.stockNumSafeSt = stockNumSafeSt;
            return this;
        }
        public QueryBuilder stockNumSafeLessEqThan(java.math.BigDecimal stockNumSafeEd){
            this.stockNumSafeEd = stockNumSafeEd;
            return this;
        }


        public QueryBuilder stockNumSafe(java.math.BigDecimal stockNumSafe){
            setStockNumSafe(stockNumSafe);
            return this;
        }

        public QueryBuilder stockNumSafeList(java.math.BigDecimal ... stockNumSafe){
            this.stockNumSafeList = solveNullList(stockNumSafe);
            return this;
        }

        public QueryBuilder stockNumSafeList(List<java.math.BigDecimal> stockNumSafe){
            this.stockNumSafeList = stockNumSafe;
            return this;
        }

        public QueryBuilder fetchStockNumSafe(){
            setFetchFields("fetchFields","stockNumSafe");
            return this;
        }

        public QueryBuilder excludeStockNumSafe(){
            setFetchFields("excludeFields","stockNumSafe");
            return this;
        }

        public QueryBuilder fuzzyMaterialType (List<String> fuzzyMaterialType){
            this.fuzzyMaterialType = fuzzyMaterialType;
            return this;
        }

        public QueryBuilder fuzzyMaterialType (String ... fuzzyMaterialType){
            this.fuzzyMaterialType = solveNullList(fuzzyMaterialType);
            return this;
        }

        public QueryBuilder rightFuzzyMaterialType (List<String> rightFuzzyMaterialType){
            this.rightFuzzyMaterialType = rightFuzzyMaterialType;
            return this;
        }

        public QueryBuilder rightFuzzyMaterialType (String ... rightFuzzyMaterialType){
            this.rightFuzzyMaterialType = solveNullList(rightFuzzyMaterialType);
            return this;
        }

        public QueryBuilder materialType(String materialType){
            setMaterialType(materialType);
            return this;
        }

        public QueryBuilder materialTypeList(String ... materialType){
            this.materialTypeList = solveNullList(materialType);
            return this;
        }

        public QueryBuilder materialTypeList(List<String> materialType){
            this.materialTypeList = materialType;
            return this;
        }

        public QueryBuilder fetchMaterialType(){
            setFetchFields("fetchFields","materialType");
            return this;
        }

        public QueryBuilder excludeMaterialType(){
            setFetchFields("excludeFields","materialType");
            return this;
        }

        public QueryBuilder initialUserIdBetWeen(Integer initialUserIdSt,Integer initialUserIdEd){
            this.initialUserIdSt = initialUserIdSt;
            this.initialUserIdEd = initialUserIdEd;
            return this;
        }

        public QueryBuilder initialUserIdGreaterEqThan(Integer initialUserIdSt){
            this.initialUserIdSt = initialUserIdSt;
            return this;
        }
        public QueryBuilder initialUserIdLessEqThan(Integer initialUserIdEd){
            this.initialUserIdEd = initialUserIdEd;
            return this;
        }


        public QueryBuilder initialUserId(Integer initialUserId){
            setInitialUserId(initialUserId);
            return this;
        }

        public QueryBuilder initialUserIdList(Integer ... initialUserId){
            this.initialUserIdList = solveNullList(initialUserId);
            return this;
        }

        public QueryBuilder initialUserIdList(List<Integer> initialUserId){
            this.initialUserIdList = initialUserId;
            return this;
        }

        public QueryBuilder fetchInitialUserId(){
            setFetchFields("fetchFields","initialUserId");
            return this;
        }

        public QueryBuilder excludeInitialUserId(){
            setFetchFields("excludeFields","initialUserId");
            return this;
        }

        public QueryBuilder fuzzyInitialTime (List<String> fuzzyInitialTime){
            this.fuzzyInitialTime = fuzzyInitialTime;
            return this;
        }

        public QueryBuilder fuzzyInitialTime (String ... fuzzyInitialTime){
            this.fuzzyInitialTime = solveNullList(fuzzyInitialTime);
            return this;
        }

        public QueryBuilder rightFuzzyInitialTime (List<String> rightFuzzyInitialTime){
            this.rightFuzzyInitialTime = rightFuzzyInitialTime;
            return this;
        }

        public QueryBuilder rightFuzzyInitialTime (String ... rightFuzzyInitialTime){
            this.rightFuzzyInitialTime = solveNullList(rightFuzzyInitialTime);
            return this;
        }

        public QueryBuilder initialTime(String initialTime){
            setInitialTime(initialTime);
            return this;
        }

        public QueryBuilder initialTimeList(String ... initialTime){
            this.initialTimeList = solveNullList(initialTime);
            return this;
        }

        public QueryBuilder initialTimeList(List<String> initialTime){
            this.initialTimeList = initialTime;
            return this;
        }

        public QueryBuilder fetchInitialTime(){
            setFetchFields("fetchFields","initialTime");
            return this;
        }

        public QueryBuilder excludeInitialTime(){
            setFetchFields("excludeFields","initialTime");
            return this;
        }

        public QueryBuilder fuzzyMaterialContract (List<String> fuzzyMaterialContract){
            this.fuzzyMaterialContract = fuzzyMaterialContract;
            return this;
        }

        public QueryBuilder fuzzyMaterialContract (String ... fuzzyMaterialContract){
            this.fuzzyMaterialContract = solveNullList(fuzzyMaterialContract);
            return this;
        }

        public QueryBuilder rightFuzzyMaterialContract (List<String> rightFuzzyMaterialContract){
            this.rightFuzzyMaterialContract = rightFuzzyMaterialContract;
            return this;
        }

        public QueryBuilder rightFuzzyMaterialContract (String ... rightFuzzyMaterialContract){
            this.rightFuzzyMaterialContract = solveNullList(rightFuzzyMaterialContract);
            return this;
        }

        public QueryBuilder materialContract(String materialContract){
            setMaterialContract(materialContract);
            return this;
        }

        public QueryBuilder materialContractList(String ... materialContract){
            this.materialContractList = solveNullList(materialContract);
            return this;
        }

        public QueryBuilder materialContractList(List<String> materialContract){
            this.materialContractList = materialContract;
            return this;
        }

        public QueryBuilder fetchMaterialContract(){
            setFetchFields("fetchFields","materialContract");
            return this;
        }

        public QueryBuilder excludeMaterialContract(){
            setFetchFields("excludeFields","materialContract");
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

        public QueryBuilder fuzzyMaterialDescription (List<String> fuzzyMaterialDescription){
            this.fuzzyMaterialDescription = fuzzyMaterialDescription;
            return this;
        }

        public QueryBuilder fuzzyMaterialDescription (String ... fuzzyMaterialDescription){
            this.fuzzyMaterialDescription = solveNullList(fuzzyMaterialDescription);
            return this;
        }

        public QueryBuilder rightFuzzyMaterialDescription (List<String> rightFuzzyMaterialDescription){
            this.rightFuzzyMaterialDescription = rightFuzzyMaterialDescription;
            return this;
        }

        public QueryBuilder rightFuzzyMaterialDescription (String ... rightFuzzyMaterialDescription){
            this.rightFuzzyMaterialDescription = solveNullList(rightFuzzyMaterialDescription);
            return this;
        }

        public QueryBuilder materialDescription(String materialDescription){
            setMaterialDescription(materialDescription);
            return this;
        }

        public QueryBuilder materialDescriptionList(String ... materialDescription){
            this.materialDescriptionList = solveNullList(materialDescription);
            return this;
        }

        public QueryBuilder materialDescriptionList(List<String> materialDescription){
            this.materialDescriptionList = materialDescription;
            return this;
        }

        public QueryBuilder fetchMaterialDescription(){
            setFetchFields("fetchFields","materialDescription");
            return this;
        }

        public QueryBuilder excludeMaterialDescription(){
            setFetchFields("excludeFields","materialDescription");
            return this;
        }

        public QueryBuilder materialPriceBetWeen(java.math.BigDecimal materialPriceSt,java.math.BigDecimal materialPriceEd){
            this.materialPriceSt = materialPriceSt;
            this.materialPriceEd = materialPriceEd;
            return this;
        }

        public QueryBuilder materialPriceGreaterEqThan(java.math.BigDecimal materialPriceSt){
            this.materialPriceSt = materialPriceSt;
            return this;
        }
        public QueryBuilder materialPriceLessEqThan(java.math.BigDecimal materialPriceEd){
            this.materialPriceEd = materialPriceEd;
            return this;
        }


        public QueryBuilder materialPrice(java.math.BigDecimal materialPrice){
            setMaterialPrice(materialPrice);
            return this;
        }

        public QueryBuilder materialPriceList(java.math.BigDecimal ... materialPrice){
            this.materialPriceList = solveNullList(materialPrice);
            return this;
        }

        public QueryBuilder materialPriceList(List<java.math.BigDecimal> materialPrice){
            this.materialPriceList = materialPrice;
            return this;
        }

        public QueryBuilder fetchMaterialPrice(){
            setFetchFields("fetchFields","materialPrice");
            return this;
        }

        public QueryBuilder excludeMaterialPrice(){
            setFetchFields("excludeFields","materialPrice");
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

        public Material build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> materialIdList;

        public List<Long> getMaterialIdList(){return this.materialIdList;}

        private Long materialIdSt;

        private Long materialIdEd;

        public Long getMaterialIdSt(){return this.materialIdSt;}

        public Long getMaterialIdEd(){return this.materialIdEd;}

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
        private List<String> materialSpecsList;

        public List<String> getMaterialSpecsList(){return this.materialSpecsList;}


        private List<String> fuzzyMaterialSpecs;

        public List<String> getFuzzyMaterialSpecs(){return this.fuzzyMaterialSpecs;}

        private List<String> rightFuzzyMaterialSpecs;

        public List<String> getRightFuzzyMaterialSpecs(){return this.rightFuzzyMaterialSpecs;}
        private List<String> materialUnitList;

        public List<String> getMaterialUnitList(){return this.materialUnitList;}


        private List<String> fuzzyMaterialUnit;

        public List<String> getFuzzyMaterialUnit(){return this.fuzzyMaterialUnit;}

        private List<String> rightFuzzyMaterialUnit;

        public List<String> getRightFuzzyMaterialUnit(){return this.rightFuzzyMaterialUnit;}
        private List<String> supplierCodeList;

        public List<String> getSupplierCodeList(){return this.supplierCodeList;}


        private List<String> fuzzySupplierCode;

        public List<String> getFuzzySupplierCode(){return this.fuzzySupplierCode;}

        private List<String> rightFuzzySupplierCode;

        public List<String> getRightFuzzySupplierCode(){return this.rightFuzzySupplierCode;}
        private List<String> supplierNameList;

        public List<String> getSupplierNameList(){return this.supplierNameList;}


        private List<String> fuzzySupplierName;

        public List<String> getFuzzySupplierName(){return this.fuzzySupplierName;}

        private List<String> rightFuzzySupplierName;

        public List<String> getRightFuzzySupplierName(){return this.rightFuzzySupplierName;}
        private List<String> materialOrderMinNumList;

        public List<String> getMaterialOrderMinNumList(){return this.materialOrderMinNumList;}


        private List<String> fuzzyMaterialOrderMinNum;

        public List<String> getFuzzyMaterialOrderMinNum(){return this.fuzzyMaterialOrderMinNum;}

        private List<String> rightFuzzyMaterialOrderMinNum;

        public List<String> getRightFuzzyMaterialOrderMinNum(){return this.rightFuzzyMaterialOrderMinNum;}
        private List<String> materialLeadTimeList;

        public List<String> getMaterialLeadTimeList(){return this.materialLeadTimeList;}


        private List<String> fuzzyMaterialLeadTime;

        public List<String> getFuzzyMaterialLeadTime(){return this.fuzzyMaterialLeadTime;}

        private List<String> rightFuzzyMaterialLeadTime;

        public List<String> getRightFuzzyMaterialLeadTime(){return this.rightFuzzyMaterialLeadTime;}
        private List<String> warehouseCodeList;

        public List<String> getWarehouseCodeList(){return this.warehouseCodeList;}


        private List<String> fuzzyWarehouseCode;

        public List<String> getFuzzyWarehouseCode(){return this.fuzzyWarehouseCode;}

        private List<String> rightFuzzyWarehouseCode;

        public List<String> getRightFuzzyWarehouseCode(){return this.rightFuzzyWarehouseCode;}
        private List<String> shelfCodeList;

        public List<String> getShelfCodeList(){return this.shelfCodeList;}


        private List<String> fuzzyShelfCode;

        public List<String> getFuzzyShelfCode(){return this.fuzzyShelfCode;}

        private List<String> rightFuzzyShelfCode;

        public List<String> getRightFuzzyShelfCode(){return this.rightFuzzyShelfCode;}
        private List<String> packageSpecsList;

        public List<String> getPackageSpecsList(){return this.packageSpecsList;}


        private List<String> fuzzyPackageSpecs;

        public List<String> getFuzzyPackageSpecs(){return this.fuzzyPackageSpecs;}

        private List<String> rightFuzzyPackageSpecs;

        public List<String> getRightFuzzyPackageSpecs(){return this.rightFuzzyPackageSpecs;}
        private List<String> initialDepartmentList;

        public List<String> getInitialDepartmentList(){return this.initialDepartmentList;}


        private List<String> fuzzyInitialDepartment;

        public List<String> getFuzzyInitialDepartment(){return this.fuzzyInitialDepartment;}

        private List<String> rightFuzzyInitialDepartment;

        public List<String> getRightFuzzyInitialDepartment(){return this.rightFuzzyInitialDepartment;}
        private List<String> materialSignalList;

        public List<String> getMaterialSignalList(){return this.materialSignalList;}


        private List<String> fuzzyMaterialSignal;

        public List<String> getFuzzyMaterialSignal(){return this.fuzzyMaterialSignal;}

        private List<String> rightFuzzyMaterialSignal;

        public List<String> getRightFuzzyMaterialSignal(){return this.rightFuzzyMaterialSignal;}
        private List<java.math.BigDecimal> stockNumNowList;

        public List<java.math.BigDecimal> getStockNumNowList(){return this.stockNumNowList;}

        private java.math.BigDecimal stockNumNowSt;

        private java.math.BigDecimal stockNumNowEd;

        public java.math.BigDecimal getStockNumNowSt(){return this.stockNumNowSt;}

        public java.math.BigDecimal getStockNumNowEd(){return this.stockNumNowEd;}

        private List<String> lastUpdatedList;

        public List<String> getLastUpdatedList(){return this.lastUpdatedList;}


        private List<String> fuzzyLastUpdated;

        public List<String> getFuzzyLastUpdated(){return this.fuzzyLastUpdated;}

        private List<String> rightFuzzyLastUpdated;

        public List<String> getRightFuzzyLastUpdated(){return this.rightFuzzyLastUpdated;}
        private List<java.math.BigDecimal> stockNumStaticList;

        public List<java.math.BigDecimal> getStockNumStaticList(){return this.stockNumStaticList;}

        private java.math.BigDecimal stockNumStaticSt;

        private java.math.BigDecimal stockNumStaticEd;

        public java.math.BigDecimal getStockNumStaticSt(){return this.stockNumStaticSt;}

        public java.math.BigDecimal getStockNumStaticEd(){return this.stockNumStaticEd;}

        private List<java.math.BigDecimal> stockNumMaxList;

        public List<java.math.BigDecimal> getStockNumMaxList(){return this.stockNumMaxList;}

        private java.math.BigDecimal stockNumMaxSt;

        private java.math.BigDecimal stockNumMaxEd;

        public java.math.BigDecimal getStockNumMaxSt(){return this.stockNumMaxSt;}

        public java.math.BigDecimal getStockNumMaxEd(){return this.stockNumMaxEd;}

        private List<java.math.BigDecimal> stockNumSafeList;

        public List<java.math.BigDecimal> getStockNumSafeList(){return this.stockNumSafeList;}

        private java.math.BigDecimal stockNumSafeSt;

        private java.math.BigDecimal stockNumSafeEd;

        public java.math.BigDecimal getStockNumSafeSt(){return this.stockNumSafeSt;}

        public java.math.BigDecimal getStockNumSafeEd(){return this.stockNumSafeEd;}

        private List<String> materialTypeList;

        public List<String> getMaterialTypeList(){return this.materialTypeList;}


        private List<String> fuzzyMaterialType;

        public List<String> getFuzzyMaterialType(){return this.fuzzyMaterialType;}

        private List<String> rightFuzzyMaterialType;

        public List<String> getRightFuzzyMaterialType(){return this.rightFuzzyMaterialType;}
        private List<Integer> initialUserIdList;

        public List<Integer> getInitialUserIdList(){return this.initialUserIdList;}

        private Integer initialUserIdSt;

        private Integer initialUserIdEd;

        public Integer getInitialUserIdSt(){return this.initialUserIdSt;}

        public Integer getInitialUserIdEd(){return this.initialUserIdEd;}

        private List<String> initialTimeList;

        public List<String> getInitialTimeList(){return this.initialTimeList;}


        private List<String> fuzzyInitialTime;

        public List<String> getFuzzyInitialTime(){return this.fuzzyInitialTime;}

        private List<String> rightFuzzyInitialTime;

        public List<String> getRightFuzzyInitialTime(){return this.rightFuzzyInitialTime;}
        private List<String> materialContractList;

        public List<String> getMaterialContractList(){return this.materialContractList;}


        private List<String> fuzzyMaterialContract;

        public List<String> getFuzzyMaterialContract(){return this.fuzzyMaterialContract;}

        private List<String> rightFuzzyMaterialContract;

        public List<String> getRightFuzzyMaterialContract(){return this.rightFuzzyMaterialContract;}
        private List<String> materialBrandList;

        public List<String> getMaterialBrandList(){return this.materialBrandList;}


        private List<String> fuzzyMaterialBrand;

        public List<String> getFuzzyMaterialBrand(){return this.fuzzyMaterialBrand;}

        private List<String> rightFuzzyMaterialBrand;

        public List<String> getRightFuzzyMaterialBrand(){return this.rightFuzzyMaterialBrand;}
        private List<String> materialDescriptionList;

        public List<String> getMaterialDescriptionList(){return this.materialDescriptionList;}


        private List<String> fuzzyMaterialDescription;

        public List<String> getFuzzyMaterialDescription(){return this.fuzzyMaterialDescription;}

        private List<String> rightFuzzyMaterialDescription;

        public List<String> getRightFuzzyMaterialDescription(){return this.rightFuzzyMaterialDescription;}
        private List<java.math.BigDecimal> materialPriceList;

        public List<java.math.BigDecimal> getMaterialPriceList(){return this.materialPriceList;}

        private java.math.BigDecimal materialPriceSt;

        private java.math.BigDecimal materialPriceEd;

        public java.math.BigDecimal getMaterialPriceSt(){return this.materialPriceSt;}

        public java.math.BigDecimal getMaterialPriceEd(){return this.materialPriceEd;}


        public ConditionBuilder materialIdBetWeen(Long materialIdSt,Long materialIdEd){
            this.materialIdSt = materialIdSt;
            this.materialIdEd = materialIdEd;
            return this;
        }

        public ConditionBuilder materialIdGreaterEqThan(Long materialIdSt){
            this.materialIdSt = materialIdSt;
            return this;
        }
        public ConditionBuilder materialIdLessEqThan(Long materialIdEd){
            this.materialIdEd = materialIdEd;
            return this;
        }


        public ConditionBuilder materialIdList(Long ... materialId){
            this.materialIdList = solveNullList(materialId);
            return this;
        }

        public ConditionBuilder materialIdList(List<Long> materialId){
            this.materialIdList = materialId;
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

        public ConditionBuilder fuzzyMaterialOrderMinNum (List<String> fuzzyMaterialOrderMinNum){
            this.fuzzyMaterialOrderMinNum = fuzzyMaterialOrderMinNum;
            return this;
        }

        public ConditionBuilder fuzzyMaterialOrderMinNum (String ... fuzzyMaterialOrderMinNum){
            this.fuzzyMaterialOrderMinNum = solveNullList(fuzzyMaterialOrderMinNum);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialOrderMinNum (List<String> rightFuzzyMaterialOrderMinNum){
            this.rightFuzzyMaterialOrderMinNum = rightFuzzyMaterialOrderMinNum;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialOrderMinNum (String ... rightFuzzyMaterialOrderMinNum){
            this.rightFuzzyMaterialOrderMinNum = solveNullList(rightFuzzyMaterialOrderMinNum);
            return this;
        }

        public ConditionBuilder materialOrderMinNumList(String ... materialOrderMinNum){
            this.materialOrderMinNumList = solveNullList(materialOrderMinNum);
            return this;
        }

        public ConditionBuilder materialOrderMinNumList(List<String> materialOrderMinNum){
            this.materialOrderMinNumList = materialOrderMinNum;
            return this;
        }

        public ConditionBuilder fuzzyMaterialLeadTime (List<String> fuzzyMaterialLeadTime){
            this.fuzzyMaterialLeadTime = fuzzyMaterialLeadTime;
            return this;
        }

        public ConditionBuilder fuzzyMaterialLeadTime (String ... fuzzyMaterialLeadTime){
            this.fuzzyMaterialLeadTime = solveNullList(fuzzyMaterialLeadTime);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialLeadTime (List<String> rightFuzzyMaterialLeadTime){
            this.rightFuzzyMaterialLeadTime = rightFuzzyMaterialLeadTime;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialLeadTime (String ... rightFuzzyMaterialLeadTime){
            this.rightFuzzyMaterialLeadTime = solveNullList(rightFuzzyMaterialLeadTime);
            return this;
        }

        public ConditionBuilder materialLeadTimeList(String ... materialLeadTime){
            this.materialLeadTimeList = solveNullList(materialLeadTime);
            return this;
        }

        public ConditionBuilder materialLeadTimeList(List<String> materialLeadTime){
            this.materialLeadTimeList = materialLeadTime;
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

        public ConditionBuilder fuzzyShelfCode (List<String> fuzzyShelfCode){
            this.fuzzyShelfCode = fuzzyShelfCode;
            return this;
        }

        public ConditionBuilder fuzzyShelfCode (String ... fuzzyShelfCode){
            this.fuzzyShelfCode = solveNullList(fuzzyShelfCode);
            return this;
        }

        public ConditionBuilder rightFuzzyShelfCode (List<String> rightFuzzyShelfCode){
            this.rightFuzzyShelfCode = rightFuzzyShelfCode;
            return this;
        }

        public ConditionBuilder rightFuzzyShelfCode (String ... rightFuzzyShelfCode){
            this.rightFuzzyShelfCode = solveNullList(rightFuzzyShelfCode);
            return this;
        }

        public ConditionBuilder shelfCodeList(String ... shelfCode){
            this.shelfCodeList = solveNullList(shelfCode);
            return this;
        }

        public ConditionBuilder shelfCodeList(List<String> shelfCode){
            this.shelfCodeList = shelfCode;
            return this;
        }

        public ConditionBuilder fuzzyPackageSpecs (List<String> fuzzyPackageSpecs){
            this.fuzzyPackageSpecs = fuzzyPackageSpecs;
            return this;
        }

        public ConditionBuilder fuzzyPackageSpecs (String ... fuzzyPackageSpecs){
            this.fuzzyPackageSpecs = solveNullList(fuzzyPackageSpecs);
            return this;
        }

        public ConditionBuilder rightFuzzyPackageSpecs (List<String> rightFuzzyPackageSpecs){
            this.rightFuzzyPackageSpecs = rightFuzzyPackageSpecs;
            return this;
        }

        public ConditionBuilder rightFuzzyPackageSpecs (String ... rightFuzzyPackageSpecs){
            this.rightFuzzyPackageSpecs = solveNullList(rightFuzzyPackageSpecs);
            return this;
        }

        public ConditionBuilder packageSpecsList(String ... packageSpecs){
            this.packageSpecsList = solveNullList(packageSpecs);
            return this;
        }

        public ConditionBuilder packageSpecsList(List<String> packageSpecs){
            this.packageSpecsList = packageSpecs;
            return this;
        }

        public ConditionBuilder fuzzyInitialDepartment (List<String> fuzzyInitialDepartment){
            this.fuzzyInitialDepartment = fuzzyInitialDepartment;
            return this;
        }

        public ConditionBuilder fuzzyInitialDepartment (String ... fuzzyInitialDepartment){
            this.fuzzyInitialDepartment = solveNullList(fuzzyInitialDepartment);
            return this;
        }

        public ConditionBuilder rightFuzzyInitialDepartment (List<String> rightFuzzyInitialDepartment){
            this.rightFuzzyInitialDepartment = rightFuzzyInitialDepartment;
            return this;
        }

        public ConditionBuilder rightFuzzyInitialDepartment (String ... rightFuzzyInitialDepartment){
            this.rightFuzzyInitialDepartment = solveNullList(rightFuzzyInitialDepartment);
            return this;
        }

        public ConditionBuilder initialDepartmentList(String ... initialDepartment){
            this.initialDepartmentList = solveNullList(initialDepartment);
            return this;
        }

        public ConditionBuilder initialDepartmentList(List<String> initialDepartment){
            this.initialDepartmentList = initialDepartment;
            return this;
        }

        public ConditionBuilder fuzzyMaterialSignal (List<String> fuzzyMaterialSignal){
            this.fuzzyMaterialSignal = fuzzyMaterialSignal;
            return this;
        }

        public ConditionBuilder fuzzyMaterialSignal (String ... fuzzyMaterialSignal){
            this.fuzzyMaterialSignal = solveNullList(fuzzyMaterialSignal);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialSignal (List<String> rightFuzzyMaterialSignal){
            this.rightFuzzyMaterialSignal = rightFuzzyMaterialSignal;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialSignal (String ... rightFuzzyMaterialSignal){
            this.rightFuzzyMaterialSignal = solveNullList(rightFuzzyMaterialSignal);
            return this;
        }

        public ConditionBuilder materialSignalList(String ... materialSignal){
            this.materialSignalList = solveNullList(materialSignal);
            return this;
        }

        public ConditionBuilder materialSignalList(List<String> materialSignal){
            this.materialSignalList = materialSignal;
            return this;
        }

        public ConditionBuilder stockNumNowBetWeen(java.math.BigDecimal stockNumNowSt,java.math.BigDecimal stockNumNowEd){
            this.stockNumNowSt = stockNumNowSt;
            this.stockNumNowEd = stockNumNowEd;
            return this;
        }

        public ConditionBuilder stockNumNowGreaterEqThan(java.math.BigDecimal stockNumNowSt){
            this.stockNumNowSt = stockNumNowSt;
            return this;
        }
        public ConditionBuilder stockNumNowLessEqThan(java.math.BigDecimal stockNumNowEd){
            this.stockNumNowEd = stockNumNowEd;
            return this;
        }


        public ConditionBuilder stockNumNowList(java.math.BigDecimal ... stockNumNow){
            this.stockNumNowList = solveNullList(stockNumNow);
            return this;
        }

        public ConditionBuilder stockNumNowList(List<java.math.BigDecimal> stockNumNow){
            this.stockNumNowList = stockNumNow;
            return this;
        }

        public ConditionBuilder fuzzyLastUpdated (List<String> fuzzyLastUpdated){
            this.fuzzyLastUpdated = fuzzyLastUpdated;
            return this;
        }

        public ConditionBuilder fuzzyLastUpdated (String ... fuzzyLastUpdated){
            this.fuzzyLastUpdated = solveNullList(fuzzyLastUpdated);
            return this;
        }

        public ConditionBuilder rightFuzzyLastUpdated (List<String> rightFuzzyLastUpdated){
            this.rightFuzzyLastUpdated = rightFuzzyLastUpdated;
            return this;
        }

        public ConditionBuilder rightFuzzyLastUpdated (String ... rightFuzzyLastUpdated){
            this.rightFuzzyLastUpdated = solveNullList(rightFuzzyLastUpdated);
            return this;
        }

        public ConditionBuilder lastUpdatedList(String ... lastUpdated){
            this.lastUpdatedList = solveNullList(lastUpdated);
            return this;
        }

        public ConditionBuilder lastUpdatedList(List<String> lastUpdated){
            this.lastUpdatedList = lastUpdated;
            return this;
        }

        public ConditionBuilder stockNumStaticBetWeen(java.math.BigDecimal stockNumStaticSt,java.math.BigDecimal stockNumStaticEd){
            this.stockNumStaticSt = stockNumStaticSt;
            this.stockNumStaticEd = stockNumStaticEd;
            return this;
        }

        public ConditionBuilder stockNumStaticGreaterEqThan(java.math.BigDecimal stockNumStaticSt){
            this.stockNumStaticSt = stockNumStaticSt;
            return this;
        }
        public ConditionBuilder stockNumStaticLessEqThan(java.math.BigDecimal stockNumStaticEd){
            this.stockNumStaticEd = stockNumStaticEd;
            return this;
        }


        public ConditionBuilder stockNumStaticList(java.math.BigDecimal ... stockNumStatic){
            this.stockNumStaticList = solveNullList(stockNumStatic);
            return this;
        }

        public ConditionBuilder stockNumStaticList(List<java.math.BigDecimal> stockNumStatic){
            this.stockNumStaticList = stockNumStatic;
            return this;
        }

        public ConditionBuilder stockNumMaxBetWeen(java.math.BigDecimal stockNumMaxSt,java.math.BigDecimal stockNumMaxEd){
            this.stockNumMaxSt = stockNumMaxSt;
            this.stockNumMaxEd = stockNumMaxEd;
            return this;
        }

        public ConditionBuilder stockNumMaxGreaterEqThan(java.math.BigDecimal stockNumMaxSt){
            this.stockNumMaxSt = stockNumMaxSt;
            return this;
        }
        public ConditionBuilder stockNumMaxLessEqThan(java.math.BigDecimal stockNumMaxEd){
            this.stockNumMaxEd = stockNumMaxEd;
            return this;
        }


        public ConditionBuilder stockNumMaxList(java.math.BigDecimal ... stockNumMax){
            this.stockNumMaxList = solveNullList(stockNumMax);
            return this;
        }

        public ConditionBuilder stockNumMaxList(List<java.math.BigDecimal> stockNumMax){
            this.stockNumMaxList = stockNumMax;
            return this;
        }

        public ConditionBuilder stockNumSafeBetWeen(java.math.BigDecimal stockNumSafeSt,java.math.BigDecimal stockNumSafeEd){
            this.stockNumSafeSt = stockNumSafeSt;
            this.stockNumSafeEd = stockNumSafeEd;
            return this;
        }

        public ConditionBuilder stockNumSafeGreaterEqThan(java.math.BigDecimal stockNumSafeSt){
            this.stockNumSafeSt = stockNumSafeSt;
            return this;
        }
        public ConditionBuilder stockNumSafeLessEqThan(java.math.BigDecimal stockNumSafeEd){
            this.stockNumSafeEd = stockNumSafeEd;
            return this;
        }


        public ConditionBuilder stockNumSafeList(java.math.BigDecimal ... stockNumSafe){
            this.stockNumSafeList = solveNullList(stockNumSafe);
            return this;
        }

        public ConditionBuilder stockNumSafeList(List<java.math.BigDecimal> stockNumSafe){
            this.stockNumSafeList = stockNumSafe;
            return this;
        }

        public ConditionBuilder fuzzyMaterialType (List<String> fuzzyMaterialType){
            this.fuzzyMaterialType = fuzzyMaterialType;
            return this;
        }

        public ConditionBuilder fuzzyMaterialType (String ... fuzzyMaterialType){
            this.fuzzyMaterialType = solveNullList(fuzzyMaterialType);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialType (List<String> rightFuzzyMaterialType){
            this.rightFuzzyMaterialType = rightFuzzyMaterialType;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialType (String ... rightFuzzyMaterialType){
            this.rightFuzzyMaterialType = solveNullList(rightFuzzyMaterialType);
            return this;
        }

        public ConditionBuilder materialTypeList(String ... materialType){
            this.materialTypeList = solveNullList(materialType);
            return this;
        }

        public ConditionBuilder materialTypeList(List<String> materialType){
            this.materialTypeList = materialType;
            return this;
        }

        public ConditionBuilder initialUserIdBetWeen(Integer initialUserIdSt,Integer initialUserIdEd){
            this.initialUserIdSt = initialUserIdSt;
            this.initialUserIdEd = initialUserIdEd;
            return this;
        }

        public ConditionBuilder initialUserIdGreaterEqThan(Integer initialUserIdSt){
            this.initialUserIdSt = initialUserIdSt;
            return this;
        }
        public ConditionBuilder initialUserIdLessEqThan(Integer initialUserIdEd){
            this.initialUserIdEd = initialUserIdEd;
            return this;
        }


        public ConditionBuilder initialUserIdList(Integer ... initialUserId){
            this.initialUserIdList = solveNullList(initialUserId);
            return this;
        }

        public ConditionBuilder initialUserIdList(List<Integer> initialUserId){
            this.initialUserIdList = initialUserId;
            return this;
        }

        public ConditionBuilder fuzzyInitialTime (List<String> fuzzyInitialTime){
            this.fuzzyInitialTime = fuzzyInitialTime;
            return this;
        }

        public ConditionBuilder fuzzyInitialTime (String ... fuzzyInitialTime){
            this.fuzzyInitialTime = solveNullList(fuzzyInitialTime);
            return this;
        }

        public ConditionBuilder rightFuzzyInitialTime (List<String> rightFuzzyInitialTime){
            this.rightFuzzyInitialTime = rightFuzzyInitialTime;
            return this;
        }

        public ConditionBuilder rightFuzzyInitialTime (String ... rightFuzzyInitialTime){
            this.rightFuzzyInitialTime = solveNullList(rightFuzzyInitialTime);
            return this;
        }

        public ConditionBuilder initialTimeList(String ... initialTime){
            this.initialTimeList = solveNullList(initialTime);
            return this;
        }

        public ConditionBuilder initialTimeList(List<String> initialTime){
            this.initialTimeList = initialTime;
            return this;
        }

        public ConditionBuilder fuzzyMaterialContract (List<String> fuzzyMaterialContract){
            this.fuzzyMaterialContract = fuzzyMaterialContract;
            return this;
        }

        public ConditionBuilder fuzzyMaterialContract (String ... fuzzyMaterialContract){
            this.fuzzyMaterialContract = solveNullList(fuzzyMaterialContract);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialContract (List<String> rightFuzzyMaterialContract){
            this.rightFuzzyMaterialContract = rightFuzzyMaterialContract;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialContract (String ... rightFuzzyMaterialContract){
            this.rightFuzzyMaterialContract = solveNullList(rightFuzzyMaterialContract);
            return this;
        }

        public ConditionBuilder materialContractList(String ... materialContract){
            this.materialContractList = solveNullList(materialContract);
            return this;
        }

        public ConditionBuilder materialContractList(List<String> materialContract){
            this.materialContractList = materialContract;
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

        public ConditionBuilder fuzzyMaterialDescription (List<String> fuzzyMaterialDescription){
            this.fuzzyMaterialDescription = fuzzyMaterialDescription;
            return this;
        }

        public ConditionBuilder fuzzyMaterialDescription (String ... fuzzyMaterialDescription){
            this.fuzzyMaterialDescription = solveNullList(fuzzyMaterialDescription);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialDescription (List<String> rightFuzzyMaterialDescription){
            this.rightFuzzyMaterialDescription = rightFuzzyMaterialDescription;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialDescription (String ... rightFuzzyMaterialDescription){
            this.rightFuzzyMaterialDescription = solveNullList(rightFuzzyMaterialDescription);
            return this;
        }

        public ConditionBuilder materialDescriptionList(String ... materialDescription){
            this.materialDescriptionList = solveNullList(materialDescription);
            return this;
        }

        public ConditionBuilder materialDescriptionList(List<String> materialDescription){
            this.materialDescriptionList = materialDescription;
            return this;
        }

        public ConditionBuilder materialPriceBetWeen(java.math.BigDecimal materialPriceSt,java.math.BigDecimal materialPriceEd){
            this.materialPriceSt = materialPriceSt;
            this.materialPriceEd = materialPriceEd;
            return this;
        }

        public ConditionBuilder materialPriceGreaterEqThan(java.math.BigDecimal materialPriceSt){
            this.materialPriceSt = materialPriceSt;
            return this;
        }
        public ConditionBuilder materialPriceLessEqThan(java.math.BigDecimal materialPriceEd){
            this.materialPriceEd = materialPriceEd;
            return this;
        }


        public ConditionBuilder materialPriceList(java.math.BigDecimal ... materialPrice){
            this.materialPriceList = solveNullList(materialPrice);
            return this;
        }

        public ConditionBuilder materialPriceList(List<java.math.BigDecimal> materialPrice){
            this.materialPriceList = materialPrice;
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

        private Material obj;

        public Builder(){
            this.obj = new Material();
        }

        public Builder materialId(Long materialId){
            this.obj.setMaterialId(materialId);
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
        public Builder materialSpecs(String materialSpecs){
            this.obj.setMaterialSpecs(materialSpecs);
            return this;
        }
        public Builder materialUnit(String materialUnit){
            this.obj.setMaterialUnit(materialUnit);
            return this;
        }
        public Builder supplierCode(String supplierCode){
            this.obj.setSupplierCode(supplierCode);
            return this;
        }
        public Builder supplierName(String supplierName){
            this.obj.setSupplierName(supplierName);
            return this;
        }
        public Builder materialOrderMinNum(String materialOrderMinNum){
            this.obj.setMaterialOrderMinNum(materialOrderMinNum);
            return this;
        }
        public Builder materialLeadTime(String materialLeadTime){
            this.obj.setMaterialLeadTime(materialLeadTime);
            return this;
        }
        public Builder warehouseCode(String warehouseCode){
            this.obj.setWarehouseCode(warehouseCode);
            return this;
        }
        public Builder shelfCode(String shelfCode){
            this.obj.setShelfCode(shelfCode);
            return this;
        }
        public Builder packageSpecs(String packageSpecs){
            this.obj.setPackageSpecs(packageSpecs);
            return this;
        }
        public Builder initialDepartment(String initialDepartment){
            this.obj.setInitialDepartment(initialDepartment);
            return this;
        }
        public Builder materialSignal(String materialSignal){
            this.obj.setMaterialSignal(materialSignal);
            return this;
        }
        public Builder stockNumNow(java.math.BigDecimal stockNumNow){
            this.obj.setStockNumNow(stockNumNow);
            return this;
        }
        public Builder lastUpdated(String lastUpdated){
            this.obj.setLastUpdated(lastUpdated);
            return this;
        }
        public Builder stockNumStatic(java.math.BigDecimal stockNumStatic){
            this.obj.setStockNumStatic(stockNumStatic);
            return this;
        }
        public Builder stockNumMax(java.math.BigDecimal stockNumMax){
            this.obj.setStockNumMax(stockNumMax);
            return this;
        }
        public Builder stockNumSafe(java.math.BigDecimal stockNumSafe){
            this.obj.setStockNumSafe(stockNumSafe);
            return this;
        }
        public Builder materialType(String materialType){
            this.obj.setMaterialType(materialType);
            return this;
        }
        public Builder initialUserId(Integer initialUserId){
            this.obj.setInitialUserId(initialUserId);
            return this;
        }
        public Builder initialTime(String initialTime){
            this.obj.setInitialTime(initialTime);
            return this;
        }
        public Builder materialContract(String materialContract){
            this.obj.setMaterialContract(materialContract);
            return this;
        }
        public Builder materialBrand(String materialBrand){
            this.obj.setMaterialBrand(materialBrand);
            return this;
        }
        public Builder materialDescription(String materialDescription){
            this.obj.setMaterialDescription(materialDescription);
            return this;
        }
        public Builder materialPrice(java.math.BigDecimal materialPrice){
            this.obj.setMaterialPrice(materialPrice);
            return this;
        }
        public Material build(){return obj;}
    }

}
