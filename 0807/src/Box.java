

public class Box {
	private int length, width, height;

	public Box(int length, int width, int height) {  // 생성자(using field)
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public int getVolume() {                         // 직접만듬
		return length * width * height;
	}

	@Override
	public String toString() {
		return "Box [length=" + length + ", width=" + width + ", height=" + height + "]";
	}
	
	
	
	
}
