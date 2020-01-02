package com.gamc.efactory.config;

/**
 * Created by Zeho Lee on 2019/3/4.
 * 这个类存储系统常量
 */
public enum Config {
    /**
     * attSystem代表考勤系统的ip地址
     */
    attSystem("http://172.18.138.253:8080/attendance"),
//    processSystem("http://192.168.199.15:8080/process"),
    processSystem("http://192.168.100.250:8081/process"),
    wmsOrderLink("http://192.168.199.105:8083/wms/static/orderCheckPage.html"),
//    wmsOrderLink("http://192.168.199.14:8080/wms/static/orderCheckPage.html"),
    wmsWarehousingOutLink("http://192.168.199.14:8080/wms/warehousingOutCheckPage"),
    //    attSystem("http://localhost:8080/attendance"),
    defaultEmailFrom("DLZCXXTS@gacmotor.com"),
    defaultEmailSubject("您有一项新的待审核任务"),
    defaultEmailText("您有一封新的待审核任务，请将Chrome设为默认浏览器并到 <a href='http://172.18.138.253:8080'>172.18.138.253:8080</a> 登录流程系统"),
    /**
     * 人员信息调用接口
     */
    userInfoImpl("/attmenber?action=list");
    private final String varName;
    private Config(String varName){
        this.varName = varName;
    }
    public String getVarName(){
        return varName;
    }

}
