package com.leo.datas.Utils;

import com.leo.datas.domain.CharactorStatus;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class GeneratorChar {
    public static List<CharactorStatus> getChinese() {
        String str = null;

        ArrayList<CharactorStatus> charactorStatuses = new ArrayList<>();

        int highPos, lowPos;
        for (int i = 0; i < 71; i++) {
            highPos = 176 + i;// 位码，0xA0打头，范围第1~94列
            for (int j = 0; j < 94; j++) {
                lowPos = 161 + j;// 区码，0xA0打头，从第16区开始，即0xB0=11*16=176,16~55一级汉字，56~87二级汉字
                byte[] bArr = new byte[2];
                bArr[0] = (new Integer(highPos)).byteValue();
                bArr[1] = (new Integer(lowPos)).byteValue();
                try {
                    str = new String(bArr, "GB2312"); // 区位码组合成汉字
                    CharactorStatus charactorStatus = new CharactorStatus();
                    charactorStatus.setContent(str);
                    charactorStatus.setDone(false);
                    charactorStatuses.add(charactorStatus);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }

        }
        return charactorStatuses;
    }



}
