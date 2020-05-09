package com.gamc.efactory.model.dataObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author lizeh
*/
public class MqmsFailureTrack implements Serializable {

    private static final long serialVersionUID = 1586751163333L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer failureTrackId;

    /**
    * 索赔单号
    * isNullAble:1
    */
    private String voucherCode;

    /**
    * 
    * isNullAble:1
    */
    private String engOrTran;

    /**
    * 流程系统id
    * isNullAble:1
    */
    private Long saoId;

    /**
    * 不良追踪负责人id
    * isNullAble:1
    */
    private Integer trackBeginerId;

    /**
    * 不良追踪负责人工号
    * isNullAble:1
    */
    private String trackBeginerNo;

    /**
    * 不良追踪负责人姓名
    * isNullAble:1
    */
    private String trackBeginerName;

    /**
    * 快递负责人id号
    * isNullAble:1
    */
    private Integer deliveryPersonId;

    /**
    * 快递负责人
    * isNullAble:1
    */
    private String deliveryPersonName;

    /**
    * 快递状态
    * isNullAble:1
    */
    private String deliveryState;

    /**
    * 要求快递抵达时间
    * isNullAble:1
    */
    private String deliveryDeadline;

    /**
    * 快递抵达时间
    * isNullAble:1
    */
    private String deliveryReceivedDate;

    /**
    * 快递单号
    * isNullAble:1
    */
    private String deliveryCode;

    /**
    * 外观情况
    * isNullAble:1
    */
    private String appearance;

    /**
    * 是否装车测试
    * isNullAble:1
    */
    private String carTestSymbol;

    /**
    * 故障再现者id
    * isNullAble:1
    */
    private Integer failureReappearPersonId;

    /**
    * 故障再现者姓名
    * isNullAble:1
    */
    private String failureReappearPersonName;

    /**
    * 是否故障再现
    * isNullAble:1
    */
    private String failureReappearSymbol;

    /**
    * 
    * isNullAble:1
    */
    private String reloadDate;

    /**
    * 故障再现日期
    * isNullAble:1
    */
    private String failureReappearDate;

    /**
    * 故障再现工况
    * isNullAble:1
    */
    private String failureReappearSituation;

    /**
    * 故障再现结果
    * isNullAble:1
    */
    private String failureReappearResult;

    /**
    * 解析科室
    * isNullAble:1
    */
    private String analysisDepartments;

    /**
    * 解析截点
    * isNullAble:1
    */
    private String analysisDeadline;

    /**
    * 解析要求
    * isNullAble:1
    */
    private String analysisRequirement;

    /**
    * 重要度
    * isNullAble:1
    */
    private String importance;

    /**
    * 附件
    * isNullAble:1,defaultVal:
    */
    private String appendix;

    /**
    * 流程状态
    * isNullAble:1
    */
    private String processState;


    public void setFailureTrackId(Integer failureTrackId){this.failureTrackId = failureTrackId;}

    public Integer getFailureTrackId(){return this.failureTrackId;}

    public void setVoucherCode(String voucherCode){this.voucherCode = voucherCode;}

    public String getVoucherCode(){return this.voucherCode;}

    public void setEngOrTran(String engOrTran){this.engOrTran = engOrTran;}

    public String getEngOrTran(){return this.engOrTran;}

    public void setSaoId(Long saoId){this.saoId = saoId;}

    public Long getSaoId(){return this.saoId;}

    public void setTrackBeginerId(Integer trackBeginerId){this.trackBeginerId = trackBeginerId;}

    public Integer getTrackBeginerId(){return this.trackBeginerId;}

    public void setTrackBeginerNo(String trackBeginerNo){this.trackBeginerNo = trackBeginerNo;}

    public String getTrackBeginerNo(){return this.trackBeginerNo;}

    public void setTrackBeginerName(String trackBeginerName){this.trackBeginerName = trackBeginerName;}

    public String getTrackBeginerName(){return this.trackBeginerName;}

    public void setDeliveryPersonId(Integer deliveryPersonId){this.deliveryPersonId = deliveryPersonId;}

    public Integer getDeliveryPersonId(){return this.deliveryPersonId;}

    public void setDeliveryPersonName(String deliveryPersonName){this.deliveryPersonName = deliveryPersonName;}

    public String getDeliveryPersonName(){return this.deliveryPersonName;}

    public void setDeliveryState(String deliveryState){this.deliveryState = deliveryState;}

    public String getDeliveryState(){return this.deliveryState;}

    public void setDeliveryDeadline(String deliveryDeadline){this.deliveryDeadline = deliveryDeadline;}

    public String getDeliveryDeadline(){return this.deliveryDeadline;}

    public void setDeliveryReceivedDate(String deliveryReceivedDate){this.deliveryReceivedDate = deliveryReceivedDate;}

    public String getDeliveryReceivedDate(){return this.deliveryReceivedDate;}

    public void setDeliveryCode(String deliveryCode){this.deliveryCode = deliveryCode;}

    public String getDeliveryCode(){return this.deliveryCode;}

    public void setAppearance(String appearance){this.appearance = appearance;}

    public String getAppearance(){return this.appearance;}

    public void setCarTestSymbol(String carTestSymbol){this.carTestSymbol = carTestSymbol;}

    public String getCarTestSymbol(){return this.carTestSymbol;}

    public void setFailureReappearPersonId(Integer failureReappearPersonId){this.failureReappearPersonId = failureReappearPersonId;}

    public Integer getFailureReappearPersonId(){return this.failureReappearPersonId;}

    public void setFailureReappearPersonName(String failureReappearPersonName){this.failureReappearPersonName = failureReappearPersonName;}

    public String getFailureReappearPersonName(){return this.failureReappearPersonName;}

    public void setFailureReappearSymbol(String failureReappearSymbol){this.failureReappearSymbol = failureReappearSymbol;}

    public String getFailureReappearSymbol(){return this.failureReappearSymbol;}

    public void setReloadDate(String reloadDate){this.reloadDate = reloadDate;}

    public String getReloadDate(){return this.reloadDate;}

    public void setFailureReappearDate(String failureReappearDate){this.failureReappearDate = failureReappearDate;}

    public String getFailureReappearDate(){return this.failureReappearDate;}

    public void setFailureReappearSituation(String failureReappearSituation){this.failureReappearSituation = failureReappearSituation;}

    public String getFailureReappearSituation(){return this.failureReappearSituation;}

    public void setFailureReappearResult(String failureReappearResult){this.failureReappearResult = failureReappearResult;}

    public String getFailureReappearResult(){return this.failureReappearResult;}

    public void setAnalysisDepartments(String analysisDepartments){this.analysisDepartments = analysisDepartments;}

    public String getAnalysisDepartments(){return this.analysisDepartments;}

    public void setAnalysisDeadline(String analysisDeadline){this.analysisDeadline = analysisDeadline;}

    public String getAnalysisDeadline(){return this.analysisDeadline;}

    public void setAnalysisRequirement(String analysisRequirement){this.analysisRequirement = analysisRequirement;}

    public String getAnalysisRequirement(){return this.analysisRequirement;}

    public void setImportance(String importance){this.importance = importance;}

    public String getImportance(){return this.importance;}

    public void setAppendix(String appendix){this.appendix = appendix;}

    public String getAppendix(){return this.appendix;}

    public void setProcessState(String processState){this.processState = processState;}

    public String getProcessState(){return this.processState;}
    @Override
    public String toString() {
        return "MqmsFailureTrack{" +
                "failureTrackId='" + failureTrackId + '\'' +
                "voucherCode='" + voucherCode + '\'' +
                "engOrTran='" + engOrTran + '\'' +
                "saoId='" + saoId + '\'' +
                "trackBeginerId='" + trackBeginerId + '\'' +
                "trackBeginerNo='" + trackBeginerNo + '\'' +
                "trackBeginerName='" + trackBeginerName + '\'' +
                "deliveryPersonId='" + deliveryPersonId + '\'' +
                "deliveryPersonName='" + deliveryPersonName + '\'' +
                "deliveryState='" + deliveryState + '\'' +
                "deliveryDeadline='" + deliveryDeadline + '\'' +
                "deliveryReceivedDate='" + deliveryReceivedDate + '\'' +
                "deliveryCode='" + deliveryCode + '\'' +
                "appearance='" + appearance + '\'' +
                "carTestSymbol='" + carTestSymbol + '\'' +
                "failureReappearPersonId='" + failureReappearPersonId + '\'' +
                "failureReappearPersonName='" + failureReappearPersonName + '\'' +
                "failureReappearSymbol='" + failureReappearSymbol + '\'' +
                "reloadDate='" + reloadDate + '\'' +
                "failureReappearDate='" + failureReappearDate + '\'' +
                "failureReappearSituation='" + failureReappearSituation + '\'' +
                "failureReappearResult='" + failureReappearResult + '\'' +
                "analysisDepartments='" + analysisDepartments + '\'' +
                "analysisDeadline='" + analysisDeadline + '\'' +
                "analysisRequirement='" + analysisRequirement + '\'' +
                "importance='" + importance + '\'' +
                "appendix='" + appendix + '\'' +
                "processState='" + processState + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsFailureTrack set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsFailureTrack set){
            this.set = set;
            return this;
        }

        public MqmsFailureTrack getSet(){
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

    public static class QueryBuilder extends MqmsFailureTrack{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> failureTrackIdList;

        public List<Integer> getFailureTrackIdList(){return this.failureTrackIdList;}

        private Integer failureTrackIdSt;

        private Integer failureTrackIdEd;

        public Integer getFailureTrackIdSt(){return this.failureTrackIdSt;}

        public Integer getFailureTrackIdEd(){return this.failureTrackIdEd;}

        private List<String> voucherCodeList;

        public List<String> getVoucherCodeList(){return this.voucherCodeList;}


        private List<String> fuzzyVoucherCode;

        public List<String> getFuzzyVoucherCode(){return this.fuzzyVoucherCode;}

        private List<String> rightFuzzyVoucherCode;

        public List<String> getRightFuzzyVoucherCode(){return this.rightFuzzyVoucherCode;}
        private List<String> engOrTranList;

        public List<String> getEngOrTranList(){return this.engOrTranList;}


        private List<String> fuzzyEngOrTran;

        public List<String> getFuzzyEngOrTran(){return this.fuzzyEngOrTran;}

        private List<String> rightFuzzyEngOrTran;

        public List<String> getRightFuzzyEngOrTran(){return this.rightFuzzyEngOrTran;}
        private List<Long> saoIdList;

        public List<Long> getSaoIdList(){return this.saoIdList;}

        private Long saoIdSt;

        private Long saoIdEd;

        public Long getSaoIdSt(){return this.saoIdSt;}

        public Long getSaoIdEd(){return this.saoIdEd;}

        private List<Integer> trackBeginerIdList;

        public List<Integer> getTrackBeginerIdList(){return this.trackBeginerIdList;}

        private Integer trackBeginerIdSt;

        private Integer trackBeginerIdEd;

        public Integer getTrackBeginerIdSt(){return this.trackBeginerIdSt;}

        public Integer getTrackBeginerIdEd(){return this.trackBeginerIdEd;}

        private List<String> trackBeginerNoList;

        public List<String> getTrackBeginerNoList(){return this.trackBeginerNoList;}


        private List<String> fuzzyTrackBeginerNo;

        public List<String> getFuzzyTrackBeginerNo(){return this.fuzzyTrackBeginerNo;}

        private List<String> rightFuzzyTrackBeginerNo;

        public List<String> getRightFuzzyTrackBeginerNo(){return this.rightFuzzyTrackBeginerNo;}
        private List<String> trackBeginerNameList;

        public List<String> getTrackBeginerNameList(){return this.trackBeginerNameList;}


        private List<String> fuzzyTrackBeginerName;

        public List<String> getFuzzyTrackBeginerName(){return this.fuzzyTrackBeginerName;}

        private List<String> rightFuzzyTrackBeginerName;

        public List<String> getRightFuzzyTrackBeginerName(){return this.rightFuzzyTrackBeginerName;}
        private List<Integer> deliveryPersonIdList;

        public List<Integer> getDeliveryPersonIdList(){return this.deliveryPersonIdList;}

        private Integer deliveryPersonIdSt;

        private Integer deliveryPersonIdEd;

        public Integer getDeliveryPersonIdSt(){return this.deliveryPersonIdSt;}

        public Integer getDeliveryPersonIdEd(){return this.deliveryPersonIdEd;}

        private List<String> deliveryPersonNameList;

        public List<String> getDeliveryPersonNameList(){return this.deliveryPersonNameList;}


        private List<String> fuzzyDeliveryPersonName;

        public List<String> getFuzzyDeliveryPersonName(){return this.fuzzyDeliveryPersonName;}

        private List<String> rightFuzzyDeliveryPersonName;

        public List<String> getRightFuzzyDeliveryPersonName(){return this.rightFuzzyDeliveryPersonName;}
        private List<String> deliveryStateList;

        public List<String> getDeliveryStateList(){return this.deliveryStateList;}


        private List<String> fuzzyDeliveryState;

        public List<String> getFuzzyDeliveryState(){return this.fuzzyDeliveryState;}

        private List<String> rightFuzzyDeliveryState;

        public List<String> getRightFuzzyDeliveryState(){return this.rightFuzzyDeliveryState;}
        private List<String> deliveryDeadlineList;

        public List<String> getDeliveryDeadlineList(){return this.deliveryDeadlineList;}


        private List<String> fuzzyDeliveryDeadline;

        public List<String> getFuzzyDeliveryDeadline(){return this.fuzzyDeliveryDeadline;}

        private List<String> rightFuzzyDeliveryDeadline;

        public List<String> getRightFuzzyDeliveryDeadline(){return this.rightFuzzyDeliveryDeadline;}
        private List<String> deliveryReceivedDateList;

        public List<String> getDeliveryReceivedDateList(){return this.deliveryReceivedDateList;}


        private List<String> fuzzyDeliveryReceivedDate;

        public List<String> getFuzzyDeliveryReceivedDate(){return this.fuzzyDeliveryReceivedDate;}

        private List<String> rightFuzzyDeliveryReceivedDate;

        public List<String> getRightFuzzyDeliveryReceivedDate(){return this.rightFuzzyDeliveryReceivedDate;}
        private List<String> deliveryCodeList;

        public List<String> getDeliveryCodeList(){return this.deliveryCodeList;}


        private List<String> fuzzyDeliveryCode;

        public List<String> getFuzzyDeliveryCode(){return this.fuzzyDeliveryCode;}

        private List<String> rightFuzzyDeliveryCode;

        public List<String> getRightFuzzyDeliveryCode(){return this.rightFuzzyDeliveryCode;}
        private List<String> appearanceList;

        public List<String> getAppearanceList(){return this.appearanceList;}


        private List<String> fuzzyAppearance;

        public List<String> getFuzzyAppearance(){return this.fuzzyAppearance;}

        private List<String> rightFuzzyAppearance;

        public List<String> getRightFuzzyAppearance(){return this.rightFuzzyAppearance;}
        private List<String> carTestSymbolList;

        public List<String> getCarTestSymbolList(){return this.carTestSymbolList;}


        private List<String> fuzzyCarTestSymbol;

        public List<String> getFuzzyCarTestSymbol(){return this.fuzzyCarTestSymbol;}

        private List<String> rightFuzzyCarTestSymbol;

        public List<String> getRightFuzzyCarTestSymbol(){return this.rightFuzzyCarTestSymbol;}
        private List<Integer> failureReappearPersonIdList;

        public List<Integer> getFailureReappearPersonIdList(){return this.failureReappearPersonIdList;}

        private Integer failureReappearPersonIdSt;

        private Integer failureReappearPersonIdEd;

        public Integer getFailureReappearPersonIdSt(){return this.failureReappearPersonIdSt;}

        public Integer getFailureReappearPersonIdEd(){return this.failureReappearPersonIdEd;}

        private List<String> failureReappearPersonNameList;

        public List<String> getFailureReappearPersonNameList(){return this.failureReappearPersonNameList;}


        private List<String> fuzzyFailureReappearPersonName;

        public List<String> getFuzzyFailureReappearPersonName(){return this.fuzzyFailureReappearPersonName;}

        private List<String> rightFuzzyFailureReappearPersonName;

        public List<String> getRightFuzzyFailureReappearPersonName(){return this.rightFuzzyFailureReappearPersonName;}
        private List<String> failureReappearSymbolList;

        public List<String> getFailureReappearSymbolList(){return this.failureReappearSymbolList;}


        private List<String> fuzzyFailureReappearSymbol;

        public List<String> getFuzzyFailureReappearSymbol(){return this.fuzzyFailureReappearSymbol;}

        private List<String> rightFuzzyFailureReappearSymbol;

        public List<String> getRightFuzzyFailureReappearSymbol(){return this.rightFuzzyFailureReappearSymbol;}
        private List<String> reloadDateList;

        public List<String> getReloadDateList(){return this.reloadDateList;}


        private List<String> fuzzyReloadDate;

        public List<String> getFuzzyReloadDate(){return this.fuzzyReloadDate;}

        private List<String> rightFuzzyReloadDate;

        public List<String> getRightFuzzyReloadDate(){return this.rightFuzzyReloadDate;}
        private List<String> failureReappearDateList;

        public List<String> getFailureReappearDateList(){return this.failureReappearDateList;}


        private List<String> fuzzyFailureReappearDate;

        public List<String> getFuzzyFailureReappearDate(){return this.fuzzyFailureReappearDate;}

        private List<String> rightFuzzyFailureReappearDate;

        public List<String> getRightFuzzyFailureReappearDate(){return this.rightFuzzyFailureReappearDate;}
        private List<String> failureReappearSituationList;

        public List<String> getFailureReappearSituationList(){return this.failureReappearSituationList;}


        private List<String> fuzzyFailureReappearSituation;

        public List<String> getFuzzyFailureReappearSituation(){return this.fuzzyFailureReappearSituation;}

        private List<String> rightFuzzyFailureReappearSituation;

        public List<String> getRightFuzzyFailureReappearSituation(){return this.rightFuzzyFailureReappearSituation;}
        private List<String> failureReappearResultList;

        public List<String> getFailureReappearResultList(){return this.failureReappearResultList;}


        private List<String> fuzzyFailureReappearResult;

        public List<String> getFuzzyFailureReappearResult(){return this.fuzzyFailureReappearResult;}

        private List<String> rightFuzzyFailureReappearResult;

        public List<String> getRightFuzzyFailureReappearResult(){return this.rightFuzzyFailureReappearResult;}
        private List<String> analysisDepartmentsList;

        public List<String> getAnalysisDepartmentsList(){return this.analysisDepartmentsList;}


        private List<String> fuzzyAnalysisDepartments;

        public List<String> getFuzzyAnalysisDepartments(){return this.fuzzyAnalysisDepartments;}

        private List<String> rightFuzzyAnalysisDepartments;

        public List<String> getRightFuzzyAnalysisDepartments(){return this.rightFuzzyAnalysisDepartments;}
        private List<String> analysisDeadlineList;

        public List<String> getAnalysisDeadlineList(){return this.analysisDeadlineList;}


        private List<String> fuzzyAnalysisDeadline;

        public List<String> getFuzzyAnalysisDeadline(){return this.fuzzyAnalysisDeadline;}

        private List<String> rightFuzzyAnalysisDeadline;

        public List<String> getRightFuzzyAnalysisDeadline(){return this.rightFuzzyAnalysisDeadline;}
        private List<String> analysisRequirementList;

        public List<String> getAnalysisRequirementList(){return this.analysisRequirementList;}


        private List<String> fuzzyAnalysisRequirement;

        public List<String> getFuzzyAnalysisRequirement(){return this.fuzzyAnalysisRequirement;}

        private List<String> rightFuzzyAnalysisRequirement;

        public List<String> getRightFuzzyAnalysisRequirement(){return this.rightFuzzyAnalysisRequirement;}
        private List<String> importanceList;

        public List<String> getImportanceList(){return this.importanceList;}


        private List<String> fuzzyImportance;

        public List<String> getFuzzyImportance(){return this.fuzzyImportance;}

        private List<String> rightFuzzyImportance;

        public List<String> getRightFuzzyImportance(){return this.rightFuzzyImportance;}
        private List<String> appendixList;

        public List<String> getAppendixList(){return this.appendixList;}


        private List<String> fuzzyAppendix;

        public List<String> getFuzzyAppendix(){return this.fuzzyAppendix;}

        private List<String> rightFuzzyAppendix;

        public List<String> getRightFuzzyAppendix(){return this.rightFuzzyAppendix;}
        private List<String> processStateList;

        public List<String> getProcessStateList(){return this.processStateList;}


        private List<String> fuzzyProcessState;

        public List<String> getFuzzyProcessState(){return this.fuzzyProcessState;}

        private List<String> rightFuzzyProcessState;

        public List<String> getRightFuzzyProcessState(){return this.rightFuzzyProcessState;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder failureTrackIdBetWeen(Integer failureTrackIdSt,Integer failureTrackIdEd){
            this.failureTrackIdSt = failureTrackIdSt;
            this.failureTrackIdEd = failureTrackIdEd;
            return this;
        }

        public QueryBuilder failureTrackIdGreaterEqThan(Integer failureTrackIdSt){
            this.failureTrackIdSt = failureTrackIdSt;
            return this;
        }
        public QueryBuilder failureTrackIdLessEqThan(Integer failureTrackIdEd){
            this.failureTrackIdEd = failureTrackIdEd;
            return this;
        }


        public QueryBuilder failureTrackId(Integer failureTrackId){
            setFailureTrackId(failureTrackId);
            return this;
        }

        public QueryBuilder failureTrackIdList(Integer ... failureTrackId){
            this.failureTrackIdList = solveNullList(failureTrackId);
            return this;
        }

        public QueryBuilder failureTrackIdList(List<Integer> failureTrackId){
            this.failureTrackIdList = failureTrackId;
            return this;
        }

        public QueryBuilder fetchFailureTrackId(){
            setFetchFields("fetchFields","failureTrackId");
            return this;
        }

        public QueryBuilder excludeFailureTrackId(){
            setFetchFields("excludeFields","failureTrackId");
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

        public QueryBuilder saoIdBetWeen(Long saoIdSt,Long saoIdEd){
            this.saoIdSt = saoIdSt;
            this.saoIdEd = saoIdEd;
            return this;
        }

        public QueryBuilder saoIdGreaterEqThan(Long saoIdSt){
            this.saoIdSt = saoIdSt;
            return this;
        }
        public QueryBuilder saoIdLessEqThan(Long saoIdEd){
            this.saoIdEd = saoIdEd;
            return this;
        }


        public QueryBuilder saoId(Long saoId){
            setSaoId(saoId);
            return this;
        }

        public QueryBuilder saoIdList(Long ... saoId){
            this.saoIdList = solveNullList(saoId);
            return this;
        }

        public QueryBuilder saoIdList(List<Long> saoId){
            this.saoIdList = saoId;
            return this;
        }

        public QueryBuilder fetchSaoId(){
            setFetchFields("fetchFields","saoId");
            return this;
        }

        public QueryBuilder excludeSaoId(){
            setFetchFields("excludeFields","saoId");
            return this;
        }

        public QueryBuilder trackBeginerIdBetWeen(Integer trackBeginerIdSt,Integer trackBeginerIdEd){
            this.trackBeginerIdSt = trackBeginerIdSt;
            this.trackBeginerIdEd = trackBeginerIdEd;
            return this;
        }

        public QueryBuilder trackBeginerIdGreaterEqThan(Integer trackBeginerIdSt){
            this.trackBeginerIdSt = trackBeginerIdSt;
            return this;
        }
        public QueryBuilder trackBeginerIdLessEqThan(Integer trackBeginerIdEd){
            this.trackBeginerIdEd = trackBeginerIdEd;
            return this;
        }


        public QueryBuilder trackBeginerId(Integer trackBeginerId){
            setTrackBeginerId(trackBeginerId);
            return this;
        }

        public QueryBuilder trackBeginerIdList(Integer ... trackBeginerId){
            this.trackBeginerIdList = solveNullList(trackBeginerId);
            return this;
        }

        public QueryBuilder trackBeginerIdList(List<Integer> trackBeginerId){
            this.trackBeginerIdList = trackBeginerId;
            return this;
        }

        public QueryBuilder fetchTrackBeginerId(){
            setFetchFields("fetchFields","trackBeginerId");
            return this;
        }

        public QueryBuilder excludeTrackBeginerId(){
            setFetchFields("excludeFields","trackBeginerId");
            return this;
        }

        public QueryBuilder fuzzyTrackBeginerNo (List<String> fuzzyTrackBeginerNo){
            this.fuzzyTrackBeginerNo = fuzzyTrackBeginerNo;
            return this;
        }

        public QueryBuilder fuzzyTrackBeginerNo (String ... fuzzyTrackBeginerNo){
            this.fuzzyTrackBeginerNo = solveNullList(fuzzyTrackBeginerNo);
            return this;
        }

        public QueryBuilder rightFuzzyTrackBeginerNo (List<String> rightFuzzyTrackBeginerNo){
            this.rightFuzzyTrackBeginerNo = rightFuzzyTrackBeginerNo;
            return this;
        }

        public QueryBuilder rightFuzzyTrackBeginerNo (String ... rightFuzzyTrackBeginerNo){
            this.rightFuzzyTrackBeginerNo = solveNullList(rightFuzzyTrackBeginerNo);
            return this;
        }

        public QueryBuilder trackBeginerNo(String trackBeginerNo){
            setTrackBeginerNo(trackBeginerNo);
            return this;
        }

        public QueryBuilder trackBeginerNoList(String ... trackBeginerNo){
            this.trackBeginerNoList = solveNullList(trackBeginerNo);
            return this;
        }

        public QueryBuilder trackBeginerNoList(List<String> trackBeginerNo){
            this.trackBeginerNoList = trackBeginerNo;
            return this;
        }

        public QueryBuilder fetchTrackBeginerNo(){
            setFetchFields("fetchFields","trackBeginerNo");
            return this;
        }

        public QueryBuilder excludeTrackBeginerNo(){
            setFetchFields("excludeFields","trackBeginerNo");
            return this;
        }

        public QueryBuilder fuzzyTrackBeginerName (List<String> fuzzyTrackBeginerName){
            this.fuzzyTrackBeginerName = fuzzyTrackBeginerName;
            return this;
        }

        public QueryBuilder fuzzyTrackBeginerName (String ... fuzzyTrackBeginerName){
            this.fuzzyTrackBeginerName = solveNullList(fuzzyTrackBeginerName);
            return this;
        }

        public QueryBuilder rightFuzzyTrackBeginerName (List<String> rightFuzzyTrackBeginerName){
            this.rightFuzzyTrackBeginerName = rightFuzzyTrackBeginerName;
            return this;
        }

        public QueryBuilder rightFuzzyTrackBeginerName (String ... rightFuzzyTrackBeginerName){
            this.rightFuzzyTrackBeginerName = solveNullList(rightFuzzyTrackBeginerName);
            return this;
        }

        public QueryBuilder trackBeginerName(String trackBeginerName){
            setTrackBeginerName(trackBeginerName);
            return this;
        }

        public QueryBuilder trackBeginerNameList(String ... trackBeginerName){
            this.trackBeginerNameList = solveNullList(trackBeginerName);
            return this;
        }

        public QueryBuilder trackBeginerNameList(List<String> trackBeginerName){
            this.trackBeginerNameList = trackBeginerName;
            return this;
        }

        public QueryBuilder fetchTrackBeginerName(){
            setFetchFields("fetchFields","trackBeginerName");
            return this;
        }

        public QueryBuilder excludeTrackBeginerName(){
            setFetchFields("excludeFields","trackBeginerName");
            return this;
        }

        public QueryBuilder deliveryPersonIdBetWeen(Integer deliveryPersonIdSt,Integer deliveryPersonIdEd){
            this.deliveryPersonIdSt = deliveryPersonIdSt;
            this.deliveryPersonIdEd = deliveryPersonIdEd;
            return this;
        }

        public QueryBuilder deliveryPersonIdGreaterEqThan(Integer deliveryPersonIdSt){
            this.deliveryPersonIdSt = deliveryPersonIdSt;
            return this;
        }
        public QueryBuilder deliveryPersonIdLessEqThan(Integer deliveryPersonIdEd){
            this.deliveryPersonIdEd = deliveryPersonIdEd;
            return this;
        }


        public QueryBuilder deliveryPersonId(Integer deliveryPersonId){
            setDeliveryPersonId(deliveryPersonId);
            return this;
        }

        public QueryBuilder deliveryPersonIdList(Integer ... deliveryPersonId){
            this.deliveryPersonIdList = solveNullList(deliveryPersonId);
            return this;
        }

        public QueryBuilder deliveryPersonIdList(List<Integer> deliveryPersonId){
            this.deliveryPersonIdList = deliveryPersonId;
            return this;
        }

        public QueryBuilder fetchDeliveryPersonId(){
            setFetchFields("fetchFields","deliveryPersonId");
            return this;
        }

        public QueryBuilder excludeDeliveryPersonId(){
            setFetchFields("excludeFields","deliveryPersonId");
            return this;
        }

        public QueryBuilder fuzzyDeliveryPersonName (List<String> fuzzyDeliveryPersonName){
            this.fuzzyDeliveryPersonName = fuzzyDeliveryPersonName;
            return this;
        }

        public QueryBuilder fuzzyDeliveryPersonName (String ... fuzzyDeliveryPersonName){
            this.fuzzyDeliveryPersonName = solveNullList(fuzzyDeliveryPersonName);
            return this;
        }

        public QueryBuilder rightFuzzyDeliveryPersonName (List<String> rightFuzzyDeliveryPersonName){
            this.rightFuzzyDeliveryPersonName = rightFuzzyDeliveryPersonName;
            return this;
        }

        public QueryBuilder rightFuzzyDeliveryPersonName (String ... rightFuzzyDeliveryPersonName){
            this.rightFuzzyDeliveryPersonName = solveNullList(rightFuzzyDeliveryPersonName);
            return this;
        }

        public QueryBuilder deliveryPersonName(String deliveryPersonName){
            setDeliveryPersonName(deliveryPersonName);
            return this;
        }

        public QueryBuilder deliveryPersonNameList(String ... deliveryPersonName){
            this.deliveryPersonNameList = solveNullList(deliveryPersonName);
            return this;
        }

        public QueryBuilder deliveryPersonNameList(List<String> deliveryPersonName){
            this.deliveryPersonNameList = deliveryPersonName;
            return this;
        }

        public QueryBuilder fetchDeliveryPersonName(){
            setFetchFields("fetchFields","deliveryPersonName");
            return this;
        }

        public QueryBuilder excludeDeliveryPersonName(){
            setFetchFields("excludeFields","deliveryPersonName");
            return this;
        }

        public QueryBuilder fuzzyDeliveryState (List<String> fuzzyDeliveryState){
            this.fuzzyDeliveryState = fuzzyDeliveryState;
            return this;
        }

        public QueryBuilder fuzzyDeliveryState (String ... fuzzyDeliveryState){
            this.fuzzyDeliveryState = solveNullList(fuzzyDeliveryState);
            return this;
        }

        public QueryBuilder rightFuzzyDeliveryState (List<String> rightFuzzyDeliveryState){
            this.rightFuzzyDeliveryState = rightFuzzyDeliveryState;
            return this;
        }

        public QueryBuilder rightFuzzyDeliveryState (String ... rightFuzzyDeliveryState){
            this.rightFuzzyDeliveryState = solveNullList(rightFuzzyDeliveryState);
            return this;
        }

        public QueryBuilder deliveryState(String deliveryState){
            setDeliveryState(deliveryState);
            return this;
        }

        public QueryBuilder deliveryStateList(String ... deliveryState){
            this.deliveryStateList = solveNullList(deliveryState);
            return this;
        }

        public QueryBuilder deliveryStateList(List<String> deliveryState){
            this.deliveryStateList = deliveryState;
            return this;
        }

        public QueryBuilder fetchDeliveryState(){
            setFetchFields("fetchFields","deliveryState");
            return this;
        }

        public QueryBuilder excludeDeliveryState(){
            setFetchFields("excludeFields","deliveryState");
            return this;
        }

        public QueryBuilder fuzzyDeliveryDeadline (List<String> fuzzyDeliveryDeadline){
            this.fuzzyDeliveryDeadline = fuzzyDeliveryDeadline;
            return this;
        }

        public QueryBuilder fuzzyDeliveryDeadline (String ... fuzzyDeliveryDeadline){
            this.fuzzyDeliveryDeadline = solveNullList(fuzzyDeliveryDeadline);
            return this;
        }

        public QueryBuilder rightFuzzyDeliveryDeadline (List<String> rightFuzzyDeliveryDeadline){
            this.rightFuzzyDeliveryDeadline = rightFuzzyDeliveryDeadline;
            return this;
        }

        public QueryBuilder rightFuzzyDeliveryDeadline (String ... rightFuzzyDeliveryDeadline){
            this.rightFuzzyDeliveryDeadline = solveNullList(rightFuzzyDeliveryDeadline);
            return this;
        }

        public QueryBuilder deliveryDeadline(String deliveryDeadline){
            setDeliveryDeadline(deliveryDeadline);
            return this;
        }

        public QueryBuilder deliveryDeadlineList(String ... deliveryDeadline){
            this.deliveryDeadlineList = solveNullList(deliveryDeadline);
            return this;
        }

        public QueryBuilder deliveryDeadlineList(List<String> deliveryDeadline){
            this.deliveryDeadlineList = deliveryDeadline;
            return this;
        }

        public QueryBuilder fetchDeliveryDeadline(){
            setFetchFields("fetchFields","deliveryDeadline");
            return this;
        }

        public QueryBuilder excludeDeliveryDeadline(){
            setFetchFields("excludeFields","deliveryDeadline");
            return this;
        }

        public QueryBuilder fuzzyDeliveryReceivedDate (List<String> fuzzyDeliveryReceivedDate){
            this.fuzzyDeliveryReceivedDate = fuzzyDeliveryReceivedDate;
            return this;
        }

        public QueryBuilder fuzzyDeliveryReceivedDate (String ... fuzzyDeliveryReceivedDate){
            this.fuzzyDeliveryReceivedDate = solveNullList(fuzzyDeliveryReceivedDate);
            return this;
        }

        public QueryBuilder rightFuzzyDeliveryReceivedDate (List<String> rightFuzzyDeliveryReceivedDate){
            this.rightFuzzyDeliveryReceivedDate = rightFuzzyDeliveryReceivedDate;
            return this;
        }

        public QueryBuilder rightFuzzyDeliveryReceivedDate (String ... rightFuzzyDeliveryReceivedDate){
            this.rightFuzzyDeliveryReceivedDate = solveNullList(rightFuzzyDeliveryReceivedDate);
            return this;
        }

        public QueryBuilder deliveryReceivedDate(String deliveryReceivedDate){
            setDeliveryReceivedDate(deliveryReceivedDate);
            return this;
        }

        public QueryBuilder deliveryReceivedDateList(String ... deliveryReceivedDate){
            this.deliveryReceivedDateList = solveNullList(deliveryReceivedDate);
            return this;
        }

        public QueryBuilder deliveryReceivedDateList(List<String> deliveryReceivedDate){
            this.deliveryReceivedDateList = deliveryReceivedDate;
            return this;
        }

        public QueryBuilder fetchDeliveryReceivedDate(){
            setFetchFields("fetchFields","deliveryReceivedDate");
            return this;
        }

        public QueryBuilder excludeDeliveryReceivedDate(){
            setFetchFields("excludeFields","deliveryReceivedDate");
            return this;
        }

        public QueryBuilder fuzzyDeliveryCode (List<String> fuzzyDeliveryCode){
            this.fuzzyDeliveryCode = fuzzyDeliveryCode;
            return this;
        }

        public QueryBuilder fuzzyDeliveryCode (String ... fuzzyDeliveryCode){
            this.fuzzyDeliveryCode = solveNullList(fuzzyDeliveryCode);
            return this;
        }

        public QueryBuilder rightFuzzyDeliveryCode (List<String> rightFuzzyDeliveryCode){
            this.rightFuzzyDeliveryCode = rightFuzzyDeliveryCode;
            return this;
        }

        public QueryBuilder rightFuzzyDeliveryCode (String ... rightFuzzyDeliveryCode){
            this.rightFuzzyDeliveryCode = solveNullList(rightFuzzyDeliveryCode);
            return this;
        }

        public QueryBuilder deliveryCode(String deliveryCode){
            setDeliveryCode(deliveryCode);
            return this;
        }

        public QueryBuilder deliveryCodeList(String ... deliveryCode){
            this.deliveryCodeList = solveNullList(deliveryCode);
            return this;
        }

        public QueryBuilder deliveryCodeList(List<String> deliveryCode){
            this.deliveryCodeList = deliveryCode;
            return this;
        }

        public QueryBuilder fetchDeliveryCode(){
            setFetchFields("fetchFields","deliveryCode");
            return this;
        }

        public QueryBuilder excludeDeliveryCode(){
            setFetchFields("excludeFields","deliveryCode");
            return this;
        }

        public QueryBuilder fuzzyAppearance (List<String> fuzzyAppearance){
            this.fuzzyAppearance = fuzzyAppearance;
            return this;
        }

        public QueryBuilder fuzzyAppearance (String ... fuzzyAppearance){
            this.fuzzyAppearance = solveNullList(fuzzyAppearance);
            return this;
        }

        public QueryBuilder rightFuzzyAppearance (List<String> rightFuzzyAppearance){
            this.rightFuzzyAppearance = rightFuzzyAppearance;
            return this;
        }

        public QueryBuilder rightFuzzyAppearance (String ... rightFuzzyAppearance){
            this.rightFuzzyAppearance = solveNullList(rightFuzzyAppearance);
            return this;
        }

        public QueryBuilder appearance(String appearance){
            setAppearance(appearance);
            return this;
        }

        public QueryBuilder appearanceList(String ... appearance){
            this.appearanceList = solveNullList(appearance);
            return this;
        }

        public QueryBuilder appearanceList(List<String> appearance){
            this.appearanceList = appearance;
            return this;
        }

        public QueryBuilder fetchAppearance(){
            setFetchFields("fetchFields","appearance");
            return this;
        }

        public QueryBuilder excludeAppearance(){
            setFetchFields("excludeFields","appearance");
            return this;
        }

        public QueryBuilder fuzzyCarTestSymbol (List<String> fuzzyCarTestSymbol){
            this.fuzzyCarTestSymbol = fuzzyCarTestSymbol;
            return this;
        }

        public QueryBuilder fuzzyCarTestSymbol (String ... fuzzyCarTestSymbol){
            this.fuzzyCarTestSymbol = solveNullList(fuzzyCarTestSymbol);
            return this;
        }

        public QueryBuilder rightFuzzyCarTestSymbol (List<String> rightFuzzyCarTestSymbol){
            this.rightFuzzyCarTestSymbol = rightFuzzyCarTestSymbol;
            return this;
        }

        public QueryBuilder rightFuzzyCarTestSymbol (String ... rightFuzzyCarTestSymbol){
            this.rightFuzzyCarTestSymbol = solveNullList(rightFuzzyCarTestSymbol);
            return this;
        }

        public QueryBuilder carTestSymbol(String carTestSymbol){
            setCarTestSymbol(carTestSymbol);
            return this;
        }

        public QueryBuilder carTestSymbolList(String ... carTestSymbol){
            this.carTestSymbolList = solveNullList(carTestSymbol);
            return this;
        }

        public QueryBuilder carTestSymbolList(List<String> carTestSymbol){
            this.carTestSymbolList = carTestSymbol;
            return this;
        }

        public QueryBuilder fetchCarTestSymbol(){
            setFetchFields("fetchFields","carTestSymbol");
            return this;
        }

        public QueryBuilder excludeCarTestSymbol(){
            setFetchFields("excludeFields","carTestSymbol");
            return this;
        }

        public QueryBuilder failureReappearPersonIdBetWeen(Integer failureReappearPersonIdSt,Integer failureReappearPersonIdEd){
            this.failureReappearPersonIdSt = failureReappearPersonIdSt;
            this.failureReappearPersonIdEd = failureReappearPersonIdEd;
            return this;
        }

        public QueryBuilder failureReappearPersonIdGreaterEqThan(Integer failureReappearPersonIdSt){
            this.failureReappearPersonIdSt = failureReappearPersonIdSt;
            return this;
        }
        public QueryBuilder failureReappearPersonIdLessEqThan(Integer failureReappearPersonIdEd){
            this.failureReappearPersonIdEd = failureReappearPersonIdEd;
            return this;
        }


        public QueryBuilder failureReappearPersonId(Integer failureReappearPersonId){
            setFailureReappearPersonId(failureReappearPersonId);
            return this;
        }

        public QueryBuilder failureReappearPersonIdList(Integer ... failureReappearPersonId){
            this.failureReappearPersonIdList = solveNullList(failureReappearPersonId);
            return this;
        }

        public QueryBuilder failureReappearPersonIdList(List<Integer> failureReappearPersonId){
            this.failureReappearPersonIdList = failureReappearPersonId;
            return this;
        }

        public QueryBuilder fetchFailureReappearPersonId(){
            setFetchFields("fetchFields","failureReappearPersonId");
            return this;
        }

        public QueryBuilder excludeFailureReappearPersonId(){
            setFetchFields("excludeFields","failureReappearPersonId");
            return this;
        }

        public QueryBuilder fuzzyFailureReappearPersonName (List<String> fuzzyFailureReappearPersonName){
            this.fuzzyFailureReappearPersonName = fuzzyFailureReappearPersonName;
            return this;
        }

        public QueryBuilder fuzzyFailureReappearPersonName (String ... fuzzyFailureReappearPersonName){
            this.fuzzyFailureReappearPersonName = solveNullList(fuzzyFailureReappearPersonName);
            return this;
        }

        public QueryBuilder rightFuzzyFailureReappearPersonName (List<String> rightFuzzyFailureReappearPersonName){
            this.rightFuzzyFailureReappearPersonName = rightFuzzyFailureReappearPersonName;
            return this;
        }

        public QueryBuilder rightFuzzyFailureReappearPersonName (String ... rightFuzzyFailureReappearPersonName){
            this.rightFuzzyFailureReappearPersonName = solveNullList(rightFuzzyFailureReappearPersonName);
            return this;
        }

        public QueryBuilder failureReappearPersonName(String failureReappearPersonName){
            setFailureReappearPersonName(failureReappearPersonName);
            return this;
        }

        public QueryBuilder failureReappearPersonNameList(String ... failureReappearPersonName){
            this.failureReappearPersonNameList = solveNullList(failureReappearPersonName);
            return this;
        }

        public QueryBuilder failureReappearPersonNameList(List<String> failureReappearPersonName){
            this.failureReappearPersonNameList = failureReappearPersonName;
            return this;
        }

        public QueryBuilder fetchFailureReappearPersonName(){
            setFetchFields("fetchFields","failureReappearPersonName");
            return this;
        }

        public QueryBuilder excludeFailureReappearPersonName(){
            setFetchFields("excludeFields","failureReappearPersonName");
            return this;
        }

        public QueryBuilder fuzzyFailureReappearSymbol (List<String> fuzzyFailureReappearSymbol){
            this.fuzzyFailureReappearSymbol = fuzzyFailureReappearSymbol;
            return this;
        }

        public QueryBuilder fuzzyFailureReappearSymbol (String ... fuzzyFailureReappearSymbol){
            this.fuzzyFailureReappearSymbol = solveNullList(fuzzyFailureReappearSymbol);
            return this;
        }

        public QueryBuilder rightFuzzyFailureReappearSymbol (List<String> rightFuzzyFailureReappearSymbol){
            this.rightFuzzyFailureReappearSymbol = rightFuzzyFailureReappearSymbol;
            return this;
        }

        public QueryBuilder rightFuzzyFailureReappearSymbol (String ... rightFuzzyFailureReappearSymbol){
            this.rightFuzzyFailureReappearSymbol = solveNullList(rightFuzzyFailureReappearSymbol);
            return this;
        }

        public QueryBuilder failureReappearSymbol(String failureReappearSymbol){
            setFailureReappearSymbol(failureReappearSymbol);
            return this;
        }

        public QueryBuilder failureReappearSymbolList(String ... failureReappearSymbol){
            this.failureReappearSymbolList = solveNullList(failureReappearSymbol);
            return this;
        }

        public QueryBuilder failureReappearSymbolList(List<String> failureReappearSymbol){
            this.failureReappearSymbolList = failureReappearSymbol;
            return this;
        }

        public QueryBuilder fetchFailureReappearSymbol(){
            setFetchFields("fetchFields","failureReappearSymbol");
            return this;
        }

        public QueryBuilder excludeFailureReappearSymbol(){
            setFetchFields("excludeFields","failureReappearSymbol");
            return this;
        }

        public QueryBuilder fuzzyReloadDate (List<String> fuzzyReloadDate){
            this.fuzzyReloadDate = fuzzyReloadDate;
            return this;
        }

        public QueryBuilder fuzzyReloadDate (String ... fuzzyReloadDate){
            this.fuzzyReloadDate = solveNullList(fuzzyReloadDate);
            return this;
        }

        public QueryBuilder rightFuzzyReloadDate (List<String> rightFuzzyReloadDate){
            this.rightFuzzyReloadDate = rightFuzzyReloadDate;
            return this;
        }

        public QueryBuilder rightFuzzyReloadDate (String ... rightFuzzyReloadDate){
            this.rightFuzzyReloadDate = solveNullList(rightFuzzyReloadDate);
            return this;
        }

        public QueryBuilder reloadDate(String reloadDate){
            setReloadDate(reloadDate);
            return this;
        }

        public QueryBuilder reloadDateList(String ... reloadDate){
            this.reloadDateList = solveNullList(reloadDate);
            return this;
        }

        public QueryBuilder reloadDateList(List<String> reloadDate){
            this.reloadDateList = reloadDate;
            return this;
        }

        public QueryBuilder fetchReloadDate(){
            setFetchFields("fetchFields","reloadDate");
            return this;
        }

        public QueryBuilder excludeReloadDate(){
            setFetchFields("excludeFields","reloadDate");
            return this;
        }

        public QueryBuilder fuzzyFailureReappearDate (List<String> fuzzyFailureReappearDate){
            this.fuzzyFailureReappearDate = fuzzyFailureReappearDate;
            return this;
        }

        public QueryBuilder fuzzyFailureReappearDate (String ... fuzzyFailureReappearDate){
            this.fuzzyFailureReappearDate = solveNullList(fuzzyFailureReappearDate);
            return this;
        }

        public QueryBuilder rightFuzzyFailureReappearDate (List<String> rightFuzzyFailureReappearDate){
            this.rightFuzzyFailureReappearDate = rightFuzzyFailureReappearDate;
            return this;
        }

        public QueryBuilder rightFuzzyFailureReappearDate (String ... rightFuzzyFailureReappearDate){
            this.rightFuzzyFailureReappearDate = solveNullList(rightFuzzyFailureReappearDate);
            return this;
        }

        public QueryBuilder failureReappearDate(String failureReappearDate){
            setFailureReappearDate(failureReappearDate);
            return this;
        }

        public QueryBuilder failureReappearDateList(String ... failureReappearDate){
            this.failureReappearDateList = solveNullList(failureReappearDate);
            return this;
        }

        public QueryBuilder failureReappearDateList(List<String> failureReappearDate){
            this.failureReappearDateList = failureReappearDate;
            return this;
        }

        public QueryBuilder fetchFailureReappearDate(){
            setFetchFields("fetchFields","failureReappearDate");
            return this;
        }

        public QueryBuilder excludeFailureReappearDate(){
            setFetchFields("excludeFields","failureReappearDate");
            return this;
        }

        public QueryBuilder fuzzyFailureReappearSituation (List<String> fuzzyFailureReappearSituation){
            this.fuzzyFailureReappearSituation = fuzzyFailureReappearSituation;
            return this;
        }

        public QueryBuilder fuzzyFailureReappearSituation (String ... fuzzyFailureReappearSituation){
            this.fuzzyFailureReappearSituation = solveNullList(fuzzyFailureReappearSituation);
            return this;
        }

        public QueryBuilder rightFuzzyFailureReappearSituation (List<String> rightFuzzyFailureReappearSituation){
            this.rightFuzzyFailureReappearSituation = rightFuzzyFailureReappearSituation;
            return this;
        }

        public QueryBuilder rightFuzzyFailureReappearSituation (String ... rightFuzzyFailureReappearSituation){
            this.rightFuzzyFailureReappearSituation = solveNullList(rightFuzzyFailureReappearSituation);
            return this;
        }

        public QueryBuilder failureReappearSituation(String failureReappearSituation){
            setFailureReappearSituation(failureReappearSituation);
            return this;
        }

        public QueryBuilder failureReappearSituationList(String ... failureReappearSituation){
            this.failureReappearSituationList = solveNullList(failureReappearSituation);
            return this;
        }

        public QueryBuilder failureReappearSituationList(List<String> failureReappearSituation){
            this.failureReappearSituationList = failureReappearSituation;
            return this;
        }

        public QueryBuilder fetchFailureReappearSituation(){
            setFetchFields("fetchFields","failureReappearSituation");
            return this;
        }

        public QueryBuilder excludeFailureReappearSituation(){
            setFetchFields("excludeFields","failureReappearSituation");
            return this;
        }

        public QueryBuilder fuzzyFailureReappearResult (List<String> fuzzyFailureReappearResult){
            this.fuzzyFailureReappearResult = fuzzyFailureReappearResult;
            return this;
        }

        public QueryBuilder fuzzyFailureReappearResult (String ... fuzzyFailureReappearResult){
            this.fuzzyFailureReappearResult = solveNullList(fuzzyFailureReappearResult);
            return this;
        }

        public QueryBuilder rightFuzzyFailureReappearResult (List<String> rightFuzzyFailureReappearResult){
            this.rightFuzzyFailureReappearResult = rightFuzzyFailureReappearResult;
            return this;
        }

        public QueryBuilder rightFuzzyFailureReappearResult (String ... rightFuzzyFailureReappearResult){
            this.rightFuzzyFailureReappearResult = solveNullList(rightFuzzyFailureReappearResult);
            return this;
        }

        public QueryBuilder failureReappearResult(String failureReappearResult){
            setFailureReappearResult(failureReappearResult);
            return this;
        }

        public QueryBuilder failureReappearResultList(String ... failureReappearResult){
            this.failureReappearResultList = solveNullList(failureReappearResult);
            return this;
        }

        public QueryBuilder failureReappearResultList(List<String> failureReappearResult){
            this.failureReappearResultList = failureReappearResult;
            return this;
        }

        public QueryBuilder fetchFailureReappearResult(){
            setFetchFields("fetchFields","failureReappearResult");
            return this;
        }

        public QueryBuilder excludeFailureReappearResult(){
            setFetchFields("excludeFields","failureReappearResult");
            return this;
        }

        public QueryBuilder fuzzyAnalysisDepartments (List<String> fuzzyAnalysisDepartments){
            this.fuzzyAnalysisDepartments = fuzzyAnalysisDepartments;
            return this;
        }

        public QueryBuilder fuzzyAnalysisDepartments (String ... fuzzyAnalysisDepartments){
            this.fuzzyAnalysisDepartments = solveNullList(fuzzyAnalysisDepartments);
            return this;
        }

        public QueryBuilder rightFuzzyAnalysisDepartments (List<String> rightFuzzyAnalysisDepartments){
            this.rightFuzzyAnalysisDepartments = rightFuzzyAnalysisDepartments;
            return this;
        }

        public QueryBuilder rightFuzzyAnalysisDepartments (String ... rightFuzzyAnalysisDepartments){
            this.rightFuzzyAnalysisDepartments = solveNullList(rightFuzzyAnalysisDepartments);
            return this;
        }

        public QueryBuilder analysisDepartments(String analysisDepartments){
            setAnalysisDepartments(analysisDepartments);
            return this;
        }

        public QueryBuilder analysisDepartmentsList(String ... analysisDepartments){
            this.analysisDepartmentsList = solveNullList(analysisDepartments);
            return this;
        }

        public QueryBuilder analysisDepartmentsList(List<String> analysisDepartments){
            this.analysisDepartmentsList = analysisDepartments;
            return this;
        }

        public QueryBuilder fetchAnalysisDepartments(){
            setFetchFields("fetchFields","analysisDepartments");
            return this;
        }

        public QueryBuilder excludeAnalysisDepartments(){
            setFetchFields("excludeFields","analysisDepartments");
            return this;
        }

        public QueryBuilder fuzzyAnalysisDeadline (List<String> fuzzyAnalysisDeadline){
            this.fuzzyAnalysisDeadline = fuzzyAnalysisDeadline;
            return this;
        }

        public QueryBuilder fuzzyAnalysisDeadline (String ... fuzzyAnalysisDeadline){
            this.fuzzyAnalysisDeadline = solveNullList(fuzzyAnalysisDeadline);
            return this;
        }

        public QueryBuilder rightFuzzyAnalysisDeadline (List<String> rightFuzzyAnalysisDeadline){
            this.rightFuzzyAnalysisDeadline = rightFuzzyAnalysisDeadline;
            return this;
        }

        public QueryBuilder rightFuzzyAnalysisDeadline (String ... rightFuzzyAnalysisDeadline){
            this.rightFuzzyAnalysisDeadline = solveNullList(rightFuzzyAnalysisDeadline);
            return this;
        }

        public QueryBuilder analysisDeadline(String analysisDeadline){
            setAnalysisDeadline(analysisDeadline);
            return this;
        }

        public QueryBuilder analysisDeadlineList(String ... analysisDeadline){
            this.analysisDeadlineList = solveNullList(analysisDeadline);
            return this;
        }

        public QueryBuilder analysisDeadlineList(List<String> analysisDeadline){
            this.analysisDeadlineList = analysisDeadline;
            return this;
        }

        public QueryBuilder fetchAnalysisDeadline(){
            setFetchFields("fetchFields","analysisDeadline");
            return this;
        }

        public QueryBuilder excludeAnalysisDeadline(){
            setFetchFields("excludeFields","analysisDeadline");
            return this;
        }

        public QueryBuilder fuzzyAnalysisRequirement (List<String> fuzzyAnalysisRequirement){
            this.fuzzyAnalysisRequirement = fuzzyAnalysisRequirement;
            return this;
        }

        public QueryBuilder fuzzyAnalysisRequirement (String ... fuzzyAnalysisRequirement){
            this.fuzzyAnalysisRequirement = solveNullList(fuzzyAnalysisRequirement);
            return this;
        }

        public QueryBuilder rightFuzzyAnalysisRequirement (List<String> rightFuzzyAnalysisRequirement){
            this.rightFuzzyAnalysisRequirement = rightFuzzyAnalysisRequirement;
            return this;
        }

        public QueryBuilder rightFuzzyAnalysisRequirement (String ... rightFuzzyAnalysisRequirement){
            this.rightFuzzyAnalysisRequirement = solveNullList(rightFuzzyAnalysisRequirement);
            return this;
        }

        public QueryBuilder analysisRequirement(String analysisRequirement){
            setAnalysisRequirement(analysisRequirement);
            return this;
        }

        public QueryBuilder analysisRequirementList(String ... analysisRequirement){
            this.analysisRequirementList = solveNullList(analysisRequirement);
            return this;
        }

        public QueryBuilder analysisRequirementList(List<String> analysisRequirement){
            this.analysisRequirementList = analysisRequirement;
            return this;
        }

        public QueryBuilder fetchAnalysisRequirement(){
            setFetchFields("fetchFields","analysisRequirement");
            return this;
        }

        public QueryBuilder excludeAnalysisRequirement(){
            setFetchFields("excludeFields","analysisRequirement");
            return this;
        }

        public QueryBuilder fuzzyImportance (List<String> fuzzyImportance){
            this.fuzzyImportance = fuzzyImportance;
            return this;
        }

        public QueryBuilder fuzzyImportance (String ... fuzzyImportance){
            this.fuzzyImportance = solveNullList(fuzzyImportance);
            return this;
        }

        public QueryBuilder rightFuzzyImportance (List<String> rightFuzzyImportance){
            this.rightFuzzyImportance = rightFuzzyImportance;
            return this;
        }

        public QueryBuilder rightFuzzyImportance (String ... rightFuzzyImportance){
            this.rightFuzzyImportance = solveNullList(rightFuzzyImportance);
            return this;
        }

        public QueryBuilder importance(String importance){
            setImportance(importance);
            return this;
        }

        public QueryBuilder importanceList(String ... importance){
            this.importanceList = solveNullList(importance);
            return this;
        }

        public QueryBuilder importanceList(List<String> importance){
            this.importanceList = importance;
            return this;
        }

        public QueryBuilder fetchImportance(){
            setFetchFields("fetchFields","importance");
            return this;
        }

        public QueryBuilder excludeImportance(){
            setFetchFields("excludeFields","importance");
            return this;
        }

        public QueryBuilder fuzzyAppendix (List<String> fuzzyAppendix){
            this.fuzzyAppendix = fuzzyAppendix;
            return this;
        }

        public QueryBuilder fuzzyAppendix (String ... fuzzyAppendix){
            this.fuzzyAppendix = solveNullList(fuzzyAppendix);
            return this;
        }

        public QueryBuilder rightFuzzyAppendix (List<String> rightFuzzyAppendix){
            this.rightFuzzyAppendix = rightFuzzyAppendix;
            return this;
        }

        public QueryBuilder rightFuzzyAppendix (String ... rightFuzzyAppendix){
            this.rightFuzzyAppendix = solveNullList(rightFuzzyAppendix);
            return this;
        }

        public QueryBuilder appendix(String appendix){
            setAppendix(appendix);
            return this;
        }

        public QueryBuilder appendixList(String ... appendix){
            this.appendixList = solveNullList(appendix);
            return this;
        }

        public QueryBuilder appendixList(List<String> appendix){
            this.appendixList = appendix;
            return this;
        }

        public QueryBuilder fetchAppendix(){
            setFetchFields("fetchFields","appendix");
            return this;
        }

        public QueryBuilder excludeAppendix(){
            setFetchFields("excludeFields","appendix");
            return this;
        }

        public QueryBuilder fuzzyProcessState (List<String> fuzzyProcessState){
            this.fuzzyProcessState = fuzzyProcessState;
            return this;
        }

        public QueryBuilder fuzzyProcessState (String ... fuzzyProcessState){
            this.fuzzyProcessState = solveNullList(fuzzyProcessState);
            return this;
        }

        public QueryBuilder rightFuzzyProcessState (List<String> rightFuzzyProcessState){
            this.rightFuzzyProcessState = rightFuzzyProcessState;
            return this;
        }

        public QueryBuilder rightFuzzyProcessState (String ... rightFuzzyProcessState){
            this.rightFuzzyProcessState = solveNullList(rightFuzzyProcessState);
            return this;
        }

        public QueryBuilder processState(String processState){
            setProcessState(processState);
            return this;
        }

        public QueryBuilder processStateList(String ... processState){
            this.processStateList = solveNullList(processState);
            return this;
        }

        public QueryBuilder processStateList(List<String> processState){
            this.processStateList = processState;
            return this;
        }

        public QueryBuilder fetchProcessState(){
            setFetchFields("fetchFields","processState");
            return this;
        }

        public QueryBuilder excludeProcessState(){
            setFetchFields("excludeFields","processState");
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

        public MqmsFailureTrack build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> failureTrackIdList;

        public List<Integer> getFailureTrackIdList(){return this.failureTrackIdList;}

        private Integer failureTrackIdSt;

        private Integer failureTrackIdEd;

        public Integer getFailureTrackIdSt(){return this.failureTrackIdSt;}

        public Integer getFailureTrackIdEd(){return this.failureTrackIdEd;}

        private List<String> voucherCodeList;

        public List<String> getVoucherCodeList(){return this.voucherCodeList;}


        private List<String> fuzzyVoucherCode;

        public List<String> getFuzzyVoucherCode(){return this.fuzzyVoucherCode;}

        private List<String> rightFuzzyVoucherCode;

        public List<String> getRightFuzzyVoucherCode(){return this.rightFuzzyVoucherCode;}
        private List<String> engOrTranList;

        public List<String> getEngOrTranList(){return this.engOrTranList;}


        private List<String> fuzzyEngOrTran;

        public List<String> getFuzzyEngOrTran(){return this.fuzzyEngOrTran;}

        private List<String> rightFuzzyEngOrTran;

        public List<String> getRightFuzzyEngOrTran(){return this.rightFuzzyEngOrTran;}
        private List<Long> saoIdList;

        public List<Long> getSaoIdList(){return this.saoIdList;}

        private Long saoIdSt;

        private Long saoIdEd;

        public Long getSaoIdSt(){return this.saoIdSt;}

        public Long getSaoIdEd(){return this.saoIdEd;}

        private List<Integer> trackBeginerIdList;

        public List<Integer> getTrackBeginerIdList(){return this.trackBeginerIdList;}

        private Integer trackBeginerIdSt;

        private Integer trackBeginerIdEd;

        public Integer getTrackBeginerIdSt(){return this.trackBeginerIdSt;}

        public Integer getTrackBeginerIdEd(){return this.trackBeginerIdEd;}

        private List<String> trackBeginerNoList;

        public List<String> getTrackBeginerNoList(){return this.trackBeginerNoList;}


        private List<String> fuzzyTrackBeginerNo;

        public List<String> getFuzzyTrackBeginerNo(){return this.fuzzyTrackBeginerNo;}

        private List<String> rightFuzzyTrackBeginerNo;

        public List<String> getRightFuzzyTrackBeginerNo(){return this.rightFuzzyTrackBeginerNo;}
        private List<String> trackBeginerNameList;

        public List<String> getTrackBeginerNameList(){return this.trackBeginerNameList;}


        private List<String> fuzzyTrackBeginerName;

        public List<String> getFuzzyTrackBeginerName(){return this.fuzzyTrackBeginerName;}

        private List<String> rightFuzzyTrackBeginerName;

        public List<String> getRightFuzzyTrackBeginerName(){return this.rightFuzzyTrackBeginerName;}
        private List<Integer> deliveryPersonIdList;

        public List<Integer> getDeliveryPersonIdList(){return this.deliveryPersonIdList;}

        private Integer deliveryPersonIdSt;

        private Integer deliveryPersonIdEd;

        public Integer getDeliveryPersonIdSt(){return this.deliveryPersonIdSt;}

        public Integer getDeliveryPersonIdEd(){return this.deliveryPersonIdEd;}

        private List<String> deliveryPersonNameList;

        public List<String> getDeliveryPersonNameList(){return this.deliveryPersonNameList;}


        private List<String> fuzzyDeliveryPersonName;

        public List<String> getFuzzyDeliveryPersonName(){return this.fuzzyDeliveryPersonName;}

        private List<String> rightFuzzyDeliveryPersonName;

        public List<String> getRightFuzzyDeliveryPersonName(){return this.rightFuzzyDeliveryPersonName;}
        private List<String> deliveryStateList;

        public List<String> getDeliveryStateList(){return this.deliveryStateList;}


        private List<String> fuzzyDeliveryState;

        public List<String> getFuzzyDeliveryState(){return this.fuzzyDeliveryState;}

        private List<String> rightFuzzyDeliveryState;

        public List<String> getRightFuzzyDeliveryState(){return this.rightFuzzyDeliveryState;}
        private List<String> deliveryDeadlineList;

        public List<String> getDeliveryDeadlineList(){return this.deliveryDeadlineList;}


        private List<String> fuzzyDeliveryDeadline;

        public List<String> getFuzzyDeliveryDeadline(){return this.fuzzyDeliveryDeadline;}

        private List<String> rightFuzzyDeliveryDeadline;

        public List<String> getRightFuzzyDeliveryDeadline(){return this.rightFuzzyDeliveryDeadline;}
        private List<String> deliveryReceivedDateList;

        public List<String> getDeliveryReceivedDateList(){return this.deliveryReceivedDateList;}


        private List<String> fuzzyDeliveryReceivedDate;

        public List<String> getFuzzyDeliveryReceivedDate(){return this.fuzzyDeliveryReceivedDate;}

        private List<String> rightFuzzyDeliveryReceivedDate;

        public List<String> getRightFuzzyDeliveryReceivedDate(){return this.rightFuzzyDeliveryReceivedDate;}
        private List<String> deliveryCodeList;

        public List<String> getDeliveryCodeList(){return this.deliveryCodeList;}


        private List<String> fuzzyDeliveryCode;

        public List<String> getFuzzyDeliveryCode(){return this.fuzzyDeliveryCode;}

        private List<String> rightFuzzyDeliveryCode;

        public List<String> getRightFuzzyDeliveryCode(){return this.rightFuzzyDeliveryCode;}
        private List<String> appearanceList;

        public List<String> getAppearanceList(){return this.appearanceList;}


        private List<String> fuzzyAppearance;

        public List<String> getFuzzyAppearance(){return this.fuzzyAppearance;}

        private List<String> rightFuzzyAppearance;

        public List<String> getRightFuzzyAppearance(){return this.rightFuzzyAppearance;}
        private List<String> carTestSymbolList;

        public List<String> getCarTestSymbolList(){return this.carTestSymbolList;}


        private List<String> fuzzyCarTestSymbol;

        public List<String> getFuzzyCarTestSymbol(){return this.fuzzyCarTestSymbol;}

        private List<String> rightFuzzyCarTestSymbol;

        public List<String> getRightFuzzyCarTestSymbol(){return this.rightFuzzyCarTestSymbol;}
        private List<Integer> failureReappearPersonIdList;

        public List<Integer> getFailureReappearPersonIdList(){return this.failureReappearPersonIdList;}

        private Integer failureReappearPersonIdSt;

        private Integer failureReappearPersonIdEd;

        public Integer getFailureReappearPersonIdSt(){return this.failureReappearPersonIdSt;}

        public Integer getFailureReappearPersonIdEd(){return this.failureReappearPersonIdEd;}

        private List<String> failureReappearPersonNameList;

        public List<String> getFailureReappearPersonNameList(){return this.failureReappearPersonNameList;}


        private List<String> fuzzyFailureReappearPersonName;

        public List<String> getFuzzyFailureReappearPersonName(){return this.fuzzyFailureReappearPersonName;}

        private List<String> rightFuzzyFailureReappearPersonName;

        public List<String> getRightFuzzyFailureReappearPersonName(){return this.rightFuzzyFailureReappearPersonName;}
        private List<String> failureReappearSymbolList;

        public List<String> getFailureReappearSymbolList(){return this.failureReappearSymbolList;}


        private List<String> fuzzyFailureReappearSymbol;

        public List<String> getFuzzyFailureReappearSymbol(){return this.fuzzyFailureReappearSymbol;}

        private List<String> rightFuzzyFailureReappearSymbol;

        public List<String> getRightFuzzyFailureReappearSymbol(){return this.rightFuzzyFailureReappearSymbol;}
        private List<String> reloadDateList;

        public List<String> getReloadDateList(){return this.reloadDateList;}


        private List<String> fuzzyReloadDate;

        public List<String> getFuzzyReloadDate(){return this.fuzzyReloadDate;}

        private List<String> rightFuzzyReloadDate;

        public List<String> getRightFuzzyReloadDate(){return this.rightFuzzyReloadDate;}
        private List<String> failureReappearDateList;

        public List<String> getFailureReappearDateList(){return this.failureReappearDateList;}


        private List<String> fuzzyFailureReappearDate;

        public List<String> getFuzzyFailureReappearDate(){return this.fuzzyFailureReappearDate;}

        private List<String> rightFuzzyFailureReappearDate;

        public List<String> getRightFuzzyFailureReappearDate(){return this.rightFuzzyFailureReappearDate;}
        private List<String> failureReappearSituationList;

        public List<String> getFailureReappearSituationList(){return this.failureReappearSituationList;}


        private List<String> fuzzyFailureReappearSituation;

        public List<String> getFuzzyFailureReappearSituation(){return this.fuzzyFailureReappearSituation;}

        private List<String> rightFuzzyFailureReappearSituation;

        public List<String> getRightFuzzyFailureReappearSituation(){return this.rightFuzzyFailureReappearSituation;}
        private List<String> failureReappearResultList;

        public List<String> getFailureReappearResultList(){return this.failureReappearResultList;}


        private List<String> fuzzyFailureReappearResult;

        public List<String> getFuzzyFailureReappearResult(){return this.fuzzyFailureReappearResult;}

        private List<String> rightFuzzyFailureReappearResult;

        public List<String> getRightFuzzyFailureReappearResult(){return this.rightFuzzyFailureReappearResult;}
        private List<String> analysisDepartmentsList;

        public List<String> getAnalysisDepartmentsList(){return this.analysisDepartmentsList;}


        private List<String> fuzzyAnalysisDepartments;

        public List<String> getFuzzyAnalysisDepartments(){return this.fuzzyAnalysisDepartments;}

        private List<String> rightFuzzyAnalysisDepartments;

        public List<String> getRightFuzzyAnalysisDepartments(){return this.rightFuzzyAnalysisDepartments;}
        private List<String> analysisDeadlineList;

        public List<String> getAnalysisDeadlineList(){return this.analysisDeadlineList;}


        private List<String> fuzzyAnalysisDeadline;

        public List<String> getFuzzyAnalysisDeadline(){return this.fuzzyAnalysisDeadline;}

        private List<String> rightFuzzyAnalysisDeadline;

        public List<String> getRightFuzzyAnalysisDeadline(){return this.rightFuzzyAnalysisDeadline;}
        private List<String> analysisRequirementList;

        public List<String> getAnalysisRequirementList(){return this.analysisRequirementList;}


        private List<String> fuzzyAnalysisRequirement;

        public List<String> getFuzzyAnalysisRequirement(){return this.fuzzyAnalysisRequirement;}

        private List<String> rightFuzzyAnalysisRequirement;

        public List<String> getRightFuzzyAnalysisRequirement(){return this.rightFuzzyAnalysisRequirement;}
        private List<String> importanceList;

        public List<String> getImportanceList(){return this.importanceList;}


        private List<String> fuzzyImportance;

        public List<String> getFuzzyImportance(){return this.fuzzyImportance;}

        private List<String> rightFuzzyImportance;

        public List<String> getRightFuzzyImportance(){return this.rightFuzzyImportance;}
        private List<String> appendixList;

        public List<String> getAppendixList(){return this.appendixList;}


        private List<String> fuzzyAppendix;

        public List<String> getFuzzyAppendix(){return this.fuzzyAppendix;}

        private List<String> rightFuzzyAppendix;

        public List<String> getRightFuzzyAppendix(){return this.rightFuzzyAppendix;}
        private List<String> processStateList;

        public List<String> getProcessStateList(){return this.processStateList;}


        private List<String> fuzzyProcessState;

        public List<String> getFuzzyProcessState(){return this.fuzzyProcessState;}

        private List<String> rightFuzzyProcessState;

        public List<String> getRightFuzzyProcessState(){return this.rightFuzzyProcessState;}

        public ConditionBuilder failureTrackIdBetWeen(Integer failureTrackIdSt,Integer failureTrackIdEd){
            this.failureTrackIdSt = failureTrackIdSt;
            this.failureTrackIdEd = failureTrackIdEd;
            return this;
        }

        public ConditionBuilder failureTrackIdGreaterEqThan(Integer failureTrackIdSt){
            this.failureTrackIdSt = failureTrackIdSt;
            return this;
        }
        public ConditionBuilder failureTrackIdLessEqThan(Integer failureTrackIdEd){
            this.failureTrackIdEd = failureTrackIdEd;
            return this;
        }


        public ConditionBuilder failureTrackIdList(Integer ... failureTrackId){
            this.failureTrackIdList = solveNullList(failureTrackId);
            return this;
        }

        public ConditionBuilder failureTrackIdList(List<Integer> failureTrackId){
            this.failureTrackIdList = failureTrackId;
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

        public ConditionBuilder saoIdBetWeen(Long saoIdSt,Long saoIdEd){
            this.saoIdSt = saoIdSt;
            this.saoIdEd = saoIdEd;
            return this;
        }

        public ConditionBuilder saoIdGreaterEqThan(Long saoIdSt){
            this.saoIdSt = saoIdSt;
            return this;
        }
        public ConditionBuilder saoIdLessEqThan(Long saoIdEd){
            this.saoIdEd = saoIdEd;
            return this;
        }


        public ConditionBuilder saoIdList(Long ... saoId){
            this.saoIdList = solveNullList(saoId);
            return this;
        }

        public ConditionBuilder saoIdList(List<Long> saoId){
            this.saoIdList = saoId;
            return this;
        }

        public ConditionBuilder trackBeginerIdBetWeen(Integer trackBeginerIdSt,Integer trackBeginerIdEd){
            this.trackBeginerIdSt = trackBeginerIdSt;
            this.trackBeginerIdEd = trackBeginerIdEd;
            return this;
        }

        public ConditionBuilder trackBeginerIdGreaterEqThan(Integer trackBeginerIdSt){
            this.trackBeginerIdSt = trackBeginerIdSt;
            return this;
        }
        public ConditionBuilder trackBeginerIdLessEqThan(Integer trackBeginerIdEd){
            this.trackBeginerIdEd = trackBeginerIdEd;
            return this;
        }


        public ConditionBuilder trackBeginerIdList(Integer ... trackBeginerId){
            this.trackBeginerIdList = solveNullList(trackBeginerId);
            return this;
        }

        public ConditionBuilder trackBeginerIdList(List<Integer> trackBeginerId){
            this.trackBeginerIdList = trackBeginerId;
            return this;
        }

        public ConditionBuilder fuzzyTrackBeginerNo (List<String> fuzzyTrackBeginerNo){
            this.fuzzyTrackBeginerNo = fuzzyTrackBeginerNo;
            return this;
        }

        public ConditionBuilder fuzzyTrackBeginerNo (String ... fuzzyTrackBeginerNo){
            this.fuzzyTrackBeginerNo = solveNullList(fuzzyTrackBeginerNo);
            return this;
        }

        public ConditionBuilder rightFuzzyTrackBeginerNo (List<String> rightFuzzyTrackBeginerNo){
            this.rightFuzzyTrackBeginerNo = rightFuzzyTrackBeginerNo;
            return this;
        }

        public ConditionBuilder rightFuzzyTrackBeginerNo (String ... rightFuzzyTrackBeginerNo){
            this.rightFuzzyTrackBeginerNo = solveNullList(rightFuzzyTrackBeginerNo);
            return this;
        }

        public ConditionBuilder trackBeginerNoList(String ... trackBeginerNo){
            this.trackBeginerNoList = solveNullList(trackBeginerNo);
            return this;
        }

        public ConditionBuilder trackBeginerNoList(List<String> trackBeginerNo){
            this.trackBeginerNoList = trackBeginerNo;
            return this;
        }

        public ConditionBuilder fuzzyTrackBeginerName (List<String> fuzzyTrackBeginerName){
            this.fuzzyTrackBeginerName = fuzzyTrackBeginerName;
            return this;
        }

        public ConditionBuilder fuzzyTrackBeginerName (String ... fuzzyTrackBeginerName){
            this.fuzzyTrackBeginerName = solveNullList(fuzzyTrackBeginerName);
            return this;
        }

        public ConditionBuilder rightFuzzyTrackBeginerName (List<String> rightFuzzyTrackBeginerName){
            this.rightFuzzyTrackBeginerName = rightFuzzyTrackBeginerName;
            return this;
        }

        public ConditionBuilder rightFuzzyTrackBeginerName (String ... rightFuzzyTrackBeginerName){
            this.rightFuzzyTrackBeginerName = solveNullList(rightFuzzyTrackBeginerName);
            return this;
        }

        public ConditionBuilder trackBeginerNameList(String ... trackBeginerName){
            this.trackBeginerNameList = solveNullList(trackBeginerName);
            return this;
        }

        public ConditionBuilder trackBeginerNameList(List<String> trackBeginerName){
            this.trackBeginerNameList = trackBeginerName;
            return this;
        }

        public ConditionBuilder deliveryPersonIdBetWeen(Integer deliveryPersonIdSt,Integer deliveryPersonIdEd){
            this.deliveryPersonIdSt = deliveryPersonIdSt;
            this.deliveryPersonIdEd = deliveryPersonIdEd;
            return this;
        }

        public ConditionBuilder deliveryPersonIdGreaterEqThan(Integer deliveryPersonIdSt){
            this.deliveryPersonIdSt = deliveryPersonIdSt;
            return this;
        }
        public ConditionBuilder deliveryPersonIdLessEqThan(Integer deliveryPersonIdEd){
            this.deliveryPersonIdEd = deliveryPersonIdEd;
            return this;
        }


        public ConditionBuilder deliveryPersonIdList(Integer ... deliveryPersonId){
            this.deliveryPersonIdList = solveNullList(deliveryPersonId);
            return this;
        }

        public ConditionBuilder deliveryPersonIdList(List<Integer> deliveryPersonId){
            this.deliveryPersonIdList = deliveryPersonId;
            return this;
        }

        public ConditionBuilder fuzzyDeliveryPersonName (List<String> fuzzyDeliveryPersonName){
            this.fuzzyDeliveryPersonName = fuzzyDeliveryPersonName;
            return this;
        }

        public ConditionBuilder fuzzyDeliveryPersonName (String ... fuzzyDeliveryPersonName){
            this.fuzzyDeliveryPersonName = solveNullList(fuzzyDeliveryPersonName);
            return this;
        }

        public ConditionBuilder rightFuzzyDeliveryPersonName (List<String> rightFuzzyDeliveryPersonName){
            this.rightFuzzyDeliveryPersonName = rightFuzzyDeliveryPersonName;
            return this;
        }

        public ConditionBuilder rightFuzzyDeliveryPersonName (String ... rightFuzzyDeliveryPersonName){
            this.rightFuzzyDeliveryPersonName = solveNullList(rightFuzzyDeliveryPersonName);
            return this;
        }

        public ConditionBuilder deliveryPersonNameList(String ... deliveryPersonName){
            this.deliveryPersonNameList = solveNullList(deliveryPersonName);
            return this;
        }

        public ConditionBuilder deliveryPersonNameList(List<String> deliveryPersonName){
            this.deliveryPersonNameList = deliveryPersonName;
            return this;
        }

        public ConditionBuilder fuzzyDeliveryState (List<String> fuzzyDeliveryState){
            this.fuzzyDeliveryState = fuzzyDeliveryState;
            return this;
        }

        public ConditionBuilder fuzzyDeliveryState (String ... fuzzyDeliveryState){
            this.fuzzyDeliveryState = solveNullList(fuzzyDeliveryState);
            return this;
        }

        public ConditionBuilder rightFuzzyDeliveryState (List<String> rightFuzzyDeliveryState){
            this.rightFuzzyDeliveryState = rightFuzzyDeliveryState;
            return this;
        }

        public ConditionBuilder rightFuzzyDeliveryState (String ... rightFuzzyDeliveryState){
            this.rightFuzzyDeliveryState = solveNullList(rightFuzzyDeliveryState);
            return this;
        }

        public ConditionBuilder deliveryStateList(String ... deliveryState){
            this.deliveryStateList = solveNullList(deliveryState);
            return this;
        }

        public ConditionBuilder deliveryStateList(List<String> deliveryState){
            this.deliveryStateList = deliveryState;
            return this;
        }

        public ConditionBuilder fuzzyDeliveryDeadline (List<String> fuzzyDeliveryDeadline){
            this.fuzzyDeliveryDeadline = fuzzyDeliveryDeadline;
            return this;
        }

        public ConditionBuilder fuzzyDeliveryDeadline (String ... fuzzyDeliveryDeadline){
            this.fuzzyDeliveryDeadline = solveNullList(fuzzyDeliveryDeadline);
            return this;
        }

        public ConditionBuilder rightFuzzyDeliveryDeadline (List<String> rightFuzzyDeliveryDeadline){
            this.rightFuzzyDeliveryDeadline = rightFuzzyDeliveryDeadline;
            return this;
        }

        public ConditionBuilder rightFuzzyDeliveryDeadline (String ... rightFuzzyDeliveryDeadline){
            this.rightFuzzyDeliveryDeadline = solveNullList(rightFuzzyDeliveryDeadline);
            return this;
        }

        public ConditionBuilder deliveryDeadlineList(String ... deliveryDeadline){
            this.deliveryDeadlineList = solveNullList(deliveryDeadline);
            return this;
        }

        public ConditionBuilder deliveryDeadlineList(List<String> deliveryDeadline){
            this.deliveryDeadlineList = deliveryDeadline;
            return this;
        }

        public ConditionBuilder fuzzyDeliveryReceivedDate (List<String> fuzzyDeliveryReceivedDate){
            this.fuzzyDeliveryReceivedDate = fuzzyDeliveryReceivedDate;
            return this;
        }

        public ConditionBuilder fuzzyDeliveryReceivedDate (String ... fuzzyDeliveryReceivedDate){
            this.fuzzyDeliveryReceivedDate = solveNullList(fuzzyDeliveryReceivedDate);
            return this;
        }

        public ConditionBuilder rightFuzzyDeliveryReceivedDate (List<String> rightFuzzyDeliveryReceivedDate){
            this.rightFuzzyDeliveryReceivedDate = rightFuzzyDeliveryReceivedDate;
            return this;
        }

        public ConditionBuilder rightFuzzyDeliveryReceivedDate (String ... rightFuzzyDeliveryReceivedDate){
            this.rightFuzzyDeliveryReceivedDate = solveNullList(rightFuzzyDeliveryReceivedDate);
            return this;
        }

        public ConditionBuilder deliveryReceivedDateList(String ... deliveryReceivedDate){
            this.deliveryReceivedDateList = solveNullList(deliveryReceivedDate);
            return this;
        }

        public ConditionBuilder deliveryReceivedDateList(List<String> deliveryReceivedDate){
            this.deliveryReceivedDateList = deliveryReceivedDate;
            return this;
        }

        public ConditionBuilder fuzzyDeliveryCode (List<String> fuzzyDeliveryCode){
            this.fuzzyDeliveryCode = fuzzyDeliveryCode;
            return this;
        }

        public ConditionBuilder fuzzyDeliveryCode (String ... fuzzyDeliveryCode){
            this.fuzzyDeliveryCode = solveNullList(fuzzyDeliveryCode);
            return this;
        }

        public ConditionBuilder rightFuzzyDeliveryCode (List<String> rightFuzzyDeliveryCode){
            this.rightFuzzyDeliveryCode = rightFuzzyDeliveryCode;
            return this;
        }

        public ConditionBuilder rightFuzzyDeliveryCode (String ... rightFuzzyDeliveryCode){
            this.rightFuzzyDeliveryCode = solveNullList(rightFuzzyDeliveryCode);
            return this;
        }

        public ConditionBuilder deliveryCodeList(String ... deliveryCode){
            this.deliveryCodeList = solveNullList(deliveryCode);
            return this;
        }

        public ConditionBuilder deliveryCodeList(List<String> deliveryCode){
            this.deliveryCodeList = deliveryCode;
            return this;
        }

        public ConditionBuilder fuzzyAppearance (List<String> fuzzyAppearance){
            this.fuzzyAppearance = fuzzyAppearance;
            return this;
        }

        public ConditionBuilder fuzzyAppearance (String ... fuzzyAppearance){
            this.fuzzyAppearance = solveNullList(fuzzyAppearance);
            return this;
        }

        public ConditionBuilder rightFuzzyAppearance (List<String> rightFuzzyAppearance){
            this.rightFuzzyAppearance = rightFuzzyAppearance;
            return this;
        }

        public ConditionBuilder rightFuzzyAppearance (String ... rightFuzzyAppearance){
            this.rightFuzzyAppearance = solveNullList(rightFuzzyAppearance);
            return this;
        }

        public ConditionBuilder appearanceList(String ... appearance){
            this.appearanceList = solveNullList(appearance);
            return this;
        }

        public ConditionBuilder appearanceList(List<String> appearance){
            this.appearanceList = appearance;
            return this;
        }

        public ConditionBuilder fuzzyCarTestSymbol (List<String> fuzzyCarTestSymbol){
            this.fuzzyCarTestSymbol = fuzzyCarTestSymbol;
            return this;
        }

        public ConditionBuilder fuzzyCarTestSymbol (String ... fuzzyCarTestSymbol){
            this.fuzzyCarTestSymbol = solveNullList(fuzzyCarTestSymbol);
            return this;
        }

        public ConditionBuilder rightFuzzyCarTestSymbol (List<String> rightFuzzyCarTestSymbol){
            this.rightFuzzyCarTestSymbol = rightFuzzyCarTestSymbol;
            return this;
        }

        public ConditionBuilder rightFuzzyCarTestSymbol (String ... rightFuzzyCarTestSymbol){
            this.rightFuzzyCarTestSymbol = solveNullList(rightFuzzyCarTestSymbol);
            return this;
        }

        public ConditionBuilder carTestSymbolList(String ... carTestSymbol){
            this.carTestSymbolList = solveNullList(carTestSymbol);
            return this;
        }

        public ConditionBuilder carTestSymbolList(List<String> carTestSymbol){
            this.carTestSymbolList = carTestSymbol;
            return this;
        }

        public ConditionBuilder failureReappearPersonIdBetWeen(Integer failureReappearPersonIdSt,Integer failureReappearPersonIdEd){
            this.failureReappearPersonIdSt = failureReappearPersonIdSt;
            this.failureReappearPersonIdEd = failureReappearPersonIdEd;
            return this;
        }

        public ConditionBuilder failureReappearPersonIdGreaterEqThan(Integer failureReappearPersonIdSt){
            this.failureReappearPersonIdSt = failureReappearPersonIdSt;
            return this;
        }
        public ConditionBuilder failureReappearPersonIdLessEqThan(Integer failureReappearPersonIdEd){
            this.failureReappearPersonIdEd = failureReappearPersonIdEd;
            return this;
        }


        public ConditionBuilder failureReappearPersonIdList(Integer ... failureReappearPersonId){
            this.failureReappearPersonIdList = solveNullList(failureReappearPersonId);
            return this;
        }

        public ConditionBuilder failureReappearPersonIdList(List<Integer> failureReappearPersonId){
            this.failureReappearPersonIdList = failureReappearPersonId;
            return this;
        }

        public ConditionBuilder fuzzyFailureReappearPersonName (List<String> fuzzyFailureReappearPersonName){
            this.fuzzyFailureReappearPersonName = fuzzyFailureReappearPersonName;
            return this;
        }

        public ConditionBuilder fuzzyFailureReappearPersonName (String ... fuzzyFailureReappearPersonName){
            this.fuzzyFailureReappearPersonName = solveNullList(fuzzyFailureReappearPersonName);
            return this;
        }

        public ConditionBuilder rightFuzzyFailureReappearPersonName (List<String> rightFuzzyFailureReappearPersonName){
            this.rightFuzzyFailureReappearPersonName = rightFuzzyFailureReappearPersonName;
            return this;
        }

        public ConditionBuilder rightFuzzyFailureReappearPersonName (String ... rightFuzzyFailureReappearPersonName){
            this.rightFuzzyFailureReappearPersonName = solveNullList(rightFuzzyFailureReappearPersonName);
            return this;
        }

        public ConditionBuilder failureReappearPersonNameList(String ... failureReappearPersonName){
            this.failureReappearPersonNameList = solveNullList(failureReappearPersonName);
            return this;
        }

        public ConditionBuilder failureReappearPersonNameList(List<String> failureReappearPersonName){
            this.failureReappearPersonNameList = failureReappearPersonName;
            return this;
        }

        public ConditionBuilder fuzzyFailureReappearSymbol (List<String> fuzzyFailureReappearSymbol){
            this.fuzzyFailureReappearSymbol = fuzzyFailureReappearSymbol;
            return this;
        }

        public ConditionBuilder fuzzyFailureReappearSymbol (String ... fuzzyFailureReappearSymbol){
            this.fuzzyFailureReappearSymbol = solveNullList(fuzzyFailureReappearSymbol);
            return this;
        }

        public ConditionBuilder rightFuzzyFailureReappearSymbol (List<String> rightFuzzyFailureReappearSymbol){
            this.rightFuzzyFailureReappearSymbol = rightFuzzyFailureReappearSymbol;
            return this;
        }

        public ConditionBuilder rightFuzzyFailureReappearSymbol (String ... rightFuzzyFailureReappearSymbol){
            this.rightFuzzyFailureReappearSymbol = solveNullList(rightFuzzyFailureReappearSymbol);
            return this;
        }

        public ConditionBuilder failureReappearSymbolList(String ... failureReappearSymbol){
            this.failureReappearSymbolList = solveNullList(failureReappearSymbol);
            return this;
        }

        public ConditionBuilder failureReappearSymbolList(List<String> failureReappearSymbol){
            this.failureReappearSymbolList = failureReappearSymbol;
            return this;
        }

        public ConditionBuilder fuzzyReloadDate (List<String> fuzzyReloadDate){
            this.fuzzyReloadDate = fuzzyReloadDate;
            return this;
        }

        public ConditionBuilder fuzzyReloadDate (String ... fuzzyReloadDate){
            this.fuzzyReloadDate = solveNullList(fuzzyReloadDate);
            return this;
        }

        public ConditionBuilder rightFuzzyReloadDate (List<String> rightFuzzyReloadDate){
            this.rightFuzzyReloadDate = rightFuzzyReloadDate;
            return this;
        }

        public ConditionBuilder rightFuzzyReloadDate (String ... rightFuzzyReloadDate){
            this.rightFuzzyReloadDate = solveNullList(rightFuzzyReloadDate);
            return this;
        }

        public ConditionBuilder reloadDateList(String ... reloadDate){
            this.reloadDateList = solveNullList(reloadDate);
            return this;
        }

        public ConditionBuilder reloadDateList(List<String> reloadDate){
            this.reloadDateList = reloadDate;
            return this;
        }

        public ConditionBuilder fuzzyFailureReappearDate (List<String> fuzzyFailureReappearDate){
            this.fuzzyFailureReappearDate = fuzzyFailureReappearDate;
            return this;
        }

        public ConditionBuilder fuzzyFailureReappearDate (String ... fuzzyFailureReappearDate){
            this.fuzzyFailureReappearDate = solveNullList(fuzzyFailureReappearDate);
            return this;
        }

        public ConditionBuilder rightFuzzyFailureReappearDate (List<String> rightFuzzyFailureReappearDate){
            this.rightFuzzyFailureReappearDate = rightFuzzyFailureReappearDate;
            return this;
        }

        public ConditionBuilder rightFuzzyFailureReappearDate (String ... rightFuzzyFailureReappearDate){
            this.rightFuzzyFailureReappearDate = solveNullList(rightFuzzyFailureReappearDate);
            return this;
        }

        public ConditionBuilder failureReappearDateList(String ... failureReappearDate){
            this.failureReappearDateList = solveNullList(failureReappearDate);
            return this;
        }

        public ConditionBuilder failureReappearDateList(List<String> failureReappearDate){
            this.failureReappearDateList = failureReappearDate;
            return this;
        }

        public ConditionBuilder fuzzyFailureReappearSituation (List<String> fuzzyFailureReappearSituation){
            this.fuzzyFailureReappearSituation = fuzzyFailureReappearSituation;
            return this;
        }

        public ConditionBuilder fuzzyFailureReappearSituation (String ... fuzzyFailureReappearSituation){
            this.fuzzyFailureReappearSituation = solveNullList(fuzzyFailureReappearSituation);
            return this;
        }

        public ConditionBuilder rightFuzzyFailureReappearSituation (List<String> rightFuzzyFailureReappearSituation){
            this.rightFuzzyFailureReappearSituation = rightFuzzyFailureReappearSituation;
            return this;
        }

        public ConditionBuilder rightFuzzyFailureReappearSituation (String ... rightFuzzyFailureReappearSituation){
            this.rightFuzzyFailureReappearSituation = solveNullList(rightFuzzyFailureReappearSituation);
            return this;
        }

        public ConditionBuilder failureReappearSituationList(String ... failureReappearSituation){
            this.failureReappearSituationList = solveNullList(failureReappearSituation);
            return this;
        }

        public ConditionBuilder failureReappearSituationList(List<String> failureReappearSituation){
            this.failureReappearSituationList = failureReappearSituation;
            return this;
        }

        public ConditionBuilder fuzzyFailureReappearResult (List<String> fuzzyFailureReappearResult){
            this.fuzzyFailureReappearResult = fuzzyFailureReappearResult;
            return this;
        }

        public ConditionBuilder fuzzyFailureReappearResult (String ... fuzzyFailureReappearResult){
            this.fuzzyFailureReappearResult = solveNullList(fuzzyFailureReappearResult);
            return this;
        }

        public ConditionBuilder rightFuzzyFailureReappearResult (List<String> rightFuzzyFailureReappearResult){
            this.rightFuzzyFailureReappearResult = rightFuzzyFailureReappearResult;
            return this;
        }

        public ConditionBuilder rightFuzzyFailureReappearResult (String ... rightFuzzyFailureReappearResult){
            this.rightFuzzyFailureReappearResult = solveNullList(rightFuzzyFailureReappearResult);
            return this;
        }

        public ConditionBuilder failureReappearResultList(String ... failureReappearResult){
            this.failureReappearResultList = solveNullList(failureReappearResult);
            return this;
        }

        public ConditionBuilder failureReappearResultList(List<String> failureReappearResult){
            this.failureReappearResultList = failureReappearResult;
            return this;
        }

        public ConditionBuilder fuzzyAnalysisDepartments (List<String> fuzzyAnalysisDepartments){
            this.fuzzyAnalysisDepartments = fuzzyAnalysisDepartments;
            return this;
        }

        public ConditionBuilder fuzzyAnalysisDepartments (String ... fuzzyAnalysisDepartments){
            this.fuzzyAnalysisDepartments = solveNullList(fuzzyAnalysisDepartments);
            return this;
        }

        public ConditionBuilder rightFuzzyAnalysisDepartments (List<String> rightFuzzyAnalysisDepartments){
            this.rightFuzzyAnalysisDepartments = rightFuzzyAnalysisDepartments;
            return this;
        }

        public ConditionBuilder rightFuzzyAnalysisDepartments (String ... rightFuzzyAnalysisDepartments){
            this.rightFuzzyAnalysisDepartments = solveNullList(rightFuzzyAnalysisDepartments);
            return this;
        }

        public ConditionBuilder analysisDepartmentsList(String ... analysisDepartments){
            this.analysisDepartmentsList = solveNullList(analysisDepartments);
            return this;
        }

        public ConditionBuilder analysisDepartmentsList(List<String> analysisDepartments){
            this.analysisDepartmentsList = analysisDepartments;
            return this;
        }

        public ConditionBuilder fuzzyAnalysisDeadline (List<String> fuzzyAnalysisDeadline){
            this.fuzzyAnalysisDeadline = fuzzyAnalysisDeadline;
            return this;
        }

        public ConditionBuilder fuzzyAnalysisDeadline (String ... fuzzyAnalysisDeadline){
            this.fuzzyAnalysisDeadline = solveNullList(fuzzyAnalysisDeadline);
            return this;
        }

        public ConditionBuilder rightFuzzyAnalysisDeadline (List<String> rightFuzzyAnalysisDeadline){
            this.rightFuzzyAnalysisDeadline = rightFuzzyAnalysisDeadline;
            return this;
        }

        public ConditionBuilder rightFuzzyAnalysisDeadline (String ... rightFuzzyAnalysisDeadline){
            this.rightFuzzyAnalysisDeadline = solveNullList(rightFuzzyAnalysisDeadline);
            return this;
        }

        public ConditionBuilder analysisDeadlineList(String ... analysisDeadline){
            this.analysisDeadlineList = solveNullList(analysisDeadline);
            return this;
        }

        public ConditionBuilder analysisDeadlineList(List<String> analysisDeadline){
            this.analysisDeadlineList = analysisDeadline;
            return this;
        }

        public ConditionBuilder fuzzyAnalysisRequirement (List<String> fuzzyAnalysisRequirement){
            this.fuzzyAnalysisRequirement = fuzzyAnalysisRequirement;
            return this;
        }

        public ConditionBuilder fuzzyAnalysisRequirement (String ... fuzzyAnalysisRequirement){
            this.fuzzyAnalysisRequirement = solveNullList(fuzzyAnalysisRequirement);
            return this;
        }

        public ConditionBuilder rightFuzzyAnalysisRequirement (List<String> rightFuzzyAnalysisRequirement){
            this.rightFuzzyAnalysisRequirement = rightFuzzyAnalysisRequirement;
            return this;
        }

        public ConditionBuilder rightFuzzyAnalysisRequirement (String ... rightFuzzyAnalysisRequirement){
            this.rightFuzzyAnalysisRequirement = solveNullList(rightFuzzyAnalysisRequirement);
            return this;
        }

        public ConditionBuilder analysisRequirementList(String ... analysisRequirement){
            this.analysisRequirementList = solveNullList(analysisRequirement);
            return this;
        }

        public ConditionBuilder analysisRequirementList(List<String> analysisRequirement){
            this.analysisRequirementList = analysisRequirement;
            return this;
        }

        public ConditionBuilder fuzzyImportance (List<String> fuzzyImportance){
            this.fuzzyImportance = fuzzyImportance;
            return this;
        }

        public ConditionBuilder fuzzyImportance (String ... fuzzyImportance){
            this.fuzzyImportance = solveNullList(fuzzyImportance);
            return this;
        }

        public ConditionBuilder rightFuzzyImportance (List<String> rightFuzzyImportance){
            this.rightFuzzyImportance = rightFuzzyImportance;
            return this;
        }

        public ConditionBuilder rightFuzzyImportance (String ... rightFuzzyImportance){
            this.rightFuzzyImportance = solveNullList(rightFuzzyImportance);
            return this;
        }

        public ConditionBuilder importanceList(String ... importance){
            this.importanceList = solveNullList(importance);
            return this;
        }

        public ConditionBuilder importanceList(List<String> importance){
            this.importanceList = importance;
            return this;
        }

        public ConditionBuilder fuzzyAppendix (List<String> fuzzyAppendix){
            this.fuzzyAppendix = fuzzyAppendix;
            return this;
        }

        public ConditionBuilder fuzzyAppendix (String ... fuzzyAppendix){
            this.fuzzyAppendix = solveNullList(fuzzyAppendix);
            return this;
        }

        public ConditionBuilder rightFuzzyAppendix (List<String> rightFuzzyAppendix){
            this.rightFuzzyAppendix = rightFuzzyAppendix;
            return this;
        }

        public ConditionBuilder rightFuzzyAppendix (String ... rightFuzzyAppendix){
            this.rightFuzzyAppendix = solveNullList(rightFuzzyAppendix);
            return this;
        }

        public ConditionBuilder appendixList(String ... appendix){
            this.appendixList = solveNullList(appendix);
            return this;
        }

        public ConditionBuilder appendixList(List<String> appendix){
            this.appendixList = appendix;
            return this;
        }

        public ConditionBuilder fuzzyProcessState (List<String> fuzzyProcessState){
            this.fuzzyProcessState = fuzzyProcessState;
            return this;
        }

        public ConditionBuilder fuzzyProcessState (String ... fuzzyProcessState){
            this.fuzzyProcessState = solveNullList(fuzzyProcessState);
            return this;
        }

        public ConditionBuilder rightFuzzyProcessState (List<String> rightFuzzyProcessState){
            this.rightFuzzyProcessState = rightFuzzyProcessState;
            return this;
        }

        public ConditionBuilder rightFuzzyProcessState (String ... rightFuzzyProcessState){
            this.rightFuzzyProcessState = solveNullList(rightFuzzyProcessState);
            return this;
        }

        public ConditionBuilder processStateList(String ... processState){
            this.processStateList = solveNullList(processState);
            return this;
        }

        public ConditionBuilder processStateList(List<String> processState){
            this.processStateList = processState;
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

        private MqmsFailureTrack obj;

        public Builder(){
            this.obj = new MqmsFailureTrack();
        }

        public Builder failureTrackId(Integer failureTrackId){
            this.obj.setFailureTrackId(failureTrackId);
            return this;
        }
        public Builder voucherCode(String voucherCode){
            this.obj.setVoucherCode(voucherCode);
            return this;
        }
        public Builder engOrTran(String engOrTran){
            this.obj.setEngOrTran(engOrTran);
            return this;
        }
        public Builder saoId(Long saoId){
            this.obj.setSaoId(saoId);
            return this;
        }
        public Builder trackBeginerId(Integer trackBeginerId){
            this.obj.setTrackBeginerId(trackBeginerId);
            return this;
        }
        public Builder trackBeginerNo(String trackBeginerNo){
            this.obj.setTrackBeginerNo(trackBeginerNo);
            return this;
        }
        public Builder trackBeginerName(String trackBeginerName){
            this.obj.setTrackBeginerName(trackBeginerName);
            return this;
        }
        public Builder deliveryPersonId(Integer deliveryPersonId){
            this.obj.setDeliveryPersonId(deliveryPersonId);
            return this;
        }
        public Builder deliveryPersonName(String deliveryPersonName){
            this.obj.setDeliveryPersonName(deliveryPersonName);
            return this;
        }
        public Builder deliveryState(String deliveryState){
            this.obj.setDeliveryState(deliveryState);
            return this;
        }
        public Builder deliveryDeadline(String deliveryDeadline){
            this.obj.setDeliveryDeadline(deliveryDeadline);
            return this;
        }
        public Builder deliveryReceivedDate(String deliveryReceivedDate){
            this.obj.setDeliveryReceivedDate(deliveryReceivedDate);
            return this;
        }
        public Builder deliveryCode(String deliveryCode){
            this.obj.setDeliveryCode(deliveryCode);
            return this;
        }
        public Builder appearance(String appearance){
            this.obj.setAppearance(appearance);
            return this;
        }
        public Builder carTestSymbol(String carTestSymbol){
            this.obj.setCarTestSymbol(carTestSymbol);
            return this;
        }
        public Builder failureReappearPersonId(Integer failureReappearPersonId){
            this.obj.setFailureReappearPersonId(failureReappearPersonId);
            return this;
        }
        public Builder failureReappearPersonName(String failureReappearPersonName){
            this.obj.setFailureReappearPersonName(failureReappearPersonName);
            return this;
        }
        public Builder failureReappearSymbol(String failureReappearSymbol){
            this.obj.setFailureReappearSymbol(failureReappearSymbol);
            return this;
        }
        public Builder reloadDate(String reloadDate){
            this.obj.setReloadDate(reloadDate);
            return this;
        }
        public Builder failureReappearDate(String failureReappearDate){
            this.obj.setFailureReappearDate(failureReappearDate);
            return this;
        }
        public Builder failureReappearSituation(String failureReappearSituation){
            this.obj.setFailureReappearSituation(failureReappearSituation);
            return this;
        }
        public Builder failureReappearResult(String failureReappearResult){
            this.obj.setFailureReappearResult(failureReappearResult);
            return this;
        }
        public Builder analysisDepartments(String analysisDepartments){
            this.obj.setAnalysisDepartments(analysisDepartments);
            return this;
        }
        public Builder analysisDeadline(String analysisDeadline){
            this.obj.setAnalysisDeadline(analysisDeadline);
            return this;
        }
        public Builder analysisRequirement(String analysisRequirement){
            this.obj.setAnalysisRequirement(analysisRequirement);
            return this;
        }
        public Builder importance(String importance){
            this.obj.setImportance(importance);
            return this;
        }
        public Builder appendix(String appendix){
            this.obj.setAppendix(appendix);
            return this;
        }
        public Builder processState(String processState){
            this.obj.setProcessState(processState);
            return this;
        }
        public MqmsFailureTrack build(){return obj;}
    }

}
