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

import com.jwebmp.Page;
import com.jwebmp.PageConfigurator;
import com.jwebmp.base.angular.AngularPageConfigurator;
import com.jwebmp.plugins.PluginInformation;
import com.jwebmp.plugins.jquery.JQueryPageConfigurator;

/**
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Angular Pretty Checkboxes",
		pluginDescription = "Pure angular pretty checkbox / radio directive. Makes it incredibly simple to have pretty checkboxes / radios in angular.",
		pluginUniqueName = "jwebswing-angular-pretty-checkboxes",
		pluginVersion = "1.7.4",
		pluginCategories = "angular,forms, checkboxes, ui,web ui, framework",
		pluginSubtitle = "Pure angular pretty checkbox / radio directive. Makes it incredibly simple to have pretty checkboxes / radios in angular.",
		pluginSourceUrl = "https://github.com/itslenny/angular-pretty-checkable",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-AngularPrettyCheckboxes/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-AngularPrettyCheckboxes",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://github.com/itslenny/angular-pretty-checkable",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularPrettyCheckboxes.jar/download") class AngularPrettyCheckboxesPageConfigurator
		extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new AngularPrettyCheckboxesPageConfigurator
	 */
	public AngularPrettyCheckboxesPageConfigurator()
	{
		//Nothing needed
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);
			page.getBody()
			    .addJavaScriptReference(AngularPrettyCheckboxesReferencePool.AngularPrettyCheckboxes.getJavaScriptReference());
			page.getBody()
			    .addCssReference(AngularPrettyCheckboxesReferencePool.AngularPrettyCheckboxes.getCssReference());

			page.getAngular()
			    .getAngularModules()
			    .add(new AngularPrettyCheckboxesModule());
		}
		return page;
	}
}
