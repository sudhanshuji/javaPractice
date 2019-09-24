package question4;

public class Money {
	float paisa;
	float rupee;
	Money(float r,float p){
		rupee=r;
		paisa=p;
	}
	float addition(float rupee,float paisa) {
		
		float sumr=rupee+this.rupee;
		float sump=paisa+this.paisa;
		float sum=sumr+sump;
		
		return sum;
	}
	float subtraction(float rupee,float paisa) {
		float subr=this.rupee-rupee;
		float subp=paisa-this.paisa;
		float sub=subr+subp;
		return sub;
	}

}
