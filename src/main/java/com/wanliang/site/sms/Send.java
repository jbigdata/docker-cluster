//package com.wanliang.site.sms;
//
//import java.io.IOException;
//import java.io.PrintStream;
//
//import org.apache.commons.httpclient.HttpClient;
//import org.apache.commons.httpclient.HttpException;
//import org.apache.commons.httpclient.methods.PostMethod;
//import org.dom4j.Document;
//import org.dom4j.DocumentHelper;
//import org.dom4j.Element;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
///**
// * @author wanliang
// * @version 1.0
// * @date 2016/1/6
// * @modify
// * @copyright Navi  TSP
// */
//
//public class Send extends Config {
//    private static final Logger logger = LoggerFactory.getLogger(Send.class);
//
//    public static int sendSMS(String phone, String content, String sendtime) {
//        int sendMsg = 0;
//
//        HttpClient client = new HttpClient();
//        PostMethod method = null;
//
//        method = new PostMethod(SmsUrl);
//        method.addParameter("circle", circle);
//        method.addParameter("pwd", pwd);
//        method.addParameter("cell", cell);
//        method.addParameter("service", smsserver);
//        method.addParameter("mobile", phone);
//        method.addParameter("mtype", mtype);
//        method.addParameter("message", gbk2iso(content));
//        method.addParameter("msgid", msgid);
//        try {
//            client.executeMethod(method);
//        } catch (HttpException e1) {
//            logger.error(e1.getMessage(), e1);
//        } catch (IOException e1) {
//            logger.error(e1.getMessage(), e1);
//            String str1 = "<?xml version=\"1.0\" encoding=\"gb2312\"?><result>-100</result>";
//        }
//        String result;
//        try {
//            result = method.getResponseBodyAsString();
//            if (result.equals("0")) result = "<?xml version=\"1.0\" encoding=\"gb2312\"?><result>1</result>";
//            else if (result.equals("503")) result = "<?xml version=\"1.0\" encoding=\"gb2312\"?><result>-30</result>";
//            else if (result.equals("506")) result = "<?xml version=\"1.0\" encoding=\"gb2312\"?><result>-150</result>";
//            else result = "<?xml version=\"1.0\" encoding=\"gb2312\"?><result>-100</result>";
//        } catch (IOException e1) {
//            logger.error(e1.getMessage(), e1);
//            result = "<?xml version=\"1.0\" encoding=\"gb2312\"?><result>-100</result>";
//        }
//
//        try {
//            Document doc = null;
//            doc = DocumentHelper.parseText(result);
//
//            String sucess = doc.getRootElement().getText();
//            sendMsg = Integer.parseInt(sucess);
//        } catch (Exception e) {
//            System.out.println(e.toString());
//            sendMsg = -100;
//        }
//        return sendMsg;
//    }
//
//    public static int sendSMS3in1(String phone, String content, String sendtime) {
//        int sendMsg = 0;
//
//        HttpClient client = new HttpClient();
//        PostMethod method = null;
//
//        method = new PostMethod(SmsUrl);
//        method.addParameter("circle", circle);
//        method.addParameter("pwd", pwd);
//        method.addParameter("cell", cell);
//        method.addParameter("service", smsserver);
//        method.addParameter("mobile", phone);
//        method.addParameter("mtype", mtype);
//        method.addParameter("message", gbk2iso(content));
//        method.addParameter("msgid", msgid);
//        try {
//            client.executeMethod(method);
//        } catch (HttpException e1) {
//            logger.error(e1.getMessage(), e1);
//        } catch (IOException e1) {
//            logger.error(e1.getMessage(), e1);
//            String str1 = "<?xml version=\"1.0\" encoding=\"gb2312\"?><result>-100</result>";
//        }
//        String result;
//        try {
//            result = method.getResponseBodyAsString();
//            if (result.equals("0")) result = "<?xml version=\"1.0\" encoding=\"gb2312\"?><result>1</result>";
//            else if ((result.equals("503")) || (result.equals("508")))
//                result = "<?xml version=\"1.0\" encoding=\"gb2312\"?><result>-503</result>";
//            else if (result.equals("506")) result = "<?xml version=\"1.0\" encoding=\"gb2312\"?><result>-506</result>";
//            else if ((result.equals("500")) || (result.equals("502")) || (result.equals("504")) || (result.equals("507")) || (result.equals("550")) || (result.equals("600")))
//                result = "<?xml version=\"1.0\" encoding=\"gb2312\"?><result>-500</result>";
//            else if (result.equals("505")) result = "<?xml version=\"1.0\" encoding=\"gb2312\"?><result>-505</result>";
//            else if (result.equals("501")) result = "<?xml version=\"1.0\" encoding=\"gb2312\"?><result>-501</result>";
//            else result = "<?xml version=\"1.0\" encoding=\"gb2312\"?><result>-100</result>";
//        } catch (IOException e1) {
//            logger.error(e1.getMessage(), e1);
//            result = "<?xmllogger.error(e1.getMessage(), e1);ding=\"gb2312\"?><result>-100</result>";
//        }
//
//        try {
//            Document doc = null;
//            doc = DocumentHelper.parseText(result);
//
//            String sucess = doc.getRootElement().getText();
//            sendMsg = Integer.parseInt(sucess);
//        } catch (Exception e) {
//            System.out.println(e.toString());
//            sendMsg = -100;
//        }
//        return sendMsg;
//    }
//
//    public static SmsReport sendSMS3in1(String phone, String content) {
//        SmsReport smsreport = new SmsReport();
//        try {
//            smsreport = SendSms.sendMessage(phone, content);
//        } catch (Exception e) {
//            logger.error(e.getMessage(), e);
//            smsreport.setStatus(-100);
//        }
//        return smsreport;
//    }
//
//    public static int sendSMS1(String phone, String content, String sendtime) {
//        int sendMsg = 0;
//
//        HttpClient client = new HttpClient();
//        PostMethod method = null;
//
//        method = new PostMethod(SmsUrl);
//        method.addParameter("circle", circle);
//        method.addParameter("pwd", pwd);
//        method.addParameter("cell", smallCell);
//        method.addParameter("service", smsserver);
//        method.addParameter("mobile", phone);
//        method.addParameter("mtype", mtype);
//        method.addParameter("message", gbk2iso(content));
//        method.addParameter("msgid", msgid);
//        try {
//            client.executeMethod(method);
//        } catch (HttpException e1) {
//            logger.error(e1.getMessage(), e1);
//        } catch (IOException e1) {
//            logger.error(e1.getMessage(), e1);
//            String str1 = "<?xml version=\"1.0\" encoding=\"gb2312\"?><result>-100</result>";
//        }
//        String result;
//        try {
//            result = method.getResponseBodyAsString();
//            if (result.equals("0")) result = "<?xml version=\"1.0\" encoding=\"gb2312\"?><result>1</result>";
//            else if (result.equals("503")) result = "<?xml version=\"1.0\" encoding=\"gb2312\"?><result>-30</result>";
//            else if (result.equals("506")) result = "<?xml version=\"1.0\" encoding=\"gb2312\"?><result>-150</result>";
//            else result = "<?xml version=\"1.0\" encoding=\"gb2312\"?><result>-100</result>";
//        } catch (IOException e1) {
//            logger.error(e1.getMessage(), e1);
//            result = "<?xml version=\"1.0\" encoding=\"gb2312\"?><result>-100</result>";
//        }
//
//        try {
//            Document doc = null;
//            doc = DocumentHelper.parseText(result);
//
//            String sucess = doc.getRootElement().getText();
//            sendMsg = Integer.parseInt(sucess);
//        } catch (Exception e) {
//            System.out.println(e.toString());
//            sendMsg = -100;
//        }
//        return sendMsg;
//    }
//
//    public static String iso2gbk(String tmp) {
//        try {
//            return new String(tmp.getBytes("ISO8859_1"), "GBK");
//        } catch (Exception e) {
//        }
//        return tmp;
//    }
//
//    public static String gbk2iso(String tmp) {
//        try {
//            return new String(tmp.getBytes("GBK"), "ISO8859_1");
//        } catch (Exception e) {
//        }
//        return tmp;
//    }
//
//    public static StringBuffer getEmailPostData(String email, String title, String content) {
//        StringBuffer sbStr = new StringBuffer();
//        sbStr.append("<data><mailInfo><from>" + EmailSupport + "</from>");
//        sbStr.append("<type>html</type>");
//        sbStr.append("<to>");
//        sbStr.append(Util.addCdataTag(email));
//        sbStr.append("</to>");
//        sbStr.append("<cc></cc>");
//        sbStr.append("<subject>");
//        sbStr.append(Util.addCdataTag(title));
//        sbStr.append("</subject>");
//        sbStr.append("<text>");
//        sbStr.append(Util.addCdataTag(content));
//        sbStr.append("</text>");
//        sbStr.append("</mailInfo></data>");
//
//        return sbStr;
//    }
//
//    public static boolean sendEmail(String email, String title, String content) {
//        boolean sendOk = false;
//
//        String postData = getEmailPostData(email, title, content).toString();
//        String[] args = {"postData", postData};
//
//        String result = Http.sendPost(EmailServer, args, "GBK");
//        try {
//            Document doc = null;
//            doc = DocumentHelper.parseText(result);
//
//            Element root = doc.getRootElement();
//            Element rs = root.element("rs");
//            String auth = rs.elementText("auth");
//            if (auth.equalsIgnoreCase("true")) sendOk = true;
//        } catch (Exception e) {
//            System.out.println(e.toString());
//        }
//
//        return sendOk;
//    }
//
//    public static boolean sendEmail(String email, String title, String content, String isLocal) {
//        throw new RuntimeException("not implements !!!");
//    }
//
//    public static boolean sendMMS(String phone, String title, String content, String imgurl) {
//        boolean result = false;
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(iso2gbk(gbk2iso("来自图吧：南嶺工業大廈,0853-66262148/慕拉士大馬路澳門市政廳")));
//    }
//}