/*2021.12.1(수)21:56

[문제] com.javaex.ex01 패키지
다음 4개의 파일에는 2개의 에러가 발생합니다. 에러가 발생하는 원인을 찾고 출력결과가 나오도록 코딩하세요.

*/

package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		Circle c1 = new Circle("녹색", 10);
		Rectangle r1 = new Rectangle("빨강", 4, 4);
		Shape sr1 = new Rectangle("빨강", 4, 4);
		
		//sr1을 그리는 메소드 호출
		
		//sr1의 가로크기 출력
		System.out.println("sr1의 가로는 " + ((Rectangle)sr1).getWidth() + "입니다.");
	}
}

	
/*
<1>추상화된 부모클래스는 객체를 입력할 수 없으므로 14행//Shape s = new Shape("빨강"); 은 오류라 삭제
<2>Rectangle의 메소드일반과 부모클래스의 메소드일반에 겹치는 메소드가 없으므로 용어변경from showInfo to draw
<3>상속받은 자식클래스에서 가로길이라는 변수를 꺼내오려면, gs를 이용해야 하므로 gs추가해서 소환. 주의.get아니라set
*/
