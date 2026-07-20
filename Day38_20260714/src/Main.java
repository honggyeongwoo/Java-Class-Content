
public class Main {

	public static void main(String[] args) {

        게시글 post = new 게시글("자바 공부법");

        post.조회수증가();   // 클릭 1
        post.조회수증가();   // 클릭 2
        post.조회수증가();   // 클릭 3

        System.out.println(post.제목);          // ✅ public → 자바 공부법
        System.out.println(post.조회수보기());   // ✅ getter → 3
        // post.조회수 = 999;                   // ❌ private → 컴파일 에러!


	}

}
