package day31_practices.statesTask;

public class Virginia extends States {
     private String Coast;
     private String Nickname;

    public Virginia(String capital, String abbreviation, String politicalParty,
                    String governor, String senator, double population,
                    double stateTax, String coast, String nickname) {
        super("Virginia",capital, abbreviation, politicalParty, governor, senator, population, stateTax);
        setCoast(coast);
        setNickname(nickname);
    }

    public String getCoast() {
        return Coast;
    }

    public void setCoast(String coast) {
        Coast = coast;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEast Cost or West Cost: " + getCoast() +
                "\nNickname of Virgina: " + getNickname();
    }
}

//population 8,631,393
