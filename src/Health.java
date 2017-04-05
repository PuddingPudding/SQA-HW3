
public class Health {
	
	private double weight;
	private double height;
	public Health(double weight , double height)
	{
		this.weight = weight;
		this.height = height;
	}
	public Health()
	{
		this(60 , 170);
	}
	
	public String checkBMI()
	{
		String output = "";
		double BMI = this.weight / (this.height * this.height / 10000);
		
		if(BMI > 0 && BMI < 18.5)
		{
			output = "體重過輕";
		}
		else if(BMI >= 18.5 && BMI < 24)
		{
			output = "正常範圍";
		}
		else if(BMI >= 24 && BMI < 27)
		{
			output = "過重";
		}
		else if(BMI >= 27 && BMI < 30)
		{
			output = "輕度肥胖";
		}
		else if(BMI >= 30 && BMI < 35)
		{
			output = "中度肥胖";
		}
		else if(BMI >= 35)
		{
			output = "重度肥胖";
		}
		else
		{
			output = "資料有問題";
		}
		
		return output;
	}
}
