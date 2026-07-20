
//**문제 1. 게시글(Post) 클래스 — 조회수는 숨기고 제목은 공개**
//
//- `제목`: `public` (게시판 목록에 바로 노출)
//- `조회수`: `private` (직접 수정하면 안 됨, 반드시 메서드로만 증가)
//- `조회수증가()` 메서드: 호출될 때마다 조회수 1씩 증가
//- `조회수보기()` 메서드: 현재 조회수를 반환 (읽기 전용)

public class 게시글 {

	public String 제목;
	private int 조회수 = 0;

	public 게시글(String 제목) {
		this.제목 = 제목;
	}

	public void 조회수증가() {
		this.조회수 += 1;
	}

	public int 조회수보기() {
		return this.조회수;
	}
}
