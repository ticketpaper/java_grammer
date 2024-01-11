package C19Thread;

public class Library {
    static int bookcount = 100;

//    public static void borrowBook() {
//    synchronized키워드를 통해 해당 메서드에 한해서는 lock 걸도록 설정
    public synchronized static void borrowBook() {
        if (bookcount > 0) {
//            책빌리는 시간을 10밀리초로 가정
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            bookcount -= 1;
            System.out.println("대출완료");
            System.out.println("남아있는 책 수량" + bookcount);
        } else {
            System.out.println("대출불가");
        }

    }
}
