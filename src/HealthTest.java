import static org.junit.Assert.*;

import org.junit.Test;

public class HealthTest {

	@Test
	public void checkBMITest() {
		Health test = new Health(40 , 200);
		assertEquals("體重過輕" , test.checkBMI() );
	}

	@Test
	public void checkBMITest2() {
		Health test = new Health(20 , 100);
		assertEquals("正常範圍" , test.checkBMI() );
	}
	
	@Test
	public void checkBMITest3() {
		Health test = new Health(25 , 100);
		assertEquals("過重" , test.checkBMI() );
	}
	
	@Test
	public void checkBMITest4() {
		Health test = new Health(29 , 100);
		assertEquals("輕度肥胖" , test.checkBMI() );
	}
	
	@Test
	public void checkBMITest5() {
		Health test = new Health(30 , 100);
		assertEquals("中度肥胖" , test.checkBMI() );
	}
	
	@Test
	public void checkBMITest6() {
		Health test = new Health(36 , 100);
		assertEquals("重度肥胖" , test.checkBMI() );
	}
	
	@Test
	public void checkBMITest7() {
		Health test = new Health(-9 , 100);
		assertEquals("資料有問題" , test.checkBMI() );
	}
}
