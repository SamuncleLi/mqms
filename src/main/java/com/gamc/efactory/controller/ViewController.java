package com.gamc.efactory.controller;

import com.gamc.efactory.dao.RoleMapper;
import com.gamc.efactory.dao.UserMapper;
import com.gamc.efactory.model.dataObject.Auth;
import com.gamc.efactory.model.dataObject.Role;
import com.gamc.efactory.model.dataObject.User;
import com.gamc.efactory.service.VeiDataService;
import com.gamc.efactory.service.serviceImpl.VeiDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Zeho Lee on 2019/7/10.
 */
@Controller
@RequestMapping("/view")
public class ViewController {
    @Autowired
    UserMapper userMapper;
    @Autowired
    RoleMapper roleMapper;
    /**
     * @描述
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2019/7/10
     * @参变量
     * @返回
     * @抛出异常
    */
    @RequestMapping(value = "/main/{userId}")
    public String mainView(@PathVariable int userId, HttpSession session){
        session.setAttribute("userId", userId);
        //根据userId获取User信息
        User user = userMapper.queryUserLimit1(userId);
        //遍历roles，获取auth
        Set<Auth> set = new HashSet<>();
        for(Role role:user.getRoles()){
            List<Auth> authList = roleMapper.queryAuths(role);
            set.addAll(authList);
        }
        user.setAuths(set);
        session.setAttribute("user", user);
        return "main";
    }

    @RequestMapping(value = "/sparePartsContract")
    public String sparePartsContractView(){
        return "sparePartsContract";
    }

    @RequestMapping(value = "/materialContract")
    public String materialContractView(){
        return "materialContract";
    }

    @RequestMapping(value = "/material")
    public String materialView(){
        return "material";
    }

    @RequestMapping(value = "/sparePartsOrder")
    public String sparePartsOrderView(){
        return "sparePartsOrder";
    }

    @RequestMapping(value = "/knifeOrder")
    public String knifeOrderView(){
        return "knifeOrder";
    }

    @RequestMapping(value = "/order")
    public String orderView(){
        return "order";
    }

    @RequestMapping(value = "/warehousingIn")
    public String warehousingInView(){
        return "warehousingIn";
    }

    @RequestMapping(value = "/warehousingOut")
    public String warehousingOutView(){
        return "warehousingOut";
    }
    @RequestMapping(value = "/fortest")
    public String fortest(){
        return "dict";
    }

    @RequestMapping(value = "/dict")
    public String dictView(){
        return "dict";
    }
    
    @RequestMapping(value = "/orderCheckPage")
    public String orderCheckView(){
        return "orderCheckPage";
    }

    @RequestMapping(value = "/storageAmountCharts")
    public String storageAmountCharts(){
        return "storageAmountCharts";
    }

    @RequestMapping(value = "/supplier")
    public String supplierView(){
        return "supplier";
    }

    @RequestMapping(value = "/newMaterial")
    public String newMaterialView(){
        return "newMaterial";
    }

    @RequestMapping(value = "orderReceipt")
    public String orderReceiptView(){
        return "orderReceipt";
    }

    @RequestMapping(value = "warehousingOutCheckPage")
    public String warehousingOutCheckPageView(){
        return "warehousingOutCheckPage";
    }

    @RequestMapping(value = "/data_sales")
    public String salesView(){
        return "data_sales";
    }

    @RequestMapping(value = "/data_production")
    public String productionView(){
        return "data_production";
    }

    @RequestMapping(value = "/data_voucher")
    public String voucherView(){
        return "data_voucher";
    }

    @RequestMapping(value = "/charts_eng_failure_rate")
    public String charts_eng_failure_rateView(){
        return "charts_eng_failure_rate";
    }

    @RequestMapping(value = "/charts_tran_failure_rate")
    public String charts_tran_failure_rateView(){
        return "charts_tran_failure_rate";
    }

    @RequestMapping(value = "/charts_eng_single_analysis")
    public String charts_eng_single_analysisView(){
        return "charts_eng_single_analysis";
    }

    @RequestMapping(value = "/charts_tran_single_analysis")
    public String charts_tran_single_analysisView(){
        return "charts_tran_single_analysis";
    }
    @RequestMapping(value = "/vinDecode")
    public String vinDecodeView(){
        return "vin_decode";
    }
    @RequestMapping(value = "/salesPointDecode")
    public String salesPointDecodeView(){
        return "sales_point_decode";
    }
    @RequestMapping(value = "/transManDecode")
    public String transManDecodeView(){
        return "trans_man_decode";
    }
    @RequestMapping(value = "/transTypeDecode")
    public String transTypeDecodeView(){
        return "trans_type_decode";
    }
    @RequestMapping(value = "/transYearDecode")
    public String transYearDecodeView(){
        return "trans_year_decode";
    }
    @RequestMapping(value = "/faultCodeDecode")
    public String faultCodeDecodeView(){
        return "fault_code_decode";
    }
    @RequestMapping(value = "/data_delivery")
    public String dataDelivery(){
        return "data_delivery";
    }
    @RequestMapping(value = "/data_market_bulletin")
    public String dataMarketBulletin(){
        return "data_market_bulletin";
    }

}
