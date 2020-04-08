var _menus_oneLeve=[{"menuid":"0","menuname":"首页","icon":"fa-home"},{"menuid":"1","menuname":"数据报表","icon":"fa-trophy"},{"menuid":"2","menuname":"不良跟踪","icon":"fa-inbox"},{"menuid":"3","menuname":"资料管理","icon":"fa-suitcase"},{"menuid":"4","menuname":"系统管理","icon":"fa-dropbox"}];
var _menus=[
    {"menuid":"00","icon":"fa-trophy","menuname":"信息栏",parentMenu:'0',
        "menus":[{"menuid":"000","menuname":"公告与待办事项","icon":"fa-dashboard","url":"/mqms/view/dict"},
                {"menuid":"001","menuname":"日程表","icon":"fa-delicious","url":"dashboard.html"}
            ]},{
     "menuid":"01","icon":"fa-television","menuname":"个人信息",parentMenu:'0',
        "menus":[{"menuid":"010","menuname":"代办事项","icon":"fa-tty","url":"https://item.taobao.com/item.htm?id=545823027227"},
                {"menuid":"011","menuname":"公告通知","icon":"fa-volume-up","url":""}
            ]
    },
	{"menuid":"11","icon":"fa-trophy","menuname":"市场数据",parentMenu:'1',
		"menus":[{"menuid":"110","menuname":"市场故障清单","icon":"fa-window-restore","url":"/mqms/view/data_voucher"},
                {"menuid":"111","menuname":"市场通报清单","icon":"fa-window-restore","url":"/mqms/view/data_market_bulletin"},
                {"menuid":"112","menuname":"销售清单","icon":"fa-window-maximize","url":"/mqms/view/data_sales"},
                {"menuid":"113","menuname":"生产清单","icon":"fa-window-maximize","url":"/mqms/view/data_production"},
			]},{
     "menuid":"12","icon":"fa-television","menuname":"市场报表",parentMenu:'1',
        "menus":[{"menuid":"120","menuname":"发动机不良率","icon":"fa-globe","url":"/mqms/view/charts_eng_failure_rate"},
                {"menuid":"121","menuname":"变速箱不良率","icon":"fa-laptop","url":"/mqms/view/charts_tran_failure_rate"},
                {"menuid":"122","menuname":"发动机单机型市场品质数据","icon":"fa-laptop","url":"/mqms/view/charts_eng_single_analysis"},
                {"menuid":"123","menuname":"变速箱单机型市场品质数据","icon":"fa-laptop","url":"/mqms/view/charts_tran_single_analysis"},
                {"menuid":"124","menuname":"车型累计不良率","icon":"fa-laptop","url":"/mqms/view/charts_car_mutil_analysis"}
            ]
    },
	{"menuid":"21","icon":"fa-plug","menuname":"不良跟踪",parentMenu:'2',
		"menus":[
            {"menuid":"210","menuname":"快递件到货情况","icon":"fa-toggle-down","url":"/mqms/view/data_delivery"},
            {"menuid":"211","menuname":"不良报告","icon":"fa-puzzle-piece","url":"demo/msgTip.html"}
		]
	},
	{"menuid":"22","icon":"fa-cubes","menuname":"重点课题",parentMenu:'2',
		"menus":[{"menuid":"220","menuname":"领导交代课题","icon":"fa-dot-circle-o","url":"demo/inonSvg.html"},
			{"menuid":"221","menuname":"重点课题","icon":"fa-sticky-note","url":"demo/msgTip.html"}
		]
	},
    {"menuid":"31","icon":"fa-suitcase","menuname":"资料管理",parentMenu:'3',
    	"menus":[{"menuid":"311","menuname":"售后文档","icon":"fa-inbox","url":"demo/msgTip.html"},
    			{"menuid":"312","menuname":"我的文档","icon":"fa-share-alt-square","url":"demo/msgTip.html"}
        ]
    },
    {"menuid":"41","icon":"fa-suitcase","menuname":"配置项管理",parentMenu:'4',
        "menus":[{"menuid":"411","menuname":"字典","icon":"fa-inbox","url":"/mqms/view/dict"},
            {"menuid":"412","menuname":"销售点表","icon":"fa-share-alt-square","url":"/mqms/view/salesPointDecode"},
            {"menuid":"413","menuname":"vin码解码表","icon":"fa-share-alt-square","url":"/mqms/view/vinDecode"},
            {"menuid":"414","menuname":"变速箱厂家解码表","icon":"fa-share-alt-square","url":"/mqms/view/transManDecode"},
            {"menuid":"415","menuname":"变速箱类型解码表","icon":"fa-share-alt-square","url":"/mqms/view/transTypeDecode"},
            {"menuid":"416","menuname":"变速箱年份解码表","icon":"fa-share-alt-square","url":"/mqms/view/transYearDecode"},

            // {"menuid":"416","menuname":"mtoc解码表","icon":"fa-share-alt-square","url":"demo/msgTip.html"},
            {"menuid":"417","menuname":"故障代码表","icon":"fa-share-alt-square","url":"/mqms/view/faultCodeDecode"},
        ]
    },
	{"menuid":"42","icon":"fa-dashboard","menuname":"系统仪表板",parentMenu:'4',
		"menus":[
			{"menuid":"421","menuname":"系统管理","icon":"fa-id-card","url":"demo/resource.html"},
			{"menuid":"422","menuname":"表单示例","icon":"fa-users","url":"demo/msgTip.html"},
			{"menuid":"423","menuname":"角色管理","icon":"fa-address-card","url":"demo/msgTip.html"},
			{"menuid":"424","menuname":"权限设置","icon":"fa-user-plus","url":"demo/msgTip.html"},
			{"menuid":"425","menuname":"升级日志","icon":"fa-list","url":"https://blog.csdn.net/DJCBPL/article/details/80281869"}
		]
	}
		
];

    //设置登录窗口
    function openPwd() {$('#updatePwd').window({title: '修改密码', width: 300, modal: true, shadow: true, closed: true, height: 160, resizable:false }); }
    //关闭登录窗口
    function closePwd() {$('#updatePwd').window('close');}

    //修改密码
    function serverLogin() {
        var $newpass = $('#txtNewPass');
        var $rePass = $('#txtRePass');

        if ($newpass.val() == '') {
            msgShow('系统提示', '请输入密码！', 'admin');
            return false;
        }
        if ($rePass.val() == '') {
            msgShow('系统提示', '请在一次输入密码！', 'admin');
            return false;
        }

        if ($newpass.val() != $rePass.val()) {
            msgShow('系统提示', '两次密码不一至！请重新输入', 'admin');
            return false;
        }

        $.post('/ajax=' + $newpass.val(), function(msg) {
            msgShow('系统提示', '恭喜，密码修改成功！<br>您的新密码为：' + msg, 'info');
            $newpass.val('');
            $rePass.val('');
            close();
        })
        
    }

    // $(function() {
    //     openPwd();
    //
    //     $('#editpass').click(function(){$('#updatePwd').window('open');});
    //
    //     $('#btnEp').click(function(){serverLogin();});
    //
		// $('#btnCancel').click(function(){closePwd();});
    //
    //     $('#loginOut').click(function() {
    //         $.messager.confirm('系统提示', '您确定要退出本次登录吗?', function(r) {
    //
    //             if (r) {
    //                 location.href = 'login.html';
    //             }
    //         });
    //     })
    // });

$(function(){var mydate = new Date(); var tm=mydate.getFullYear(); $("#timeYear").text(tm); });