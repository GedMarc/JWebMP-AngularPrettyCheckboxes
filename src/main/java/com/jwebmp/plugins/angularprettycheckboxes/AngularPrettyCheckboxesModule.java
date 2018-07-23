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

import com.jwebmp.core.base.angular.modules.AngularModuleBase;
import com.jwebmp.core.base.angular.services.IAngularModule;

/**
 * The module getting loaded into angular
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
public class AngularPrettyCheckboxesModule
		extends AngularModuleBase
		implements IAngularModule<AngularPrettyCheckboxesModule>
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new AngularPrettyCheckboxesModule
	 */
	public AngularPrettyCheckboxesModule()
	{
		super("pretty-checkable");
	}

	@Override
	public String renderFunction()
	{
		return null;
	}
}
