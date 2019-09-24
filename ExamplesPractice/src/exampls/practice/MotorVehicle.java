package exampls.practice;
class MotorVehicle {
	    int maxSpeed;
	    string modelName;
	    int modelYear;
	    int numberOfPassengers;
	    
	    
	    MotorVehicle(){
	        maxSpeed=200;
	        modelName="BMW";
	        modelYear=1997;
	        numberOfPassengers=2;
	        }
	        
	        MotorVehicle(int Maxspeed,String modelName,int modelYear,int numberOfPassengers){
	            this.Maxspeed=Maxspeed;
	            this.modelName=modelName;
	            this.modelYear=modelYear;
	            this.numberOfPassengers=numberOfPassengers;
	        }
	}
	        class Bike extends MotorVehicle{
	            boolean kickStart;
	            boolean buttonStart;
	            
	            
	            Bike(){
	                kickStart=true;
	                buttonStart=false;
	            }
	            
	            Bike(Boolean ks,Boolean bs){
	                kickStart=ks;
	                buttonStart=bs;
	            }
	    
		public static void main (String[] args) {
			  Bike b=new Bike();
		}
	}

