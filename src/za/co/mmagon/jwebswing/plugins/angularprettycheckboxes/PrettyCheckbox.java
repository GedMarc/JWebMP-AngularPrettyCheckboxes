package za.co.mmagon.jwebswing.plugins.angularprettycheckboxes;

import za.co.mmagon.jwebswing.base.angular.AngularAttributes;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;

/**
 * Denotes a physical pretty checkbox that has angular binding capabilities
 *
 * @param <J>
 */
public class PrettyCheckbox<J extends PrettyCheckbox<J>> extends Input<NoAttributes, J>
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
	public J bind(String variableName)
	{
		addAttribute(AngularAttributes.ngModel, variableName);
		AngularPageConfigurator.setRequired(this, true);
		return (J) this;
	}

	@Override
	public void init()
	{
		if (!isInitialized())
		{
			if (getMultiple() != null)
			{
				addAttribute("multiple", "");
			}
			if (getLabel() != null)
			{
				addAttribute("label", "'" + getLabel() + "'");
			}
			if (getValue() != null)
			{
				addAttribute("value", "'" + getValue() + "'");
			}
			if (getDisabled() != null)
			{
				addAttribute("disabled", "" + getDisabled() + "");
			}
			if (getLabelLeft() != null)
			{
				addAttribute("label-left", "" + getLabelLeft() + "");
			}
		}
		super.init();
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

	@Override
	public J setRequired()
	{
		addAttribute(AngularAttributes.ngRequired, "true");
		return (J) this;
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
	 * Optional. Defaults to value if ommited.
	 *
	 * @param label
	 *
	 * @return
	 */
	public J setLabel(String label)
	{
		this.label = label;
		return (J) this;
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
	 * Disables checkbox if set to true. (also supports ng-disabled)
	 *
	 * @param disabled
	 *
	 * @return
	 */
	public J setDisabled(Boolean disabled)
	{
		this.disabled = disabled;
		return (J) this;
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
	public J setLabelLeft(Boolean labelLeft)
	{
		this.labelLeft = labelLeft;
		return (J) this;
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
	 * If provided this allows multiple checkboxes to share a single model (stores data as an array)
	 *
	 * @param multiple
	 *
	 * @return
	 */
	public J setMultiple(Boolean multiple)
	{
		this.multiple = multiple;
		return (J) this;
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
	public J setValue(String value)
	{
		this.value = value;
		return (J) this;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof PrettyCheckbox))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		PrettyCheckbox<?> that = (PrettyCheckbox<?>) o;

		if (getValue() != null ? !getValue().equals(that.getValue()) : that.getValue() != null)
		{
			return false;
		}
		if (getLabel() != null ? !getLabel().equals(that.getLabel()) : that.getLabel() != null)
		{
			return false;
		}
		if (getDisabled() != null ? !getDisabled().equals(that.getDisabled()) : that.getDisabled() != null)
		{
			return false;
		}
		if (getLabelLeft() != null ? !getLabelLeft().equals(that.getLabelLeft()) : that.getLabelLeft() != null)
		{
			return false;
		}
		return getMultiple() != null ? getMultiple().equals(that.getMultiple()) : that.getMultiple() == null;
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + (getValue() != null ? getValue().hashCode() : 0);
		result = 31 * result + (getLabel() != null ? getLabel().hashCode() : 0);
		result = 31 * result + (getDisabled() != null ? getDisabled().hashCode() : 0);
		result = 31 * result + (getLabelLeft() != null ? getLabelLeft().hashCode() : 0);
		result = 31 * result + (getMultiple() != null ? getMultiple().hashCode() : 0);
		return result;
	}
}
