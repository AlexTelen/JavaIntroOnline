/**
 * 3. Создать объект класса Государство,
 * используя классы Область, Район,
 * Город.
 * Методы: вывести на консоль столицу,
 * количество областей, площадь,
 * областные центры.
 */

class Town {
    private String name;
    private final District district = new District();

    public void setDistrictSquare(int square) {
        this.district.setSquare(square);
    }

    public int getDistrictSquare() {
        return this.district.getSquare();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Town(String name, int square) {
        this.name = name;
        this.district.setSquare(square);
    }
}

class District {

    private int square;

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }
}

class Region {
    private Town[] towns;
    private Town regionCenter;

    public int getSquare() {
        int square = 0;
        for (Town town : towns) {
            square += town.getDistrictSquare();
        }
        return square;
    }

    public Town[] getTowns() {
        return towns;
    }

    public void setTowns(Town[] towns) {
        this.towns = towns;
    }

    public void setRegionCenter(Town town) {
        if (regionCenter != null)
            regionCenter = town;
        else
            System.out.println("This region has the region center already");
    }

    public Town getRegionCenter() {
        return regionCenter;
    }

    public Region(Town[] towns, Town regionCenter) {
        this.towns = towns;
        this.regionCenter = regionCenter;
    }
}

class Country {
    private Town capital;
    private Region[] regions;

    public void setCapital(Town town) {
        if (capital != null)
            capital = town;
        else
            System.out.println("This country has the capital town already");
    }

    public Town getCapital() {
        return capital;
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    public Country(Region[] regions, Town capital) {
        this.regions = regions;
        this.capital = capital;
    }

    public int getSquare() {
        int square = 0;
        for (Region region : regions) {
            square += region.getSquare();
        }
        return square;
    }
}


public class AggComp3 {

    public static void main(String[] args) {
        Town town1 = new Town("Bierascie", 1545);
        Town town2 = new Town("Baranavicy", 2202);
        Region region1 = new Region(new Town[]{town1, town2}, town1);

        Town town3 = new Town("Viciebsk", 2738);
        Town town4 = new Town("Polack", 3138);
        Region region2 = new Region(new Town[]{town3, town4}, town3);

        Town town5 = new Town("Homiel", 1956);
        Town town6 = new Town("Žytkavičy", 2916);
        Region region3 = new Region(new Town[]{town5, town6}, town5);

        Town town7 = new Town("Horadnia", 2594);
        Town town8 = new Town("Slonim", 1471);
        Region region4 = new Region(new Town[]{town7, town8}, town7);

        Town town9 = new Town("Miensk", 1903);
        Town town10 = new Town("Maladziečna", 1392);
        Region region5 = new Region(new Town[]{town9, town10}, town9);

        Town town11 = new Town("Mahilioŭ", 1895);
        Town town12 = new Town("Babrujsk", 1599);
        Region region6 = new Region(new Town[]{town11, town12}, town11);

        Country country1 = new Country(new Region[]{region1, region2, region3, region4, region5, region6}, town9);

        System.out.println("Capital: " + country1.getCapital().getName());
        System.out.println("Number of regions: " + country1.getRegions().length);
        System.out.println("Square: " + country1.getSquare());
        for (Region region : country1.getRegions()) {
            System.out.println(region.getRegionCenter().getName());
        }

    }

}