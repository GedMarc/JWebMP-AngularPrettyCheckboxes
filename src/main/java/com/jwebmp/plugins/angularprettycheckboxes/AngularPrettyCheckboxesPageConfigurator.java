/*
 * Copyright (C) 2017 GedMarc
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

import com.jwebmp.core.Page;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Pretty Checkboxes",
		pluginDescription = "Pure angular pretty checkbox / radio directive. Makes it incredibly simple to have pretty checkboxes / radios in angular.",
		pluginUniqueName = "angular-pretty-checkboxes",
		pluginVersion = "1.7.4",
		pluginCategories = "angular,forms, checkboxes, ui,web ui, framework",
		pluginSubtitle = "Pure angular pretty checkbox / radio directive. Makes it incredibly simple to have pretty checkboxes / radios in angular.",
		pluginSourceUrl = "https://github.com/itslenny/angular-pretty-checkable",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-AngularPrettyCheckboxes/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-AngularPrettyCheckboxes",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://github.com/itslenny/angular-pretty-checkable",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.angular/jwebmp-angular-pretty-checkboxes",
		pluginGroupId = "com.jwebmp.plugins.angular",
		pluginArtifactId = "jwebmp-angular-pretty-checkboxes",
		pluginModuleName = "com.jwebmp.plugins.angularprettycheckboxes",
		pluginStatus = PluginStatus.Released
)
public class AngularPrettyCheckboxesPageConfigurator
		implements IPageConfigurator<AngularPrettyCheckboxesPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/*
	 * Constructs a new AngularPrettyCheckboxesPageConfigurator
	 */
	public AngularPrettyCheckboxesPageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return AngularPrettyCheckboxesPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		AngularPrettyCheckboxesPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	 public Page<?> configure(Page<?> page)
	{
		if (!page.isConfigured() && enabled())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);
			page.getBody()
			    .addJavaScriptReference(AngularPrettyCheckboxesReferencePool.AngularPrettyCheckboxes.getJavaScriptReference());
			page.getBody()
			    .addCssReference(AngularPrettyCheckboxesReferencePool.AngularPrettyCheckboxes.getCssReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return AngularPrettyCheckboxesPageConfigurator.enabled;
	}
}
