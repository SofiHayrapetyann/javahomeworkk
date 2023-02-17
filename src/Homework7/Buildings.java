package Homework7;

import org.w3c.dom.ls.LSOutput;

class Building {
    private int buildingFloors;
    private int[] apartmentof2room;
    private int[] apartmentof3room;
    String typeofBuilding;

    Building(int builingFloors, int[] rooms2, int[] rooms3, String type) {
        this.buildingFloors = builingFloors;
        apartmentof2room = rooms2;
        apartmentof3room = rooms3;
        typeofBuilding = type;
    }

    double countOfBuildinghouses() {
        return this.apartmentof2room.length + this.apartmentof3room.length;
    }

}

class District {
    private  Building[] buildings;
    private  double park;

    District(Building[] buildings, int park) {
        this.buildings = buildings;
        this.park = park;
    }

    double countOfBuildingsHouses() {
        int sum = 0;
        for (Building building : buildings) {
            sum += building.countOfBuildinghouses();
        }
        return park / sum;

    }
}

public class Buildings {
    public static void main(String[] args) {
        Building building1 = new Building(5, new int[]{1, 3, 5, 6, 7}, new int[]{4, 8, 9}, "Monolith");
        Building building2 = new Building(4, new int[]{2, 4, 10, 12, 15}, new int[]{3, 6, 13, 17}, "Panel");
        Building building3 = new Building(6, new int[]{1, 3, 5, 6, 7, 9, 12, 15}, new int[]{2, 4, 8, 9, 13, 14}, "Monolith");
        Building building4 = new Building(3, new int[]{2, 4, 6, 8}, new int[]{1, 3, 5, 7}, "Panel");
        District district1 = new District(new Building[]{building1, building2}, 700);
        District district2 = new District(new Building[]{building3, building4}, 880);
        System.out.println(district1.countOfBuildingsHouses());
        System.out.println(district2.countOfBuildingsHouses());
    }

}

