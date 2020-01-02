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
public class NewMaterial implements Serializable {

    private static final long serialVersionUID = 1566369502394L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer newMaterialId;

    /**
    * 新物料编号
    * isNullAble:1
    */
    private String newMaterialCode;

    /**
    * 新物料名称
    * isNullAble:1
    */
    private String newMaterialName;

    /**
    * 新物料组
    * isNullAble:1
    */
    private String newMaterialGroup;

    /**
    * 新物料单位
    * isNullAble:1
    */
    private String newMaterialUnit;

    /**
    * 新物料规格
    * isNullAble:1,defaultVal:
    */
    private String newMaterialSpecs;

    /**
    * 新物料库存区分
    * isNullAble:1
    */
    private String warehouseSymbol;

    /**
    * 
    * isNullAble:1
    */
    private Integer applierUserId;

    /**
    * 
    * isNullAble:1
    */
    private String applierUserName;

    /**
    * 
    * isNullAble:1
    */
    private String applyTime;

    /**
    * 
    * isNullAble:1
    */
    private String checkerName;

    /**
    * 
    * isNullAble:1
    */
    private String checkedTime;

    /**
    * 
    * isNullAble:1
    */
    private String state;


    public void setNewMaterialId(Integer newMaterialId){this.newMaterialId = newMaterialId;}

    public Integer getNewMaterialId(){return this.newMaterialId;}

    public void setNewMaterialCode(String newMaterialCode){this.newMaterialCode = newMaterialCode;}

    public String getNewMaterialCode(){return this.newMaterialCode;}

    public void setNewMaterialName(String newMaterialName){this.newMaterialName = newMaterialName;}

    public String getNewMaterialName(){return this.newMaterialName;}

    public void setNewMaterialGroup(String newMaterialGroup){this.newMaterialGroup = newMaterialGroup;}

    public String getNewMaterialGroup(){return this.newMaterialGroup;}

    public void setNewMaterialUnit(String newMaterialUnit){this.newMaterialUnit = newMaterialUnit;}

    public String getNewMaterialUnit(){return this.newMaterialUnit;}

    public void setNewMaterialSpecs(String newMaterialSpecs){this.newMaterialSpecs = newMaterialSpecs;}

    public String getNewMaterialSpecs(){return this.newMaterialSpecs;}

    public void setWarehouseSymbol(String warehouseSymbol){this.warehouseSymbol = warehouseSymbol;}

    public String getWarehouseSymbol(){return this.warehouseSymbol;}

    public void setApplierUserId(Integer applierUserId){this.applierUserId = applierUserId;}

    public Integer getApplierUserId(){return this.applierUserId;}

    public void setApplierUserName(String applierUserName){this.applierUserName = applierUserName;}

    public String getApplierUserName(){return this.applierUserName;}

    public void setApplyTime(String applyTime){this.applyTime = applyTime;}

    public String getApplyTime(){return this.applyTime;}

    public void setCheckerName(String checkerName){this.checkerName = checkerName;}

    public String getCheckerName(){return this.checkerName;}

    public void setCheckedTime(String checkedTime){this.checkedTime = checkedTime;}

    public String getCheckedTime(){return this.checkedTime;}

    public void setState(String state){this.state = state;}

    public String getState(){return this.state;}
    @Override
    public String toString() {
        return "NewMaterial{" +
                "newMaterialId='" + newMaterialId + '\'' +
                "newMaterialCode='" + newMaterialCode + '\'' +
                "newMaterialName='" + newMaterialName + '\'' +
                "newMaterialGroup='" + newMaterialGroup + '\'' +
                "newMaterialUnit='" + newMaterialUnit + '\'' +
                "newMaterialSpecs='" + newMaterialSpecs + '\'' +
                "warehouseSymbol='" + warehouseSymbol + '\'' +
                "applierUserId='" + applierUserId + '\'' +
                "applierUserName='" + applierUserName + '\'' +
                "applyTime='" + applyTime + '\'' +
                "checkerName='" + checkerName + '\'' +
                "checkedTime='" + checkedTime + '\'' +
                "state='" + state + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private NewMaterial set;

        private ConditionBuilder where;

        public UpdateBuilder set(NewMaterial set){
            this.set = set;
            return this;
        }

        public NewMaterial getSet(){
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

    public static class QueryBuilder extends NewMaterial{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> newMaterialIdList;

        public List<Integer> getNewMaterialIdList(){return this.newMaterialIdList;}

        private Integer newMaterialIdSt;

        private Integer newMaterialIdEd;

        public Integer getNewMaterialIdSt(){return this.newMaterialIdSt;}

        public Integer getNewMaterialIdEd(){return this.newMaterialIdEd;}

        private List<String> newMaterialCodeList;

        public List<String> getNewMaterialCodeList(){return this.newMaterialCodeList;}


        private List<String> fuzzyNewMaterialCode;

        public List<String> getFuzzyNewMaterialCode(){return this.fuzzyNewMaterialCode;}

        private List<String> rightFuzzyNewMaterialCode;

        public List<String> getRightFuzzyNewMaterialCode(){return this.rightFuzzyNewMaterialCode;}
        private List<String> newMaterialNameList;

        public List<String> getNewMaterialNameList(){return this.newMaterialNameList;}


        private List<String> fuzzyNewMaterialName;

        public List<String> getFuzzyNewMaterialName(){return this.fuzzyNewMaterialName;}

        private List<String> rightFuzzyNewMaterialName;

        public List<String> getRightFuzzyNewMaterialName(){return this.rightFuzzyNewMaterialName;}
        private List<String> newMaterialGroupList;

        public List<String> getNewMaterialGroupList(){return this.newMaterialGroupList;}


        private List<String> fuzzyNewMaterialGroup;

        public List<String> getFuzzyNewMaterialGroup(){return this.fuzzyNewMaterialGroup;}

        private List<String> rightFuzzyNewMaterialGroup;

        public List<String> getRightFuzzyNewMaterialGroup(){return this.rightFuzzyNewMaterialGroup;}
        private List<String> newMaterialUnitList;

        public List<String> getNewMaterialUnitList(){return this.newMaterialUnitList;}


        private List<String> fuzzyNewMaterialUnit;

        public List<String> getFuzzyNewMaterialUnit(){return this.fuzzyNewMaterialUnit;}

        private List<String> rightFuzzyNewMaterialUnit;

        public List<String> getRightFuzzyNewMaterialUnit(){return this.rightFuzzyNewMaterialUnit;}
        private List<String> newMaterialSpecsList;

        public List<String> getNewMaterialSpecsList(){return this.newMaterialSpecsList;}


        private List<String> fuzzyNewMaterialSpecs;

        public List<String> getFuzzyNewMaterialSpecs(){return this.fuzzyNewMaterialSpecs;}

        private List<String> rightFuzzyNewMaterialSpecs;

        public List<String> getRightFuzzyNewMaterialSpecs(){return this.rightFuzzyNewMaterialSpecs;}
        private List<String> warehouseSymbolList;

        public List<String> getWarehouseSymbolList(){return this.warehouseSymbolList;}


        private List<String> fuzzyWarehouseSymbol;

        public List<String> getFuzzyWarehouseSymbol(){return this.fuzzyWarehouseSymbol;}

        private List<String> rightFuzzyWarehouseSymbol;

        public List<String> getRightFuzzyWarehouseSymbol(){return this.rightFuzzyWarehouseSymbol;}
        private List<Integer> applierUserIdList;

        public List<Integer> getApplierUserIdList(){return this.applierUserIdList;}

        private Integer applierUserIdSt;

        private Integer applierUserIdEd;

        public Integer getApplierUserIdSt(){return this.applierUserIdSt;}

        public Integer getApplierUserIdEd(){return this.applierUserIdEd;}

        private List<String> applierUserNameList;

        public List<String> getApplierUserNameList(){return this.applierUserNameList;}


        private List<String> fuzzyApplierUserName;

        public List<String> getFuzzyApplierUserName(){return this.fuzzyApplierUserName;}

        private List<String> rightFuzzyApplierUserName;

        public List<String> getRightFuzzyApplierUserName(){return this.rightFuzzyApplierUserName;}
        private List<String> applyTimeList;

        public List<String> getApplyTimeList(){return this.applyTimeList;}


        private List<String> fuzzyApplyTime;

        public List<String> getFuzzyApplyTime(){return this.fuzzyApplyTime;}

        private List<String> rightFuzzyApplyTime;

        public List<String> getRightFuzzyApplyTime(){return this.rightFuzzyApplyTime;}
        private List<String> checkerNameList;

        public List<String> getCheckerNameList(){return this.checkerNameList;}


        private List<String> fuzzyCheckerName;

        public List<String> getFuzzyCheckerName(){return this.fuzzyCheckerName;}

        private List<String> rightFuzzyCheckerName;

        public List<String> getRightFuzzyCheckerName(){return this.rightFuzzyCheckerName;}
        private List<String> checkedTimeList;

        public List<String> getCheckedTimeList(){return this.checkedTimeList;}


        private List<String> fuzzyCheckedTime;

        public List<String> getFuzzyCheckedTime(){return this.fuzzyCheckedTime;}

        private List<String> rightFuzzyCheckedTime;

        public List<String> getRightFuzzyCheckedTime(){return this.rightFuzzyCheckedTime;}
        private List<String> stateList;

        public List<String> getStateList(){return this.stateList;}


        private List<String> fuzzyState;

        public List<String> getFuzzyState(){return this.fuzzyState;}

        private List<String> rightFuzzyState;

        public List<String> getRightFuzzyState(){return this.rightFuzzyState;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder newMaterialIdBetWeen(Integer newMaterialIdSt,Integer newMaterialIdEd){
            this.newMaterialIdSt = newMaterialIdSt;
            this.newMaterialIdEd = newMaterialIdEd;
            return this;
        }

        public QueryBuilder newMaterialIdGreaterEqThan(Integer newMaterialIdSt){
            this.newMaterialIdSt = newMaterialIdSt;
            return this;
        }
        public QueryBuilder newMaterialIdLessEqThan(Integer newMaterialIdEd){
            this.newMaterialIdEd = newMaterialIdEd;
            return this;
        }


        public QueryBuilder newMaterialId(Integer newMaterialId){
            setNewMaterialId(newMaterialId);
            return this;
        }

        public QueryBuilder newMaterialIdList(Integer ... newMaterialId){
            this.newMaterialIdList = solveNullList(newMaterialId);
            return this;
        }

        public QueryBuilder newMaterialIdList(List<Integer> newMaterialId){
            this.newMaterialIdList = newMaterialId;
            return this;
        }

        public QueryBuilder fetchNewMaterialId(){
            setFetchFields("fetchFields","newMaterialId");
            return this;
        }

        public QueryBuilder excludeNewMaterialId(){
            setFetchFields("excludeFields","newMaterialId");
            return this;
        }

        public QueryBuilder fuzzyNewMaterialCode (List<String> fuzzyNewMaterialCode){
            this.fuzzyNewMaterialCode = fuzzyNewMaterialCode;
            return this;
        }

        public QueryBuilder fuzzyNewMaterialCode (String ... fuzzyNewMaterialCode){
            this.fuzzyNewMaterialCode = solveNullList(fuzzyNewMaterialCode);
            return this;
        }

        public QueryBuilder rightFuzzyNewMaterialCode (List<String> rightFuzzyNewMaterialCode){
            this.rightFuzzyNewMaterialCode = rightFuzzyNewMaterialCode;
            return this;
        }

        public QueryBuilder rightFuzzyNewMaterialCode (String ... rightFuzzyNewMaterialCode){
            this.rightFuzzyNewMaterialCode = solveNullList(rightFuzzyNewMaterialCode);
            return this;
        }

        public QueryBuilder newMaterialCode(String newMaterialCode){
            setNewMaterialCode(newMaterialCode);
            return this;
        }

        public QueryBuilder newMaterialCodeList(String ... newMaterialCode){
            this.newMaterialCodeList = solveNullList(newMaterialCode);
            return this;
        }

        public QueryBuilder newMaterialCodeList(List<String> newMaterialCode){
            this.newMaterialCodeList = newMaterialCode;
            return this;
        }

        public QueryBuilder fetchNewMaterialCode(){
            setFetchFields("fetchFields","newMaterialCode");
            return this;
        }

        public QueryBuilder excludeNewMaterialCode(){
            setFetchFields("excludeFields","newMaterialCode");
            return this;
        }

        public QueryBuilder fuzzyNewMaterialName (List<String> fuzzyNewMaterialName){
            this.fuzzyNewMaterialName = fuzzyNewMaterialName;
            return this;
        }

        public QueryBuilder fuzzyNewMaterialName (String ... fuzzyNewMaterialName){
            this.fuzzyNewMaterialName = solveNullList(fuzzyNewMaterialName);
            return this;
        }

        public QueryBuilder rightFuzzyNewMaterialName (List<String> rightFuzzyNewMaterialName){
            this.rightFuzzyNewMaterialName = rightFuzzyNewMaterialName;
            return this;
        }

        public QueryBuilder rightFuzzyNewMaterialName (String ... rightFuzzyNewMaterialName){
            this.rightFuzzyNewMaterialName = solveNullList(rightFuzzyNewMaterialName);
            return this;
        }

        public QueryBuilder newMaterialName(String newMaterialName){
            setNewMaterialName(newMaterialName);
            return this;
        }

        public QueryBuilder newMaterialNameList(String ... newMaterialName){
            this.newMaterialNameList = solveNullList(newMaterialName);
            return this;
        }

        public QueryBuilder newMaterialNameList(List<String> newMaterialName){
            this.newMaterialNameList = newMaterialName;
            return this;
        }

        public QueryBuilder fetchNewMaterialName(){
            setFetchFields("fetchFields","newMaterialName");
            return this;
        }

        public QueryBuilder excludeNewMaterialName(){
            setFetchFields("excludeFields","newMaterialName");
            return this;
        }

        public QueryBuilder fuzzyNewMaterialGroup (List<String> fuzzyNewMaterialGroup){
            this.fuzzyNewMaterialGroup = fuzzyNewMaterialGroup;
            return this;
        }

        public QueryBuilder fuzzyNewMaterialGroup (String ... fuzzyNewMaterialGroup){
            this.fuzzyNewMaterialGroup = solveNullList(fuzzyNewMaterialGroup);
            return this;
        }

        public QueryBuilder rightFuzzyNewMaterialGroup (List<String> rightFuzzyNewMaterialGroup){
            this.rightFuzzyNewMaterialGroup = rightFuzzyNewMaterialGroup;
            return this;
        }

        public QueryBuilder rightFuzzyNewMaterialGroup (String ... rightFuzzyNewMaterialGroup){
            this.rightFuzzyNewMaterialGroup = solveNullList(rightFuzzyNewMaterialGroup);
            return this;
        }

        public QueryBuilder newMaterialGroup(String newMaterialGroup){
            setNewMaterialGroup(newMaterialGroup);
            return this;
        }

        public QueryBuilder newMaterialGroupList(String ... newMaterialGroup){
            this.newMaterialGroupList = solveNullList(newMaterialGroup);
            return this;
        }

        public QueryBuilder newMaterialGroupList(List<String> newMaterialGroup){
            this.newMaterialGroupList = newMaterialGroup;
            return this;
        }

        public QueryBuilder fetchNewMaterialGroup(){
            setFetchFields("fetchFields","newMaterialGroup");
            return this;
        }

        public QueryBuilder excludeNewMaterialGroup(){
            setFetchFields("excludeFields","newMaterialGroup");
            return this;
        }

        public QueryBuilder fuzzyNewMaterialUnit (List<String> fuzzyNewMaterialUnit){
            this.fuzzyNewMaterialUnit = fuzzyNewMaterialUnit;
            return this;
        }

        public QueryBuilder fuzzyNewMaterialUnit (String ... fuzzyNewMaterialUnit){
            this.fuzzyNewMaterialUnit = solveNullList(fuzzyNewMaterialUnit);
            return this;
        }

        public QueryBuilder rightFuzzyNewMaterialUnit (List<String> rightFuzzyNewMaterialUnit){
            this.rightFuzzyNewMaterialUnit = rightFuzzyNewMaterialUnit;
            return this;
        }

        public QueryBuilder rightFuzzyNewMaterialUnit (String ... rightFuzzyNewMaterialUnit){
            this.rightFuzzyNewMaterialUnit = solveNullList(rightFuzzyNewMaterialUnit);
            return this;
        }

        public QueryBuilder newMaterialUnit(String newMaterialUnit){
            setNewMaterialUnit(newMaterialUnit);
            return this;
        }

        public QueryBuilder newMaterialUnitList(String ... newMaterialUnit){
            this.newMaterialUnitList = solveNullList(newMaterialUnit);
            return this;
        }

        public QueryBuilder newMaterialUnitList(List<String> newMaterialUnit){
            this.newMaterialUnitList = newMaterialUnit;
            return this;
        }

        public QueryBuilder fetchNewMaterialUnit(){
            setFetchFields("fetchFields","newMaterialUnit");
            return this;
        }

        public QueryBuilder excludeNewMaterialUnit(){
            setFetchFields("excludeFields","newMaterialUnit");
            return this;
        }

        public QueryBuilder fuzzyNewMaterialSpecs (List<String> fuzzyNewMaterialSpecs){
            this.fuzzyNewMaterialSpecs = fuzzyNewMaterialSpecs;
            return this;
        }

        public QueryBuilder fuzzyNewMaterialSpecs (String ... fuzzyNewMaterialSpecs){
            this.fuzzyNewMaterialSpecs = solveNullList(fuzzyNewMaterialSpecs);
            return this;
        }

        public QueryBuilder rightFuzzyNewMaterialSpecs (List<String> rightFuzzyNewMaterialSpecs){
            this.rightFuzzyNewMaterialSpecs = rightFuzzyNewMaterialSpecs;
            return this;
        }

        public QueryBuilder rightFuzzyNewMaterialSpecs (String ... rightFuzzyNewMaterialSpecs){
            this.rightFuzzyNewMaterialSpecs = solveNullList(rightFuzzyNewMaterialSpecs);
            return this;
        }

        public QueryBuilder newMaterialSpecs(String newMaterialSpecs){
            setNewMaterialSpecs(newMaterialSpecs);
            return this;
        }

        public QueryBuilder newMaterialSpecsList(String ... newMaterialSpecs){
            this.newMaterialSpecsList = solveNullList(newMaterialSpecs);
            return this;
        }

        public QueryBuilder newMaterialSpecsList(List<String> newMaterialSpecs){
            this.newMaterialSpecsList = newMaterialSpecs;
            return this;
        }

        public QueryBuilder fetchNewMaterialSpecs(){
            setFetchFields("fetchFields","newMaterialSpecs");
            return this;
        }

        public QueryBuilder excludeNewMaterialSpecs(){
            setFetchFields("excludeFields","newMaterialSpecs");
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

        public QueryBuilder applierUserIdBetWeen(Integer applierUserIdSt,Integer applierUserIdEd){
            this.applierUserIdSt = applierUserIdSt;
            this.applierUserIdEd = applierUserIdEd;
            return this;
        }

        public QueryBuilder applierUserIdGreaterEqThan(Integer applierUserIdSt){
            this.applierUserIdSt = applierUserIdSt;
            return this;
        }
        public QueryBuilder applierUserIdLessEqThan(Integer applierUserIdEd){
            this.applierUserIdEd = applierUserIdEd;
            return this;
        }


        public QueryBuilder applierUserId(Integer applierUserId){
            setApplierUserId(applierUserId);
            return this;
        }

        public QueryBuilder applierUserIdList(Integer ... applierUserId){
            this.applierUserIdList = solveNullList(applierUserId);
            return this;
        }

        public QueryBuilder applierUserIdList(List<Integer> applierUserId){
            this.applierUserIdList = applierUserId;
            return this;
        }

        public QueryBuilder fetchApplierUserId(){
            setFetchFields("fetchFields","applierUserId");
            return this;
        }

        public QueryBuilder excludeApplierUserId(){
            setFetchFields("excludeFields","applierUserId");
            return this;
        }

        public QueryBuilder fuzzyApplierUserName (List<String> fuzzyApplierUserName){
            this.fuzzyApplierUserName = fuzzyApplierUserName;
            return this;
        }

        public QueryBuilder fuzzyApplierUserName (String ... fuzzyApplierUserName){
            this.fuzzyApplierUserName = solveNullList(fuzzyApplierUserName);
            return this;
        }

        public QueryBuilder rightFuzzyApplierUserName (List<String> rightFuzzyApplierUserName){
            this.rightFuzzyApplierUserName = rightFuzzyApplierUserName;
            return this;
        }

        public QueryBuilder rightFuzzyApplierUserName (String ... rightFuzzyApplierUserName){
            this.rightFuzzyApplierUserName = solveNullList(rightFuzzyApplierUserName);
            return this;
        }

        public QueryBuilder applierUserName(String applierUserName){
            setApplierUserName(applierUserName);
            return this;
        }

        public QueryBuilder applierUserNameList(String ... applierUserName){
            this.applierUserNameList = solveNullList(applierUserName);
            return this;
        }

        public QueryBuilder applierUserNameList(List<String> applierUserName){
            this.applierUserNameList = applierUserName;
            return this;
        }

        public QueryBuilder fetchApplierUserName(){
            setFetchFields("fetchFields","applierUserName");
            return this;
        }

        public QueryBuilder excludeApplierUserName(){
            setFetchFields("excludeFields","applierUserName");
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

        public QueryBuilder fuzzyCheckerName (List<String> fuzzyCheckerName){
            this.fuzzyCheckerName = fuzzyCheckerName;
            return this;
        }

        public QueryBuilder fuzzyCheckerName (String ... fuzzyCheckerName){
            this.fuzzyCheckerName = solveNullList(fuzzyCheckerName);
            return this;
        }

        public QueryBuilder rightFuzzyCheckerName (List<String> rightFuzzyCheckerName){
            this.rightFuzzyCheckerName = rightFuzzyCheckerName;
            return this;
        }

        public QueryBuilder rightFuzzyCheckerName (String ... rightFuzzyCheckerName){
            this.rightFuzzyCheckerName = solveNullList(rightFuzzyCheckerName);
            return this;
        }

        public QueryBuilder checkerName(String checkerName){
            setCheckerName(checkerName);
            return this;
        }

        public QueryBuilder checkerNameList(String ... checkerName){
            this.checkerNameList = solveNullList(checkerName);
            return this;
        }

        public QueryBuilder checkerNameList(List<String> checkerName){
            this.checkerNameList = checkerName;
            return this;
        }

        public QueryBuilder fetchCheckerName(){
            setFetchFields("fetchFields","checkerName");
            return this;
        }

        public QueryBuilder excludeCheckerName(){
            setFetchFields("excludeFields","checkerName");
            return this;
        }

        public QueryBuilder fuzzyCheckedTime (List<String> fuzzyCheckedTime){
            this.fuzzyCheckedTime = fuzzyCheckedTime;
            return this;
        }

        public QueryBuilder fuzzyCheckedTime (String ... fuzzyCheckedTime){
            this.fuzzyCheckedTime = solveNullList(fuzzyCheckedTime);
            return this;
        }

        public QueryBuilder rightFuzzyCheckedTime (List<String> rightFuzzyCheckedTime){
            this.rightFuzzyCheckedTime = rightFuzzyCheckedTime;
            return this;
        }

        public QueryBuilder rightFuzzyCheckedTime (String ... rightFuzzyCheckedTime){
            this.rightFuzzyCheckedTime = solveNullList(rightFuzzyCheckedTime);
            return this;
        }

        public QueryBuilder checkedTime(String checkedTime){
            setCheckedTime(checkedTime);
            return this;
        }

        public QueryBuilder checkedTimeList(String ... checkedTime){
            this.checkedTimeList = solveNullList(checkedTime);
            return this;
        }

        public QueryBuilder checkedTimeList(List<String> checkedTime){
            this.checkedTimeList = checkedTime;
            return this;
        }

        public QueryBuilder fetchCheckedTime(){
            setFetchFields("fetchFields","checkedTime");
            return this;
        }

        public QueryBuilder excludeCheckedTime(){
            setFetchFields("excludeFields","checkedTime");
            return this;
        }

        public QueryBuilder fuzzyState (List<String> fuzzyState){
            this.fuzzyState = fuzzyState;
            return this;
        }

        public QueryBuilder fuzzyState (String ... fuzzyState){
            this.fuzzyState = solveNullList(fuzzyState);
            return this;
        }

        public QueryBuilder rightFuzzyState (List<String> rightFuzzyState){
            this.rightFuzzyState = rightFuzzyState;
            return this;
        }

        public QueryBuilder rightFuzzyState (String ... rightFuzzyState){
            this.rightFuzzyState = solveNullList(rightFuzzyState);
            return this;
        }

        public QueryBuilder state(String state){
            setState(state);
            return this;
        }

        public QueryBuilder stateList(String ... state){
            this.stateList = solveNullList(state);
            return this;
        }

        public QueryBuilder stateList(List<String> state){
            this.stateList = state;
            return this;
        }

        public QueryBuilder fetchState(){
            setFetchFields("fetchFields","state");
            return this;
        }

        public QueryBuilder excludeState(){
            setFetchFields("excludeFields","state");
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

        public NewMaterial build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> newMaterialIdList;

        public List<Integer> getNewMaterialIdList(){return this.newMaterialIdList;}

        private Integer newMaterialIdSt;

        private Integer newMaterialIdEd;

        public Integer getNewMaterialIdSt(){return this.newMaterialIdSt;}

        public Integer getNewMaterialIdEd(){return this.newMaterialIdEd;}

        private List<String> newMaterialCodeList;

        public List<String> getNewMaterialCodeList(){return this.newMaterialCodeList;}


        private List<String> fuzzyNewMaterialCode;

        public List<String> getFuzzyNewMaterialCode(){return this.fuzzyNewMaterialCode;}

        private List<String> rightFuzzyNewMaterialCode;

        public List<String> getRightFuzzyNewMaterialCode(){return this.rightFuzzyNewMaterialCode;}
        private List<String> newMaterialNameList;

        public List<String> getNewMaterialNameList(){return this.newMaterialNameList;}


        private List<String> fuzzyNewMaterialName;

        public List<String> getFuzzyNewMaterialName(){return this.fuzzyNewMaterialName;}

        private List<String> rightFuzzyNewMaterialName;

        public List<String> getRightFuzzyNewMaterialName(){return this.rightFuzzyNewMaterialName;}
        private List<String> newMaterialGroupList;

        public List<String> getNewMaterialGroupList(){return this.newMaterialGroupList;}


        private List<String> fuzzyNewMaterialGroup;

        public List<String> getFuzzyNewMaterialGroup(){return this.fuzzyNewMaterialGroup;}

        private List<String> rightFuzzyNewMaterialGroup;

        public List<String> getRightFuzzyNewMaterialGroup(){return this.rightFuzzyNewMaterialGroup;}
        private List<String> newMaterialUnitList;

        public List<String> getNewMaterialUnitList(){return this.newMaterialUnitList;}


        private List<String> fuzzyNewMaterialUnit;

        public List<String> getFuzzyNewMaterialUnit(){return this.fuzzyNewMaterialUnit;}

        private List<String> rightFuzzyNewMaterialUnit;

        public List<String> getRightFuzzyNewMaterialUnit(){return this.rightFuzzyNewMaterialUnit;}
        private List<String> newMaterialSpecsList;

        public List<String> getNewMaterialSpecsList(){return this.newMaterialSpecsList;}


        private List<String> fuzzyNewMaterialSpecs;

        public List<String> getFuzzyNewMaterialSpecs(){return this.fuzzyNewMaterialSpecs;}

        private List<String> rightFuzzyNewMaterialSpecs;

        public List<String> getRightFuzzyNewMaterialSpecs(){return this.rightFuzzyNewMaterialSpecs;}
        private List<String> warehouseSymbolList;

        public List<String> getWarehouseSymbolList(){return this.warehouseSymbolList;}


        private List<String> fuzzyWarehouseSymbol;

        public List<String> getFuzzyWarehouseSymbol(){return this.fuzzyWarehouseSymbol;}

        private List<String> rightFuzzyWarehouseSymbol;

        public List<String> getRightFuzzyWarehouseSymbol(){return this.rightFuzzyWarehouseSymbol;}
        private List<Integer> applierUserIdList;

        public List<Integer> getApplierUserIdList(){return this.applierUserIdList;}

        private Integer applierUserIdSt;

        private Integer applierUserIdEd;

        public Integer getApplierUserIdSt(){return this.applierUserIdSt;}

        public Integer getApplierUserIdEd(){return this.applierUserIdEd;}

        private List<String> applierUserNameList;

        public List<String> getApplierUserNameList(){return this.applierUserNameList;}


        private List<String> fuzzyApplierUserName;

        public List<String> getFuzzyApplierUserName(){return this.fuzzyApplierUserName;}

        private List<String> rightFuzzyApplierUserName;

        public List<String> getRightFuzzyApplierUserName(){return this.rightFuzzyApplierUserName;}
        private List<String> applyTimeList;

        public List<String> getApplyTimeList(){return this.applyTimeList;}


        private List<String> fuzzyApplyTime;

        public List<String> getFuzzyApplyTime(){return this.fuzzyApplyTime;}

        private List<String> rightFuzzyApplyTime;

        public List<String> getRightFuzzyApplyTime(){return this.rightFuzzyApplyTime;}
        private List<String> checkerNameList;

        public List<String> getCheckerNameList(){return this.checkerNameList;}


        private List<String> fuzzyCheckerName;

        public List<String> getFuzzyCheckerName(){return this.fuzzyCheckerName;}

        private List<String> rightFuzzyCheckerName;

        public List<String> getRightFuzzyCheckerName(){return this.rightFuzzyCheckerName;}
        private List<String> checkedTimeList;

        public List<String> getCheckedTimeList(){return this.checkedTimeList;}


        private List<String> fuzzyCheckedTime;

        public List<String> getFuzzyCheckedTime(){return this.fuzzyCheckedTime;}

        private List<String> rightFuzzyCheckedTime;

        public List<String> getRightFuzzyCheckedTime(){return this.rightFuzzyCheckedTime;}
        private List<String> stateList;

        public List<String> getStateList(){return this.stateList;}


        private List<String> fuzzyState;

        public List<String> getFuzzyState(){return this.fuzzyState;}

        private List<String> rightFuzzyState;

        public List<String> getRightFuzzyState(){return this.rightFuzzyState;}

        public ConditionBuilder newMaterialIdBetWeen(Integer newMaterialIdSt,Integer newMaterialIdEd){
            this.newMaterialIdSt = newMaterialIdSt;
            this.newMaterialIdEd = newMaterialIdEd;
            return this;
        }

        public ConditionBuilder newMaterialIdGreaterEqThan(Integer newMaterialIdSt){
            this.newMaterialIdSt = newMaterialIdSt;
            return this;
        }
        public ConditionBuilder newMaterialIdLessEqThan(Integer newMaterialIdEd){
            this.newMaterialIdEd = newMaterialIdEd;
            return this;
        }


        public ConditionBuilder newMaterialIdList(Integer ... newMaterialId){
            this.newMaterialIdList = solveNullList(newMaterialId);
            return this;
        }

        public ConditionBuilder newMaterialIdList(List<Integer> newMaterialId){
            this.newMaterialIdList = newMaterialId;
            return this;
        }

        public ConditionBuilder fuzzyNewMaterialCode (List<String> fuzzyNewMaterialCode){
            this.fuzzyNewMaterialCode = fuzzyNewMaterialCode;
            return this;
        }

        public ConditionBuilder fuzzyNewMaterialCode (String ... fuzzyNewMaterialCode){
            this.fuzzyNewMaterialCode = solveNullList(fuzzyNewMaterialCode);
            return this;
        }

        public ConditionBuilder rightFuzzyNewMaterialCode (List<String> rightFuzzyNewMaterialCode){
            this.rightFuzzyNewMaterialCode = rightFuzzyNewMaterialCode;
            return this;
        }

        public ConditionBuilder rightFuzzyNewMaterialCode (String ... rightFuzzyNewMaterialCode){
            this.rightFuzzyNewMaterialCode = solveNullList(rightFuzzyNewMaterialCode);
            return this;
        }

        public ConditionBuilder newMaterialCodeList(String ... newMaterialCode){
            this.newMaterialCodeList = solveNullList(newMaterialCode);
            return this;
        }

        public ConditionBuilder newMaterialCodeList(List<String> newMaterialCode){
            this.newMaterialCodeList = newMaterialCode;
            return this;
        }

        public ConditionBuilder fuzzyNewMaterialName (List<String> fuzzyNewMaterialName){
            this.fuzzyNewMaterialName = fuzzyNewMaterialName;
            return this;
        }

        public ConditionBuilder fuzzyNewMaterialName (String ... fuzzyNewMaterialName){
            this.fuzzyNewMaterialName = solveNullList(fuzzyNewMaterialName);
            return this;
        }

        public ConditionBuilder rightFuzzyNewMaterialName (List<String> rightFuzzyNewMaterialName){
            this.rightFuzzyNewMaterialName = rightFuzzyNewMaterialName;
            return this;
        }

        public ConditionBuilder rightFuzzyNewMaterialName (String ... rightFuzzyNewMaterialName){
            this.rightFuzzyNewMaterialName = solveNullList(rightFuzzyNewMaterialName);
            return this;
        }

        public ConditionBuilder newMaterialNameList(String ... newMaterialName){
            this.newMaterialNameList = solveNullList(newMaterialName);
            return this;
        }

        public ConditionBuilder newMaterialNameList(List<String> newMaterialName){
            this.newMaterialNameList = newMaterialName;
            return this;
        }

        public ConditionBuilder fuzzyNewMaterialGroup (List<String> fuzzyNewMaterialGroup){
            this.fuzzyNewMaterialGroup = fuzzyNewMaterialGroup;
            return this;
        }

        public ConditionBuilder fuzzyNewMaterialGroup (String ... fuzzyNewMaterialGroup){
            this.fuzzyNewMaterialGroup = solveNullList(fuzzyNewMaterialGroup);
            return this;
        }

        public ConditionBuilder rightFuzzyNewMaterialGroup (List<String> rightFuzzyNewMaterialGroup){
            this.rightFuzzyNewMaterialGroup = rightFuzzyNewMaterialGroup;
            return this;
        }

        public ConditionBuilder rightFuzzyNewMaterialGroup (String ... rightFuzzyNewMaterialGroup){
            this.rightFuzzyNewMaterialGroup = solveNullList(rightFuzzyNewMaterialGroup);
            return this;
        }

        public ConditionBuilder newMaterialGroupList(String ... newMaterialGroup){
            this.newMaterialGroupList = solveNullList(newMaterialGroup);
            return this;
        }

        public ConditionBuilder newMaterialGroupList(List<String> newMaterialGroup){
            this.newMaterialGroupList = newMaterialGroup;
            return this;
        }

        public ConditionBuilder fuzzyNewMaterialUnit (List<String> fuzzyNewMaterialUnit){
            this.fuzzyNewMaterialUnit = fuzzyNewMaterialUnit;
            return this;
        }

        public ConditionBuilder fuzzyNewMaterialUnit (String ... fuzzyNewMaterialUnit){
            this.fuzzyNewMaterialUnit = solveNullList(fuzzyNewMaterialUnit);
            return this;
        }

        public ConditionBuilder rightFuzzyNewMaterialUnit (List<String> rightFuzzyNewMaterialUnit){
            this.rightFuzzyNewMaterialUnit = rightFuzzyNewMaterialUnit;
            return this;
        }

        public ConditionBuilder rightFuzzyNewMaterialUnit (String ... rightFuzzyNewMaterialUnit){
            this.rightFuzzyNewMaterialUnit = solveNullList(rightFuzzyNewMaterialUnit);
            return this;
        }

        public ConditionBuilder newMaterialUnitList(String ... newMaterialUnit){
            this.newMaterialUnitList = solveNullList(newMaterialUnit);
            return this;
        }

        public ConditionBuilder newMaterialUnitList(List<String> newMaterialUnit){
            this.newMaterialUnitList = newMaterialUnit;
            return this;
        }

        public ConditionBuilder fuzzyNewMaterialSpecs (List<String> fuzzyNewMaterialSpecs){
            this.fuzzyNewMaterialSpecs = fuzzyNewMaterialSpecs;
            return this;
        }

        public ConditionBuilder fuzzyNewMaterialSpecs (String ... fuzzyNewMaterialSpecs){
            this.fuzzyNewMaterialSpecs = solveNullList(fuzzyNewMaterialSpecs);
            return this;
        }

        public ConditionBuilder rightFuzzyNewMaterialSpecs (List<String> rightFuzzyNewMaterialSpecs){
            this.rightFuzzyNewMaterialSpecs = rightFuzzyNewMaterialSpecs;
            return this;
        }

        public ConditionBuilder rightFuzzyNewMaterialSpecs (String ... rightFuzzyNewMaterialSpecs){
            this.rightFuzzyNewMaterialSpecs = solveNullList(rightFuzzyNewMaterialSpecs);
            return this;
        }

        public ConditionBuilder newMaterialSpecsList(String ... newMaterialSpecs){
            this.newMaterialSpecsList = solveNullList(newMaterialSpecs);
            return this;
        }

        public ConditionBuilder newMaterialSpecsList(List<String> newMaterialSpecs){
            this.newMaterialSpecsList = newMaterialSpecs;
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

        public ConditionBuilder applierUserIdBetWeen(Integer applierUserIdSt,Integer applierUserIdEd){
            this.applierUserIdSt = applierUserIdSt;
            this.applierUserIdEd = applierUserIdEd;
            return this;
        }

        public ConditionBuilder applierUserIdGreaterEqThan(Integer applierUserIdSt){
            this.applierUserIdSt = applierUserIdSt;
            return this;
        }
        public ConditionBuilder applierUserIdLessEqThan(Integer applierUserIdEd){
            this.applierUserIdEd = applierUserIdEd;
            return this;
        }


        public ConditionBuilder applierUserIdList(Integer ... applierUserId){
            this.applierUserIdList = solveNullList(applierUserId);
            return this;
        }

        public ConditionBuilder applierUserIdList(List<Integer> applierUserId){
            this.applierUserIdList = applierUserId;
            return this;
        }

        public ConditionBuilder fuzzyApplierUserName (List<String> fuzzyApplierUserName){
            this.fuzzyApplierUserName = fuzzyApplierUserName;
            return this;
        }

        public ConditionBuilder fuzzyApplierUserName (String ... fuzzyApplierUserName){
            this.fuzzyApplierUserName = solveNullList(fuzzyApplierUserName);
            return this;
        }

        public ConditionBuilder rightFuzzyApplierUserName (List<String> rightFuzzyApplierUserName){
            this.rightFuzzyApplierUserName = rightFuzzyApplierUserName;
            return this;
        }

        public ConditionBuilder rightFuzzyApplierUserName (String ... rightFuzzyApplierUserName){
            this.rightFuzzyApplierUserName = solveNullList(rightFuzzyApplierUserName);
            return this;
        }

        public ConditionBuilder applierUserNameList(String ... applierUserName){
            this.applierUserNameList = solveNullList(applierUserName);
            return this;
        }

        public ConditionBuilder applierUserNameList(List<String> applierUserName){
            this.applierUserNameList = applierUserName;
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

        public ConditionBuilder fuzzyCheckerName (List<String> fuzzyCheckerName){
            this.fuzzyCheckerName = fuzzyCheckerName;
            return this;
        }

        public ConditionBuilder fuzzyCheckerName (String ... fuzzyCheckerName){
            this.fuzzyCheckerName = solveNullList(fuzzyCheckerName);
            return this;
        }

        public ConditionBuilder rightFuzzyCheckerName (List<String> rightFuzzyCheckerName){
            this.rightFuzzyCheckerName = rightFuzzyCheckerName;
            return this;
        }

        public ConditionBuilder rightFuzzyCheckerName (String ... rightFuzzyCheckerName){
            this.rightFuzzyCheckerName = solveNullList(rightFuzzyCheckerName);
            return this;
        }

        public ConditionBuilder checkerNameList(String ... checkerName){
            this.checkerNameList = solveNullList(checkerName);
            return this;
        }

        public ConditionBuilder checkerNameList(List<String> checkerName){
            this.checkerNameList = checkerName;
            return this;
        }

        public ConditionBuilder fuzzyCheckedTime (List<String> fuzzyCheckedTime){
            this.fuzzyCheckedTime = fuzzyCheckedTime;
            return this;
        }

        public ConditionBuilder fuzzyCheckedTime (String ... fuzzyCheckedTime){
            this.fuzzyCheckedTime = solveNullList(fuzzyCheckedTime);
            return this;
        }

        public ConditionBuilder rightFuzzyCheckedTime (List<String> rightFuzzyCheckedTime){
            this.rightFuzzyCheckedTime = rightFuzzyCheckedTime;
            return this;
        }

        public ConditionBuilder rightFuzzyCheckedTime (String ... rightFuzzyCheckedTime){
            this.rightFuzzyCheckedTime = solveNullList(rightFuzzyCheckedTime);
            return this;
        }

        public ConditionBuilder checkedTimeList(String ... checkedTime){
            this.checkedTimeList = solveNullList(checkedTime);
            return this;
        }

        public ConditionBuilder checkedTimeList(List<String> checkedTime){
            this.checkedTimeList = checkedTime;
            return this;
        }

        public ConditionBuilder fuzzyState (List<String> fuzzyState){
            this.fuzzyState = fuzzyState;
            return this;
        }

        public ConditionBuilder fuzzyState (String ... fuzzyState){
            this.fuzzyState = solveNullList(fuzzyState);
            return this;
        }

        public ConditionBuilder rightFuzzyState (List<String> rightFuzzyState){
            this.rightFuzzyState = rightFuzzyState;
            return this;
        }

        public ConditionBuilder rightFuzzyState (String ... rightFuzzyState){
            this.rightFuzzyState = solveNullList(rightFuzzyState);
            return this;
        }

        public ConditionBuilder stateList(String ... state){
            this.stateList = solveNullList(state);
            return this;
        }

        public ConditionBuilder stateList(List<String> state){
            this.stateList = state;
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

        private NewMaterial obj;

        public Builder(){
            this.obj = new NewMaterial();
        }

        public Builder newMaterialId(Integer newMaterialId){
            this.obj.setNewMaterialId(newMaterialId);
            return this;
        }
        public Builder newMaterialCode(String newMaterialCode){
            this.obj.setNewMaterialCode(newMaterialCode);
            return this;
        }
        public Builder newMaterialName(String newMaterialName){
            this.obj.setNewMaterialName(newMaterialName);
            return this;
        }
        public Builder newMaterialGroup(String newMaterialGroup){
            this.obj.setNewMaterialGroup(newMaterialGroup);
            return this;
        }
        public Builder newMaterialUnit(String newMaterialUnit){
            this.obj.setNewMaterialUnit(newMaterialUnit);
            return this;
        }
        public Builder newMaterialSpecs(String newMaterialSpecs){
            this.obj.setNewMaterialSpecs(newMaterialSpecs);
            return this;
        }
        public Builder warehouseSymbol(String warehouseSymbol){
            this.obj.setWarehouseSymbol(warehouseSymbol);
            return this;
        }
        public Builder applierUserId(Integer applierUserId){
            this.obj.setApplierUserId(applierUserId);
            return this;
        }
        public Builder applierUserName(String applierUserName){
            this.obj.setApplierUserName(applierUserName);
            return this;
        }
        public Builder applyTime(String applyTime){
            this.obj.setApplyTime(applyTime);
            return this;
        }
        public Builder checkerName(String checkerName){
            this.obj.setCheckerName(checkerName);
            return this;
        }
        public Builder checkedTime(String checkedTime){
            this.obj.setCheckedTime(checkedTime);
            return this;
        }
        public Builder state(String state){
            this.obj.setState(state);
            return this;
        }
        public NewMaterial build(){return obj;}
    }

}
