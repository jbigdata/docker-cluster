/**   
* @Title: ToolUtil.java 
* @Package com.mapbar.sy.common.base.util 
* @Description: 通用工具类
* @author yinsihua 
* @date 2015年12月25日 下午5:27:59 
* @version V1.0 
*/
package com.wanliang.site.sms;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: ToolUtil
 * @Description: 通用工具类
 * @Author yinsihua
 * @CreateDate 2015年12月25日 下午5:27:59
 * @UpdateUser yinsihua
 * @UpdateDate 2015年12月25日 下午5:27:59
 * @UpdateRemark 说明本次修改内容
 */
public class ToolUtil
{
	private static final Logger logger = LoggerFactory.getLogger(ToolUtil.class);

	private final static String KEY = "f67919a6edf94945a3845ce73bc9b12a";

	/**
	 * 签名的参数名
	 */
	private static final String SIGN_PARAM = "user_sign";
	/**
	 * 渠道的参数名
	 */
	private static final String CHANNEL_PARAM = "sendposition";

	public static String encodeChinese(String message)
	{
		try
		{
			return URLEncoder.encode(message, "UTF-8");
		}
		catch (UnsupportedEncodingException e)
		{
			logger.error(e.getMessage(), e);
		}
		return message;
	}

	/**
	 * generate sign info, need 3 steps
	 * 1, sort all param names by nature order (exclude SIGN_PARAM)
	 * 2, spell params and values with &. eg. name=admin&password=mhy
	 * 3, hmac-sha1 encrypt with specified key
	 *
	 * @param params
	 * @return
	 */
	public static String sign(Map<String, Object> params)
	{
		if (params == null || params.size() == 0)
		{
			return null;
		}

		Object channel = String.valueOf(params.get(CHANNEL_PARAM));
		if (channel == null)
		{	
			return null;
		}
		params.remove(SIGN_PARAM);
		List<String> paramNames = new ArrayList<>(params.keySet());
		Collections.sort(paramNames);// step 1,sort param names by nature order

		StringBuilder sb = new StringBuilder();
		for (String paramName : paramNames)
		{// step 2
			Object obj = params.get(paramName);
			sb.append(paramName).append("=").append(obj == null ? "" : String.valueOf(obj)).append("&");
		}

		if (sb.length() > 0)
		{
			sb.deleteCharAt(sb.length() - 1);
		}

		return EncryptUtil.HMAC_SHA1(sb.toString(), KEY);// step 3
	}
	
    public static String genericUUID(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
