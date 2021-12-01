/*2021.12.1(수)21:56

[문제] com.javaex.ex01 패키지
다음 4개의 파일에는 2개의 에러가 발생합니다. 에러가 발생하는 원인을 찾고 출력결과가 나오도록 코딩하세요.

*/

package com.javaex.ex01;

public class Circle extends Shape{
	
	private int radius;
	
	public Circle(String fillColor, int radius){     
		super(fillColor);
		this.radius=radius;
	}

	public void draw(){
		System.out.println("[원]#면색:" +super.fillColor+ 
				"  #반지름:" + radius +" 그렸습니다.");                                               
	}
	
}



