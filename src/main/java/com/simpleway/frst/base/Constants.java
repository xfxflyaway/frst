/**
 * @ProjectName: yt-weixin-pay-app Copyright (c) @2015,重庆云途交通科技有限公司.版权所有
 */
package com.simpleway.frst.base;

/**
 * 常量类
 * 
 * @author zhaoyu
 * @since TODO 从哪个项目版本开始创建
 * @Date 2017年2月8日
 */
public class Constants {

	public static final Integer RESULT_CODE_SUCCESS = 1;
	public static final String RESULT_MSG_SUCCESS = "success";
	public static final Integer RESULT_CODE_ERROR = 0;
	public static final String RESULT_MSG_ERROR = "error";
	public static final Integer FAIL = -1;
	public static final Integer SUCCESS = 0;

	public static final Integer YES = 1;

	public static final Integer NO = 0;

	public static final String CODE_STRING = "code";
	public static final String DATA_STRING = "data";
	public static final String MSG_STRING = "msg";
	
	public static final Integer STATE_VALID = 1;
	public static final Integer STATE_FAIL = 0;
	
	
	/**
	 * 删除标志位
	 */
	public static final String DELETE_FLAG_VALID = "Y";
	public static final String DELETE_FLAG_INVALID = "N";
	
	
	
	/**
	 * 用户注册来源配置
	 */
	public static final Integer WX_RESOURCE = 1;
	public static final Integer APP_RESOURCE = 2;
	public static final Integer ELSE_RESOURCE = 3;
	
	/**
	 * 运营商code
	 */
	public static final String OPERATORCODE_UNICOM = "UNICOM";  //联通
	public static final String OPERATORCODE_CMCC = "CMCC";   //移动
	public static final String OPERATORCODE_TELECOM = "TELECOM";  //电信
	
	/**
	 * 卡激活停机标志位
	 */
	public static final String CARD_ACTIVE = "ACTIVATED_NAME";  //激活标志位
	public static final String CARD_STOP = "DEACTIVATED_NAME"; //停机标志位
	
	/**
	 * 卡绑定和解绑标志位信息
	 * 
	 */
	public static final String CARD_BIND_FLAG = "1";  //卡绑定
	public static final String CARD_UNBIND_FLAG = "2";  //卡解绑
	
	/**
	 * 订单支付状态配置
	 * 
	 */
	public static final Integer ORDER_STATE_UNPAY = 0; //未支付
	public static final Integer ORDER_STATE_PAY = 1;  //已支付
	public static final Integer ORDER_STATE_CANCEL = 2; //作废
	
	/**
	 * 消息处理标志位
	 */
	public static final Integer MESSAGE_STATE_UNHANDLER = 0;  //未处理消息
	public static final Integer MESSAGE_STATE_HANDLER = 1;   //已处理消息
	
	
	/**
	 * 日期格式
	 */
	public static final String DATE_SECOND = "yyyy-MM-dd HH:mm:ss";  //带小时分钟秒的格式
	public static final String DATE_DAY = "yyyy-MM-dd"; //只带日期的格式

	/**
	 * 套餐价格配置信息，套餐销售状态为开启
	 */
	public static final Integer PACK_PRICE_ABLED = 1;
	/**
	 * 套餐价格配置信息，套餐销售状态为停用
	 */
	public static final Integer PACK_PRICE_DISABLED = 0;

	/**
	 * 订单支付类型-积分支付
	 */
	public static Integer ORDER_PAYTYPE_POINT = 3;
	/**
	 * 订单支付类型-支付宝支付
	 */
	public static Integer ORDER_PAYTYPE_ALIPAY = 2;
	/**
	 * 订单支付类型-微信支付
	 */
	public static Integer ORDER_PAYTYPE_WEIXIN = 1;

	/**
	 * 订单类型-套餐
	 */
	public static Integer ORDER_TYPE_PACK = 1;
	/**
	 * 订单类型-流量包
	 */
	public static Integer ORDER_TYPE_FLOW = 2;

	/**
	 * 流量卡平台-卡信息查询接口
	 */
	public static final String CARDPLATFORM_URL_GETCARDINFO = "card/getCardInfo";
	/**
	 * 流量卡平台-卡信息查询接口（实时）
	 */
	public static final String CARDPLATFORM_URL_GETTIMELYCARDINFO = "card/getTimelyCardInfo";
	/**
	 * 流量卡平台-套餐信息查询接口
	 */
	public static final String CARDPLATFORM_URL_GETPACKAGEINFO = "package/getPackageInfo";
	/**
	 * 流量卡平台-加油包流量使用信息查询接口
	 */
	public static final String CARDPLATFORM_URL_GETCARDADDUSEDFLOW = "card/getCardAddUsedFlow";
	/**
	 * 流量卡平台-加油包流量使用信息查询接口（实时）
	 */
	public static final String CARDPLATFORM_URL_GETTIMELYCARDADDUSEDFLOW = "card/getTimelyCardAddUsedFlow";
	/**
	 * 流量卡平台-流量卡套餐实例信息查询接口
	 */
	public static final String CARDPLATFORM_URL_GETCARDPACKINSTS = "card/getCardPackInsts";
	/**
	 * 流量卡平台-流量卡套餐实例信息查询接口（实时）
	 */
	public static final String CARDPLATFORM_URL_GETTIMELYCARDPACKINSTS = "card/getTimelyCardPackInsts";
	/**
	 * 流量卡平台-购买主套餐接口
	 */
	public static final String CARDPLATFORM_URL_CARDBUYPACKAGE = "card/cardBuyPackage";
	
	public static final String CARDPLATFORM_URL_BUYMAINPACKAGE = "card/cardBuyMainPackage";
	/**
	 * 流量卡平台-变更主套餐接口
	 */
	public static final String CARDPLATFORM_URL_CHANGEMAINPACKAGE = "card/cardChangeMainPackage";
	/**
	 * 流量卡平台-购买加油包接口
	 */
	public static final String CARDPLATFORM_URL_BUYADDPACKAGE = "card/cardBuyAddPackage";
	/**
	 * 流量卡平台-套餐信息列表查询接口（通过状态、运营商、套餐类型查询对应套餐列表）
	 */
	public static String CARDPLATFORM_URL_QUERYPACKAGEINFO = "package/queryPackageInfo";
	/**
	 * 订单状态查询接口
	 */
	public static String CARDPLATFORM_URL_GETORDERSTATUS = "order/getOrderStatus";
	/**
	 * 流量卡月使用记录查询接口
	 */
	public static String CARDPLATFORM_URL_GETCARDMONTHFLOW = "report/getCardMonthFlow";
	/**
	 * 流量卡月使用记录批量查询接口
	 */
	public static String CARDPLATFORM_URL_GETBATCHCARDMONTHFLOW = "report/getBatchCardMonthFlow";

	// 订单支付状态【 0：未支付 1：已支付 2: 已作废】
	/**
	 * 未支付
	 */
	public static final Integer ORDER_PAY_STATE_UNPAID = 0;
	/**
	 * 已支付
	 */
	public static final Integer ORDER_PAY_STATE_PAID = 1;
	/**
	 * 已作废
	 */
	public static final Integer ORDER_PAY_STATE_OBSOLETE = 2;
	/**
	 * 取消支付
	 */
	public static Integer ORDER_PAY_STATE_CANCEL = 3;

	// 开通状态【0：未开通 1：已开通 2：开通失败】
	/**
	 * 未开通
	 */
	public static final Integer ORDER_OPEN_STATE_UNOPEN = 0;
	/**
	 * 已开通
	 */
	public static final Integer ORDER_OPEN_STATE_OPENED = 1;
	/**
	 * 开通失败
	 */
	public static final Integer ORDER_OPEN_STATE_OPENFAIL = 2;

	/**
	 * 开通中
	 */
	public static final Integer ORDER_OPEN_STATE_OPENING = 3;

	public static final String CARDNOTIFY = "send/cardSendNotify";  //发卡通知
	public static final String CARDBIND = "card/cardBind";  //绑定解绑
	public static final String CARDSEDNAPPLY = "send/cardSendApply"; // 发卡申请
	public static final String CARDSENDRESULT = "send/cardSendResultNotify";// 发卡结果通知卡平台
	public static final String PAGECARDUSEDFLOWS = "card/pageCardUsedFlows"; // 用户卡流量使用状态url
	public static final String BATCHCARDURL = "card/getBatchCardInfo"; // 批量查询套餐url
	public static final String CARDPLATFORM_URL_GETCARDPACKINSTS_TIME = "card/getTimelyCardPackInsts";
	public static final String ONECARDINFO = "card/getCardInfo";// 单卡查询
	public static final int BATCHCARDURLTIMEOUT = 5000; // 批量查询套餐超时时间
	public static final String CARDSTOPANDSTART = "card/cardStopOpen"; // 停复机接口
	public static final String OPERATORID = "operatorId"; // 运营商ＩＤ（联通，电信，移动）
	public static final String OPERATORCODE = "operatorCode"; // 运营商CODE（联通：UNICOM，移动：CMCC，电信：TELECOM）
	public static final String STATUS = "status"; // 卡状态0 无效 1 有效，流量卡套餐筛选状态 0无效
													// 1有效
	public static final String ISSTOP = "isStop"; // 卡状态-是否停机 1 是 0 否
	public static final String ISAMOUNT = "isAmount"; // 卡状态-是否达量断网 1 是 0 否
	public static final String ISOFFNET = "isOffnet"; // 卡状态-是否单独断网
	public static final String SENDBATCH = "sendBatch"; // 卡配置批次号
	public static final String SENDRESULT = "sendResult"; // 卡配置结果/返回前端出库结果
	public static final String SENDRESULTDESC = "sendResultDesc"; // 出库结果描述
	public static final String SENDNUM = "sendNum"; // 卡发放总条数
	public static final String PACKEXPIRYS = "packExpirys"; // 运营平台套餐有效期
	public static final String PACKID = "packId"; // 运营平台套餐id
	public static final String EXPACKINSTID = "exPackInstId";// 运营平台套餐实例id
	public static final String PACKSTATUS = "status";// 套餐状态
	public static final String PACKCYCLEFLOW = "packCycleFlow";// 套餐账期流量
	public static final String PACKACCOUNTDATE = "packAccountDate";// 套餐启用时间
	public static final String PACKCYCLEDATE = "packCycleDate";// 套餐到期时间
	public static final String FLOWPACKID = "flowPackId"; // 卡平台套餐id
	public static final String VALIDATERESULT = "validateResult"; // 卡平台通知消息-卡校验结果
	public static final String CURRENTPAGENO = "currentPageNo"; // 当前页数
	public static final String PAGESIZE = "pageSize"; // 条数

	public static final String RESIDUALFLOW = "residualFlow"; // 当前流量剩余
	public static final String PACKRESIDUALFLOW = "packResidualFlow";// 卡的套餐剩余流量
	public static final String PACKHISTORYFLOW = "packHistoryFlow";// 卡的历史流量
	public static final String CARDACCFLOW = "cardAccFlow";// 卡的累计套餐总流量

	public static final String PACKNAME = "packName"; // 套餐名称
	public static final String PACKTYPE = "packType"; // 1：主套餐 2：加油套餐
	public static final String PACKTYPE_1 = "1"; // 主套餐

	public static final Integer CARDSENDNOCHECKAPPLY = 1; // 发卡状态--未提交卡平台验证申请状态
	public static final Integer CARDSENDCHECKEDAPPLY = 2; // 发卡状态--已经提交验证申请
	public static final Integer CARDSENDCHECKYES = 3; // 发卡状态--卡平台验证结果正确
	public static final Integer CARDSENDCHECKNO = 4; // 发卡状态--卡平台验证结果错误
	public static final Integer CARDSENDOPERATOROK = 5; // 发卡状态--运营平台发卡成功
	public static final Integer CARDSENDOPERATORNO = 6; // 发卡状态--运营平台发卡失败
	public static final Integer CARDSENDSUCESS = 7; // 发卡状态--卡平台通知成功
	public static final Integer CARDSENDFAIL = 8; // 发卡状态--卡平台通知失败

	public static final String ICCID = "iccid"; // iccid
	public static final String IMSI = "imsi"; // imsi
	public static final String STOPANDSTART = "stopOrStart";// 停复机
	public static final String STARTDATE = "startDate"; //
	public static final String ENDDATE = "endDate"; //
	public static final String FILTER = "filter";
	public static final String TOTALCOUNT = "totalCount";
	public static final String LASTPAGENO = "lastPageNo";
	public static final String RESULT = "result";
	public static final String QUERYDATE = "queryDate";// 使用时间
	public static final String USEDFLOW = "usedFlow";// 使用流量
	public static final String CARDRESIDUALFLOW = "cardResidualFlow";// 卡剩余流量
	public static final String SEQID = "seqid";// 索引id
	public static final String PACKEXPIRYDATE = "packExpiryDate";// 套餐到期时间
	public static final String PACKUSEDFLOW = "packUsedFlow";// 套餐已经使用流量
	public static final String PACKFLOW = "packFlow";// 套餐流量
	public static final Integer BATCHINSERTDBSIZE = 600;// 批量插入数据库的大小
	public static final String ACTION = "action"; // 停复机指令
	public static final String TELECOMSTOP = "ADD";// 电信的停机
	public static final String TELECOMSTART = "DEL";// 电信的恢复机
	public static final String UNICOMSTOP = "DEACTIVATED_NAME";// 联通停机
	public static final String UNICOMSTART = "ACTIVATED_NAME";// 联通恢复机

	// 渠道商
	public static final Integer PARTNER_STATE_NO = 0;// 无效
	public static final Integer PARTNER_STATE_YES = 1;// 有效

	public static final String PARTNER_LOGIN_PWD = "partner_login_pwd";
	public static final String LOGIN_PWD = "login_pwd";// 渠道商登录初始密码-静态值

	// 卡平台订单竣工标示

	public static final Integer CARD_ORDER_OPEN_STATE_OPENED = 2;// 有效


	/**
	 * 运营商iccid前缀-电信
	 */
	public static final String[] OPERATE_ICCID_PREFIX_TELECOM = new String[] { "898603" };
	/**
	 * 运营商iccid前缀-移动
	 */
	public static final String[] OPERATE_ICCID_PREFIX_CMCC = new String[] { "898600", "898602" };
	/**
	 * 运营商iccid前缀-联通
	 */
	public static final String[] OPERATE_ICCID_PREFIX_UNICOM = new String[] { "898606" };

	/**
	 * 套餐类型-主套餐
	 */
	public static final Integer PACKTYPE_MAIN = 1;
	/**
	 * 套餐类型-加油包
	 */
	public static final Integer PACKTYPE_FUEL = 2;

	/**
	 * 运营商结算状态-未申请
	 */
	public static final Integer PARTNER_SETTLE_STATUS_UNAPPLY = 0;
	/**
	 * 运营商结算状态-申请中
	 */
	public static final Integer PARTNER_SETTLE_STATUS_APPLYING = 1;
	/**
	 * 运营商结算状态-已结算
	 */
	public static final Integer PARTNER_SETTLE_STATUS_SETTLED = 2;

	/**
	 * 渠道商-登录code已存在!
	 */
	public static final String LOGIN_CODE_SAME = "账号名称已存在!";
	/**
	 * 渠道商-渠道商code已存在!
	 */
	public static final String PARTNER_CODE_SAME = "渠道商code已存在!";

	/**
	 * sessionUser
	 */
	public static final String BUSINESS_SESSION_USER = "SESSION_USER";

	/**
	 * 跳转登录
	 */
	public static final String NO_LOGIN_URL = "/flycar/bussiness/forwardLogin";

	/**
	 * 未登录
	 */
	public static final Integer NO_LOGIN = 401;

	/**
	 * 默认重置密码，可以在统一资源平台上配置business.pwd进行覆盖
	 */
	public static final String USER_PWD = "654321";

	public static final String SESSION_VERIFY_CODE = "SESSION_VERIFY_CODE";

	public static final Integer VERIFY_CODE_LENGTH = 30;

	public static final Integer VERIFY_CODE_HIGHT = 50;

	public static final Integer VERIFY_CODE_NUMBER = 5;
	
	/**
	 * 最大的
	 */
	public static final Integer MAX_MAP_NUM = 1000;

}
