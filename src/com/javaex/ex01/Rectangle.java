/*2021.12.1(수)21:56

[문제] com.javaex.ex01 패키지
다음 4개의 파일에는 2개의 에러가 발생합니다. 에러가 발생하는 원인을 찾고 출력결과가 나오도록 코딩하세요.

*/

package com.javaex.ex01;

public class Rectangle extends Shape{
	
	private int width;
	private int height;
	
	public Rectangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw(){
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다.");                                                                        
	}
		

}

