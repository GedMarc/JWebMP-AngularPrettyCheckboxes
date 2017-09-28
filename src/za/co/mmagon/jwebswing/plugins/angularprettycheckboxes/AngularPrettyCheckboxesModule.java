package za.co.mmagon.jwebswing.plugins.angularprettycheckboxes;

import za.co.mmagon.jwebswing.base.angular.modules.AngularModuleBase;

/**
 * The module getting loaded into angular
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
class AngularPrettyCheckboxesModule extends AngularModuleBase
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
