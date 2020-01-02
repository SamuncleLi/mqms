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
public class Warehousing implements Serializable {

    private static final long serialVersionUID = 1569639727257L;


    /**
    * 主键
    * 调整订单Id
    * isNullAble:0
    */
    private Long warehousingId;

    /**
    * 调整订单Id
    * isNullAble:1,defaultVal:
    */
    private String warehousingCode;

    /**
    * 调整订单号行号
    * isNullAble:1,defaultVal:
    */
    private String warehousingLineCode;

    /**
    * 调整原因
    * isNullAble:1,defaultVal:
    */
    private String warehousingReasonCode;

    /**
    * 调整原因描述
    * isNullAble:1
    */
    private String warehousingReasonDescription;

    /**
    * 事务处理日期
    * isNullAble:1,defaultVal:
    */
    private String warehousingAffairsDate;

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
    * 单位
    * isNullAble:1,defaultVal:
    */
    private String materialUnit;

    /**
    * 批次
    * isNullAble:1,defaultVal:
    */
    private String warehousingBatch;

    /**
    * 序列号
    * isNullAble:1,defaultVal:
    */
    private String warehousingSerie;

    /**
    * 序列号
    * isNullAble:1,defaultVal:
    */
    private String warehouseCode;

    /**
    * 事务处理标识
    * isNullAble:1,defaultVal:
    */
    private String warehousingAffairsSymbol;

    /**
    * 数量
    * isNullAble:1
    */
    private Integer warehousingNum;

    /**
    * 头文本
    * isNullAble:1,defaultVal:
    */
    private String warehousingHeadText;

    /**
    * 行文本
    * isNullAble:1,defaultVal:
    */
    private String warehousingLineText;

    /**
    * 申请人
    * isNullAble:1
    */
    private Integer warehousingInitialUserId;

    /**
    * 申请时间
    * isNullAble:1,defaultVal:
    */
    private String warehousingInitialTime;

    /**
    * 申请状态
    * isNullAble:1,defaultVal:
    */
    private String warehousingInitialState;

    /**
    * 
    * isNullAble:1
    */
    private String warehousingInitialUserName;

    /**
    * 
    * isNullAble:1
    */
    private String warehousingInitialDepartment;

    /**
    * 物料是否已签开口合同
    * isNullAble:1
    */
    private String materialContractType;

    /**
    * 物料管理类型
    * isNullAble:1
    */
    private String materialManagementType;

    /**
    * 
    * isNullAble:1
    */
    private String variables;

    /**
    * 
    * isNullAble:1
    */
    private String warehousingDescription;

    /**
    * 申请部门代码
    * isNullAble:1
    */
    private String warehousingDepartmentCode;

    /**
    * 
    * isNullAble:1
    */
    private String shelfCode;

    /**
    * 
    * isNullAble:1
    */
    private Long simpleApplicationObjectId;


    public void setWarehousingId(Long warehousingId){this.warehousingId = warehousingId;}

    public Long getWarehousingId(){return this.warehousingId;}

    public void setWarehousingCode(String warehousingCode){this.warehousingCode = warehousingCode;}

    public String getWarehousingCode(){return this.warehousingCode;}

    public void setWarehousingLineCode(String warehousingLineCode){this.warehousingLineCode = warehousingLineCode;}

    public String getWarehousingLineCode(){return this.warehousingLineCode;}

    public void setWarehousingReasonCode(String warehousingReasonCode){this.warehousingReasonCode = warehousingReasonCode;}

    public String getWarehousingReasonCode(){return this.warehousingReasonCode;}

    public void setWarehousingReasonDescription(String warehousingReasonDescription){this.warehousingReasonDescription = warehousingReasonDescription;}

    public String getWarehousingReasonDescription(){return this.warehousingReasonDescription;}

    public void setWarehousingAffairsDate(String warehousingAffairsDate){this.warehousingAffairsDate = warehousingAffairsDate;}

    public String getWarehousingAffairsDate(){return this.warehousingAffairsDate;}

    public void setMaterialCode(String materialCode){this.materialCode = materialCode;}

    public String getMaterialCode(){return this.materialCode;}

    public void setMaterialName(String materialName){this.materialName = materialName;}

    public String getMaterialName(){return this.materialName;}

    public void setMaterialUnit(String materialUnit){this.materialUnit = materialUnit;}

    public String getMaterialUnit(){return this.materialUnit;}

    public void setWarehousingBatch(String warehousingBatch){this.warehousingBatch = warehousingBatch;}

    public String getWarehousingBatch(){return this.warehousingBatch;}

    public void setWarehousingSerie(String warehousingSerie){this.warehousingSerie = warehousingSerie;}

    public String getWarehousingSerie(){return this.warehousingSerie;}

    public void setWarehouseCode(String warehouseCode){this.warehouseCode = warehouseCode;}

    public String getWarehouseCode(){return this.warehouseCode;}

    public void setWarehousingAffairsSymbol(String warehousingAffairsSymbol){this.warehousingAffairsSymbol = warehousingAffairsSymbol;}

    public String getWarehousingAffairsSymbol(){return this.warehousingAffairsSymbol;}

    public void setWarehousingNum(Integer warehousingNum){this.warehousingNum = warehousingNum;}

    public Integer getWarehousingNum(){return this.warehousingNum;}

    public void setWarehousingHeadText(String warehousingHeadText){this.warehousingHeadText = warehousingHeadText;}

    public String getWarehousingHeadText(){return this.warehousingHeadText;}

    public void setWarehousingLineText(String warehousingLineText){this.warehousingLineText = warehousingLineText;}

    public String getWarehousingLineText(){return this.warehousingLineText;}

    public void setWarehousingInitialUserId(Integer warehousingInitialUserId){this.warehousingInitialUserId = warehousingInitialUserId;}

    public Integer getWarehousingInitialUserId(){return this.warehousingInitialUserId;}

    public void setWarehousingInitialTime(String warehousingInitialTime){this.warehousingInitialTime = warehousingInitialTime;}

    public String getWarehousingInitialTime(){return this.warehousingInitialTime;}

    public void setWarehousingInitialState(String warehousingInitialState){this.warehousingInitialState = warehousingInitialState;}

    public String getWarehousingInitialState(){return this.warehousingInitialState;}

    public void setWarehousingInitialUserName(String warehousingInitialUserName){this.warehousingInitialUserName = warehousingInitialUserName;}

    public String getWarehousingInitialUserName(){return this.warehousingInitialUserName;}

    public void setWarehousingInitialDepartment(String warehousingInitialDepartment){this.warehousingInitialDepartment = warehousingInitialDepartment;}

    public String getWarehousingInitialDepartment(){return this.warehousingInitialDepartment;}

    public void setMaterialContractType(String materialContractType){this.materialContractType = materialContractType;}

    public String getMaterialContractType(){return this.materialContractType;}

    public void setMaterialManagementType(String materialManagementType){this.materialManagementType = materialManagementType;}

    public String getMaterialManagementType(){return this.materialManagementType;}

    public void setVariables(String variables){this.variables = variables;}

    public String getVariables(){return this.variables;}

    public void setWarehousingDescription(String warehousingDescription){this.warehousingDescription = warehousingDescription;}

    public String getWarehousingDescription(){return this.warehousingDescription;}

    public void setWarehousingDepartmentCode(String warehousingDepartmentCode){this.warehousingDepartmentCode = warehousingDepartmentCode;}

    public String getWarehousingDepartmentCode(){return this.warehousingDepartmentCode;}

    public void setShelfCode(String shelfCode){this.shelfCode = shelfCode;}

    public String getShelfCode(){return this.shelfCode;}

    public void setSimpleApplicationObjectId(Long simpleApplicationObjectId){this.simpleApplicationObjectId = simpleApplicationObjectId;}

    public Long getSimpleApplicationObjectId(){return this.simpleApplicationObjectId;}
    @Override
    public String toString() {
        return "Warehousing{" +
                "warehousingId='" + warehousingId + '\'' +
                "warehousingCode='" + warehousingCode + '\'' +
                "warehousingLineCode='" + warehousingLineCode + '\'' +
                "warehousingReasonCode='" + warehousingReasonCode + '\'' +
                "warehousingReasonDescription='" + warehousingReasonDescription + '\'' +
                "warehousingAffairsDate='" + warehousingAffairsDate + '\'' +
                "materialCode='" + materialCode + '\'' +
                "materialName='" + materialName + '\'' +
                "materialUnit='" + materialUnit + '\'' +
                "warehousingBatch='" + warehousingBatch + '\'' +
                "warehousingSerie='" + warehousingSerie + '\'' +
                "warehouseCode='" + warehouseCode + '\'' +
                "warehousingAffairsSymbol='" + warehousingAffairsSymbol + '\'' +
                "warehousingNum='" + warehousingNum + '\'' +
                "warehousingHeadText='" + warehousingHeadText + '\'' +
                "warehousingLineText='" + warehousingLineText + '\'' +
                "warehousingInitialUserId='" + warehousingInitialUserId + '\'' +
                "warehousingInitialTime='" + warehousingInitialTime + '\'' +
                "warehousingInitialState='" + warehousingInitialState + '\'' +
                "warehousingInitialUserName='" + warehousingInitialUserName + '\'' +
                "warehousingInitialDepartment='" + warehousingInitialDepartment + '\'' +
                "materialContractType='" + materialContractType + '\'' +
                "materialManagementType='" + materialManagementType + '\'' +
                "variables='" + variables + '\'' +
                "warehousingDescription='" + warehousingDescription + '\'' +
                "warehousingDepartmentCode='" + warehousingDepartmentCode + '\'' +
                "shelfCode='" + shelfCode + '\'' +
                "simpleApplicationObjectId='" + simpleApplicationObjectId + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Warehousing set;

        private ConditionBuilder where;

        public UpdateBuilder set(Warehousing set){
            this.set = set;
            return this;
        }

        public Warehousing getSet(){
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

    public static class QueryBuilder extends Warehousing{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Long> warehousingIdList;

        public List<Long> getWarehousingIdList(){return this.warehousingIdList;}

        private Long warehousingIdSt;

        private Long warehousingIdEd;

        public Long getWarehousingIdSt(){return this.warehousingIdSt;}

        public Long getWarehousingIdEd(){return this.warehousingIdEd;}

        private List<String> warehousingCodeList;

        public List<String> getWarehousingCodeList(){return this.warehousingCodeList;}


        private List<String> fuzzyWarehousingCode;

        public List<String> getFuzzyWarehousingCode(){return this.fuzzyWarehousingCode;}

        private List<String> rightFuzzyWarehousingCode;

        public List<String> getRightFuzzyWarehousingCode(){return this.rightFuzzyWarehousingCode;}
        private List<String> warehousingLineCodeList;

        public List<String> getWarehousingLineCodeList(){return this.warehousingLineCodeList;}


        private List<String> fuzzyWarehousingLineCode;

        public List<String> getFuzzyWarehousingLineCode(){return this.fuzzyWarehousingLineCode;}

        private List<String> rightFuzzyWarehousingLineCode;

        public List<String> getRightFuzzyWarehousingLineCode(){return this.rightFuzzyWarehousingLineCode;}
        private List<String> warehousingReasonCodeList;

        public List<String> getWarehousingReasonCodeList(){return this.warehousingReasonCodeList;}


        private List<String> fuzzyWarehousingReasonCode;

        public List<String> getFuzzyWarehousingReasonCode(){return this.fuzzyWarehousingReasonCode;}

        private List<String> rightFuzzyWarehousingReasonCode;

        public List<String> getRightFuzzyWarehousingReasonCode(){return this.rightFuzzyWarehousingReasonCode;}
        private List<String> warehousingReasonDescriptionList;

        public List<String> getWarehousingReasonDescriptionList(){return this.warehousingReasonDescriptionList;}


        private List<String> fuzzyWarehousingReasonDescription;

        public List<String> getFuzzyWarehousingReasonDescription(){return this.fuzzyWarehousingReasonDescription;}

        private List<String> rightFuzzyWarehousingReasonDescription;

        public List<String> getRightFuzzyWarehousingReasonDescription(){return this.rightFuzzyWarehousingReasonDescription;}
        private List<String> warehousingAffairsDateList;

        public List<String> getWarehousingAffairsDateList(){return this.warehousingAffairsDateList;}


        private List<String> fuzzyWarehousingAffairsDate;

        public List<String> getFuzzyWarehousingAffairsDate(){return this.fuzzyWarehousingAffairsDate;}

        private List<String> rightFuzzyWarehousingAffairsDate;

        public List<String> getRightFuzzyWarehousingAffairsDate(){return this.rightFuzzyWarehousingAffairsDate;}
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
        private List<String> materialUnitList;

        public List<String> getMaterialUnitList(){return this.materialUnitList;}


        private List<String> fuzzyMaterialUnit;

        public List<String> getFuzzyMaterialUnit(){return this.fuzzyMaterialUnit;}

        private List<String> rightFuzzyMaterialUnit;

        public List<String> getRightFuzzyMaterialUnit(){return this.rightFuzzyMaterialUnit;}
        private List<String> warehousingBatchList;

        public List<String> getWarehousingBatchList(){return this.warehousingBatchList;}


        private List<String> fuzzyWarehousingBatch;

        public List<String> getFuzzyWarehousingBatch(){return this.fuzzyWarehousingBatch;}

        private List<String> rightFuzzyWarehousingBatch;

        public List<String> getRightFuzzyWarehousingBatch(){return this.rightFuzzyWarehousingBatch;}
        private List<String> warehousingSerieList;

        public List<String> getWarehousingSerieList(){return this.warehousingSerieList;}


        private List<String> fuzzyWarehousingSerie;

        public List<String> getFuzzyWarehousingSerie(){return this.fuzzyWarehousingSerie;}

        private List<String> rightFuzzyWarehousingSerie;

        public List<String> getRightFuzzyWarehousingSerie(){return this.rightFuzzyWarehousingSerie;}
        private List<String> warehouseCodeList;

        public List<String> getWarehouseCodeList(){return this.warehouseCodeList;}


        private List<String> fuzzyWarehouseCode;

        public List<String> getFuzzyWarehouseCode(){return this.fuzzyWarehouseCode;}

        private List<String> rightFuzzyWarehouseCode;

        public List<String> getRightFuzzyWarehouseCode(){return this.rightFuzzyWarehouseCode;}
        private List<String> warehousingAffairsSymbolList;

        public List<String> getWarehousingAffairsSymbolList(){return this.warehousingAffairsSymbolList;}


        private List<String> fuzzyWarehousingAffairsSymbol;

        public List<String> getFuzzyWarehousingAffairsSymbol(){return this.fuzzyWarehousingAffairsSymbol;}

        private List<String> rightFuzzyWarehousingAffairsSymbol;

        public List<String> getRightFuzzyWarehousingAffairsSymbol(){return this.rightFuzzyWarehousingAffairsSymbol;}
        private List<Integer> warehousingNumList;

        public List<Integer> getWarehousingNumList(){return this.warehousingNumList;}

        private Integer warehousingNumSt;

        private Integer warehousingNumEd;

        public Integer getWarehousingNumSt(){return this.warehousingNumSt;}

        public Integer getWarehousingNumEd(){return this.warehousingNumEd;}

        private List<String> warehousingHeadTextList;

        public List<String> getWarehousingHeadTextList(){return this.warehousingHeadTextList;}


        private List<String> fuzzyWarehousingHeadText;

        public List<String> getFuzzyWarehousingHeadText(){return this.fuzzyWarehousingHeadText;}

        private List<String> rightFuzzyWarehousingHeadText;

        public List<String> getRightFuzzyWarehousingHeadText(){return this.rightFuzzyWarehousingHeadText;}
        private List<String> warehousingLineTextList;

        public List<String> getWarehousingLineTextList(){return this.warehousingLineTextList;}


        private List<String> fuzzyWarehousingLineText;

        public List<String> getFuzzyWarehousingLineText(){return this.fuzzyWarehousingLineText;}

        private List<String> rightFuzzyWarehousingLineText;

        public List<String> getRightFuzzyWarehousingLineText(){return this.rightFuzzyWarehousingLineText;}
        private List<Integer> warehousingInitialUserIdList;

        public List<Integer> getWarehousingInitialUserIdList(){return this.warehousingInitialUserIdList;}

        private Integer warehousingInitialUserIdSt;

        private Integer warehousingInitialUserIdEd;

        public Integer getWarehousingInitialUserIdSt(){return this.warehousingInitialUserIdSt;}

        public Integer getWarehousingInitialUserIdEd(){return this.warehousingInitialUserIdEd;}

        private List<String> warehousingInitialTimeList;

        public List<String> getWarehousingInitialTimeList(){return this.warehousingInitialTimeList;}


        private List<String> fuzzyWarehousingInitialTime;

        public List<String> getFuzzyWarehousingInitialTime(){return this.fuzzyWarehousingInitialTime;}

        private List<String> rightFuzzyWarehousingInitialTime;

        public List<String> getRightFuzzyWarehousingInitialTime(){return this.rightFuzzyWarehousingInitialTime;}
        private List<String> warehousingInitialStateList;

        public List<String> getWarehousingInitialStateList(){return this.warehousingInitialStateList;}


        private List<String> fuzzyWarehousingInitialState;

        public List<String> getFuzzyWarehousingInitialState(){return this.fuzzyWarehousingInitialState;}

        private List<String> rightFuzzyWarehousingInitialState;

        public List<String> getRightFuzzyWarehousingInitialState(){return this.rightFuzzyWarehousingInitialState;}
        private List<String> warehousingInitialUserNameList;

        public List<String> getWarehousingInitialUserNameList(){return this.warehousingInitialUserNameList;}


        private List<String> fuzzyWarehousingInitialUserName;

        public List<String> getFuzzyWarehousingInitialUserName(){return this.fuzzyWarehousingInitialUserName;}

        private List<String> rightFuzzyWarehousingInitialUserName;

        public List<String> getRightFuzzyWarehousingInitialUserName(){return this.rightFuzzyWarehousingInitialUserName;}
        private List<String> warehousingInitialDepartmentList;

        public List<String> getWarehousingInitialDepartmentList(){return this.warehousingInitialDepartmentList;}


        private List<String> fuzzyWarehousingInitialDepartment;

        public List<String> getFuzzyWarehousingInitialDepartment(){return this.fuzzyWarehousingInitialDepartment;}

        private List<String> rightFuzzyWarehousingInitialDepartment;

        public List<String> getRightFuzzyWarehousingInitialDepartment(){return this.rightFuzzyWarehousingInitialDepartment;}
        private List<String> materialContractTypeList;

        public List<String> getMaterialContractTypeList(){return this.materialContractTypeList;}


        private List<String> fuzzyMaterialContractType;

        public List<String> getFuzzyMaterialContractType(){return this.fuzzyMaterialContractType;}

        private List<String> rightFuzzyMaterialContractType;

        public List<String> getRightFuzzyMaterialContractType(){return this.rightFuzzyMaterialContractType;}
        private List<String> materialManagementTypeList;

        public List<String> getMaterialManagementTypeList(){return this.materialManagementTypeList;}


        private List<String> fuzzyMaterialManagementType;

        public List<String> getFuzzyMaterialManagementType(){return this.fuzzyMaterialManagementType;}

        private List<String> rightFuzzyMaterialManagementType;

        public List<String> getRightFuzzyMaterialManagementType(){return this.rightFuzzyMaterialManagementType;}
        private List<String> variablesList;

        public List<String> getVariablesList(){return this.variablesList;}


        private List<String> fuzzyVariables;

        public List<String> getFuzzyVariables(){return this.fuzzyVariables;}

        private List<String> rightFuzzyVariables;

        public List<String> getRightFuzzyVariables(){return this.rightFuzzyVariables;}
        private List<String> warehousingDescriptionList;

        public List<String> getWarehousingDescriptionList(){return this.warehousingDescriptionList;}


        private List<String> fuzzyWarehousingDescription;

        public List<String> getFuzzyWarehousingDescription(){return this.fuzzyWarehousingDescription;}

        private List<String> rightFuzzyWarehousingDescription;

        public List<String> getRightFuzzyWarehousingDescription(){return this.rightFuzzyWarehousingDescription;}
        private List<String> warehousingDepartmentCodeList;

        public List<String> getWarehousingDepartmentCodeList(){return this.warehousingDepartmentCodeList;}


        private List<String> fuzzyWarehousingDepartmentCode;

        public List<String> getFuzzyWarehousingDepartmentCode(){return this.fuzzyWarehousingDepartmentCode;}

        private List<String> rightFuzzyWarehousingDepartmentCode;

        public List<String> getRightFuzzyWarehousingDepartmentCode(){return this.rightFuzzyWarehousingDepartmentCode;}
        private List<String> shelfCodeList;

        public List<String> getShelfCodeList(){return this.shelfCodeList;}


        private List<String> fuzzyShelfCode;

        public List<String> getFuzzyShelfCode(){return this.fuzzyShelfCode;}

        private List<String> rightFuzzyShelfCode;

        public List<String> getRightFuzzyShelfCode(){return this.rightFuzzyShelfCode;}
        private List<Long> simpleApplicationObjectIdList;

        public List<Long> getSimpleApplicationObjectIdList(){return this.simpleApplicationObjectIdList;}

        private Long simpleApplicationObjectIdSt;

        private Long simpleApplicationObjectIdEd;

        public Long getSimpleApplicationObjectIdSt(){return this.simpleApplicationObjectIdSt;}

        public Long getSimpleApplicationObjectIdEd(){return this.simpleApplicationObjectIdEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder warehousingIdBetWeen(Long warehousingIdSt,Long warehousingIdEd){
            this.warehousingIdSt = warehousingIdSt;
            this.warehousingIdEd = warehousingIdEd;
            return this;
        }

        public QueryBuilder warehousingIdGreaterEqThan(Long warehousingIdSt){
            this.warehousingIdSt = warehousingIdSt;
            return this;
        }
        public QueryBuilder warehousingIdLessEqThan(Long warehousingIdEd){
            this.warehousingIdEd = warehousingIdEd;
            return this;
        }


        public QueryBuilder warehousingId(Long warehousingId){
            setWarehousingId(warehousingId);
            return this;
        }

        public QueryBuilder warehousingIdList(Long ... warehousingId){
            this.warehousingIdList = solveNullList(warehousingId);
            return this;
        }

        public QueryBuilder warehousingIdList(List<Long> warehousingId){
            this.warehousingIdList = warehousingId;
            return this;
        }

        public QueryBuilder fetchWarehousingId(){
            setFetchFields("fetchFields","warehousingId");
            return this;
        }

        public QueryBuilder excludeWarehousingId(){
            setFetchFields("excludeFields","warehousingId");
            return this;
        }

        public QueryBuilder fuzzyWarehousingCode (List<String> fuzzyWarehousingCode){
            this.fuzzyWarehousingCode = fuzzyWarehousingCode;
            return this;
        }

        public QueryBuilder fuzzyWarehousingCode (String ... fuzzyWarehousingCode){
            this.fuzzyWarehousingCode = solveNullList(fuzzyWarehousingCode);
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingCode (List<String> rightFuzzyWarehousingCode){
            this.rightFuzzyWarehousingCode = rightFuzzyWarehousingCode;
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingCode (String ... rightFuzzyWarehousingCode){
            this.rightFuzzyWarehousingCode = solveNullList(rightFuzzyWarehousingCode);
            return this;
        }

        public QueryBuilder warehousingCode(String warehousingCode){
            setWarehousingCode(warehousingCode);
            return this;
        }

        public QueryBuilder warehousingCodeList(String ... warehousingCode){
            this.warehousingCodeList = solveNullList(warehousingCode);
            return this;
        }

        public QueryBuilder warehousingCodeList(List<String> warehousingCode){
            this.warehousingCodeList = warehousingCode;
            return this;
        }

        public QueryBuilder fetchWarehousingCode(){
            setFetchFields("fetchFields","warehousingCode");
            return this;
        }

        public QueryBuilder excludeWarehousingCode(){
            setFetchFields("excludeFields","warehousingCode");
            return this;
        }

        public QueryBuilder fuzzyWarehousingLineCode (List<String> fuzzyWarehousingLineCode){
            this.fuzzyWarehousingLineCode = fuzzyWarehousingLineCode;
            return this;
        }

        public QueryBuilder fuzzyWarehousingLineCode (String ... fuzzyWarehousingLineCode){
            this.fuzzyWarehousingLineCode = solveNullList(fuzzyWarehousingLineCode);
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingLineCode (List<String> rightFuzzyWarehousingLineCode){
            this.rightFuzzyWarehousingLineCode = rightFuzzyWarehousingLineCode;
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingLineCode (String ... rightFuzzyWarehousingLineCode){
            this.rightFuzzyWarehousingLineCode = solveNullList(rightFuzzyWarehousingLineCode);
            return this;
        }

        public QueryBuilder warehousingLineCode(String warehousingLineCode){
            setWarehousingLineCode(warehousingLineCode);
            return this;
        }

        public QueryBuilder warehousingLineCodeList(String ... warehousingLineCode){
            this.warehousingLineCodeList = solveNullList(warehousingLineCode);
            return this;
        }

        public QueryBuilder warehousingLineCodeList(List<String> warehousingLineCode){
            this.warehousingLineCodeList = warehousingLineCode;
            return this;
        }

        public QueryBuilder fetchWarehousingLineCode(){
            setFetchFields("fetchFields","warehousingLineCode");
            return this;
        }

        public QueryBuilder excludeWarehousingLineCode(){
            setFetchFields("excludeFields","warehousingLineCode");
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

        public QueryBuilder fuzzyWarehousingReasonDescription (List<String> fuzzyWarehousingReasonDescription){
            this.fuzzyWarehousingReasonDescription = fuzzyWarehousingReasonDescription;
            return this;
        }

        public QueryBuilder fuzzyWarehousingReasonDescription (String ... fuzzyWarehousingReasonDescription){
            this.fuzzyWarehousingReasonDescription = solveNullList(fuzzyWarehousingReasonDescription);
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingReasonDescription (List<String> rightFuzzyWarehousingReasonDescription){
            this.rightFuzzyWarehousingReasonDescription = rightFuzzyWarehousingReasonDescription;
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingReasonDescription (String ... rightFuzzyWarehousingReasonDescription){
            this.rightFuzzyWarehousingReasonDescription = solveNullList(rightFuzzyWarehousingReasonDescription);
            return this;
        }

        public QueryBuilder warehousingReasonDescription(String warehousingReasonDescription){
            setWarehousingReasonDescription(warehousingReasonDescription);
            return this;
        }

        public QueryBuilder warehousingReasonDescriptionList(String ... warehousingReasonDescription){
            this.warehousingReasonDescriptionList = solveNullList(warehousingReasonDescription);
            return this;
        }

        public QueryBuilder warehousingReasonDescriptionList(List<String> warehousingReasonDescription){
            this.warehousingReasonDescriptionList = warehousingReasonDescription;
            return this;
        }

        public QueryBuilder fetchWarehousingReasonDescription(){
            setFetchFields("fetchFields","warehousingReasonDescription");
            return this;
        }

        public QueryBuilder excludeWarehousingReasonDescription(){
            setFetchFields("excludeFields","warehousingReasonDescription");
            return this;
        }

        public QueryBuilder fuzzyWarehousingAffairsDate (List<String> fuzzyWarehousingAffairsDate){
            this.fuzzyWarehousingAffairsDate = fuzzyWarehousingAffairsDate;
            return this;
        }

        public QueryBuilder fuzzyWarehousingAffairsDate (String ... fuzzyWarehousingAffairsDate){
            this.fuzzyWarehousingAffairsDate = solveNullList(fuzzyWarehousingAffairsDate);
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingAffairsDate (List<String> rightFuzzyWarehousingAffairsDate){
            this.rightFuzzyWarehousingAffairsDate = rightFuzzyWarehousingAffairsDate;
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingAffairsDate (String ... rightFuzzyWarehousingAffairsDate){
            this.rightFuzzyWarehousingAffairsDate = solveNullList(rightFuzzyWarehousingAffairsDate);
            return this;
        }

        public QueryBuilder warehousingAffairsDate(String warehousingAffairsDate){
            setWarehousingAffairsDate(warehousingAffairsDate);
            return this;
        }

        public QueryBuilder warehousingAffairsDateList(String ... warehousingAffairsDate){
            this.warehousingAffairsDateList = solveNullList(warehousingAffairsDate);
            return this;
        }

        public QueryBuilder warehousingAffairsDateList(List<String> warehousingAffairsDate){
            this.warehousingAffairsDateList = warehousingAffairsDate;
            return this;
        }

        public QueryBuilder fetchWarehousingAffairsDate(){
            setFetchFields("fetchFields","warehousingAffairsDate");
            return this;
        }

        public QueryBuilder excludeWarehousingAffairsDate(){
            setFetchFields("excludeFields","warehousingAffairsDate");
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

        public QueryBuilder fuzzyWarehousingBatch (List<String> fuzzyWarehousingBatch){
            this.fuzzyWarehousingBatch = fuzzyWarehousingBatch;
            return this;
        }

        public QueryBuilder fuzzyWarehousingBatch (String ... fuzzyWarehousingBatch){
            this.fuzzyWarehousingBatch = solveNullList(fuzzyWarehousingBatch);
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingBatch (List<String> rightFuzzyWarehousingBatch){
            this.rightFuzzyWarehousingBatch = rightFuzzyWarehousingBatch;
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingBatch (String ... rightFuzzyWarehousingBatch){
            this.rightFuzzyWarehousingBatch = solveNullList(rightFuzzyWarehousingBatch);
            return this;
        }

        public QueryBuilder warehousingBatch(String warehousingBatch){
            setWarehousingBatch(warehousingBatch);
            return this;
        }

        public QueryBuilder warehousingBatchList(String ... warehousingBatch){
            this.warehousingBatchList = solveNullList(warehousingBatch);
            return this;
        }

        public QueryBuilder warehousingBatchList(List<String> warehousingBatch){
            this.warehousingBatchList = warehousingBatch;
            return this;
        }

        public QueryBuilder fetchWarehousingBatch(){
            setFetchFields("fetchFields","warehousingBatch");
            return this;
        }

        public QueryBuilder excludeWarehousingBatch(){
            setFetchFields("excludeFields","warehousingBatch");
            return this;
        }

        public QueryBuilder fuzzyWarehousingSerie (List<String> fuzzyWarehousingSerie){
            this.fuzzyWarehousingSerie = fuzzyWarehousingSerie;
            return this;
        }

        public QueryBuilder fuzzyWarehousingSerie (String ... fuzzyWarehousingSerie){
            this.fuzzyWarehousingSerie = solveNullList(fuzzyWarehousingSerie);
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingSerie (List<String> rightFuzzyWarehousingSerie){
            this.rightFuzzyWarehousingSerie = rightFuzzyWarehousingSerie;
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingSerie (String ... rightFuzzyWarehousingSerie){
            this.rightFuzzyWarehousingSerie = solveNullList(rightFuzzyWarehousingSerie);
            return this;
        }

        public QueryBuilder warehousingSerie(String warehousingSerie){
            setWarehousingSerie(warehousingSerie);
            return this;
        }

        public QueryBuilder warehousingSerieList(String ... warehousingSerie){
            this.warehousingSerieList = solveNullList(warehousingSerie);
            return this;
        }

        public QueryBuilder warehousingSerieList(List<String> warehousingSerie){
            this.warehousingSerieList = warehousingSerie;
            return this;
        }

        public QueryBuilder fetchWarehousingSerie(){
            setFetchFields("fetchFields","warehousingSerie");
            return this;
        }

        public QueryBuilder excludeWarehousingSerie(){
            setFetchFields("excludeFields","warehousingSerie");
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

        public QueryBuilder fuzzyWarehousingAffairsSymbol (List<String> fuzzyWarehousingAffairsSymbol){
            this.fuzzyWarehousingAffairsSymbol = fuzzyWarehousingAffairsSymbol;
            return this;
        }

        public QueryBuilder fuzzyWarehousingAffairsSymbol (String ... fuzzyWarehousingAffairsSymbol){
            this.fuzzyWarehousingAffairsSymbol = solveNullList(fuzzyWarehousingAffairsSymbol);
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingAffairsSymbol (List<String> rightFuzzyWarehousingAffairsSymbol){
            this.rightFuzzyWarehousingAffairsSymbol = rightFuzzyWarehousingAffairsSymbol;
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingAffairsSymbol (String ... rightFuzzyWarehousingAffairsSymbol){
            this.rightFuzzyWarehousingAffairsSymbol = solveNullList(rightFuzzyWarehousingAffairsSymbol);
            return this;
        }

        public QueryBuilder warehousingAffairsSymbol(String warehousingAffairsSymbol){
            setWarehousingAffairsSymbol(warehousingAffairsSymbol);
            return this;
        }

        public QueryBuilder warehousingAffairsSymbolList(String ... warehousingAffairsSymbol){
            this.warehousingAffairsSymbolList = solveNullList(warehousingAffairsSymbol);
            return this;
        }

        public QueryBuilder warehousingAffairsSymbolList(List<String> warehousingAffairsSymbol){
            this.warehousingAffairsSymbolList = warehousingAffairsSymbol;
            return this;
        }

        public QueryBuilder fetchWarehousingAffairsSymbol(){
            setFetchFields("fetchFields","warehousingAffairsSymbol");
            return this;
        }

        public QueryBuilder excludeWarehousingAffairsSymbol(){
            setFetchFields("excludeFields","warehousingAffairsSymbol");
            return this;
        }

        public QueryBuilder warehousingNumBetWeen(Integer warehousingNumSt,Integer warehousingNumEd){
            this.warehousingNumSt = warehousingNumSt;
            this.warehousingNumEd = warehousingNumEd;
            return this;
        }

        public QueryBuilder warehousingNumGreaterEqThan(Integer warehousingNumSt){
            this.warehousingNumSt = warehousingNumSt;
            return this;
        }
        public QueryBuilder warehousingNumLessEqThan(Integer warehousingNumEd){
            this.warehousingNumEd = warehousingNumEd;
            return this;
        }


        public QueryBuilder warehousingNum(Integer warehousingNum){
            setWarehousingNum(warehousingNum);
            return this;
        }

        public QueryBuilder warehousingNumList(Integer ... warehousingNum){
            this.warehousingNumList = solveNullList(warehousingNum);
            return this;
        }

        public QueryBuilder warehousingNumList(List<Integer> warehousingNum){
            this.warehousingNumList = warehousingNum;
            return this;
        }

        public QueryBuilder fetchWarehousingNum(){
            setFetchFields("fetchFields","warehousingNum");
            return this;
        }

        public QueryBuilder excludeWarehousingNum(){
            setFetchFields("excludeFields","warehousingNum");
            return this;
        }

        public QueryBuilder fuzzyWarehousingHeadText (List<String> fuzzyWarehousingHeadText){
            this.fuzzyWarehousingHeadText = fuzzyWarehousingHeadText;
            return this;
        }

        public QueryBuilder fuzzyWarehousingHeadText (String ... fuzzyWarehousingHeadText){
            this.fuzzyWarehousingHeadText = solveNullList(fuzzyWarehousingHeadText);
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingHeadText (List<String> rightFuzzyWarehousingHeadText){
            this.rightFuzzyWarehousingHeadText = rightFuzzyWarehousingHeadText;
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingHeadText (String ... rightFuzzyWarehousingHeadText){
            this.rightFuzzyWarehousingHeadText = solveNullList(rightFuzzyWarehousingHeadText);
            return this;
        }

        public QueryBuilder warehousingHeadText(String warehousingHeadText){
            setWarehousingHeadText(warehousingHeadText);
            return this;
        }

        public QueryBuilder warehousingHeadTextList(String ... warehousingHeadText){
            this.warehousingHeadTextList = solveNullList(warehousingHeadText);
            return this;
        }

        public QueryBuilder warehousingHeadTextList(List<String> warehousingHeadText){
            this.warehousingHeadTextList = warehousingHeadText;
            return this;
        }

        public QueryBuilder fetchWarehousingHeadText(){
            setFetchFields("fetchFields","warehousingHeadText");
            return this;
        }

        public QueryBuilder excludeWarehousingHeadText(){
            setFetchFields("excludeFields","warehousingHeadText");
            return this;
        }

        public QueryBuilder fuzzyWarehousingLineText (List<String> fuzzyWarehousingLineText){
            this.fuzzyWarehousingLineText = fuzzyWarehousingLineText;
            return this;
        }

        public QueryBuilder fuzzyWarehousingLineText (String ... fuzzyWarehousingLineText){
            this.fuzzyWarehousingLineText = solveNullList(fuzzyWarehousingLineText);
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingLineText (List<String> rightFuzzyWarehousingLineText){
            this.rightFuzzyWarehousingLineText = rightFuzzyWarehousingLineText;
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingLineText (String ... rightFuzzyWarehousingLineText){
            this.rightFuzzyWarehousingLineText = solveNullList(rightFuzzyWarehousingLineText);
            return this;
        }

        public QueryBuilder warehousingLineText(String warehousingLineText){
            setWarehousingLineText(warehousingLineText);
            return this;
        }

        public QueryBuilder warehousingLineTextList(String ... warehousingLineText){
            this.warehousingLineTextList = solveNullList(warehousingLineText);
            return this;
        }

        public QueryBuilder warehousingLineTextList(List<String> warehousingLineText){
            this.warehousingLineTextList = warehousingLineText;
            return this;
        }

        public QueryBuilder fetchWarehousingLineText(){
            setFetchFields("fetchFields","warehousingLineText");
            return this;
        }

        public QueryBuilder excludeWarehousingLineText(){
            setFetchFields("excludeFields","warehousingLineText");
            return this;
        }

        public QueryBuilder warehousingInitialUserIdBetWeen(Integer warehousingInitialUserIdSt,Integer warehousingInitialUserIdEd){
            this.warehousingInitialUserIdSt = warehousingInitialUserIdSt;
            this.warehousingInitialUserIdEd = warehousingInitialUserIdEd;
            return this;
        }

        public QueryBuilder warehousingInitialUserIdGreaterEqThan(Integer warehousingInitialUserIdSt){
            this.warehousingInitialUserIdSt = warehousingInitialUserIdSt;
            return this;
        }
        public QueryBuilder warehousingInitialUserIdLessEqThan(Integer warehousingInitialUserIdEd){
            this.warehousingInitialUserIdEd = warehousingInitialUserIdEd;
            return this;
        }


        public QueryBuilder warehousingInitialUserId(Integer warehousingInitialUserId){
            setWarehousingInitialUserId(warehousingInitialUserId);
            return this;
        }

        public QueryBuilder warehousingInitialUserIdList(Integer ... warehousingInitialUserId){
            this.warehousingInitialUserIdList = solveNullList(warehousingInitialUserId);
            return this;
        }

        public QueryBuilder warehousingInitialUserIdList(List<Integer> warehousingInitialUserId){
            this.warehousingInitialUserIdList = warehousingInitialUserId;
            return this;
        }

        public QueryBuilder fetchWarehousingInitialUserId(){
            setFetchFields("fetchFields","warehousingInitialUserId");
            return this;
        }

        public QueryBuilder excludeWarehousingInitialUserId(){
            setFetchFields("excludeFields","warehousingInitialUserId");
            return this;
        }

        public QueryBuilder fuzzyWarehousingInitialTime (List<String> fuzzyWarehousingInitialTime){
            this.fuzzyWarehousingInitialTime = fuzzyWarehousingInitialTime;
            return this;
        }

        public QueryBuilder fuzzyWarehousingInitialTime (String ... fuzzyWarehousingInitialTime){
            this.fuzzyWarehousingInitialTime = solveNullList(fuzzyWarehousingInitialTime);
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingInitialTime (List<String> rightFuzzyWarehousingInitialTime){
            this.rightFuzzyWarehousingInitialTime = rightFuzzyWarehousingInitialTime;
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingInitialTime (String ... rightFuzzyWarehousingInitialTime){
            this.rightFuzzyWarehousingInitialTime = solveNullList(rightFuzzyWarehousingInitialTime);
            return this;
        }

        public QueryBuilder warehousingInitialTime(String warehousingInitialTime){
            setWarehousingInitialTime(warehousingInitialTime);
            return this;
        }

        public QueryBuilder warehousingInitialTimeList(String ... warehousingInitialTime){
            this.warehousingInitialTimeList = solveNullList(warehousingInitialTime);
            return this;
        }

        public QueryBuilder warehousingInitialTimeList(List<String> warehousingInitialTime){
            this.warehousingInitialTimeList = warehousingInitialTime;
            return this;
        }

        public QueryBuilder fetchWarehousingInitialTime(){
            setFetchFields("fetchFields","warehousingInitialTime");
            return this;
        }

        public QueryBuilder excludeWarehousingInitialTime(){
            setFetchFields("excludeFields","warehousingInitialTime");
            return this;
        }

        public QueryBuilder fuzzyWarehousingInitialState (List<String> fuzzyWarehousingInitialState){
            this.fuzzyWarehousingInitialState = fuzzyWarehousingInitialState;
            return this;
        }

        public QueryBuilder fuzzyWarehousingInitialState (String ... fuzzyWarehousingInitialState){
            this.fuzzyWarehousingInitialState = solveNullList(fuzzyWarehousingInitialState);
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingInitialState (List<String> rightFuzzyWarehousingInitialState){
            this.rightFuzzyWarehousingInitialState = rightFuzzyWarehousingInitialState;
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingInitialState (String ... rightFuzzyWarehousingInitialState){
            this.rightFuzzyWarehousingInitialState = solveNullList(rightFuzzyWarehousingInitialState);
            return this;
        }

        public QueryBuilder warehousingInitialState(String warehousingInitialState){
            setWarehousingInitialState(warehousingInitialState);
            return this;
        }

        public QueryBuilder warehousingInitialStateList(String ... warehousingInitialState){
            this.warehousingInitialStateList = solveNullList(warehousingInitialState);
            return this;
        }

        public QueryBuilder warehousingInitialStateList(List<String> warehousingInitialState){
            this.warehousingInitialStateList = warehousingInitialState;
            return this;
        }

        public QueryBuilder fetchWarehousingInitialState(){
            setFetchFields("fetchFields","warehousingInitialState");
            return this;
        }

        public QueryBuilder excludeWarehousingInitialState(){
            setFetchFields("excludeFields","warehousingInitialState");
            return this;
        }

        public QueryBuilder fuzzyWarehousingInitialUserName (List<String> fuzzyWarehousingInitialUserName){
            this.fuzzyWarehousingInitialUserName = fuzzyWarehousingInitialUserName;
            return this;
        }

        public QueryBuilder fuzzyWarehousingInitialUserName (String ... fuzzyWarehousingInitialUserName){
            this.fuzzyWarehousingInitialUserName = solveNullList(fuzzyWarehousingInitialUserName);
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingInitialUserName (List<String> rightFuzzyWarehousingInitialUserName){
            this.rightFuzzyWarehousingInitialUserName = rightFuzzyWarehousingInitialUserName;
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingInitialUserName (String ... rightFuzzyWarehousingInitialUserName){
            this.rightFuzzyWarehousingInitialUserName = solveNullList(rightFuzzyWarehousingInitialUserName);
            return this;
        }

        public QueryBuilder warehousingInitialUserName(String warehousingInitialUserName){
            setWarehousingInitialUserName(warehousingInitialUserName);
            return this;
        }

        public QueryBuilder warehousingInitialUserNameList(String ... warehousingInitialUserName){
            this.warehousingInitialUserNameList = solveNullList(warehousingInitialUserName);
            return this;
        }

        public QueryBuilder warehousingInitialUserNameList(List<String> warehousingInitialUserName){
            this.warehousingInitialUserNameList = warehousingInitialUserName;
            return this;
        }

        public QueryBuilder fetchWarehousingInitialUserName(){
            setFetchFields("fetchFields","warehousingInitialUserName");
            return this;
        }

        public QueryBuilder excludeWarehousingInitialUserName(){
            setFetchFields("excludeFields","warehousingInitialUserName");
            return this;
        }

        public QueryBuilder fuzzyWarehousingInitialDepartment (List<String> fuzzyWarehousingInitialDepartment){
            this.fuzzyWarehousingInitialDepartment = fuzzyWarehousingInitialDepartment;
            return this;
        }

        public QueryBuilder fuzzyWarehousingInitialDepartment (String ... fuzzyWarehousingInitialDepartment){
            this.fuzzyWarehousingInitialDepartment = solveNullList(fuzzyWarehousingInitialDepartment);
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingInitialDepartment (List<String> rightFuzzyWarehousingInitialDepartment){
            this.rightFuzzyWarehousingInitialDepartment = rightFuzzyWarehousingInitialDepartment;
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingInitialDepartment (String ... rightFuzzyWarehousingInitialDepartment){
            this.rightFuzzyWarehousingInitialDepartment = solveNullList(rightFuzzyWarehousingInitialDepartment);
            return this;
        }

        public QueryBuilder warehousingInitialDepartment(String warehousingInitialDepartment){
            setWarehousingInitialDepartment(warehousingInitialDepartment);
            return this;
        }

        public QueryBuilder warehousingInitialDepartmentList(String ... warehousingInitialDepartment){
            this.warehousingInitialDepartmentList = solveNullList(warehousingInitialDepartment);
            return this;
        }

        public QueryBuilder warehousingInitialDepartmentList(List<String> warehousingInitialDepartment){
            this.warehousingInitialDepartmentList = warehousingInitialDepartment;
            return this;
        }

        public QueryBuilder fetchWarehousingInitialDepartment(){
            setFetchFields("fetchFields","warehousingInitialDepartment");
            return this;
        }

        public QueryBuilder excludeWarehousingInitialDepartment(){
            setFetchFields("excludeFields","warehousingInitialDepartment");
            return this;
        }

        public QueryBuilder fuzzyMaterialContractType (List<String> fuzzyMaterialContractType){
            this.fuzzyMaterialContractType = fuzzyMaterialContractType;
            return this;
        }

        public QueryBuilder fuzzyMaterialContractType (String ... fuzzyMaterialContractType){
            this.fuzzyMaterialContractType = solveNullList(fuzzyMaterialContractType);
            return this;
        }

        public QueryBuilder rightFuzzyMaterialContractType (List<String> rightFuzzyMaterialContractType){
            this.rightFuzzyMaterialContractType = rightFuzzyMaterialContractType;
            return this;
        }

        public QueryBuilder rightFuzzyMaterialContractType (String ... rightFuzzyMaterialContractType){
            this.rightFuzzyMaterialContractType = solveNullList(rightFuzzyMaterialContractType);
            return this;
        }

        public QueryBuilder materialContractType(String materialContractType){
            setMaterialContractType(materialContractType);
            return this;
        }

        public QueryBuilder materialContractTypeList(String ... materialContractType){
            this.materialContractTypeList = solveNullList(materialContractType);
            return this;
        }

        public QueryBuilder materialContractTypeList(List<String> materialContractType){
            this.materialContractTypeList = materialContractType;
            return this;
        }

        public QueryBuilder fetchMaterialContractType(){
            setFetchFields("fetchFields","materialContractType");
            return this;
        }

        public QueryBuilder excludeMaterialContractType(){
            setFetchFields("excludeFields","materialContractType");
            return this;
        }

        public QueryBuilder fuzzyMaterialManagementType (List<String> fuzzyMaterialManagementType){
            this.fuzzyMaterialManagementType = fuzzyMaterialManagementType;
            return this;
        }

        public QueryBuilder fuzzyMaterialManagementType (String ... fuzzyMaterialManagementType){
            this.fuzzyMaterialManagementType = solveNullList(fuzzyMaterialManagementType);
            return this;
        }

        public QueryBuilder rightFuzzyMaterialManagementType (List<String> rightFuzzyMaterialManagementType){
            this.rightFuzzyMaterialManagementType = rightFuzzyMaterialManagementType;
            return this;
        }

        public QueryBuilder rightFuzzyMaterialManagementType (String ... rightFuzzyMaterialManagementType){
            this.rightFuzzyMaterialManagementType = solveNullList(rightFuzzyMaterialManagementType);
            return this;
        }

        public QueryBuilder materialManagementType(String materialManagementType){
            setMaterialManagementType(materialManagementType);
            return this;
        }

        public QueryBuilder materialManagementTypeList(String ... materialManagementType){
            this.materialManagementTypeList = solveNullList(materialManagementType);
            return this;
        }

        public QueryBuilder materialManagementTypeList(List<String> materialManagementType){
            this.materialManagementTypeList = materialManagementType;
            return this;
        }

        public QueryBuilder fetchMaterialManagementType(){
            setFetchFields("fetchFields","materialManagementType");
            return this;
        }

        public QueryBuilder excludeMaterialManagementType(){
            setFetchFields("excludeFields","materialManagementType");
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

        public QueryBuilder fuzzyWarehousingDescription (List<String> fuzzyWarehousingDescription){
            this.fuzzyWarehousingDescription = fuzzyWarehousingDescription;
            return this;
        }

        public QueryBuilder fuzzyWarehousingDescription (String ... fuzzyWarehousingDescription){
            this.fuzzyWarehousingDescription = solveNullList(fuzzyWarehousingDescription);
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingDescription (List<String> rightFuzzyWarehousingDescription){
            this.rightFuzzyWarehousingDescription = rightFuzzyWarehousingDescription;
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingDescription (String ... rightFuzzyWarehousingDescription){
            this.rightFuzzyWarehousingDescription = solveNullList(rightFuzzyWarehousingDescription);
            return this;
        }

        public QueryBuilder warehousingDescription(String warehousingDescription){
            setWarehousingDescription(warehousingDescription);
            return this;
        }

        public QueryBuilder warehousingDescriptionList(String ... warehousingDescription){
            this.warehousingDescriptionList = solveNullList(warehousingDescription);
            return this;
        }

        public QueryBuilder warehousingDescriptionList(List<String> warehousingDescription){
            this.warehousingDescriptionList = warehousingDescription;
            return this;
        }

        public QueryBuilder fetchWarehousingDescription(){
            setFetchFields("fetchFields","warehousingDescription");
            return this;
        }

        public QueryBuilder excludeWarehousingDescription(){
            setFetchFields("excludeFields","warehousingDescription");
            return this;
        }

        public QueryBuilder fuzzyWarehousingDepartmentCode (List<String> fuzzyWarehousingDepartmentCode){
            this.fuzzyWarehousingDepartmentCode = fuzzyWarehousingDepartmentCode;
            return this;
        }

        public QueryBuilder fuzzyWarehousingDepartmentCode (String ... fuzzyWarehousingDepartmentCode){
            this.fuzzyWarehousingDepartmentCode = solveNullList(fuzzyWarehousingDepartmentCode);
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingDepartmentCode (List<String> rightFuzzyWarehousingDepartmentCode){
            this.rightFuzzyWarehousingDepartmentCode = rightFuzzyWarehousingDepartmentCode;
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingDepartmentCode (String ... rightFuzzyWarehousingDepartmentCode){
            this.rightFuzzyWarehousingDepartmentCode = solveNullList(rightFuzzyWarehousingDepartmentCode);
            return this;
        }

        public QueryBuilder warehousingDepartmentCode(String warehousingDepartmentCode){
            setWarehousingDepartmentCode(warehousingDepartmentCode);
            return this;
        }

        public QueryBuilder warehousingDepartmentCodeList(String ... warehousingDepartmentCode){
            this.warehousingDepartmentCodeList = solveNullList(warehousingDepartmentCode);
            return this;
        }

        public QueryBuilder warehousingDepartmentCodeList(List<String> warehousingDepartmentCode){
            this.warehousingDepartmentCodeList = warehousingDepartmentCode;
            return this;
        }

        public QueryBuilder fetchWarehousingDepartmentCode(){
            setFetchFields("fetchFields","warehousingDepartmentCode");
            return this;
        }

        public QueryBuilder excludeWarehousingDepartmentCode(){
            setFetchFields("excludeFields","warehousingDepartmentCode");
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

        public Warehousing build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> warehousingIdList;

        public List<Long> getWarehousingIdList(){return this.warehousingIdList;}

        private Long warehousingIdSt;

        private Long warehousingIdEd;

        public Long getWarehousingIdSt(){return this.warehousingIdSt;}

        public Long getWarehousingIdEd(){return this.warehousingIdEd;}

        private List<String> warehousingCodeList;

        public List<String> getWarehousingCodeList(){return this.warehousingCodeList;}


        private List<String> fuzzyWarehousingCode;

        public List<String> getFuzzyWarehousingCode(){return this.fuzzyWarehousingCode;}

        private List<String> rightFuzzyWarehousingCode;

        public List<String> getRightFuzzyWarehousingCode(){return this.rightFuzzyWarehousingCode;}
        private List<String> warehousingLineCodeList;

        public List<String> getWarehousingLineCodeList(){return this.warehousingLineCodeList;}


        private List<String> fuzzyWarehousingLineCode;

        public List<String> getFuzzyWarehousingLineCode(){return this.fuzzyWarehousingLineCode;}

        private List<String> rightFuzzyWarehousingLineCode;

        public List<String> getRightFuzzyWarehousingLineCode(){return this.rightFuzzyWarehousingLineCode;}
        private List<String> warehousingReasonCodeList;

        public List<String> getWarehousingReasonCodeList(){return this.warehousingReasonCodeList;}


        private List<String> fuzzyWarehousingReasonCode;

        public List<String> getFuzzyWarehousingReasonCode(){return this.fuzzyWarehousingReasonCode;}

        private List<String> rightFuzzyWarehousingReasonCode;

        public List<String> getRightFuzzyWarehousingReasonCode(){return this.rightFuzzyWarehousingReasonCode;}
        private List<String> warehousingReasonDescriptionList;

        public List<String> getWarehousingReasonDescriptionList(){return this.warehousingReasonDescriptionList;}


        private List<String> fuzzyWarehousingReasonDescription;

        public List<String> getFuzzyWarehousingReasonDescription(){return this.fuzzyWarehousingReasonDescription;}

        private List<String> rightFuzzyWarehousingReasonDescription;

        public List<String> getRightFuzzyWarehousingReasonDescription(){return this.rightFuzzyWarehousingReasonDescription;}
        private List<String> warehousingAffairsDateList;

        public List<String> getWarehousingAffairsDateList(){return this.warehousingAffairsDateList;}


        private List<String> fuzzyWarehousingAffairsDate;

        public List<String> getFuzzyWarehousingAffairsDate(){return this.fuzzyWarehousingAffairsDate;}

        private List<String> rightFuzzyWarehousingAffairsDate;

        public List<String> getRightFuzzyWarehousingAffairsDate(){return this.rightFuzzyWarehousingAffairsDate;}
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
        private List<String> materialUnitList;

        public List<String> getMaterialUnitList(){return this.materialUnitList;}


        private List<String> fuzzyMaterialUnit;

        public List<String> getFuzzyMaterialUnit(){return this.fuzzyMaterialUnit;}

        private List<String> rightFuzzyMaterialUnit;

        public List<String> getRightFuzzyMaterialUnit(){return this.rightFuzzyMaterialUnit;}
        private List<String> warehousingBatchList;

        public List<String> getWarehousingBatchList(){return this.warehousingBatchList;}


        private List<String> fuzzyWarehousingBatch;

        public List<String> getFuzzyWarehousingBatch(){return this.fuzzyWarehousingBatch;}

        private List<String> rightFuzzyWarehousingBatch;

        public List<String> getRightFuzzyWarehousingBatch(){return this.rightFuzzyWarehousingBatch;}
        private List<String> warehousingSerieList;

        public List<String> getWarehousingSerieList(){return this.warehousingSerieList;}


        private List<String> fuzzyWarehousingSerie;

        public List<String> getFuzzyWarehousingSerie(){return this.fuzzyWarehousingSerie;}

        private List<String> rightFuzzyWarehousingSerie;

        public List<String> getRightFuzzyWarehousingSerie(){return this.rightFuzzyWarehousingSerie;}
        private List<String> warehouseCodeList;

        public List<String> getWarehouseCodeList(){return this.warehouseCodeList;}


        private List<String> fuzzyWarehouseCode;

        public List<String> getFuzzyWarehouseCode(){return this.fuzzyWarehouseCode;}

        private List<String> rightFuzzyWarehouseCode;

        public List<String> getRightFuzzyWarehouseCode(){return this.rightFuzzyWarehouseCode;}
        private List<String> warehousingAffairsSymbolList;

        public List<String> getWarehousingAffairsSymbolList(){return this.warehousingAffairsSymbolList;}


        private List<String> fuzzyWarehousingAffairsSymbol;

        public List<String> getFuzzyWarehousingAffairsSymbol(){return this.fuzzyWarehousingAffairsSymbol;}

        private List<String> rightFuzzyWarehousingAffairsSymbol;

        public List<String> getRightFuzzyWarehousingAffairsSymbol(){return this.rightFuzzyWarehousingAffairsSymbol;}
        private List<Integer> warehousingNumList;

        public List<Integer> getWarehousingNumList(){return this.warehousingNumList;}

        private Integer warehousingNumSt;

        private Integer warehousingNumEd;

        public Integer getWarehousingNumSt(){return this.warehousingNumSt;}

        public Integer getWarehousingNumEd(){return this.warehousingNumEd;}

        private List<String> warehousingHeadTextList;

        public List<String> getWarehousingHeadTextList(){return this.warehousingHeadTextList;}


        private List<String> fuzzyWarehousingHeadText;

        public List<String> getFuzzyWarehousingHeadText(){return this.fuzzyWarehousingHeadText;}

        private List<String> rightFuzzyWarehousingHeadText;

        public List<String> getRightFuzzyWarehousingHeadText(){return this.rightFuzzyWarehousingHeadText;}
        private List<String> warehousingLineTextList;

        public List<String> getWarehousingLineTextList(){return this.warehousingLineTextList;}


        private List<String> fuzzyWarehousingLineText;

        public List<String> getFuzzyWarehousingLineText(){return this.fuzzyWarehousingLineText;}

        private List<String> rightFuzzyWarehousingLineText;

        public List<String> getRightFuzzyWarehousingLineText(){return this.rightFuzzyWarehousingLineText;}
        private List<Integer> warehousingInitialUserIdList;

        public List<Integer> getWarehousingInitialUserIdList(){return this.warehousingInitialUserIdList;}

        private Integer warehousingInitialUserIdSt;

        private Integer warehousingInitialUserIdEd;

        public Integer getWarehousingInitialUserIdSt(){return this.warehousingInitialUserIdSt;}

        public Integer getWarehousingInitialUserIdEd(){return this.warehousingInitialUserIdEd;}

        private List<String> warehousingInitialTimeList;

        public List<String> getWarehousingInitialTimeList(){return this.warehousingInitialTimeList;}


        private List<String> fuzzyWarehousingInitialTime;

        public List<String> getFuzzyWarehousingInitialTime(){return this.fuzzyWarehousingInitialTime;}

        private List<String> rightFuzzyWarehousingInitialTime;

        public List<String> getRightFuzzyWarehousingInitialTime(){return this.rightFuzzyWarehousingInitialTime;}
        private List<String> warehousingInitialStateList;

        public List<String> getWarehousingInitialStateList(){return this.warehousingInitialStateList;}


        private List<String> fuzzyWarehousingInitialState;

        public List<String> getFuzzyWarehousingInitialState(){return this.fuzzyWarehousingInitialState;}

        private List<String> rightFuzzyWarehousingInitialState;

        public List<String> getRightFuzzyWarehousingInitialState(){return this.rightFuzzyWarehousingInitialState;}
        private List<String> warehousingInitialUserNameList;

        public List<String> getWarehousingInitialUserNameList(){return this.warehousingInitialUserNameList;}


        private List<String> fuzzyWarehousingInitialUserName;

        public List<String> getFuzzyWarehousingInitialUserName(){return this.fuzzyWarehousingInitialUserName;}

        private List<String> rightFuzzyWarehousingInitialUserName;

        public List<String> getRightFuzzyWarehousingInitialUserName(){return this.rightFuzzyWarehousingInitialUserName;}
        private List<String> warehousingInitialDepartmentList;

        public List<String> getWarehousingInitialDepartmentList(){return this.warehousingInitialDepartmentList;}


        private List<String> fuzzyWarehousingInitialDepartment;

        public List<String> getFuzzyWarehousingInitialDepartment(){return this.fuzzyWarehousingInitialDepartment;}

        private List<String> rightFuzzyWarehousingInitialDepartment;

        public List<String> getRightFuzzyWarehousingInitialDepartment(){return this.rightFuzzyWarehousingInitialDepartment;}
        private List<String> materialContractTypeList;

        public List<String> getMaterialContractTypeList(){return this.materialContractTypeList;}


        private List<String> fuzzyMaterialContractType;

        public List<String> getFuzzyMaterialContractType(){return this.fuzzyMaterialContractType;}

        private List<String> rightFuzzyMaterialContractType;

        public List<String> getRightFuzzyMaterialContractType(){return this.rightFuzzyMaterialContractType;}
        private List<String> materialManagementTypeList;

        public List<String> getMaterialManagementTypeList(){return this.materialManagementTypeList;}


        private List<String> fuzzyMaterialManagementType;

        public List<String> getFuzzyMaterialManagementType(){return this.fuzzyMaterialManagementType;}

        private List<String> rightFuzzyMaterialManagementType;

        public List<String> getRightFuzzyMaterialManagementType(){return this.rightFuzzyMaterialManagementType;}
        private List<String> variablesList;

        public List<String> getVariablesList(){return this.variablesList;}


        private List<String> fuzzyVariables;

        public List<String> getFuzzyVariables(){return this.fuzzyVariables;}

        private List<String> rightFuzzyVariables;

        public List<String> getRightFuzzyVariables(){return this.rightFuzzyVariables;}
        private List<String> warehousingDescriptionList;

        public List<String> getWarehousingDescriptionList(){return this.warehousingDescriptionList;}


        private List<String> fuzzyWarehousingDescription;

        public List<String> getFuzzyWarehousingDescription(){return this.fuzzyWarehousingDescription;}

        private List<String> rightFuzzyWarehousingDescription;

        public List<String> getRightFuzzyWarehousingDescription(){return this.rightFuzzyWarehousingDescription;}
        private List<String> warehousingDepartmentCodeList;

        public List<String> getWarehousingDepartmentCodeList(){return this.warehousingDepartmentCodeList;}


        private List<String> fuzzyWarehousingDepartmentCode;

        public List<String> getFuzzyWarehousingDepartmentCode(){return this.fuzzyWarehousingDepartmentCode;}

        private List<String> rightFuzzyWarehousingDepartmentCode;

        public List<String> getRightFuzzyWarehousingDepartmentCode(){return this.rightFuzzyWarehousingDepartmentCode;}
        private List<String> shelfCodeList;

        public List<String> getShelfCodeList(){return this.shelfCodeList;}


        private List<String> fuzzyShelfCode;

        public List<String> getFuzzyShelfCode(){return this.fuzzyShelfCode;}

        private List<String> rightFuzzyShelfCode;

        public List<String> getRightFuzzyShelfCode(){return this.rightFuzzyShelfCode;}
        private List<Long> simpleApplicationObjectIdList;

        public List<Long> getSimpleApplicationObjectIdList(){return this.simpleApplicationObjectIdList;}

        private Long simpleApplicationObjectIdSt;

        private Long simpleApplicationObjectIdEd;

        public Long getSimpleApplicationObjectIdSt(){return this.simpleApplicationObjectIdSt;}

        public Long getSimpleApplicationObjectIdEd(){return this.simpleApplicationObjectIdEd;}


        public ConditionBuilder warehousingIdBetWeen(Long warehousingIdSt,Long warehousingIdEd){
            this.warehousingIdSt = warehousingIdSt;
            this.warehousingIdEd = warehousingIdEd;
            return this;
        }

        public ConditionBuilder warehousingIdGreaterEqThan(Long warehousingIdSt){
            this.warehousingIdSt = warehousingIdSt;
            return this;
        }
        public ConditionBuilder warehousingIdLessEqThan(Long warehousingIdEd){
            this.warehousingIdEd = warehousingIdEd;
            return this;
        }


        public ConditionBuilder warehousingIdList(Long ... warehousingId){
            this.warehousingIdList = solveNullList(warehousingId);
            return this;
        }

        public ConditionBuilder warehousingIdList(List<Long> warehousingId){
            this.warehousingIdList = warehousingId;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingCode (List<String> fuzzyWarehousingCode){
            this.fuzzyWarehousingCode = fuzzyWarehousingCode;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingCode (String ... fuzzyWarehousingCode){
            this.fuzzyWarehousingCode = solveNullList(fuzzyWarehousingCode);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingCode (List<String> rightFuzzyWarehousingCode){
            this.rightFuzzyWarehousingCode = rightFuzzyWarehousingCode;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingCode (String ... rightFuzzyWarehousingCode){
            this.rightFuzzyWarehousingCode = solveNullList(rightFuzzyWarehousingCode);
            return this;
        }

        public ConditionBuilder warehousingCodeList(String ... warehousingCode){
            this.warehousingCodeList = solveNullList(warehousingCode);
            return this;
        }

        public ConditionBuilder warehousingCodeList(List<String> warehousingCode){
            this.warehousingCodeList = warehousingCode;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingLineCode (List<String> fuzzyWarehousingLineCode){
            this.fuzzyWarehousingLineCode = fuzzyWarehousingLineCode;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingLineCode (String ... fuzzyWarehousingLineCode){
            this.fuzzyWarehousingLineCode = solveNullList(fuzzyWarehousingLineCode);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingLineCode (List<String> rightFuzzyWarehousingLineCode){
            this.rightFuzzyWarehousingLineCode = rightFuzzyWarehousingLineCode;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingLineCode (String ... rightFuzzyWarehousingLineCode){
            this.rightFuzzyWarehousingLineCode = solveNullList(rightFuzzyWarehousingLineCode);
            return this;
        }

        public ConditionBuilder warehousingLineCodeList(String ... warehousingLineCode){
            this.warehousingLineCodeList = solveNullList(warehousingLineCode);
            return this;
        }

        public ConditionBuilder warehousingLineCodeList(List<String> warehousingLineCode){
            this.warehousingLineCodeList = warehousingLineCode;
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

        public ConditionBuilder fuzzyWarehousingReasonDescription (List<String> fuzzyWarehousingReasonDescription){
            this.fuzzyWarehousingReasonDescription = fuzzyWarehousingReasonDescription;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingReasonDescription (String ... fuzzyWarehousingReasonDescription){
            this.fuzzyWarehousingReasonDescription = solveNullList(fuzzyWarehousingReasonDescription);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingReasonDescription (List<String> rightFuzzyWarehousingReasonDescription){
            this.rightFuzzyWarehousingReasonDescription = rightFuzzyWarehousingReasonDescription;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingReasonDescription (String ... rightFuzzyWarehousingReasonDescription){
            this.rightFuzzyWarehousingReasonDescription = solveNullList(rightFuzzyWarehousingReasonDescription);
            return this;
        }

        public ConditionBuilder warehousingReasonDescriptionList(String ... warehousingReasonDescription){
            this.warehousingReasonDescriptionList = solveNullList(warehousingReasonDescription);
            return this;
        }

        public ConditionBuilder warehousingReasonDescriptionList(List<String> warehousingReasonDescription){
            this.warehousingReasonDescriptionList = warehousingReasonDescription;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingAffairsDate (List<String> fuzzyWarehousingAffairsDate){
            this.fuzzyWarehousingAffairsDate = fuzzyWarehousingAffairsDate;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingAffairsDate (String ... fuzzyWarehousingAffairsDate){
            this.fuzzyWarehousingAffairsDate = solveNullList(fuzzyWarehousingAffairsDate);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingAffairsDate (List<String> rightFuzzyWarehousingAffairsDate){
            this.rightFuzzyWarehousingAffairsDate = rightFuzzyWarehousingAffairsDate;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingAffairsDate (String ... rightFuzzyWarehousingAffairsDate){
            this.rightFuzzyWarehousingAffairsDate = solveNullList(rightFuzzyWarehousingAffairsDate);
            return this;
        }

        public ConditionBuilder warehousingAffairsDateList(String ... warehousingAffairsDate){
            this.warehousingAffairsDateList = solveNullList(warehousingAffairsDate);
            return this;
        }

        public ConditionBuilder warehousingAffairsDateList(List<String> warehousingAffairsDate){
            this.warehousingAffairsDateList = warehousingAffairsDate;
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

        public ConditionBuilder fuzzyWarehousingBatch (List<String> fuzzyWarehousingBatch){
            this.fuzzyWarehousingBatch = fuzzyWarehousingBatch;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingBatch (String ... fuzzyWarehousingBatch){
            this.fuzzyWarehousingBatch = solveNullList(fuzzyWarehousingBatch);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingBatch (List<String> rightFuzzyWarehousingBatch){
            this.rightFuzzyWarehousingBatch = rightFuzzyWarehousingBatch;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingBatch (String ... rightFuzzyWarehousingBatch){
            this.rightFuzzyWarehousingBatch = solveNullList(rightFuzzyWarehousingBatch);
            return this;
        }

        public ConditionBuilder warehousingBatchList(String ... warehousingBatch){
            this.warehousingBatchList = solveNullList(warehousingBatch);
            return this;
        }

        public ConditionBuilder warehousingBatchList(List<String> warehousingBatch){
            this.warehousingBatchList = warehousingBatch;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingSerie (List<String> fuzzyWarehousingSerie){
            this.fuzzyWarehousingSerie = fuzzyWarehousingSerie;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingSerie (String ... fuzzyWarehousingSerie){
            this.fuzzyWarehousingSerie = solveNullList(fuzzyWarehousingSerie);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingSerie (List<String> rightFuzzyWarehousingSerie){
            this.rightFuzzyWarehousingSerie = rightFuzzyWarehousingSerie;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingSerie (String ... rightFuzzyWarehousingSerie){
            this.rightFuzzyWarehousingSerie = solveNullList(rightFuzzyWarehousingSerie);
            return this;
        }

        public ConditionBuilder warehousingSerieList(String ... warehousingSerie){
            this.warehousingSerieList = solveNullList(warehousingSerie);
            return this;
        }

        public ConditionBuilder warehousingSerieList(List<String> warehousingSerie){
            this.warehousingSerieList = warehousingSerie;
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

        public ConditionBuilder fuzzyWarehousingAffairsSymbol (List<String> fuzzyWarehousingAffairsSymbol){
            this.fuzzyWarehousingAffairsSymbol = fuzzyWarehousingAffairsSymbol;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingAffairsSymbol (String ... fuzzyWarehousingAffairsSymbol){
            this.fuzzyWarehousingAffairsSymbol = solveNullList(fuzzyWarehousingAffairsSymbol);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingAffairsSymbol (List<String> rightFuzzyWarehousingAffairsSymbol){
            this.rightFuzzyWarehousingAffairsSymbol = rightFuzzyWarehousingAffairsSymbol;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingAffairsSymbol (String ... rightFuzzyWarehousingAffairsSymbol){
            this.rightFuzzyWarehousingAffairsSymbol = solveNullList(rightFuzzyWarehousingAffairsSymbol);
            return this;
        }

        public ConditionBuilder warehousingAffairsSymbolList(String ... warehousingAffairsSymbol){
            this.warehousingAffairsSymbolList = solveNullList(warehousingAffairsSymbol);
            return this;
        }

        public ConditionBuilder warehousingAffairsSymbolList(List<String> warehousingAffairsSymbol){
            this.warehousingAffairsSymbolList = warehousingAffairsSymbol;
            return this;
        }

        public ConditionBuilder warehousingNumBetWeen(Integer warehousingNumSt,Integer warehousingNumEd){
            this.warehousingNumSt = warehousingNumSt;
            this.warehousingNumEd = warehousingNumEd;
            return this;
        }

        public ConditionBuilder warehousingNumGreaterEqThan(Integer warehousingNumSt){
            this.warehousingNumSt = warehousingNumSt;
            return this;
        }
        public ConditionBuilder warehousingNumLessEqThan(Integer warehousingNumEd){
            this.warehousingNumEd = warehousingNumEd;
            return this;
        }


        public ConditionBuilder warehousingNumList(Integer ... warehousingNum){
            this.warehousingNumList = solveNullList(warehousingNum);
            return this;
        }

        public ConditionBuilder warehousingNumList(List<Integer> warehousingNum){
            this.warehousingNumList = warehousingNum;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingHeadText (List<String> fuzzyWarehousingHeadText){
            this.fuzzyWarehousingHeadText = fuzzyWarehousingHeadText;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingHeadText (String ... fuzzyWarehousingHeadText){
            this.fuzzyWarehousingHeadText = solveNullList(fuzzyWarehousingHeadText);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingHeadText (List<String> rightFuzzyWarehousingHeadText){
            this.rightFuzzyWarehousingHeadText = rightFuzzyWarehousingHeadText;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingHeadText (String ... rightFuzzyWarehousingHeadText){
            this.rightFuzzyWarehousingHeadText = solveNullList(rightFuzzyWarehousingHeadText);
            return this;
        }

        public ConditionBuilder warehousingHeadTextList(String ... warehousingHeadText){
            this.warehousingHeadTextList = solveNullList(warehousingHeadText);
            return this;
        }

        public ConditionBuilder warehousingHeadTextList(List<String> warehousingHeadText){
            this.warehousingHeadTextList = warehousingHeadText;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingLineText (List<String> fuzzyWarehousingLineText){
            this.fuzzyWarehousingLineText = fuzzyWarehousingLineText;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingLineText (String ... fuzzyWarehousingLineText){
            this.fuzzyWarehousingLineText = solveNullList(fuzzyWarehousingLineText);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingLineText (List<String> rightFuzzyWarehousingLineText){
            this.rightFuzzyWarehousingLineText = rightFuzzyWarehousingLineText;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingLineText (String ... rightFuzzyWarehousingLineText){
            this.rightFuzzyWarehousingLineText = solveNullList(rightFuzzyWarehousingLineText);
            return this;
        }

        public ConditionBuilder warehousingLineTextList(String ... warehousingLineText){
            this.warehousingLineTextList = solveNullList(warehousingLineText);
            return this;
        }

        public ConditionBuilder warehousingLineTextList(List<String> warehousingLineText){
            this.warehousingLineTextList = warehousingLineText;
            return this;
        }

        public ConditionBuilder warehousingInitialUserIdBetWeen(Integer warehousingInitialUserIdSt,Integer warehousingInitialUserIdEd){
            this.warehousingInitialUserIdSt = warehousingInitialUserIdSt;
            this.warehousingInitialUserIdEd = warehousingInitialUserIdEd;
            return this;
        }

        public ConditionBuilder warehousingInitialUserIdGreaterEqThan(Integer warehousingInitialUserIdSt){
            this.warehousingInitialUserIdSt = warehousingInitialUserIdSt;
            return this;
        }
        public ConditionBuilder warehousingInitialUserIdLessEqThan(Integer warehousingInitialUserIdEd){
            this.warehousingInitialUserIdEd = warehousingInitialUserIdEd;
            return this;
        }


        public ConditionBuilder warehousingInitialUserIdList(Integer ... warehousingInitialUserId){
            this.warehousingInitialUserIdList = solveNullList(warehousingInitialUserId);
            return this;
        }

        public ConditionBuilder warehousingInitialUserIdList(List<Integer> warehousingInitialUserId){
            this.warehousingInitialUserIdList = warehousingInitialUserId;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingInitialTime (List<String> fuzzyWarehousingInitialTime){
            this.fuzzyWarehousingInitialTime = fuzzyWarehousingInitialTime;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingInitialTime (String ... fuzzyWarehousingInitialTime){
            this.fuzzyWarehousingInitialTime = solveNullList(fuzzyWarehousingInitialTime);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingInitialTime (List<String> rightFuzzyWarehousingInitialTime){
            this.rightFuzzyWarehousingInitialTime = rightFuzzyWarehousingInitialTime;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingInitialTime (String ... rightFuzzyWarehousingInitialTime){
            this.rightFuzzyWarehousingInitialTime = solveNullList(rightFuzzyWarehousingInitialTime);
            return this;
        }

        public ConditionBuilder warehousingInitialTimeList(String ... warehousingInitialTime){
            this.warehousingInitialTimeList = solveNullList(warehousingInitialTime);
            return this;
        }

        public ConditionBuilder warehousingInitialTimeList(List<String> warehousingInitialTime){
            this.warehousingInitialTimeList = warehousingInitialTime;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingInitialState (List<String> fuzzyWarehousingInitialState){
            this.fuzzyWarehousingInitialState = fuzzyWarehousingInitialState;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingInitialState (String ... fuzzyWarehousingInitialState){
            this.fuzzyWarehousingInitialState = solveNullList(fuzzyWarehousingInitialState);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingInitialState (List<String> rightFuzzyWarehousingInitialState){
            this.rightFuzzyWarehousingInitialState = rightFuzzyWarehousingInitialState;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingInitialState (String ... rightFuzzyWarehousingInitialState){
            this.rightFuzzyWarehousingInitialState = solveNullList(rightFuzzyWarehousingInitialState);
            return this;
        }

        public ConditionBuilder warehousingInitialStateList(String ... warehousingInitialState){
            this.warehousingInitialStateList = solveNullList(warehousingInitialState);
            return this;
        }

        public ConditionBuilder warehousingInitialStateList(List<String> warehousingInitialState){
            this.warehousingInitialStateList = warehousingInitialState;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingInitialUserName (List<String> fuzzyWarehousingInitialUserName){
            this.fuzzyWarehousingInitialUserName = fuzzyWarehousingInitialUserName;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingInitialUserName (String ... fuzzyWarehousingInitialUserName){
            this.fuzzyWarehousingInitialUserName = solveNullList(fuzzyWarehousingInitialUserName);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingInitialUserName (List<String> rightFuzzyWarehousingInitialUserName){
            this.rightFuzzyWarehousingInitialUserName = rightFuzzyWarehousingInitialUserName;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingInitialUserName (String ... rightFuzzyWarehousingInitialUserName){
            this.rightFuzzyWarehousingInitialUserName = solveNullList(rightFuzzyWarehousingInitialUserName);
            return this;
        }

        public ConditionBuilder warehousingInitialUserNameList(String ... warehousingInitialUserName){
            this.warehousingInitialUserNameList = solveNullList(warehousingInitialUserName);
            return this;
        }

        public ConditionBuilder warehousingInitialUserNameList(List<String> warehousingInitialUserName){
            this.warehousingInitialUserNameList = warehousingInitialUserName;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingInitialDepartment (List<String> fuzzyWarehousingInitialDepartment){
            this.fuzzyWarehousingInitialDepartment = fuzzyWarehousingInitialDepartment;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingInitialDepartment (String ... fuzzyWarehousingInitialDepartment){
            this.fuzzyWarehousingInitialDepartment = solveNullList(fuzzyWarehousingInitialDepartment);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingInitialDepartment (List<String> rightFuzzyWarehousingInitialDepartment){
            this.rightFuzzyWarehousingInitialDepartment = rightFuzzyWarehousingInitialDepartment;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingInitialDepartment (String ... rightFuzzyWarehousingInitialDepartment){
            this.rightFuzzyWarehousingInitialDepartment = solveNullList(rightFuzzyWarehousingInitialDepartment);
            return this;
        }

        public ConditionBuilder warehousingInitialDepartmentList(String ... warehousingInitialDepartment){
            this.warehousingInitialDepartmentList = solveNullList(warehousingInitialDepartment);
            return this;
        }

        public ConditionBuilder warehousingInitialDepartmentList(List<String> warehousingInitialDepartment){
            this.warehousingInitialDepartmentList = warehousingInitialDepartment;
            return this;
        }

        public ConditionBuilder fuzzyMaterialContractType (List<String> fuzzyMaterialContractType){
            this.fuzzyMaterialContractType = fuzzyMaterialContractType;
            return this;
        }

        public ConditionBuilder fuzzyMaterialContractType (String ... fuzzyMaterialContractType){
            this.fuzzyMaterialContractType = solveNullList(fuzzyMaterialContractType);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialContractType (List<String> rightFuzzyMaterialContractType){
            this.rightFuzzyMaterialContractType = rightFuzzyMaterialContractType;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialContractType (String ... rightFuzzyMaterialContractType){
            this.rightFuzzyMaterialContractType = solveNullList(rightFuzzyMaterialContractType);
            return this;
        }

        public ConditionBuilder materialContractTypeList(String ... materialContractType){
            this.materialContractTypeList = solveNullList(materialContractType);
            return this;
        }

        public ConditionBuilder materialContractTypeList(List<String> materialContractType){
            this.materialContractTypeList = materialContractType;
            return this;
        }

        public ConditionBuilder fuzzyMaterialManagementType (List<String> fuzzyMaterialManagementType){
            this.fuzzyMaterialManagementType = fuzzyMaterialManagementType;
            return this;
        }

        public ConditionBuilder fuzzyMaterialManagementType (String ... fuzzyMaterialManagementType){
            this.fuzzyMaterialManagementType = solveNullList(fuzzyMaterialManagementType);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialManagementType (List<String> rightFuzzyMaterialManagementType){
            this.rightFuzzyMaterialManagementType = rightFuzzyMaterialManagementType;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialManagementType (String ... rightFuzzyMaterialManagementType){
            this.rightFuzzyMaterialManagementType = solveNullList(rightFuzzyMaterialManagementType);
            return this;
        }

        public ConditionBuilder materialManagementTypeList(String ... materialManagementType){
            this.materialManagementTypeList = solveNullList(materialManagementType);
            return this;
        }

        public ConditionBuilder materialManagementTypeList(List<String> materialManagementType){
            this.materialManagementTypeList = materialManagementType;
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

        public ConditionBuilder fuzzyWarehousingDescription (List<String> fuzzyWarehousingDescription){
            this.fuzzyWarehousingDescription = fuzzyWarehousingDescription;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingDescription (String ... fuzzyWarehousingDescription){
            this.fuzzyWarehousingDescription = solveNullList(fuzzyWarehousingDescription);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingDescription (List<String> rightFuzzyWarehousingDescription){
            this.rightFuzzyWarehousingDescription = rightFuzzyWarehousingDescription;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingDescription (String ... rightFuzzyWarehousingDescription){
            this.rightFuzzyWarehousingDescription = solveNullList(rightFuzzyWarehousingDescription);
            return this;
        }

        public ConditionBuilder warehousingDescriptionList(String ... warehousingDescription){
            this.warehousingDescriptionList = solveNullList(warehousingDescription);
            return this;
        }

        public ConditionBuilder warehousingDescriptionList(List<String> warehousingDescription){
            this.warehousingDescriptionList = warehousingDescription;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingDepartmentCode (List<String> fuzzyWarehousingDepartmentCode){
            this.fuzzyWarehousingDepartmentCode = fuzzyWarehousingDepartmentCode;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingDepartmentCode (String ... fuzzyWarehousingDepartmentCode){
            this.fuzzyWarehousingDepartmentCode = solveNullList(fuzzyWarehousingDepartmentCode);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingDepartmentCode (List<String> rightFuzzyWarehousingDepartmentCode){
            this.rightFuzzyWarehousingDepartmentCode = rightFuzzyWarehousingDepartmentCode;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingDepartmentCode (String ... rightFuzzyWarehousingDepartmentCode){
            this.rightFuzzyWarehousingDepartmentCode = solveNullList(rightFuzzyWarehousingDepartmentCode);
            return this;
        }

        public ConditionBuilder warehousingDepartmentCodeList(String ... warehousingDepartmentCode){
            this.warehousingDepartmentCodeList = solveNullList(warehousingDepartmentCode);
            return this;
        }

        public ConditionBuilder warehousingDepartmentCodeList(List<String> warehousingDepartmentCode){
            this.warehousingDepartmentCodeList = warehousingDepartmentCode;
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

        private Warehousing obj;

        public Builder(){
            this.obj = new Warehousing();
        }

        public Builder warehousingId(Long warehousingId){
            this.obj.setWarehousingId(warehousingId);
            return this;
        }
        public Builder warehousingCode(String warehousingCode){
            this.obj.setWarehousingCode(warehousingCode);
            return this;
        }
        public Builder warehousingLineCode(String warehousingLineCode){
            this.obj.setWarehousingLineCode(warehousingLineCode);
            return this;
        }
        public Builder warehousingReasonCode(String warehousingReasonCode){
            this.obj.setWarehousingReasonCode(warehousingReasonCode);
            return this;
        }
        public Builder warehousingReasonDescription(String warehousingReasonDescription){
            this.obj.setWarehousingReasonDescription(warehousingReasonDescription);
            return this;
        }
        public Builder warehousingAffairsDate(String warehousingAffairsDate){
            this.obj.setWarehousingAffairsDate(warehousingAffairsDate);
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
        public Builder materialUnit(String materialUnit){
            this.obj.setMaterialUnit(materialUnit);
            return this;
        }
        public Builder warehousingBatch(String warehousingBatch){
            this.obj.setWarehousingBatch(warehousingBatch);
            return this;
        }
        public Builder warehousingSerie(String warehousingSerie){
            this.obj.setWarehousingSerie(warehousingSerie);
            return this;
        }
        public Builder warehouseCode(String warehouseCode){
            this.obj.setWarehouseCode(warehouseCode);
            return this;
        }
        public Builder warehousingAffairsSymbol(String warehousingAffairsSymbol){
            this.obj.setWarehousingAffairsSymbol(warehousingAffairsSymbol);
            return this;
        }
        public Builder warehousingNum(Integer warehousingNum){
            this.obj.setWarehousingNum(warehousingNum);
            return this;
        }
        public Builder warehousingHeadText(String warehousingHeadText){
            this.obj.setWarehousingHeadText(warehousingHeadText);
            return this;
        }
        public Builder warehousingLineText(String warehousingLineText){
            this.obj.setWarehousingLineText(warehousingLineText);
            return this;
        }
        public Builder warehousingInitialUserId(Integer warehousingInitialUserId){
            this.obj.setWarehousingInitialUserId(warehousingInitialUserId);
            return this;
        }
        public Builder warehousingInitialTime(String warehousingInitialTime){
            this.obj.setWarehousingInitialTime(warehousingInitialTime);
            return this;
        }
        public Builder warehousingInitialState(String warehousingInitialState){
            this.obj.setWarehousingInitialState(warehousingInitialState);
            return this;
        }
        public Builder warehousingInitialUserName(String warehousingInitialUserName){
            this.obj.setWarehousingInitialUserName(warehousingInitialUserName);
            return this;
        }
        public Builder warehousingInitialDepartment(String warehousingInitialDepartment){
            this.obj.setWarehousingInitialDepartment(warehousingInitialDepartment);
            return this;
        }
        public Builder materialContractType(String materialContractType){
            this.obj.setMaterialContractType(materialContractType);
            return this;
        }
        public Builder materialManagementType(String materialManagementType){
            this.obj.setMaterialManagementType(materialManagementType);
            return this;
        }
        public Builder variables(String variables){
            this.obj.setVariables(variables);
            return this;
        }
        public Builder warehousingDescription(String warehousingDescription){
            this.obj.setWarehousingDescription(warehousingDescription);
            return this;
        }
        public Builder warehousingDepartmentCode(String warehousingDepartmentCode){
            this.obj.setWarehousingDepartmentCode(warehousingDepartmentCode);
            return this;
        }
        public Builder shelfCode(String shelfCode){
            this.obj.setShelfCode(shelfCode);
            return this;
        }
        public Builder simpleApplicationObjectId(Long simpleApplicationObjectId){
            this.obj.setSimpleApplicationObjectId(simpleApplicationObjectId);
            return this;
        }
        public Warehousing build(){return obj;}
    }

}
