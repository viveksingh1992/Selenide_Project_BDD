package support;

public class Dashboard {

    resources.locators.support.Dashboard locators = new resources.locators.support.Dashboard();
    public void NavigateToSection (String sectionName) {
        String lowerSectionName = sectionName.toLowerCase().trim();

        switch (lowerSectionName) {
            case("guides"):
                locators.guides.click();
                break;
            default:
                throw new Error("The user was attempting to navigate to an invalid section");
        }
    }
}
