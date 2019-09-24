package practcie.entity;

public class ComplexNumber {

	private int real;
	private int img;

	public int getReal() {
		return real;
	}

	public ComplexNumber(int real, int img) {
		this.real = real;
		this.img = img;
	}

	public ComplexNumber() {
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImg() {
		return img;
	}

	public void setImg(int img) {
		this.img = img;
	}
}
