package com.simpleway.frst.base;

public class BaseConstant {

    /**********************
     * order
     *************************/
    public static final String DESC = "DESC";
    public static final String ASC = "ASC";
    /**********************
     * order
     *************************/

    public static final int YES = 1;
    public static final int no = 0;

    public static final String NORMAL_DATE_FORMAT = "yyyy-MM-dd";
    public static final String NORMAL_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String NORMAL_MONTH_FORMAT = "yyyy-MM";

    // 标志位
    public static final int SUCCESS = 0;
    public static final int FAIL = -1;

    // 权限类型
    public static final int MENU_AUTHORITY = 0;
    public static final int BUTTON_AUTHORITY = 1;
    public static final int DATA_AUTHORITY = 2;
    public static final int DATA_CARD_AUTHORITY = 3;

    // 状态码
    public static final int INVALID = 0;// 无效
    public static final int VALID = 1;// 有效

    /**
     * session存储的各项值
     */
    public static final String USERINFO = "userInfo";

    public static final String ROLEINFO = "roleInfo";

    public static final String PARTNERIDAUTH = "partnerIdAuth";

    public static final String CARD_MERCHANT_ID_AUTH = "cardMerchantIdAuth";

    public static final String MENUAUTH = "menuAuth";

    /**
     * 用户登录及授权验证缓存
     */
    public static final String AHTH_ZATION_CACHE = "authentizationCache";// 权限缓存

    /**
     * 操作日志-操作类型
     */
    public static final Integer OPERATE_LOG_TYPE_ADD = 1;
    public static final Integer OPERATE_LOG_TYPE_UPD = 2;
    public static final Integer OPERATE_LOG_TYPE_DEL = 3;

    /**
     * 角色类型
     */
    public static final Integer SUPER_ADMIN = 1;// 超级管理员
    // public static final Integer NORMAL_ADMIN = 2;//
    public static final Integer NORMAL_USER = 2;// 普通用户
    public static final String SESSION_USER = "session_user";
    public static final Integer NO_PERMISSION = 403;
    public static final Integer NO_LOGIN = 401;
    public static final String LOGIN_TIMES_NAME = "loginTimes";
    public static final Integer LOGIN_TIMES = 3;
    public static final Integer USER_NORMAL = 1;
    public static final Integer USER_LOCK = 2;
    public static final Integer USER_DISABLE = 0;
    public static final String SESSION_FORCE_LOGOUT_KEY = "force_logout";
    public static final String CARD_INFO = "card_info";
    public static final String TEMPLATE_DOWN = "template_down";
    public static Integer WEB_SUCCESS_CODE = 0;
    public static String WEB_SUCCESS_MSG = "响应成功";
    public static Integer WEB_ERROR_CODE = -1;
    public static String WEB_ERROR_MSG = "服务异常";
    public static String WEB_ERROR_MSG_CONSTTYPECODE = "静态类型编码重复!";
    public static String WEB_ERROR_MSG_CONSTVALUECODE = "静态值重复!";


    //	0.未上报，1：已上报  2：区金融办审核通过   3：市金融办审核通过 4、审核不通过
    public static final int FINANCE_STATE_UNREPORT = 0;
    public static final int FINANCE_STATE_REPORTED = 1;
    public static final int FINANCE_STATE_APPROVE_TOWNSHIP = 2;
    public static final int FINANCE_STATE_APPROVE_CITY = 3;
    public static final int FINANCE_STATE_REJECT = 4;


    //    0：未做比对  1：已做比对并通过  2：已做比对并预警
    public static final Integer COMPARE_STATE_UNDO = 0;
    public static final Integer COMPARE_STATE_PASS = 1;
    public static final Integer COMPARE_STATE_WARN = 2;

    /**
     * 注册资金设置的金额倍数
     */
    public static final String AMOUNTMULTI = "amount_multi";

    /**
     * 在一个月出现的频次
     */
    public static final String RECORDFREQ = "record_freq";

    /**
     * 注册资金的设置倍数（account_balance_multi）
     */
    public static final String ACCOUNTBALANCEMULTI = "account_balance_multi";

    /**
     * 所属机构类型-1.市金融办
     */
    public static final Integer INSTITUTION_TYPE_CITY = 1;

    /**
     * 所属机构类型-2.区金融办
     */
    public static final Integer INSTITUTION_TYPE_AREA = 2;

    /**
     * 所属机构类型-3.小贷公司
     */
    public static final Integer INSTITUTION_TYPE_COMPANY = 3;


}
