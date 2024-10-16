package gs.coderpad.arrays;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAddressCount {
    public static void main(String[] args) {
        String str="192.168.1.2 - - [17/Sep/2013:22:18:19 -0700] \"GET /abc HTTP/1.1\" 404 201\n"  +
                "192.168.1.2 - - [17/Sep/2013:22:18:19 -0700] \"GET /favicon.ico HTTP/1.1\" 200 1406\n"  +
                "192.168.1.2 - - [17/Sep/2013:22:18:27 -0700] \"GET /wp/ HTTP/1.1\" 200 5325\n" +
                "192.168.1.2 - - [17/Sep/2013:22:18:27 -0700] \"GET /wp/wp-content/themes/twentytwelve/style.css?ver=3.5.1 HTTP/1.1\" 200 35292\n" +
                "192.168.1.3 - - [17/Sep/2013:22:18:27 -0700] \"GET /wp/wp-content/themes/twentytwelve/js/navigation.js?ver=1.0 HTTP/1.1\" 200 863";
        findMaxRepeatedIp(str);
    }
    public static void findMaxRepeatedIp(String str){
        final String regex= "^(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})";
        Pattern pattern=Pattern.compile(regex,Pattern.MULTILINE);
        Matcher matcher= pattern.matcher(str);
        Map<String,Integer> map = new LinkedHashMap<>();
        while(matcher.find()){
            String ip=matcher.group();
            map.put(ip,map.getOrDefault(ip,0)+1);
        }
        List<Map.Entry<String,Integer>> list =new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for(Map.Entry<String,Integer> entry: list){
            System.out.println(entry.getKey()+" "+entry.getValue());
            break;
        }
    }
}
