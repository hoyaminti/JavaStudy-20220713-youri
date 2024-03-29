package j20_예외처리;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CustomException extends RuntimeException{
	//extends RuntimeException 예외클래스 만들떄 상속받아야합니다.

	private static final long serialVersionUID = 1L;

	private String errorMessage;
	
	public CustomException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}
	
	@Override
	public void printStackTrace() {
		System.out.println("우리가 만든 예외가 발생하였습니다.");
		System.out.println("메세지 내용은 아래를 참고하세요.");
		// TODO Auto-generated method stub
		super.printStackTrace();
	}
}
