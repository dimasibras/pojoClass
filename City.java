public class City {

    private String city_name;
    private String capital;

    public City (String city_name, String capital){
        this.city_name = city_name;
        this.capital = capital;
    }
    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
