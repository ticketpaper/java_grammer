package C17EtcClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C17_04Iterator {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("바나나");
        myList.add("배");
        myList.add("사과");
        myList.add("체리");

////        enhanced for문 : 원본 변경 x -> remove 불가
//        for (String s : myList) {
//            System.out.println(s);
////            remove메소드가 없음
//        }

//        Iterator 사용 : 참조하고 있는 원본데이터 삭제 가능 -> remove 가능
        Iterator<String> iter = myList.iterator();
        while (iter.hasNext()) {
            if (iter.next().equals("바나나")) {
                iter.remove();
            }
        }
        System.out.println(myList);


    }
}
