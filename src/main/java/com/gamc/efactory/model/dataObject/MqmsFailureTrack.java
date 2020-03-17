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

    private static final long serialVersionUID = 1583454485051L;


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
    * 流程系统id
    * isNullAble:1
    */
    private Integer saoId;

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


    public void setFailureTrackId(Integer failureTrackId){this.failureTrackId = failureTrackId;}

    public Integer getFailureTrackId(){return this.failureTrackId;}

    public void setVoucherCode(String voucherCode){this.voucherCode = voucherCode;}

    public String getVoucherCode(){return this.voucherCode;}

    public void setSaoId(Integer saoId){this.saoId = saoId;}

    public Integer getSaoId(){return this.saoId;}

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

    public void setCarTestSymbol(String carTestSymbol){this.carTestSymbol = carTestSymbol;}

    public String getCarTestSymbol(){return this.carTestSymbol;}

    public void setFailureReappearPersonId(Integer failureReappearPersonId){this.failureReappearPersonId = failureReappearPersonId;}

    public Integer getFailureReappearPersonId(){return this.failureReappearPersonId;}

    public void setFailureReappearPersonName(String failureReappearPersonName){this.failureReappearPersonName = failureReappearPersonName;}

    public String getFailureReappearPersonName(){return this.failureReappearPersonName;}

    public void setFailureReappearSymbol(String failureReappearSymbol){this.failureReappearSymbol = failureReappearSymbol;}

    public String getFailureReappearSymbol(){return this.failureReappearSymbol;}

    public void setFailureReappearDate(String failureReappearDate){this.failureReappearDate = failureReappearDate;}

    public String getFailureReappearDate(){return this.failureReappearDate;}

    public void setFailureReappearSituation(String failureReappearSituation){this.failureReappearSituation = failureReappearSituation;}

    public String getFailureReappearSituation(){return this.failureReappearSituation;}

    public void setFailureReappearResult(String failureReappearResult){this.failureReappearResult = failureReappearResult;}

    public String getFailureReappearResult(){return this.failureReappearResult;}
    @Override
    public String toString() {
        return "MqmsFailureTrack{" +
                "failureTrackId='" + failureTrackId + '\'' +
                "voucherCode='" + voucherCode + '\'' +
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
                "carTestSymbol='" + carTestSymbol + '\'' +
                "failureReappearPersonId='" + failureReappearPersonId + '\'' +
                "failureReappearPersonName='" + failureReappearPersonName + '\'' +
                "failureReappearSymbol='" + failureReappearSymbol + '\'' +
                "failureReappearDate='" + failureReappearDate + '\'' +
                "failureReappearSituation='" + failureReappearSituation + '\'' +
                "failureReappearResult='" + failureReappearResult + '\'' +
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
        private List<Integer> saoIdList;

        public List<Integer> getSaoIdList(){return this.saoIdList;}

        private Integer saoIdSt;

        private Integer saoIdEd;

        public Integer getSaoIdSt(){return this.saoIdSt;}

        public Integer getSaoIdEd(){return this.saoIdEd;}

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

        public QueryBuilder saoIdBetWeen(Integer saoIdSt,Integer saoIdEd){
            this.saoIdSt = saoIdSt;
            this.saoIdEd = saoIdEd;
            return this;
        }

        public QueryBuilder saoIdGreaterEqThan(Integer saoIdSt){
            this.saoIdSt = saoIdSt;
            return this;
        }
        public QueryBuilder saoIdLessEqThan(Integer saoIdEd){
            this.saoIdEd = saoIdEd;
            return this;
        }


        public QueryBuilder saoId(Integer saoId){
            setSaoId(saoId);
            return this;
        }

        public QueryBuilder saoIdList(Integer ... saoId){
            this.saoIdList = solveNullList(saoId);
            return this;
        }

        public QueryBuilder saoIdList(List<Integer> saoId){
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
        private List<Integer> saoIdList;

        public List<Integer> getSaoIdList(){return this.saoIdList;}

        private Integer saoIdSt;

        private Integer saoIdEd;

        public Integer getSaoIdSt(){return this.saoIdSt;}

        public Integer getSaoIdEd(){return this.saoIdEd;}

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

        public ConditionBuilder saoIdBetWeen(Integer saoIdSt,Integer saoIdEd){
            this.saoIdSt = saoIdSt;
            this.saoIdEd = saoIdEd;
            return this;
        }

        public ConditionBuilder saoIdGreaterEqThan(Integer saoIdSt){
            this.saoIdSt = saoIdSt;
            return this;
        }
        public ConditionBuilder saoIdLessEqThan(Integer saoIdEd){
            this.saoIdEd = saoIdEd;
            return this;
        }


        public ConditionBuilder saoIdList(Integer ... saoId){
            this.saoIdList = solveNullList(saoId);
            return this;
        }

        public ConditionBuilder saoIdList(List<Integer> saoId){
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
        public Builder saoId(Integer saoId){
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
        public MqmsFailureTrack build(){return obj;}
    }

}
