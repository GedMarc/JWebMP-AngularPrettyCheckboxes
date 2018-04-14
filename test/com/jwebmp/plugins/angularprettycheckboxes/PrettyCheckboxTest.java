/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.angularprettycheckboxes;

import com.jwebmp.BaseTestClass;
import org.junit.jupiter.api.Test;

public class PrettyCheckboxTest
		extends BaseTestClass
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
