package com.jwebmp.plugins.angularprettycheckboxes.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class AngularPrettyCheckboxesExclusionsModule
		implements IGuiceScanModuleExclusions<AngularPrettyCheckboxesExclusionsModule>,
				           IGuiceScanJarExclusions<AngularPrettyCheckboxesExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-angular-pretty-checkboxes-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.angularprettycheckboxes");
		return strings;
	}
}
