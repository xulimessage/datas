package com.leo.datas.Utils;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.leo.datas.dao.PersonDao;
import com.leo.datas.domain.Person;
import com.leo.datas.service.PersonService;
import com.leo.datas.service.impl.PersonServiceImpl;


public class Jason2Sql {


    public static List buildInsertSqlFromJSON(String json, Class clazz) {
        JSONObject rootObject = JSON.parseObject(json);
        JSONObject subObject = rootObject.getJSONObject("data");
        JSONArray jsonArray = subObject.getJSONArray("items");
        List persons = JSON.parseArray(jsonArray.toJSONString(), clazz);

        return persons;
    }

    public static List buildInsertSqlFromJSONByCheLiang(String json, Class clazz) {
        JSONObject rootObject = JSON.parseObject(json);
        JSONObject subObject = rootObject.getJSONObject("data");
        JSONArray jsonArray = subObject.getJSONArray("lhcjclxxreqinfo");
        List persons = JSON.parseArray(jsonArray.toJSONString(), clazz);

        return persons;
    }

    public static int getTotal(String json) {
        JSONObject rootObject = JSON.parseObject(json);
        JSONObject subObject = rootObject.getJSONObject("data");
        int total = subObject.getIntValue("total");
        return total;
    }

    public static void main(String[] args) {
        String str = "{\"rtnMsg\":\"success\",\"rtnCode\":\"000000\",\"data\":{\"total\":\"20\",\"items\":[{\"YHZGX_ZW\":\"2\",\"YHZGX\":\"户主\",\"HYZK_ZW\":\"已婚\",\"CSDXZ\":\"\",\"FWCS\":\"贵州铝厂第一电解铝厂\",\"QTDZ\":\"\",\"JG_GJDQ_ZW\":\"中国\",\"XM\":\"春大保\",\"CSD_GJDQ_ZW\":\"中国\",\"ZY\":\"技术干部\",\"MZ_ZW\":\"汉族\",\"HH\":\"003003298\",\"CSRQ\":\"1948-6-15 0.0.0.0\",\"XB_ZW\":\"男性\",\"PCSDM_ZW\":\"贵州省贵阳市公安局云岩分局中环派出所\",\"WHCD_ZW\":\"中等专科毕业\",\"HJDZ\":\"\",\"PCSDM\":\"520103230000\",\"BYZK_ZW\":\"0\",\"XZ\":\"附1号\",\"GMSFHM\":\"520103194806153634\",\"JG_SSQX_ZW\":\"河南省漯河市郾城区\",\"SG\":\"169\",\"HSLBS\":\"\",\"CYM\":\"\",\"CSD_SSXQ_ZW\":\"河南省漯河市郾城区\",\"HKXZ\":\"居民户口\",\"DZQC\":\"贵州省贵阳市云岩区铜佛巷10号附1号\"},{\"YHZGX_ZW\":\"20\",\"YHZGX\":\"子\",\"HYZK_ZW\":\"未婚\",\"CSDXZ\":\"\",\"FWCS\":\"\",\"QTDZ\":\"\",\"JG_GJDQ_ZW\":\"中国\",\"XM\":\"春阳\",\"CSD_GJDQ_ZW\":\"中国\",\"ZY\":\"\",\"MZ_ZW\":\"汉族\",\"HH\":\"003003298\",\"CSRQ\":\"1980-11-8 0.0.0.0\",\"XB_ZW\":\"男性\",\"PCSDM_ZW\":\"贵州省贵阳市公安局云岩分局中环派出所\",\"WHCD_ZW\":\"初级中学教育\",\"HJDZ\":\"\",\"PCSDM\":\"520103230000\",\"BYZK_ZW\":\"0\",\"XZ\":\"附1号\",\"GMSFHM\":\"520103198011083618\",\"JG_SSQX_ZW\":\"河南省漯河市郾城区\",\"SG\":\"168\",\"HSLBS\":\"\",\"CYM\":\"\",\"CSD_SSXQ_ZW\":\"贵州省贵阳市\",\"HKXZ\":\"居民户口\",\"DZQC\":\"贵州省贵阳市云岩区铜佛巷10号附1号\"},{\"YHZGX_ZW\":\"20\",\"YHZGX\":\"子\",\"HYZK_ZW\":\"未婚\",\"CSDXZ\":\"\",\"FWCS\":\"\",\"QTDZ\":\"\",\"JG_GJDQ_ZW\":\"中国\",\"XM\":\"春秋\",\"CSD_GJDQ_ZW\":\"中国\",\"ZY\":\"\",\"MZ_ZW\":\"汉族\",\"HH\":\"003003298\",\"CSRQ\":\"1985-9-29 0.0.0.0\",\"XB_ZW\":\"男性\",\"PCSDM_ZW\":\"贵州省贵阳市公安局云岩分局中环派出所\",\"WHCD_ZW\":\"\",\"HJDZ\":\"\",\"PCSDM\":\"520103230000\",\"BYZK_ZW\":\"0\",\"XZ\":\"附1号\",\"GMSFHM\":\"520103198509293612\",\"JG_SSQX_ZW\":\"河南省漯河市郾城区\",\"SG\":\"165\",\"HSLBS\":\"\",\"CYM\":\"\",\"CSD_SSXQ_ZW\":\"贵州省贵阳市\",\"HKXZ\":\"居民户口\",\"DZQC\":\"贵州省贵阳市云岩区铜佛巷10号附1号\"},{\"YHZGX_ZW\":\"30\",\"YHZGX\":\"女\",\"HYZK_ZW\":\"离婚\",\"CSDXZ\":\"\",\"FWCS\":\"小河轴承厂\",\"QTDZ\":\"\",\"JG_GJDQ_ZW\":\"中国\",\"XM\":\"春瑜\",\"CSD_GJDQ_ZW\":\"中国\",\"ZY\":\"工作员\",\"MZ_ZW\":\"汉族\",\"HH\":\"007013505\",\"CSRQ\":\"1974-3-20 0.0.0.0\",\"XB_ZW\":\"女性\",\"PCSDM_ZW\":\"贵州省贵阳市公安局云岩分局北京路派出所\",\"WHCD_ZW\":\"技工学校毕业\",\"HJDZ\":\"\",\"PCSDM\":\"520103300000\",\"BYZK_ZW\":\"0\",\"XZ\":\"2单元附4号\",\"GMSFHM\":\"520103197403204840\",\"JG_SSQX_ZW\":\"河南省漯河市郾城区\",\"SG\":\"157\",\"HSLBS\":\"\",\"CYM\":\"\",\"CSD_SSXQ_ZW\":\"贵州省贵阳市\",\"HKXZ\":\"居民户口\",\"DZQC\":\"贵州省贵阳市云岩区中华北路179号2单元附4号\"},{\"YHZGX_ZW\":\"42\",\"YHZGX\":\"孙女\",\"HYZK_ZW\":\"\",\"CSDXZ\":\"\",\"FWCS\":\"\",\"QTDZ\":\"\",\"JG_GJDQ_ZW\":\"中国\",\"XM\":\"春思冰\",\"CSD_GJDQ_ZW\":\"中国\",\"ZY\":\"\",\"MZ_ZW\":\"汉族\",\"HH\":\"007013505\",\"CSRQ\":\"2003-7-26 0.0.0.0\",\"XB_ZW\":\"女性\",\"PCSDM_ZW\":\"贵州省贵阳市公安局云岩分局北京路派出所\",\"WHCD_ZW\":\"\",\"HJDZ\":\"\",\"PCSDM\":\"520103300000\",\"BYZK_ZW\":\"\",\"XZ\":\"2单元附4号\",\"GMSFHM\":\"520103200307262826\",\"JG_SSQX_ZW\":\"贵州省贵阳市\",\"SG\":\"\",\"HSLBS\":\"\",\"CYM\":\"\",\"CSD_SSXQ_ZW\":\"贵州省贵阳市\",\"HKXZ\":\"居民户口\",\"DZQC\":\"贵州省贵阳市云岩区中华北路179号2单元附4号\"},{\"YHZGX_ZW\":\"20\",\"YHZGX\":\"子\",\"HYZK_ZW\":\"未婚\",\"CSDXZ\":\"\",\"FWCS\":\"\",\"QTDZ\":\"\",\"JG_GJDQ_ZW\":\"中国\",\"XM\":\"春凯\",\"CSD_GJDQ_ZW\":\"中国\",\"ZY\":\"\",\"MZ_ZW\":\"汉族\",\"HH\":\"007013505\",\"CSRQ\":\"1976-3-16 0.0.0.0\",\"XB_ZW\":\"男性\",\"PCSDM_ZW\":\"贵州省贵阳市公安局云岩分局北京路派出所\",\"WHCD_ZW\":\"技工学校毕业\",\"HJDZ\":\"\",\"PCSDM\":\"520103300000\",\"BYZK_ZW\":\"0\",\"XZ\":\"2单元附4号\",\"GMSFHM\":\"520102197603166213\",\"JG_SSQX_ZW\":\"河南省漯河市郾城区\",\"SG\":\"170\",\"HSLBS\":\"\",\"CYM\":\"\",\"CSD_SSXQ_ZW\":\"贵州省贵阳市\",\"HKXZ\":\"居民户口\",\"DZQC\":\"贵州省贵阳市云岩区中华北路179号2单元附4号\"},{\"YHZGX_ZW\":\"30\",\"YHZGX\":\"女\",\"HYZK_ZW\":\"未婚\",\"CSDXZ\":\"\",\"FWCS\":\"\",\"QTDZ\":\"\",\"JG_GJDQ_ZW\":\"中国\",\"XM\":\"春瑜\uE5E5\",\"CSD_GJDQ_ZW\":\"中国\",\"ZY\":\"\",\"MZ_ZW\":\"汉族\",\"HH\":\"010001694\",\"CSRQ\":\"1974-3-20 0.0.0.0\",\"XB_ZW\":\"女性\",\"PCSDM_ZW\":\"贵州省贵阳市公安局云岩分局黔灵派出所\",\"WHCD_ZW\":\"技工学校毕业\",\"HJDZ\":\"\",\"PCSDM\":\"520103320000\",\"BYZK_ZW\":\"0\",\"XZ\":\"\",\"GMSFHM\":\"520103197403204840\",\"JG_SSQX_ZW\":\"河南省漯河市郾城区\",\"SG\":\"157\",\"HSLBS\":\"\",\"CYM\":\"\",\"CSD_SSXQ_ZW\":\"贵州省贵阳市\",\"HKXZ\":\"居民户口\",\"DZQC\":\"贵州省贵阳市云岩区中华北路323-4号\"},{\"YHZGX_ZW\":\"99\",\"YHZGX\":\"非亲属\",\"HYZK_ZW\":\"未婚\",\"CSDXZ\":\"\",\"FWCS\":\"贵州师范大学\",\"QTDZ\":\"\",\"JG_GJDQ_ZW\":\"中国\",\"XM\":\"春芳\",\"CSD_GJDQ_ZW\":\"中国\",\"ZY\":\"学生\",\"MZ_ZW\":\"汉族\",\"HH\":\"013009168\",\"CSRQ\":\"1980-5-18 0.0.0.0\",\"XB_ZW\":\"女性\",\"PCSDM_ZW\":\"贵州省贵阳市公安局云岩分局黔灵东路派出所\",\"WHCD_ZW\":\"大学本科\",\"HJDZ\":\"\",\"PCSDM\":\"520103260000\",\"BYZK_ZW\":\"0\",\"XZ\":\"九九级学生物理系\",\"GMSFHM\":\"522130198005180025\",\"JG_SSQX_ZW\":\"贵州省遵义市仁怀市\",\"SG\":\"\",\"HSLBS\":\"\",\"CYM\":\"\",\"CSD_SSXQ_ZW\":\"贵州省遵义市仁怀市\",\"HKXZ\":\"居民户口\",\"DZQC\":\"贵州省贵阳市云岩区宝山北路270号九九级学生物理系\"},{\"YHZGX_ZW\":\"12\",\"YHZGX\":\"妻\",\"HYZK_ZW\":\"已婚\",\"CSDXZ\":\"\",\"FWCS\":\"贵阳技工学校\",\"QTDZ\":\"\",\"JG_GJDQ_ZW\":\"中国\",\"XM\":\"春敏贞\",\"CSD_GJDQ_ZW\":\"中国\",\"ZY\":\"行政工人\",\"MZ_ZW\":\"汉族\",\"HH\":\"026002380\",\"CSRQ\":\"1954-5-13 0.0.0.0\",\"XB_ZW\":\"女性\",\"PCSDM_ZW\":\"贵州省贵阳市公安局南明分局见龙派出所\",\"WHCD_ZW\":\"初级中学教育\",\"HJDZ\":\"\",\"PCSDM\":\"520102440000\",\"BYZK_ZW\":\"0\",\"XZ\":\"2栋1单元附1号\",\"GMSFHM\":\"520102195405136225\",\"JG_SSQX_ZW\":\"河南省漯河市郾城区\",\"SG\":\"159\",\"HSLBS\":\"\",\"CYM\":\"\",\"CSD_SSXQ_ZW\":\"河南省漯河市郾城区\",\"HKXZ\":\"居民户口\",\"DZQC\":\"贵州省贵阳市南明区见龙洞路125号2栋1单元附1号\"},{\"YHZGX_ZW\":\"2\",\"YHZGX\":\"户主\",\"HYZK_ZW\":\"已婚\",\"CSDXZ\":\"\",\"FWCS\":\"贵阳市红星拖拉机床厂\",\"QTDZ\":\"\",\"JG_GJDQ_ZW\":\"中国\",\"XM\":\"春燕贞\",\"CSD_GJDQ_ZW\":\"中国\",\"ZY\":\"模型工\",\"MZ_ZW\":\"汉族\",\"HH\":\"026008184\",\"CSRQ\":\"1957-5-14 0.0.0.0\",\"XB_ZW\":\"男性\",\"PCSDM_ZW\":\"贵州省贵阳市公安局南明分局见龙派出所\",\"WHCD_ZW\":\"初级中学教育\",\"HJDZ\":\"\",\"PCSDM\":\"520102440000\",\"BYZK_ZW\":\"0\",\"XZ\":\"5栋3单元附9号\",\"GMSFHM\":\"520102195705146214\",\"JG_SSQX_ZW\":\"河南省商丘市虞城县\",\"SG\":\"169\",\"HSLBS\":\"\",\"CYM\":\"\",\"CSD_SSXQ_ZW\":\"北京市\",\"HKXZ\":\"居民户口\",\"DZQC\":\"贵州省贵阳市南明区见龙洞路125号5栋3单元附9号\"}]}}";
        Jason2Sql.buildInsertSqlFromJSON(str,Person.class).stream().map(p -> p.toString()).forEach(System.out::println);
        PersonService p = new PersonServiceImpl();
        List<Person> list = Jason2Sql.buildInsertSqlFromJSON(str,Person.class);
        Person person = new Person();
        person.setXM("leo");
        p.save(person);
        //p.saveList(list);

    }

}
