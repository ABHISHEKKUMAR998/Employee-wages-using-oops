class Employee{  

//Method to check if employee is present or absent  
int max=4;
int min=1;
int d= min +(int)(Math.random()*((max-min)+1));
int day=1;
void present(int Emp1,int emp2,int part){

	//System.out.println(" Random numbers is "+d);
	switch(d) {
	case 1:
	{
		System.out.println(" Employee 1 is prsesnt");
		
	}
	break;
	case 2:
	{
		System.out.println(" Employee 2 is prsesnt");
		
	}
	break;
	case 3:
	{
		System.out.println(" Part-time Employee is prsesnt");
		
	}
	break;
	default:{

		System.out.println(" Employees are  absent");
		
	}
	}
}
int wage() {
	int rate=20;
	int hours=8;
	int sum=rate*hours;
	if(d==1||d==2)
	System.out.println(" The wage of Employee is  "+sum);
	if(d==3) {
		sum=10*8;
	System.out.println("The wage of  part-time Employee is  "+sum);
	}
	return sum;
}
int Monthly_wage() {
	int rate=20;
	int hours=8;
	int day=20;
	int sum=rate*hours*day;
	if(d==1||d==2)
	System.out.println(" The Monthly wage of Employee is  "+sum);
	if(d==3) {
		rate=10;
		sum=rate*hours*day;
	System.out.println("The monthly wage of  part-time Employee is  "+sum);
	}
	return sum;
}
int Monthly_wage_till_Working_day(){
	int hours=8;
	int sum=0;
	while(hours<=100) {
	int rate=20;
	 sum=rate*hours;
	if(d==1||d==2) {	
	System.out.println(" The Monthly wage  till working days of Employee is  "+ day + "  "+sum);
	day=day+1;
	}
	if(d==3) {
		rate=10;
		sum=rate*hours;
	System.out.println("The monthly wage of till working days part-time Employee is  "+  day  +" "+sum);
	day=day+1;
	}
	hours+=8;
}
	return sum;
}
}


//Creating a test class to deposit and withdraw amount  
 class oops{  
public  static void main(String[] args){  
	int Emp1=1,Emp2=2,part=4;
	System.out.println(" WELCOME TO EMPLOYEE WAGE COMPUTATION");
	Employee p= new Employee();
	p.present(Emp1, Emp2,part);
	p.wage();
	p.Monthly_wage();
	p.Monthly_wage_till_Working_day();
}
 }


