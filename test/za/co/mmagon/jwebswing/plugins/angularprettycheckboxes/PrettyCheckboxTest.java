package za.co.mmagon.jwebswing.plugins.angularprettycheckboxes;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;

public class PrettyCheckboxTest extends BaseTestClass
{
	@Test
	public void testPrettyCheckBox()
	{
		PrettyCheckbox pc = new PrettyCheckbox();
		
		pc.setLabelLeft(true);
		pc.setMultiple(true);
		pc.setDisabled(true);
		
		pc.setLabel("label text");
		pc.setValue("checkbox value");
		
		System.out.println(pc.toString(0));
	}
	
	@Test
	public void testPrettyCheckBoxBind()
	{
		PrettyCheckbox pc = new PrettyCheckbox();
		
		pc.bind("bind.to.this");
		
		System.out.println(pc.toString(0));
	}
}
