package Section_1_Introduction;

class Room {
    float length;
    float breadth;

    void getData(float len, float bre){
        length = len;
        breadth = bre;
        // the data is stored in length and breadth.
    }
}


public class MultipleClasses {
    public static void main(String[] args){
        float area;
        Room room1 = new Room();
        room1.getData(14, 10);
        area = room1.length * room1.breadth;

        // Printing the data of area of room
        System.out.println("The area of Room is :" + area);

    }
}
