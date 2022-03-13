import com.jwebmp.plugins.angularprettycheckboxes.implementations.AngularPrettyCheckboxesModuleInclusion;

module com.jwebmp.plugins.angularprettycheckboxes {
	exports com.jwebmp.plugins.angularprettycheckboxes;

	requires com.jwebmp.core;
	requires jakarta.validation;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.core.angular;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularprettycheckboxes.AngularPrettyCheckboxesPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.angularprettycheckboxes.AngularPrettyCheckboxesModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with AngularPrettyCheckboxesModuleInclusion;

	opens com.jwebmp.plugins.angularprettycheckboxes to com.fasterxml.jackson.databind, com.jwebmp.core;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularprettycheckboxes.implementations.AngularPrettyCheckboxesExclusionsModule;

}
