import java.util.*;

public class C10Map {
    public static void main(String[] args) {
////        map은 키와 값의 쌍으로 이루어진 데이터를 저장하는 자료구조, key는 중복 x, value는 중복 o
////        key를 통해 vlaue를 얻는다 = index가 없음
////        Map역시 List와 마찬가지로 인터페이스
//        Map<String,String> map = new HashMap<>();
//        map.put("basketball", "농구");
//        map.put("soccer", "축구");
//        map.put("baseball", "야구");
////        삽입된 데이터는 순서가 없다.
//        System.out.println(map);
//        System.out.println(map.get("basketball"));
////        size(), isEmpty() 사용가능
////        이미 key가 있을경우 gut을 하면 덮어쓰기
//        map.put("basketball", "탁구");
////        putIfAbsent() : 없으면 put
//        map.putIfAbsent("basketball", "배구");
//        System.out.println(map);
//
////        getOrDefault() : 해당 key가 없으면 default 값을 반환
//        System.out.println(map.getOrDefault("tennis", "Sports"));
////        containsKey() : 해당 key가 있는지 없는지 boolean 값으로 반환
//        System.out.println(map.containsKey("tennis"));
//
//        map.remove("baseball");
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//
////        enhanced for : key값 하나씩 출력
//        for (String s : map.keySet()) {
//            System.out.println(map.get(s));
//        }

//        Map<String,String> map = new HashMap<>();
//        map.put("basketball", "농구");
//        map.put("soccer", "축구");
//        map.put("baseball", "야구");
////        iterator를 통해 key값 하나씩 출력
//        Iterator<String> iter = map.keySet().iterator();
//////        next()메서드는 데이터를 소모시키면서 return
////        System.out.println(iter.next());
////        System.out.println(iter);
//
////        hasNext() : iterator안에 값이 있는지 없는지 boolean으로 반환
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }

//        아래의 list를 가지고 좋아하는 운동종목과 사람 숫자를 map형태로 나타내시오
        List<String> mylist = new ArrayList<>();
        mylist.add("basketball");
        mylist.add("basketball");
        mylist.add("basketball");
        mylist.add("baseball");
        mylist.add("baseball");
        mylist.add("tennis");
        mylist.add("tennis");
        mylist.add("tennis");
        Map<String,Integer> myMap = new HashMap<>();
        for (String s : mylist) {
//            if (myMap.containsKey(s)) {
//                myMap.put(s, myMap.get(s)+1);
//            } else {
//                myMap.put(s, 1);
//            }
            myMap.put(s, myMap.getOrDefault(s, 0) + 1);
        }


//          participant	                            completion	                    return
//          ["leo", "kiki", "eden"]	                ["eden", "kiki"]	            "leo"
//          ["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	    "mislav"

        String[] participant ={"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko",  "mislav"};

        Map<String, Integer> map = new HashMap<>();
        for (String p : participant) {
            if (map.containsKey(p)) {
                map.put(p, map.get(p)+1);
            } else {
                map.put(p, 1);
            }
        }
        for (String s : completion) {
            if (map.get(s) == 1) {
                map.remove(s);
            } else {
                map.put(s, map.get(s)-1);
            }
        }

        System.out.println(map);
        String[] answer = new String[map.size()];
        int count=0;
        for (String s : map.keySet()) {
            answer[count] = s;
            count++;
        }
        System.out.println(Arrays.toString(answer));

    }
}
