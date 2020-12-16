package com.jwebmp.plugins.angularprettycheckboxes.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class AngularPrettyCheckboxesModuleInclusion implements IGuiceScanModuleInclusions<AngularPrettyCheckboxesModuleInclusion>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.angularprettycheckboxes");
		return set;
	}
}
