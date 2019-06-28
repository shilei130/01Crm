package com.bjpowernode.setting.user.test;

import com.bjpowernode.crm.utils.DateTimeUtil;
import com.bjpowernode.crm.utils.MD5Util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author:
 */
public class Test01 {
    public static void main(String[] args) {
        //验证时间
        String expireTime="2019-10-10 10:10:10";
       /* Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sysTime=sdf.format(date);
        System.out.println(sysTime);*/

        /*String currentTime= DateTimeUtil.getSysTime();
        int count=expireTime.compareTo(currentTime);
        System.out.println(count); //正数表示 expireTime-currentTime大于0*/

        //验证锁定状态 0表示锁定
      /*  String lockState ="0";
        if ("0".equals(lockState)){
            System.out.println("账号已经锁定");
        }*/

        //验证Ip地址
       /* String ip="192.168.1.1";
        String allowIps="192.168.1.1,192.168.1.2,192.168.1.3";
        if (!allowIps.contains(ip)){
            System.out.println("IP地址无效");
        }*/
        //关于MD5密码的加密方式
        String str="123";
        str=MD5Util.getMD5(str);
        System.out.println(str);

    }
}
