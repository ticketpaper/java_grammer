import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C12StackQueue {
    public static void main(String[] args) {
////        후입선출 (LIFO), 가장 나중에 저장된 데이터가 먼저 인출되는 자료구조
//        Stack<Integer> myStk = new Stack<>();
//        myStk.push(10);
//        myStk.push(20);
//        myStk.push(30);

////        pop() : 스택에서 요소를 제거 후 해당 요소 반환
//        System.out.println(myStk.pop());  // 30
////        peek() : 스탹에서 마지막 요소 반환, 제거는 하지 않는다.
//        System.out.println(myStk.peek()); // 20
//        System.out.println(myStk);        // [10, 20]

////        String타입 5개 추가 후 반복문 (While)로 출력하기
//        Stack<String> str_stk = new Stack<>();
//        str_stk.push("a");
//        str_stk.push("b");
//        str_stk.push("c");
//        str_stk.push("d");
//        str_stk.push("e");
//        while (!str_stk.empty()) {
//            System.out.println(str_stk.pop());
//        }

////           웹페이지 방문
////           방문한 사이트 출력 + 뒤로가기 기능 구현
////           스케너로 신규사이트 방문 뒤로가기
////           신규사이트방문일경우 -> 해당 주소를 추가 stack.push
////           뒤로가기 일 경우 -> stack.pop
//        Stack<String> page_back = new Stack<>();
//        Stack<String> page_forward = new Stack<>();
//
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            String temp = "";
//            System.out.println("신규 방문 1번, 앞으로가기 2번, 뒤로가기 3번");
//            String input = sc.nextLine();
//            if (input.equals("1")) {
//                System.out.print("방문 사이트 입력 : ");
//                String site = sc.nextLine();
//                page_back.push(site);
//                System.out.println(site+" 방문");
//            } else if (input.equals("2")) {
//                if (page_forward.empty()) {
//                    System.out.println("앞으로갈 페이지가 없습니다.");
//                }
//                temp=page_forward.pop();
//                page_back.push(temp);
//                System.out.println(temp+" 로 이동");
//            } else if (input.equals("3")) {
//                if (page_back.empty()) {
//                    System.out.println("뒤로갈 페이지가 없습니다.");
//                }
//                temp=page_back.pop();
//                page_forward.push(temp);
//                System.out.println(page_back.peek() + "로 이동");
//            } else {
//                System.out.println("올바른 값을 입력하세요.");
//            }
//        }

// --------------------------------------------------------------------

////          Queue 선언 : 선입선출 (FIFO)
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
////        poll() : 소모 후 리턴
//        System.out.println(myQue.poll()); // 10
//        System.out.println(myQue);        // [20, 30]

////        프린터대기열 예제
////        문서1 추가, 문서2 추가, 문서3 추가
////        while문을 통해 "현재 인쇄 중인 문서 : 문서1"
//        Queue<String> print = new LinkedList<>(Arrays.asList("문서1","문서2","문서3"));
//        while (!print.isEmpty()) {
//            System.out.println("현재 인쇄중인 문서 : "+print.poll());
//        }

////        길이의 제한이 있는 큐 : ArrayBlockingQueue
//        Queue<String> myQue = new ArrayBlockingQueue<>(3);
////        add와 offer의 차이
////        add : 길이가 다 찼을때 에러를 발생
////        offer 공간이 충분할때만 add
//        myQue.offer("hello1");
//        myQue.offer("hello2");
//        myQue.offer("hello3");
//        myQue.offer("hello4");
//        System.out.println(myQue);

////        우선순위큐
////        데이터가 큐에 들어갈 때마다 부분적으로 정렬(재조정)되어 큐의 최상단에는 가장 작은값(또는 가장 큰값)이 위치
////        힙구조라 정렬안됨
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(50);
//        pq.add(30);
//        pq.add(40);
//        System.out.println(pq);
//        while (!pq.isEmpty()) {
//            System.out.println(pq.poll());
//        }

//        더 맵게 (힙)
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        int answer = 0;
        Queue<Integer> mix = new PriorityQueue<>();
        for (int i : scoville) {
            mix.add(i);
        }
        while(true){
            if (mix.size() == 1) {
                answer = -1;
                break;
            }
            if (mix.peek() >= K) {
                break;
            }
            mix.add(mix.poll() + mix.poll() * 2);
            answer++;
            if (mix.peek() >= K) {
                break;
            }
        }
        System.out.println(mix);
        System.out.println(answer);
    }
}
