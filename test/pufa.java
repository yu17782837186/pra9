package com.ning.test;

import java.util.*;

public class pufa {
    public static void main(String[] args) {
        byte[] bytes = new byte[]{1,2,3,15};
        System.out.println(byteToHex(bytes));
//        System.out.println(pufa.hexToByte("11"));
//        pufa.getTNumber("50101",10);
        pufa.JedisNum(6,2);
    }
    //字节数组转换为16进制
    public static String byteToHex(byte[] bytes) {
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0;i < bytes.length;i++) {
//            String hex = Integer.toHexString(bytes[i]);
//            if(hex.length() < 2) {
//                hex = "0"+hex;
//                sb.append(hex);
//            }
//        }
//        return sb.toString();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < bytes.length;i++) {
            String hex = Integer.toHexString(bytes[i]);
            if(hex.length() < 2) {
                hex = "0"+hex;
                sb.append(hex);
            }
        }
        return sb.toString();
    }
    //16进制转换为字节
    public static byte hexToByte(String hex) {
//        return (byte) Integer.parseInt(hex,16);
        return (byte) Integer.parseInt(hex,16);
    }
    //16进制转换为字节数组
    public static byte[] hexToBytes(String hex) {
//        int length = hex.length();
//        byte[] result;
//        if(length/2 != 0) {
//            result = new byte[(length+1)/2];
//            hex = "0"+hex;
//        }else {
//            result  = new byte[length/2];
//        }
//        int j = 0;
//        for(int i = 0;i < hex.length();i+=2) {
//            result[j] = hexToByte(hex.substring(i,i+2));
//            j++;
//        }
//        return result;
        int length = hex.length();
        byte[] result;
        if(length/2 != 0) {
            result = new byte[(length+1)/2];
            hex = "0"+hex;
        }else {
            result = new byte[length/2];
        }
        int j = 0;
        for(int i = 0;i < hex.length();i+=2) {
            result[j] = hexToByte(hex.substring(i,i+2));
        }
        return result;
    }
    //10进制转换为K进制
    public static String converK(int n,int k) {
//        ArrayList<Integer> list = new ArrayList<>();
//        int n1 = n;
//        while(n1 != 0 ) {
//            list.add(n1%k);
//            n1/=k;
//        }
//        StringBuilder sb = new StringBuilder();
//        Object[] obj = list.toArray();
//        for(int i = obj.length-1;i >= 0;i--) {
//            sb.append(obj[i]);
//        }
//        return sb.toString();
        ArrayList<Integer> list = new ArrayList<>();
        int n1 = n;
        while(n1 != 0) {
            list.add(n1%k);
            n1 /= k;
        }
        Object[] obj = list.toArray();
        StringBuilder sb = new StringBuilder();
        for(int i = obj.length-1;i >= 0;i--) {
            sb.append(obj[i]);
        }
        return sb.toString();
    }
//    //把k进制转换为10进制
//    public static void getTNumber(String s,int k) {
//        char[] chars = s.toCharArray();
//        int n = 0;
//        for(int i = chars.length-1;i >= 0;i--) {
//            if(chars[i] == '1') {
//                n+=Math.pow(k,chars.length-i-1);
//            }
//        }
//        System.out.println(s+"的十进制形式为："+n);
//    }
    //输入两个整数，输出两个整数化为二进制位的不同的个数
    public static int differNum(int n,int m) {
//        int i = n^m;
//        char[] ch = Integer.toBinaryString(i).toCharArray();
//        int count = 0;
//        for(int j = 0;j < ch.length;j++) {
//            if(ch[j] == 1) {
//                count++;
//            }
//        }
//        return count;
        int i = n^m;
        char[] ch = Integer.toBinaryString(i).toCharArray();
        int count = 0;
        for(int j = 0;j < ch.length;j++) {
            if(ch[j] == 1) {
                count++;
            }
        }
        return  count;
    }
    //字符串移除奇数位置
    public static String remoNum(String s) {
//        char[] ch = s.toCharArray();
//        StringBuilder sb = new StringBuilder();
//        for(int i = 1;i < ch.length;i+=2) {
//            sb.append(ch[i]);
//        }
//        return sb.toString();
        char [] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i < ch.length;i+=2) {
            sb.append(ch[i]);
        }
        return sb.toString();
    }
    //输出字符串的简称，比如字符串是"end of file",输出"EOF"
    public static String simpleStr(String s) {
//        String[] s1 = s.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for(String s2 : s1) {
//            char[] ch = s2.toCharArray();
//            char c = ch[0];
//            sb.append(c);
//        }
//        return sb.toString().toUpperCase();
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            char[] ch = str.toCharArray();
            char c = ch[0];
            sb.append(c);
        }
        return sb.toString().toUpperCase();
    }
    //A,B两个字符串，求在第一个字符串出现，第二个字符串中没有出现，重复只取第一次出现的，输出字符串
    public static String getStr(String s1,String s2) {
//        ArrayList<Character> chars = new ArrayList<>();
//        char[] ch1 = s1.toCharArray();
//        for(char c : ch1) {
//            if(!chars.contains(c)) {
//                chars.add(c);
//            }
//        }
//        ArrayList<Character> chars2 = new ArrayList<>();
//        char[] ch2 = s2.toCharArray();
//        for(char c : ch2) {
//            chars2.add(c);
//        }
//        StringBuilder sb = new StringBuilder();
//        for(Character c : chars) {
//            if(!chars2.contains(c)) {
//                sb.append(c);
//            }
//        }
//        return sb.toString();
        ArrayList<Character> chars = new ArrayList<>();
        char[] ch = s1.toCharArray();
        for(char c : ch) {
            if(!chars.contains(c)) {
                chars.add(c);
            }
        }
        ArrayList<Character> char2 = new ArrayList<>();
        char[] ch2 = s2.toCharArray();
        for(char c : ch2) {
            char2.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(char c : chars) {
            if(!char2.contains(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    //字符串反转位置
    public static String reverser(String s) {
//        char[] ch = s.toCharArray();
//        StringBuilder sb = new StringBuilder();
//        for(int i = ch.length -1;i >= 0;i--) {
//            sb.append(ch[i]);
//        }
//        return sb.toString();
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = ch.length-1;i >= 0;i--) {
            sb.append(ch[i]);
        }
        return sb.toString();
    }
    //字符串加密，把字符串中字符a和A换成c输出
    public static String changIndex(String s) {
//        char[] ch = s.toCharArray();
//        StringBuilder sb = new StringBuilder();
//        for(char c : ch) {
//            if(c == 'a' || c == 'A') {
//                sb.append('c');
//            }else {
//                sb.append(c);
//            }
//        }
//        return sb.toString();
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : ch) {
            if(c == 'a' || c == 'A') {
                sb.append(c);
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    //输入一个只包含字母的字符串，将字符串中的大写字母改为小写字母，将小写字母改为大写字母，并输出
    public static String changeStr(String s) {
//        char[] ch = s.toCharArray();
//        for(int i = 0;i < ch.length;i++) {
//            if('a' <= ch[i] && ch[i] <= 'z') {
//                ch[i] = (char)(ch[i]-32);
//                continue;
//            }
//            if('A' <= ch[i] && ch[i] <= 'Z') {
//                ch[i] = (char)(ch[i]+32);
//            }
//        }
//        return String.valueOf(ch);
        char[] ch = s.toCharArray();
        for(int i = 0;i < ch.length;i++) {
            if('a' <= ch[i] && ch[i] <= 'z') {
                ch[i] = (char)(ch[i]-32);
            }
            if('A' <= ch[i] && ch[i] <= 'Z') {
                ch[i] = (char)(ch[i]+32);
            }
        }
        return String.valueOf(ch);
    }
    //判断两个字符串是否是异位
    public static boolean idPositon(String s1,String s2) {
//        char[] ch1 = s1.toCharArray();
//        char[] ch2 = s2.toCharArray();
//        Arrays.sort(ch1);
//        Arrays.sort(ch2);
//        for(int i = 0;i < ch1.length;i++) {
//            if(ch1[i] != ch2[i]) {
//                return false;
//            }
//        }
//        return true;
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i = 0;i < ch1.length;i++) {
            if(ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }
    //给三个数abc,能否再1000-9999之间找到一个数x，满足x%a=0且(x+1)%b=0且(x+2)%c=0,找不到这个数x就返回Impossible
    public static String fingNumber(int a,int b,int c) {
//        for(int i = 1000;i <= 9999;i++) {
//            if(i%a == 0 && ((i+1)%b == 0) &&((i+2) % c == 0)) {
//                return "can";
//            }
//        }
//        return "Imposible";
        for(int i = 1000;i <= 9999;i++) {
            if(i % a == 0 && ((i+1)%b == 0) && ((i+2) % c == 0)) {
                return "can";
            }
        }
        return "impossible";
    }
    //一只小猴子一天摘了许多桃子，第一天吃了一半，然后忍不住又吃了一个；第二天又吃了一半，再加上一个；后面每天都是这样吃。
    //到第10天的时候，小猴子发现只有一个桃子了。问小猴子第一天共摘了多少个桃子
    public static int numPeach() {
//        int left = 1;
//        for(int i = 0;i < 10;i++) {
//            left = (left+1)*2;
//        }
//        return left;
        int left = 1;
        for(int i = 0;i < 10;i++) {
            left = (left+1)*2;
        }
        return left;
    }
    //爬一个台阶或者两个台阶，输出n个台阶公有多少种上楼方式
    public static int numFloor(int n) {
//        if(n == 1) {
//            return 1;
//        }
//        if(n == 2) {
//            return 2;
//        }
//        int a = 1;
//        int b = 2;
//        int c = 0;
//        for(int i = 2;i < n;i++) {
//            c = a+b;
//            a = b;
//            b = c;
//        }
//        return c;
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        int a = 1;
        int b = 2;
        int c = 0;
        for(int i = 2;i < n;i++) {
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }
    //给你年月日，求出是这年的第几天
    public static int isdays(int year,int month,int day) {
//        boolean isYear = false;
//        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
//            isYear = true;
//        }
//        int[] days = {31,28,31,30,31,30,31,31,31,30,31,30};
//        if(isYear) {
//            days[1] = 29;
//        }
//        int sum = 0;
//        for(int i = 0;i < month-1;i++) {
//            sum+=days[i];
//        }
//        sum+=day;
//        return sum;
        boolean isYear = false;
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            isYear = true;
        }
        int[] days = {31,28,31,30,31,30,31,31,31,30,31,30};
        if(isYear) {
            days[1] = 29;
        }
        int sum = 0;
        for(int i = 0;i < month -1;i++) {
            sum+=days[i];
        }
        sum+=day;
        return sum;
    }
    //输入两个年份之间的闰年年份
    public static void printYear(int y1,int y2) {
//        for(int i = y1;i <= y2;i++) {
//            if(i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
//                System.out.println(i);
//            }
//        }
        for(int i = y1;i <= y2;i++) {
            if(i % 400 == 0 || (i % 4 == 0 && i%100 != 0)) {
                System.out.println(i);
            }
        }
    }
    //判断素数
    public static boolean isPrim(int n) {
//        if(n == 1) {
//            return false;
//        }
//        if(n == 2) {
//            return true;
//        }
//        for(int i = 2;i < n/2+1;i++) {
//            if(n % i == 0) {
//                return false;
//            }
//        }
//        return true;
        if(n == 1) {
            return false;
        }
        if(n == 2) {
            return true;
        }
        for(int i = 2;i < n/2+1;i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    //给一个8元素数组例如1 3 0 3 6 0 0 9将所有0放后面，其他数字顺序不变，结果为1 3 3 6 9 0 0 0
    public static int[] changz(int[] arr) {
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int num : arr) {
//            if(num != 0) {
//                list.add(num);
//            }
//        }
//        int[] newArray = new int[arr.length];
//        for(int i = 0;i < list.size();i++) {
//            newArray[i] = list.get(i);
//        }
//        return newArray;
        ArrayList<Integer> list = new ArrayList<>();
        for(int numbers : arr) {
            if(numbers != 0) {
                list.add(numbers);
            }
        }
        int[] newArr = new int[arr.length];
        for(int i = 0;i < list.size();i++) {
            newArr[i] = list.get(i);
        }
        return newArr;
    }
    //约瑟夫环 输入人数和报的数k,报k的人死掉，比如说6个人，报到2的人死掉
    public static void JedisNum(int sum,int k) {
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i = 1;i <= sum;i++) {
//            list.add(i);
//        }
//        int target = 0;
//        while(list.size() != 0) {
//            target = (target+k) % list.size();
//            if(target != 0) {
//                System.out.println(list.get(target-1)+"被处死");
//                list.remove(target-1);
//                target--;
//            }else {
//                System.out.println(list.get(list.size()-1)+"被处死");
//                list.remove(list.size()-1);
//            }
//        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1;i <= sum;i++) {
            list.add(i);
        }
        int target = 0;
        while(list.size() != 0) {
            target = (target+k) % list.size();
            if(target != 0) {
                System.out.println(list.get(target-1)+"被处死");
                list.remove(target-1);
                target--;
            }else {
                System.out.println(list.get(list.size()-1)+"被处死");
                list.remove(list.size()-1);
            }
        }
    }
    //从数组中找出只出现一次的数
    public static int findOne(int[] arr) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int number : arr) {
//            if(!map.containsKey(number)) {
//                map.put(number,1);
//            }else {
//                int val = map.get(number);
//                map.replace(number,val,val+1);
//            }
//        }
//        Set<Integer> set = map.keySet();
//        for(Integer integer : set) {
//            if(map.get(integer) == 1) {
//                return integer;
//            }
//        }
//        return -1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int numbers : arr) {
            if(!map.containsKey(numbers)) {
                map.put(numbers,1);
            }else {
                int val = map.get(numbers);
                map.replace(numbers,val,val+1);
            }
        }
        Set<Integer> set = map.keySet();
        for(Integer integer : set) {
            if(map.get(integer) == 1) {
                return integer;
            }
        }
        return -1;
    }
    //连续子数组的最大和
    public static int findArr(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < arr.length;i++) {
            int sum = 0;
            for(int j = i;j < arr.length;j++) {
                sum+=arr[j];
                list.add(sum);
            }
        }
        Collections.sort(list);
        return list.get(list.size()-1);
    }
    //输入10个数，最大数和最后一个数交换，最小数和第一个数交换
    public static int[] changPos(int[] arr) {
//        int min = arr[0];
//        int minIndex = 0;
//        int max = arr[0];
//        int maxIndex = 0;
//        for(int i = 0;i < arr.length;i++) {
//            if(min > arr[i]) {
//                min = arr[i];
//                minIndex = i;
//            }
//            if(max < arr[i]) {
//                max = arr[i];
//                maxIndex = i;
//            }
//        }
//        int tmp = arr[0];
//        arr[0] = min;
//        arr[minIndex] = tmp;
//        int tmp2 = arr[arr.length-1];
//        arr[arr.length-1] = max;
//        arr[maxIndex] = tmp2;
//        return arr;
        int min = arr[0];
        int minIndex = 0;
        int max = arr[0];
        int maxindex = 0;
        for(int i = 0;i < arr.length;i++) {
            if(min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
            if(max < arr[i]) {
                max = arr[i];
                maxindex = i;
            }
        }
        int tmp = arr[0];
        arr[0] = min;
        arr[minIndex] = tmp;
        int tmp2 = arr[arr.length-1];
        arr[arr.length-1] = max;
        arr[maxindex] = tmp2;
        return arr;
    }
    //N的阶乘
    public static int multiNumber(int n) {
//        if(n <= 2) {
//            return n;
//        }else {
//            int[] num = new int[n];
//            num[0] = 1;
//            num[1] = 2;
//            for(int i = 2;i < n;i++) {
//                num[i] = (i+1)*num[i-1];
//            }
//            return num[n-1];
//        }
        if(n <= 2) {
            return n;
        }else {
            int[] num = new int[n];
            num[0] = 1;
            num[1] = 2;
            for(int i = 2;i < n;i++) {
                num[i] =  (i+1)*num[i-1];
            }
            return num[n-1];
        }
    }
    //输入n和b,找出1到n中被b整除的个数
    public static int findNumber(int n,int b) {
//        int count = 0;
//        for(int i = 1;i <= n;i++) {
//            if(i % b == 0) {
//                count++;
//            }
//        }
//        return count;
        int count = 0;
        for(int i = 1;i <= n;i++) {
            if(i % b == 0) {
                count++;
            }
        }
        return count;
    }
    //最大公约数
    public static int getNumbers(int n1,int n2) {
//        if(n2 == 0) {
//            return n1;
//        }
//        return getNumbers(n2,n1%n2);
        if(n2 == 0) {
            return n1;
        }
        return getNumbers(n2,n1%n2);
    }
    //输入一个整数，取出这个整数中的偶数位上的数字组成一个新的整数
    public static int getNewNumber(int n) {
//        char[] ch = String.valueOf(n).toCharArray();
//        StringBuilder sb = new StringBuilder();
//        for(char c : ch) {
//            if((c-'0') % 2 == 0) {
//                sb.append(c);
//            }
//        }
//        return Integer.parseInt(sb.toString());
        char[] ch = String.valueOf(n).toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : ch) {
            if((c-'0') % 2 == 0) {
                sb.append(c);
            }
        }
        return Integer.parseInt(sb.toString());
    }
    //找出一个数字中的偶数相加
    public static int getNumberAdd(int n) {
//        char[] ch = String.valueOf(n).toCharArray();
//        int sum = 0;
//        for(char c : ch) {
//            if((c-'0') % 2 == 0) {
//                sum+= c-'0';
//            }
//        }
//        return sum;
        char[] ch = String.valueOf(n).toCharArray();
        int sum = 0;
        for(char c : ch) {
            if((c-'0') % 2 == 0) {
                sum+=c-'0';
            }
        }
        return sum;
    }
    //回文数相加，例：输入2 输出1+121；输入3 输出1+121+12321
    public static int getBackNumber(int n) {
//        if(n == 1) {
//            return 1;
//        }
//        StringBuilder sb = new StringBuilder();
//        for(int i = 1;i <=n ;i++) {
//            sb.append(i);
//        }
//        for(int i = n-1;i >0;i--) {
//            sb.append(i);
//        }
//        return Integer.parseInt(sb.toString())+getBackNumber(n-1);
        if(n == 1) {
            return 1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i <= n;i++) {
            sb.append(i);
        }
        for(int i = n-1;i > 0;i--) {
            sb.append(i);
        }
        return Integer.parseInt(sb.toString())+getBackNumber(n-1);
    }
}
//字符串括号匹配
class Solution{
    private Map<Character,Character> map;
    public Solution() {
        map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
    }
    public boolean isVliad(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < s.length();i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) {
                char c = stack.isEmpty() ? '&' : stack.pop();
                if(map.get(ch) != c) {
                    return false;
                }
            }else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
