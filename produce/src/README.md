查询公共数据：
    url:
        http://123.56.106.24:8081/produce/get
    example:
        http://123.56.106.24:8081/produce/get?year=2020&workcompany=安装一队
    way:
        GET
    keys:
    {
        "year":2020
        "workcompany":"安装二队"
    }
    response:
    [
        {
            "pid": 57,
            "engeenirName": "英台采油厂分水器刺漏隐患治理工程",
            "companyType": "上市公司",
            "buildCompany": "英台采油厂",
            "numOfItem": "开安190065",
            "wbs": "D1-19GX232.04",
            "money": 38.67,
            "workCompany": "安装二队",
            "workYear": 2020,
            "isFin": "否",
            "originalNum": ""
        },
        {
            "pid": 58,
            "engeenirName": "前大-乾安输油管道运行方式调改工程",
            "companyType": "上市公司",
            "buildCompany": "松原采气厂",
            "numOfItem": "开调180036",
            "wbs": "D1-18GX246.03",
            "money": 144.8,
            "workCompany": "安装二队",
            "workYear": 2020,
            "isFin": "否",
            "originalNum": ""
        },
        {
            "pid": 59,
            "engeenirName": "注水系统更新工程",
            "companyType": "上市公司",
            "buildCompany": "松原采气厂",
            "numOfItem": "注水180015",
            "wbs": "D1-18GX255.03",
            "money": 66.04,
            "workCompany": "安装二队",
            "workYear": 2020,
            "isFin": "否",
            "originalNum": ""
        },
        {
            "pid": 60,
            "engeenirName": "集输系统汛后恢复生产工程",
            "companyType": "上市公司",
            "buildCompany": "新木采油厂",
            "numOfItem": "防汛190012",
            "wbs": "D1-18GX255.03",
            "money": 358.28,
            "workCompany": "安装二队",
            "workYear": 2020,
            "isFin": "否",
            "originalNum": ""
        }
    ]

保存和修改公共数据：
    url:
        http://123.56.103.24:8081/produce/save
    way:
        POST
    参数：
         {
            "pid": 100,  //序号(保存的时候不需要，修改的时候需要)不可更改                   
            "engeenirName": "2018年第一批更新改造工程", //工程项目名称
            "companyType": "上市公司",                //公司类型
            "buildCompany": "新木采油厂",             //建设单位
            "numOfItem": "开调180057",               //批件号
            "wbs": "D1-18GX331.09",                 //WBS元素
            "money": 696.2,                         //投资金额
            "workCompany": "输电队",                 //施工单位
            "workYear": 2018,                       //工程年份
            "isFin": "是",                          //是否转结工程
            "originalNum": "开调180057"             //原件批号
         }
    response:{
        {
            "status": 1
        }
        {
            "status": 0
        }
    }
删除公共数据：
    url:
        http://123.56.103.24:8081/produce/delete/{pid}
    way:
         GET
               
合同信息：
    查询：
        url:
            http://123.56.106.24:8081/contract/get
        example:
            http://123.56.106.24:8081/contract/get?engineertime=2019&workunit=安装一队
        way:
            GET
        keys:
            {
                "engineertime":2019
                "workunit":"安装一队"
            }
        response:
            [
                {
                    "pid": 26,
                    "engineerName": "前大-乾安输油管道运行方式调改工程",
                    "numOfItem": "开调180036",
                    "constructionUnit": "松原采气厂",
                    "workUnit": "安装一队",
                    "engineerTime": 2019,
                    "contractNum": "JS2018-G09-JG-29-214",
                    "contractMoney": 110.72,
                    "signDate": "2017-09-14",
                    "startDate": "2017-09-14",
                    "endDate": "2018-12-30",
                    "performance": "正在履行"
                },
                {
                    "pid": 27,
                    "engineerName": "英台采油厂集输系统优化调整改造工程方3、英148、英101接转站改造地面工程",
                    "numOfItem": "开调170006",
                    "constructionUnit": "英台采油厂",
                    "workUnit": "安装一队",
                    "engineerTime": 2019,
                    "contractNum": "JS2017-G-04-JG-18-79",
                    "contractMoney": 3029.6,
                    "signDate": "2017-06-10",
                    "startDate": "2017-06-10",
                    "endDate": "2019-12-31",
                    "performance": "正在履行"
                },
                {
                    "pid": 28,
                    "engineerName": "集输系统汛后恢复生产工程",
                    "numOfItem": "防汛190012",
                    "constructionUnit": "新木采油厂",
                    "workUnit": "安装一队",
                    "engineerTime": 2019,
                    "contractNum": "JS2019-G-08-JG-15-69",
                    "contractMoney": 268.0,
                    "signDate": "2019-12-18",
                    "startDate": "2019-12-18",
                    "endDate": "2020-12-31",
                    "performance": "正在履行"
                }
            ]
    添加和修改：
         url:
              http://123.56.103.24:8081/contract/save
         way:
              POST
         参数：
            {
                "pid"："",                                //序号(保存的时候不需要，修改的时候需要)不可更改
                "engineerName":"新立联合站原油稳定地面工程",  //工程项目名称
                "numOfItem":"开调170001",                 //批件号
                "constructionUnit":"新立采油厂",           //建设单位
                "workUnit":"输电队",                       //施工单位
                "engineerTime":2020,                      //工程年份
                "contractNum":"JS2017-G-06-JG-4-12",      //合同编号
                "contractMoney":3183.27,                  //合同金额
                "signDate":"2017-02-25",                  //签订日期
                "startDate":"2017-02-25",                  //开工日期
                "endDate":"2018-11-30",                     //完工日期
                "performance":"正在履行"                    //履约情况
            }
    删除：
        url:
            http://123.56.103.24:8081/contract/delete/{pid}
        way:
             GET
            
分包信息：
    查询：
        url:
            http://123.56.106.24:8081/subcontract/get
        example:
            http://123.56.106.24:8081/subcontract/get?engineertime=2020&workunit=建设公司
        way:
             GET
        keys:
            {
                "engineertime":2019
                "workunit":"安装一队"
            }
        response:
            [
                {
                    "pid": 7,   
                    "engineerName": "探52等3个区块产能建设地面工程",
                    "numOfItem": "开能200054号",
                    "constructionUnit": "扶余采油厂",
                    "workUnit": "建设公司",
                    "engineerTime": 2020,
                    "wbs": "D1-19GX004.09",
                    "subcontractNo": "JW2019-W-14-JG-68-85补15",
                    "subcontractor": "松原市伟翔劳务工程有限公司",
                    "subcontractContent": "力工",
                    "subcontractingType": "力工劳务",
                    "signDate": "2020-07-08",
                    "startDate": "2020-07-22",
                    "endDate": "2020-07-26",
                    "contractMoney": 11.0,
                    "performance": "未履行",
                    "erpservicePurchaseOrderNumber": "1234567455664",
                    "app": 2.0,
                    "aabss": 3.0,
                    "saoss": "23"
                },
                {
                    "pid": 71,
                    "engineerName": ".....",
                    "numOfItem": "开能200054号",
                    "constructionUnit": "扶余采油厂",
                    "workUnit": "建设公司",
                    "engineerTime": 2020,
                    "wbs": "D1-19GX004.09",
                    "subcontractNo": "JW2019-W-14-JG-68-85补15",
                    "subcontractor": "松原市伟翔劳务工程有限公司",
                    "subcontractContent": "力工",
                    "subcontractingType": "力工劳务",
                    "signDate": "2020-07-08",
                    "startDate": "2020-07-22",
                    "endDate": "2020-07-26",
                    "contractMoney": 11.0,
                    "performance": "未履行",
                    "erpservicePurchaseOrderNumber": "1234567455664",
                    "app": 2.0,
                    "aabss": 3.0,
                    "saoss": "23"
                }
            ]
    添加和修改：
         url:
              http://123.56.106.24:8081/subcontract/save
         way:
              POST
         参数：
            {
                "pid":69,                           //序号（添加的时候不需要，修改的时候需要）
                "engineerName": "民105区块6口井地面", //工程项目名称
                "numOfItem": "开能200054号",         //批件号
                "constructionUnit": "扶余采油厂",    //建设单位
                "workUnit": "建设公司",              //施工单位
                "engineerTime": 2020,           //工程年份
                "wbs": "D1-19GX004.09",         //WBS元素
                "subcontractNo": "JW2019-W-14-JG-68-85补15", //分包合同编号
                "subcontractor": "松原市伟翔劳务工程有限公司",   //分包单位
                "subcontractContent": "力工",         //分包内容
                "subcontractingType": "力工劳务",   //分包类型
                "signDate": "2020-07-08",       //签订日期
                "startDate": "2020-07-22",      //开工日期
                "endDate": "2020-07-26",        //竣工日期
                "contractMoney": 11.0,          //合同金额（万元）
                "performance": "未履行",       //履约情况
                "erpservicePurchaseOrderNumber": "1234567455664",   //ERP服务采购订单号
                "saoss": "23",  //分包结算总金额
                "app": 2.0,     //累计支付进度款
                "aabss": 3.0    //分包结算前预提金额
            }
    删除：
        url:
            http://123.56.106.24:8081/subcontract/delete/74
        way:
            GET
                
结算信息：
    查询：
        url:
               http://123.56.106.24:8081/settlement/get
        example:
            http://123.56.106.24:8081/settlement/get?engineertime=0&workunit=安装一队                keys:
        way:
             GET
        keys:
            {
                "engineertime":0
                "workunit":"安装一队"
            }
            response:
                [
                    {
                        "pid": 2,
                        "engineerName": "英台采油厂分水器刺漏隐患治理工程",
                        "numOfItem": "开安190065",
                        "constructionUnit": "英台采油厂",
                        "workUnit": "安装一队",
                        "engineerTime": 2020,
                        "settlementPreparationAmount": 0.0,
                        "notReportedReview": "",
                        "reportConstructionUnit": "",
                        "reportBudgetDepartment": "",
                        "reportAudit": "",
                        "pendingAccountAfterAudit": "",
                        "account": "",
                        "postAuditAmount": 0.0,
                        "invoiceAmount": 0.0
                    },
                    {
                        "pid": 3,
                        "engineerName": "前大-乾安输油管道运行方式调改工程",
                        "numOfItem": "开调180036",
                        "constructionUnit": "松原采气厂",
                        "workUnit": "安装一队",
                        "engineerTime": 2020,
                        "settlementPreparationAmount": 0.0,
                        "notReportedReview": "",
                        "reportConstructionUnit": "",
                        "reportBudgetDepartment": "",
                        "reportAudit": "",
                        "pendingAccountAfterAudit": "",
                        "account": "",
                        "postAuditAmount": 0.0,
                        "invoiceAmount": 0.0
                    },
                    {
                        "pid": 4,
                        "engineerName": "注水系统更新工程",
                        "numOfItem": "注水180015",
                        "constructionUnit": "松原采气厂",
                        "workUnit": "安装一队",
                        "engineerTime": 2020,
                        "settlementPreparationAmount": 0.0,
                        "notReportedReview": "",
                        "reportConstructionUnit": "",
                        "reportBudgetDepartment": "",
                        "reportAudit": "",
                        "pendingAccountAfterAudit": "",
                        "account": "",
                        "postAuditAmount": 0.0,
                        "invoiceAmount": 0.0
                    },
                    {
                        "pid": 73,
                        "engineerName": "英台采油厂分水器刺漏隐患治理工程",
                        "numOfItem": "开安190065",
                        "constructionUnit": "英台采油厂",
                        "workUnit": "安装一队",
                        "engineerTime": 2020,
                        "settlementPreparationAmount": 0.0,
                        "notReportedReview": "",
                        "reportConstructionUnit": "",
                        "reportBudgetDepartment": "",
                        "reportAudit": "",
                        "pendingAccountAfterAudit": "",
                        "account": "",
                        "postAuditAmount": 0.0,
                        "invoiceAmount": 0.0
                    }
                ]
    添加和修改：
         url:
              http://123.56.106.24:8081/settlement/save
         way:
              POST
         参数：
            {
                "pid":70,                                       //序号（添加的时候不需要，修改的时候需要）
                "engineerName": "英台采油厂分水器刺漏隐患治理工程",     //工程项目名称
                "numOfItem": "开安190065",            //批件号
                "constructionUnit": "英台采油厂",        //建设单位
                "workUnit": "安装一队",         //施工单位
                "engineerTime": 2020,           //工程年份
                "settlementPreparationAmount": 0.0,     //结算编制金额(万元)
                "notReportedReview": "",    //未报审
                "reportConstructionUnit": "",   //报建设单位
                "reportBudgetDepartment": "",   //报概预算部
                "reportAudit": "",  //报审计
                "pendingAccountAfterAudit": "",  //审完待挂账
                "account": "",   //挂账
                "postAuditAmount": 0.0, //审后金额
                "invoiceAmount": 0.0     //发票金额
            }
    删除：
        url:
            http://123.56.106.24:8081/settlement/delete/74
        way:
             GET
            
预算信息：
    查询：
        url:
            http://123.56.106.24:8081/budget/get
        example:
            http://123.56.106.24:8081/budget/get?engineertime=2020&workunit=输电队        keys:
        way:
             GET
        keys:
            {
                "engineertime":2020
                "workunit":"输电队"
            }
        response:
            [
                {
                    "pid": 1,
                    "engineerName": "民37区块地面工程",
                    "numOfItem": "开能200037",
                    "constructionUnit": "新民采油厂",
                    "workUnit": "输电队",
                    "engineerTime": 2020,
                    "budgetMoney": 0.0,
                    "laborCost": 0.0,
                    "consumptionCost": 0.0,
                    "mechanicsCost": 0.0,
                    "takeCost": 0.0,
                    "finalBudget": 0.0,
                    "bmaterialCost": 0.0,
                    "amaterialCost": 0.0
                },
                {
                    "pid": 2,
                    "engineerName": "变压器及电缆改造工程",
                    "numOfItem": "安全190006",
                    "constructionUnit": "职教中心",
                    "workUnit": "输电队",
                    "engineerTime": 2020,
                    "budgetMoney": 156.55,
                    "laborCost": 4.11,
                    "consumptionCost": 2.58,
                    "mechanicsCost": 5.15,
                    "takeCost": 9.03,
                    "finalBudget": 156.55,
                    "bmaterialCost": 35.68,
                    "amaterialCost": 100.0
                },
                {
                    "pid": 3,
                    "engineerName": "非居民用户供电改造工程",
                    "numOfItem": "矿区190005",
                    "constructionUnit": "前郭矿区服务中心",
                    "workUnit": "输电队",
                    "engineerTime": 2020,
                    "budgetMoney": 372.19,
                    "laborCost": 6.23,
                    "consumptionCost": 2.38,
                    "mechanicsCost": 8.17,
                    "takeCost": 10.29,
                    "finalBudget": 372.19,
                    "bmaterialCost": 145.12,
                    "amaterialCost": 200.0
                }
            ]
    添加和修改：
         url:
              http://123.56.106.24:8081/budget/save
         way:
              POST
         参数：
            {
                "pid":87,       //序号（添加的时候不需要，修改的时候需要）
                "engineerName": "民37区块地面工程",    //工程项目名称
                "numOfItem": "开能200037",        //批件号
                "constructionUnit": "新民采油厂",    //建设单位
                "workUnit": "输电队",      //施工单位
                "engineerTime": 2020,       //工程年份
                "budgetMoney": 0.0,         //预算编制金额(万元)
                "laborCost": 0.0,           //人工费
                "consumptionCost": 0.0,     //消耗材料费
                "mechanicsCost": 0.0,       //机械费
                "takeCost": 0.0,            //取费
                "finalBudget": 0.0,         //调增后预算金额(万元)
                "bmaterialCost": 0.0,       //乙供主材费
                "amaterialCost": 100        //甲供主材费
            }
    删除：
        url:
            http://123.56.106.24:8081/budget/delete/88
        way:
            GET
            
生产信息：
    查询：
        url:
            http://123.56.106.24:8081/product/get
        example:
            http://123.56.106.24:8081/product/get?workunit=全部        
        way:
            GET
        keys:
            {
                "workunit":"全部"
            }
        response:
            [
                {
                    "pid": 1,
                    "engineerName": "输电队",
                    "numOfItem": "转结2项",
                    "workUnit": "",
                    "investMoney": 5077.84,
                    "startDate": "",
                    "endDate": "",
                    "planEndperiod": "",
                    "engineerMainMessage": "",
                    "thisWeekCompleteProcess": "",
                    "engineerTotalProcess": "",
                    "restProcess": "",
                    "nextWeekPlan": "",
                    "signPerformence": "",
                    "contractMoney": 1996.51,
                    "imageProcess": 0.0,
                    "remarks": "",
                    "fillingDate": "",
                    "hrequipment": ""
                },
                {
                    "pid": 2,
                    "engineerName": "转结工程",
                    "numOfItem": "",
                    "workUnit": "",
                    "investMoney": 5077.84,
                    "startDate": "",
                    "endDate": "",
                    "planEndperiod": "",
                    "engineerMainMessage": "",
                    "thisWeekCompleteProcess": "",
                    "engineerTotalProcess": "",
                    "restProcess": "",
                    "nextWeekPlan": "",
                    "signPerformence": "",
                    "contractMoney": 1996.51,
                    "imageProcess": 0.0,
                    "remarks": "",
                    "fillingDate": "",
                    "hrequipment": ""
                }
            ]
    添加和修改：
         url:
              http://123.56.106.24:8081/product/save
         way:
              POST
         参数：
            {
                "pid":88,               //序号（规则如上）
                "engineerName": "输电队",      //工程项目名称
                "numOfItem": "转结2项",        //批件号
                "workUnit": "",         //施工单位
                "investMoney": 5077.84,     //投资金额
                "startDate": "",        //开工如期
                "endDate": "",          //完工日期
                "planEndperiod": "",    //计划结算完成日期
                "engineerMainMessage": "",  //工程主要内容
                "thisWeekCompleteProcess": "",  //本周完成工程量
                "engineerTotalProcess": "",     //工程累计进展情况
                "restProcess": "",      //剩余工作量
                "nextWeekPlan": "",     //下周工作安排
                "signPerformence": "",  //合同签订情况(合同号)
                "contractMoney": 1996.51,       //合同金额(万元)
                "imageProcess": 0.0,    //形象进度(%)
                "remarks": "",      //备注
                "fillingDate": "",  //填报日期
                "hrequipment": "111"    //人力资源配备
            } 
    删除：
        url:
            http://123.56.106.24:8081/product/delete/88
        way:
             GET
        
统计信息：
    查询：
        url:
            http://123.56.106.24:8081/statistic/get
        example:
            http://123.56.106.24:8081/statistic/get?workunit=全部        
        way:
             GET
        keys:
            {
                "workunit":"全部"
            }
        response:
            [
                {
                    "pid": 2,
                    "engineerName": "上市单位合计",
                    "numOfItem": "",
                    "wbs": "",
                    "workUnit": "",
                    "startDate": "",
                    "endDate": "",
                    "measurementUnit": "",
                    "amountNum": 0,
                    "monthProduceVal": 764.5,
                    "monthAMaterial": 255.4,
                    "monthAdBeforeIncome": 509.1,
                    "monthAdBehindIncome": 0.0,
                    "yearProduceVal": 764.5,
                    "yearAMaterial": 255.4,
                    "yearAdBeforeIncome": 509.1,
                    "yearAdBehindIncome": 0.0,
                    "currentMonthProcess": "",
                    "totalProcess": "",
                    "fillingDate": ""
                },
                {
                    "pid": 3,
                    "engineerName": "扶余采油厂小计",
                    "numOfItem": "",
                    "wbs": "",
                    "workUnit": "",
                    "startDate": "",
                    "endDate": "",
                    "measurementUnit": "",
                    "amountNum": 0,
                    "monthProduceVal": 53.6,
                    "monthAMaterial": 26.0,
                    "monthAdBeforeIncome": 27.6,
                    "monthAdBehindIncome": 0.0,
                    "yearProduceVal": 53.6,
                    "yearAMaterial": 26.0,
                    "yearAdBeforeIncome": 27.6,
                    "yearAdBehindIncome": 0.0,
                    "currentMonthProcess": "",
                    "totalProcess": "",
                    "fillingDate": ""
                },
                {
                    "pid": 4,
                    "engineerName": "变压器及电缆改造工程",
                    "numOfItem": "开安190046",
                    "wbs": "D1-19GX128.09",
                    "workUnit": "输电队",
                    "startDate": "",
                    "endDate": "",
                    "measurementUnit": "",
                    "amountNum": 0,
                    "monthProduceVal": 5.0,
                    "monthAMaterial": 0.0,
                    "monthAdBeforeIncome": 5.0,
                    "monthAdBehindIncome": 0.0,
                    "yearProduceVal": 5.0,
                    "yearAMaterial": 0.0,
                    "yearAdBeforeIncome": 5.0,
                    "yearAdBehindIncome": 0.0,
                    "currentMonthProcess": "",
                    "totalProcess": "",
                    "fillingDate": "2020-05-27"
                },
                {
                    "pid": 5,
                    "engineerName": "长109区块144口井地面工程",
                    "numOfItem": "开能190081",
                    "wbs": "D1-19GX050.09",
                    "workUnit": "输电队",
                    "startDate": "",
                    "endDate": "",
                    "measurementUnit": "",
                    "amountNum": 0,
                    "monthProduceVal": 28.6,
                    "monthAMaterial": 26.0,
                    "monthAdBeforeIncome": 2.6,
                    "monthAdBehindIncome": 0.0,
                    "yearProduceVal": 28.6,
                    "yearAMaterial": 26.0,
                    "yearAdBeforeIncome": 2.6,
                    "yearAdBehindIncome": 0.0,
                    "currentMonthProcess": "单井配电3口。",
                    "totalProcess": "架设10kv线路0.2km，安装变压器平台50kva/2座，63kva/1座，单井配电3口。施18276-电01",
                    "fillingDate": "2020-05-27"
                }
            ]
    添加和修改：
         url:
              http://123.56.106.24:8081/statistic/save
         way:
              POST
         参数：
            {
                "pid": 89,      //序号（如上）
                "engineerName": "上市单位合计",   //工程项目名称
                "numOfItem": "",        //批件号
                "wbs": "",      //wbs元素
                "workUnit": "",     //施工单位
                "startDate": "",    //开工日期
                "endDate": "",      //完工日期
                "measurementUnit": "",  //计量单位
                "amountNum": 0,     //数量
                "monthProduceVal": 764.5,   //本月产值
                "monthAMaterial": 255.4,    //本月甲供材
                "monthAdBeforeIncome": 509.1,   //本月调前收入
                "monthAdBehindIncome": 0.0,     //本月调后收入
                "yearProduceVal": 764.5,        //本年度产值
                "yearAMaterial": 255.4,         //本年甲供材
                "yearAdBeforeIncome": 509.1,    //本年调前收入
                "yearAdBehindIncome": 0.0,      //本年调后收入
                "currentMonthProcess": "",      //本月完成主要工作内容
                "totalProcess": "",             //累计主要工作内容
                "fillingDate": ""               //填报日期
            }
    删除：
        url:
            http://123.56.106.24:8081/statistic/delete/88
        way:
            GET
            
成本信息：
    查询：
        url:
            http://123.56.106.24:8081/cost/get
        example:
            http://123.56.106.24:8081/cost/get?workunit=全部       
        way:
            GET
        keys:
            {
                "workunit":"全部"
            }
        response:
            [
                {
                    "pid": 1,
                    "engineerName": "前48站污水处理系统改造工程",
                    "numOfItem": "开调180073",
                    "workUnit": "输电队",
                    "engineerIncome": 7.0,
                    "transpotCost": 0.0,
                    "fuelCost": 0.0,
                    "laborSubcontracting": 0.0,
                    "earthworkServices": 0.0,
                    "antiCorrosionService": 0.0,
                    "localEarthwork": 0.0,
                    "mechanicServices": 0.0,
                    "professionalSubcontracting": 0.0,
                    "otherSubcontracting": 0.0,
                    "anticorrosionTeamCost": 0.0,
                    "municipalAdministration": 0.0,
                    "other": 0.0,
                    "marginalProfit": 6.97,
                    "marginalProfitRate": 99.57,
                    "fillingDate": "2020-06-30",
                    "ansanAntiCorrosionAndPrefabrication": 0.0,
                    "costAdjustment": 0.0,
                    "costTotal": "0.03",
                    "bmaterial": "0.03",
                    "metalWorkshopCost": 0.0
                },
                {
                    "pid": 2,
                    "engineerName": "新北区块35口井地面工程",
                    "numOfItem": "开能200027",
                    "workUnit": "输电队",
                    "engineerIncome": 17.0,
                    "transpotCost": 0.06,
                    "fuelCost": 0.0,
                    "laborSubcontracting": 0.09,
                    "earthworkServices": 0.16,
                    "antiCorrosionService": 0.0,
                    "localEarthwork": 0.0,
                    "mechanicServices": 0.0,
                    "professionalSubcontracting": 0.0,
                    "otherSubcontracting": 0.0,
                    "anticorrosionTeamCost": 0.0,
                    "municipalAdministration": 0.0,
                    "other": 0.0,
                    "marginalProfit": 2.43,
                    "marginalProfitRate": 14.29,
                    "fillingDate": "2020-06-30",
                    "ansanAntiCorrosionAndPrefabrication": 0.0,
                    "costAdjustment": 0.0,
                    "costTotal": "14.57",
                    "bmaterial": "14.26",
                    "metalWorkshopCost": 0.0
                }
            ]
    添加和修改：
         url:
              http://123.56.106.24:8081/cost/save
         way:
              POST
         参数：
            {
                "pid": 89,      //序号（如上）
                "engineerName": "前48站污水处理系统改造工程",   //工程项目名称
                "numOfItem": "开调180073",    //批件号
                "workUnit": "输电队",          //施工单位
                "engineerIncome": 7.0,          //工程收入
                "transpotCost": 0.0,        //运费
                "fuelCost": 0.0,            //燃料费
                "laborSubcontracting": 0.0,     //劳工分包
                "earthworkServices": 0.0,       //土方分包
                "antiCorrosionService": 0.0,    //防腐劳务
                "localEarthwork": 0.0,          //地方土方
                "mechanicServices": 0.0,        //技工劳务
                "professionalSubcontracting": 0.0,      //专业分包
                "otherSubcontracting": 0.0,     //其他分包
                "anticorrosionTeamCost": 0.0,   //防腐队费用
                "municipalAdministration": 0.0,     //市政
                "other": 0.0,                   //其他
                "marginalProfit": 6.97,         //边际利润
                "marginalProfitRate": 99.57,    //边际利润率
                "fillingDate": "2020-06-30",    //填报日期
                "ansanAntiCorrosionAndPrefabrication": 0.0,     //安三防腐及预制
                "costAdjustment": 0.0,      //成本调整
                "costTotal": "0.03",        //成本合计
                "bmaterial": "0.03",        //乙供材
                "metalWorkshopCost": 0.0    //金属车间费用
            }
    删除：
        url:
            http://123.56.106.24:8081/cost/delete/88
        way:
            GET
            
汇总信息：
    查询：
        url:
            http://123.56.106.24:8081/summary/get
        example:
            http://123.56.106.24:8081/summary/get?workunit=输电队&isfin=是      
        way:
            GET
        keys:
            {
                "workunit":"全部"，
                "isfin":"全部"
            }
        response:
        (汇总信息的字段在前面八个接口中都有，部分重复字段前面添加了不同信息的头，
        例如：合同信息中的签订日期和分包信息中的签订日期分别为：
        contractSignDate和subcontractSignDate)
            [
                {
                    "pid": 1,
                    "engineerName": "变压器及电缆改造工程",
                    "constructionUnit": "扶余采油厂",
                    "numOfItem": "开安190046",
                    "investMoney": 464.52,
                    "workUnit": "输电队",
                    "isFin": "是",
                    "contractNum": "JS2019-G-02-JG-14-44",
                    "contractMoney": 450.72,
                    "signDate": "2019-08-23",
                    "contractStartDate": "2019-08-23",
                    "contractEndDate": "2020-12-31",
                    "budgetMoney": 62.13,
                    "laborCost": 2.18,
                    "consumptionCost": 0.58,
                    "mechanicsCost": 1.23,
                    "takeCost": 5.98,
                    "workStartDate": null,
                    "workEndDate": null,
                    "planEndperiod": null,
                    "engineerMainMessage": "变压器11台，真空断路器3台，气体绝缘进线柜 2台，AP配电箱1台 ",
                    "thisWeekCompleteProcess": null,
                    "engineerTotalProcess": null,
                    "restProcess": null,
                    "nextWeekPlan": null,
                    "monthProduceVal": 10.0,
                    "monthAMaterial": 4.0,
                    "monthAdBeforeIncome": 6.0,
                    "monthAdBehindIncome": 0.0,
                    "yearProduceVal": 15.0,
                    "yearAMaterial": 4.0,
                    "yearAdBeforeIncome": 11.0,
                    "yearAdBehindIncome": 0.0,
                    "transpotCost": 0.25,
                    "fuelCost": 0.0,
                    "laborSubcontracting": 0.0,
                    "earthworkServices": 0.0,
                    "antiCorrosionService": 0.0,
                    "localEarthwork": 0.0,
                    "mechanicServices": 0.0,
                    "professionalSubcontracting": 0.0,
                    "otherSubcontracting": 0.0,
                    "anticorrosionTeamCost": 0.0,
                    "municipalAdministration": 0.0,
                    "other": 0.0,
                    "marginalProfit": -65.38,
                    "marginalProfitRate": -594.36,
                    "settlementPreparationAmount": null,
                    "notReportedReview": null,
                    "reportConstructionUnit": null,
                    "reportBudgetDepartment": null,
                    "reportAudit": null,
                    "pendingAccountAfterAudit": null,
                    "account": null,
                    "postAuditAmount": null,
                    "invoiceAmount": null,
                    "subcontractNo": "JW2019-W-14-JG-68-85补19",
                    "subcontractor": "吉林省源丰建筑劳务有限公司",
                    "subcontractContent": "力工",
                    "subcontractingType": "力工劳务",
                    "subcontractSignDate": "2019-01-30",
                    "startDate": "2019-01-30",
                    "endDate": "2019-12-31",
                    "subcontractContractMoney": 27.0,
                    "performance": "2",
                    "erpservicePurchaseOrderNumber": null,
                    "app": 0.0,
                    "aabss": 0.3,
                    "saoss": "0.26",
                    "costTotal": "76.38",
                    "bmaterial": "76.13",
                    "metalWorkshopCost": 0.0,
                    "ansanAntiCorrosionAndPrefabrication": 0.0,
                    "costAdjustment": 0.0,
                    "hrequipment": null,
                    "amaterialCost": 38.0,
                    "bmaterialCost": 14.16
                },
                {
                    "pid": 2,
                    "engineerName": "长109区块144口井地面工程",
                    "constructionUnit": "扶余采油厂",
                    "numOfItem": "开能190081",
                    "investMoney": 3450.0,
                    "workUnit": "输电队",
                    "isFin": "是",
                    "contractNum": "JS2019-G-02-JG-1-13（补3）",
                    "contractMoney": 2669.7,
                    "signDate": "2019-01-01",
                    "contractStartDate": "2019-01-01",
                    "contractEndDate": "2019-12-31",
                    "budgetMoney": 61.0,
                    "laborCost": 4.12,
                    "consumptionCost": 1.56,
                    "mechanicsCost": 3.52,
                    "takeCost": 11.2,
                    "workStartDate": null,
                    "workEndDate": null,
                    "planEndperiod": null,
                    "engineerMainMessage": "柱上变压器63台10KV线路12.6千米及109站",
                    "thisWeekCompleteProcess": null,
                    "engineerTotalProcess": null,
                    "restProcess": null,
                    "nextWeekPlan": null,
                    "monthProduceVal": 2.0,
                    "monthAMaterial": 1.0,
                    "monthAdBeforeIncome": 1.0,
                    "monthAdBehindIncome": 0.0,
                    "yearProduceVal": 30.6000003814697,
                    "yearAMaterial": 27.0,
                    "yearAdBeforeIncome": 3.59999990463257,
                    "yearAdBehindIncome": 0.0,
                    "transpotCost": 1.77,
                    "fuelCost": 0.0,
                    "laborSubcontracting": 0.44,
                    "earthworkServices": 0.8,
                    "antiCorrosionService": 0.0,
                    "localEarthwork": 0.0,
                    "mechanicServices": 0.0,
                    "professionalSubcontracting": 0.0,
                    "otherSubcontracting": 0.0,
                    "anticorrosionTeamCost": 0.0,
                    "municipalAdministration": 0.0,
                    "other": 0.0,
                    "marginalProfit": -2.27,
                    "marginalProfitRate": -63.06,
                    "settlementPreparationAmount": null,
                    "notReportedReview": null,
                    "reportConstructionUnit": null,
                    "reportBudgetDepartment": null,
                    "reportAudit": null,
                    "pendingAccountAfterAudit": null,
                    "account": null,
                    "postAuditAmount": null,
                    "invoiceAmount": null,
                    "subcontractNo": "JW2019-W-14-JG-68-85补19",
                    "subcontractor": "吉林省源丰建筑劳务有限公司",
                    "subcontractContent": "力工",
                    "subcontractingType": "力工劳务",
                    "subcontractSignDate": "2019-01-30",
                    "startDate": "2019-01-30",
                    "endDate": "2019-12-31",
                    "subcontractContractMoney": 27.0,
                    "performance": "2",
                    "erpservicePurchaseOrderNumber": null,
                    "app": 0.0,
                    "aabss": 3.1,
                    "saoss": "3.05",
                    "costTotal": "5.87",
                    "bmaterial": "2.86",
                    "metalWorkshopCost": 0.0,
                    "ansanAntiCorrosionAndPrefabrication": 0.0,
                    "costAdjustment": 0.0,
                    "hrequipment": null,
                    "amaterialCost": 5.0,
                    "bmaterialCost": 35.6
                }
            ]
            
时间性分析：
    查询：
        url:
            http://123.56.106.24:8081/timeanalysis/get
        example:
            http://123.56.106.24:8081/timeanalysis/get?engineertime=2020      
        way:
            GET
        keys:
            {
                "engineertime":2020
            }
        response:
            [
                {
                    "pid": 1,   //序号
                    "engineerName": "2018年第一批更新改造工程",   //工程项目名称
                    "numOfItem": "开调180057",    //批件号
                    "workUnit": "输电队",      //施工单位
                    "engineerTime": 2020,       //工程年份
                    "isPostContract": "否",      //是否事后合同
                    "isAbnormalSubcontractDate": "是",       //分包合同信息异常
                    "isSettlementLaggingBehind": "否"    //结算是否滞后
                },
                {
                    "pid": 2,
                    "engineerName": "前48区块16口井地面工程",
                    "numOfItem": "开能180074",
                    "workUnit": "输电队",
                    "engineerTime": 2020,
                    "isPostContract": "是",
                    "isAbnormalSubcontractDate": "是",
                    "isSettlementLaggingBehind": "否"
                }
            ]
            
数值性分析：
    查询：
        url:
            http://123.56.106.24:8081/dataanalysis/get
        example:
            http://123.56.106.24:8081/dataanalysis/get?engineertime=2020      
        way:
            GET
        keys:
            {
                "engineertime":2020
            }
        response:
            [
                {
                    "pid": 1,       //序号
                    "engineerName": "2018年第一批更新改造工程",   //工程项目名称
                    "numOfItem": "开调180057",    //批件号
                    "workUnit": "输电队",      //施工单位
                    "engineerTime": 2020,       //工程年份
                    "isAbnormalIncome": "是",    //收入异常
                    "isAbnormalMarginalProfit": "否",    //边际利润异常
                    "isAbnormalMaterialCost": "否"   //材料费异常
                },
                {
                    "pid": 2,
                    "engineerName": "前48区块16口井地面工程",
                    "numOfItem": "开能180074",
                    "workUnit": "输电队",
                    "engineerTime": 2020,
                    "isAbnormalIncome": "是",
                    "isAbnormalMarginalProfit": "否",
                    "isAbnormalMaterialCost": "否"
                }
            ]
     
登录：
    登录：
        url:
            http://123.56.106.24:8081/login/login
        way:
            POST
        keys:
            {
                "userName":"admin",
                "password":"hyj123",
                "loginName":"管理员",
                "loginIP":"192.168.11.1",
                "loginMachineName":"DESKTOP-B56SP8B"
            }
        response:
            {
                "status": -1 //用户名或者密码不正确
            }
            或者
            {
                "status": 1//登录成功
            }
    修改密码：
         url:
             http://123.56.106.24:8081/login/update
         way:
             POST
         keys:
             {
                 "userName":"admin",
                 "password":"hyj123",
                 "newPassword":"hyj123"
             }
         response:
             {
                 "status": -1 //用户名或者密码不正确
             }
             或者
             {
                 "status": 1//修改成功
             }       
             
建设单位类型：
    查询：
        url:
            http://123.56.106.24:8081/conunittype/get       
        way:
            GET
        response:
            见软件postman
    修改：
         url:
              http://123.56.106.24:8081/conunittype/save
         way:
              POST
         参数：
            {
                "pid": 1,   //序号，此功能模块只有修改，序号必须传递
                "rankNum":"01", //排序
                "constructionName":"上市单位",  //名称
                "remarks":"",   //备注
                "isUsed":"是"    //是否可用
            }
            
建设单位管理：
    查询：
        url:
            http://123.56.106.24:8081/conunitmanage/get
        example:
            http://123.56.106.24:8081/conunitmanage/get?unittype=上市单位&unitname=红岗       
        way:
            GET
        keys:
            {
                "unittype":"上市单位",   //下拉框传递，默认为全部
                "unitname":"红岗"        //模糊查询，用户输入什么文字传递什么文字，如果不输入传递空字符串
            }
        response:
            见软件postman
    添加和修改：
         url:
              http://123.56.106.24:8081/conunitmanage/savee
         way:
              POST
         参数：
            {
                "pid": 156,     //序号，添加是不需要，修改时必须存在
                "rankNum":"100",    //排序
                "unitType":"外部市场",  //单位类型
                "unitName":"无敌采油厂", //单位名称
                "remarks":"",   //备注
                "isUsed":"是"    //是否可用
            }
    删除：
            url:
                http://123.56.106.24:8081/conunitmanage/delete/201
            way:
                GET
                
分包类型管理：
    查询：
        url:
            http://123.56.106.24:8081/subtypemanage/get       
        way:
            GET
        response:
            见软件postman
    修改：
         url:
              http://123.56.106.24:8081/subtypemanage/save
         way:
              POST
         参数：
             {
                 "pid": 1,  //序号，此功能模块只有修改，序号必须传递
                 "rankNum": "001",  //排序
                 "subcontractName": "力工劳务", //名称
                 "remarks": "11111",    //备注
                 "isUsed": "是"  //是否可用
             }
            
分包单位管理：
    查询：
        url:
            http://123.56.106.24:8081/subunitmanage/get
        example:
            http://123.56.106.24:8081/subunitmanage/get?unitname=有限公司       
        way:
            GET
        keys:
            {
                "unitname":"红岗"        //模糊查询，用户输入什么文字传递什么文字，如果不输入传递空字符串
            }
        response:
            见软件postman
    添加和修改：
         url:
              http://123.56.106.24:8081/conunitmanage/savee
         way:
              POST
         参数：
             {
                 "pid": 1,  //序号，添加是不需要，修改时必须存在
                 "unitName": "乾安县天成建筑工程有限公司",   //单位名称
                 "remarks": "11111",    //备注
                 "isUsed": "是"  //是否可用
             }
    删除：
            url:
                http://123.56.106.24:8081/subunitmanage/delete/202
            way:
                GET            
                
是否编码管理：
    查询：
        url:
            http://123.56.106.24:8081/codemanage/get       
        way:
            GET
        response:
            见软件postman
    修改：
         url:
              http://123.56.106.24:8081/subtypemanage/save
         way:
              POST
         参数：
            {
                "pid": 1,   //序号，此功能模块只有修改，序号必须传递
                "codeName": "否",    //名称
                "remarks": "",  //备注
                "isUsed": "是"   //是否可用
            }               
            
履行情况管理：
    查询：
        url:
            http://123.56.106.24:8081/performancemanage/get       
        way:
            GET
        response:
            见软件postman
    修改：
         url:
              http://123.56.106.24:8081/performancemanage/save
         way:
              POST
         参数：
            {
                "pid": 1,   //序号，此功能模块只有修改，序号必须传递
                "rankNum": "01",    //排序
                "performanceName": "未履行",   //名称
                "remarks": "",  //备注
                "isUsed": "是"   //是否可用
            }                          
            
部门管理：
    查询：
        url:
            http://123.56.106.24:8081/department/get      
        way:
            GET
        response:
            见软件postman
    添加和修改：
         url:
              http://123.56.106.24:8081/department/save
         way:
              POST
         参数：
            {
                "pid":"171",    //序号，添加是不需要，修改时必须存在
                "unitName":"预结算管理中心",   //单位类型
                "remarks":"",   //备注
                "internalParameters":"" //内部参数
            }
    删除：
            url:
                http://123.56.106.24:8081/department/delete/204
            way:
                GET
                
人员管理：
    查询：
        url:
            http://123.56.106.24:8081/people/get      
        way:
            GET
        response:
            见软件postman
    根据单位类型查询：
        url:
            http://localhost:8081/people/getone/{units}
        example:
            http://localhost:8081/people/getone/防腐队
        way:
            GET
        response:
            见软件postman
    添加和修改：
         url:
              http://123.56.106.24:8081/people/save
         way:
              POST
         参数：
            {
                "pid":179,  //序号，添加是不需要，修改时必须存在
                "ppName":"安装一队统计员",     //姓名
                "userName":"azyd-tj01",     //用户名
                "gender":"男",       //性别
                "canUse":"是",       //可用
                "telNum":"1336699156320",   //移动电话
                "rankNum":"00005",      //排序
                "userRole":"基层单位统计员",   //用户角色
                "remarks":"",   //备注
                "affiliatedUnits":"安装一队"    //所在组织
            }
    删除：
            url:
                http://123.56.106.24:8081/people/delete/300
            way:
                GET
         
编码列表：
    查询：
        url:
            http://123.56.106.24:8081/codelist/get
        example:
            http://123.56.106.24:8081/codelist/get?codename=单位
        way:
            GET
        keys:
            {
                "codename":"单位"        //模糊查询，用户输入什么文字传递什么文字，如果不输入传递空字符串
            }      
        response:
            见软件postman
    添加和修改：
         url:
              http://123.56.106.24:8081/codelist/save
         way:
              POST
         参数：
            {
                "pid":"192",    //序号，添加是不需要，修改时必须存在
                "codeName": "表单目录", //编码名称
                "sqlSetence": "select 0 as xrownum,a.* from t_wp_folder a where a.isdelete=0 order by a.name",  //SQL语句
                "topSelect": "是",   //顶部查询
                "exportModel": "通用模板.xlsx"  //导出模板
            }
    删除：
            url:
                http://123.56.106.24:8081/codelist/delete/302
            way:
                GET         
        
编码样式：
    查询：
        url:
            http://123.56.106.24:8081/codestyle/get
        example:
            http://123.56.106.24:8081/codestyle/get?codestyle=表单目录      
        way:
            GET
        keys:
            {
                "codestyle":"表单目录"
            }
        response:
            见软件postman
    修改：
         url:
              http://123.56.106.24:8081/codestyle/save
         way:
              POST
         参数：
            {
                "pid":199,  //序号，此功能模块只有修改，序号必须传递
                "columnField":"isdelete",   //列字段
                "columnTitle":"是否删除",   //列标题
                "columnWidth":80,       //列宽
                "alignment":"居左对齐",     //对齐方式
                "dataType":"文本",    //数据类型
                "isSeen":"否",   //是否可见
                "isLock":"否",   //是否锁定
                "isEdit":"否",   //是否编辑
                "checkBox":"否", //复选框
                "selectCondition":"否",  //查询条件
                "conditionWidth":120,   //条件宽度
                "listSetences":"",  //列表语句
                "codeName":"分包类型"   //编码名称
            }
            
操作日志：
    查询：
        url:
            http://123.56.106.24:8081/oprationlog/get      
        way:
            GET
        response:
            见软件postman
            
登录日志：
    查询：
        url:
            http://123.56.106.24:8081/loginlog/get      
        way:
            GET
        response:
            见软件postman
            
活动用户：
    查询：
        url:
            http://123.56.106.24:8081/activeuser/get      
        way:
            GET
        response:
            见软件postman
            
公告管理：
    查询全部公告：
        url:
            http://123.56.106.24:8081/bulletinmaintenance/getall
        way:
            GET     
        response:
            见软件postman
    根据ID查询单个公告：
        url:
            http://123.56.106.24:8081/bulletinmaintenance/getcontent/{pid}        
        example:
            http://123.56.106.24:8081/bulletinmaintenance/getcontent/92
        response:
            见软件postman
    添加和修改：
         url:
              http://123.56.106.24:8081/bulletinmaintenance/save
         way:
              POST
         参数：
            {
                "title":"公告测试", //标题
                "isSeen":"是",   //是否可见
                "isTop":"否",    //是否置顶
                "visibleRange":"全部",    //可见范围
                "releaseTime":"2020-09-26 09:18:01",    //发布时间
                "releasePeople":"管理员",  //发布人
                "readTime":"0",     //阅读次数
                "bulletinContent":"我是一只小青蛙，呱呱呱呱呱"   //公告内容
            }
    删除：
            url:
                http://123.56.106.24:8081/bulletinmaintenance/delete/303
            way:
                GET         