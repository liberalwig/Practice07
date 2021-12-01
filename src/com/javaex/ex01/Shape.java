/*2021.12.1(수)21:56

[문제] com.javaex.ex01 패키지
다음 4개의 파일에는 2개의 에러가 발생합니다. 에러가 발생하는 원인을 찾고 출력결과가 나오도록 코딩하세요.

*/

package com.javaex.ex01;

public abstract class Shape {
	
	protected String fillColor;
	
	public Shape(String fillColor){
		this.fillColor=fillColor;
	}
	
	public abstract void draw();
}


