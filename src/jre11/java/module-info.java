import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.angularprettycheckboxes.AngularPrettyCheckboxesModule;
import com.jwebmp.plugins.angularprettycheckboxes.AngularPrettyCheckboxesPageConfigurator;
import com.jwebmp.plugins.angularprettycheckboxes.implementations.AngularPrettyCheckboxesExclusionsModule;

module com.jwebmp.plugins.angularprettycheckboxes {
	exports com.jwebmp.plugins.angularprettycheckboxes;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides IPageConfigurator with AngularPrettyCheckboxesPageConfigurator;
	provides IAngularModule with AngularPrettyCheckboxesModule;

	opens com.jwebmp.plugins.angularprettycheckboxes to com.fasterxml.jackson.databind, com.jwebmp.core;

	provides IGuiceScanModuleExclusions with AngularPrettyCheckboxesExclusionsModule;
	provides IGuiceScanJarExclusions with AngularPrettyCheckboxesExclusionsModule;

}
