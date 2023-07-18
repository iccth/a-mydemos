package com.example.datastructure.hash;
public class T20230714220500StringHashCodedCompare {
    public static void main(String[] args) {
//        String str1 = "通话";
//        String str2 = "重地";
//        System.out.println(String.format("str1：%d | str2：%d",  str1.hashCode(),str2.hashCode()));
//        System.out.println(str1.equals(str2));

        String str1 = "通话";
        String str2 = "重地";
        System.out.println(String.format("%s：%d | %s：%d", str1, str1.hashCode(), str2, str2.hashCode()));
        System.out.println(str1.equals(str2));
    }
}
