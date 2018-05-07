package com.leo.datas.Utils;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.leo.datas.bean.ZuRquestPara;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;


public class TestApi {


    public static void main(String[] args) {

   /*     // System.out.println(doPostGetCount("欧阳", "1", "20"));

        TestApi testApi = new TestApi();
        System.out.println(testApi.url);*/
    }


    public String doPostGetCount(ZuRquestPara zuRquestPara) {

        String bodyStr = null;
        try {
            // 组装请求参数
            Map paramMap = new HashMap();
            if (zuRquestPara.getXm() != null||zuRquestPara.getXm()!="") {
                paramMap.put("XM", zuRquestPara.getXm());
            }
            if (zuRquestPara.getGmsfhm() != null||zuRquestPara.getGmsfhm()!="") {
                paramMap.put("num", zuRquestPara.getGmsfhm());
            }

            if (zuRquestPara.getPageN() != null||zuRquestPara.getPageN()!="") {
                paramMap.put("pageNum", zuRquestPara.getPageN());
            }

            if (zuRquestPara.getPageSize() != null||zuRquestPara.getPageSize()!="") {
                paramMap.put("pageSize", zuRquestPara.getPageSize());
            }


            // 组装请求消息体
            Map bodyMap = new HashMap();
            bodyMap.put("body", paramMap);
            ObjectMapper mapper = new ObjectMapper();
            String jsonBody = mapper.writeValueAsString(bodyMap);
          //  System.out.println("加密前的body消息体：" + jsonBody);
            // AES加密
            AesUtil aesUtil = new AesUtil();
            // 传入appkey和body消息
            String encryptBody = aesUtil.encrypt(zuRquestPara.getAppkey(), jsonBody);
           // System.out.println("加密后的body消息体：" + encryptBody);
            // 组装请求数据
            String jsonStr = packRequestData(encryptBody, zuRquestPara.getSpendId(), zuRquestPara.getSendOrder(), zuRquestPara.getAppid());
           // System.out.println("提交的参数：" + jsonStr);
            // 请求接口
            String result = post(jsonStr, zuRquestPara.getUrl());
          //  System.out.println("返回的加密消息" + result);
            Map resultRep = mapper.readValue(result, Map.class);
            Map appResMap = (Map) resultRep.get("appRes");
          //  System.out.println("解密前的body消息体:" + (String) appResMap.get("body"));
         //   System.out.println("appkey：" + zuRquestPara.getAppkey());

            bodyStr = aesUtil.desCrypt(zuRquestPara.getAppkey(), (String) appResMap.get("body"));
          //  System.out.println("解密后的body消息体:" + bodyStr);


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("这他妈是什么?");
        }
        return bodyStr;
    }


    /****
     * 组装请求数据
     *
     * @return
     */
    private String packRequestData(String body, String sendId, String sendOrder, String appid) {
        String jsonStr = "";
        try {
            ObjectMapper mapper = new ObjectMapper();
            // 组装请求头
            Map headMap = new HashMap();
            headMap.put("sendId", sendId);
            headMap.put("sendOrder", sendOrder);
            headMap.put("timeStamp", "2017091221255121");
            headMap.put("appid", appid);
            // 组装请求消息
            Map appReqMap = new HashMap();
            appReqMap.put("head", headMap);
            appReqMap.put("body", body);
            Map requestMap = new HashMap();
            requestMap.put("appReq", appReqMap);
            jsonStr = mapper.writeValueAsString(requestMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonStr;
    }

    /**
     * 调用http接口
     *
     * @param
     * @param url
     * @return
     */
    private String post(String jsonStr, String url) {
        InputStream in = null;
        ByteArrayOutputStream barray = null;
        try {
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestProperty("Content-type", "application/x-java-serialized-object");
            // http请求连接起时时间（单位：毫秒）
            conn.setConnectTimeout(100 * 1000);
            // 数据读取超时时间（单位：毫秒）
            conn.setReadTimeout(100 * 1000);
            // 设置允许输出
            conn.setDoInput(true);
            conn.setDoOutput(true);
            // 不用缓存
            conn.setUseCaches(false);
            conn.setRequestMethod("POST");
            byte[] dataReq = jsonStr.getBytes();
            // 设置文件长度
            conn.setRequestProperty("Content-Length", String.valueOf(dataReq.length));
            // 开始连接请求
            conn.connect();
            OutputStream out = conn.getOutputStream();
            // 写入请求的字符串
            out.write(dataReq);
            out.flush();
            out.close();
            // 接收返回信息
            in = new DataInputStream(conn.getInputStream());
            byte[] array = new byte[4096];
            int count = -1;
            barray = new ByteArrayOutputStream();
            while (-1 != (count = in.read(array))) {
                barray.write(array, 0, count);
            }
            byte[] dataResult = barray.toByteArray();
            barray.close();
            String ret = new String(dataResult, "utf-8");
            return ret;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if (barray != null) {
                try {
                    barray.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

}
