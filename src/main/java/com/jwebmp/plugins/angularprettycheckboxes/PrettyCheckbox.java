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

import com.jwebmp.core.base.angular.AngularAttributes;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.base.html.Input;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.utilities.StaticStrings;

/**
 * Denotes a physical pretty checkbox that has angular binding capabilities
 *
 * @param <J>
 */
public class PrettyCheckbox<J extends PrettyCheckbox<J>>
		extends Input<NoAttributes, J>
{
	/**
	 * Required for radio
	 * Used as true value for checkbox
	 */
	private String value;
	/**
	 * Optional. Defaults to value if ommited.
	 * <p>
	 * Set to false remove label.
	 */
	private String label;
	/**
	 * Disables checkbox if set to true. (also supports ng-disabled)
	 */
	private Boolean disabled;
	/**
	 * Puts the label before (left of) the control
	 */
	private Boolean labelLeft;
	/**
	 * If provided this allows multiple checkboxes to share a single model (stores data as an array)
	 */
	private Boolean multiple;

	/**
	 * Creates a new pretty checkboxes item
	 */
	public PrettyCheckbox()
	{
		setTag("pretty-checkbox");
	}

	@Override
	@SuppressWarnings("unchecked")
	public J bind(String variableName)
	{
		addAttribute(AngularAttributes.ngModel.getAttributeName(), variableName);
		AngularPageConfigurator.setRequired(true);
		return (J) this;
	}

	@Override
	@SuppressWarnings("unchecked")
	public J setRequired()
	{
		addAttribute(AngularAttributes.ngRequired.getAttributeName(), "true");
		return (J) this;
	}

	@Override
	public void init()
	{
		if (!isInitialized())
		{
			if (getMultiple() != null)
			{
				addAttribute("multiple", StaticStrings.STRING_EMPTY);
			}
			if (getLabel() != null)
			{
				addAttribute("label", StaticStrings.STRING_SINGLE_QUOTES + getLabel() + StaticStrings.STRING_SINGLE_QUOTES);
			}
			if (getValue() != null)
			{
				addAttribute("value", StaticStrings.STRING_SINGLE_QUOTES + getValue() + StaticStrings.STRING_SINGLE_QUOTES);
			}
			if (getDisabled() != null)
			{
				addAttribute("disabled", Boolean.toString(getDisabled()));
			}
			if (getLabelLeft() != null)
			{
				addAttribute("label-left", Boolean.toString(getLabelLeft()));
			}
		}
		super.init();
	}

	/**
	 * If provided this allows multiple checkboxes to share a single model (stores data as an array)
	 *
	 * @return
	 */
	public Boolean getMultiple()
	{
		return multiple;
	}

	/**
	 * Optional. Defaults to value if ommited.
	 * <p>
	 * Set to false remove label.
	 *
	 * @return
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Required for radio
	 * Used as true value for checkbox
	 *
	 * @return
	 */
	public String getValue()
	{
		return value;
	}

	/**
	 * Required for radio
	 * Used as true value for checkbox
	 *
	 * @param value
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	public J setValue(String value)
	{
		this.value = value;
		return (J) this;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	/**
	 * Disables checkbox if set to true. (also supports ng-disabled)
	 *
	 * @return
	 */
	public Boolean getDisabled()
	{
		return disabled;
	}

	/**
	 * Puts the label before (left of) the control
	 *
	 * @return
	 */
	public Boolean getLabelLeft()
	{
		return labelLeft;
	}

	/**
	 * Puts the label before (left of) the control
	 *
	 * @param labelLeft
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setLabelLeft(Boolean labelLeft)
	{
		this.labelLeft = labelLeft;
		return (J) this;
	}

	/**
	 * Disables checkbox if set to true. (also supports ng-disabled)
	 *
	 * @param disabled
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setDisabled(Boolean disabled)
	{
		this.disabled = disabled;
		return (J) this;
	}

	/**
	 * Optional. Defaults to value if ommited.
	 *
	 * @param label
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setLabel(String label)
	{
		this.label = label;
		return (J) this;
	}

	/**
	 * If provided this allows multiple checkboxes to share a single model (stores data as an array)
	 *
	 * @param multiple
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setMultiple(Boolean multiple)
	{
		this.multiple = multiple;
		return (J) this;
	}
}
