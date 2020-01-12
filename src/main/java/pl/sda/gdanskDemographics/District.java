package pl.sda.gdanskDemographics;

public class District {

    private String districtName;
    private String gender;
    private Integer ageUnderEighteen;
    private Integer ageFromEighteenToFiftyNine;
    private Integer ageFromSixtyToSixtyFour;
    private Integer ageAboveSixtyFour;

    public District(String districtName,
                    String gender,
                    Integer ageUnderEighteen,
                    Integer ageFromEighteenToFiftyNine,
                    Integer ageFromSixtyToSixtyFour,
                    Integer ageAboveSixtyFour) {
        this.districtName = districtName;
        this.gender = gender;
        this.ageUnderEighteen = ageUnderEighteen;
        this.ageFromEighteenToFiftyNine = ageFromEighteenToFiftyNine;
        this.ageFromSixtyToSixtyFour = ageFromSixtyToSixtyFour;
        this.ageAboveSixtyFour = ageAboveSixtyFour;
    }
}
