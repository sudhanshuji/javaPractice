package complexNumberProject;

import complexNumberArray.client.ComplexNumberArrayclient;

public class CoplexNumberArray {
     private int[] real;
     private int[] img;
     
     public static int variableName = 45;
     
	public CoplexNumberArray() {
	}

	public CoplexNumberArray(int[] real, int[] img) {
		this.real = real;
		this.img = img;
	}

	public int[] getReal() {
		return real;
	}

	public void setReal(int[] real) {
		this.real = real;
	}

	public int[] getImg() {
		return img;
	}

	public void setImg(int[] img) {
		this.img = img;
	}
     
     
}
