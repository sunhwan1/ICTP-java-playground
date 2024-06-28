package learn.mapexample;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        // Map ->  key 값과 벨류 값을 가진 자료의 집합
        HashMap<String, String> map = new HashMap<String, String>();
        // 집어넣기
        map.put("id", "shkwonid");
        map.put("pw", "myPassword");
        map.put("email", "240204@ict.ac.kr");
        map.put("description", "this is description");

        // 가지고오기
        // 인 라인 시킴. (String pw = map.get("pw");)
        System.out.println(map.get("pw")); // myPassword
        // map 에서 key 값이 존재하는지 확인.
        System.out.println(map.containsKey("email")); // true
        // map 에서 value 가 존재하는지 확인.
        System.out.println(map.containsValue("240204@ict.ac.kr")); // true
        // map 에서 해당 key 삭제. key 와 value 가 완벽히 일치해야 삭제가 된다.
        System.out.println(map.remove("description", "this is descrip")); // false
        System.out.println(map.remove("description", "this is description")); // true
        // map 의 길이
        System.out.println(map.size()); // 3
        // key들의 집합을 가져오기
        System.out.println(map.keySet()); // [pw, id, email]
        // 전체 가져오기
        for(String key : map.keySet()) {
            System.out.printf("(key)%s: (value)%s \n", key, map.get(key));
        }

    }
}
